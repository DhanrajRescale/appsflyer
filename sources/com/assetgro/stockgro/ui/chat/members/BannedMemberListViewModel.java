package com.assetgro.stockgro.ui.chat.members;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ge.q;
import jr.h;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import okhttp3.HttpUrl;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/members/BannedMemberListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BannedMemberListViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9407n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9408o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9409p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9410q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9411r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9412s;

    /* renamed from: t, reason: collision with root package name */
    public final String f9413t;

    /* renamed from: u, reason: collision with root package name */
    public String f9414u;

    /* renamed from: v, reason: collision with root package name */
    public int f9415v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9416w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public BannedMemberListViewModel(ChatRepository chatRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f9407n = chatRepository;
        this.f9408o = new LiveData();
        this.f9409p = new LiveData();
        this.f9410q = new LiveData();
        this.f9411r = h.i();
        this.f9412s = 30;
        this.f9413t = "Rogue";
        this.f9414u = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public final void h() {
        this.f9084g.postValue(Boolean.TRUE);
        nt.h c10 = this.f9407n.getBannedGroupMembers(this.f9414u, this.f9413t, this.f9412s, this.f9415v).c(((e) this.f9079b).J());
        d dVar = new d(new q(5, new me.a(this, 3)), new q(6, new me.a(this, 4)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
