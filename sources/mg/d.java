package mg;

import au.i;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import t0.g1;
import ut.n;

/* loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PortfolioFnoHistoryViewModel f27750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f27751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f27752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel, List list, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f27750a = portfolioFnoHistoryViewModel;
        this.f27751b = list;
        this.f27752c = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f27750a, this.f27751b, this.f27752c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        g1 g1Var = this.f27752c;
        int intValue = ((Number) g1Var.getValue()).intValue();
        List list = this.f27751b;
        String str = (String) list.get(intValue);
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        PortfolioFnoHistoryViewModel portfolioFnoHistoryViewModel = this.f27750a;
        portfolioFnoHistoryViewModel.h(lowerCase, null, null, null);
        String lowerCase2 = ((String) list.get(((Number) g1Var.getValue()).intValue())).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        Intrinsics.checkNotNullParameter(lowerCase2, "<set-?>");
        portfolioFnoHistoryViewModel.f9816s = lowerCase2;
        return Unit.f23355a;
    }
}
