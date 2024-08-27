package okhttp3.internal.http;

import bv.j;
import bv.m;
import gt.d;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.s;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import ut.a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lokhttp3/Headers;", HttpUrl.FRAGMENT_ENCODE_SET, "headerName", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Challenge;", "parseChallenges", "Lbv/j;", HttpUrl.FRAGMENT_ENCODE_SET, "result", HttpUrl.FRAGMENT_ENCODE_SET, "readChallengeHeader", HttpUrl.FRAGMENT_ENCODE_SET, "skipCommasAndWhitespace", HttpUrl.FRAGMENT_ENCODE_SET, "prefix", "startsWith", "readQuotedString", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "Lokhttp3/Response;", "promisesBody", "response", "hasBody", "Lbv/m;", "QUOTED_STRING_DELIMITERS", "Lbv/m;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HttpHeaders {

    @NotNull
    private static final m QUOTED_STRING_DELIMITERS;

    @NotNull
    private static final m TOKEN_DELIMITERS;

    static {
        m mVar = m.f7367d;
        QUOTED_STRING_DELIMITERS = d.e("\"\\");
        TOKEN_DELIMITERS = d.e("\t ,=");
    }

    @a
    public static final boolean hasBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, bv.j] */
    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String headerName) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (s.j(headerName, headers.name(i10), true)) {
                ?? obj = new Object();
                obj.j0(headers.value(i10));
                try {
                    readChallengeHeader(obj, arrayList);
                } catch (EOFException e10) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.a(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !s.j("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(bv.j r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.p()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = vt.p0.d()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L63
            if (r6 != 0) goto L40
            boolean r2 = r7.p()
            if (r2 == 0) goto L63
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r3 = da.e.p(r3)
            java.lang.String r4 = "="
            java.lang.String r4 = kotlin.text.s.m(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L63:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L6d:
            if (r3 != 0) goto L7e
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb7
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L7e:
            if (r6 == 0) goto Lb7
            r5 = 1
            if (r6 <= r5) goto L84
            return
        L84:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L8b
            return
        L8b:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L98
            java.lang.String r5 = readQuotedString(r7)
            goto L9c
        L98:
            java.lang.String r5 = readToken(r7)
        L9c:
            if (r5 != 0) goto L9f
            return
        L9f:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La8
            return
        La8:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb5
            boolean r3 = r7.p()
            if (r3 != 0) goto Lb5
            return
        Lb5:
            r3 = r0
            goto L6d
        Lb7:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(bv.j, java.util.List):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, bv.j] */
    private static final String readQuotedString(j jVar) throws EOFException {
        if (jVar.readByte() == 34) {
            ?? obj = new Object();
            while (true) {
                long P = jVar.P(QUOTED_STRING_DELIMITERS);
                if (P == -1) {
                    return null;
                }
                if (jVar.f(P) == 34) {
                    obj.write(jVar, P);
                    jVar.readByte();
                    return obj.H();
                }
                if (jVar.f7365b == P + 1) {
                    return null;
                }
                obj.write(jVar, P);
                jVar.readByte();
                obj.write(jVar, 1L);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(j jVar) {
        long P = jVar.P(TOKEN_DELIMITERS);
        if (P == -1) {
            P = jVar.f7365b;
        }
        if (P != 0) {
            return jVar.z(P, Charsets.UTF_8);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl url, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.INSTANCE.parseAll(url, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(j jVar) {
        boolean z10 = false;
        while (!jVar.p()) {
            byte f10 = jVar.f(0L);
            if (f10 == 44) {
                jVar.readByte();
                z10 = true;
            } else {
                if (f10 != 32 && f10 != 9) {
                    break;
                }
                jVar.readByte();
            }
        }
        return z10;
    }

    private static final boolean startsWith(j jVar, byte b10) {
        if (!jVar.p() && jVar.f(0L) == b10) {
            return true;
        }
        return false;
    }
}
