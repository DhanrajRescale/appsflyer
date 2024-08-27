package com.jakewharton.retrofit2.adapter.rxjava2;

import nv.v0;

/* loaded from: classes2.dex */
public final class HttpException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final transient v0 f12014a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HttpException(nv.v0 r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            okhttp3.Response r1 = r4.f29302a
            int r2 = r1.code()
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            java.lang.String r2 = r1.message()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r1.code()
            r1.message()
            r3.f12014a = r4
            return
        L2e:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "response == null"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jakewharton.retrofit2.adapter.rxjava2.HttpException.<init>(nv.v0):void");
    }
}
