package com.assetgro.stockgro.feature_market.presentation.fno.order;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.domain.model.OptionMarketType;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import com.google.firebase.crashlytics.internal.common.IdManager;
import ka.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import pj.a;
import tu.k1;
import tu.l1;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/order/ModifyOrderPageBottomSheetViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseBottomSheetViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyOrderPageBottomSheetViewModel extends BaseBottomSheetViewModel {

    /* renamed from: g, reason: collision with root package name */
    public final FnoRepository f8632g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f8633h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f8634i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f8635j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f8636k;

    /* renamed from: l, reason: collision with root package name */
    public BuySellModifyFnoRequestDto f8637l;

    /* renamed from: m, reason: collision with root package name */
    public final k1 f8638m;

    /* renamed from: n, reason: collision with root package name */
    public final k1 f8639n;

    /* renamed from: o, reason: collision with root package name */
    public final k1 f8640o;

    /* renamed from: p, reason: collision with root package name */
    public final k1 f8641p;

    /* renamed from: q, reason: collision with root package name */
    public final k1 f8642q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8643r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8644s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8645t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ModifyOrderPageBottomSheetViewModel(a schedulerProvider, ct.a compositeDisposable, FnoRepository fnoRepository) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        this.f8632g = fnoRepository;
        ?? liveData = new LiveData();
        this.f8633h = liveData;
        this.f8634i = liveData;
        ?? liveData2 = new LiveData();
        this.f8635j = liveData2;
        this.f8636k = liveData2;
        this.f8638m = l1.a(Double.valueOf(0.0d));
        this.f8639n = l1.a(IdManager.DEFAULT_VERSION_NAME);
        this.f8640o = l1.a(1);
        this.f8641p = l1.a(OptionMarketType.Market);
        this.f8642q = l1.a(Boolean.FALSE);
        l1.a(null);
        this.f8643r = true;
        ?? liveData3 = new LiveData();
        this.f8644s = liveData3;
        this.f8645t = liveData3;
    }

    public final void f(String optionType, BuySellModifyFnoRequestDto body) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f8637l = body;
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9069e.setValue(j.i("Not connected to internet"));
            return;
        }
        e0 e0Var = this.f9070f;
        e0Var.setValue(Boolean.TRUE);
        try {
            g.H(u0.f(this), null, null, new h0(this, optionType, body, null), 3);
        } catch (Exception unused) {
            e0Var.setValue(Boolean.FALSE);
        }
    }
}
