package com.assetgro.stockgro.feature_market.presentation.fno.chain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ga.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import pj.a;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/chain/OptionChainViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OptionChainViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final FnoRepository f8584n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8585o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8586p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8587q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8588r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8589s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8590t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public OptionChainViewModel(FnoRepository fnoRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        this.f8584n = fnoRepository;
        ?? liveData = new LiveData();
        this.f8585o = liveData;
        this.f8586p = liveData;
        ?? liveData2 = new LiveData();
        this.f8587q = liveData2;
        this.f8588r = liveData2;
        ?? liveData3 = new LiveData(Boolean.FALSE);
        this.f8589s = liveData3;
        this.f8590t = liveData3;
    }

    public final void h(String optionIdentifier) {
        Intrinsics.checkNotNullParameter(optionIdentifier, "optionIdentifier");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            this.f9084g.setValue(Boolean.TRUE);
            g.H(u0.f(this), null, null, new h(this, optionIdentifier, null), 3);
        }
    }
}
