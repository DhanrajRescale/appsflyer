package r5;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import i5.j1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m0 implements u, z5.r, v5.k, v5.n, t0 {
    public static final Map Z;

    /* renamed from: e0, reason: collision with root package name */
    public static final b5.v f33216e0;
    public boolean A;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public long G;
    public boolean I;
    public int J;
    public boolean X;
    public boolean Y;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f33217a;

    /* renamed from: b, reason: collision with root package name */
    public final g5.f f33218b;

    /* renamed from: c, reason: collision with root package name */
    public final n5.p f33219c;

    /* renamed from: d, reason: collision with root package name */
    public final kq.e f33220d;

    /* renamed from: e, reason: collision with root package name */
    public final l0.j f33221e;

    /* renamed from: f, reason: collision with root package name */
    public final n5.l f33222f;

    /* renamed from: g, reason: collision with root package name */
    public final p0 f33223g;

    /* renamed from: h, reason: collision with root package name */
    public final v5.e f33224h;

    /* renamed from: i, reason: collision with root package name */
    public final String f33225i;

    /* renamed from: j, reason: collision with root package name */
    public final long f33226j;

    /* renamed from: l, reason: collision with root package name */
    public final h.c f33228l;

    /* renamed from: q, reason: collision with root package name */
    public t f33233q;

    /* renamed from: r, reason: collision with root package name */
    public j6.b f33234r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f33237u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f33238v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33239w;

    /* renamed from: x, reason: collision with root package name */
    public l0 f33240x;

    /* renamed from: y, reason: collision with root package name */
    public z5.y f33241y;

    /* renamed from: k, reason: collision with root package name */
    public final v5.o f33227k = new v5.o("ProgressiveMediaPeriod");

    /* renamed from: m, reason: collision with root package name */
    public final h.r0 f33229m = new h.r0(3);

    /* renamed from: n, reason: collision with root package name */
    public final h0 f33230n = new h0(this, 0);

    /* renamed from: o, reason: collision with root package name */
    public final h0 f33231o = new h0(this, 1);

    /* renamed from: p, reason: collision with root package name */
    public final Handler f33232p = e5.x.l(null);

    /* renamed from: t, reason: collision with root package name */
    public k0[] f33236t = new k0[0];

    /* renamed from: s, reason: collision with root package name */
    public u0[] f33235s = new u0[0];
    public long H = -9223372036854775807L;

    /* renamed from: z, reason: collision with root package name */
    public long f33242z = -9223372036854775807L;
    public int B = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        Z = Collections.unmodifiableMap(hashMap);
        b5.u uVar = new b5.u();
        uVar.f3590a = "icy";
        uVar.f3600k = "application/x-icy";
        f33216e0 = uVar.a();
    }

    public m0(Uri uri, g5.f fVar, h.c cVar, n5.p pVar, n5.l lVar, kq.e eVar, l0.j jVar, p0 p0Var, v5.e eVar2, String str, int i10) {
        this.f33217a = uri;
        this.f33218b = fVar;
        this.f33219c = pVar;
        this.f33222f = lVar;
        this.f33220d = eVar;
        this.f33221e = jVar;
        this.f33223g = p0Var;
        this.f33224h = eVar2;
        this.f33225i = str;
        this.f33226j = i10;
        this.f33228l = cVar;
    }

    @Override // r5.u
    public final void A(t tVar, long j10) {
        this.f33233q = tVar;
        this.f33229m.f();
        y();
    }

    @Override // r5.u
    public final e1 D() {
        e();
        return this.f33240x.f33207a;
    }

    @Override // r5.x0
    public final long G() {
        long j10;
        boolean z10;
        long j11;
        e();
        if (this.X || this.E == 0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.H;
        }
        if (this.f33239w) {
            int length = this.f33235s.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                l0 l0Var = this.f33240x;
                if (l0Var.f33208b[i10] && l0Var.f33209c[i10]) {
                    u0 u0Var = this.f33235s[i10];
                    synchronized (u0Var) {
                        z10 = u0Var.f33323w;
                    }
                    if (z10) {
                        continue;
                    } else {
                        u0 u0Var2 = this.f33235s[i10];
                        synchronized (u0Var2) {
                            j11 = u0Var2.f33322v;
                        }
                        j10 = Math.min(j10, j11);
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = l(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.G;
        }
        return j10;
    }

    @Override // r5.x0
    public final void J(long j10) {
    }

    @Override // v5.n
    public final void a() {
        for (u0 u0Var : this.f33235s) {
            u0Var.u(true);
            n5.i iVar = u0Var.f33308h;
            if (iVar != null) {
                iVar.c(u0Var.f33305e);
                u0Var.f33308h = null;
                u0Var.f33307g = null;
            }
        }
        h.c cVar = this.f33228l;
        z5.p pVar = (z5.p) cVar.f17584c;
        if (pVar != null) {
            pVar.release();
            cVar.f17584c = null;
        }
        cVar.f17585d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Type inference failed for: r3v0, types: [r5.n, java.lang.Object] */
    @Override // v5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v5.j b(v5.m r16, long r17, long r19, java.io.IOException r21, int r22) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.m0.b(v5.m, long, long, java.io.IOException, int):v5.j");
    }

    @Override // z5.r
    public final void c() {
        this.f33237u = true;
        this.f33232p.post(this.f33230n);
    }

    @Override // z5.r
    public final void d(z5.y yVar) {
        this.f33232p.post(new h.m0(13, this, yVar));
    }

    public final void e() {
        yk.j.H0(this.f33238v);
        this.f33240x.getClass();
        this.f33241y.getClass();
    }

    @Override // z5.r
    public final z5.b0 f(int i10, int i11) {
        return x(new k0(i10, false));
    }

    @Override // r5.u
    public final long g(long j10, j1 j1Var) {
        e();
        if (!this.f33241y.c()) {
            return 0L;
        }
        z5.x h10 = this.f33241y.h(j10);
        return j1Var.a(j10, h10.f42138a.f42141a, h10.f42139b.f42141a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [r5.n, java.lang.Object] */
    @Override // v5.k
    public final void h(v5.m mVar, long j10, long j11, boolean z10) {
        i0 i0Var = (i0) mVar;
        Uri uri = i0Var.f33182b.f16627c;
        ?? obj = new Object();
        this.f33220d.getClass();
        this.f33221e.j(obj, 1, -1, null, 0, null, i0Var.f33189i, this.f33242z);
        if (!z10) {
            for (u0 u0Var : this.f33235s) {
                u0Var.u(false);
            }
            if (this.E > 0) {
                t tVar = this.f33233q;
                tVar.getClass();
                tVar.b(this);
            }
        }
    }

    @Override // r5.x0
    public final long i() {
        return G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [r5.n, java.lang.Object] */
    @Override // v5.k
    public final void j(v5.m mVar, long j10, long j11) {
        z5.y yVar;
        long j12;
        i0 i0Var = (i0) mVar;
        if (this.f33242z == -9223372036854775807L && (yVar = this.f33241y) != null) {
            boolean c10 = yVar.c();
            long l10 = l(true);
            if (l10 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = l10 + 10000;
            }
            this.f33242z = j12;
            this.f33223g.t(c10, this.A, j12);
        }
        Uri uri = i0Var.f33182b.f16627c;
        ?? obj = new Object();
        this.f33220d.getClass();
        this.f33221e.l(obj, 1, -1, null, 0, null, i0Var.f33189i, this.f33242z);
        this.X = true;
        t tVar = this.f33233q;
        tVar.getClass();
        tVar.b(this);
    }

    public final int k() {
        int i10 = 0;
        for (u0 u0Var : this.f33235s) {
            i10 += u0Var.f33317q + u0Var.f33316p;
        }
        return i10;
    }

    public final long l(boolean z10) {
        long j10;
        long j11 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f33235s.length; i10++) {
            if (!z10) {
                l0 l0Var = this.f33240x;
                l0Var.getClass();
                if (!l0Var.f33209c[i10]) {
                    continue;
                }
            }
            u0 u0Var = this.f33235s[i10];
            synchronized (u0Var) {
                j10 = u0Var.f33322v;
            }
            j11 = Math.max(j11, j10);
        }
        return j11;
    }

    public final boolean m() {
        return this.H != -9223372036854775807L;
    }

    public final void n() {
        b5.v vVar;
        boolean z10;
        b5.q0 a10;
        int i10;
        if (!this.Y && !this.f33238v && this.f33237u && this.f33241y != null) {
            u0[] u0VarArr = this.f33235s;
            int length = u0VarArr.length;
            int i11 = 0;
            while (true) {
                b5.v vVar2 = null;
                if (i11 < length) {
                    u0 u0Var = u0VarArr[i11];
                    synchronized (u0Var) {
                        if (!u0Var.f33325y) {
                            vVar2 = u0Var.B;
                        }
                    }
                    if (vVar2 == null) {
                        return;
                    } else {
                        i11++;
                    }
                } else {
                    this.f33229m.d();
                    int length2 = this.f33235s.length;
                    b5.j1[] j1VarArr = new b5.j1[length2];
                    boolean[] zArr = new boolean[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        u0 u0Var2 = this.f33235s[i12];
                        synchronized (u0Var2) {
                            if (u0Var2.f33325y) {
                                vVar = null;
                            } else {
                                vVar = u0Var2.B;
                            }
                        }
                        vVar.getClass();
                        String str = vVar.f3652l;
                        boolean j10 = b5.r0.j(str);
                        if (!j10 && !b5.r0.l(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        zArr[i12] = z10;
                        this.f33239w = z10 | this.f33239w;
                        j6.b bVar = this.f33234r;
                        if (bVar != null) {
                            if (j10 || this.f33236t[i12].f33205b) {
                                b5.q0 q0Var = vVar.f3650j;
                                if (q0Var == null) {
                                    a10 = new b5.q0(bVar);
                                } else {
                                    a10 = q0Var.a(bVar);
                                }
                                b5.u a11 = vVar.a();
                                a11.f3598i = a10;
                                vVar = new b5.v(a11);
                            }
                            if (j10 && vVar.f3646f == -1 && vVar.f3647g == -1 && (i10 = bVar.f21039a) != -1) {
                                b5.u a12 = vVar.a();
                                a12.f3595f = i10;
                                vVar = new b5.v(a12);
                            }
                        }
                        int d10 = this.f33219c.d(vVar);
                        b5.u a13 = vVar.a();
                        a13.F = d10;
                        j1VarArr[i12] = new b5.j1(Integer.toString(i12), a13.a());
                    }
                    this.f33240x = new l0(new e1(j1VarArr), zArr);
                    this.f33238v = true;
                    t tVar = this.f33233q;
                    tVar.getClass();
                    tVar.a(this);
                    return;
                }
            }
        }
    }

    @Override // r5.u
    public final long o(u5.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        boolean[] zArr3;
        boolean z10;
        u5.s sVar;
        boolean z11;
        boolean z12;
        e();
        l0 l0Var = this.f33240x;
        e1 e1Var = l0Var.f33207a;
        int i10 = this.E;
        int i11 = 0;
        while (true) {
            int length = sVarArr.length;
            zArr3 = l0Var.f33209c;
            if (i11 >= length) {
                break;
            }
            v0 v0Var = v0VarArr[i11];
            if (v0Var != null && (sVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((j0) v0Var).f33202a;
                yk.j.H0(zArr3[i12]);
                this.E--;
                zArr3[i12] = false;
                v0VarArr[i11] = null;
            }
            i11++;
        }
        if (!this.C ? j10 != 0 : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < sVarArr.length; i13++) {
            if (v0VarArr[i13] == null && (sVar = sVarArr[i13]) != null) {
                if (sVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yk.j.H0(z11);
                if (sVar.i(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                yk.j.H0(z12);
                int indexOf = e1Var.f33148b.indexOf(sVar.c());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                yk.j.H0(!zArr3[indexOf]);
                this.E++;
                zArr3[indexOf] = true;
                v0VarArr[i13] = new j0(this, indexOf);
                zArr2[i13] = true;
                if (!z10) {
                    u0 u0Var = this.f33235s[indexOf];
                    if (!u0Var.v(j10, true) && u0Var.n() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.D = false;
            v5.o oVar = this.f33227k;
            if (oVar.b()) {
                for (u0 u0Var2 : this.f33235s) {
                    u0Var2.i();
                }
                v5.l lVar = oVar.f37756b;
                yk.j.I0(lVar);
                lVar.a(false);
            } else {
                for (u0 u0Var3 : this.f33235s) {
                    u0Var3.u(false);
                }
            }
        } else if (z10) {
            j10 = q(j10);
            for (int i14 = 0; i14 < v0VarArr.length; i14++) {
                if (v0VarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.C = true;
        return j10;
    }

    @Override // r5.u
    public final void p() {
        int H = this.f33220d.H(this.B);
        v5.o oVar = this.f33227k;
        IOException iOException = oVar.f37757c;
        if (iOException == null) {
            v5.l lVar = oVar.f37756b;
            if (lVar != null) {
                if (H == Integer.MIN_VALUE) {
                    H = lVar.f37743a;
                }
                IOException iOException2 = lVar.f37747e;
                if (iOException2 != null && lVar.f37748f > H) {
                    throw iOException2;
                }
            }
            if (this.X && !this.f33238v) {
                throw ParserException.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override // r5.u
    public final long q(long j10) {
        e();
        boolean[] zArr = this.f33240x.f33208b;
        if (!this.f33241y.c()) {
            j10 = 0;
        }
        this.D = false;
        this.G = j10;
        if (m()) {
            this.H = j10;
            return j10;
        }
        if (this.B != 7) {
            int length = this.f33235s.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f33235s[i10].v(j10, false) || (!zArr[i10] && this.f33239w)) {
                }
            }
            return j10;
        }
        this.I = false;
        this.H = j10;
        this.X = false;
        v5.o oVar = this.f33227k;
        if (oVar.b()) {
            for (u0 u0Var : this.f33235s) {
                u0Var.i();
            }
            v5.l lVar = oVar.f37756b;
            yk.j.I0(lVar);
            lVar.a(false);
        } else {
            oVar.f37757c = null;
            for (u0 u0Var2 : this.f33235s) {
                u0Var2.u(false);
            }
        }
        return j10;
    }

    @Override // r5.u
    public final void r(long j10) {
        e();
        if (m()) {
            return;
        }
        boolean[] zArr = this.f33240x.f33209c;
        int length = this.f33235s.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f33235s[i10].h(zArr[i10], j10);
        }
    }

    @Override // r5.x0
    public final boolean s(long j10) {
        if (!this.X) {
            v5.o oVar = this.f33227k;
            if (oVar.f37757c == null && !this.I) {
                if (!this.f33238v || this.E != 0) {
                    boolean f10 = this.f33229m.f();
                    if (!oVar.b()) {
                        y();
                        return true;
                    }
                    return f10;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void t(int i10) {
        e();
        l0 l0Var = this.f33240x;
        boolean[] zArr = l0Var.f33210d;
        if (!zArr[i10]) {
            b5.v vVar = l0Var.f33207a.a(i10).f3379d[0];
            this.f33221e.c(b5.r0.h(vVar.f3652l), vVar, 0, null, this.G);
            zArr[i10] = true;
        }
    }

    @Override // r5.x0
    public final boolean u() {
        boolean z10;
        if (this.f33227k.b()) {
            h.r0 r0Var = this.f33229m;
            synchronized (r0Var) {
                z10 = r0Var.f17735a;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final void v(int i10) {
        e();
        boolean[] zArr = this.f33240x.f33208b;
        if (this.I && zArr[i10] && !this.f33235s[i10].q(false)) {
            this.H = 0L;
            this.I = false;
            this.D = true;
            this.G = 0L;
            this.J = 0;
            for (u0 u0Var : this.f33235s) {
                u0Var.u(false);
            }
            t tVar = this.f33233q;
            tVar.getClass();
            tVar.b(this);
        }
    }

    @Override // r5.u
    public final long w() {
        if (this.D) {
            if (this.X || k() > this.J) {
                this.D = false;
                return this.G;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public final u0 x(k0 k0Var) {
        int length = this.f33235s.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (k0Var.equals(this.f33236t[i10])) {
                return this.f33235s[i10];
            }
        }
        n5.p pVar = this.f33219c;
        pVar.getClass();
        n5.l lVar = this.f33222f;
        lVar.getClass();
        u0 u0Var = new u0(this.f33224h, pVar, lVar);
        u0Var.f33306f = this;
        int i11 = length + 1;
        k0[] k0VarArr = (k0[]) Arrays.copyOf(this.f33236t, i11);
        k0VarArr[length] = k0Var;
        this.f33236t = k0VarArr;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.f33235s, i11);
        u0VarArr[length] = u0Var;
        this.f33235s = u0VarArr;
        return u0Var;
    }

    public final void y() {
        i0 i0Var = new i0(this, this.f33217a, this.f33218b, this.f33228l, this, this.f33229m);
        if (this.f33238v) {
            yk.j.H0(m());
            long j10 = this.f33242z;
            if (j10 != -9223372036854775807L && this.H > j10) {
                this.X = true;
                this.H = -9223372036854775807L;
                return;
            }
            z5.y yVar = this.f33241y;
            yVar.getClass();
            long j11 = yVar.h(this.H).f42138a.f42142b;
            long j12 = this.H;
            i0Var.f33186f.f27810a = j11;
            i0Var.f33189i = j12;
            i0Var.f33188h = true;
            i0Var.f33192l = false;
            for (u0 u0Var : this.f33235s) {
                u0Var.f33320t = this.H;
            }
            this.H = -9223372036854775807L;
        }
        this.J = k();
        this.f33227k.e(i0Var, this, this.f33220d.H(this.B));
        this.f33221e.p(new n(i0Var.f33190j), 1, -1, null, 0, null, i0Var.f33189i, this.f33242z);
    }

    public final boolean z() {
        if (!this.D && !m()) {
            return false;
        }
        return true;
    }
}
