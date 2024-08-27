package com.assetgro.stockgro.ui.chat.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pj.a;
import qe.e;
import qe.h;
import qe.j;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/search/SocialAdvancedSearchViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "qe/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SocialAdvancedSearchViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9428n;

    /* renamed from: o, reason: collision with root package name */
    public final FollowerRepository f9429o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9430p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9431q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9432r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9433s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9434t;

    /* renamed from: u, reason: collision with root package name */
    public e f9435u;

    /* renamed from: v, reason: collision with root package name */
    public String f9436v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9437w;

    /* renamed from: x, reason: collision with root package name */
    public int f9438x;

    /* renamed from: y, reason: collision with root package name */
    public int f9439y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public SocialAdvancedSearchViewModel(ChatRepository chatRepository, FollowerRepository followerRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        this.f9428n = chatRepository;
        this.f9429o = followerRepository;
        this.f9430p = new LiveData();
        ?? liveData = new LiveData();
        this.f9431q = liveData;
        this.f9432r = new LiveData();
        this.f9433s = new LiveData();
        this.f9434t = new LiveData();
        this.f9435u = e.f31904b;
        this.f9436v = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9439y = 10;
        g.H(u0.f(this), null, null, new qe.g(this, null), 3);
        i0.C(liveData, h.f31915b);
        i0.C(liveData, h.f31916c);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(e searchType) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        if (this.f9435u == searchType) {
            return;
        }
        this.f9435u = searchType;
        this.f9437w = false;
        this.f9438x = 0;
        this.f9439y = 10;
        i();
    }

    public final void i() {
        g.H(u0.f(this), null, null, new j(this, null), 3);
    }
}
