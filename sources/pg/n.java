package pg;

import android.content.Context;
import c0.d0;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.l3;
import vt.g0;
import vt.i0;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f31061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f31062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f31063c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f31064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f31065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f31066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f31067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f31068h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f31069i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f31070j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ PortfolioFnoHoldingsViewModel f31071k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function2 f31072l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f31073m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c cVar, g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, Context context, g1 g1Var5, g1 g1Var6, Function0 function0, g1 g1Var7, PortfolioFnoHoldingsViewModel portfolioFnoHoldingsViewModel, Function2 function2, Function1 function1) {
        super(1);
        this.f31061a = cVar;
        this.f31062b = g1Var;
        this.f31063c = g1Var2;
        this.f31064d = g1Var3;
        this.f31065e = g1Var4;
        this.f31066f = context;
        this.f31067g = g1Var5;
        this.f31068h = g1Var6;
        this.f31069i = function0;
        this.f31070j = g1Var7;
        this.f31071k = portfolioFnoHoldingsViewModel;
        this.f31072l = function2;
        this.f31073m = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<OptionValue> optionValues;
        d0 LazyColumn = (d0) obj;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        l lVar = new l(this.f31062b, this.f31063c, this.f31064d, this.f31065e, this.f31066f, this.f31067g, this.f31068h, this.f31069i, this.f31070j);
        Object obj2 = b1.d.f3079a;
        d0.a(LazyColumn, new b1.c(lVar, true, 1520297562));
        FnoPortfolioHolding fnoPortfolioHolding = (FnoPortfolioHolding) this.f31062b.getValue();
        if (fnoPortfolioHolding != null) {
            optionValues = fnoPortfolioHolding.getOptionValues();
        } else {
            optionValues = null;
        }
        if (optionValues == null) {
            optionValues = i0.f38321a;
        }
        Intrinsics.checkNotNullParameter(optionValues, "optionValues");
        c filter = this.f31061a;
        Intrinsics.checkNotNullParameter(filter, "filter");
        int ordinal = filter.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            optionValues = g0.M(optionValues, new c2.p(16));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        optionValues = g0.M(optionValues, new c2.p(14));
                    }
                } else {
                    optionValues = g0.M(optionValues, new c2.p(15));
                }
            } else {
                optionValues = g0.M(optionValues, new c2.p(13));
            }
        }
        if (optionValues.isEmpty()) {
            d0.a(LazyColumn, b.f31016a);
            d0.a(LazyColumn, b.f31017b);
        } else {
            if (((Boolean) this.f31070j.getValue()).booleanValue()) {
                d0.a(LazyColumn, new b1.c(new v.g(this.f31071k, 14), true, -1452013701));
            } else {
                c0.j jVar = (c0.j) LazyColumn;
                jVar.a0(optionValues.size(), new lb.j(m.f31057b, optionValues, 15), new lb.j(m.f31058c, optionValues, 16), new b1.c(new ob.j(optionValues, this.f31072l, this.f31073m, 4), true, -632812321));
            }
            d0.a(LazyColumn, b.f31018c);
        }
        return Unit.f23355a;
    }
}
