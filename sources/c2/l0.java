package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f7755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f7756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(q0 q0Var, r1 r1Var, long j10) {
        super(0);
        this.f7755a = q0Var;
        this.f7756b = r1Var;
        this.f7757c = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        v0 U0;
        q0 q0Var = this.f7755a;
        a2.z0 z0Var = null;
        if (g.v(q0Var.f7813a)) {
            i1 i1Var = q0Var.a().f7723m;
            if (i1Var != null) {
                z0Var = i1Var.f7853h;
            }
        } else {
            i1 i1Var2 = q0Var.a().f7723m;
            if (i1Var2 != null && (U0 = i1Var2.U0()) != null) {
                z0Var = U0.f7853h;
            }
        }
        if (z0Var == null) {
            z0Var = ((d2.a0) this.f7756b).getPlacementScope();
        }
        v0 U02 = q0Var.a().U0();
        Intrinsics.c(U02);
        a2.z0.f(z0Var, U02, this.f7757c);
        return Unit.f23355a;
    }
}
