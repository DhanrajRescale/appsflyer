package c;

import android.view.View;
import d0.c0;
import d0.f0;
import d0.r;
import d2.w1;
import kotlin.Unit;
import l0.v0;
import m0.z4;
import r0.j1;
import t0.n0;
import z2.p;

/* loaded from: classes.dex */
public final class c implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7408b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f7407a = i10;
        this.f7408b = obj;
    }

    @Override // t0.n0
    public final void a() {
        int i10 = this.f7407a;
        Unit unit = null;
        Object obj = this.f7408b;
        switch (i10) {
            case 0:
                e.c cVar = ((a) obj).f7405a;
                if (cVar != null) {
                    cVar.b();
                    unit = Unit.f23355a;
                }
                if (unit != null) {
                    return;
                } else {
                    throw new IllegalStateException("Launcher has not been initialized".toString());
                }
            case 1:
                ((i) obj).remove();
                return;
            case 2:
                ((r) obj).f13208d = null;
                return;
            case 3:
                ((f0) obj).f13160a = null;
                return;
            case 4:
                c0 c0Var = (c0) obj;
                int i11 = c0Var.f13150d.i();
                for (int i12 = 0; i12 < i11; i12++) {
                    c0Var.b();
                }
                return;
            case 5:
                ((v0) obj).l();
                return;
            case 6:
                z4 z4Var = (z4) obj;
                boolean z10 = z4Var.f27215c;
                View view = z4Var.f27213a;
                if (z10) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(z4Var);
                    z4Var.f27215c = false;
                }
                view.removeOnAttachStateChangeListener(z4Var);
                return;
            case 7:
                o0.k kVar = (o0.k) obj;
                kVar.c();
                yk.j.r1(kVar, null);
                kVar.f29356j.getViewTreeObserver().removeOnGlobalLayoutListener(kVar);
                kVar.f29357k.removeViewImmediate(kVar);
                return;
            case 8:
                j1 j1Var = (j1) obj;
                j1Var.c();
                yk.j.r1(j1Var, null);
                yk.g.Z(j1Var, null);
                j1Var.f32476k.getViewTreeObserver().removeOnGlobalLayoutListener(j1Var);
                j1Var.f32478m.removeViewImmediate(j1Var);
                return;
            case 9:
                ((w1) obj).f13658a.mo2invoke();
                return;
            case 10:
                p pVar = (p) obj;
                pVar.dismiss();
                pVar.f41948g.c();
                return;
            default:
                z2.r rVar = (z2.r) obj;
                rVar.c();
                yk.j.r1(rVar, null);
                rVar.f41960n.removeViewImmediate(rVar);
                return;
        }
    }
}
