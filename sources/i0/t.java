package i0;

import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f19198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f19199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Function1 function1, t0.g1 g1Var, int i10) {
        super(1);
        this.f19197a = i10;
        this.f19199c = function1;
        this.f19198b = g1Var;
    }

    public final void a(String it) {
        int i10 = this.f19197a;
        Function1 function1 = this.f19199c;
        t0.g1 g1Var = this.f19198b;
        switch (i10) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(kotlin.text.y.a0(30, it));
                function1.invoke((String) g1Var.getValue());
                return;
            case 5:
                Intrinsics.checkNotNullParameter(it, "cardId");
                g1Var.setValue(Boolean.TRUE);
                function1.invoke(it);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "newValue");
                Double e10 = kotlin.text.q.e(it);
                if ((e10 != null && e10.doubleValue() <= 999999.0d) || kotlin.text.w.C(it)) {
                    g1Var.setValue(it);
                    function1.invoke(it);
                    return;
                }
                return;
        }
    }

    public final void d(long j10) {
        int i10 = this.f19197a;
        Function1 function1 = this.f19199c;
        t0.g1 g1Var = this.f19198b;
        switch (i10) {
            case 1:
                j2.e0 e0Var = (j2.e0) g1Var.getValue();
                if (e0Var != null) {
                    function1.invoke(Integer.valueOf(e0Var.l(j10)));
                    return;
                }
                return;
            default:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f19197a;
        Function1 function1 = this.f19199c;
        t0.g1 g1Var = this.f19198b;
        switch (i10) {
            case 0:
                j2.e0 e0Var = (j2.e0) obj;
                g1Var.setValue(e0Var);
                function1.invoke(e0Var);
                return Unit.f23355a;
            case 1:
                d(((m1.c) obj).f27237a);
                return Unit.f23355a;
            case 2:
                FnoPortfolio it = (FnoPortfolio) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(it);
                function1.invoke(it);
                return Unit.f23355a;
            case 3:
                d(((m1.c) obj).f27237a);
                return Unit.f23355a;
            case 4:
                a((String) obj);
                return Unit.f23355a;
            case 5:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(t0.g1 g1Var, Function1 function1, int i10) {
        super(1);
        this.f19197a = i10;
        this.f19198b = g1Var;
        this.f19199c = function1;
    }
}
