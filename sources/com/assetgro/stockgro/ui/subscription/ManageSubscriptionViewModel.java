package com.assetgro.stockgro.ui.subscription;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import cj.n;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import mt.f;
import qf.a;
import qf.b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/ManageSubscriptionViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ManageSubscriptionViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final a f10495n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10496o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10497p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10498q;

    /* renamed from: r, reason: collision with root package name */
    public String f10499r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10500s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10501t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10502u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ManageSubscriptionViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f10495n = maintenanceConfigManager;
        this.f10499r = "Basic";
        this.f10501t = new LiveData();
        this.f10502u = new LiveData();
        f g10 = maintenanceConfigManager.f31925a.g(((e) schedulerProvider).J());
        jt.e eVar = new jt.e(new n(1, new qg.a(this, 23)), gt.e.f17572d);
        g10.e(eVar);
        compositeDisposable.c(eVar);
        h();
    }

    public final void h() {
        if (this.f10495n.b(b.f31937l)) {
            this.f10502u.postValue(new j(Unit.f23355a));
        }
    }
}
