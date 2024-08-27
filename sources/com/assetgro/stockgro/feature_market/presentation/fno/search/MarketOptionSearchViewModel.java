package com.assetgro.stockgro.feature_market.presentation.fno.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import la.b;
import ni.j;
import okhttp3.HttpUrl;
import pj.a;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/search/MarketOptionSearchViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketOptionSearchViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final FnoRepository f8648n;

    /* renamed from: o, reason: collision with root package name */
    public String f8649o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8650p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8651q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8652r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MarketOptionSearchViewModel(FnoRepository fnoRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8648n = fnoRepository;
        this.f8649o = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f8650p = new LiveData();
        ?? liveData = new LiveData();
        this.f8651q = liveData;
        this.f8652r = liveData;
    }

    public static void h(MarketOptionSearchViewModel marketOptionSearchViewModel) {
        Intrinsics.checkNotNullParameter("stocks", "optionType");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            marketOptionSearchViewModel.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            marketOptionSearchViewModel.f9084g.setValue(Boolean.TRUE);
            g.H(u0.f(marketOptionSearchViewModel), null, null, new b(marketOptionSearchViewModel, "stocks", null), 3);
        }
    }
}
