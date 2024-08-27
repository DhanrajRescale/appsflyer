package com.assetgro.stockgro.ui.arena.detail.post;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jt.e;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qf.b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/arena/detail/post/LeagueDetailPostJoiningViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LeagueDetailPostJoiningViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public final e0 G;
    public e H;

    /* renamed from: n, reason: collision with root package name */
    public final ArenaRepository f8986n;

    /* renamed from: o, reason: collision with root package name */
    public final ChatRepository f8987o;

    /* renamed from: p, reason: collision with root package name */
    public ArenaGame f8988p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8989q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8990r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8991s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8992t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8993u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f8994v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f8995w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f8996x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f8997y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f8998z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public LeagueDetailPostJoiningViewModel(a schedulerProvider, ct.a compositeDisposable, ArenaRepository arenaRepository, ChatRepository chatRepository, UserRepository userRepository, qf.a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        boolean z10;
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f8986n = arenaRepository;
        this.f8987o = chatRepository;
        this.f8989q = new LiveData();
        this.f8990r = new LiveData();
        this.f8991s = new LiveData();
        this.f8992t = new LiveData();
        this.f8993u = new LiveData();
        Boolean bool = Boolean.FALSE;
        this.f8994v = new LiveData(bool);
        this.f8995w = new LiveData(bool);
        this.f8996x = new LiveData(bool);
        this.f8997y = new LiveData();
        this.f8998z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = new LiveData();
        this.D = new LiveData();
        this.E = new LiveData();
        ?? liveData = new LiveData();
        this.F = liveData;
        this.G = new LiveData();
        if (!maintenanceConfigManager.b(b.f31929d) && !maintenanceConfigManager.b(b.f31931f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        liveData.postValue(new j(Boolean.valueOf(z10)));
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel, androidx.lifecycle.a1
    public final void d() {
        super.d();
        e eVar = this.H;
        if (eVar != null) {
            ft.b.b(eVar);
        }
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
