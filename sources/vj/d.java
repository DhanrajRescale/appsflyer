package vj;

import ak.k;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import n5.b0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements ck.a {

    /* renamed from: a, reason: collision with root package name */
    public long f38117a;

    /* renamed from: b, reason: collision with root package name */
    public Object f38118b;

    /* renamed from: c, reason: collision with root package name */
    public Object f38119c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f38120d;

    /* renamed from: e, reason: collision with root package name */
    public Object f38121e;

    @Override // ck.a
    public final void a(xj.g gVar, k kVar) {
        ck.b bVar;
        e d10;
        boolean z10;
        String t10 = ((da.d) this.f38119c).t(gVar);
        da.d dVar = (da.d) this.f38121e;
        synchronized (dVar) {
            bVar = (ck.b) ((Map) dVar.f14276b).get(t10);
            if (bVar == null) {
                ck.c cVar = (ck.c) dVar.f14277c;
                synchronized (cVar.f8191a) {
                    bVar = (ck.b) cVar.f8191a.poll();
                }
                if (bVar == null) {
                    bVar = new ck.b();
                }
                ((Map) dVar.f14276b).put(t10, bVar);
            }
            bVar.f8190b++;
        }
        bVar.f8189a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + t10 + " for for Key: " + gVar);
            }
            try {
                d10 = d();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (d10.g(t10) != null) {
                return;
            }
            b0 d11 = d10.d(t10);
            if (d11 != null) {
                try {
                    if (((xj.c) kVar.f517a).h(kVar.f518b, d11.j(), (xj.k) kVar.f519c)) {
                        switch (d11.f28246a) {
                            case 3:
                                d11.c(true);
                                break;
                            default:
                                e.a((e) d11.f28250e, d11, true);
                                d11.f28247b = true;
                                break;
                        }
                    }
                    if (!z10) {
                        try {
                            d11.a();
                        } catch (IOException unused) {
                        }
                    }
                    return;
                } finally {
                    if (!d11.f28247b) {
                        try {
                            d11.a();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: ".concat(t10));
        } finally {
            ((da.d) this.f38121e).w(t10);
        }
    }

    @Override // ck.a
    public final File b(xj.g gVar) {
        String t10 = ((da.d) this.f38119c).t(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + t10 + " for for Key: " + gVar);
        }
        try {
            d g10 = d().g(t10);
            if (g10 == null) {
                return null;
            }
            return ((File[]) g10.f38121e)[0];
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    public final jr.e c() {
        return new jr.e((JSONObject) this.f38119c, (Date) this.f38120d, (JSONArray) this.f38121e, (JSONObject) this.f38118b, this.f38117a);
    }

    public final synchronized e d() {
        try {
            if (((e) this.f38118b) == null) {
                this.f38118b = e.l((File) this.f38120d, this.f38117a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (e) this.f38118b;
    }
}
