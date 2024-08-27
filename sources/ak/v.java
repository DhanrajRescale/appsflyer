package ak;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class v implements j, sk.b {

    /* renamed from: y, reason: collision with root package name */
    public static final mt.p f575y = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final u f576a;

    /* renamed from: b, reason: collision with root package name */
    public final sk.e f577b;

    /* renamed from: c, reason: collision with root package name */
    public final y f578c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.e f579d;

    /* renamed from: e, reason: collision with root package name */
    public final mt.p f580e;

    /* renamed from: f, reason: collision with root package name */
    public final w f581f;

    /* renamed from: g, reason: collision with root package name */
    public final dk.c f582g;

    /* renamed from: h, reason: collision with root package name */
    public final dk.c f583h;

    /* renamed from: i, reason: collision with root package name */
    public final dk.c f584i;

    /* renamed from: j, reason: collision with root package name */
    public final dk.c f585j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f586k;

    /* renamed from: l, reason: collision with root package name */
    public xj.g f587l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f588m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f589n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f590o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f591p;

    /* renamed from: q, reason: collision with root package name */
    public e0 f592q;

    /* renamed from: r, reason: collision with root package name */
    public xj.a f593r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f594s;

    /* renamed from: t, reason: collision with root package name */
    public GlideException f595t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f596u;

    /* renamed from: v, reason: collision with root package name */
    public z f597v;

    /* renamed from: w, reason: collision with root package name */
    public m f598w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f599x;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, sk.e] */
    public v(dk.c cVar, dk.c cVar2, dk.c cVar3, dk.c cVar4, w wVar, y yVar, c4.e eVar) {
        mt.p pVar = f575y;
        this.f576a = new u(new ArrayList(2));
        this.f577b = new Object();
        this.f586k = new AtomicInteger();
        this.f582g = cVar;
        this.f583h = cVar2;
        this.f584i = cVar3;
        this.f585j = cVar4;
        this.f581f = wVar;
        this.f578c = yVar;
        this.f579d = eVar;
        this.f580e = pVar;
    }

    public final synchronized void a(nk.f fVar, Executor executor) {
        try {
            this.f577b.a();
            u uVar = this.f576a;
            uVar.getClass();
            uVar.f574a.add(new t(fVar, executor));
            int i10 = 1;
            if (this.f594s) {
                d(1);
                executor.execute(new s(this, fVar, i10));
            } else {
                int i11 = 0;
                if (this.f596u) {
                    d(1);
                    executor.execute(new s(this, fVar, i11));
                } else {
                    al.d.T("Cannot add callbacks to a cancelled EngineJob", !this.f599x);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b() {
        Map map;
        if (f()) {
            return;
        }
        this.f599x = true;
        m mVar = this.f598w;
        mVar.C = true;
        h hVar = mVar.A;
        if (hVar != null) {
            hVar.cancel();
        }
        w wVar = this.f581f;
        xj.g gVar = this.f587l;
        r rVar = (r) wVar;
        synchronized (rVar) {
            q0.u uVar = rVar.f562a;
            uVar.getClass();
            if (this.f591p) {
                map = uVar.f31542b;
            } else {
                map = uVar.f31541a;
            }
            if (equals(map.get(gVar))) {
                map.remove(gVar);
            }
        }
    }

    public final void c() {
        boolean z10;
        z zVar;
        synchronized (this) {
            try {
                this.f577b.a();
                al.d.T("Not yet complete!", f());
                int decrementAndGet = this.f586k.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                al.d.T("Can't decrement below 0", z10);
                if (decrementAndGet == 0) {
                    zVar = this.f597v;
                    g();
                } else {
                    zVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zVar != null) {
            zVar.e();
        }
    }

    public final synchronized void d(int i10) {
        z zVar;
        al.d.T("Not yet complete!", f());
        if (this.f586k.getAndAdd(i10) == 0 && (zVar = this.f597v) != null) {
            zVar.a();
        }
    }

    @Override // sk.b
    public final sk.e e() {
        return this.f577b;
    }

    public final boolean f() {
        return this.f596u || this.f594s || this.f599x;
    }

    public final synchronized void g() {
        boolean a10;
        if (this.f587l != null) {
            this.f576a.f574a.clear();
            this.f587l = null;
            this.f597v = null;
            this.f592q = null;
            this.f596u = false;
            this.f599x = false;
            this.f594s = false;
            m mVar = this.f598w;
            l lVar = mVar.f529g;
            synchronized (lVar) {
                lVar.f520a = true;
                a10 = lVar.a();
            }
            if (a10) {
                mVar.l();
            }
            this.f598w = null;
            this.f595t = null;
            this.f593r = null;
            this.f579d.b(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(nk.f fVar) {
        try {
            this.f577b.a();
            u uVar = this.f576a;
            uVar.getClass();
            uVar.f574a.remove(new t(fVar, rk.e.f33939b));
            if (this.f576a.f574a.isEmpty()) {
                b();
                if (!this.f594s) {
                    if (this.f596u) {
                    }
                }
                if (this.f586k.get() == 0) {
                    g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
