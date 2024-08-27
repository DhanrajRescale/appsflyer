package com.assetgro.stockgro.ui.portfolio;

import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfolioSectionDto;
import gg.f;
import gg.h;
import gg.i;
import iu.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pj.a;
import tu.k1;
import tu.l1;
import tu.s0;
import vt.i0;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/PortfolioViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9771n;

    /* renamed from: o, reason: collision with root package name */
    public final k1 f9772o;

    /* renamed from: p, reason: collision with root package name */
    public final s0 f9773p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9771n = portfolioRepository;
        i0 i0Var = i0.f38321a;
        k1 a10 = l1.a(new f(new PortfolioSectionDto(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, i0Var), new PortfolioSectionDto(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, i0Var), false, false, false));
        this.f9772o = a10;
        this.f9773p = new s0(a10);
        portfolioRepository.getUserId();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h() {
        this.f9084g.postValue(Boolean.TRUE);
        z zVar = new z();
        z zVar2 = new z();
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            i(h.f17404k);
        } else {
            g.H(u0.f(this), null, null, new i(this, zVar, zVar2, null), 3);
        }
    }

    public final void i(qu.i0 stateEvents) {
        List<Portfolio> portfolios;
        PortfolioSectionDto portfolioSectionDto;
        List<Portfolio> portfolios2;
        Intrinsics.checkNotNullParameter(stateEvents, "stateEvents");
        boolean z10 = stateEvents instanceof gg.g;
        k1 k1Var = this.f9772o;
        if (z10) {
            f fVar = (f) k1Var.getValue();
            gg.g gVar = (gg.g) stateEvents;
            PortfolioSectionDto portfolioSectionDto2 = gVar.f17400i;
            PortfolioSectionDto portfolioSectionDto3 = gVar.f17401j;
            fVar.getClass();
            k1Var.m(new f(portfolioSectionDto2, portfolioSectionDto3, false, false, false));
            return;
        }
        if (Intrinsics.a(stateEvents, h.f17402i)) {
            k1Var.m(f.a((f) k1Var.getValue(), true, false, false, 27));
            h();
            return;
        }
        if (Intrinsics.a(stateEvents, h.f17403j)) {
            j();
            return;
        }
        if (Intrinsics.a(stateEvents, h.f17404k)) {
            PortfolioSectionDto portfolioSectionDto4 = ((f) k1Var.getValue()).f17395a;
            if (portfolioSectionDto4 != null && (portfolios = portfolioSectionDto4.getPortfolios()) != null && portfolios.isEmpty() && (portfolioSectionDto = ((f) k1Var.getValue()).f17396b) != null && (portfolios2 = portfolioSectionDto.getPortfolios()) != null && portfolios2.isEmpty()) {
                k1Var.m(f.a((f) k1Var.getValue(), false, false, true, 15));
                return;
            }
            return;
        }
        if (Intrinsics.a(stateEvents, h.f17405l)) {
            j();
        } else if (Intrinsics.a(stateEvents, h.f17406m)) {
            h();
        }
    }

    public final void j() {
        k1 k1Var = this.f9772o;
        if (!((f) k1Var.getValue()).f17399e) {
            k1Var.m(f.a((f) k1Var.getValue(), false, true, false, 23));
        } else {
            k1Var.m(f.a((f) k1Var.getValue(), false, false, false, 23));
        }
        h();
    }
}
