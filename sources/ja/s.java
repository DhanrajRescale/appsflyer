package ja;

import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class s extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketOptionsListViewModel f21290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MarketOptionsListViewModel marketOptionsListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f21290b = marketOptionsListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        s sVar = new s(this.f21290b, aVar);
        sVar.f21289a = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        f0 f0Var = (f0) this.f21289a;
        Long l10 = new Long(10000L);
        MarketOptionsListViewModel marketOptionsListViewModel = this.f21290b;
        fd.c c10 = sb.b.c("refreshOptionsList", l10, f0Var, new r(marketOptionsListViewModel, null));
        marketOptionsListViewModel.getClass();
        Intrinsics.checkNotNullParameter(c10, "<set-?>");
        marketOptionsListViewModel.f8631r = c10;
        return Unit.f23355a;
    }
}
