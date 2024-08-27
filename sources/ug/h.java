package ug;

import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import t0.g1;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PortfolioFnoOrdersViewModel f37180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f37181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f37182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PortfolioFnoOrdersViewModel portfolioFnoOrdersViewModel, List list, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f37180a = portfolioFnoOrdersViewModel;
        this.f37181b = list;
        this.f37182c = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f37180a, this.f37181b, this.f37182c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        String lowerCase = ((String) this.f37181b.get(((Number) this.f37182c.getValue()).intValue())).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f37180a.i(lowerCase);
        return Unit.f23355a;
    }
}
