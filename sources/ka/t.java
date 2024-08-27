package ka;

import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class t extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModifyOrderPageBottomSheetViewModel f22952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f22952a = modifyOrderPageBottomSheetViewModel;
        this.f22953b = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t(this.f22952a, this.f22953b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        this.f22952a.f8640o.m(this.f22953b.getValue());
        return Unit.f23355a;
    }
}
