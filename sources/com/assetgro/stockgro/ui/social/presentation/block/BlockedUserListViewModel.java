package com.assetgro.stockgro.ui.social.presentation.block;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import bi.h;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qf.b;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/social/presentation/block/BlockedUserListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BlockedUserListViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f10122n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10123o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10124p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10125q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10126r;

    /* renamed from: s, reason: collision with root package name */
    public final int f10127s;

    /* renamed from: t, reason: collision with root package name */
    public int f10128t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10129u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public BlockedUserListViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, ChatRepository chatRepository, qf.a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f10122n = chatRepository;
        this.f10123o = new LiveData();
        this.f10124p = new LiveData();
        this.f10125q = new LiveData();
        new LiveData();
        new LiveData();
        ?? liveData = new LiveData();
        this.f10126r = liveData;
        this.f10127s = 25;
        if (maintenanceConfigManager.b(b.f31931f)) {
            liveData.postValue(new j(Unit.f23355a));
        } else {
            h();
        }
    }

    public final void h() {
        this.f9084g.postValue(Boolean.TRUE);
        g.H(u0.f(this), null, null, new h(this, null), 3);
    }
}
