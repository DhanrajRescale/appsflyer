package com.google.firebase.perf.network;

import a3.a;
import androidx.annotation.Keep;
import br.h;
import er.f;
import fr.i;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import zq.g;

/* loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        i iVar = new i();
        g c10 = g.c(f.f15842s);
        try {
            c10.l(httpUriRequest.getURI().toString());
            c10.d(httpUriRequest.getMethod());
            Long a10 = h.a(httpUriRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.d();
            c10.h(iVar.c());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c10.k(iVar.a());
            c10.e(execute.getStatusLine().getStatusCode());
            Long a11 = h.a(execute);
            if (a11 != null) {
                c10.j(a11.longValue());
            }
            String b10 = h.b(execute);
            if (b10 != null) {
                c10.i(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            a.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        i iVar = new i();
        g c10 = g.c(f.f15842s);
        try {
            c10.l(httpUriRequest.getURI().toString());
            c10.d(httpUriRequest.getMethod());
            Long a10 = h.a(httpUriRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.d();
            c10.h(iVar.c());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c10.k(iVar.a());
            c10.e(execute.getStatusLine().getStatusCode());
            Long a11 = h.a(execute);
            if (a11 != null) {
                c10.j(a11.longValue());
            }
            String b10 = h.b(execute);
            if (b10 != null) {
                c10.i(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            a.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        i iVar = new i();
        g c10 = g.c(f.f15842s);
        try {
            c10.l(httpUriRequest.getURI().toString());
            c10.d(httpUriRequest.getMethod());
            Long a10 = h.a(httpUriRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.d();
            c10.h(iVar.c());
            return (T) httpClient.execute(httpUriRequest, new br.f(responseHandler, iVar, c10));
        } catch (IOException e10) {
            a.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        i iVar = new i();
        g c10 = g.c(f.f15842s);
        try {
            c10.l(httpUriRequest.getURI().toString());
            c10.d(httpUriRequest.getMethod());
            Long a10 = h.a(httpUriRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.d();
            c10.h(iVar.c());
            return (T) httpClient.execute(httpUriRequest, new br.f(responseHandler, iVar, c10), httpContext);
        } catch (IOException e10) {
            a.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        i iVar = new i();
        g c10 = g.c(f.f15842s);
        try {
            c10.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c10.d(httpRequest.getRequestLine().getMethod());
            Long a10 = h.a(httpRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.d();
            c10.h(iVar.c());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c10.k(iVar.a());
            c10.e(execute.getStatusLine().getStatusCode());
            Long a11 = h.a(execute);
            if (a11 != null) {
                c10.j(a11.longValue());
            }
            String b10 = h.b(execute);
            if (b10 != null) {
                c10.i(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            a.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        i iVar = new i();
        g c10 = g.c(f.f15842s);
        try {
            c10.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c10.d(httpRequest.getRequestLine().getMethod());
            Long a10 = h.a(httpRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.d();
            c10.h(iVar.c());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c10.k(iVar.a());
            c10.e(execute.getStatusLine().getStatusCode());
            Long a11 = h.a(execute);
            if (a11 != null) {
                c10.j(a11.longValue());
            }
            String b10 = h.b(execute);
            if (b10 != null) {
                c10.i(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            a.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        i iVar = new i();
        g c10 = g.c(f.f15842s);
        try {
            c10.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c10.d(httpRequest.getRequestLine().getMethod());
            Long a10 = h.a(httpRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.d();
            c10.h(iVar.c());
            return (T) httpClient.execute(httpHost, httpRequest, new br.f(responseHandler, iVar, c10));
        } catch (IOException e10) {
            a.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        i iVar = new i();
        g c10 = g.c(f.f15842s);
        try {
            c10.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c10.d(httpRequest.getRequestLine().getMethod());
            Long a10 = h.a(httpRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.d();
            c10.h(iVar.c());
            return (T) httpClient.execute(httpHost, httpRequest, new br.f(responseHandler, iVar, c10), httpContext);
        } catch (IOException e10) {
            a.t(iVar, c10, c10);
            throw e10;
        }
    }
}
