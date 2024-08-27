package br;

import fr.i;
import gr.p;
import gr.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final yq.a f7290f = yq.a.d();

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f7291a;

    /* renamed from: b, reason: collision with root package name */
    public final zq.g f7292b;

    /* renamed from: c, reason: collision with root package name */
    public long f7293c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f7294d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final i f7295e;

    public e(HttpURLConnection httpURLConnection, i iVar, zq.g gVar) {
        this.f7291a = httpURLConnection;
        this.f7292b = gVar;
        this.f7295e = iVar;
        gVar.l(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j10 = this.f7293c;
        zq.g gVar = this.f7292b;
        i iVar = this.f7295e;
        if (j10 == -1) {
            iVar.d();
            long j11 = iVar.f16224a;
            this.f7293c = j11;
            gVar.h(j11);
        }
        try {
            this.f7291a.connect();
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    public final Object b() {
        i iVar = this.f7295e;
        i();
        HttpURLConnection httpURLConnection = this.f7291a;
        int responseCode = httpURLConnection.getResponseCode();
        zq.g gVar = this.f7292b;
        gVar.e(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                gVar.i(httpURLConnection.getContentType());
                return new a((InputStream) content, gVar, iVar);
            }
            gVar.i(httpURLConnection.getContentType());
            gVar.j(httpURLConnection.getContentLength());
            gVar.k(iVar.a());
            gVar.b();
            return content;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    public final Object c(Class[] clsArr) {
        i iVar = this.f7295e;
        i();
        HttpURLConnection httpURLConnection = this.f7291a;
        int responseCode = httpURLConnection.getResponseCode();
        zq.g gVar = this.f7292b;
        gVar.e(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                gVar.i(httpURLConnection.getContentType());
                return new a((InputStream) content, gVar, iVar);
            }
            gVar.i(httpURLConnection.getContentType());
            gVar.j(httpURLConnection.getContentLength());
            gVar.k(iVar.a());
            gVar.b();
            return content;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.f7291a;
        zq.g gVar = this.f7292b;
        i();
        try {
            gVar.e(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f7290f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream != null) {
            return new a(errorStream, gVar, this.f7295e);
        }
        return errorStream;
    }

    public final InputStream e() {
        i iVar = this.f7295e;
        i();
        HttpURLConnection httpURLConnection = this.f7291a;
        int responseCode = httpURLConnection.getResponseCode();
        zq.g gVar = this.f7292b;
        gVar.e(responseCode);
        gVar.i(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                return new a(inputStream, gVar, iVar);
            }
            return inputStream;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    public final boolean equals(Object obj) {
        return this.f7291a.equals(obj);
    }

    public final OutputStream f() {
        i iVar = this.f7295e;
        zq.g gVar = this.f7292b;
        try {
            OutputStream outputStream = this.f7291a.getOutputStream();
            if (outputStream != null) {
                return new b(outputStream, gVar, iVar);
            }
            return outputStream;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    public final int g() {
        i();
        long j10 = this.f7294d;
        i iVar = this.f7295e;
        zq.g gVar = this.f7292b;
        if (j10 == -1) {
            long a10 = iVar.a();
            this.f7294d = a10;
            p pVar = gVar.f42811d;
            pVar.i();
            r.C((r) pVar.f11975b, a10);
        }
        try {
            int responseCode = this.f7291a.getResponseCode();
            gVar.e(responseCode);
            return responseCode;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    public final String h() {
        HttpURLConnection httpURLConnection = this.f7291a;
        i();
        long j10 = this.f7294d;
        i iVar = this.f7295e;
        zq.g gVar = this.f7292b;
        if (j10 == -1) {
            long a10 = iVar.a();
            this.f7294d = a10;
            p pVar = gVar.f42811d;
            pVar.i();
            r.C((r) pVar.f11975b, a10);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            gVar.e(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    public final int hashCode() {
        return this.f7291a.hashCode();
    }

    public final void i() {
        long j10 = this.f7293c;
        zq.g gVar = this.f7292b;
        if (j10 == -1) {
            i iVar = this.f7295e;
            iVar.d();
            long j11 = iVar.f16224a;
            this.f7293c = j11;
            gVar.h(j11);
        }
        HttpURLConnection httpURLConnection = this.f7291a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            gVar.d(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            gVar.d("POST");
        } else {
            gVar.d("GET");
        }
    }

    public final String toString() {
        return this.f7291a.toString();
    }
}
