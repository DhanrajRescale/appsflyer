package ta;

import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import d2.y3;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f35648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, yt.a aVar) {
        super(2, aVar);
        this.f35648b = hVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f35648b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35647a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            h hVar = this.f35648b;
            MarketStocksListViewModel marketStocksListViewModel = (MarketStocksListViewModel) hVar.r();
            y3 y3Var = new y3(hVar, 6);
            this.f35647a = 1;
            if (marketStocksListViewModel.f8674q.f36547a.c(y3Var, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
