package d2;

import android.graphics.Outline;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public w2.b f13473a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13474b = true;

    /* renamed from: c, reason: collision with root package name */
    public final Outline f13475c;

    /* renamed from: d, reason: collision with root package name */
    public long f13476d;

    /* renamed from: e, reason: collision with root package name */
    public n1.x0 f13477e;

    /* renamed from: f, reason: collision with root package name */
    public n1.h f13478f;

    /* renamed from: g, reason: collision with root package name */
    public n1.p0 f13479g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13480h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13481i;

    /* renamed from: j, reason: collision with root package name */
    public n1.p0 f13482j;

    /* renamed from: k, reason: collision with root package name */
    public m1.e f13483k;

    /* renamed from: l, reason: collision with root package name */
    public float f13484l;

    /* renamed from: m, reason: collision with root package name */
    public long f13485m;

    /* renamed from: n, reason: collision with root package name */
    public long f13486n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13487o;

    /* renamed from: p, reason: collision with root package name */
    public w2.k f13488p;

    /* renamed from: q, reason: collision with root package name */
    public n1.o0 f13489q;

    public k2(w2.b bVar) {
        this.f13473a = bVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f13475c = outline;
        long j10 = m1.f.f27251b;
        this.f13476d = j10;
        this.f13477e = n1.s0.f28162a;
        this.f13485m = m1.c.f27233b;
        this.f13486n = j10;
        this.f13488p = w2.k.f38799a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (m1.a.b(r5.f27247e) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n1.r r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r20.e()
            n1.p0 r2 = r0.f13479g
            r3 = 1
            if (r2 == 0) goto L11
            r1.u(r2, r3)
            goto Lf2
        L11:
            float r2 = r0.f13484l
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lc6
            n1.p0 r4 = r0.f13482j
            m1.e r5 = r0.f13483k
            if (r4 == 0) goto L68
            long r6 = r0.f13485m
            long r8 = r0.f13486n
            if (r5 == 0) goto L68
            boolean r10 = t0.t.d0(r5)
            if (r10 != 0) goto L2b
            goto L68
        L2b:
            float r10 = m1.c.d(r6)
            float r11 = r5.f27243a
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = m1.c.e(r6)
            float r11 = r5.f27244b
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = m1.c.d(r6)
            float r11 = m1.f.e(r8)
            float r11 = r11 + r10
            float r10 = r5.f27245c
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L68
            float r6 = m1.c.e(r6)
            float r7 = m1.f.c(r8)
            float r7 = r7 + r6
            float r6 = r5.f27246d
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L68
            long r5 = r5.f27247e
            float r5 = m1.a.b(r5)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lc2
        L68:
            long r5 = r0.f13485m
            float r8 = m1.c.d(r5)
            long r5 = r0.f13485m
            float r9 = m1.c.e(r5)
            long r5 = r0.f13485m
            float r2 = m1.c.d(r5)
            long r5 = r0.f13486n
            float r5 = m1.f.e(r5)
            float r10 = r5 + r2
            long r5 = r0.f13485m
            float r2 = m1.c.e(r5)
            long r5 = r0.f13486n
            float r5 = m1.f.c(r5)
            float r11 = r5 + r2
            float r2 = r0.f13484l
            long r5 = t0.t.a(r2, r2)
            float r2 = m1.a.b(r5)
            float r5 = m1.a.c(r5)
            long r18 = t0.t.a(r2, r5)
            m1.e r2 = new m1.e
            r7 = r2
            r12 = r18
            r14 = r18
            r16 = r18
            r7.<init>(r8, r9, r10, r11, r12, r14, r16, r18)
            if (r4 != 0) goto Lb5
            n1.h r4 = androidx.compose.ui.graphics.a.h()
            goto Lbb
        Lb5:
            r5 = r4
            n1.h r5 = (n1.h) r5
            r5.h()
        Lbb:
            n1.p0.b(r4, r2)
            r0.f13483k = r2
            r0.f13482j = r4
        Lc2:
            r1.u(r4, r3)
            goto Lf2
        Lc6:
            long r2 = r0.f13485m
            float r2 = m1.c.d(r2)
            long r3 = r0.f13485m
            float r3 = m1.c.e(r3)
            long r4 = r0.f13485m
            float r4 = m1.c.d(r4)
            long r5 = r0.f13486n
            float r5 = m1.f.e(r5)
            float r4 = r4 + r5
            long r5 = r0.f13485m
            float r5 = m1.c.e(r5)
            long r6 = r0.f13486n
            float r6 = m1.f.c(r6)
            float r5 = r5 + r6
            r6 = 1
            r1 = r21
            r1.q(r2, r3, r4, r5, r6)
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.k2.a(n1.r):void");
    }

    public final Outline b() {
        e();
        if (this.f13487o && this.f13474b) {
            return this.f13475c;
        }
        return null;
    }

    public final boolean c(long j10) {
        n1.o0 o0Var;
        float f10;
        boolean z10;
        if (!this.f13487o || (o0Var = this.f13489q) == null) {
            return true;
        }
        float d10 = m1.c.d(j10);
        float e10 = m1.c.e(j10);
        boolean z11 = false;
        if (o0Var instanceof n1.m0) {
            m1.d dVar = ((n1.m0) o0Var).f28155a;
            if (dVar.f27239a <= d10 && d10 < dVar.f27241c && dVar.f27240b <= e10 && e10 < dVar.f27242d) {
                return true;
            }
        } else if (o0Var instanceof n1.n0) {
            m1.e eVar = ((n1.n0) o0Var).f28157a;
            if (d10 >= eVar.f27243a) {
                float f11 = eVar.f27245c;
                if (d10 < f11) {
                    float f12 = eVar.f27244b;
                    if (e10 >= f12) {
                        float f13 = eVar.f27246d;
                        if (e10 < f13) {
                            long j11 = eVar.f27247e;
                            float b10 = m1.a.b(j11);
                            long j12 = eVar.f27248f;
                            if (m1.a.b(j12) + b10 <= eVar.b()) {
                                long j13 = eVar.f27250h;
                                float b11 = m1.a.b(j13);
                                f10 = d10;
                                long j14 = eVar.f27249g;
                                if (m1.a.b(j14) + b11 <= eVar.b()) {
                                    if (m1.a.c(j13) + m1.a.c(j11) <= eVar.a()) {
                                        if (m1.a.c(j14) + m1.a.c(j12) <= eVar.a()) {
                                            float b12 = m1.a.b(j11);
                                            float f14 = eVar.f27243a;
                                            float f15 = b12 + f14;
                                            float c10 = m1.a.c(j11) + f12;
                                            float b13 = f11 - m1.a.b(j12);
                                            float c11 = f12 + m1.a.c(j12);
                                            float b14 = f11 - m1.a.b(j14);
                                            float c12 = f13 - m1.a.c(j14);
                                            float c13 = f13 - m1.a.c(j13);
                                            float b15 = f14 + m1.a.b(j13);
                                            if (f10 < f15 && e10 < c10) {
                                                z10 = t0.t.f0(f10, e10, f15, c10, eVar.f27247e);
                                            } else if (f10 < b15 && e10 > c13) {
                                                z10 = t0.t.f0(f10, e10, b15, c13, eVar.f27250h);
                                            } else if (f10 > b13 && e10 < c11) {
                                                z10 = t0.t.f0(f10, e10, b13, c11, eVar.f27248f);
                                            } else if (f10 > b14 && e10 > c12) {
                                                z10 = t0.t.f0(f10, e10, b14, c12, eVar.f27249g);
                                            } else {
                                                z10 = true;
                                            }
                                            z11 = z10;
                                        }
                                    }
                                }
                            } else {
                                f10 = d10;
                            }
                            n1.h h10 = androidx.compose.ui.graphics.a.h();
                            n1.p0.b(h10, eVar);
                            z11 = t0.t.a0(h10, f10, e10);
                        }
                    }
                }
            }
        } else {
            if (o0Var instanceof n1.l0) {
                return t0.t.a0(((n1.l0) o0Var).f28152a, d10, e10);
            }
            throw new NoWhenBranchMatchedException();
        }
        return z11;
    }

    public final boolean d(n1.x0 x0Var, float f10, boolean z10, float f11, w2.k kVar, w2.b bVar) {
        boolean z11;
        this.f13475c.setAlpha(f10);
        boolean z12 = !Intrinsics.a(this.f13477e, x0Var);
        if (z12) {
            this.f13477e = x0Var;
            this.f13480h = true;
        }
        if (!z10 && f11 <= s0.g.f34069a) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f13487o != z11) {
            this.f13487o = z11;
            this.f13480h = true;
        }
        if (this.f13488p != kVar) {
            this.f13488p = kVar;
            this.f13480h = true;
        }
        if (!Intrinsics.a(this.f13473a, bVar)) {
            this.f13473a = bVar;
            this.f13480h = true;
        }
        return z12;
    }

    public final void e() {
        if (this.f13480h) {
            this.f13485m = m1.c.f27233b;
            long j10 = this.f13476d;
            this.f13486n = j10;
            this.f13484l = s0.g.f34069a;
            this.f13479g = null;
            this.f13480h = false;
            this.f13481i = false;
            boolean z10 = this.f13487o;
            Outline outline = this.f13475c;
            if (z10 && m1.f.e(j10) > s0.g.f34069a && m1.f.c(this.f13476d) > s0.g.f34069a) {
                this.f13474b = true;
                n1.o0 d10 = this.f13477e.d(this.f13476d, this.f13488p, this.f13473a);
                this.f13489q = d10;
                if (d10 instanceof n1.m0) {
                    m1.d dVar = ((n1.m0) d10).f28155a;
                    float f10 = dVar.f27239a;
                    float f11 = dVar.f27240b;
                    this.f13485m = t0.t.g(f10, f11);
                    this.f13486n = t0.t.j(dVar.c(), dVar.b());
                    outline.setRect(Math.round(dVar.f27239a), Math.round(f11), Math.round(dVar.f27241c), Math.round(dVar.f27242d));
                    return;
                }
                if (d10 instanceof n1.n0) {
                    m1.e eVar = ((n1.n0) d10).f28157a;
                    float b10 = m1.a.b(eVar.f27247e);
                    float f12 = eVar.f27243a;
                    float f13 = eVar.f27244b;
                    this.f13485m = t0.t.g(f12, f13);
                    this.f13486n = t0.t.j(eVar.b(), eVar.a());
                    if (t0.t.d0(eVar)) {
                        this.f13475c.setRoundRect(Math.round(f12), Math.round(f13), Math.round(eVar.f27245c), Math.round(eVar.f27246d), b10);
                        this.f13484l = b10;
                        return;
                    }
                    n1.h hVar = this.f13478f;
                    if (hVar == null) {
                        hVar = androidx.compose.ui.graphics.a.h();
                        this.f13478f = hVar;
                    }
                    hVar.h();
                    n1.p0.b(hVar, eVar);
                    f(hVar);
                    return;
                }
                if (d10 instanceof n1.l0) {
                    f(((n1.l0) d10).f28152a);
                    return;
                }
                return;
            }
            outline.setEmpty();
        }
    }

    public final void f(n1.p0 p0Var) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f13475c;
        if (i10 <= 28 && !((n1.h) p0Var).f28138a.isConvex()) {
            this.f13474b = false;
            outline.setEmpty();
            this.f13481i = true;
        } else if (p0Var instanceof n1.h) {
            outline.setConvexPath(((n1.h) p0Var).f28138a);
            this.f13481i = !outline.canClip();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f13479g = p0Var;
    }
}
