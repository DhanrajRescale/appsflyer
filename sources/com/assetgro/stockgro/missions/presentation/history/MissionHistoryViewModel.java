package com.assetgro.stockgro.missions.presentation.history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import gc.k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import yk.g;
import z9.h;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/history/MissionHistoryViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionHistoryViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final MissionsRepository f8882n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8883o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8884p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8885q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8886r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MissionHistoryViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, MissionsRepository missionsRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(missionsRepository, "missionsRepository");
        this.f8882n = missionsRepository;
        this.f8883o = new LiveData();
        this.f8884p = new LiveData();
        ?? liveData = new LiveData();
        this.f8885q = liveData;
        this.f8886r = liveData;
        UserRepository userRepository2 = this.f9081d;
        liveData.postValue(new Pair(userRepository2.getUserDisplayName(), userRepository2.getUserDisplayImage()));
        h();
    }

    public final void h() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f8884p.postValue(new h(R.string.no_internet_connection, new Object[0]));
        } else {
            this.f9084g.postValue(Boolean.TRUE);
            g.H(u0.f(this), null, null, new k(this, null), 3);
        }
    }
}
