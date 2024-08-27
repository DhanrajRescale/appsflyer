package com.assetgro.stockgro.feature_market.presentation.fno.details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import f7.i;
import ha.w;
import ha.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import okhttp3.HttpUrl;
import pj.a;
import retrofit2.HttpException;
import ut.p;
import yk.g;
import z9.h;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/details/OptionOrderPageBottomSheetViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseBottomSheetViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OptionOrderPageBottomSheetViewModel extends BaseBottomSheetViewModel {

    /* renamed from: g, reason: collision with root package name */
    public final FnoRepository f8608g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f8609h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f8610i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8611j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8612k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8613l;

    /* renamed from: m, reason: collision with root package name */
    public String f8614m;

    /* renamed from: n, reason: collision with root package name */
    public FnoPortfolioHolding f8615n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8616o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8617p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8618q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8619r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8620s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8621t;

    /* renamed from: u, reason: collision with root package name */
    public BuySellModifyFnoRequestDto f8622u;

    /* renamed from: v, reason: collision with root package name */
    public Double f8623v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f8624w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public OptionOrderPageBottomSheetViewModel(a schedulerProvider, ct.a compositeDisposable, FnoRepository fnoRepository) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        this.f8608g = fnoRepository;
        ?? liveData = new LiveData();
        this.f8609h = liveData;
        ?? liveData2 = new LiveData();
        this.f8610i = liveData2;
        this.f8612k = true;
        this.f8614m = HttpUrl.FRAGMENT_ENCODE_SET;
        ?? liveData3 = new LiveData();
        this.f8616o = liveData3;
        this.f8617p = liveData3;
        ?? liveData4 = new LiveData();
        this.f8618q = liveData4;
        this.f8619r = liveData4;
        ?? liveData5 = new LiveData();
        this.f8620s = liveData5;
        this.f8621t = liveData5;
        d0 d0Var = new d0();
        d0Var.a(liveData, new i(5, new y(this, d0Var, 0)));
        d0Var.a(liveData2, new i(5, new y(this, d0Var, 1)));
        d0Var.a(liveData3, new i(5, new y(this, d0Var, 2)));
        this.f8624w = d0Var;
    }

    public static final void f(OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel, d0 d0Var) {
        OptionContract optionContract = (OptionContract) optionOrderPageBottomSheetViewModel.f8609h.getValue();
        OptionOverview optionOverview = (OptionOverview) optionOrderPageBottomSheetViewModel.f8610i.getValue();
        PortfolioReviewResponse portfolioReviewResponse = (PortfolioReviewResponse) optionOrderPageBottomSheetViewModel.f8617p.getValue();
        if (optionContract != null && optionOverview != null && portfolioReviewResponse != null) {
            d0Var.setValue(new p(optionContract, optionOverview, portfolioReviewResponse));
        }
    }

    public final void g() {
        String str;
        FnoOption identifierInfo;
        e0 e0Var = this.f8620s;
        OptionOverview optionOverview = (OptionOverview) this.f8610i.getValue();
        if (optionOverview == null || (identifierInfo = optionOverview.getIdentifierInfo()) == null || (str = identifierInfo.getIdentifier()) == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9069e.setValue(j.i("Not connected to internet"));
            return;
        }
        try {
            g.H(u0.f(this), null, null, new w(this, str, null), 3);
        } catch (HttpException unused) {
            e0Var.postValue(new h(R.string.no_internet_connection, new Object[0]));
        } catch (Exception unused2) {
            e0Var.postValue(new h(R.string.try_again_later, new Object[0]));
        }
    }
}
