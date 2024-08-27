package com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import tc.b;
import tu.e;
import tu.f;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/asset/v2/upcoming/viewmodel/ArenaUpcomingViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ArenaUpcomingViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ArenaRepository f8957n;

    /* renamed from: o, reason: collision with root package name */
    public ArenaSortOptions f8958o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8959p;

    /* renamed from: q, reason: collision with root package name */
    public c f8960q;

    /* renamed from: r, reason: collision with root package name */
    public String f8961r;

    /* renamed from: s, reason: collision with root package name */
    public String f8962s;

    /* renamed from: t, reason: collision with root package name */
    public String f8963t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8964u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f8965v;

    /* renamed from: w, reason: collision with root package name */
    public f f8966w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ArenaUpcomingViewModel(ArenaRepository arenaRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8957n = arenaRepository;
        new LiveData();
        this.f8959p = new LiveData(0);
        this.f8961r = "ALL";
        this.f8962s = "startTime";
        this.f8963t = "desc";
        this.f8964u = new LiveData(Boolean.FALSE);
        Boolean bool = Boolean.TRUE;
        this.f8965v = new LiveData(bool);
        this.f8966w = e.f36428a;
        this.f9084g.postValue(bool);
        g.H(u0.f(this), null, null, new b(this, null), 3);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h() {
        this.f9084g.postValue(Boolean.TRUE);
        e0 e0Var = this.f8964u;
        Intrinsics.c(e0Var.getValue());
        e0Var.postValue(Boolean.valueOf(!((Boolean) r1).booleanValue()));
    }
}
