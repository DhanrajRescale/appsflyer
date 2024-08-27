package h;

import android.view.Window;
import m.x1;

/* loaded from: classes.dex */
public final class s implements x1, l.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f17737a;

    public /* synthetic */ s(e0 e0Var) {
        this.f17737a = e0Var;
    }

    @Override // l.b0
    public final void b(l.o oVar, boolean z10) {
        boolean z11;
        int i10;
        d0 d0Var;
        l.o k10 = oVar.k();
        int i11 = 0;
        if (k10 != oVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            oVar = k10;
        }
        e0 e0Var = this.f17737a;
        d0[] d0VarArr = e0Var.Z;
        if (d0VarArr != null) {
            i10 = d0VarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                d0Var = d0VarArr[i11];
                if (d0Var != null && d0Var.f17597h == oVar) {
                    break;
                } else {
                    i11++;
                }
            } else {
                d0Var = null;
                break;
            }
        }
        if (d0Var != null) {
            if (z11) {
                e0Var.p(d0Var.f17590a, d0Var, k10);
                e0Var.r(d0Var, true);
            } else {
                e0Var.r(d0Var, z10);
            }
        }
    }

    @Override // l.b0
    public final boolean e(l.o oVar) {
        Window.Callback callback;
        if (oVar == oVar.k()) {
            e0 e0Var = this.f17737a;
            if (e0Var.G && (callback = e0Var.f17634l.getCallback()) != null && !e0Var.f17629i0) {
                callback.onMenuOpened(108, oVar);
                return true;
            }
            return true;
        }
        return true;
    }
}
