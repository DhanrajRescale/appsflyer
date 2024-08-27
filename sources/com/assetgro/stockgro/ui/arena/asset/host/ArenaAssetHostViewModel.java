package com.assetgro.stockgro.ui.arena.asset.host;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jr.h;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import mt.f;
import qf.a;
import qf.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/asset/host/ArenaAssetHostViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ArenaAssetHostViewModel extends BaseViewModel {

    /* renamed from: u, reason: collision with root package name */
    public static boolean f8941u;

    /* renamed from: n, reason: collision with root package name */
    public final ArenaRepository f8942n;

    /* renamed from: o, reason: collision with root package name */
    public final a f8943o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8944p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8945q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8946r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8947s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8948t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ArenaAssetHostViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, ArenaRepository arenaRepository, a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f8942n = arenaRepository;
        this.f8943o = maintenanceConfigManager;
        this.f8944p = h.i();
        this.f8945q = new LiveData();
        this.f8946r = new LiveData();
        ?? liveData = new LiveData();
        this.f8947s = liveData;
        this.f8948t = new LiveData();
        f g10 = maintenanceConfigManager.f31925a.g(((e) schedulerProvider).J());
        jt.e eVar = new jt.e(new za.e(9, new mc.a(this, 0)), gt.e.f17572d);
        g10.e(eVar);
        compositeDisposable.c(eVar);
        boolean b10 = maintenanceConfigManager.b(b.f31928c);
        if (f8941u != b10) {
            f8941u = b10;
            liveData.postValue(new j(Boolean.valueOf(b10)));
        }
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
