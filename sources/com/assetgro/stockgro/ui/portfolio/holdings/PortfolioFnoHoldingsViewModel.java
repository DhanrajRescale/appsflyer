package com.assetgro.stockgro.ui.portfolio.holdings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import com.assetgro.stockgro.feature_market.data.remote.PositionItem;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionType;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlin.text.r;
import ni.j;
import pg.c;
import pj.a;
import t0.n1;
import t0.o3;
import t0.t;
import tu.k1;
import tu.l1;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/holdings/PortfolioFnoHoldingsViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioFnoHoldingsViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9825n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f9826o;

    /* renamed from: p, reason: collision with root package name */
    public String f9827p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f9828q;

    /* renamed from: r, reason: collision with root package name */
    public final n1 f9829r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9830s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9831t;

    /* renamed from: u, reason: collision with root package name */
    public final k1 f9832u;

    /* renamed from: v, reason: collision with root package name */
    public Portfolio f9833v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PortfolioFnoHoldingsViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9825n = portfolioRepository;
        portfolioRepository.getUserId();
        this.f9826o = new ArrayList();
        this.f9828q = new ArrayList();
        this.f9829r = t.n0(c.f31020a, o3.f35116a);
        ?? liveData = new LiveData();
        this.f9830s = liveData;
        this.f9831t = liveData;
        this.f9832u = l1.a(Boolean.FALSE);
    }

    public static OptionContract h(OptionValue optionValue) {
        OptionType optionType;
        double d10;
        double d11;
        String str;
        int i10;
        Intrinsics.checkNotNullParameter(optionValue, "optionValue");
        String optionType2 = optionValue.getOptionType();
        if (Intrinsics.a(optionType2, "call")) {
            optionType = OptionType.CALL;
        } else if (Intrinsics.a(optionType2, "put")) {
            optionType = OptionType.PUT;
        } else {
            optionType = OptionType.CALL;
        }
        OptionType optionType3 = optionType;
        String contractName = optionValue.getContractName();
        String contractSym = optionValue.getContractSym();
        Double e10 = q.e(optionValue.getLtp());
        if (e10 != null) {
            d10 = e10.doubleValue();
        } else {
            d10 = 0.0d;
        }
        Double e11 = q.e(optionValue.getMarginPrice());
        if (e11 != null) {
            d11 = e11.doubleValue();
        } else {
            d11 = 0.0d;
        }
        if (optionValue.isLong()) {
            str = "buy";
        } else {
            str = "sell";
        }
        Integer g10 = r.g(optionValue.getOpenPos());
        if (g10 != null) {
            i10 = g10.intValue();
        } else {
            i10 = 0;
        }
        return new OptionContract(optionType3, contractName, contractSym, 0.0d, null, d10, 0.0d, IdManager.DEFAULT_VERSION_NAME, d11, false, new PositionItem(str, i10));
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void i() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        try {
            g.H(u0.f(this), null, null, new og.c(this, null), 3);
        } catch (Exception unused) {
            this.f9084g.setValue(Boolean.FALSE);
        }
    }
}
