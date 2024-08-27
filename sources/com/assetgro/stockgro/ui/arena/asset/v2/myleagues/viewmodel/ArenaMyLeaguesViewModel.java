package com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qc.b;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/asset/v2/myleagues/viewmodel/ArenaMyLeaguesViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ArenaMyLeaguesViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ArenaRepository f8949n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8950o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8951p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8952q;

    /* renamed from: r, reason: collision with root package name */
    public c f8953r;

    /* renamed from: s, reason: collision with root package name */
    public String f8954s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8955t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8956u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ArenaMyLeaguesViewModel(ArenaRepository arenaRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8949n = arenaRepository;
        new LiveData();
        Boolean bool = Boolean.FALSE;
        this.f8950o = new LiveData(bool);
        this.f8951p = new LiveData();
        this.f8952q = new LiveData(bool);
        this.f8954s = "ALL";
        ?? liveData = new LiveData();
        this.f8955t = liveData;
        this.f8956u = liveData;
        this.f9084g.postValue(Boolean.TRUE);
        g.H(u0.f(this), null, null, new b(this, null), 3);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h() {
        g.H(u0.f(this), null, null, new qc.c(this, null), 3);
    }
}
