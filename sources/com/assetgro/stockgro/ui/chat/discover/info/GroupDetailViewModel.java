package com.assetgro.stockgro.ui.chat.discover.info;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.UserGroupInfo;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ee.c;
import ee.e;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qf.a;
import qf.b;
import qu.i0;
import yk.g;
import z9.h;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/discover/info/GroupDetailViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupDetailViewModel extends BaseViewModel {
    public final d0 A;
    public final d0 B;
    public final d0 C;
    public final d0 D;

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9328n;

    /* renamed from: o, reason: collision with root package name */
    public final FollowerRepository f9329o;

    /* renamed from: p, reason: collision with root package name */
    public final a f9330p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9331q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9332r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9333s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9334t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9335u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9336v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9337w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f9338x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f9339y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f9340z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupDetailViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, ChatRepository chatRepository, FollowerRepository followerRepository, a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f9328n = chatRepository;
        this.f9329o = followerRepository;
        this.f9330p = maintenanceConfigManager;
        ?? liveData = new LiveData();
        this.f9331q = liveData;
        this.f9332r = new LiveData();
        this.f9333s = new LiveData();
        ?? liveData2 = new LiveData();
        this.f9334t = liveData2;
        this.f9335u = liveData2;
        ?? liveData3 = new LiveData();
        this.f9336v = liveData3;
        this.f9337w = liveData3;
        this.f9338x = i0.C(liveData, c.f15390i);
        this.f9339y = i0.C(liveData, c.f15384c);
        this.f9340z = i0.C(liveData, c.f15388g);
        this.A = i0.C(liveData, c.f15386e);
        this.B = i0.C(liveData, c.f15385d);
        this.C = i0.C(liveData, c.f15387f);
        this.D = i0.C(liveData, c.f15389h);
        i();
    }

    public static final void h(GroupDetailViewModel groupDetailViewModel, UserGroupInfo userGroupInfo) {
        String riaRraUserId;
        groupDetailViewModel.getClass();
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            groupDetailViewModel.f9336v.postValue(new h(R.string.no_internet_connection, new Object[0]));
        }
        Group group = (Group) groupDetailViewModel.f9331q.getValue();
        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
            g.H(u0.f(groupDetailViewModel), null, null, new e(groupDetailViewModel, riaRraUserId, userGroupInfo, null), 3);
        } else {
            groupDetailViewModel.f9334t.postValue(userGroupInfo);
            Unit unit = Unit.f23355a;
        }
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void i() {
        b bVar = b.f31929d;
        a aVar = this.f9330p;
        if (aVar.b(bVar) || aVar.b(b.f31931f)) {
            this.f9333s.postValue(new j(Unit.f23355a));
        }
    }
}
