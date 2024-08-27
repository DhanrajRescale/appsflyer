package pd;

import d2.d3;
import d2.u1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3 f30948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f30949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(d3 d3Var, g1 g1Var, int i10) {
        super(1);
        this.f30947a = i10;
        this.f30948b = d3Var;
        this.f30949c = g1Var;
    }

    public final void a(String it) {
        int i10 = this.f30947a;
        d3 d3Var = this.f30948b;
        g1 g1Var = this.f30949c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(it);
                if (d3Var != null) {
                    ((u1) d3Var).a();
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(it);
                if (d3Var != null) {
                    ((u1) d3Var).a();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f30947a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
