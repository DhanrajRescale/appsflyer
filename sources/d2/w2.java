package d2;

import android.graphics.Canvas;
import android.os.Build;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w2 implements c2.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f13660a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f13661b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f13662c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13663d;

    /* renamed from: e, reason: collision with root package name */
    public final k2 f13664e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13665f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13666g;

    /* renamed from: h, reason: collision with root package name */
    public n1.f f13667h;

    /* renamed from: i, reason: collision with root package name */
    public final h2 f13668i;

    /* renamed from: j, reason: collision with root package name */
    public final e.l f13669j;

    /* renamed from: k, reason: collision with root package name */
    public long f13670k;

    /* renamed from: l, reason: collision with root package name */
    public final v1 f13671l;

    /* renamed from: m, reason: collision with root package name */
    public int f13672m;

    public w2(a0 a0Var, c2.e1 e1Var, c2.p0 p0Var) {
        Function1 function1;
        v1 s2Var;
        this.f13660a = a0Var;
        this.f13661b = e1Var;
        this.f13662c = p0Var;
        e1.i h10 = yq.b.h();
        if (h10 != null) {
            function1 = h10.f();
        } else {
            function1 = null;
        }
        e1.i i10 = yq.b.i(h10);
        try {
            k2 k2Var = new k2(a0Var.getDensity());
            yq.b.l(h10, i10, function1);
            this.f13664e = k2Var;
            this.f13668i = new h2(q0.f13573d);
            this.f13669j = new e.l(7);
            this.f13670k = n1.b1.f28120b;
            if (Build.VERSION.SDK_INT >= 29) {
                s2Var = new u2();
            } else {
                s2Var = new s2(a0Var);
            }
            s2Var.x();
            s2Var.m(false);
            this.f13671l = s2Var;
        } catch (Throwable th2) {
            yq.b.l(h10, i10, function1);
            throw th2;
        }
    }

    @Override // c2.p1
    public final void a(float[] fArr) {
        n1.k0.d(fArr, this.f13668i.b(this.f13671l));
    }

    @Override // c2.p1
    public final void b() {
        p3 p3Var;
        Reference poll;
        v0.h hVar;
        v1 v1Var = this.f13671l;
        if (v1Var.v()) {
            v1Var.o();
        }
        this.f13661b = null;
        this.f13662c = null;
        this.f13665f = true;
        m(false);
        a0 a0Var = this.f13660a;
        a0Var.f13341x = true;
        if (a0Var.C != null) {
            o0.j jVar = l3.f13499p;
        }
        do {
            p3Var = a0Var.E0;
            poll = p3Var.f13568b.poll();
            hVar = p3Var.f13567a;
            if (poll != null) {
                hVar.m(poll);
            }
        } while (poll != null);
        hVar.b(new WeakReference(this, p3Var.f13568b));
    }

    @Override // c2.p1
    public final void c(n1.u0 u0Var, w2.k kVar, w2.b bVar) {
        boolean z10;
        boolean z11;
        Function0 function0;
        boolean z12;
        int i10 = u0Var.f28181a | this.f13672m;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f13670k = u0Var.f28194n;
        }
        v1 v1Var = this.f13671l;
        boolean F = v1Var.F();
        k2 k2Var = this.f13664e;
        boolean z13 = false;
        if (F && !(!k2Var.f13481i)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 1) != 0) {
            v1Var.B(u0Var.f28182b);
        }
        if ((i10 & 2) != 0) {
            v1Var.r(u0Var.f28183c);
        }
        if ((i10 & 4) != 0) {
            v1Var.y(u0Var.f28184d);
        }
        if ((i10 & 8) != 0) {
            v1Var.D(u0Var.f28185e);
        }
        if ((i10 & 16) != 0) {
            v1Var.l(u0Var.f28186f);
        }
        if ((i10 & 32) != 0) {
            v1Var.s(u0Var.f28187g);
        }
        if ((i10 & 64) != 0) {
            v1Var.C(androidx.compose.ui.graphics.a.y(u0Var.f28188h));
        }
        if ((i10 & 128) != 0) {
            v1Var.I(androidx.compose.ui.graphics.a.y(u0Var.f28189i));
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            v1Var.j(u0Var.f28192l);
        }
        if ((i10 & 256) != 0) {
            v1Var.J(u0Var.f28190j);
        }
        if ((i10 & 512) != 0) {
            v1Var.d(u0Var.f28191k);
        }
        if ((i10 & 2048) != 0) {
            v1Var.H(u0Var.f28193m);
        }
        if (i11 != 0) {
            long j10 = this.f13670k;
            int i12 = n1.b1.f28121c;
            v1Var.k(Float.intBitsToFloat((int) (j10 >> 32)) * v1Var.b());
            v1Var.q(Float.intBitsToFloat((int) (this.f13670k & 4294967295L)) * v1Var.a());
        }
        boolean z14 = u0Var.f28196p;
        n1.r0 r0Var = n1.s0.f28162a;
        if (z14 && u0Var.f28195o != r0Var) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i10 & 24576) != 0) {
            v1Var.G(z11);
            if (u0Var.f28196p && u0Var.f28195o == r0Var) {
                z12 = true;
            } else {
                z12 = false;
            }
            v1Var.m(z12);
        }
        if ((131072 & i10) != 0) {
            v1Var.g();
        }
        if ((32768 & i10) != 0) {
            v1Var.u(u0Var.f28197q);
        }
        boolean d10 = this.f13664e.d(u0Var.f28195o, u0Var.f28184d, z11, u0Var.f28187g, kVar, bVar);
        if (k2Var.f13480h) {
            v1Var.w(k2Var.b());
        }
        if (z11 && !(!k2Var.f13481i)) {
            z13 = true;
        }
        a0 a0Var = this.f13660a;
        if (z10 == z13 && (!z13 || !d10)) {
            if (Build.VERSION.SDK_INT >= 26) {
                j4.f13470a.a(a0Var);
            } else {
                a0Var.invalidate();
            }
        } else if (!this.f13663d && !this.f13665f) {
            a0Var.invalidate();
            m(true);
        }
        if (!this.f13666g && v1Var.L() > s0.g.f34069a && (function0 = this.f13662c) != null) {
            function0.mo2invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f13668i.c();
        }
        this.f13672m = u0Var.f28181a;
    }

    @Override // c2.p1
    public final void d(m1.b bVar, boolean z10) {
        v1 v1Var = this.f13671l;
        h2 h2Var = this.f13668i;
        if (z10) {
            float[] a10 = h2Var.a(v1Var);
            if (a10 == null) {
                bVar.f27229a = s0.g.f34069a;
                bVar.f27230b = s0.g.f34069a;
                bVar.f27231c = s0.g.f34069a;
                bVar.f27232d = s0.g.f34069a;
                return;
            }
            n1.k0.b(a10, bVar);
            return;
        }
        n1.k0.b(h2Var.b(v1Var), bVar);
    }

    @Override // c2.p1
    public final boolean e(long j10) {
        float d10 = m1.c.d(j10);
        float e10 = m1.c.e(j10);
        v1 v1Var = this.f13671l;
        if (v1Var.z()) {
            if (s0.g.f34069a <= d10 && d10 < v1Var.b() && s0.g.f34069a <= e10 && e10 < v1Var.a()) {
                return true;
            }
            return false;
        }
        if (!v1Var.F()) {
            return true;
        }
        return this.f13664e.c(j10);
    }

    @Override // c2.p1
    public final long f(long j10, boolean z10) {
        v1 v1Var = this.f13671l;
        h2 h2Var = this.f13668i;
        if (z10) {
            float[] a10 = h2Var.a(v1Var);
            if (a10 != null) {
                return n1.k0.a(j10, a10);
            }
            int i10 = m1.c.f27236e;
            return m1.c.f27234c;
        }
        return n1.k0.a(j10, h2Var.b(v1Var));
    }

    @Override // c2.p1
    public final void g(n1.r rVar) {
        Canvas a10 = n1.d.a(rVar);
        boolean isHardwareAccelerated = a10.isHardwareAccelerated();
        boolean z10 = false;
        v1 v1Var = this.f13671l;
        if (isHardwareAccelerated) {
            k();
            if (v1Var.L() > s0.g.f34069a) {
                z10 = true;
            }
            this.f13666g = z10;
            if (z10) {
                rVar.t();
            }
            v1Var.h(a10);
            if (this.f13666g) {
                rVar.j();
                return;
            }
            return;
        }
        float i10 = v1Var.i();
        float A = v1Var.A();
        float E = v1Var.E();
        float f10 = v1Var.f();
        if (v1Var.c() < 1.0f) {
            n1.f fVar = this.f13667h;
            if (fVar == null) {
                fVar = androidx.compose.ui.graphics.a.g();
                this.f13667h = fVar;
            }
            fVar.d(v1Var.c());
            a10.saveLayer(i10, A, E, f10, fVar.f28130a);
        } else {
            rVar.h();
        }
        rVar.r(i10, A);
        rVar.l(this.f13668i.b(v1Var));
        if (v1Var.F() || v1Var.z()) {
            this.f13664e.a(rVar);
        }
        Function1 function1 = this.f13661b;
        if (function1 != null) {
            function1.invoke(rVar);
        }
        rVar.s();
        m(false);
    }

    @Override // c2.p1
    public final void h(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        long j11 = this.f13670k;
        int i12 = n1.b1.f28121c;
        float f10 = i10;
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f10;
        v1 v1Var = this.f13671l;
        v1Var.k(intBitsToFloat);
        float f11 = i11;
        v1Var.q(Float.intBitsToFloat((int) (4294967295L & this.f13670k)) * f11);
        if (v1Var.n(v1Var.i(), v1Var.A(), v1Var.i() + i10, v1Var.A() + i11)) {
            long j12 = t0.t.j(f10, f11);
            k2 k2Var = this.f13664e;
            if (!m1.f.b(k2Var.f13476d, j12)) {
                k2Var.f13476d = j12;
                k2Var.f13480h = true;
            }
            v1Var.w(k2Var.b());
            if (!this.f13663d && !this.f13665f) {
                this.f13660a.invalidate();
                m(true);
            }
            this.f13668i.c();
        }
    }

    @Override // c2.p1
    public final void i(float[] fArr) {
        float[] a10 = this.f13668i.a(this.f13671l);
        if (a10 != null) {
            n1.k0.d(fArr, a10);
        }
    }

    @Override // c2.p1
    public final void invalidate() {
        if (!this.f13663d && !this.f13665f) {
            this.f13660a.invalidate();
            m(true);
        }
    }

    @Override // c2.p1
    public final void j(long j10) {
        v1 v1Var = this.f13671l;
        int i10 = v1Var.i();
        int A = v1Var.A();
        int i11 = w2.h.f38792c;
        int i12 = (int) (j10 >> 32);
        int i13 = (int) (j10 & 4294967295L);
        if (i10 != i12 || A != i13) {
            if (i10 != i12) {
                v1Var.e(i12 - i10);
            }
            if (A != i13) {
                v1Var.t(i13 - A);
            }
            int i14 = Build.VERSION.SDK_INT;
            a0 a0Var = this.f13660a;
            if (i14 >= 26) {
                j4.f13470a.a(a0Var);
            } else {
                a0Var.invalidate();
            }
            this.f13668i.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // c2.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r4 = this;
            boolean r0 = r4.f13663d
            d2.v1 r1 = r4.f13671l
            if (r0 != 0) goto Lc
            boolean r0 = r1.v()
            if (r0 != 0) goto L2e
        Lc:
            boolean r0 = r1.F()
            if (r0 == 0) goto L20
            d2.k2 r0 = r4.f13664e
            boolean r2 = r0.f13481i
            r2 = r2 ^ 1
            if (r2 != 0) goto L20
            r0.e()
            n1.p0 r0 = r0.f13479g
            goto L21
        L20:
            r0 = 0
        L21:
            kotlin.jvm.functions.Function1 r2 = r4.f13661b
            if (r2 == 0) goto L2a
            e.l r3 = r4.f13669j
            r1.p(r3, r0, r2)
        L2a:
            r0 = 0
            r4.m(r0)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.w2.k():void");
    }

    @Override // c2.p1
    public final void l(c2.p0 p0Var, c2.e1 e1Var) {
        m(false);
        this.f13665f = false;
        this.f13666g = false;
        this.f13670k = n1.b1.f28120b;
        this.f13661b = e1Var;
        this.f13662c = p0Var;
    }

    public final void m(boolean z10) {
        if (z10 != this.f13663d) {
            this.f13663d = z10;
            this.f13660a.w(this, z10);
        }
    }
}
