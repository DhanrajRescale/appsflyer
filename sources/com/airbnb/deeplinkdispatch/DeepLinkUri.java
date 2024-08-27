package com.airbnb.deeplinkdispatch;

import a3.a;
import bv.j;
import java.io.EOFException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import jr.h;
import nn.d;
import v.e;

/* loaded from: classes.dex */
public final class DeepLinkUri {
    static final String CONVERT_TO_URI_ENCODE_SET = "^`{}|\\";
    static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final String FRAGMENT_ENCODE_SET = "";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final String QUERY_COMPONENT_ENCODE_SET = " \"'<>#&=";
    static final String QUERY_ENCODE_SET = " \"'<>#";
    static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    /* renamed from: com.airbnb.deeplinkdispatch.DeepLinkUri$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$deeplinkdispatch$DeepLinkUri$Builder$ParseResult;

        static {
            int[] iArr = new int[Builder.ParseResult.values().length];
            $SwitchMap$com$airbnb$deeplinkdispatch$DeepLinkUri$Builder$ParseResult = iArr;
            try {
                iArr[Builder.ParseResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$deeplinkdispatch$DeepLinkUri$Builder$ParseResult[Builder.ParseResult.INVALID_HOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$deeplinkdispatch$DeepLinkUri$Builder$ParseResult[Builder.ParseResult.UNSUPPORTED_SCHEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$airbnb$deeplinkdispatch$DeepLinkUri$Builder$ParseResult[Builder.ParseResult.MISSING_SCHEME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$airbnb$deeplinkdispatch$DeepLinkUri$Builder$ParseResult[Builder.ParseResult.INVALID_PORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        String encodedFragment;
        final List<String> encodedPathSegments;
        List<String> encodedQueryNamesAndValues;
        String host;
        String scheme;
        String encodedUsername = "";
        String encodedPassword = "";
        int port = -1;

        /* loaded from: classes.dex */
        public enum ParseResult {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private static String canonicalizeHost(String str, int i10, int i11) {
            String percentDecode = DeepLinkUri.percentDecode(str, i10, i11);
            if (percentDecode.startsWith("[") && percentDecode.endsWith("]")) {
                InetAddress decodeIpv6 = decodeIpv6(percentDecode, 1, percentDecode.length() - 1);
                if (decodeIpv6 == null) {
                    return null;
                }
                byte[] address = decodeIpv6.getAddress();
                if (address.length == 16) {
                    return inet6AddressToAscii(address);
                }
                throw new AssertionError();
            }
            return domainToAscii(percentDecode);
        }

        private static boolean containsInvalidHostnameAsciiCodes(String str) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        private static boolean decodeIpv4Suffix(String str, int i10, int i11, byte[] bArr, int i12) {
            int i13 = i12;
            while (i10 < i11) {
                if (i13 == bArr.length) {
                    return false;
                }
                if (i13 != i12) {
                    if (str.charAt(i10) != '.') {
                        return false;
                    }
                    i10++;
                }
                int i14 = i10;
                int i15 = 0;
                while (i14 < i11) {
                    char charAt = str.charAt(i14);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                        return false;
                    }
                    i14++;
                }
                if (i14 - i10 == 0) {
                    return false;
                }
                bArr[i13] = (byte) i15;
                i13++;
                i10 = i14;
            }
            if (i13 != i12 + 4) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.net.InetAddress decodeIpv6(java.lang.String r12, int r13, int r14) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = 0
                r3 = -1
                r4 = r2
                r5 = r3
                r6 = r5
            L9:
                r7 = 0
                if (r13 >= r14) goto L79
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r13 + 2
                r9 = 2
                if (r8 > r14) goto L27
                java.lang.String r10 = "::"
                boolean r10 = r12.regionMatches(r13, r10, r2, r9)
                if (r10 == 0) goto L27
                if (r5 == r3) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r14) goto L25
                goto L79
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L34
                java.lang.String r8 = ":"
                r10 = 1
                boolean r8 = r12.regionMatches(r13, r8, r2, r10)
                if (r8 == 0) goto L36
                int r13 = r13 + 1
            L34:
                r6 = r13
                goto L4b
            L36:
                java.lang.String r8 = "."
                boolean r13 = r12.regionMatches(r13, r8, r2, r10)
                if (r13 == 0) goto L4a
                int r13 = r4 + (-2)
                boolean r12 = decodeIpv4Suffix(r12, r6, r14, r1, r13)
                if (r12 != 0) goto L47
                return r7
            L47:
                int r4 = r4 + 2
                goto L79
            L4a:
                return r7
            L4b:
                r8 = r2
                r13 = r6
            L4d:
                if (r13 >= r14) goto L60
                char r10 = r12.charAt(r13)
                int r10 = com.airbnb.deeplinkdispatch.DeepLinkUri.decodeHexDigit(r10)
                if (r10 != r3) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r10
                int r13 = r13 + 1
                goto L4d
            L60:
                int r10 = r13 - r6
                if (r10 == 0) goto L78
                r11 = 4
                if (r10 <= r11) goto L68
                goto L78
            L68:
                int r7 = r4 + 1
                int r10 = r8 >>> 8
                r10 = r10 & 255(0xff, float:3.57E-43)
                byte r10 = (byte) r10
                r1[r4] = r10
                int r4 = r4 + r9
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L78:
                return r7
            L79:
                if (r4 == r0) goto L8a
                if (r5 != r3) goto L7e
                return r7
            L7e:
                int r12 = r4 - r5
                int r13 = 16 - r12
                java.lang.System.arraycopy(r1, r5, r1, r13, r12)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r2)
            L8a:
                java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8f
                return r12
            L8f:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.DeepLinkUri.Builder.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
        }

        private static String domainToAscii(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, bv.j] */
        private static String inet6AddressToAscii(byte[] bArr) {
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < bArr.length) {
                int i14 = i12;
                while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                    i14 += 2;
                }
                int i15 = i14 - i12;
                if (i15 > i13) {
                    i10 = i12;
                    i13 = i15;
                }
                i12 = i14 + 2;
            }
            ?? obj = new Object();
            while (i11 < bArr.length) {
                if (i11 == i10) {
                    obj.b0(58);
                    i11 += i13;
                    if (i11 == 16) {
                        obj.b0(58);
                    }
                } else {
                    if (i11 > 0) {
                        obj.b0(58);
                    }
                    obj.d0(((bArr[i11] & 255) << 8) | (bArr[i11 + 1] & 255));
                    i11 += 2;
                }
            }
            return obj.H();
        }

        private boolean isDot(String str) {
            if (!str.equals(".") && !str.equalsIgnoreCase("%2e")) {
                return false;
            }
            return true;
        }

        private boolean isDotDot(String str) {
            if (!str.equals("..") && !str.equalsIgnoreCase("%2e.") && !str.equalsIgnoreCase(".%2e") && !str.equalsIgnoreCase("%2e%2e")) {
                return false;
            }
            return true;
        }

        private static int parsePort(String str, int i10, int i11) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(DeepLinkUri.canonicalize(str, i10, i11, "", false, false));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).isEmpty() && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r0.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private static int portColonOffset(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != ':') {
                    if (charAt != '[') {
                        i10++;
                    }
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                        i10++;
                    } while (str.charAt(i10) != ']');
                    i10++;
                } else {
                    return i10;
                }
            }
            return i11;
        }

        private void push(String str, int i10, int i11, boolean z10, boolean z11) {
            String canonicalize = DeepLinkUri.canonicalize(str, i10, i11, " \"<>^`{}|/\\?#", z11, false);
            if (isDot(canonicalize)) {
                return;
            }
            if (isDotDot(canonicalize)) {
                pop();
                return;
            }
            if (((String) d.g(this.encodedPathSegments, 1)).isEmpty()) {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, canonicalize);
            } else {
                this.encodedPathSegments.add(canonicalize);
            }
            if (z10) {
                this.encodedPathSegments.add("");
            }
        }

        private void removeAllCanonicalQueryParameters(String str) {
            for (int size = this.encodedQueryNamesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
            }
        }

        private void resolvePath(String str, int i10, int i11) {
            boolean z10;
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            } else {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i10++;
            }
            while (true) {
                int i12 = i10;
                if (i12 < i11) {
                    i10 = DeepLinkUri.delimiterOffset(str, i12, i11, "/\\");
                    if (i10 < i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    push(str, i12, i10, z10, true);
                    if (z10) {
                        i10++;
                    }
                } else {
                    return;
                }
            }
        }

        private static int schemeDelimiterOffset(String str, int i10, int i11, boolean z10) {
            boolean z11;
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && z10 && charAt != '{')) {
                return -1;
            }
            if (charAt == '{') {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i12 = i10 + 1; i12 < i11; i12++) {
                char charAt2 = str.charAt(i12);
                if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '+' && charAt2 != '-' && charAt2 != '.' && ((charAt2 != '{' || !z10) && ((charAt2 != '}' || !z10) && !z11))))) {
                    if (charAt2 != ':') {
                        return -1;
                    }
                    return i12;
                }
                if (charAt2 == '{') {
                    z11 = true;
                }
                if (charAt2 == '}') {
                    z11 = false;
                }
            }
            return -1;
        }

        private int skipLeadingAsciiWhitespace(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private int skipTrailingAsciiWhitespace(String str, int i10, int i11) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                char charAt = str.charAt(i12);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i12 + 1;
                }
            }
            return i10;
        }

        private static int slashCount(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public Builder addEncodedPathSegment(String str) {
            if (str != null) {
                push(str, 0, str.length(), false, true);
                return this;
            }
            throw new IllegalArgumentException("encodedPathSegment == null");
        }

        public Builder addEncodedQueryParameter(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(DeepLinkUri.canonicalize(str, " \"'<>#&=", true, true));
                List<String> list = this.encodedQueryNamesAndValues;
                if (str2 != null) {
                    str3 = DeepLinkUri.canonicalize(str2, " \"'<>#&=", true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new IllegalArgumentException("encodedName == null");
        }

        public Builder addPathSegment(String str) {
            if (str != null) {
                push(str, 0, str.length(), false, false);
                return this;
            }
            throw new IllegalArgumentException("pathSegment == null");
        }

        public Builder addQueryParameter(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(DeepLinkUri.canonicalize(str, " \"'<>#&=", false, true));
                List<String> list = this.encodedQueryNamesAndValues;
                if (str2 != null) {
                    str3 = DeepLinkUri.canonicalize(str2, " \"'<>#&=", false, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new IllegalArgumentException("name == null");
        }

        public DeepLinkUri build() {
            if (this.scheme != null) {
                if (this.host != null) {
                    return new DeepLinkUri(this, null);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public int effectivePort() {
            int i10 = this.port;
            if (i10 == -1) {
                return DeepLinkUri.defaultPort(this.scheme);
            }
            return i10;
        }

        public Builder encodedFragment(String str) {
            if (str != null) {
                this.encodedFragment = DeepLinkUri.canonicalize(str, "", true, false);
                return this;
            }
            throw new IllegalArgumentException("encodedFragment == null");
        }

        public Builder encodedPassword(String str) {
            if (str != null) {
                this.encodedPassword = DeepLinkUri.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false);
                return this;
            }
            throw new IllegalArgumentException("encodedPassword == null");
        }

        public Builder encodedPath(String str) {
            if (str != null) {
                if (str.startsWith("/")) {
                    resolvePath(str, 0, str.length());
                    return this;
                }
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(str));
            }
            throw new IllegalArgumentException("encodedPath == null");
        }

        public Builder encodedQuery(String str) {
            List<String> list;
            if (str != null) {
                list = DeepLinkUri.queryStringToNamesAndValues(DeepLinkUri.canonicalize(str, " \"'<>#", true, true));
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public Builder encodedUsername(String str) {
            if (str != null) {
                this.encodedUsername = DeepLinkUri.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false);
                return this;
            }
            throw new IllegalArgumentException("encodedUsername == null");
        }

        public Builder fragment(String str) {
            if (str != null) {
                this.encodedFragment = DeepLinkUri.canonicalize(str, "", false, false);
                return this;
            }
            throw new IllegalArgumentException("fragment == null");
        }

        public Builder host(String str) {
            if (str != null) {
                String canonicalizeHost = canonicalizeHost(str, 0, str.length());
                if (canonicalizeHost != null) {
                    this.host = canonicalizeHost;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            throw new IllegalArgumentException("host == null");
        }

        public ParseResult parse(DeepLinkUri deepLinkUri, String str, boolean z10) {
            int delimiterOffset;
            char c10;
            boolean z11 = false;
            int skipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str, 0, str.length());
            int skipTrailingAsciiWhitespace = skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, str.length());
            int schemeDelimiterOffset = schemeDelimiterOffset(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace, z10);
            if (schemeDelimiterOffset != -1) {
                if (str.regionMatches(true, skipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.scheme = "https";
                    skipLeadingAsciiWhitespace += 6;
                } else if (str.regionMatches(true, skipLeadingAsciiWhitespace, "http:", 0, 5)) {
                    this.scheme = "http";
                    skipLeadingAsciiWhitespace += 5;
                } else {
                    String substring = str.substring(skipLeadingAsciiWhitespace, schemeDelimiterOffset);
                    this.scheme = substring;
                    skipLeadingAsciiWhitespace += substring.length() + 1;
                }
            } else if (deepLinkUri != null) {
                this.scheme = deepLinkUri.scheme;
            } else {
                return ParseResult.MISSING_SCHEME;
            }
            int slashCount = slashCount(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            char c11 = '#';
            if (slashCount < 2 && deepLinkUri != null && deepLinkUri.scheme.equals(this.scheme)) {
                this.encodedUsername = deepLinkUri.encodedUsername();
                this.encodedPassword = deepLinkUri.encodedPassword();
                this.host = deepLinkUri.host;
                this.port = deepLinkUri.port;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(deepLinkUri.encodedPathSegments());
                if (skipLeadingAsciiWhitespace == skipTrailingAsciiWhitespace || str.charAt(skipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(deepLinkUri.encodedQuery());
                }
            } else {
                int i10 = skipLeadingAsciiWhitespace + slashCount;
                boolean z12 = false;
                while (true) {
                    delimiterOffset = DeepLinkUri.delimiterOffset(str, i10, skipTrailingAsciiWhitespace, "@/\\?#");
                    if (delimiterOffset != skipTrailingAsciiWhitespace) {
                        c10 = str.charAt(delimiterOffset);
                    } else {
                        c10 = 65535;
                    }
                    if (c10 == 65535 || c10 == c11 || c10 == '/' || c10 == '\\' || c10 == '?') {
                        break;
                    }
                    if (c10 == '@') {
                        if (!z11) {
                            int delimiterOffset2 = DeepLinkUri.delimiterOffset(str, i10, delimiterOffset, ":");
                            String canonicalize = DeepLinkUri.canonicalize(str, i10, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false);
                            if (z12) {
                                canonicalize = e.j(new StringBuilder(), this.encodedUsername, "%40", canonicalize);
                            }
                            this.encodedUsername = canonicalize;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = DeepLinkUri.canonicalize(str, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                z11 = true;
                            }
                            z12 = true;
                        } else {
                            this.encodedPassword += "%40" + DeepLinkUri.canonicalize(str, i10, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false);
                        }
                        i10 = delimiterOffset + 1;
                    }
                    c11 = '#';
                }
                int portColonOffset = portColonOffset(str, i10, delimiterOffset);
                int i11 = portColonOffset + 1;
                if (i11 < delimiterOffset) {
                    this.host = canonicalizeHost(str, i10, portColonOffset);
                    int parsePort = parsePort(str, i11, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        return ParseResult.INVALID_PORT;
                    }
                } else {
                    this.host = canonicalizeHost(str, i10, portColonOffset);
                    this.port = DeepLinkUri.defaultPort(this.scheme);
                }
                if (this.host == null) {
                    return ParseResult.INVALID_HOST;
                }
                skipLeadingAsciiWhitespace = delimiterOffset;
            }
            int delimiterOffset3 = DeepLinkUri.delimiterOffset(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace, "?#");
            resolvePath(str, skipLeadingAsciiWhitespace, delimiterOffset3);
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = DeepLinkUri.delimiterOffset(str, delimiterOffset3, skipTrailingAsciiWhitespace, "#");
                this.encodedQueryNamesAndValues = DeepLinkUri.queryStringToNamesAndValues(DeepLinkUri.canonicalize(str, delimiterOffset3 + 1, delimiterOffset4, " \"'<>#", true, true));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = DeepLinkUri.canonicalize(str, 1 + delimiterOffset3, skipTrailingAsciiWhitespace, "", true, false);
            }
            return ParseResult.SUCCESS;
        }

        public Builder password(String str) {
            if (str != null) {
                this.encodedPassword = DeepLinkUri.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false);
                return this;
            }
            throw new IllegalArgumentException("password == null");
        }

        public Builder port(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.port = i10;
                return this;
            }
            throw new IllegalArgumentException(h.n("unexpected port: ", i10));
        }

        public Builder query(String str) {
            List<String> list;
            if (str != null) {
                list = DeepLinkUri.queryStringToNamesAndValues(DeepLinkUri.canonicalize(str, " \"'<>#", false, true));
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public Builder removeAllEncodedQueryParameters(String str) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    return this;
                }
                removeAllCanonicalQueryParameters(DeepLinkUri.canonicalize(str, " \"'<>#&=", true, true));
                return this;
            }
            throw new IllegalArgumentException("encodedName == null");
        }

        public Builder removeAllQueryParameters(String str) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    return this;
                }
                removeAllCanonicalQueryParameters(DeepLinkUri.canonicalize(str, " \"'<>#&=", false, true));
                return this;
            }
            throw new IllegalArgumentException("name == null");
        }

        public Builder removePathSegment(int i10) {
            this.encodedPathSegments.remove(i10);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public Builder scheme(String str) {
            if (str != null) {
                this.scheme = str;
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }

        public Builder setEncodedPathSegment(int i10, String str) {
            if (str != null) {
                String canonicalize = DeepLinkUri.canonicalize(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false);
                this.encodedPathSegments.set(i10, canonicalize);
                if (!isDot(canonicalize) && !isDotDot(canonicalize)) {
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            throw new IllegalArgumentException("encodedPathSegment == null");
        }

        public Builder setEncodedQueryParameter(String str, String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public Builder setPathSegment(int i10, String str) {
            if (str != null) {
                String canonicalize = DeepLinkUri.canonicalize(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false);
                if (!isDot(canonicalize) && !isDotDot(canonicalize)) {
                    this.encodedPathSegments.set(i10, canonicalize);
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            throw new IllegalArgumentException("pathSegment == null");
        }

        public Builder setQueryParameter(String str, String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.scheme);
            sb2.append("://");
            if (!this.encodedUsername.isEmpty() || !this.encodedPassword.isEmpty()) {
                sb2.append(this.encodedUsername);
                if (!this.encodedPassword.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            }
            if (this.host.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.host);
                sb2.append(']');
            } else {
                sb2.append(this.host);
            }
            int effectivePort = effectivePort();
            if (effectivePort != DeepLinkUri.defaultPort(this.scheme)) {
                sb2.append(':');
                sb2.append(effectivePort);
            }
            DeepLinkUri.pathSegmentsToString(sb2, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                DeepLinkUri.namesAndValuesToQueryString(sb2, this.encodedQueryNamesAndValues);
            }
            if (this.encodedFragment != null) {
                sb2.append('#');
                sb2.append(this.encodedFragment);
            }
            return sb2.toString();
        }

        public Builder username(String str) {
            if (str != null) {
                this.encodedUsername = DeepLinkUri.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false);
                return this;
            }
            throw new IllegalArgumentException("username == null");
        }
    }

    public /* synthetic */ DeepLinkUri(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, bv.j] */
    public static String canonicalize(String str, int i10, int i11, String str2, boolean z10, boolean z11) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt >= 32 && codePointAt < 127 && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || z10) && (!z11 || codePointAt != 43))) {
                i12 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.i0(i10, i12, str);
                canonicalize(obj, str, i12, i11, str2, z10, z11);
                return obj.H();
            }
        }
        return str.substring(i10, i11);
    }

    public static int decodeHexDigit(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int delimiterOffset(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static DeepLinkUri get(URL url) {
        return parse(url.toString());
    }

    public static DeepLinkUri getChecked(String str) throws MalformedURLException, UnknownHostException {
        Builder builder = new Builder();
        Builder.ParseResult parse = builder.parse(null, str, false);
        int i10 = AnonymousClass1.$SwitchMap$com$airbnb$deeplinkdispatch$DeepLinkUri$Builder$ParseResult[parse.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new MalformedURLException("Invalid URL: " + parse + " for " + str);
            }
            throw new UnknownHostException(a.f("Invalid host: ", str));
        }
        return builder.build();
    }

    public static void namesAndValuesToQueryString(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    public static DeepLinkUri parse(String str) {
        return parse(str, false);
    }

    public static DeepLinkUri parseTemplate(String str) {
        return parse(str, true);
    }

    public static void pathSegmentsToString(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static String percentDecode(String str) {
        return percentDecode(str, 0, str.length());
    }

    public static List<String> queryStringToNamesAndValues(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add(null);
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(this.url.indexOf(35) + 1);
    }

    public String encodedHost() {
        return canonicalize(this.host, CONVERT_TO_URI_ENCODE_SET, true, true);
    }

    public String encodedPassword() {
        if (this.password.isEmpty()) {
            return "";
        }
        return this.url.substring(this.url.indexOf(58, this.scheme.length() + 3) + 1, this.url.indexOf(64));
    }

    public String encodedPath() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        return this.url.substring(indexOf, delimiterOffset(str, indexOf, str.length(), "?#"));
    }

    public List<String> encodedPathSegments() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        int delimiterOffset = delimiterOffset(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < delimiterOffset) {
            int i10 = indexOf + 1;
            int delimiterOffset2 = delimiterOffset(this.url, i10, delimiterOffset, "/");
            arrayList.add(this.url.substring(i10, delimiterOffset2));
            indexOf = delimiterOffset2;
        }
        return arrayList;
    }

    public String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf = this.url.indexOf(63);
        int i10 = indexOf + 1;
        String str = this.url;
        return this.url.substring(i10, delimiterOffset(str, indexOf + 2, str.length(), "#"));
    }

    public String encodedUsername() {
        if (this.username.isEmpty()) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, delimiterOffset(str, length, str.length(), ":@"));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof DeepLinkUri) && ((DeepLinkUri) obj).url.equals(this.url)) {
            return true;
        }
        return false;
    }

    public String fragment() {
        return this.fragment;
    }

    public List<String> getQueryNamesAndValues() {
        return this.queryNamesAndValues;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String host() {
        return this.host;
    }

    public boolean isHttps() {
        return this.scheme.equals("https");
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        builder.port = this.port;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        return builder;
    }

    public String password() {
        return this.password;
    }

    public List<String> pathSegments() {
        return this.pathSegments;
    }

    public int pathSize() {
        return this.pathSegments.size();
    }

    public int port() {
        return this.port;
    }

    public String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        namesAndValuesToQueryString(sb2, this.queryNamesAndValues);
        return sb2.toString();
    }

    public String queryParameter(String str) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            if (str.equals(this.queryNamesAndValues.get(i10))) {
                return this.queryNamesAndValues.get(i10 + 1);
            }
        }
        return null;
    }

    public String queryParameterName(int i10) {
        return this.queryNamesAndValues.get(i10 * 2);
    }

    public Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.queryNamesAndValues.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            linkedHashSet.add(this.queryNamesAndValues.get(i10));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public String queryParameterValue(int i10) {
        return this.queryNamesAndValues.get((i10 * 2) + 1);
    }

    public List<String> queryParameterValues(String str) {
        if (this.queryNamesAndValues == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.queryNamesAndValues.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            if (str.equals(this.queryNamesAndValues.get(i10))) {
                arrayList.add(this.queryNamesAndValues.get(i10 + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public DeepLinkUri resolve(String str) {
        Builder builder = new Builder();
        if (builder.parse(this, str, false) == Builder.ParseResult.SUCCESS) {
            return builder.build();
        }
        return null;
    }

    public String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public URI uri() {
        try {
            return new URI(canonicalize(this.url, CONVERT_TO_URI_ENCODE_SET, true, false));
        } catch (URISyntaxException unused) {
            throw new IllegalStateException("not valid as a java.net.URI: " + this.url);
        }
    }

    public URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String username() {
        return this.username;
    }

    private DeepLinkUri(Builder builder) {
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername);
        this.password = percentDecode(builder.encodedPassword);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments);
        List<String> list = builder.encodedQueryNamesAndValues;
        this.queryNamesAndValues = list != null ? percentDecode(list) : null;
        String str = builder.encodedFragment;
        this.fragment = str != null ? percentDecode(str) : null;
        this.url = builder.toString();
    }

    public static DeepLinkUri get(URI uri) {
        return parse(uri.toString());
    }

    private static DeepLinkUri parse(String str, boolean z10) {
        Builder builder = new Builder();
        if (builder.parse(null, str, z10) == Builder.ParseResult.SUCCESS) {
            return builder.build();
        }
        return null;
    }

    private List<String> percentDecode(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? percentDecode(next) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bv.j] */
    public static String percentDecode(String str, int i10, int i11) {
        for (int i12 = i10; i12 < i11; i12++) {
            if (str.charAt(i12) == '%') {
                ?? obj = new Object();
                obj.i0(i10, i12, str);
                percentDecode(obj, str, i12, i11);
                return obj.H();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [bv.j] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static void canonicalize(j jVar, String str, int i10, int i11, String str2, boolean z10, boolean z11) {
        ?? r02 = 0;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (z11 && codePointAt == 43) {
                    jVar.j0(z10 ? "%20" : "%2B");
                } else if (codePointAt >= 32 && codePointAt < 127 && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || z10)) {
                    jVar.k0(codePointAt);
                } else {
                    if (r02 == 0) {
                        r02 = new Object();
                    }
                    r02.k0(codePointAt);
                    while (!r02.p()) {
                        try {
                            byte readByte = r02.readByte();
                            jVar.b0(37);
                            char[] cArr = HEX_DIGITS;
                            jVar.b0(cArr[((readByte & 255) >> 4) & 15]);
                            jVar.b0(cArr[readByte & 15]);
                        } catch (EOFException unused) {
                            System.err.println("Unable to canonicalize deeplink url!");
                        }
                    }
                }
            }
            i10 += Character.charCount(codePointAt);
            r02 = r02;
        }
    }

    public static void percentDecode(j jVar, String str, int i10, int i11) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int decodeHexDigit = decodeHexDigit(str.charAt(i10 + 1));
                int decodeHexDigit2 = decodeHexDigit(str.charAt(i12));
                if (decodeHexDigit != -1 && decodeHexDigit2 != -1) {
                    jVar.b0((decodeHexDigit << 4) + decodeHexDigit2);
                    i10 = i12;
                    i10 += Character.charCount(codePointAt);
                }
            }
            jVar.k0(codePointAt);
            i10 += Character.charCount(codePointAt);
        }
    }

    public static String canonicalize(String str, String str2, boolean z10, boolean z11) {
        return canonicalize(str, 0, str.length(), str2, z10, z11);
    }
}
