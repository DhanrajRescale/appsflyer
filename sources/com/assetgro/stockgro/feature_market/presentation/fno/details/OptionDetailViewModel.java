package com.assetgro.stockgro.feature_market.presentation.fno.details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.domain.model.BreakEvenChartInputData;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionHistory;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverviewAdditionalInfoData;
import com.assetgro.stockgro.feature_market.domain.model.OptionType;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ek.u;
import el.l;
import ha.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import okhttp3.HttpUrl;
import pj.a;
import yk.g;
import z9.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/details/OptionDetailViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OptionDetailViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public final e0 G;
    public final e0 H;
    public final e0 I;
    public String J;
    public boolean K;
    public OptionHistory L;

    /* renamed from: n, reason: collision with root package name */
    public final FnoRepository f8593n;

    /* renamed from: o, reason: collision with root package name */
    public OptionContract f8594o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8595p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8596q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8597r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8598s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8599t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8600u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f8601v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f8602w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f8603x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f8604y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f8605z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public OptionDetailViewModel(FnoRepository fnoRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        this.f8593n = fnoRepository;
        ?? liveData = new LiveData();
        this.f8595p = liveData;
        this.f8596q = liveData;
        ?? liveData2 = new LiveData();
        this.f8597r = liveData2;
        this.f8598s = liveData2;
        ?? liveData3 = new LiveData();
        this.f8599t = liveData3;
        this.f8600u = liveData3;
        Boolean bool = Boolean.FALSE;
        ?? liveData4 = new LiveData(bool);
        this.f8601v = liveData4;
        this.f8602w = liveData4;
        ?? liveData5 = new LiveData(bool);
        this.f8603x = liveData5;
        this.f8604y = liveData5;
        ?? liveData6 = new LiveData(bool);
        this.f8605z = liveData6;
        this.A = liveData6;
        ?? liveData7 = new LiveData();
        this.B = liveData7;
        this.C = liveData7;
        ?? liveData8 = new LiveData();
        this.D = liveData8;
        this.E = liveData8;
        ?? liveData9 = new LiveData();
        this.F = liveData9;
        this.G = liveData9;
        ?? liveData10 = new LiveData();
        this.H = liveData10;
        this.I = liveData10;
        this.K = true;
    }

    public static final void h(OptionDetailViewModel optionDetailViewModel, OptionOverview optionOverview) {
        optionDetailViewModel.f8595p.postValue(optionOverview);
        optionDetailViewModel.J = String.valueOf(optionOverview.getSelectedExpiry());
        OptionContract defaultStrike = optionOverview.getDefaultStrike();
        optionDetailViewModel.D.postValue(optionOverview.getDefaultStrike());
        String str = "initial selectedStrikeData Strike Price: " + defaultStrike.getStrikePrice();
        Object[] objArr = new Object[0];
        Intrinsics.checkNotNullParameter("OptionDetailViewModel", "tag");
        com.google.android.gms.internal.p002firebaseauthapi.a.g(str, "s", objArr, "params", "OptionDetailViewModel").getClass();
        u.k(objArr);
        optionDetailViewModel.l(false);
    }

    public final OptionContract i() {
        OptionContract optionContract = this.f8594o;
        if (optionContract != null) {
            return optionContract;
        }
        Intrinsics.k("optionContract");
        throw null;
    }

    public final void j() {
        String identifier;
        e0 e0Var = this.f8605z;
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        try {
            Boolean bool = (Boolean) this.f8602w.getValue();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                e0Var.setValue(Boolean.TRUE);
                OptionContract optionContract = (OptionContract) this.E.getValue();
                if (optionContract == null || (identifier = optionContract.getIdentifier()) == null) {
                    identifier = i().getIdentifier();
                }
                g.H(u0.f(this), null, null, new p(this, identifier, null), 3);
            }
        } catch (Exception unused) {
            e0Var.setValue(Boolean.FALSE);
        }
    }

    public final void k(boolean z10) {
        this.K = z10;
        OptionHistory optionHistory = this.L;
        if (optionHistory != null) {
            e0 e0Var = this.f8599t;
            if (z10) {
                e0Var.postValue(optionHistory.getOneDayLineChartEntries());
            } else {
                e0Var.postValue(optionHistory.getOneWeekLineChartEntries());
            }
        }
    }

    public final void l(boolean z10) {
        h hVar;
        e0 e0Var = this.H;
        if (z10) {
            if (i().getOptionType() == OptionType.CALL) {
                hVar = new h(R.string.sell_call_option, new Object[0]);
            } else {
                hVar = new h(R.string.sell_put_option, new Object[0]);
            }
        } else if (i().getOptionType() == OptionType.CALL) {
            hVar = new h(R.string.buy_call_option, new Object[0]);
        } else {
            hVar = new h(R.string.buy_put_option, new Object[0]);
        }
        e0Var.setValue(hVar);
    }

    public final void m() {
        int i10;
        String str;
        double d10;
        FnoOption identifierInfo;
        FnoOption identifierInfo2;
        OptionContract optionContract = (OptionContract) this.D.getValue();
        if (optionContract != null) {
            String str2 = "selectedStrikeData Strike Price: " + optionContract.getStrikePrice();
            Object[] objArr = new Object[0];
            Intrinsics.checkNotNullParameter("OptionDetailViewModel", "tag");
            com.google.android.gms.internal.p002firebaseauthapi.a.g(str2, "s", objArr, "params", "OptionDetailViewModel").getClass();
            u.k(objArr);
            e0 e0Var = this.B;
            Boolean bool = (Boolean) this.f8603x.getValue();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            double breakEven = optionContract.getBreakEven();
            double premium = optionContract.getPremium();
            e0 e0Var2 = this.f8595p;
            OptionOverview optionOverview = (OptionOverview) e0Var2.getValue();
            if (optionOverview != null) {
                i10 = optionOverview.getLotSize();
            } else {
                i10 = -1;
            }
            int i11 = i10;
            OptionType optionType = optionContract.getOptionType();
            OptionOverview optionOverview2 = (OptionOverview) e0Var2.getValue();
            if (optionOverview2 == null || (identifierInfo2 = optionOverview2.getIdentifierInfo()) == null || (str = identifierInfo2.getIdentifier()) == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String str3 = str;
            OptionOverview optionOverview3 = (OptionOverview) e0Var2.getValue();
            if (optionOverview3 != null && (identifierInfo = optionOverview3.getIdentifierInfo()) != null) {
                d10 = identifierInfo.getLtp();
            } else {
                d10 = 0.0d;
            }
            double d11 = d10;
            Intrinsics.c(bool);
            e0Var.postValue(new BreakEvenChartInputData(bool.booleanValue(), premium, breakEven, i11, optionType, str3, d11));
            n(optionContract);
        }
    }

    public final void n(OptionContract optionContract) {
        int i10;
        double E0;
        Boolean bool = (Boolean) this.f8604y.getValue();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        OptionOverview optionOverview = (OptionOverview) this.f8595p.getValue();
        if (optionOverview != null) {
            i10 = optionOverview.getLotSize();
        } else {
            i10 = 0;
        }
        int i11 = i10;
        e0 e0Var = this.F;
        double E02 = l.E0(2, optionContract.getPremium());
        if (booleanValue) {
            E0 = l.E0(2, optionContract.getMarginPrice());
        } else {
            E0 = l.E0(2, optionContract.getPremium()) * i11;
        }
        e0Var.postValue(new OptionOverviewAdditionalInfoData(E02, i11, E0));
    }
}
