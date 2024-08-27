package com.assetgro.stockgro.ui.chat.detail.members;

import androidx.fragment.app.g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.model.OneToOneChatGroup;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.List;
import jr.h;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import okhttp3.HttpUrl;
import pj.a;
import vd.n;
import vd.o;
import vd.q;
import vd.r;
import vt.y;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/members/GroupMemberListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupMemberListViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final int C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public int H;
    public boolean I;
    public final e0 J;
    public final e0 K;
    public final e0 L;
    public final e0 M;

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9286n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9287o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9288p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9289q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9290r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9291s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9292t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9293u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9294v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9295w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9296x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9297y;

    /* renamed from: z, reason: collision with root package name */
    public final List f9298z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupMemberListViewModel(ChatRepository chatRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f9286n = chatRepository;
        this.f9288p = h.i();
        this.f9289q = new LiveData();
        this.f9290r = new LiveData();
        this.f9291s = new LiveData();
        this.f9292t = new LiveData();
        this.f9293u = new LiveData();
        this.f9294v = h.i();
        this.f9295w = new LiveData();
        this.f9296x = new LiveData();
        this.f9297y = new LiveData();
        this.f9298z = y.g("Social", "League", "Private");
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = 50;
        this.D = HttpUrl.FRAGMENT_ENCODE_SET;
        this.E = HttpUrl.FRAGMENT_ENCODE_SET;
        this.F = HttpUrl.FRAGMENT_ENCODE_SET;
        ?? liveData = new LiveData();
        this.J = liveData;
        this.K = liveData;
        ?? liveData2 = new LiveData();
        this.L = liveData2;
        this.M = liveData2;
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(String userId, String role) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.f9084g.postValue(Boolean.TRUE);
        nt.h c10 = this.f9286n.banUnbanGroupMember(userId, this.E, role).c(((e) this.f9079b).J());
        d dVar = new d(new g(19, this, role), new vd.a(7, new n(this, 0)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void i(String toBlock, boolean z10) {
        Intrinsics.checkNotNullParameter(toBlock, "toBlock");
        this.f9084g.postValue(Boolean.TRUE);
        yk.g.H(u0.f(this), null, null, new o(this, z10, toBlock, null), 3);
    }

    public final void j(String userId, String role) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.f9084g.postValue(Boolean.TRUE);
        yk.g.H(u0.f(this), null, null, new q(this, userId, role, null), 3);
    }

    public final void k(String userId, String role) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.f9084g.postValue(Boolean.TRUE);
        yk.g.H(u0.f(this), null, null, new r(this, userId, role, null), 3);
    }

    public final void l(String str) {
        String d10 = a3.a.d("toString(...)");
        this.f9084g.postValue(Boolean.TRUE);
        ChatRepository chatRepository = this.f9286n;
        nt.h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, str, chatRepository.getUserId())).c(((e) this.f9079b).J());
        d dVar = new d(new vd.a(3, new n(this, 1)), new vd.a(4, new n(this, 2)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void m() {
        boolean z10 = this.f9287o;
        e0 e0Var = this.f9084g;
        ct.a aVar = this.f9080c;
        a aVar2 = this.f9079b;
        ChatRepository chatRepository = this.f9286n;
        int i10 = this.C;
        boolean z11 = false;
        if (z10 && this.F.length() > 0) {
            String str = this.F;
            if (this.H == 0) {
                z11 = true;
            }
            e0Var.postValue(Boolean.valueOf(z11));
            nt.h c10 = chatRepository.searchGroupMembers(this.E, str, i10, this.H).c(((e) aVar2).J());
            d dVar = new d(new vd.a(5, new n(this, 5)), new vd.a(6, new n(this, 6)));
            c10.a(dVar);
            aVar.c(dVar);
            return;
        }
        if (this.H == 0) {
            z11 = true;
        }
        e0Var.postValue(Boolean.valueOf(z11));
        nt.h c11 = chatRepository.getGroupMembers(this.E, i10, this.H).c(((e) aVar2).J());
        d dVar2 = new d(new vd.a(1, new n(this, 3)), new vd.a(2, new n(this, 4)));
        c11.a(dVar2);
        aVar.c(dVar2);
    }
}
