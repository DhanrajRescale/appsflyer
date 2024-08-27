package x;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class p implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f39661a;

    /* renamed from: b, reason: collision with root package name */
    public m1.c f39662b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f39663c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f39664d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f39665e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39666f;

    /* renamed from: g, reason: collision with root package name */
    public long f39667g;

    /* renamed from: h, reason: collision with root package name */
    public x1.s f39668h;

    /* renamed from: i, reason: collision with root package name */
    public final g1.o f39669i;

    public p(Context context, y1 y1Var) {
        this.f39661a = y1Var;
        this.f39663c = new s0(context, androidx.compose.ui.graphics.a.y(y1Var.f39786a));
        Unit unit = Unit.f23355a;
        this.f39664d = t0.t.n0(unit, t0.h1.f35033a);
        this.f39665e = true;
        this.f39667g = m1.f.f27251b;
        this.f39669i = androidx.compose.ui.layout.a.l(x1.h0.a(s.f39705a, unit, new n(this, null)), new o(this)).g(new r0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
    
        if (r8 != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0257, code lost:
    
        if (x.s0.f(r6.f39710e) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025c, code lost:
    
        if (r7 == false) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0223  */
    @Override // x.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r20, int r22, x.p2 r23) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.p.a(long, int, x.p2):long");
    }

    @Override // x.a2
    public final g1.o b() {
        return this.f39669i;
    }

    public final void c() {
        boolean z10;
        s0 s0Var = this.f39663c;
        EdgeEffect edgeEffect = s0Var.f39709d;
        boolean z11 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = s0Var.f39710e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (!edgeEffect2.isFinished() && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        EdgeEffect edgeEffect3 = s0Var.f39711f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() || z10) {
                z11 = true;
            }
            z10 = z11;
        }
        EdgeEffect edgeEffect4 = s0Var.f39712g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() && !z10) {
                return;
            }
        } else if (!z10) {
            return;
        }
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // x.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r12, y.i2 r14, yt.a r15) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.p.d(long, y.i2, yt.a):java.lang.Object");
    }

    @Override // x.a2
    public final boolean e() {
        float f10;
        float f11;
        float f12;
        float f13;
        s0 s0Var = this.f39663c;
        EdgeEffect edgeEffect = s0Var.f39709d;
        t tVar = t.f39720a;
        if (edgeEffect != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f13 = tVar.b(edgeEffect);
            } else {
                f13 = 0.0f;
            }
            if (f13 != s0.g.f34069a) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = s0Var.f39710e;
        if (edgeEffect2 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f12 = tVar.b(edgeEffect2);
            } else {
                f12 = 0.0f;
            }
            if (f12 != s0.g.f34069a) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = s0Var.f39711f;
        if (edgeEffect3 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f11 = tVar.b(edgeEffect3);
            } else {
                f11 = 0.0f;
            }
            if (f11 != s0.g.f34069a) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = s0Var.f39712g;
        if (edgeEffect4 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f10 = tVar.b(edgeEffect4);
            } else {
                f10 = 0.0f;
            }
            if (f10 != s0.g.f34069a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f(p1.h hVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-m1.f.e(this.f39667g), (-m1.f.c(this.f39667g)) + hVar.c0(this.f39661a.f39787b.a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean g(p1.h hVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-m1.f.c(this.f39667g), hVar.c0(this.f39661a.f39787b.d(hVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean h(p1.h hVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int b10 = ku.c.b(m1.f.e(this.f39667g));
        float b11 = this.f39661a.f39787b.b(hVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(s0.g.f34069a, hVar.c0(b11) + (-b10));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final void i() {
        if (this.f39665e) {
            this.f39664d.setValue(Unit.f23355a);
        }
    }

    public final float j(long j10, long j11) {
        float f10;
        float d10 = m1.c.d(j11) / m1.f.e(this.f39667g);
        float e10 = m1.c.e(j10) / m1.f.c(this.f39667g);
        EdgeEffect b10 = this.f39663c.b();
        float f11 = -e10;
        float f12 = 1 - d10;
        int i10 = Build.VERSION.SDK_INT;
        t tVar = t.f39720a;
        if (i10 >= 31) {
            f11 = tVar.c(b10, f11, f12);
        } else {
            b10.onPull(f11, f12);
        }
        float c10 = m1.f.c(this.f39667g) * (-f11);
        if (Build.VERSION.SDK_INT >= 31) {
            f10 = tVar.b(b10);
        } else {
            f10 = 0.0f;
        }
        if (f10 != s0.g.f34069a) {
            return m1.c.e(j10);
        }
        return c10;
    }

    public final float k(long j10, long j11) {
        float f10;
        float e10 = m1.c.e(j11) / m1.f.c(this.f39667g);
        float d10 = m1.c.d(j10) / m1.f.e(this.f39667g);
        EdgeEffect c10 = this.f39663c.c();
        float f11 = 1 - e10;
        int i10 = Build.VERSION.SDK_INT;
        t tVar = t.f39720a;
        if (i10 >= 31) {
            d10 = tVar.c(c10, d10, f11);
        } else {
            c10.onPull(d10, f11);
        }
        float e11 = m1.f.e(this.f39667g) * d10;
        if (Build.VERSION.SDK_INT >= 31) {
            f10 = tVar.b(c10);
        } else {
            f10 = 0.0f;
        }
        if (f10 != s0.g.f34069a) {
            return m1.c.d(j10);
        }
        return e11;
    }

    public final float l(long j10, long j11) {
        float f10;
        float e10 = m1.c.e(j11) / m1.f.c(this.f39667g);
        float d10 = m1.c.d(j10) / m1.f.e(this.f39667g);
        EdgeEffect d11 = this.f39663c.d();
        float f11 = -d10;
        int i10 = Build.VERSION.SDK_INT;
        t tVar = t.f39720a;
        if (i10 >= 31) {
            f11 = tVar.c(d11, f11, e10);
        } else {
            d11.onPull(f11, e10);
        }
        float e11 = m1.f.e(this.f39667g) * (-f11);
        if (Build.VERSION.SDK_INT >= 31) {
            f10 = tVar.b(d11);
        } else {
            f10 = 0.0f;
        }
        if (f10 != s0.g.f34069a) {
            return m1.c.d(j10);
        }
        return e11;
    }

    public final float m(long j10, long j11) {
        float f10;
        float d10 = m1.c.d(j11) / m1.f.e(this.f39667g);
        float e10 = m1.c.e(j10) / m1.f.c(this.f39667g);
        EdgeEffect e11 = this.f39663c.e();
        int i10 = Build.VERSION.SDK_INT;
        t tVar = t.f39720a;
        if (i10 >= 31) {
            e10 = tVar.c(e11, e10, d10);
        } else {
            e11.onPull(e10, d10);
        }
        float c10 = m1.f.c(this.f39667g) * e10;
        if (Build.VERSION.SDK_INT >= 31) {
            f10 = tVar.b(e11);
        } else {
            f10 = 0.0f;
        }
        if (f10 != s0.g.f34069a) {
            return m1.c.e(j10);
        }
        return c10;
    }
}
