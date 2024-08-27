package ja;

import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketOptionsListViewModel f21285b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MarketOptionsListViewModel marketOptionsListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f21285b = marketOptionsListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        p pVar = new p(this.f21285b, aVar);
        pVar.f21284a = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [au.i, kotlin.jvm.functions.Function1] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        fd.c cVar = new fd.c("refreshOptionsList", new Long(10000L), (f0) this.f21284a, new au.i(1, null));
        MarketOptionsListViewModel marketOptionsListViewModel = this.f21285b;
        marketOptionsListViewModel.getClass();
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        marketOptionsListViewModel.f8631r = cVar;
        return Unit.f23355a;
    }
}
