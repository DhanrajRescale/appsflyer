package x;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0 extends d2.g2 implements k1.f {

    /* renamed from: c, reason: collision with root package name */
    public final p f39703c;

    public r0(p pVar) {
        super(d2.s.f13613k);
        this.f39703c = pVar;
    }

    @Override // k1.f
    public final void e(p1.e eVar) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        c2.j0 j0Var = (c2.j0) eVar;
        j0Var.a();
        p pVar = this.f39703c;
        if (!m1.f.f(pVar.f39667g)) {
            n1.r a10 = j0Var.f7740a.f30501b.a();
            pVar.f39664d.getValue();
            Canvas a11 = n1.d.a(a10);
            s0 s0Var = pVar.f39663c;
            if (s0.g(s0Var.f39715j)) {
                EdgeEffect edgeEffect = s0Var.f39715j;
                if (edgeEffect == null) {
                    edgeEffect = s0Var.a();
                    s0Var.f39715j = edgeEffect;
                }
                pVar.h(j0Var, edgeEffect, a11);
                edgeEffect.finish();
            }
            boolean f14 = s0.f(s0Var.f39711f);
            t tVar = t.f39720a;
            boolean z11 = false;
            if (f14) {
                EdgeEffect c10 = s0Var.c();
                z10 = pVar.g(j0Var, c10, a11);
                if (s0.g(s0Var.f39711f)) {
                    EdgeEffect edgeEffect2 = s0Var.f39715j;
                    if (edgeEffect2 == null) {
                        edgeEffect2 = s0Var.a();
                        s0Var.f39715j = edgeEffect2;
                    }
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 31) {
                        f13 = tVar.b(c10);
                    } else {
                        f13 = 0.0f;
                    }
                    if (i10 >= 31) {
                        tVar.c(edgeEffect2, f13, s0.g.f34069a);
                    } else {
                        edgeEffect2.onPull(f13, s0.g.f34069a);
                    }
                }
            } else {
                z10 = false;
            }
            if (s0.g(s0Var.f39713h)) {
                EdgeEffect edgeEffect3 = s0Var.f39713h;
                if (edgeEffect3 == null) {
                    edgeEffect3 = s0Var.a();
                    s0Var.f39713h = edgeEffect3;
                }
                pVar.f(j0Var, edgeEffect3, a11);
                edgeEffect3.finish();
            }
            boolean f15 = s0.f(s0Var.f39709d);
            y1 y1Var = pVar.f39661a;
            if (f15) {
                EdgeEffect e10 = s0Var.e();
                int save = a11.save();
                a11.translate(s0.g.f34069a, j0Var.c0(y1Var.f39787b.c()));
                boolean draw = e10.draw(a11);
                a11.restoreToCount(save);
                if (!draw && !z10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (s0.g(s0Var.f39709d)) {
                    EdgeEffect edgeEffect4 = s0Var.f39713h;
                    if (edgeEffect4 == null) {
                        edgeEffect4 = s0Var.a();
                        s0Var.f39713h = edgeEffect4;
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 31) {
                        f12 = tVar.b(e10);
                    } else {
                        f12 = 0.0f;
                    }
                    if (i11 >= 31) {
                        tVar.c(edgeEffect4, f12, s0.g.f34069a);
                    } else {
                        edgeEffect4.onPull(f12, s0.g.f34069a);
                    }
                }
            }
            if (s0.g(s0Var.f39716k)) {
                EdgeEffect edgeEffect5 = s0Var.f39716k;
                if (edgeEffect5 == null) {
                    edgeEffect5 = s0Var.a();
                    s0Var.f39716k = edgeEffect5;
                }
                pVar.g(j0Var, edgeEffect5, a11);
                edgeEffect5.finish();
            }
            if (s0.f(s0Var.f39712g)) {
                EdgeEffect d10 = s0Var.d();
                if (!pVar.h(j0Var, d10, a11) && !z10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (s0.g(s0Var.f39712g)) {
                    EdgeEffect edgeEffect6 = s0Var.f39716k;
                    if (edgeEffect6 == null) {
                        edgeEffect6 = s0Var.a();
                        s0Var.f39716k = edgeEffect6;
                    }
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 31) {
                        f11 = tVar.b(d10);
                    } else {
                        f11 = 0.0f;
                    }
                    if (i12 >= 31) {
                        tVar.c(edgeEffect6, f11, s0.g.f34069a);
                    } else {
                        edgeEffect6.onPull(f11, s0.g.f34069a);
                    }
                }
            }
            if (s0.g(s0Var.f39714i)) {
                EdgeEffect edgeEffect7 = s0Var.f39714i;
                if (edgeEffect7 == null) {
                    edgeEffect7 = s0Var.a();
                    s0Var.f39714i = edgeEffect7;
                }
                int save2 = a11.save();
                a11.translate(s0.g.f34069a, j0Var.c0(y1Var.f39787b.c()));
                edgeEffect7.draw(a11);
                a11.restoreToCount(save2);
                edgeEffect7.finish();
            }
            if (s0.f(s0Var.f39710e)) {
                EdgeEffect b10 = s0Var.b();
                if (pVar.f(j0Var, b10, a11) || z10) {
                    z11 = true;
                }
                if (s0.g(s0Var.f39710e)) {
                    EdgeEffect edgeEffect8 = s0Var.f39714i;
                    if (edgeEffect8 == null) {
                        edgeEffect8 = s0Var.a();
                        s0Var.f39714i = edgeEffect8;
                    }
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 31) {
                        f10 = tVar.b(b10);
                    } else {
                        f10 = 0.0f;
                    }
                    if (i13 >= 31) {
                        tVar.c(edgeEffect8, f10, s0.g.f34069a);
                    } else {
                        edgeEffect8.onPull(f10, s0.g.f34069a);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                pVar.i();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        return Intrinsics.a(this.f39703c, ((r0) obj).f39703c);
    }

    public final int hashCode() {
        return this.f39703c.hashCode();
    }

    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f39703c + ')';
    }
}
