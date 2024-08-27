package ak;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class m implements g, Runnable, Comparable, sk.b {
    public volatile h A;
    public volatile boolean B;
    public volatile boolean C;
    public int D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public final q f526d;

    /* renamed from: e, reason: collision with root package name */
    public final c4.e f527e;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.d f530h;

    /* renamed from: i, reason: collision with root package name */
    public xj.g f531i;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.e f532j;

    /* renamed from: k, reason: collision with root package name */
    public x f533k;

    /* renamed from: l, reason: collision with root package name */
    public int f534l;

    /* renamed from: m, reason: collision with root package name */
    public int f535m;

    /* renamed from: n, reason: collision with root package name */
    public p f536n;

    /* renamed from: o, reason: collision with root package name */
    public xj.k f537o;

    /* renamed from: p, reason: collision with root package name */
    public j f538p;

    /* renamed from: q, reason: collision with root package name */
    public int f539q;

    /* renamed from: r, reason: collision with root package name */
    public long f540r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f541s;

    /* renamed from: t, reason: collision with root package name */
    public Object f542t;

    /* renamed from: u, reason: collision with root package name */
    public Thread f543u;

    /* renamed from: v, reason: collision with root package name */
    public xj.g f544v;

    /* renamed from: w, reason: collision with root package name */
    public xj.g f545w;

    /* renamed from: x, reason: collision with root package name */
    public Object f546x;

    /* renamed from: y, reason: collision with root package name */
    public xj.a f547y;

    /* renamed from: z, reason: collision with root package name */
    public yj.e f548z;

    /* renamed from: a, reason: collision with root package name */
    public final i f523a = new i();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f524b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final sk.e f525c = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final k f528f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final l f529g = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sk.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ak.k] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ak.l, java.lang.Object] */
    public m(q qVar, c4.e eVar) {
        this.f526d = qVar;
        this.f527e = eVar;
    }

    @Override // ak.g
    public final void a(xj.g gVar, Exception exc, yj.e eVar, xj.a aVar) {
        dk.c cVar;
        eVar.c();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class a10 = eVar.a();
        glideException.f10834b = gVar;
        glideException.f10835c = aVar;
        glideException.f10836d = a10;
        this.f524b.add(glideException);
        if (Thread.currentThread() != this.f543u) {
            this.E = 2;
            v vVar = (v) this.f538p;
            if (vVar.f589n) {
                cVar = vVar.f584i;
            } else if (vVar.f590o) {
                cVar = vVar.f585j;
            } else {
                cVar = vVar.f583h;
            }
            cVar.execute(this);
            return;
        }
        m();
    }

    public final e0 b(yj.e eVar, Object obj, xj.a aVar) {
        if (obj == null) {
            return null;
        }
        try {
            int i10 = rk.f.f33941b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            e0 f10 = f(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + f10, elapsedRealtimeNanos, null);
            }
            return f10;
        } finally {
            eVar.c();
        }
    }

    @Override // ak.g
    public final void c() {
        dk.c cVar;
        this.E = 2;
        v vVar = (v) this.f538p;
        if (vVar.f589n) {
            cVar = vVar.f584i;
        } else if (vVar.f590o) {
            cVar = vVar.f585j;
        } else {
            cVar = vVar.f583h;
        }
        cVar.execute(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int ordinal = this.f532j.ordinal() - mVar.f532j.ordinal();
        if (ordinal == 0) {
            return this.f539q - mVar.f539q;
        }
        return ordinal;
    }

    @Override // ak.g
    public final void d(xj.g gVar, Object obj, yj.e eVar, xj.a aVar, xj.g gVar2) {
        dk.c cVar;
        this.f544v = gVar;
        this.f546x = obj;
        this.f548z = eVar;
        this.f547y = aVar;
        this.f545w = gVar2;
        if (Thread.currentThread() != this.f543u) {
            this.E = 3;
            v vVar = (v) this.f538p;
            if (vVar.f589n) {
                cVar = vVar.f584i;
            } else if (vVar.f590o) {
                cVar = vVar.f585j;
            } else {
                cVar = vVar.f583h;
            }
            cVar.execute(this);
            return;
        }
        g();
    }

    @Override // sk.b
    public final sk.e e() {
        return this.f525c;
    }

    public final e0 f(Object obj, xj.a aVar) {
        boolean z10;
        yj.g b10;
        c0 c10 = this.f523a.c(obj.getClass());
        xj.k kVar = this.f537o;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar != xj.a.f40289d && !this.f523a.f509r) {
                z10 = false;
            } else {
                z10 = true;
            }
            xj.j jVar = hk.n.f18550i;
            Boolean bool = (Boolean) kVar.c(jVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                kVar = new xj.k();
                kVar.f40305b.g(this.f537o.f40305b);
                kVar.f40305b.put(jVar, Boolean.valueOf(z10));
            }
        }
        xj.k kVar2 = kVar;
        yj.i iVar = (yj.i) this.f530h.f10802b.f21097e;
        synchronized (iVar) {
            try {
                yj.f fVar = (yj.f) iVar.f41660a.get(obj.getClass());
                if (fVar == null) {
                    Iterator it = iVar.f41660a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        yj.f fVar2 = (yj.f) it.next();
                        if (fVar2.a().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = yj.i.f41659b;
                }
                b10 = fVar.b(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            return c10.a(this.f534l, this.f535m, new da.d(6, this, aVar), kVar2, b10);
        } finally {
            b10.c();
        }
    }

    public final void g() {
        e0 e0Var;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Retrieved data", this.f540r, "data: " + this.f546x + ", cache key: " + this.f544v + ", fetcher: " + this.f548z);
        }
        d0 d0Var = null;
        try {
            e0Var = b(this.f548z, this.f546x, this.f547y);
        } catch (GlideException e10) {
            xj.g gVar = this.f545w;
            xj.a aVar = this.f547y;
            e10.f10834b = gVar;
            e10.f10835c = aVar;
            e10.f10836d = null;
            this.f524b.add(e10);
            e0Var = null;
        }
        if (e0Var != null) {
            xj.a aVar2 = this.f547y;
            if (e0Var instanceof b0) {
                ((b0) e0Var).a();
            }
            int i10 = 1;
            if (((d0) this.f528f.f519c) != null) {
                d0Var = (d0) d0.f456e.c();
                al.d.V(d0Var);
                d0Var.f460d = false;
                d0Var.f459c = true;
                d0Var.f458b = e0Var;
                e0Var = d0Var;
            }
            o();
            v vVar = (v) this.f538p;
            synchronized (vVar) {
                vVar.f592q = e0Var;
                vVar.f593r = aVar2;
            }
            synchronized (vVar) {
                try {
                    vVar.f577b.a();
                    if (vVar.f599x) {
                        vVar.f592q.b();
                        vVar.g();
                    } else if (!vVar.f576a.f574a.isEmpty()) {
                        if (!vVar.f594s) {
                            mt.p pVar = vVar.f580e;
                            e0 e0Var2 = vVar.f592q;
                            boolean z10 = vVar.f588m;
                            xj.g gVar2 = vVar.f587l;
                            y yVar = vVar.f578c;
                            pVar.getClass();
                            vVar.f597v = new z(e0Var2, z10, true, gVar2, yVar);
                            vVar.f594s = true;
                            u uVar = vVar.f576a;
                            uVar.getClass();
                            ArrayList<t> arrayList = new ArrayList(uVar.f574a);
                            vVar.d(arrayList.size() + 1);
                            ((r) vVar.f581f).d(vVar, vVar.f587l, vVar.f597v);
                            for (t tVar : arrayList) {
                                tVar.f573b.execute(new s(vVar, tVar.f572a, i10));
                            }
                            vVar.c();
                        } else {
                            throw new IllegalStateException("Already have resource");
                        }
                    } else {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                } finally {
                }
            }
            this.D = 5;
            try {
                k kVar = this.f528f;
                if (((d0) kVar.f519c) != null) {
                    kVar.a(this.f526d, this.f537o);
                }
                l lVar = this.f529g;
                synchronized (lVar) {
                    lVar.f521b = true;
                    a10 = lVar.a();
                }
                if (a10) {
                    l();
                    return;
                }
                return;
            } finally {
                if (d0Var != null) {
                    d0Var.a();
                }
            }
        }
        m();
    }

    public final h h() {
        int e10 = w.k.e(this.D);
        i iVar = this.f523a;
        if (e10 != 1) {
            if (e10 != 2) {
                if (e10 != 3) {
                    if (e10 == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(a3.a.x(this.D)));
                }
                return new i0(iVar, this);
            }
            return new e(iVar.a(), iVar, this);
        }
        return new f0(iVar, this);
    }

    public final int i(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3 || i11 == 5) {
                            return 6;
                        }
                        throw new IllegalArgumentException("Unrecognized stage: ".concat(a3.a.x(i10)));
                    }
                    if (this.f541s) {
                        return 6;
                    }
                    return 4;
                }
                switch (((o) this.f536n).f554e) {
                    case 1:
                    case 3:
                        return i(3);
                    case 2:
                    default:
                        return 3;
                }
            }
            switch (((o) this.f536n).f554e) {
                case 1:
                case 2:
                    return i(2);
                default:
                    return 2;
            }
        }
        throw null;
    }

    public final void j(String str, long j10, String str2) {
        String str3;
        StringBuilder r10 = da.e.r(str, " in ");
        r10.append(rk.f.a(j10));
        r10.append(", load key: ");
        r10.append(this.f533k);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        r10.append(str3);
        r10.append(", thread: ");
        r10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", r10.toString());
    }

    public final void k() {
        boolean a10;
        o();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f524b));
        v vVar = (v) this.f538p;
        synchronized (vVar) {
            vVar.f595t = glideException;
        }
        synchronized (vVar) {
            try {
                vVar.f577b.a();
                if (vVar.f599x) {
                    vVar.g();
                } else if (!vVar.f576a.f574a.isEmpty()) {
                    if (!vVar.f596u) {
                        vVar.f596u = true;
                        xj.g gVar = vVar.f587l;
                        u uVar = vVar.f576a;
                        uVar.getClass();
                        ArrayList<t> arrayList = new ArrayList(uVar.f574a);
                        vVar.d(arrayList.size() + 1);
                        ((r) vVar.f581f).d(vVar, gVar, null);
                        for (t tVar : arrayList) {
                            tVar.f573b.execute(new s(vVar, tVar.f572a, 0));
                        }
                        vVar.c();
                    } else {
                        throw new IllegalStateException("Already failed once");
                    }
                } else {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
            } finally {
            }
        }
        l lVar = this.f529g;
        synchronized (lVar) {
            lVar.f522c = true;
            a10 = lVar.a();
        }
        if (a10) {
            l();
        }
    }

    public final void l() {
        l lVar = this.f529g;
        synchronized (lVar) {
            lVar.f521b = false;
            lVar.f520a = false;
            lVar.f522c = false;
        }
        k kVar = this.f528f;
        kVar.f517a = null;
        kVar.f518b = null;
        kVar.f519c = null;
        i iVar = this.f523a;
        iVar.f494c = null;
        iVar.f495d = null;
        iVar.f505n = null;
        iVar.f498g = null;
        iVar.f502k = null;
        iVar.f500i = null;
        iVar.f506o = null;
        iVar.f501j = null;
        iVar.f507p = null;
        iVar.f492a.clear();
        iVar.f503l = false;
        iVar.f493b.clear();
        iVar.f504m = false;
        this.B = false;
        this.f530h = null;
        this.f531i = null;
        this.f537o = null;
        this.f532j = null;
        this.f533k = null;
        this.f538p = null;
        this.D = 0;
        this.A = null;
        this.f543u = null;
        this.f544v = null;
        this.f546x = null;
        this.f547y = null;
        this.f548z = null;
        this.f540r = 0L;
        this.C = false;
        this.f524b.clear();
        this.f527e.b(this);
    }

    public final void m() {
        this.f543u = Thread.currentThread();
        int i10 = rk.f.f33941b;
        this.f540r = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.C && this.A != null && !(z10 = this.A.b())) {
            this.D = i(this.D);
            this.A = h();
            if (this.D == 4) {
                c();
                return;
            }
        }
        if ((this.D == 6 || this.C) && !z10) {
            k();
        }
    }

    public final void n() {
        int e10 = w.k.e(this.E);
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 == 2) {
                    g();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: ".concat(a3.a.w(this.E)));
            }
            m();
            return;
        }
        this.D = i(1);
        this.A = h();
        m();
    }

    public final void o() {
        Throwable th2;
        this.f525c.a();
        if (this.B) {
            if (this.f524b.isEmpty()) {
                th2 = null;
            } else {
                th2 = (Throwable) jr.h.l(this.f524b, 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.B = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yj.e eVar = this.f548z;
        try {
            try {
                if (this.C) {
                    k();
                    if (eVar != null) {
                        eVar.c();
                        return;
                    }
                    return;
                }
                n();
                if (eVar != null) {
                    eVar.c();
                }
            } catch (d e10) {
                throw e10;
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.C + ", stage: " + a3.a.x(this.D), th2);
                }
                if (this.D != 5) {
                    this.f524b.add(th2);
                    k();
                }
                if (!this.C) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (eVar != null) {
                eVar.c();
            }
            throw th3;
        }
    }
}
