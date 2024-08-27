package com.airbnb.deeplinkdispatch.base;

import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.DeepLinkEntry;
import com.airbnb.deeplinkdispatch.DeepLinkMatchResult;
import com.airbnb.deeplinkdispatch.DeepLinkUri;
import com.airbnb.deeplinkdispatch.NodeMetadata;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class MatchIndex {
    public static final int HEADER_CHILDREN_LENGTH = 4;
    public static final int HEADER_LENGTH = 8;
    public static final int HEADER_MATCH_LENGTH = 2;
    public static final int HEADER_NODE_METADATA_LENGTH = 1;
    public static final int HEADER_VALUE_LENGTH = 1;
    public static final int MATCH_DATA_CLASS_LENGTH = 2;
    public static final int MATCH_DATA_METHOD_LENGTH = 1;
    public static final int MATCH_DATA_URL_TEMPLATE_LENGTH = 2;

    @NonNull
    public static final String MATCH_INDEX_ENCODING = "ISO_8859_1";

    @NonNull
    public static final String ROOT_VALUE = "r";

    @NonNull
    public final byte[] byteArray;

    @NonNull
    public static final String MATCH_PARAM_DIVIDER_CHAR = String.valueOf((char) 30);

    @NonNull
    public static final char[] VARIABLE_DELIMITER = {UrlTreeKt.componentParamPrefixChar, UrlTreeKt.componentParamSuffixChar};

    public MatchIndex(@NonNull byte[] bArr) {
        this.byteArray = bArr;
    }

    private CompareResult arrayCompare(byte[] bArr, int i10, int i11, byte[] bArr2) {
        if (i11 != bArr2.length) {
            return null;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr2[i12] != bArr[i10 + i12]) {
                return null;
            }
        }
        return new CompareResult(HttpUrl.FRAGMENT_ENCODE_SET, false);
    }

    private CompareResult compareComponentParam(int i10, int i11, @NonNull byte[] bArr, char[] cArr) {
        boolean z10;
        int length = bArr.length;
        byte[] bArr2 = this.byteArray;
        if ((bArr2[i10] == cArr[0] && bArr2[i10 + 1] == cArr[1]) || length == 0) {
            return null;
        }
        int i12 = 0;
        while (i12 < length) {
            int i13 = i10 + i12;
            byte b10 = this.byteArray[i13];
            if (b10 == bArr[i12] && i12 == length - 1 && i11 > length) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (b10 == cArr[0] || z10) {
                int i14 = i11 - 1;
                int i15 = length - 1;
                while (i14 >= 0) {
                    int i16 = i10 + i14;
                    byte b11 = this.byteArray[i16];
                    if (b11 == cArr[1]) {
                        if (z10) {
                            i12++;
                        }
                        int i17 = (i15 - i12) + 1;
                        byte[] bArr3 = new byte[i17];
                        int i18 = i10 + i12;
                        int i19 = (i16 - i18) - 1;
                        byte[] bArr4 = new byte[i19];
                        System.arraycopy(bArr, i12, bArr3, 0, i17);
                        System.arraycopy(this.byteArray, i18 + 1, bArr4, 0, i19);
                        return new CompareResult(new String(bArr4) + MATCH_PARAM_DIVIDER_CHAR + new String(bArr3), false);
                    }
                    if (b11 != bArr[i15]) {
                        return null;
                    }
                    i14--;
                    i15--;
                }
            }
            if (this.byteArray[i13] != bArr[i12]) {
                return null;
            }
            i12++;
        }
        return new CompareResult(HttpUrl.FRAGMENT_ENCODE_SET, false);
    }

    private CompareResult compareConfigurablePathSegment(@NonNull byte[] bArr, Map<byte[], byte[]> map, int i10, int i11) {
        byte[] bArr2 = null;
        for (Map.Entry<byte[], byte[]> entry : map.entrySet()) {
            if (arrayCompare(this.byteArray, i10, i11, entry.getKey()) != null) {
                bArr2 = entry.getValue();
            }
        }
        if (bArr2 == null) {
            return null;
        }
        if (bArr2.length == 0) {
            return new CompareResult(HttpUrl.FRAGMENT_ENCODE_SET, true);
        }
        if (arrayCompare(bArr, 0, bArr.length, bArr2) == null) {
            return null;
        }
        return new CompareResult(HttpUrl.FRAGMENT_ENCODE_SET, false);
    }

    private CompareResult compareValue(int i10, byte b10, @NonNull byte[] bArr, Map<byte[], byte[]> map) {
        int i11 = i10 + 8;
        NodeMetadata nodeMetadata = new NodeMetadata(this.byteArray[i10]);
        if (nodeMetadata.isComponentTypeMismatch(b10)) {
            return null;
        }
        int valueLength = getValueLength(i10);
        if (valueLength != bArr.length && nodeMetadata.isValueLiteralValue) {
            return null;
        }
        if (nodeMetadata.isComponentParam) {
            return compareComponentParam(i11, valueLength, bArr, VARIABLE_DELIMITER);
        }
        if (nodeMetadata.isConfigurablePathSegment) {
            return compareConfigurablePathSegment(bArr, map, i11, valueLength);
        }
        return arrayCompare(this.byteArray, i11, valueLength, bArr);
    }

    private int getChildrenLength(int i10) {
        return readFourBytesAsInt(this.byteArray, i10 + 4);
    }

    private int getChildrenPos(int i10) {
        if (getChildrenLength(i10) == 0) {
            return -1;
        }
        return getMatchDataPos(i10) + getMatchLength(i10);
    }

    private static DeepLinkEntry getDeepLinkEntryFromIndex(@NonNull byte[] bArr, int i10, int i11) {
        String str = null;
        if (i10 == 0) {
            return null;
        }
        int readTwoBytesAsInt = readTwoBytesAsInt(bArr, i11);
        int i12 = i11 + 2;
        String stringFromByteArray = getStringFromByteArray(bArr, i12, readTwoBytesAsInt);
        int i13 = i12 + readTwoBytesAsInt;
        int readTwoBytesAsInt2 = readTwoBytesAsInt(bArr, i13);
        int i14 = i13 + 2;
        String stringFromByteArray2 = getStringFromByteArray(bArr, i14, readTwoBytesAsInt2);
        int i15 = i14 + readTwoBytesAsInt2;
        int readOneByteAsInt = readOneByteAsInt(bArr, i15);
        if (readOneByteAsInt > 0) {
            str = getStringFromByteArray(bArr, i15 + 1, readOneByteAsInt);
        }
        return new DeepLinkEntry(stringFromByteArray, stringFromByteArray2, str);
    }

    private int getElementBoundaryPos(int i10) {
        return getMatchDataPos(i10) + getMatchLength(i10) + getChildrenLength(i10);
    }

    private int getMatchDataPos(int i10) {
        return i10 + 8 + getValueLength(i10);
    }

    @NonNull
    public static String getMatchIdxFileName(@NonNull String str) {
        return "dld_match_" + str.toLowerCase() + ".idx";
    }

    private int getMatchLength(int i10) {
        return readTwoBytesAsInt(this.byteArray, i10 + 2);
    }

    private int getNextElementStartPosition(int i10, int i11) {
        int elementBoundaryPos = getElementBoundaryPos(i10);
        if (elementBoundaryPos == i11) {
            return -1;
        }
        return elementBoundaryPos;
    }

    private static String getStringFromByteArray(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        try {
            return new String(bArr2, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private int getValueLength(int i10) {
        return readOneByteAsInt(this.byteArray, i10 + 1);
    }

    private static int readFourBytesAsInt(byte[] bArr, int i10) {
        return readOneByteAsInt(bArr, i10 + 3) | (readOneByteAsInt(bArr, i10) << 24) | (readOneByteAsInt(bArr, i10 + 1) << 16) | (readOneByteAsInt(bArr, i10 + 2) << 8);
    }

    private static int readOneByteAsInt(byte[] bArr, int i10) {
        return bArr[i10] & 255;
    }

    private static int readTwoBytesAsInt(byte[] bArr, int i10) {
        return readOneByteAsInt(bArr, i10 + 1) | (readOneByteAsInt(bArr, i10) << 8);
    }

    @NonNull
    public List<DeepLinkEntry> getAllEntries(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        do {
            int matchLength = getMatchLength(i10);
            if (matchLength > 0) {
                arrayList.add(getDeepLinkEntryFromIndex(this.byteArray, matchLength, getMatchDataPos(i10)));
            }
            if (getChildrenPos(i10) != -1) {
                arrayList.addAll(getAllEntries(getChildrenPos(i10), getElementBoundaryPos(i10)));
            }
            i10 = getNextElementStartPosition(i10, i11);
        } while (i10 != -1);
        return arrayList;
    }

    public DeepLinkMatchResult getMatchResultFromIndex(int i10, int i11, @NonNull DeepLinkUri deepLinkUri, @NonNull Map<String, String> map) {
        DeepLinkEntry deepLinkEntryFromIndex = getDeepLinkEntryFromIndex(this.byteArray, i10, i11);
        if (deepLinkEntryFromIndex == null) {
            return null;
        }
        return new DeepLinkMatchResult(deepLinkEntryFromIndex, Collections.singletonMap(deepLinkUri, map));
    }

    public int length() {
        return this.byteArray.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.airbnb.deeplinkdispatch.DeepLinkMatchResult matchUri(@androidx.annotation.NonNull com.airbnb.deeplinkdispatch.DeepLinkUri r17, @androidx.annotation.NonNull java.util.List<com.airbnb.deeplinkdispatch.UrlElement> r18, java.util.Map<java.lang.String, java.lang.String> r19, int r20, int r21, int r22, java.util.Map<byte[], byte[]> r23) {
        /*
            r16 = this;
            r8 = r16
            r9 = r20
            r10 = 0
            r12 = r18
            r11 = r21
            r0 = r10
        La:
            java.lang.Object r1 = r12.get(r9)
            com.airbnb.deeplinkdispatch.UrlElement r1 = (com.airbnb.deeplinkdispatch.UrlElement) r1
            byte r2 = r1.getTypeFlag()
            byte[] r1 = r1.getValue()
            r13 = r23
            com.airbnb.deeplinkdispatch.base.CompareResult r1 = r8.compareValue(r11, r2, r1, r13)
            r14 = -1
            if (r1 == 0) goto L71
            java.lang.String r2 = r1.getPlaceholderValue()
            boolean r2 = r2.isEmpty()
            r3 = 1
            if (r2 != 0) goto L4e
            java.util.HashMap r2 = new java.util.HashMap
            if (r19 == 0) goto L33
            r4 = r19
            goto L37
        L33:
            java.util.Map r4 = java.util.Collections.emptyMap()
        L37:
            r2.<init>(r4)
            java.lang.String r4 = r1.getPlaceholderValue()
            java.lang.String r5 = com.airbnb.deeplinkdispatch.base.MatchIndex.MATCH_PARAM_DIVIDER_CHAR
            java.lang.String[] r4 = r4.split(r5, r14)
            r5 = 0
            r5 = r4[r5]
            r4 = r4[r3]
            r2.put(r5, r4)
            r4 = r2
            goto L50
        L4e:
            r4 = r19
        L50:
            int r2 = r18.size()
            int r2 = r2 - r3
            if (r9 < r2) goto L5d
            boolean r2 = r1.isEmptyConfigurablePathSegmentMatch()
            if (r2 == 0) goto L60
        L5d:
            r15 = r17
            goto L74
        L60:
            int r1 = r8.getMatchLength(r11)
            if (r1 <= 0) goto L71
            int r0 = r8.getMatchDataPos(r11)
            r15 = r17
            com.airbnb.deeplinkdispatch.DeepLinkMatchResult r0 = r8.getMatchResultFromIndex(r1, r0, r15, r4)
            goto L98
        L71:
            r15 = r17
            goto L98
        L74:
            int r5 = r8.getChildrenPos(r11)
            if (r5 == r14) goto L98
            boolean r0 = r1.isEmptyConfigurablePathSegmentMatch()
            if (r0 == 0) goto L82
            r6 = r9
            goto L85
        L82:
            int r0 = r9 + 1
            r6 = r0
        L85:
            int r7 = r8.getElementBoundaryPos(r11)
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r23
            com.airbnb.deeplinkdispatch.DeepLinkMatchResult r0 = r0.matchUri(r1, r2, r3, r4, r5, r6, r7)
        L98:
            if (r0 == 0) goto L9b
            return r0
        L9b:
            r1 = r22
            int r11 = r8.getNextElementStartPosition(r11, r1)
            if (r11 != r14) goto La
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.base.MatchIndex.matchUri(com.airbnb.deeplinkdispatch.DeepLinkUri, java.util.List, java.util.Map, int, int, int, java.util.Map):com.airbnb.deeplinkdispatch.DeepLinkMatchResult");
    }
}
