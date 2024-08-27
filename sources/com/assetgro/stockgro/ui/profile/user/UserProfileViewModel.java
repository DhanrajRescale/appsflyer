package com.assetgro.stockgro.ui.profile.user;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nh.k;
import nh.m;
import nh.o;
import nt.h;
import okhttp3.HttpUrl;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/user/UserProfileViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserProfileViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final FollowerRepository f10070n;

    /* renamed from: o, reason: collision with root package name */
    public final ChatRepository f10071o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10072p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10073q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10074r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10075s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10076t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10077u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10078v;

    /* renamed from: w, reason: collision with root package name */
    public String f10079w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public UserProfileViewModel(ChatRepository chatRepository, FollowerRepository followerRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f10070n = followerRepository;
        this.f10071o = chatRepository;
        this.f10072p = new LiveData();
        this.f10073q = new LiveData();
        this.f10074r = new LiveData();
        this.f10075s = new LiveData();
        this.f10076t = new LiveData();
        this.f10077u = new LiveData();
        this.f10078v = new LiveData();
        this.f10079w = userRepository.getCurrentUserId();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
        h c10 = this.f10071o.getUserReportedStatus(this.f10079w).c(((e) this.f9079b).J());
        d dVar = new d(new vg.d(29, new m(this, 3)), new k(0, o.f28724a));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final String h() {
        String currentUserId = this.f9081d.getCurrentUserId();
        if (currentUserId == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return currentUserId;
    }

    public final void i() {
        String str = this.f10079w;
        if (str != null) {
            this.f9084g.postValue(Boolean.TRUE);
            h c10 = this.f9081d.getProfileStats(str).c(((e) this.f9079b).J());
            d dVar = new d(new k(5, new m(this, 4)), new k(6, new m(this, 5)));
            c10.a(dVar);
            this.f9080c.c(dVar);
        }
    }
}
