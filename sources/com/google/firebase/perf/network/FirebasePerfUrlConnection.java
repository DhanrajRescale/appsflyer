package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import br.c;
import br.d;
import br.h;
import ek.u;
import er.f;
import fr.i;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import zq.g;

/* loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        u uVar = new u(url, 19);
        f fVar = f.f15842s;
        i iVar = new i();
        iVar.d();
        long j10 = iVar.f16224a;
        g gVar = new g(fVar);
        try {
            URLConnection openConnection = ((URL) uVar.f15627b).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) openConnection, iVar, gVar).f7288a.b();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, iVar, gVar).f7287a.b();
            }
            return openConnection.getContent();
        } catch (IOException e10) {
            gVar.h(j10);
            gVar.k(iVar.a());
            gVar.l(uVar.toString());
            h.c(gVar);
            throw e10;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new d((HttpsURLConnection) obj, new i(), new g(f.f15842s));
        }
        if (obj instanceof HttpURLConnection) {
            return new c((HttpURLConnection) obj, new i(), new g(f.f15842s));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        u uVar = new u(url, 19);
        f fVar = f.f15842s;
        i iVar = new i();
        iVar.d();
        long j10 = iVar.f16224a;
        g gVar = new g(fVar);
        try {
            URLConnection openConnection = ((URL) uVar.f15627b).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) openConnection, iVar, gVar).f7288a.e();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, iVar, gVar).f7287a.e();
            }
            return openConnection.getInputStream();
        } catch (IOException e10) {
            gVar.h(j10);
            gVar.k(iVar.a());
            gVar.l(uVar.toString());
            h.c(gVar);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        u uVar = new u(url, 19);
        f fVar = f.f15842s;
        i iVar = new i();
        iVar.d();
        long j10 = iVar.f16224a;
        g gVar = new g(fVar);
        try {
            URLConnection openConnection = ((URL) uVar.f15627b).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) openConnection, iVar, gVar).f7288a.c(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, iVar, gVar).f7287a.c(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e10) {
            gVar.h(j10);
            gVar.k(iVar.a());
            gVar.l(uVar.toString());
            h.c(gVar);
            throw e10;
        }
    }
}
