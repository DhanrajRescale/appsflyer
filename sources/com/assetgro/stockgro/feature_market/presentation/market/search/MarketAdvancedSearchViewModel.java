package com.assetgro.stockgro.feature_market.presentation.market.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import okhttp3.HttpUrl;
import pj.a;
import va.e;
import va.f;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/market/search/MarketAdvancedSearchViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "va/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketAdvancedSearchViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final FnoRepository f8687n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8688o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8689p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8690q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8691r;

    /* renamed from: s, reason: collision with root package name */
    public e f8692s;

    /* renamed from: t, reason: collision with root package name */
    public String f8693t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8694u;

    /* renamed from: v, reason: collision with root package name */
    public int f8695v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MarketAdvancedSearchViewModel(FnoRepository fnoRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        this.f8687n = fnoRepository;
        ?? liveData = new LiveData();
        this.f8688o = liveData;
        this.f8689p = liveData;
        this.f8690q = new LiveData();
        ?? liveData2 = new LiveData();
        this.f8691r = liveData2;
        liveData2.postValue(Boolean.TRUE);
        this.f8692s = e.f37823c;
        this.f8693t = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(e searchType) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        if (this.f8692s == searchType) {
            return;
        }
        this.f8690q.postValue(searchType);
        this.f8692s = searchType;
        this.f8694u = false;
        this.f8695v = 0;
        if (searchType == e.f37822b || this.f8693t.length() >= 2) {
            i();
        }
    }

    public final void i() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            this.f9084g.setValue(Boolean.TRUE);
            g.H(u0.f(this), null, null, new f(this, null), 3);
        }
    }
}
