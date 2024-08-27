package com.assetgro.stockgro.ui.chat.activation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/activation/DeactivatedMembersListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DeactivatedMembersListViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9106n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9107o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9108p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9109q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9110r;

    /* renamed from: s, reason: collision with root package name */
    public final String f9111s;

    /* renamed from: t, reason: collision with root package name */
    public int f9112t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9113u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public DeactivatedMembersListViewModel(ChatRepository chatRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f9106n = chatRepository;
        this.f9107o = new LiveData();
        this.f9108p = new LiveData();
        this.f9109q = new LiveData();
        new LiveData();
        new LiveData();
        this.f9110r = new LiveData();
        this.f9111s = "Rogue";
        this.f9113u = 30;
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h() {
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f9106n.getDeactivatedMembers(this.f9111s, this.f9113u, this.f9112t).c(((e) this.f9079b).J());
        d dVar = new d(new id.h(3, new jd.e(this, 2)), new id.h(4, new jd.e(this, 3)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
