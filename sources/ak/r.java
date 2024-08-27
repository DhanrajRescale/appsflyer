package ak;

import android.os.SystemClock;
import android.util.Log;
import h.r0;
import java.util.Map;
import java.util.concurrent.Executor;
import m.a4;

/* loaded from: classes.dex */
public final class r implements w, ck.g, y {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f561h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final q0.u f562a;

    /* renamed from: b, reason: collision with root package name */
    public final ni.g f563b;

    /* renamed from: c, reason: collision with root package name */
    public final ck.f f564c;

    /* renamed from: d, reason: collision with root package name */
    public final a4 f565d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f566e;

    /* renamed from: f, reason: collision with root package name */
    public final l0.j f567f;

    /* renamed from: g, reason: collision with root package name */
    public final c f568g;

    public r(ck.f fVar, ck.d dVar, dk.c cVar, dk.c cVar2, dk.c cVar3, dk.c cVar4) {
        this.f564c = fVar;
        q qVar = new q(dVar);
        c cVar5 = new c();
        this.f568g = cVar5;
        synchronized (this) {
            synchronized (cVar5) {
                cVar5.f452d = this;
            }
        }
        this.f563b = new ni.g(27);
        this.f562a = new q0.u(2);
        this.f565d = new a4(cVar, cVar2, cVar3, cVar4, this, this);
        this.f567f = new l0.j(qVar);
        this.f566e = new r0(6);
        fVar.f8195e = this;
    }

    public static void c(String str, long j10, xj.g gVar) {
        StringBuilder r10 = da.e.r(str, " in ");
        r10.append(rk.f.a(j10));
        r10.append("ms, key: ");
        r10.append(gVar);
        Log.v("Engine", r10.toString());
    }

    public static void f(e0 e0Var) {
        if (e0Var instanceof z) {
            ((z) e0Var).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final k a(com.bumptech.glide.d dVar, Object obj, xj.g gVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.e eVar, p pVar, rk.b bVar, boolean z10, boolean z11, xj.k kVar, boolean z12, boolean z13, boolean z14, boolean z15, nk.f fVar, Executor executor) {
        long j10;
        if (f561h) {
            int i12 = rk.f.f33941b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        this.f563b.getClass();
        x xVar = new x(obj, gVar, i10, i11, bVar, cls, cls2, kVar);
        synchronized (this) {
            try {
                z b10 = b(xVar, z12, j11);
                if (b10 == null) {
                    return g(dVar, obj, gVar, i10, i11, cls, cls2, eVar, pVar, bVar, z10, z11, kVar, z12, z13, z14, z15, fVar, executor, xVar, j11);
                }
                ((nk.g) fVar).n(xj.a.f40290e, b10);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z b(x xVar, boolean z10, long j10) {
        z zVar;
        Object remove;
        z zVar2;
        if (!z10) {
            return null;
        }
        c cVar = this.f568g;
        synchronized (cVar) {
            b bVar = (b) cVar.f450b.get(xVar);
            if (bVar == null) {
                zVar = null;
            } else {
                zVar = (z) bVar.get();
                if (zVar == null) {
                    cVar.b(bVar);
                }
            }
        }
        if (zVar != null) {
            zVar.a();
        }
        if (zVar != null) {
            if (f561h) {
                c("Loaded resource from active resources", j10, xVar);
            }
            return zVar;
        }
        ck.f fVar = this.f564c;
        synchronized (fVar) {
            remove = fVar.f33942a.remove(xVar);
            if (remove != null) {
                fVar.f33944c -= fVar.b(remove);
            }
        }
        e0 e0Var = (e0) remove;
        if (e0Var == null) {
            zVar2 = null;
        } else if (e0Var instanceof z) {
            zVar2 = (z) e0Var;
        } else {
            zVar2 = new z(e0Var, true, true, xVar, this);
        }
        if (zVar2 != null) {
            zVar2.a();
            this.f568g.a(xVar, zVar2);
        }
        if (zVar2 == null) {
            return null;
        }
        if (f561h) {
            c("Loaded resource from cache", j10, xVar);
        }
        return zVar2;
    }

    public final synchronized void d(v vVar, xj.g gVar, z zVar) {
        Map map;
        if (zVar != null) {
            try {
                if (zVar.f609a) {
                    this.f568g.a(gVar, zVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        q0.u uVar = this.f562a;
        uVar.getClass();
        if (vVar.f591p) {
            map = uVar.f31542b;
        } else {
            map = uVar.f31541a;
        }
        if (vVar.equals(map.get(gVar))) {
            map.remove(gVar);
        }
    }

    public final void e(xj.g gVar, z zVar) {
        c cVar = this.f568g;
        synchronized (cVar) {
            b bVar = (b) cVar.f450b.remove(gVar);
            if (bVar != null) {
                bVar.f448c = null;
                bVar.clear();
            }
        }
        if (zVar.f609a) {
        } else {
            this.f566e.h(zVar, false);
        }
    }

    public final k g(com.bumptech.glide.d dVar, Object obj, xj.g gVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.e eVar, p pVar, rk.b bVar, boolean z10, boolean z11, xj.k kVar, boolean z12, boolean z13, boolean z14, boolean z15, nk.f fVar, Executor executor, x xVar, long j10) {
        dk.c cVar;
        q0.u uVar = this.f562a;
        v vVar = (v) (z15 ? uVar.f31542b : uVar.f31541a).get(xVar);
        if (vVar != null) {
            vVar.a(fVar, executor);
            if (f561h) {
                c("Added to existing load", j10, xVar);
            }
            return new k(this, fVar, vVar);
        }
        v vVar2 = (v) ((c4.e) this.f565d.f25487h).c();
        al.d.V(vVar2);
        synchronized (vVar2) {
            vVar2.f587l = xVar;
            vVar2.f588m = z12;
            vVar2.f589n = z13;
            vVar2.f590o = z14;
            vVar2.f591p = z15;
        }
        l0.j jVar = this.f567f;
        m mVar = (m) ((c4.e) jVar.f23775c).c();
        al.d.V(mVar);
        int i12 = jVar.f23773a;
        jVar.f23773a = i12 + 1;
        i iVar = mVar.f523a;
        iVar.f494c = dVar;
        iVar.f495d = obj;
        iVar.f505n = gVar;
        iVar.f496e = i10;
        iVar.f497f = i11;
        iVar.f507p = pVar;
        iVar.f498g = cls;
        iVar.f499h = mVar.f526d;
        iVar.f502k = cls2;
        iVar.f506o = eVar;
        iVar.f500i = kVar;
        iVar.f501j = bVar;
        iVar.f508q = z10;
        iVar.f509r = z11;
        mVar.f530h = dVar;
        mVar.f531i = gVar;
        mVar.f532j = eVar;
        mVar.f533k = xVar;
        mVar.f534l = i10;
        mVar.f535m = i11;
        mVar.f536n = pVar;
        mVar.f541s = z15;
        mVar.f537o = kVar;
        mVar.f538p = vVar2;
        mVar.f539q = i12;
        mVar.E = 1;
        mVar.f542t = obj;
        q0.u uVar2 = this.f562a;
        uVar2.getClass();
        (vVar2.f591p ? uVar2.f31542b : uVar2.f31541a).put(xVar, vVar2);
        vVar2.a(fVar, executor);
        synchronized (vVar2) {
            vVar2.f598w = mVar;
            int i13 = mVar.i(1);
            if (i13 != 2 && i13 != 3) {
                if (vVar2.f589n) {
                    cVar = vVar2.f584i;
                } else {
                    cVar = vVar2.f590o ? vVar2.f585j : vVar2.f583h;
                }
                cVar.execute(mVar);
            }
            cVar = vVar2.f582g;
            cVar.execute(mVar);
        }
        if (f561h) {
            c("Started new load", j10, xVar);
        }
        return new k(this, fVar, vVar2);
    }
}
