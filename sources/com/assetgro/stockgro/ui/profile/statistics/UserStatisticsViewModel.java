package com.assetgro.stockgro.ui.profile.statistics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kh.f0;
import kh.m;
import kh.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import mt.f;
import ni.j;
import nt.h;
import okhttp3.HttpUrl;
import qf.a;
import qf.b;
import qu.i0;
import vg.d;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/statistics/UserStatisticsViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserStatisticsViewModel extends BaseViewModel {
    public static boolean N;
    public static boolean O;
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public final e0 G;
    public final e0 H;
    public final e0 I;
    public final e0 J;
    public final e0 K;
    public final e0 L;
    public final d0 M;

    /* renamed from: n, reason: collision with root package name */
    public final FollowerRepository f10051n;

    /* renamed from: o, reason: collision with root package name */
    public final ChatRepository f10052o;

    /* renamed from: p, reason: collision with root package name */
    public final a f10053p;

    /* renamed from: q, reason: collision with root package name */
    public String f10054q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10055r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10056s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10057t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10058u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10059v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f10060w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10061x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10062y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10063z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public UserStatisticsViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, FollowerRepository followerRepository, ChatRepository chatRepository, a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f10051n = followerRepository;
        this.f10052o = chatRepository;
        this.f10053p = maintenanceConfigManager;
        this.f10054q = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f10055r = new LiveData();
        this.f10056s = new LiveData();
        this.f10057t = new LiveData();
        this.f10058u = new LiveData();
        ?? liveData = new LiveData();
        this.f10059v = liveData;
        this.f10060w = new LiveData();
        this.f10061x = new LiveData();
        this.f10062y = new LiveData();
        this.f10063z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        ?? liveData2 = new LiveData();
        this.C = liveData2;
        this.D = liveData2;
        this.E = new LiveData();
        this.F = new LiveData(m.f23151d);
        ?? liveData3 = new LiveData();
        this.G = liveData3;
        this.H = liveData3;
        this.I = new LiveData(Boolean.FALSE);
        this.J = new LiveData(1);
        this.K = new LiveData(1);
        this.L = new LiveData();
        this.M = i0.C(liveData, new z(this, 1));
        f g10 = maintenanceConfigManager.f31925a.g(((e) schedulerProvider).J());
        jt.e eVar = new jt.e(new d(28, new z(this, 0)), gt.e.f17572d);
        g10.e(eVar);
        compositeDisposable.c(eVar);
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel r8, int r9, yt.a r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel.h(com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel, int, yt.a):java.lang.Object");
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final boolean i(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return Intrinsics.a(userId, this.f9081d.getCurrentUserId());
    }

    public final void j() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            this.f9084g.postValue(Boolean.TRUE);
            try {
                g.H(u0.f(this), null, null, new kh.e0(this, null), 3);
            } catch (Exception unused) {
            }
        }
        l();
        k();
    }

    public final void k() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        String str = this.f10054q;
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f9081d.getProfileStats(str).c(((e) this.f9079b).J());
        jt.d dVar = new jt.d(new d(26, new z(this, 2)), new d(27, new z(this, 3)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void l() {
        g.H(u0.f(this), null, null, new f0(this, null), 3);
    }

    public final void m() {
        boolean z10;
        b bVar = b.f31929d;
        a aVar = this.f10053p;
        if (!aVar.b(bVar) && !aVar.b(b.f31931f) && !aVar.b(b.f31930e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (N != z10) {
            N = z10;
            this.A.postValue(new kj.j(Boolean.valueOf(z10)));
        }
        boolean b10 = aVar.b(b.f31941p);
        if (O != b10) {
            O = b10;
            this.B.postValue(new kj.j(Boolean.valueOf(b10)));
        }
    }
}
