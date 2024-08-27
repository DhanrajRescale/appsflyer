package tg;

import android.content.Context;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.portfolio.orders.Bought;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f36066b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(2);
        this.f36065a = i10;
        this.f36066b = oVar;
    }

    public final void a(Bought orderData) {
        int i10 = this.f36065a;
        o oVar = this.f36066b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(orderData, "orderData");
                PortfolioSharedViewModel portfolioSharedViewModel = oVar.f36069h;
                if (portfolioSharedViewModel != null) {
                    if (portfolioSharedViewModel.f9792d.getValue() == null) {
                        o.H(oVar, orderData);
                        return;
                    }
                    PortfolioSharedViewModel portfolioSharedViewModel2 = oVar.f36069h;
                    if (portfolioSharedViewModel2 != null) {
                        Object value = portfolioSharedViewModel2.f9792d.getValue();
                        Intrinsics.c(value);
                        int o02 = el.l.o0((ArenaGame) value);
                        if (o02 == 0) {
                            o.H(oVar, orderData);
                            return;
                        }
                        Context requireContext = oVar.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        hl.f.U0(requireContext, o02);
                        return;
                    }
                    Intrinsics.k("model");
                    throw null;
                }
                Intrinsics.k("model");
                throw null;
            default:
                Intrinsics.checkNotNullParameter(orderData, "orderData");
                PortfolioSharedViewModel portfolioSharedViewModel3 = oVar.f36069h;
                if (portfolioSharedViewModel3 != null) {
                    if (portfolioSharedViewModel3.f9792d.getValue() == null) {
                        o.I(oVar, orderData);
                        return;
                    }
                    PortfolioSharedViewModel portfolioSharedViewModel4 = oVar.f36069h;
                    if (portfolioSharedViewModel4 != null) {
                        Object value2 = portfolioSharedViewModel4.f9792d.getValue();
                        Intrinsics.c(value2);
                        int o03 = el.l.o0((ArenaGame) value2);
                        if (o03 == 0) {
                            o.I(oVar, orderData);
                            return;
                        }
                        Context requireContext2 = oVar.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                        hl.f.U0(requireContext2, o03);
                        return;
                    }
                    Intrinsics.k("model");
                    throw null;
                }
                Intrinsics.k("model");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f36065a) {
            case 0:
                ((Number) obj2).intValue();
                a((Bought) obj);
                return Unit.f23355a;
            default:
                ((Number) obj2).intValue();
                a((Bought) obj);
                return Unit.f23355a;
        }
    }
}
