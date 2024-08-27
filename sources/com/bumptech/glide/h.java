package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import h.q0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import lk.i;
import lk.k;

/* loaded from: classes.dex */
public final class h implements ComponentCallbacks2, lk.e {

    /* renamed from: l, reason: collision with root package name */
    public static final nk.e f10818l;

    /* renamed from: m, reason: collision with root package name */
    public static final nk.e f10819m;

    /* renamed from: a, reason: collision with root package name */
    public final b f10820a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10821b;

    /* renamed from: c, reason: collision with root package name */
    public final lk.d f10822c;

    /* renamed from: d, reason: collision with root package name */
    public final i5.b f10823d;

    /* renamed from: e, reason: collision with root package name */
    public final i f10824e;

    /* renamed from: f, reason: collision with root package name */
    public final k f10825f;

    /* renamed from: g, reason: collision with root package name */
    public final q0 f10826g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f10827h;

    /* renamed from: i, reason: collision with root package name */
    public final lk.b f10828i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f10829j;

    /* renamed from: k, reason: collision with root package name */
    public final nk.e f10830k;

    static {
        nk.e eVar = (nk.e) new nk.a().d(Bitmap.class);
        eVar.f28786t = true;
        f10818l = eVar;
        nk.e eVar2 = (nk.e) new nk.a().d(jk.c.class);
        eVar2.f28786t = true;
        f10819m = eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6, types: [lk.b, lk.e] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [lk.d] */
    /* JADX WARN: Type inference failed for: r9v13, types: [nk.a, nk.e] */
    public h(b bVar, lk.d dVar, i iVar, Context context) {
        boolean z10;
        ?? r02;
        nk.e eVar;
        String str;
        i5.b bVar2 = new i5.b();
        ek.e eVar2 = bVar.f10784g;
        this.f10825f = new k();
        q0 q0Var = new q0(this, 19);
        this.f10826g = q0Var;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f10827h = handler;
        this.f10820a = bVar;
        this.f10822c = dVar;
        this.f10824e = iVar;
        this.f10823d = bVar2;
        this.f10821b = context;
        Context applicationContext = context.getApplicationContext();
        da.d dVar2 = new da.d(4, this, bVar2);
        eVar2.getClass();
        if (r3.k.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z10) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z10) {
            r02 = new lk.c(applicationContext, dVar2);
        } else {
            r02 = new Object();
        }
        this.f10828i = r02;
        if (rk.k.g()) {
            handler.post(q0Var);
        } else {
            dVar.a(this);
        }
        dVar.a(r02);
        this.f10829j = new CopyOnWriteArrayList(bVar.f10780c.f10805e);
        d dVar3 = bVar.f10780c;
        synchronized (dVar3) {
            try {
                if (dVar3.f10810j == null) {
                    dVar3.f10804d.getClass();
                    ?? aVar = new nk.a();
                    aVar.f28786t = true;
                    dVar3.f10810j = aVar;
                }
                eVar = dVar3.f10810j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this) {
            nk.e eVar3 = (nk.e) eVar.clone();
            if (eVar3.f28786t && !eVar3.f28788v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVar3.f28788v = true;
            eVar3.f28786t = true;
            this.f10830k = eVar3;
        }
        synchronized (bVar.f10785h) {
            try {
                if (!bVar.f10785h.contains(this)) {
                    bVar.f10785h.add(this);
                } else {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
            } finally {
            }
        }
    }

    public final g i(Class cls) {
        return new g(this.f10820a, this, cls, this.f10821b);
    }

    public final g j() {
        return i(Bitmap.class).w(f10818l);
    }

    public final void k(ok.g gVar) {
        if (gVar == null) {
            return;
        }
        boolean o10 = o(gVar);
        nk.b g10 = gVar.g();
        if (!o10) {
            b bVar = this.f10820a;
            synchronized (bVar.f10785h) {
                try {
                    Iterator it = bVar.f10785h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((h) it.next()).o(gVar)) {
                            }
                        } else if (g10 != null) {
                            gVar.e(null);
                            g10.clear();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final g l(Uri uri) {
        g i10 = i(Drawable.class);
        i10.F = uri;
        i10.J = true;
        return i10;
    }

    public final g m(String str) {
        g i10 = i(Drawable.class);
        i10.F = str;
        i10.J = true;
        return i10;
    }

    public final synchronized void n() {
        i5.b bVar = this.f10823d;
        bVar.f19358b = true;
        Iterator it = rk.k.d((Set) bVar.f19359c).iterator();
        while (it.hasNext()) {
            nk.b bVar2 = (nk.b) it.next();
            if (bVar2.isRunning()) {
                bVar2.d();
                ((List) bVar.f19360d).add(bVar2);
            }
        }
    }

    public final synchronized boolean o(ok.g gVar) {
        nk.b g10 = gVar.g();
        if (g10 == null) {
            return true;
        }
        if (this.f10823d.b(g10)) {
            this.f10825f.f24899a.remove(gVar);
            gVar.e(null);
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // lk.e
    public final synchronized void onDestroy() {
        try {
            this.f10825f.onDestroy();
            Iterator it = rk.k.d(this.f10825f.f24899a).iterator();
            while (it.hasNext()) {
                k((ok.g) it.next());
            }
            this.f10825f.f24899a.clear();
            i5.b bVar = this.f10823d;
            Iterator it2 = rk.k.d((Set) bVar.f19359c).iterator();
            while (it2.hasNext()) {
                bVar.b((nk.b) it2.next());
            }
            ((List) bVar.f19360d).clear();
            this.f10822c.b(this);
            this.f10822c.b(this.f10828i);
            this.f10827h.removeCallbacks(this.f10826g);
            this.f10820a.d(this);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // lk.e
    public final synchronized void onStart() {
        synchronized (this) {
            this.f10823d.e();
        }
        this.f10825f.onStart();
    }

    @Override // lk.e
    public final synchronized void onStop() {
        n();
        this.f10825f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f10823d + ", treeNode=" + this.f10824e + UrlTreeKt.componentParamSuffix;
    }
}
