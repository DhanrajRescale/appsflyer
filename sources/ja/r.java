package ja;

import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarketOptionsListViewModel f21288a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(MarketOptionsListViewModel marketOptionsListViewModel, yt.a aVar) {
        super(1, aVar);
        this.f21288a = marketOptionsListViewModel;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new r(this.f21288a, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((r) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        this.f21288a.h();
        return Unit.f23355a;
    }
}
