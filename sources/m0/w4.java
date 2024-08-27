package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27019a;

    /* renamed from: b, reason: collision with root package name */
    public final y f27020b;

    /* renamed from: c, reason: collision with root package name */
    public w2.b f27021c;

    public w4(x4 x4Var, w.n nVar, boolean z10, Function1 function1) {
        this.f27019a = z10;
        int i10 = 1;
        this.f27020b = new y(x4Var, new i4(this, i10), new o2(this, i10), nVar, function1);
        if (z10 && x4Var == x4.f27083c) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
        }
    }

    public static final w2.b a(w4 w4Var) {
        w2.b bVar = w4Var.f27021c;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(("The density on ModalBottomSheetState (" + w4Var + ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?").toString());
    }

    public static Object b(w4 w4Var, x4 x4Var, yt.a aVar) {
        Object s7 = pp.b.s(w4Var.f27020b, x4Var, w4Var.f27020b.f27124k.i(), aVar);
        if (s7 != zt.a.f42823a) {
            return Unit.f23355a;
        }
        return s7;
    }

    public final x4 c() {
        return (x4) this.f27020b.f27120g.getValue();
    }

    public final Object d(yt.a aVar) {
        Object b10 = b(this, x4.f27081a, aVar);
        if (b10 == zt.a.f42823a) {
            return b10;
        }
        return Unit.f23355a;
    }

    public final Object e(yt.a aVar) {
        y3 d10 = this.f27020b.d();
        x4 x4Var = x4.f27083c;
        if (!d10.f27137a.containsKey(x4Var)) {
            x4Var = x4.f27082b;
        }
        Object b10 = b(this, x4Var, aVar);
        if (b10 == zt.a.f42823a) {
            return b10;
        }
        return Unit.f23355a;
    }
}
