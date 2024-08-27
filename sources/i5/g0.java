package i5;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import b5.m1;
import b5.o1;
import b5.p1;
import com.google.android.gms.search.SearchAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import m.o3;

/* loaded from: classes.dex */
public final class g0 extends b5.i implements r {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f19446j0 = 0;
    public final e A;
    public final o3 B;
    public final o3 C;
    public final long D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public final j1 K;
    public r5.y0 L;
    public b5.w0 M;
    public b5.n0 N;
    public AudioTrack O;
    public Object P;
    public Surface Q;
    public SurfaceHolder R;
    public y5.k S;
    public boolean T;
    public TextureView U;
    public final int V;
    public e5.q W;
    public final int X;
    public final b5.g Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f19447a0;

    /* renamed from: b, reason: collision with root package name */
    public final u5.w f19448b;

    /* renamed from: b0, reason: collision with root package name */
    public d5.c f19449b0;

    /* renamed from: c, reason: collision with root package name */
    public final b5.w0 f19450c;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f19451c0;

    /* renamed from: d, reason: collision with root package name */
    public final h.r0 f19452d = new h.r0(3);

    /* renamed from: d0, reason: collision with root package name */
    public boolean f19453d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f19454e;

    /* renamed from: e0, reason: collision with root package name */
    public p1 f19455e0;

    /* renamed from: f, reason: collision with root package name */
    public final b5.a1 f19456f;

    /* renamed from: f0, reason: collision with root package name */
    public b5.n0 f19457f0;

    /* renamed from: g, reason: collision with root package name */
    public final f[] f19458g;

    /* renamed from: g0, reason: collision with root package name */
    public b1 f19459g0;

    /* renamed from: h, reason: collision with root package name */
    public final u5.v f19460h;

    /* renamed from: h0, reason: collision with root package name */
    public int f19461h0;

    /* renamed from: i, reason: collision with root package name */
    public final e5.t f19462i;

    /* renamed from: i0, reason: collision with root package name */
    public long f19463i0;

    /* renamed from: j, reason: collision with root package name */
    public final v f19464j;

    /* renamed from: k, reason: collision with root package name */
    public final m0 f19465k;

    /* renamed from: l, reason: collision with root package name */
    public final k3.f f19466l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f19467m;

    /* renamed from: n, reason: collision with root package name */
    public final b5.g1 f19468n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f19469o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f19470p;

    /* renamed from: q, reason: collision with root package name */
    public final r5.v f19471q;

    /* renamed from: r, reason: collision with root package name */
    public final j5.a f19472r;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f19473s;

    /* renamed from: t, reason: collision with root package name */
    public final v5.c f19474t;

    /* renamed from: u, reason: collision with root package name */
    public final long f19475u;

    /* renamed from: v, reason: collision with root package name */
    public final long f19476v;

    /* renamed from: w, reason: collision with root package name */
    public final e5.r f19477w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f19478x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f19479y;

    /* renamed from: z, reason: collision with root package name */
    public final b f19480z;

    static {
        b5.l0.a("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, i5.e0] */
    public g0(q qVar) {
        boolean z10;
        j5.d0 a10;
        b5.g gVar;
        b5.g gVar2;
        boolean z11;
        try {
            e5.m.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.1] [" + e5.x.f15054e + "]");
            this.f19454e = qVar.f19597a.getApplicationContext();
            this.f19472r = (j5.a) qVar.f19604h.apply(qVar.f19598b);
            this.Y = qVar.f19606j;
            this.V = qVar.f19608l;
            this.f19447a0 = false;
            this.D = qVar.f19615s;
            d0 d0Var = new d0(this);
            this.f19478x = d0Var;
            this.f19479y = new Object();
            Handler handler = new Handler(qVar.f19605i);
            f[] a11 = ((i1) qVar.f19599c.get()).a(handler, d0Var, d0Var, d0Var, d0Var);
            this.f19458g = a11;
            if (a11.length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            yk.j.H0(z10);
            this.f19460h = (u5.v) qVar.f19601e.get();
            this.f19471q = (r5.v) qVar.f19600d.get();
            this.f19474t = (v5.c) qVar.f19603g.get();
            this.f19470p = qVar.f19609m;
            this.K = qVar.f19610n;
            this.f19475u = qVar.f19611o;
            this.f19476v = qVar.f19612p;
            Looper looper = qVar.f19605i;
            this.f19473s = looper;
            e5.r rVar = qVar.f19598b;
            this.f19477w = rVar;
            this.f19456f = this;
            this.f19466l = new k3.f(looper, rVar, new v(this));
            this.f19467m = new CopyOnWriteArraySet();
            this.f19469o = new ArrayList();
            this.L = new r5.y0();
            this.f19448b = new u5.w(new h1[a11.length], new u5.s[a11.length], o1.f3561b, null);
            this.f19468n = new b5.g1();
            h.r0 r0Var = new h.r0(2);
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            for (int i10 = 0; i10 < 19; i10++) {
                r0Var.a(iArr[i10]);
            }
            this.f19460h.getClass();
            r0Var.a(29);
            b5.t c10 = r0Var.c();
            this.f19450c = new b5.w0(c10);
            h.r0 r0Var2 = new h.r0(2);
            for (int i11 = 0; i11 < c10.f3586a.size(); i11++) {
                r0Var2.a(c10.a(i11));
            }
            r0Var2.a(4);
            r0Var2.a(10);
            this.M = new b5.w0(r0Var2.c());
            this.f19462i = this.f19477w.a(this.f19473s, null);
            v vVar = new v(this);
            this.f19464j = vVar;
            this.f19459g0 = b1.i(this.f19448b);
            ((j5.w) this.f19472r).W(this.f19456f, this.f19473s);
            int i12 = e5.x.f15050a;
            if (i12 < 31) {
                a10 = new j5.d0();
            } else {
                a10 = b0.a(this.f19454e, this, qVar.f19616t);
            }
            this.f19465k = new m0(this.f19458g, this.f19460h, this.f19448b, (n0) qVar.f19602f.get(), this.f19474t, this.E, this.F, this.f19472r, this.K, qVar.f19613q, qVar.f19614r, false, this.f19473s, this.f19477w, vVar, a10);
            this.Z = 1.0f;
            this.E = 0;
            b5.n0 n0Var = b5.n0.I;
            this.N = n0Var;
            this.f19457f0 = n0Var;
            int i13 = -1;
            this.f19461h0 = -1;
            if (i12 < 21) {
                AudioTrack audioTrack = this.O;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.O.release();
                    gVar = null;
                    this.O = null;
                } else {
                    gVar = null;
                }
                if (this.O == null) {
                    this.O = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.X = this.O.getAudioSessionId();
            } else {
                gVar = null;
                AudioManager audioManager = (AudioManager) this.f19454e.getSystemService("audio");
                if (audioManager != null) {
                    i13 = audioManager.generateAudioSessionId();
                }
                this.X = i13;
            }
            this.f19449b0 = d5.c.f13920b;
            this.f19451c0 = true;
            j5.a aVar = this.f19472r;
            aVar.getClass();
            this.f19466l.a(aVar);
            v5.c cVar = this.f19474t;
            Handler handler2 = new Handler(this.f19473s);
            j5.a aVar2 = this.f19472r;
            v5.h hVar = (v5.h) cVar;
            hVar.getClass();
            aVar2.getClass();
            t9.c cVar2 = hVar.f37725b;
            cVar2.getClass();
            cVar2.A(aVar2);
            ((CopyOnWriteArrayList) cVar2.f35633b).add(new v5.b(handler2, aVar2));
            this.f19467m.add(this.f19478x);
            b bVar = new b(qVar.f19597a, handler, this.f19478x);
            this.f19480z = bVar;
            bVar.f(false);
            e eVar = new e(qVar.f19597a, handler, this.f19478x);
            this.A = eVar;
            if (qVar.f19607k) {
                gVar2 = this.Y;
            } else {
                gVar2 = gVar;
            }
            eVar.c(gVar2);
            o3 o3Var = new o3(qVar.f19597a, 1);
            this.B = o3Var;
            o3Var.e();
            o3 o3Var2 = new o3(qVar.f19597a, 2);
            this.C = o3Var2;
            o3Var2.e();
            n();
            this.f19455e0 = p1.f3567e;
            this.W = e5.q.f15039c;
            u5.v vVar2 = this.f19460h;
            b5.g gVar3 = this.Y;
            u5.p pVar = (u5.p) vVar2;
            synchronized (pVar.f36829c) {
                z11 = !pVar.f36835i.equals(gVar3);
                pVar.f36835i = gVar3;
            }
            if (z11) {
                pVar.g();
            }
            L(1, 10, Integer.valueOf(this.X));
            L(2, 10, Integer.valueOf(this.X));
            L(1, 3, this.Y);
            L(2, 4, Integer.valueOf(this.V));
            L(2, 5, 0);
            L(1, 9, Boolean.valueOf(this.f19447a0));
            L(2, 7, this.f19479y);
            L(6, 8, this.f19479y);
            this.f19452d.f();
        } catch (Throwable th2) {
            this.f19452d.f();
            throw th2;
        }
    }

    public static long C(b1 b1Var) {
        b5.h1 h1Var = new b5.h1();
        b5.g1 g1Var = new b5.g1();
        b1Var.f19362a.h(b1Var.f19363b.f3556a, g1Var);
        long j10 = b1Var.f19364c;
        if (j10 == -9223372036854775807L) {
            return b1Var.f19362a.n(g1Var.f3318c, h1Var, 0L).f3344m;
        }
        return g1Var.f3320e + j10;
    }

    public static b5.p n() {
        p2.m mVar = new p2.m(0);
        mVar.f30590c = 0;
        mVar.f30591d = 0;
        return new b5.p(mVar);
    }

    public final boolean A() {
        X();
        return this.f19459g0.f19373l;
    }

    public final int B() {
        X();
        return this.f19459g0.f19366e;
    }

    public final u5.i D() {
        X();
        return ((u5.p) this.f19460h).e();
    }

    public final boolean E() {
        X();
        return this.f19459g0.f19363b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [b5.o0] */
    public final b1 F(b1 b1Var, b5.i1 i1Var, Pair pair) {
        boolean z10;
        r5.w wVar;
        r5.e1 e1Var;
        u5.w wVar2;
        List list;
        long j10;
        if (!i1Var.q() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yk.j.E0(z10);
        b5.i1 i1Var2 = b1Var.f19362a;
        long p10 = p(b1Var);
        b1 h10 = b1Var.h(i1Var);
        if (i1Var.q()) {
            r5.w wVar3 = b1.f19361t;
            long F = e5.x.F(this.f19463i0);
            b1 b10 = h10.c(wVar3, F, F, F, 0L, r5.e1.f33145d, this.f19448b, lp.j1.f24998e).b(wVar3);
            b10.f19377p = b10.f19379r;
            return b10;
        }
        Object obj = h10.f19363b.f3556a;
        int i10 = e5.x.f15050a;
        boolean z11 = !obj.equals(pair.first);
        if (z11) {
            wVar = new b5.o0(pair.first);
        } else {
            wVar = h10.f19363b;
        }
        r5.w wVar4 = wVar;
        long longValue = ((Long) pair.second).longValue();
        long F2 = e5.x.F(p10);
        if (!i1Var2.q()) {
            F2 -= i1Var2.h(obj, this.f19468n).f3320e;
        }
        if (!z11 && longValue >= F2) {
            if (longValue == F2) {
                int b11 = i1Var.b(h10.f19372k.f3556a);
                if (b11 == -1 || i1Var.g(b11, this.f19468n, false).f3318c != i1Var.h(wVar4.f3556a, this.f19468n).f3318c) {
                    i1Var.h(wVar4.f3556a, this.f19468n);
                    if (wVar4.a()) {
                        j10 = this.f19468n.a(wVar4.f3557b, wVar4.f3558c);
                    } else {
                        j10 = this.f19468n.f3319d;
                    }
                    b1 b12 = h10.c(wVar4, h10.f19379r, h10.f19379r, h10.f19365d, j10 - h10.f19379r, h10.f19369h, h10.f19370i, h10.f19371j).b(wVar4);
                    b12.f19377p = j10;
                    return b12;
                }
                return h10;
            }
            yk.j.H0(!wVar4.a());
            long max = Math.max(0L, h10.f19378q - (longValue - F2));
            long j11 = h10.f19377p;
            if (h10.f19372k.equals(h10.f19363b)) {
                j11 = longValue + max;
            }
            b1 c10 = h10.c(wVar4, longValue, longValue, longValue, max, h10.f19369h, h10.f19370i, h10.f19371j);
            c10.f19377p = j11;
            return c10;
        }
        yk.j.H0(!wVar4.a());
        if (z11) {
            e1Var = r5.e1.f33145d;
        } else {
            e1Var = h10.f19369h;
        }
        r5.e1 e1Var2 = e1Var;
        if (z11) {
            wVar2 = this.f19448b;
        } else {
            wVar2 = h10.f19370i;
        }
        u5.w wVar5 = wVar2;
        if (z11) {
            lp.l0 l0Var = lp.o0.f25025b;
            list = lp.j1.f24998e;
        } else {
            list = h10.f19371j;
        }
        b1 b13 = h10.c(wVar4, longValue, longValue, longValue, 0L, e1Var2, wVar5, list).b(wVar4);
        b13.f19377p = longValue;
        return b13;
    }

    public final Pair G(b5.i1 i1Var, int i10, long j10) {
        if (i1Var.q()) {
            this.f19461h0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f19463i0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= i1Var.p()) {
            i10 = i1Var.a(this.F);
            j10 = e5.x.P(i1Var.n(i10, this.f3349a, 0L).f3344m);
        }
        return i1Var.j(this.f3349a, this.f19468n, i10, e5.x.F(j10));
    }

    public final void H(final int i10, final int i11) {
        e5.q qVar = this.W;
        if (i10 != qVar.f15040a || i11 != qVar.f15041b) {
            this.W = new e5.q(i10, i11);
            this.f19466l.l(24, new e5.j() { // from class: i5.y
                @Override // e5.j
                public final void invoke(Object obj) {
                    ((b5.y0) obj).K(i10, i11);
                }
            });
            L(2, 14, new e5.q(i10, i11));
        }
    }

    public final void I() {
        int i10;
        X();
        boolean A = A();
        int i11 = 2;
        int e10 = this.A.e(2, A);
        if (A && e10 != 1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        U(e10, i10, A);
        b1 b1Var = this.f19459g0;
        if (b1Var.f19366e != 1) {
            return;
        }
        b1 e11 = b1Var.e(null);
        if (e11.f19362a.q()) {
            i11 = 4;
        }
        b1 g10 = e11.g(i11);
        this.G++;
        e5.t tVar = this.f19465k.f19558h;
        tVar.getClass();
        e5.s b10 = e5.t.b();
        b10.f15042a = tVar.f15044a.obtainMessage(0);
        b10.b();
        V(g10, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void J(b5.y0 y0Var) {
        X();
        y0Var.getClass();
        k3.f fVar = this.f19466l;
        fVar.m();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) fVar.f21995f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e5.l lVar = (e5.l) it.next();
            if (lVar.f15021a.equals(y0Var)) {
                e5.k kVar = (e5.k) fVar.f21994e;
                lVar.f15024d = true;
                if (lVar.f15023c) {
                    lVar.f15023c = false;
                    kVar.e(lVar.f15021a, lVar.f15022b.c());
                }
                copyOnWriteArraySet.remove(lVar);
            }
        }
    }

    public final void K() {
        y5.k kVar = this.S;
        d0 d0Var = this.f19478x;
        if (kVar != null) {
            d1 o10 = o(this.f19479y);
            yk.j.H0(!o10.f19391g);
            o10.f19388d = SearchAuth.StatusCodes.AUTH_DISABLED;
            yk.j.H0(!o10.f19391g);
            o10.f19389e = null;
            o10.c();
            this.S.f41208a.remove(d0Var);
            this.S = null;
        }
        TextureView textureView = this.U;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != d0Var) {
                e5.m.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.U.setSurfaceTextureListener(null);
            }
            this.U = null;
        }
        SurfaceHolder surfaceHolder = this.R;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(d0Var);
            this.R = null;
        }
    }

    public final void L(int i10, int i11, Object obj) {
        for (f fVar : this.f19458g) {
            if (fVar.f19409b == i10) {
                d1 o10 = o(fVar);
                yk.j.H0(!o10.f19391g);
                o10.f19388d = i11;
                yk.j.H0(!o10.f19391g);
                o10.f19389e = obj;
                o10.c();
            }
        }
    }

    public final void M(SurfaceHolder surfaceHolder) {
        this.T = false;
        this.R = surfaceHolder;
        surfaceHolder.addCallback(this.f19478x);
        Surface surface = this.R.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.R.getSurfaceFrame();
            H(surfaceFrame.width(), surfaceFrame.height());
        } else {
            H(0, 0);
        }
    }

    public final void N(boolean z10) {
        X();
        int e10 = this.A.e(B(), z10);
        int i10 = 1;
        if (z10 && e10 != 1) {
            i10 = 2;
        }
        U(e10, i10, z10);
    }

    public final void O(b5.u0 u0Var) {
        X();
        if (this.f19459g0.f19375n.equals(u0Var)) {
            return;
        }
        b1 f10 = this.f19459g0.f(u0Var);
        this.G++;
        this.f19465k.f19558h.a(4, u0Var).b();
        V(f10, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void P(int i10) {
        X();
        if (this.E != i10) {
            this.E = i10;
            e5.t tVar = this.f19465k.f19558h;
            tVar.getClass();
            e5.s b10 = e5.t.b();
            b10.f15042a = tVar.f15044a.obtainMessage(11, i10, 0);
            b10.b();
            w wVar = new w(i10);
            k3.f fVar = this.f19466l;
            fVar.j(8, wVar);
            T();
            fVar.g();
        }
    }

    public final void Q(m1 m1Var) {
        X();
        u5.v vVar = this.f19460h;
        vVar.getClass();
        u5.p pVar = (u5.p) vVar;
        if (m1Var.equals(pVar.e())) {
            return;
        }
        if (m1Var instanceof u5.i) {
            pVar.j((u5.i) m1Var);
        }
        u5.h hVar = new u5.h(pVar.e());
        hVar.b(m1Var);
        pVar.j(new u5.i(hVar));
        this.f19466l.l(19, new b3.t(m1Var, 5));
    }

    public final void R(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (f fVar : this.f19458g) {
            if (fVar.f19409b == 2) {
                d1 o10 = o(fVar);
                yk.j.H0(!o10.f19391g);
                o10.f19388d = 1;
                yk.j.H0(true ^ o10.f19391g);
                o10.f19389e = obj;
                o10.c();
                arrayList.add(o10);
            }
        }
        Object obj2 = this.P;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d1) it.next()).a(this.D);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.P;
            Surface surface = this.Q;
            if (obj3 == surface) {
                surface.release();
                this.Q = null;
            }
        }
        this.P = obj;
        if (z10) {
            ExoPlaybackException exoPlaybackException = new ExoPlaybackException(2, 1003, new ExoTimeoutException(3));
            b1 b1Var = this.f19459g0;
            b1 b10 = b1Var.b(b1Var.f19363b);
            b10.f19377p = b10.f19379r;
            b10.f19378q = 0L;
            b1 e10 = b10.g(1).e(exoPlaybackException);
            this.G++;
            e5.t tVar = this.f19465k.f19558h;
            tVar.getClass();
            e5.s b11 = e5.t.b();
            b11.f15042a = tVar.f15044a.obtainMessage(6);
            b11.b();
            V(e10, 0, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void S(float f10) {
        X();
        final float h10 = e5.x.h(f10, s0.g.f34069a, 1.0f);
        if (this.Z == h10) {
            return;
        }
        this.Z = h10;
        L(1, 2, Float.valueOf(this.A.f19400g * h10));
        this.f19466l.l(22, new e5.j() { // from class: i5.z
            @Override // e5.j
            public final void invoke(Object obj) {
                ((b5.y0) obj).i(h10);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[LOOP:0: B:18:0x007c->B:20:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.g0.T():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void U(int i10, int i11, boolean z10) {
        ?? r15;
        int i12 = 0;
        if (z10 && i10 != -1) {
            r15 = 1;
        } else {
            r15 = 0;
        }
        if (r15 != 0 && i10 != 1) {
            i12 = 1;
        }
        b1 b1Var = this.f19459g0;
        if (b1Var.f19373l == r15 && b1Var.f19374m == i12) {
            return;
        }
        this.G++;
        boolean z11 = b1Var.f19376o;
        b1 b1Var2 = b1Var;
        if (z11) {
            b1Var2 = b1Var.a();
        }
        b1 d10 = b1Var2.d(i12, r15);
        e5.t tVar = this.f19465k.f19558h;
        tVar.getClass();
        e5.s b10 = e5.t.b();
        b10.f15042a = tVar.f15044a.obtainMessage(1, r15, i12);
        b10.b();
        V(d10, 0, i11, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(final i5.b1 r41, final int r42, final int r43, boolean r44, int r45, long r46, int r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.g0.V(i5.b1, int, int, boolean, int, long, int, boolean):void");
    }

    public final void W() {
        int B = B();
        o3 o3Var = this.C;
        o3 o3Var2 = this.B;
        boolean z10 = true;
        if (B != 1) {
            if (B != 2 && B != 3) {
                if (B != 4) {
                    throw new IllegalStateException();
                }
            } else {
                X();
                boolean z11 = this.f19459g0.f19376o;
                if (!A() || z11) {
                    z10 = false;
                }
                o3Var2.f(z10);
                o3Var.f(A());
                return;
            }
        }
        o3Var2.f(false);
        o3Var.f(false);
    }

    public final void X() {
        IllegalStateException illegalStateException;
        h.r0 r0Var = this.f19452d;
        synchronized (r0Var) {
            boolean z10 = false;
            while (!r0Var.f17735a) {
                try {
                    r0Var.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f19473s.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), this.f19473s.getThread().getName()};
            int i10 = e5.x.f15050a;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (!this.f19451c0) {
                if (this.f19453d0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e5.m.g("ExoPlayerImpl", format, illegalStateException);
                this.f19453d0 = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    @Override // b5.i
    public final void g(int i10, long j10, boolean z10) {
        boolean z11;
        X();
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        yk.j.E0(z11);
        j5.w wVar = (j5.w) this.f19472r;
        if (!wVar.f21019i) {
            j5.b Q = wVar.Q();
            wVar.f21019i = true;
            wVar.V(Q, -1, new j5.e(Q, 1));
        }
        b5.i1 i1Var = this.f19459g0.f19362a;
        if (!i1Var.q() && i10 >= i1Var.p()) {
            return;
        }
        this.G++;
        if (E()) {
            e5.m.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            j0 j0Var = new j0(this.f19459g0);
            j0Var.a(1);
            g0 g0Var = this.f19464j.f19654a;
            g0Var.f19462i.c(new h.m0(8, g0Var, j0Var));
            return;
        }
        b1 b1Var = this.f19459g0;
        int i11 = b1Var.f19366e;
        if (i11 == 3 || (i11 == 4 && !i1Var.q())) {
            b1Var = this.f19459g0.g(2);
        }
        int s7 = s();
        b1 F = F(b1Var, i1Var, G(i1Var, i10, j10));
        this.f19465k.f19558h.a(3, new l0(i1Var, i10, e5.x.F(j10))).b();
        V(F, 0, 1, true, 1, v(F), s7, z10);
    }

    public final b5.n0 l() {
        b5.i1 w10 = w();
        if (w10.q()) {
            return this.f19457f0;
        }
        b5.k0 k0Var = w10.n(s(), this.f3349a, 0L).f3334c;
        b5.m0 a10 = this.f19457f0.a();
        b5.n0 n0Var = k0Var.f3392d;
        if (n0Var != null) {
            CharSequence charSequence = n0Var.f3521a;
            if (charSequence != null) {
                a10.f3437a = charSequence;
            }
            CharSequence charSequence2 = n0Var.f3522b;
            if (charSequence2 != null) {
                a10.f3438b = charSequence2;
            }
            CharSequence charSequence3 = n0Var.f3523c;
            if (charSequence3 != null) {
                a10.f3439c = charSequence3;
            }
            CharSequence charSequence4 = n0Var.f3524d;
            if (charSequence4 != null) {
                a10.f3440d = charSequence4;
            }
            CharSequence charSequence5 = n0Var.f3525e;
            if (charSequence5 != null) {
                a10.f3441e = charSequence5;
            }
            CharSequence charSequence6 = n0Var.f3526f;
            if (charSequence6 != null) {
                a10.f3442f = charSequence6;
            }
            CharSequence charSequence7 = n0Var.f3527g;
            if (charSequence7 != null) {
                a10.f3443g = charSequence7;
            }
            b5.b1 b1Var = n0Var.f3528h;
            if (b1Var != null) {
                a10.f3444h = b1Var;
            }
            b5.b1 b1Var2 = n0Var.f3529i;
            if (b1Var2 != null) {
                a10.f3445i = b1Var2;
            }
            byte[] bArr = n0Var.f3530j;
            if (bArr != null) {
                a10.f3446j = (byte[]) bArr.clone();
                a10.f3447k = n0Var.f3531k;
            }
            Uri uri = n0Var.f3532l;
            if (uri != null) {
                a10.f3448l = uri;
            }
            Integer num = n0Var.f3533m;
            if (num != null) {
                a10.f3449m = num;
            }
            Integer num2 = n0Var.f3534n;
            if (num2 != null) {
                a10.f3450n = num2;
            }
            Integer num3 = n0Var.f3535o;
            if (num3 != null) {
                a10.f3451o = num3;
            }
            Boolean bool = n0Var.f3536p;
            if (bool != null) {
                a10.f3452p = bool;
            }
            Boolean bool2 = n0Var.f3537q;
            if (bool2 != null) {
                a10.f3453q = bool2;
            }
            Integer num4 = n0Var.f3538r;
            if (num4 != null) {
                a10.f3454r = num4;
            }
            Integer num5 = n0Var.f3539s;
            if (num5 != null) {
                a10.f3454r = num5;
            }
            Integer num6 = n0Var.f3540t;
            if (num6 != null) {
                a10.f3455s = num6;
            }
            Integer num7 = n0Var.f3541u;
            if (num7 != null) {
                a10.f3456t = num7;
            }
            Integer num8 = n0Var.f3542v;
            if (num8 != null) {
                a10.f3457u = num8;
            }
            Integer num9 = n0Var.f3543w;
            if (num9 != null) {
                a10.f3458v = num9;
            }
            Integer num10 = n0Var.f3544x;
            if (num10 != null) {
                a10.f3459w = num10;
            }
            CharSequence charSequence8 = n0Var.f3545y;
            if (charSequence8 != null) {
                a10.f3460x = charSequence8;
            }
            CharSequence charSequence9 = n0Var.f3546z;
            if (charSequence9 != null) {
                a10.f3461y = charSequence9;
            }
            CharSequence charSequence10 = n0Var.A;
            if (charSequence10 != null) {
                a10.f3462z = charSequence10;
            }
            Integer num11 = n0Var.B;
            if (num11 != null) {
                a10.A = num11;
            }
            Integer num12 = n0Var.C;
            if (num12 != null) {
                a10.B = num12;
            }
            CharSequence charSequence11 = n0Var.D;
            if (charSequence11 != null) {
                a10.C = charSequence11;
            }
            CharSequence charSequence12 = n0Var.E;
            if (charSequence12 != null) {
                a10.D = charSequence12;
            }
            CharSequence charSequence13 = n0Var.F;
            if (charSequence13 != null) {
                a10.E = charSequence13;
            }
            Integer num13 = n0Var.G;
            if (num13 != null) {
                a10.F = num13;
            }
            Bundle bundle = n0Var.H;
            if (bundle != null) {
                a10.G = bundle;
            }
        }
        return new b5.n0(a10);
    }

    public final void m() {
        X();
        K();
        R(null);
        H(0, 0);
    }

    public final d1 o(c1 c1Var) {
        int y10 = y(this.f19459g0);
        b5.i1 i1Var = this.f19459g0.f19362a;
        if (y10 == -1) {
            y10 = 0;
        }
        e5.r rVar = this.f19477w;
        m0 m0Var = this.f19465k;
        return new d1(m0Var, c1Var, i1Var, y10, rVar, m0Var.f19560j);
    }

    public final long p(b1 b1Var) {
        if (b1Var.f19363b.a()) {
            Object obj = b1Var.f19363b.f3556a;
            b5.i1 i1Var = b1Var.f19362a;
            b5.g1 g1Var = this.f19468n;
            i1Var.h(obj, g1Var);
            long j10 = b1Var.f19364c;
            if (j10 == -9223372036854775807L) {
                return e5.x.P(i1Var.n(y(b1Var), this.f3349a, 0L).f3344m);
            }
            return e5.x.P(g1Var.f3320e) + e5.x.P(j10);
        }
        return e5.x.P(v(b1Var));
    }

    public final int q() {
        X();
        if (E()) {
            return this.f19459g0.f19363b.f3557b;
        }
        return -1;
    }

    public final int r() {
        X();
        if (E()) {
            return this.f19459g0.f19363b.f3558c;
        }
        return -1;
    }

    public final int s() {
        X();
        int y10 = y(this.f19459g0);
        if (y10 == -1) {
            return 0;
        }
        return y10;
    }

    public final int t() {
        X();
        if (this.f19459g0.f19362a.q()) {
            return 0;
        }
        b1 b1Var = this.f19459g0;
        return b1Var.f19362a.b(b1Var.f19363b.f3556a);
    }

    public final long u() {
        X();
        return e5.x.P(v(this.f19459g0));
    }

    public final long v(b1 b1Var) {
        long j10;
        if (b1Var.f19362a.q()) {
            return e5.x.F(this.f19463i0);
        }
        if (b1Var.f19376o) {
            j10 = b1Var.j();
        } else {
            j10 = b1Var.f19379r;
        }
        if (b1Var.f19363b.a()) {
            return j10;
        }
        b5.i1 i1Var = b1Var.f19362a;
        Object obj = b1Var.f19363b.f3556a;
        b5.g1 g1Var = this.f19468n;
        i1Var.h(obj, g1Var);
        return j10 + g1Var.f3320e;
    }

    public final b5.i1 w() {
        X();
        return this.f19459g0.f19362a;
    }

    public final o1 x() {
        X();
        return this.f19459g0.f19370i.f36850d;
    }

    public final int y(b1 b1Var) {
        if (b1Var.f19362a.q()) {
            return this.f19461h0;
        }
        return b1Var.f19362a.h(b1Var.f19363b.f3556a, this.f19468n).f3318c;
    }

    public final long z() {
        X();
        if (E()) {
            b1 b1Var = this.f19459g0;
            r5.w wVar = b1Var.f19363b;
            b5.i1 i1Var = b1Var.f19362a;
            Object obj = wVar.f3556a;
            b5.g1 g1Var = this.f19468n;
            i1Var.h(obj, g1Var);
            return e5.x.P(g1Var.a(wVar.f3557b, wVar.f3558c));
        }
        return a();
    }
}
