package br;

import fr.i;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes2.dex */
public final class f implements ResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ResponseHandler f7296a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7297b;

    /* renamed from: c, reason: collision with root package name */
    public final zq.g f7298c;

    public f(ResponseHandler responseHandler, i iVar, zq.g gVar) {
        this.f7296a = responseHandler;
        this.f7297b = iVar;
        this.f7298c = gVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.f7298c.k(this.f7297b.a());
        this.f7298c.e(httpResponse.getStatusLine().getStatusCode());
        Long a10 = h.a(httpResponse);
        if (a10 != null) {
            this.f7298c.j(a10.longValue());
        }
        String b10 = h.b(httpResponse);
        if (b10 != null) {
            this.f7298c.i(b10);
        }
        this.f7298c.b();
        return this.f7296a.handleResponse(httpResponse);
    }
}
