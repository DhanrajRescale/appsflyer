package i5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class m0 implements Handler.Callback, r5.t, k {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public l0 J;
    public long X;
    public int Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final f[] f19549a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f19550b;

    /* renamed from: c, reason: collision with root package name */
    public final f[] f19551c;

    /* renamed from: d, reason: collision with root package name */
    public final u5.v f19552d;

    /* renamed from: e, reason: collision with root package name */
    public final u5.w f19553e;

    /* renamed from: e0, reason: collision with root package name */
    public ExoPlaybackException f19554e0;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f19555f;

    /* renamed from: f0, reason: collision with root package name */
    public long f19556f0 = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public final v5.c f19557g;

    /* renamed from: h, reason: collision with root package name */
    public final e5.t f19558h;

    /* renamed from: i, reason: collision with root package name */
    public final HandlerThread f19559i;

    /* renamed from: j, reason: collision with root package name */
    public final Looper f19560j;

    /* renamed from: k, reason: collision with root package name */
    public final b5.h1 f19561k;

    /* renamed from: l, reason: collision with root package name */
    public final b5.g1 f19562l;

    /* renamed from: m, reason: collision with root package name */
    public final long f19563m;

    /* renamed from: n, reason: collision with root package name */
    public final l f19564n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f19565o;

    /* renamed from: p, reason: collision with root package name */
    public final e5.b f19566p;

    /* renamed from: q, reason: collision with root package name */
    public final v f19567q;

    /* renamed from: r, reason: collision with root package name */
    public final r0 f19568r;

    /* renamed from: s, reason: collision with root package name */
    public final a1 f19569s;

    /* renamed from: t, reason: collision with root package name */
    public final i f19570t;

    /* renamed from: u, reason: collision with root package name */
    public final long f19571u;

    /* renamed from: v, reason: collision with root package name */
    public j1 f19572v;

    /* renamed from: w, reason: collision with root package name */
    public b1 f19573w;

    /* renamed from: x, reason: collision with root package name */
    public j0 f19574x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19575y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19576z;

    public m0(f[] fVarArr, u5.v vVar, u5.w wVar, n0 n0Var, v5.c cVar, int i10, boolean z10, j5.a aVar, j1 j1Var, i iVar, long j10, boolean z11, Looper looper, e5.b bVar, v vVar2, j5.d0 d0Var) {
        this.f19567q = vVar2;
        this.f19549a = fVarArr;
        this.f19552d = vVar;
        this.f19553e = wVar;
        this.f19555f = n0Var;
        this.f19557g = cVar;
        this.D = i10;
        this.E = z10;
        this.f19572v = j1Var;
        this.f19570t = iVar;
        this.f19571u = j10;
        this.f19576z = z11;
        this.f19566p = bVar;
        this.f19563m = ((j) n0Var).f19514g;
        b1 i11 = b1.i(wVar);
        this.f19573w = i11;
        this.f19574x = new j0(i11);
        this.f19551c = new f[fVarArr.length];
        u5.p pVar = (u5.p) vVar;
        pVar.getClass();
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            f fVar = fVarArr[i12];
            fVar.f19412e = i12;
            fVar.f19413f = d0Var;
            this.f19551c[i12] = fVar;
            synchronized (fVar.f19408a) {
                fVar.f19421n = pVar;
            }
        }
        this.f19564n = new l(this, bVar);
        this.f19565o = new ArrayList();
        this.f19550b = Collections.newSetFromMap(new IdentityHashMap());
        this.f19561k = new b5.h1();
        this.f19562l = new b5.g1();
        vVar.f36845a = this;
        vVar.f36846b = cVar;
        this.Z = true;
        e5.r rVar = (e5.r) bVar;
        e5.t a10 = rVar.a(looper, null);
        this.f19568r = new r0(aVar, a10);
        this.f19569s = new a1(this, aVar, a10, d0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f19559i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f19560j = looper2;
        this.f19558h = rVar.a(looper2, this);
    }

    public static Pair E(b5.i1 i1Var, l0 l0Var, boolean z10, int i10, boolean z11, b5.h1 h1Var, b5.g1 g1Var) {
        b5.i1 i1Var2;
        Pair j10;
        Object F;
        b5.i1 i1Var3 = l0Var.f19544a;
        if (i1Var.q()) {
            return null;
        }
        if (i1Var3.q()) {
            i1Var2 = i1Var;
        } else {
            i1Var2 = i1Var3;
        }
        try {
            j10 = i1Var2.j(h1Var, g1Var, l0Var.f19545b, l0Var.f19546c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (i1Var.equals(i1Var2)) {
            return j10;
        }
        if (i1Var.b(j10.first) != -1) {
            if (i1Var2.h(j10.first, g1Var).f3321f && i1Var2.n(g1Var.f3318c, h1Var, 0L).f3346o == i1Var2.b(j10.first)) {
                return i1Var.j(h1Var, g1Var, i1Var.h(j10.first, g1Var).f3318c, l0Var.f19546c);
            }
            return j10;
        }
        if (z10 && (F = F(h1Var, g1Var, i10, z11, j10.first, i1Var2, i1Var)) != null) {
            return i1Var.j(h1Var, g1Var, i1Var.h(F, g1Var).f3318c, -9223372036854775807L);
        }
        return null;
    }

    public static Object F(b5.h1 h1Var, b5.g1 g1Var, int i10, boolean z10, Object obj, b5.i1 i1Var, b5.i1 i1Var2) {
        int b10 = i1Var.b(obj);
        int i11 = i1Var.i();
        int i12 = b10;
        int i13 = -1;
        for (int i14 = 0; i14 < i11 && i13 == -1; i14++) {
            i12 = i1Var.d(i12, g1Var, h1Var, i10, z10);
            if (i12 == -1) {
                break;
            }
            i13 = i1Var2.b(i1Var.m(i12));
        }
        if (i13 == -1) {
            return null;
        }
        return i1Var2.m(i13);
    }

    public static void K(f fVar, long j10) {
        fVar.f19419l = true;
        if (fVar instanceof t5.f) {
            t5.f fVar2 = (t5.f) fVar;
            yk.j.H0(fVar2.f19419l);
            fVar2.C = j10;
        }
    }

    public static boolean q(f fVar) {
        if (fVar.f19414g != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0132  */
    /* JADX WARN: Type inference failed for: r5v17, types: [b5.o0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.m0.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        boolean z10;
        p0 p0Var = this.f19568r.f19634h;
        if (p0Var != null && p0Var.f19587f.f19625h && this.f19576z) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.A = z10;
    }

    public final void C(long j10) {
        long j11;
        p0 p0Var = this.f19568r.f19634h;
        if (p0Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = p0Var.f19596o;
        }
        long j12 = j10 + j11;
        this.X = j12;
        this.f19564n.f19538a.c(j12);
        for (f fVar : this.f19549a) {
            if (q(fVar)) {
                long j13 = this.X;
                fVar.f19419l = false;
                fVar.f19418k = j13;
                fVar.q(j13, false);
            }
        }
        for (p0 p0Var2 = r0.f19634h; p0Var2 != null; p0Var2 = p0Var2.f19593l) {
            for (u5.s sVar : p0Var2.f19595n.f36849c) {
                if (sVar != null) {
                    sVar.q();
                }
            }
        }
    }

    public final void D(b5.i1 i1Var, b5.i1 i1Var2) {
        if (i1Var.q() && i1Var2.q()) {
            return;
        }
        ArrayList arrayList = this.f19565o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a3.a.u(arrayList.get(size));
            throw null;
        }
    }

    public final void G(boolean z10) {
        r5.w wVar = this.f19568r.f19634h.f19587f.f19618a;
        long I = I(wVar, this.f19573w.f19379r, true, false);
        if (I != this.f19573w.f19379r) {
            b1 b1Var = this.f19573w;
            this.f19573w = o(wVar, I, b1Var.f19364c, b1Var.f19365d, z10, 5);
        }
    }

    public final void H(l0 l0Var) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        boolean z11;
        r5.w wVar;
        long j13;
        long j14;
        long j15;
        boolean z12;
        boolean z13;
        long j16;
        long j17;
        b1 b1Var;
        int i10;
        boolean z14 = true;
        this.f19574x.a(1);
        Pair E = E(this.f19573w.f19362a, l0Var, true, this.D, this.E, this.f19561k, this.f19562l);
        if (E == null) {
            Pair h10 = h(this.f19573w.f19362a);
            wVar = (r5.w) h10.first;
            long longValue = ((Long) h10.second).longValue();
            z11 = !this.f19573w.f19362a.q();
            j11 = longValue;
            j12 = -9223372036854775807L;
        } else {
            Object obj = E.first;
            long longValue2 = ((Long) E.second).longValue();
            if (l0Var.f19546c == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = longValue2;
            }
            r5.w n10 = this.f19568r.n(this.f19573w.f19362a, obj, longValue2);
            if (n10.a()) {
                this.f19573w.f19362a.h(n10.f3556a, this.f19562l);
                if (this.f19562l.f(n10.f3557b) == n10.f3558c) {
                    j13 = this.f19562l.f3322g.f3212c;
                } else {
                    j13 = 0;
                }
                j11 = j13;
                j12 = j10;
                wVar = n10;
                z11 = true;
            } else {
                if (l0Var.f19546c == -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j11 = longValue2;
                j12 = j10;
                z11 = z10;
                wVar = n10;
            }
        }
        try {
            if (this.f19573w.f19362a.q()) {
                this.J = l0Var;
            } else if (E == null) {
                if (this.f19573w.f19366e != 1) {
                    U(4);
                }
                A(false, true, false, true);
            } else {
                if (wVar.equals(this.f19573w.f19363b)) {
                    p0 p0Var = this.f19568r.f19634h;
                    if (p0Var != null && p0Var.f19585d && j11 != 0) {
                        j17 = p0Var.f19582a.g(j11, this.f19572v);
                    } else {
                        j17 = j11;
                    }
                    if (e5.x.P(j17) == e5.x.P(this.f19573w.f19379r) && ((i10 = (b1Var = this.f19573w).f19366e) == 2 || i10 == 3)) {
                        long j18 = b1Var.f19379r;
                        this.f19573w = o(wVar, j18, j12, j18, z11, 2);
                        return;
                    }
                    j15 = j17;
                } else {
                    j15 = j11;
                }
                if (this.f19573w.f19366e == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r0 r0Var = this.f19568r;
                if (r0Var.f19634h != r0Var.f19635i) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                long I = I(wVar, j15, z13, z12);
                if (j11 == I) {
                    z14 = false;
                }
                z11 |= z14;
                try {
                    b1 b1Var2 = this.f19573w;
                    b5.i1 i1Var = b1Var2.f19362a;
                    d0(i1Var, wVar, i1Var, b1Var2.f19363b, j12, true);
                    j16 = I;
                    this.f19573w = o(wVar, j16, j12, j16, z11, 2);
                } catch (Throwable th2) {
                    th = th2;
                    j14 = I;
                    this.f19573w = o(wVar, j14, j12, j14, z11, 2);
                    throw th;
                }
            }
            j16 = j11;
            this.f19573w = o(wVar, j16, j12, j16, z11, 2);
        } catch (Throwable th3) {
            th = th3;
            j14 = j11;
        }
    }

    public final long I(r5.w wVar, long j10, boolean z10, boolean z11) {
        Z();
        this.B = false;
        if (z11 || this.f19573w.f19366e == 3) {
            U(2);
        }
        r0 r0Var = this.f19568r;
        p0 p0Var = r0Var.f19634h;
        p0 p0Var2 = p0Var;
        while (p0Var2 != null && !wVar.equals(p0Var2.f19587f.f19618a)) {
            p0Var2 = p0Var2.f19593l;
        }
        if (z10 || p0Var != p0Var2 || (p0Var2 != null && p0Var2.f19596o + j10 < 0)) {
            f[] fVarArr = this.f19549a;
            for (f fVar : fVarArr) {
                d(fVar);
            }
            if (p0Var2 != null) {
                while (r0Var.f19634h != p0Var2) {
                    r0Var.a();
                }
                r0Var.l(p0Var2);
                p0Var2.f19596o = 1000000000000L;
                f(new boolean[fVarArr.length]);
            }
        }
        if (p0Var2 != null) {
            r0Var.l(p0Var2);
            if (!p0Var2.f19585d) {
                p0Var2.f19587f = p0Var2.f19587f.b(j10);
            } else if (p0Var2.f19586e) {
                r5.u uVar = p0Var2.f19582a;
                j10 = uVar.q(j10);
                uVar.r(j10 - this.f19563m);
            }
            C(j10);
            s();
        } else {
            r0Var.b();
            C(j10);
        }
        k(false);
        this.f19558h.d(2);
        return j10;
    }

    public final void J(d1 d1Var) {
        Looper looper = d1Var.f19390f;
        if (!looper.getThread().isAlive()) {
            e5.m.f("TAG", "Trying to send message on a dead thread.");
            d1Var.b(false);
        } else {
            ((e5.r) this.f19566p).a(looper, null).c(new h.m0(9, this, d1Var));
        }
    }

    public final void L(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.F != z10) {
            this.F = z10;
            if (!z10) {
                for (f fVar : this.f19549a) {
                    if (!q(fVar) && this.f19550b.remove(fVar)) {
                        fVar.z();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void M(i0 i0Var) {
        this.f19574x.a(1);
        int i10 = i0Var.f19506c;
        r5.y0 y0Var = i0Var.f19505b;
        List list = i0Var.f19504a;
        if (i10 != -1) {
            this.J = new l0(new f1(list, y0Var), i0Var.f19506c, i0Var.f19507d);
        }
        a1 a1Var = this.f19569s;
        ArrayList arrayList = a1Var.f19346b;
        a1Var.g(0, arrayList.size());
        l(a1Var.a(arrayList.size(), list, y0Var), false);
    }

    public final void N(boolean z10) {
        if (z10 == this.H) {
            return;
        }
        this.H = z10;
        if (!z10 && this.f19573w.f19376o) {
            this.f19558h.d(2);
        }
    }

    public final void O(boolean z10) {
        this.f19576z = z10;
        B();
        if (this.A) {
            r0 r0Var = this.f19568r;
            if (r0Var.f19635i != r0Var.f19634h) {
                G(true);
                k(false);
            }
        }
    }

    public final void P(int i10, int i11, boolean z10, boolean z11) {
        this.f19574x.a(z11 ? 1 : 0);
        j0 j0Var = this.f19574x;
        j0Var.f19517a = true;
        j0Var.f19522f = true;
        j0Var.f19523g = i11;
        this.f19573w = this.f19573w.d(i10, z10);
        this.B = false;
        for (p0 p0Var = this.f19568r.f19634h; p0Var != null; p0Var = p0Var.f19593l) {
            for (u5.s sVar : p0Var.f19595n.f36849c) {
                if (sVar != null) {
                    sVar.f(z10);
                }
            }
        }
        if (!V()) {
            Z();
            c0();
            return;
        }
        int i12 = this.f19573w.f19366e;
        e5.t tVar = this.f19558h;
        if (i12 == 3) {
            X();
            tVar.d(2);
        } else if (i12 == 2) {
            tVar.d(2);
        }
    }

    public final void Q(b5.u0 u0Var) {
        this.f19558h.f15044a.removeMessages(16);
        l lVar = this.f19564n;
        lVar.a(u0Var);
        b5.u0 d10 = lVar.d();
        n(d10, d10.f3617a, true, true);
    }

    public final void R(int i10) {
        this.D = i10;
        b5.i1 i1Var = this.f19573w.f19362a;
        r0 r0Var = this.f19568r;
        r0Var.f19632f = i10;
        if (!r0Var.o(i1Var)) {
            G(true);
        }
        k(false);
    }

    public final void S(boolean z10) {
        this.E = z10;
        b5.i1 i1Var = this.f19573w.f19362a;
        r0 r0Var = this.f19568r;
        r0Var.f19633g = z10;
        if (!r0Var.o(i1Var)) {
            G(true);
        }
        k(false);
    }

    public final void T(r5.y0 y0Var) {
        this.f19574x.a(1);
        a1 a1Var = this.f19569s;
        int size = a1Var.f19346b.size();
        if (y0Var.f33333b.length != size) {
            y0Var = new r5.y0(new Random(y0Var.f33332a.nextLong())).a(size);
        }
        a1Var.f19354j = y0Var;
        l(a1Var.b(), false);
    }

    public final void U(int i10) {
        b1 b1Var = this.f19573w;
        if (b1Var.f19366e != i10) {
            if (i10 != 2) {
                this.f19556f0 = -9223372036854775807L;
            }
            this.f19573w = b1Var.g(i10);
        }
    }

    public final boolean V() {
        b1 b1Var = this.f19573w;
        if (b1Var.f19373l && b1Var.f19374m == 0) {
            return true;
        }
        return false;
    }

    public final boolean W(b5.i1 i1Var, r5.w wVar) {
        if (wVar.a() || i1Var.q()) {
            return false;
        }
        int i10 = i1Var.h(wVar.f3556a, this.f19562l).f3318c;
        b5.h1 h1Var = this.f19561k;
        i1Var.o(i10, h1Var);
        if (!h1Var.a() || !h1Var.f3340i || h1Var.f3337f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final void X() {
        boolean z10;
        this.B = false;
        l lVar = this.f19564n;
        lVar.f19543f = true;
        lVar.f19538a.e();
        for (f fVar : this.f19549a) {
            if (q(fVar)) {
                if (fVar.f19414g == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yk.j.H0(z10);
                fVar.f19414g = 2;
                fVar.t();
            }
        }
    }

    public final void Y(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.F) {
            z12 = false;
        } else {
            z12 = true;
        }
        A(z12, false, true, false);
        this.f19574x.a(z11 ? 1 : 0);
        ((j) this.f19555f).b(true);
        U(1);
    }

    public final void Z() {
        int i10;
        boolean z10;
        l lVar = this.f19564n;
        lVar.f19543f = false;
        k1 k1Var = lVar.f19538a;
        if (k1Var.f19534b) {
            k1Var.c(k1Var.b());
            k1Var.f19534b = false;
        }
        for (f fVar : this.f19549a) {
            if (q(fVar) && (i10 = fVar.f19414g) == 2) {
                if (i10 == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yk.j.H0(z10);
                fVar.f19414g = 1;
                fVar.u();
            }
        }
    }

    @Override // r5.t
    public final void a(r5.u uVar) {
        this.f19558h.a(8, uVar).b();
    }

    public final void a0() {
        boolean z10;
        p0 p0Var = this.f19568r.f19636j;
        if (!this.C && (p0Var == null || !p0Var.f19582a.u())) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        b1 b1Var = this.f19573w;
        if (z11 != b1Var.f19368g) {
            this.f19573w = new b1(b1Var.f19362a, b1Var.f19363b, b1Var.f19364c, b1Var.f19365d, b1Var.f19366e, b1Var.f19367f, z11, b1Var.f19369h, b1Var.f19370i, b1Var.f19371j, b1Var.f19372k, b1Var.f19373l, b1Var.f19374m, b1Var.f19375n, b1Var.f19377p, b1Var.f19378q, b1Var.f19379r, b1Var.f19380s, b1Var.f19376o);
        }
    }

    @Override // r5.w0
    public final void b(r5.x0 x0Var) {
        this.f19558h.a(9, (r5.u) x0Var).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0023. Please report as an issue. */
    public final void b0(u5.w wVar) {
        b5.i1 i1Var = this.f19573w.f19362a;
        u5.s[] sVarArr = wVar.f36849c;
        j jVar = (j) this.f19555f;
        int i10 = jVar.f19513f;
        boolean z10 = false;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                f[] fVarArr = this.f19549a;
                int i13 = 13107200;
                if (i11 < fVarArr.length) {
                    if (sVarArr[i11] != null) {
                        switch (fVarArr[i11].f19409b) {
                            case -2:
                                i13 = 0;
                                i12 += i13;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i13 = 144310272;
                                i12 += i13;
                                break;
                            case 1:
                                i12 += i13;
                                break;
                            case 2:
                                i13 = 131072000;
                                i12 += i13;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i13 = 131072;
                                i12 += i13;
                                break;
                        }
                    }
                    i11++;
                } else {
                    i10 = Math.max(13107200, i12);
                }
            }
        }
        jVar.f19515h = i10;
        v5.e eVar = jVar.f19508a;
        synchronized (eVar) {
            if (i10 < eVar.f37707c) {
                z10 = true;
            }
            eVar.f37707c = i10;
            if (z10) {
                eVar.a();
            }
        }
    }

    public final void c(i0 i0Var, int i10) {
        this.f19574x.a(1);
        a1 a1Var = this.f19569s;
        if (i10 == -1) {
            i10 = a1Var.f19346b.size();
        }
        l(a1Var.a(i10, i0Var.f19504a, i0Var.f19505b), false);
    }

    public final void c0() {
        long j10;
        boolean z10;
        long max;
        long max2;
        float f10;
        p0 p0Var = this.f19568r.f19634h;
        if (p0Var == null) {
            return;
        }
        if (p0Var.f19585d) {
            j10 = p0Var.f19582a.w();
        } else {
            j10 = -9223372036854775807L;
        }
        if (j10 != -9223372036854775807L) {
            C(j10);
            if (j10 != this.f19573w.f19379r) {
                b1 b1Var = this.f19573w;
                this.f19573w = o(b1Var.f19363b, j10, b1Var.f19364c, j10, true, 5);
            }
        } else {
            l lVar = this.f19564n;
            if (p0Var != this.f19568r.f19635i) {
                z10 = true;
            } else {
                z10 = false;
            }
            f fVar = lVar.f19540c;
            k1 k1Var = lVar.f19538a;
            if (fVar != null && !fVar.m() && (lVar.f19540c.n() || (!z10 && !lVar.f19540c.l()))) {
                o0 o0Var = lVar.f19541d;
                o0Var.getClass();
                long b10 = o0Var.b();
                if (lVar.f19542e) {
                    if (b10 < k1Var.b()) {
                        if (k1Var.f19534b) {
                            k1Var.c(k1Var.b());
                            k1Var.f19534b = false;
                        }
                    } else {
                        lVar.f19542e = false;
                        if (lVar.f19543f) {
                            k1Var.e();
                        }
                    }
                }
                k1Var.c(b10);
                b5.u0 d10 = o0Var.d();
                if (!d10.equals(k1Var.f19537e)) {
                    k1Var.a(d10);
                    ((m0) lVar.f19539b).f19558h.a(16, d10).b();
                }
            } else {
                lVar.f19542e = true;
                if (lVar.f19543f) {
                    k1Var.e();
                }
            }
            long b11 = lVar.b();
            this.X = b11;
            long j11 = b11 - p0Var.f19596o;
            long j12 = this.f19573w.f19379r;
            if (!this.f19565o.isEmpty() && !this.f19573w.f19363b.a()) {
                if (this.Z) {
                    this.Z = false;
                }
                b1 b1Var2 = this.f19573w;
                b1Var2.f19362a.b(b1Var2.f19363b.f3556a);
                int min = Math.min(this.Y, this.f19565o.size());
                if (min > 0) {
                    a3.a.u(this.f19565o.get(min - 1));
                }
                if (min < this.f19565o.size()) {
                    a3.a.u(this.f19565o.get(min));
                }
                this.Y = min;
            }
            b1 b1Var3 = this.f19573w;
            b1Var3.f19379r = j11;
            b1Var3.f19380s = SystemClock.elapsedRealtime();
        }
        this.f19573w.f19377p = this.f19568r.f19636j.d();
        b1 b1Var4 = this.f19573w;
        long j13 = b1Var4.f19377p;
        p0 p0Var2 = this.f19568r.f19636j;
        if (p0Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j13 - (this.X - p0Var2.f19596o));
        }
        b1Var4.f19378q = max;
        b1 b1Var5 = this.f19573w;
        if (b1Var5.f19373l && b1Var5.f19366e == 3 && W(b1Var5.f19362a, b1Var5.f19363b)) {
            b1 b1Var6 = this.f19573w;
            if (b1Var6.f19375n.f3617a == 1.0f) {
                i iVar = this.f19570t;
                long g10 = g(b1Var6.f19362a, b1Var6.f19363b.f3556a, b1Var6.f19379r);
                long j14 = this.f19573w.f19377p;
                p0 p0Var3 = this.f19568r.f19636j;
                if (p0Var3 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0L, j14 - (this.X - p0Var3.f19596o));
                }
                if (iVar.f19492d == -9223372036854775807L) {
                    f10 = 1.0f;
                } else {
                    long j15 = g10 - max2;
                    long j16 = iVar.f19502n;
                    if (j16 == -9223372036854775807L) {
                        iVar.f19502n = j15;
                        iVar.f19503o = 0L;
                    } else {
                        float f11 = iVar.f19491c;
                        float f12 = ((float) j16) * f11;
                        float f13 = 1.0f - f11;
                        iVar.f19502n = Math.max(j15, (((float) j15) * f13) + f12);
                        iVar.f19503o = (f13 * ((float) Math.abs(j15 - r4))) + (f11 * ((float) iVar.f19503o));
                    }
                    if (iVar.f19501m != -9223372036854775807L && SystemClock.elapsedRealtime() - iVar.f19501m < 1000) {
                        f10 = iVar.f19500l;
                    } else {
                        iVar.f19501m = SystemClock.elapsedRealtime();
                        long j17 = (iVar.f19503o * 3) + iVar.f19502n;
                        if (iVar.f19497i > j17) {
                            float F = (float) e5.x.F(1000L);
                            long[] jArr = {j17, iVar.f19494f, iVar.f19497i - (((iVar.f19500l - 1.0f) * F) + ((iVar.f19498j - 1.0f) * F))};
                            long j18 = j17;
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j19 = jArr[i10];
                                if (j19 > j18) {
                                    j18 = j19;
                                }
                            }
                            iVar.f19497i = j18;
                        } else {
                            long j20 = e5.x.j(g10 - (Math.max(s0.g.f34069a, iVar.f19500l - 1.0f) / 1.0E-7f), iVar.f19497i, j17);
                            iVar.f19497i = j20;
                            long j21 = iVar.f19496h;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                iVar.f19497i = j21;
                            }
                        }
                        long j22 = g10 - iVar.f19497i;
                        if (Math.abs(j22) < iVar.f19489a) {
                            iVar.f19500l = 1.0f;
                        } else {
                            iVar.f19500l = e5.x.h((1.0E-7f * ((float) j22)) + 1.0f, iVar.f19499k, iVar.f19498j);
                        }
                        f10 = iVar.f19500l;
                    }
                }
                if (this.f19564n.d().f3617a != f10) {
                    b5.u0 u0Var = new b5.u0(f10, this.f19573w.f19375n.f3618b);
                    this.f19558h.f15044a.removeMessages(16);
                    this.f19564n.a(u0Var);
                    n(this.f19573w.f19375n, this.f19564n.d().f3617a, false, false);
                }
            }
        }
    }

    public final void d(f fVar) {
        boolean z10;
        boolean z11;
        int i10 = fVar.f19414g;
        if (i10 != 0) {
            l lVar = this.f19564n;
            if (fVar == lVar.f19540c) {
                lVar.f19541d = null;
                lVar.f19540c = null;
                lVar.f19542e = true;
            }
            if (i10 == 2) {
                if (i10 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yk.j.H0(z11);
                fVar.f19414g = 1;
                fVar.u();
            }
            if (fVar.f19414g == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            yk.j.H0(z10);
            fVar.f19410c.m();
            fVar.f19414g = 0;
            fVar.f19415h = null;
            fVar.f19416i = null;
            fVar.f19419l = false;
            fVar.o();
            this.I--;
        }
    }

    public final void d0(b5.i1 i1Var, r5.w wVar, b5.i1 i1Var2, r5.w wVar2, long j10, boolean z10) {
        Object obj;
        b5.u0 u0Var;
        if (!W(i1Var, wVar)) {
            if (wVar.a()) {
                u0Var = b5.u0.f3616d;
            } else {
                u0Var = this.f19573w.f19375n;
            }
            l lVar = this.f19564n;
            if (!lVar.d().equals(u0Var)) {
                this.f19558h.f15044a.removeMessages(16);
                lVar.a(u0Var);
                n(this.f19573w.f19375n, u0Var.f3617a, false, false);
                return;
            }
            return;
        }
        Object obj2 = wVar.f3556a;
        b5.g1 g1Var = this.f19562l;
        int i10 = i1Var.h(obj2, g1Var).f3318c;
        b5.h1 h1Var = this.f19561k;
        i1Var.o(i10, h1Var);
        b5.e0 e0Var = h1Var.f3342k;
        int i11 = e5.x.f15050a;
        i iVar = this.f19570t;
        iVar.getClass();
        iVar.f19492d = e5.x.F(e0Var.f3266a);
        iVar.f19495g = e5.x.F(e0Var.f3267b);
        iVar.f19496h = e5.x.F(e0Var.f3268c);
        float f10 = e0Var.f3269d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        iVar.f19499k = f10;
        float f11 = e0Var.f3270e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        iVar.f19498j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            iVar.f19492d = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.f19493e = g(i1Var, obj2, j10);
            iVar.a();
            return;
        }
        Object obj3 = h1Var.f3332a;
        if (!i1Var2.q()) {
            obj = i1Var2.n(i1Var2.h(wVar2.f3556a, g1Var).f3318c, h1Var, 0L).f3332a;
        } else {
            obj = null;
        }
        if (!e5.x.a(obj, obj3) || z10) {
            iVar.f19493e = -9223372036854775807L;
            iVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x047b, code lost:
    
        if (r() != false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0535, code lost:
    
        if (r0 >= r7.f19515h) goto L291;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ef A[EDGE_INSN: B:74:0x02ef->B:75:0x02ef BREAK  A[LOOP:0: B:42:0x028f->B:53:0x02ec], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.m0.e():void");
    }

    public final synchronized void e0(o oVar, long j10) {
        ((e5.r) this.f19566p).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) oVar.get()).booleanValue() && j10 > 0) {
            try {
                this.f19566p.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            ((e5.r) this.f19566p).getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final void f(boolean[] zArr) {
        f[] fVarArr;
        Set set;
        r0 r0Var;
        p0 p0Var;
        int i10;
        f[] fVarArr2;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        o0 o0Var;
        r0 r0Var2 = this.f19568r;
        p0 p0Var2 = r0Var2.f19635i;
        u5.w wVar = p0Var2.f19595n;
        int i12 = 0;
        while (true) {
            fVarArr = this.f19549a;
            int length = fVarArr.length;
            set = this.f19550b;
            if (i12 >= length) {
                break;
            }
            if (!wVar.b(i12) && set.remove(fVarArr[i12])) {
                fVarArr[i12].z();
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < fVarArr.length) {
            if (wVar.b(i13)) {
                boolean z15 = zArr[i13];
                f fVar = fVarArr[i13];
                if (!q(fVar)) {
                    p0 p0Var3 = r0Var2.f19635i;
                    if (p0Var3 == r0Var2.f19634h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u5.w wVar2 = p0Var3.f19595n;
                    h1 h1Var = wVar2.f36848b[i13];
                    u5.s sVar = wVar2.f36849c[i13];
                    if (sVar != null) {
                        i11 = sVar.length();
                    } else {
                        i11 = 0;
                    }
                    b5.v[] vVarArr = new b5.v[i11];
                    for (int i14 = 0; i14 < i11; i14++) {
                        vVarArr[i14] = sVar.g(i14);
                    }
                    if (V() && this.f19573w.f19366e == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z15 && z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.I++;
                    set.add(fVar);
                    r5.v0 v0Var = p0Var3.f19584c[i13];
                    r0Var = r0Var2;
                    p0Var = p0Var2;
                    long j10 = this.X;
                    long e10 = p0Var3.e();
                    i10 = i13;
                    fVarArr2 = fVarArr;
                    long j11 = p0Var3.f19596o;
                    if (fVar.f19414g == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    yk.j.H0(z13);
                    fVar.f19411d = h1Var;
                    fVar.f19414g = 1;
                    fVar.p(z12, z10);
                    fVar.y(vVarArr, v0Var, e10, j11);
                    fVar.f19419l = false;
                    fVar.f19418k = j10;
                    fVar.q(j10, z12);
                    fVar.c(11, new h0(this));
                    l lVar = this.f19564n;
                    lVar.getClass();
                    o0 j12 = fVar.j();
                    if (j12 != null && j12 != (o0Var = lVar.f19541d)) {
                        if (o0Var == null) {
                            lVar.f19541d = j12;
                            lVar.f19540c = fVar;
                            j12.a(lVar.f19538a.f19537e);
                        } else {
                            throw new ExoPlaybackException(2, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z11) {
                        if (fVar.f19414g == 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        yk.j.H0(z14);
                        fVar.f19414g = 2;
                        fVar.t();
                    }
                    i13 = i10 + 1;
                    r0Var2 = r0Var;
                    p0Var2 = p0Var;
                    fVarArr = fVarArr2;
                }
            }
            r0Var = r0Var2;
            p0Var = p0Var2;
            i10 = i13;
            fVarArr2 = fVarArr;
            i13 = i10 + 1;
            r0Var2 = r0Var;
            p0Var2 = p0Var;
            fVarArr = fVarArr2;
        }
        p0Var2.f19588g = true;
    }

    public final long g(b5.i1 i1Var, Object obj, long j10) {
        b5.g1 g1Var = this.f19562l;
        int i10 = i1Var.h(obj, g1Var).f3318c;
        b5.h1 h1Var = this.f19561k;
        i1Var.o(i10, h1Var);
        if (h1Var.f3337f == -9223372036854775807L || !h1Var.a() || !h1Var.f3340i) {
            return -9223372036854775807L;
        }
        return e5.x.F(e5.x.s(h1Var.f3338g) - h1Var.f3337f) - (j10 + g1Var.f3320e);
    }

    public final Pair h(b5.i1 i1Var) {
        long j10 = 0;
        if (i1Var.q()) {
            return Pair.create(b1.f19361t, 0L);
        }
        Pair j11 = i1Var.j(this.f19561k, this.f19562l, i1Var.a(this.E), -9223372036854775807L);
        r5.w n10 = this.f19568r.n(i1Var, j11.first, 0L);
        long longValue = ((Long) j11.second).longValue();
        if (n10.a()) {
            Object obj = n10.f3556a;
            b5.g1 g1Var = this.f19562l;
            i1Var.h(obj, g1Var);
            if (n10.f3558c == g1Var.f(n10.f3557b)) {
                j10 = g1Var.f3322g.f3212c;
            }
            longValue = j10;
        }
        return Pair.create(n10, Long.valueOf(longValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        p0 p0Var;
        p0 p0Var2;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    P(message.arg2, 1, z10, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    H((l0) message.obj);
                    break;
                case 4:
                    Q((b5.u0) message.obj);
                    break;
                case 5:
                    this.f19572v = (j1) message.obj;
                    break;
                case 6:
                    Y(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((r5.u) message.obj);
                    break;
                case 9:
                    i((r5.u) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    R(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    S(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    L(z12, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    d1 d1Var = (d1) message.obj;
                    d1Var.getClass();
                    Looper looper = d1Var.f19390f;
                    Looper looper2 = this.f19560j;
                    e5.t tVar = this.f19558h;
                    if (looper == looper2) {
                        synchronized (d1Var) {
                        }
                        try {
                            d1Var.f19385a.c(d1Var.f19388d, d1Var.f19389e);
                            d1Var.b(true);
                            int i12 = this.f19573w.f19366e;
                            if (i12 == 3 || i12 == 2) {
                                tVar.d(2);
                                break;
                            }
                        } catch (Throwable th2) {
                            d1Var.b(true);
                            throw th2;
                        }
                    } else {
                        tVar.a(15, d1Var).b();
                        break;
                    }
                case 15:
                    J((d1) message.obj);
                    break;
                case 16:
                    b5.u0 u0Var = (b5.u0) message.obj;
                    n(u0Var, u0Var.f3617a, true, false);
                    break;
                case 17:
                    M((i0) message.obj);
                    break;
                case 18:
                    c((i0) message.obj, message.arg1);
                    break;
                case 19:
                    a3.a.u(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (r5.y0) message.obj);
                    break;
                case 21:
                    T((r5.y0) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    O(z13);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    N(z14);
                    break;
                case 25:
                    z();
                    G(true);
                    break;
                case 26:
                    z();
                    G(true);
                    break;
                default:
                    return false;
            }
        } catch (ParserException e10) {
            boolean z15 = e10.f2046a;
            int i13 = e10.f2047b;
            if (i13 == 1) {
                if (z15) {
                    i10 = AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN;
                } else {
                    i10 = AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
                }
            } else {
                if (i13 == 4) {
                    if (z15) {
                        i10 = AuthApiStatusCodes.AUTH_API_CLIENT_ERROR;
                    } else {
                        i10 = AuthApiStatusCodes.AUTH_TOKEN_ERROR;
                    }
                }
                j(e10, i11);
            }
            i11 = i10;
            j(e10, i11);
        } catch (DataSourceException e11) {
            j(e11, e11.f2056a);
        } catch (ExoPlaybackException e12) {
            ExoPlaybackException exoPlaybackException = e12;
            int i14 = exoPlaybackException.f2066h;
            r0 r0Var = this.f19568r;
            if (i14 == 1 && (p0Var2 = r0Var.f19635i) != null) {
                exoPlaybackException = exoPlaybackException.a(p0Var2.f19587f.f19618a);
            }
            if (exoPlaybackException.f2072n && this.f19554e0 == null) {
                e5.m.g("ExoPlayerImplInternal", "Recoverable renderer error", exoPlaybackException);
                this.f19554e0 = exoPlaybackException;
                e5.t tVar2 = this.f19558h;
                e5.s a10 = tVar2.a(25, exoPlaybackException);
                tVar2.getClass();
                Message message2 = a10.f15042a;
                message2.getClass();
                tVar2.f15044a.sendMessageAtFrontOfQueue(message2);
                a10.a();
            } else {
                ExoPlaybackException exoPlaybackException2 = this.f19554e0;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.f19554e0;
                }
                ExoPlaybackException exoPlaybackException3 = exoPlaybackException;
                e5.m.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException3);
                if (exoPlaybackException3.f2066h == 1 && r0Var.f19634h != r0Var.f19635i) {
                    while (true) {
                        p0Var = r0Var.f19634h;
                        if (p0Var == r0Var.f19635i) {
                            break;
                        }
                        r0Var.a();
                    }
                    p0Var.getClass();
                    q0 q0Var = p0Var.f19587f;
                    r5.w wVar = q0Var.f19618a;
                    long j10 = q0Var.f19619b;
                    this.f19573w = o(wVar, j10, q0Var.f19620c, j10, true, 0);
                }
                Y(true, false);
                this.f19573w = this.f19573w.e(exoPlaybackException3);
            }
        } catch (DrmSession$DrmSessionException e13) {
            j(e13, e13.f2087a);
        } catch (BehindLiveWindowException e14) {
            j(e14, CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE);
        } catch (IOException e15) {
            j(e15, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (RuntimeException e16) {
            if ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) {
                i11 = 1004;
            }
            ExoPlaybackException exoPlaybackException4 = new ExoPlaybackException(2, i11, e16);
            e5.m.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException4);
            Y(true, false);
            this.f19573w = this.f19573w.e(exoPlaybackException4);
        }
        t();
        return true;
    }

    public final void i(r5.u uVar) {
        boolean z10;
        p0 p0Var = this.f19568r.f19636j;
        if (p0Var != null && p0Var.f19582a == uVar) {
            long j10 = this.X;
            if (p0Var != null) {
                if (p0Var.f19593l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yk.j.H0(z10);
                if (p0Var.f19585d) {
                    p0Var.f19582a.J(j10 - p0Var.f19596o);
                }
            }
            s();
        }
    }

    public final void j(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, i10, iOException);
        p0 p0Var = this.f19568r.f19634h;
        if (p0Var != null) {
            exoPlaybackException = exoPlaybackException.a(p0Var.f19587f.f19618a);
        }
        e5.m.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        Y(false, false);
        this.f19573w = this.f19573w.e(exoPlaybackException);
    }

    public final void k(boolean z10) {
        r5.w wVar;
        long d10;
        p0 p0Var = this.f19568r.f19636j;
        if (p0Var == null) {
            wVar = this.f19573w.f19363b;
        } else {
            wVar = p0Var.f19587f.f19618a;
        }
        boolean z11 = !this.f19573w.f19372k.equals(wVar);
        if (z11) {
            this.f19573w = this.f19573w.b(wVar);
        }
        b1 b1Var = this.f19573w;
        if (p0Var == null) {
            d10 = b1Var.f19379r;
        } else {
            d10 = p0Var.d();
        }
        b1Var.f19377p = d10;
        b1 b1Var2 = this.f19573w;
        long j10 = b1Var2.f19377p;
        p0 p0Var2 = this.f19568r.f19636j;
        long j11 = 0;
        if (p0Var2 != null) {
            j11 = Math.max(0L, j10 - (this.X - p0Var2.f19596o));
        }
        b1Var2.f19378q = j11;
        if ((z11 || z10) && p0Var != null && p0Var.f19585d) {
            r5.w wVar2 = p0Var.f19587f.f19618a;
            b0(p0Var.f19595n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x01ee, code lost:
    
        if (r5.e(r6, r9) != 2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01f0, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01fe, code lost:
    
        if (r5.i(r3.f3557b) != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e7 A[Catch: all -> 0x02ec, TryCatch #4 {all -> 0x02ec, blocks: (B:67:0x02e1, B:69:0x02e7, B:16:0x02fb, B:18:0x0306, B:20:0x030c, B:22:0x0316, B:24:0x0323, B:27:0x0326, B:30:0x0331), top: B:14:0x0280 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(b5.i1 r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.m0.l(b5.i1, boolean):void");
    }

    public final void m(r5.u uVar) {
        r0 r0Var = this.f19568r;
        p0 p0Var = r0Var.f19636j;
        if (p0Var != null && p0Var.f19582a == uVar) {
            float f10 = this.f19564n.d().f3617a;
            b5.i1 i1Var = this.f19573w.f19362a;
            p0Var.f19585d = true;
            p0Var.f19594m = p0Var.f19582a.D();
            u5.w g10 = p0Var.g(f10, i1Var);
            q0 q0Var = p0Var.f19587f;
            long j10 = q0Var.f19619b;
            long j11 = q0Var.f19622e;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0L, j11 - 1);
            }
            long a10 = p0Var.a(g10, j10, false, new boolean[p0Var.f19590i.length]);
            long j12 = p0Var.f19596o;
            q0 q0Var2 = p0Var.f19587f;
            p0Var.f19596o = (q0Var2.f19619b - a10) + j12;
            p0Var.f19587f = q0Var2.b(a10);
            b0(p0Var.f19595n);
            if (p0Var == r0Var.f19634h) {
                C(p0Var.f19587f.f19619b);
                f(new boolean[this.f19549a.length]);
                b1 b1Var = this.f19573w;
                r5.w wVar = b1Var.f19363b;
                long j13 = p0Var.f19587f.f19619b;
                this.f19573w = o(wVar, j13, b1Var.f19364c, j13, false, 5);
            }
            s();
        }
    }

    public final void n(b5.u0 u0Var, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.f19574x.a(1);
            }
            this.f19573w = this.f19573w.f(u0Var);
        }
        float f11 = u0Var.f3617a;
        p0 p0Var = this.f19568r.f19634h;
        while (true) {
            i10 = 0;
            if (p0Var == null) {
                break;
            }
            u5.s[] sVarArr = p0Var.f19595n.f36849c;
            int length = sVarArr.length;
            while (i10 < length) {
                u5.s sVar = sVarArr[i10];
                if (sVar != null) {
                    sVar.o(f11);
                }
                i10++;
            }
            p0Var = p0Var.f19593l;
        }
        f[] fVarArr = this.f19549a;
        int length2 = fVarArr.length;
        while (i10 < length2) {
            f fVar = fVarArr[i10];
            if (fVar != null) {
                fVar.A(f10, u0Var.f3617a);
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [lp.h0, lp.k0] */
    public final b1 o(r5.w wVar, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        r5.e1 e1Var;
        u5.w wVar2;
        List list;
        long max;
        r5.e1 e1Var2;
        u5.w wVar3;
        lp.j1 j1Var;
        boolean z12 = false;
        if (!this.Z && j10 == this.f19573w.f19379r && wVar.equals(this.f19573w.f19363b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.Z = z11;
        B();
        b1 b1Var = this.f19573w;
        r5.e1 e1Var3 = b1Var.f19369h;
        u5.w wVar4 = b1Var.f19370i;
        List list2 = b1Var.f19371j;
        if (this.f19569s.f19355k) {
            p0 p0Var = this.f19568r.f19634h;
            if (p0Var == null) {
                e1Var2 = r5.e1.f33145d;
            } else {
                e1Var2 = p0Var.f19594m;
            }
            if (p0Var == null) {
                wVar3 = this.f19553e;
            } else {
                wVar3 = p0Var.f19595n;
            }
            u5.s[] sVarArr = wVar3.f36849c;
            ?? h0Var = new lp.h0();
            boolean z13 = false;
            for (u5.s sVar : sVarArr) {
                if (sVar != null) {
                    b5.q0 q0Var = sVar.g(0).f3650j;
                    if (q0Var == null) {
                        h0Var.a0(new b5.q0(new b5.p0[0]));
                    } else {
                        h0Var.a0(q0Var);
                        z13 = true;
                    }
                }
            }
            if (z13) {
                j1Var = h0Var.e0();
            } else {
                lp.l0 l0Var = lp.o0.f25025b;
                j1Var = lp.j1.f24998e;
            }
            if (p0Var != null) {
                q0 q0Var2 = p0Var.f19587f;
                if (q0Var2.f19620c != j11) {
                    p0Var.f19587f = q0Var2.a(j11);
                }
            }
            list = j1Var;
            e1Var = e1Var2;
            wVar2 = wVar3;
        } else if (!wVar.equals(b1Var.f19363b)) {
            e1Var = r5.e1.f33145d;
            wVar2 = this.f19553e;
            list = lp.j1.f24998e;
        } else {
            e1Var = e1Var3;
            wVar2 = wVar4;
            list = list2;
        }
        if (z10) {
            j0 j0Var = this.f19574x;
            if (j0Var.f19520d && j0Var.f19521e != 5) {
                if (i10 == 5) {
                    z12 = true;
                }
                yk.j.E0(z12);
            } else {
                j0Var.f19517a = true;
                j0Var.f19520d = true;
                j0Var.f19521e = i10;
            }
        }
        b1 b1Var2 = this.f19573w;
        long j13 = b1Var2.f19377p;
        p0 p0Var2 = this.f19568r.f19636j;
        if (p0Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j13 - (this.X - p0Var2.f19596o));
        }
        return b1Var2.c(wVar, j10, j11, j12, max, e1Var, wVar2, list);
    }

    public final boolean p() {
        long i10;
        p0 p0Var = this.f19568r.f19636j;
        if (p0Var == null) {
            return false;
        }
        if (!p0Var.f19585d) {
            i10 = 0;
        } else {
            i10 = p0Var.f19582a.i();
        }
        if (i10 == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean r() {
        p0 p0Var = this.f19568r.f19634h;
        long j10 = p0Var.f19587f.f19622e;
        if (p0Var.f19585d && (j10 == -9223372036854775807L || this.f19573w.f19379r < j10 || !V())) {
            return true;
        }
        return false;
    }

    public final void s() {
        long i10;
        long max;
        boolean c10;
        boolean z10 = false;
        if (!p()) {
            c10 = false;
        } else {
            p0 p0Var = this.f19568r.f19636j;
            if (!p0Var.f19585d) {
                i10 = 0;
            } else {
                i10 = p0Var.f19582a.i();
            }
            p0 p0Var2 = this.f19568r.f19636j;
            if (p0Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, i10 - (this.X - p0Var2.f19596o));
            }
            if (p0Var != this.f19568r.f19634h) {
                long j10 = p0Var.f19587f.f19619b;
            }
            c10 = ((j) this.f19555f).c(max, this.f19564n.d().f3617a);
            if (!c10 && max < 500000 && this.f19563m > 0) {
                this.f19568r.f19634h.f19582a.r(this.f19573w.f19379r);
                c10 = ((j) this.f19555f).c(max, this.f19564n.d().f3617a);
            }
        }
        this.C = c10;
        if (c10) {
            p0 p0Var3 = this.f19568r.f19636j;
            long j11 = this.X;
            if (p0Var3.f19593l == null) {
                z10 = true;
            }
            yk.j.H0(z10);
            p0Var3.f19582a.s(j11 - p0Var3.f19596o);
        }
        a0();
    }

    public final void t() {
        boolean z10;
        j0 j0Var = this.f19574x;
        b1 b1Var = this.f19573w;
        boolean z11 = j0Var.f19517a;
        if (j0Var.f19518b != b1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        j0Var.f19517a = z12;
        j0Var.f19518b = b1Var;
        if (z12) {
            g0 g0Var = this.f19567q.f19654a;
            g0Var.f19462i.c(new h.m0(8, g0Var, j0Var));
            this.f19574x = new j0(this.f19573w);
        }
    }

    public final void u() {
        l(this.f19569s.b(), true);
    }

    public final void v() {
        this.f19574x.a(1);
        throw null;
    }

    public final void w() {
        int i10;
        this.f19574x.a(1);
        int i11 = 0;
        A(false, false, false, true);
        ((j) this.f19555f).b(false);
        if (this.f19573w.f19362a.q()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        U(i10);
        v5.h hVar = (v5.h) this.f19557g;
        hVar.getClass();
        a1 a1Var = this.f19569s;
        yk.j.H0(!a1Var.f19355k);
        a1Var.f19356l = hVar;
        while (true) {
            ArrayList arrayList = a1Var.f19346b;
            if (i11 < arrayList.size()) {
                z0 z0Var = (z0) arrayList.get(i11);
                a1Var.e(z0Var);
                a1Var.f19351g.add(z0Var);
                i11++;
            } else {
                a1Var.f19355k = true;
                this.f19558h.d(2);
                return;
            }
        }
    }

    public final void x() {
        boolean z10;
        A(true, false, true, false);
        for (int i10 = 0; i10 < this.f19549a.length; i10++) {
            f fVar = this.f19551c[i10];
            synchronized (fVar.f19408a) {
                fVar.f19421n = null;
            }
            f fVar2 = this.f19549a[i10];
            if (fVar2.f19414g == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            yk.j.H0(z10);
            fVar2.r();
        }
        ((j) this.f19555f).b(true);
        U(1);
        HandlerThread handlerThread = this.f19559i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f19575y = true;
            notifyAll();
        }
    }

    public final void y(int i10, int i11, r5.y0 y0Var) {
        boolean z10 = true;
        this.f19574x.a(1);
        a1 a1Var = this.f19569s;
        a1Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > a1Var.f19346b.size()) {
            z10 = false;
        }
        yk.j.E0(z10);
        a1Var.f19354j = y0Var;
        a1Var.g(i10, i11);
        l(a1Var.b(), false);
    }

    public final void z() {
        boolean z10;
        float f10 = this.f19564n.d().f3617a;
        r0 r0Var = this.f19568r;
        p0 p0Var = r0Var.f19634h;
        p0 p0Var2 = r0Var.f19635i;
        boolean z11 = true;
        for (p0 p0Var3 = p0Var; p0Var3 != null && p0Var3.f19585d; p0Var3 = p0Var3.f19593l) {
            u5.w g10 = p0Var3.g(f10, this.f19573w.f19362a);
            u5.w wVar = p0Var3.f19595n;
            if (wVar != null) {
                int length = wVar.f36849c.length;
                u5.s[] sVarArr = g10.f36849c;
                if (length == sVarArr.length) {
                    for (int i10 = 0; i10 < sVarArr.length; i10++) {
                        if (g10.a(wVar, i10)) {
                        }
                    }
                    if (p0Var3 == p0Var2) {
                        z11 = false;
                    }
                }
            }
            if (z11) {
                r0 r0Var2 = this.f19568r;
                p0 p0Var4 = r0Var2.f19634h;
                boolean l10 = r0Var2.l(p0Var4);
                boolean[] zArr = new boolean[this.f19549a.length];
                long a10 = p0Var4.a(g10, this.f19573w.f19379r, l10, zArr);
                b1 b1Var = this.f19573w;
                if (b1Var.f19366e != 4 && a10 != b1Var.f19379r) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b1 b1Var2 = this.f19573w;
                this.f19573w = o(b1Var2.f19363b, a10, b1Var2.f19364c, b1Var2.f19365d, z10, 5);
                if (z10) {
                    C(a10);
                }
                boolean[] zArr2 = new boolean[this.f19549a.length];
                int i11 = 0;
                while (true) {
                    f[] fVarArr = this.f19549a;
                    if (i11 >= fVarArr.length) {
                        break;
                    }
                    f fVar = fVarArr[i11];
                    boolean q10 = q(fVar);
                    zArr2[i11] = q10;
                    r5.v0 v0Var = p0Var4.f19584c[i11];
                    if (q10) {
                        if (v0Var != fVar.f19415h) {
                            d(fVar);
                        } else if (zArr[i11]) {
                            long j10 = this.X;
                            fVar.f19419l = false;
                            fVar.f19418k = j10;
                            fVar.q(j10, false);
                            i11++;
                        }
                    }
                    i11++;
                }
                f(zArr2);
            } else {
                this.f19568r.l(p0Var3);
                if (p0Var3.f19585d) {
                    p0Var3.a(g10, Math.max(p0Var3.f19587f.f19619b, this.X - p0Var3.f19596o), false, new boolean[p0Var3.f19590i.length]);
                }
            }
            k(true);
            if (this.f19573w.f19366e != 4) {
                s();
                c0();
                this.f19558h.d(2);
                return;
            }
            return;
        }
    }
}
