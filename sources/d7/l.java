package d7;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import b5.a1;
import b5.x0;
import b5.y0;

/* loaded from: classes.dex */
public final class l implements y0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f14064a;

    public l(x xVar) {
        this.f14064a = xVar;
    }

    @Override // b5.y0
    public final void H(x0 x0Var) {
        boolean a10 = x0Var.a(4, 5, 13);
        x xVar = this.f14064a;
        if (a10) {
            xVar.m();
        }
        if (x0Var.a(4, 5, 7, 13)) {
            xVar.o();
        }
        if (x0Var.a(8, 13)) {
            xVar.p();
        }
        if (x0Var.a(9, 13)) {
            xVar.r();
        }
        if (x0Var.a(8, 9, 11, 0, 16, 17, 13)) {
            xVar.l();
        }
        if (x0Var.a(11, 0, 13)) {
            xVar.s();
        }
        if (x0Var.a(12, 13)) {
            xVar.n();
        }
        if (x0Var.a(2, 13)) {
            xVar.t();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x xVar = this.f14064a;
        a1 a1Var = xVar.f14174y0;
        if (a1Var == null) {
            return;
        }
        d0 d0Var = xVar.f14130a;
        d0Var.h();
        if (xVar.f14152n == view) {
            b5.i iVar = (b5.i) a1Var;
            if (iVar.b(9)) {
                iVar.i();
                return;
            }
            return;
        }
        if (xVar.f14150m == view) {
            b5.i iVar2 = (b5.i) a1Var;
            if (iVar2.b(7)) {
                iVar2.k();
                return;
            }
            return;
        }
        if (xVar.f14155p == view) {
            if (((i5.g0) a1Var).B() != 4) {
                b5.i iVar3 = (b5.i) a1Var;
                if (iVar3.b(12)) {
                    i5.g0 g0Var = (i5.g0) iVar3;
                    g0Var.X();
                    iVar3.j(12, g0Var.f19476v);
                    return;
                }
                return;
            }
            return;
        }
        if (xVar.f14157q == view) {
            b5.i iVar4 = (b5.i) a1Var;
            if (iVar4.b(11)) {
                i5.g0 g0Var2 = (i5.g0) iVar4;
                g0Var2.X();
                iVar4.j(11, -g0Var2.f19475u);
                return;
            }
            return;
        }
        if (xVar.f14153o == view) {
            int i10 = e5.x.f15050a;
            i5.g0 g0Var3 = (i5.g0) a1Var;
            if (g0Var3.A() && g0Var3.B() != 1 && g0Var3.B() != 4) {
                b5.i iVar5 = (b5.i) a1Var;
                if (iVar5.b(1)) {
                    ((i5.g0) iVar5).N(false);
                    return;
                }
                return;
            }
            e5.x.A(a1Var);
            return;
        }
        if (xVar.f14163t == view) {
            if (((b5.i) a1Var).b(15)) {
                i5.g0 g0Var4 = (i5.g0) a1Var;
                g0Var4.X();
                int i11 = g0Var4.E;
                int i12 = xVar.H0;
                for (int i13 = 1; i13 <= 2; i13++) {
                    int i14 = (i11 + i13) % 3;
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2 && (i12 & 2) != 0) {
                            }
                        } else if ((i12 & 1) == 0) {
                        }
                    }
                    i11 = i14;
                }
                g0Var4.P(i11);
                return;
            }
            return;
        }
        if (xVar.f14165u == view) {
            if (((b5.i) a1Var).b(14)) {
                i5.g0 g0Var5 = (i5.g0) a1Var;
                g0Var5.X();
                boolean z10 = !g0Var5.F;
                g0Var5.X();
                if (g0Var5.F != z10) {
                    g0Var5.F = z10;
                    e5.t tVar = g0Var5.f19465k.f19558h;
                    tVar.getClass();
                    e5.s b10 = e5.t.b();
                    b10.f15042a = tVar.f15044a.obtainMessage(12, z10 ? 1 : 0, 0);
                    b10.b();
                    i5.x xVar2 = new i5.x(0, z10);
                    k3.f fVar = g0Var5.f19466l;
                    fVar.j(9, xVar2);
                    g0Var5.T();
                    fVar.g();
                    return;
                }
                return;
            }
            return;
        }
        View view2 = xVar.f14175z;
        if (view2 == view) {
            d0Var.g();
            xVar.e(xVar.f14136f, view2);
            return;
        }
        View view3 = xVar.A;
        if (view3 == view) {
            d0Var.g();
            xVar.e(xVar.f14138g, view3);
            return;
        }
        View view4 = xVar.B;
        if (view4 == view) {
            d0Var.g();
            xVar.e(xVar.f14142i, view4);
            return;
        }
        ImageView imageView = xVar.f14169w;
        if (imageView == view) {
            d0Var.g();
            xVar.e(xVar.f14140h, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        x xVar = this.f14064a;
        if (xVar.N0) {
            xVar.f14130a.h();
        }
    }
}
