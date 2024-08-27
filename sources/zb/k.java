package zb;

import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.s3;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f42282a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(float f10) {
        super(2);
        this.f42282a = f10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        if (this.f42282a == 1.0f) {
            i10 = R.drawable.ic_target_achieved_circle_indicator;
        } else {
            i10 = R.drawable.ic_unfilled_circle_indicator;
        }
        s3.a(w0.u(i10, nVar, 0), "Start", androidx.compose.foundation.layout.d.m(g1.l.f16404b, kp.j.R(18, nVar)), n1.t.f28177i, nVar, 3128, 0);
        return Unit.f23355a;
    }
}
