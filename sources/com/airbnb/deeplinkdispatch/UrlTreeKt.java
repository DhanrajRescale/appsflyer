package com.airbnb.deeplinkdispatch;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ut.q;
import ut.s;
import ut.v;
import vt.t;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\t\u001a\u001a\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\f\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015\"\u0014\u0010\u001c\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015\"\u0014\u0010\u001e\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lcom/airbnb/deeplinkdispatch/UriMatch;", "match", "Lut/r;", "matchByteArray", "(Lcom/airbnb/deeplinkdispatch/UriMatch;)[B", HttpUrl.FRAGMENT_ENCODE_SET, "startIndex", "Lut/s;", AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "writeUIntAt-GxOs86I", "([BII)V", "writeUIntAt", "Lut/v;", "writeUShortAt-HFnTLD8", "([BIS)V", "writeUShortAt", "MAX_CODE_STRING_BYTE_SIZE", "I", HttpUrl.FRAGMENT_ENCODE_SET, "configurablePathSegmentPrefix", "Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "configurablePathSegmentPrefixChar", "C", "configurablePathSegmentSuffix", "configurablePathSegmentSuffixChar", "componentParamPrefix", "componentParamPrefixChar", "componentParamSuffix", "componentParamSuffixChar", "deeplinkdispatch-base"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class UrlTreeKt {
    private static final int MAX_CODE_STRING_BYTE_SIZE = 65535;

    @NotNull
    public static final String componentParamPrefix = "{";
    public static final char componentParamPrefixChar = '{';

    @NotNull
    public static final String componentParamSuffix = "}";
    public static final char componentParamSuffixChar = '}';

    @NotNull
    public static final String configurablePathSegmentPrefix = "<";
    public static final char configurablePathSegmentPrefixChar = '<';

    @NotNull
    public static final String configurablePathSegmentSuffix = ">";
    public static final char configurablePathSegmentSuffixChar = '>';

    @NotNull
    public static final byte[] matchByteArray(UriMatch uriMatch) {
        byte[] storage;
        if (uriMatch == null) {
            byte[] storage2 = new byte[0];
            Intrinsics.checkNotNullParameter(storage2, "storage");
            return storage2;
        }
        String uriTemplate = uriMatch.getUriTemplate();
        Charset charset = Charsets.UTF_8;
        if (uriTemplate != null) {
            byte[] bytes = uriTemplate.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] storage3 = Arrays.copyOf(bytes, bytes.length);
            Intrinsics.checkNotNullExpressionValue(storage3, "java.util.Arrays.copyOf(this, size)");
            Intrinsics.checkNotNullParameter(storage3, "storage");
            String annotatedClassFullyQualifiedName = uriMatch.getAnnotatedClassFullyQualifiedName();
            if (annotatedClassFullyQualifiedName != null) {
                byte[] bytes2 = annotatedClassFullyQualifiedName.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                byte[] storage4 = Arrays.copyOf(bytes2, bytes2.length);
                Intrinsics.checkNotNullExpressionValue(storage4, "java.util.Arrays.copyOf(this, size)");
                Intrinsics.checkNotNullParameter(storage4, "storage");
                String annotatedMethod = uriMatch.getAnnotatedMethod();
                if (annotatedMethod == null) {
                    storage = null;
                } else {
                    byte[] bytes3 = annotatedMethod.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                    storage = Arrays.copyOf(bytes3, bytes3.length);
                    Intrinsics.checkNotNullExpressionValue(storage, "java.util.Arrays.copyOf(this, size)");
                    Intrinsics.checkNotNullParameter(storage, "storage");
                }
                if (storage == null) {
                    storage = new byte[0];
                    Intrinsics.checkNotNullParameter(storage, "storage");
                }
                byte[] storage5 = new byte[storage3.length + 4 + storage4.length + 1 + storage.length];
                Intrinsics.checkNotNullParameter(storage5, "storage");
                short length = (short) storage3.length;
                v.Companion companion = v.INSTANCE;
                m9writeUShortAtHFnTLD8(storage5, 0, length);
                t.d(storage3, 2, storage5, 0, storage3.length);
                int length2 = storage3.length;
                m9writeUShortAtHFnTLD8(storage5, 2 + length2, (short) storage4.length);
                int i10 = length2 + 4;
                t.d(storage4, i10, storage5, 0, storage4.length);
                int length3 = i10 + storage4.length;
                byte length4 = (byte) storage.length;
                q.Companion companion2 = q.INSTANCE;
                storage5[length3] = length4;
                int i11 = length3 + 1;
                if (storage.length > 0) {
                    t.d(storage, i11, storage5, 0, storage.length);
                }
                return storage5;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: writeUIntAt-GxOs86I, reason: not valid java name */
    public static final void m8writeUIntAtGxOs86I(@NotNull byte[] writeUIntAt, int i10, int i11) {
        Intrinsics.checkNotNullParameter(writeUIntAt, "$this$writeUIntAt");
        s.Companion companion = s.INSTANCE;
        q.Companion companion2 = q.INSTANCE;
        writeUIntAt[i10] = (byte) ((i11 >>> 24) & 255);
        writeUIntAt[i10 + 1] = (byte) ((i11 >>> 16) & 255);
        writeUIntAt[i10 + 2] = (byte) ((i11 >>> 8) & 255);
        writeUIntAt[i10 + 3] = (byte) (i11 & 255);
    }

    /* renamed from: writeUShortAt-HFnTLD8, reason: not valid java name */
    public static final void m9writeUShortAtHFnTLD8(@NotNull byte[] writeUShortAt, int i10, short s7) {
        Intrinsics.checkNotNullParameter(writeUShortAt, "$this$writeUShortAt");
        v.Companion companion = v.INSTANCE;
        q.Companion companion2 = q.INSTANCE;
        s.Companion companion3 = s.INSTANCE;
        writeUShortAt[i10] = (byte) (((s7 & 65535) >>> 8) & 255);
        writeUShortAt[i10 + 1] = (byte) (s7 & 255);
    }
}
