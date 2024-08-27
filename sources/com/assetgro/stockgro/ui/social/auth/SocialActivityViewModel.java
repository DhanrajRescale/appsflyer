package com.assetgro.stockgro.ui.social.auth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.SocialAuthRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import yh.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/social/auth/SocialActivityViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SocialActivityViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f10104n;

    /* renamed from: o, reason: collision with root package name */
    public final SocialAuthRepository f10105o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10106p;

    /* renamed from: q, reason: collision with root package name */
    public String f10107q;

    /* renamed from: r, reason: collision with root package name */
    public String f10108r;

    /* renamed from: s, reason: collision with root package name */
    public final a f10109s;

    /* renamed from: t, reason: collision with root package name */
    public String f10110t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10111u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10112v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yh.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public SocialActivityViewModel(pj.a schedulerProvider, ct.a compositeDisposable, ChatRepository chatRepository, FollowerRepository followerRepository, SocialAuthRepository socialAuthRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(socialAuthRepository, "socialAuthRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10104n = chatRepository;
        this.f10105o = socialAuthRepository;
        this.f10106p = h.i();
        this.f10109s = new Object();
        this.f10111u = new LiveData();
        this.f10112v = new LiveData();
    }

    public final String h() {
        String currentUserId = this.f9081d.getCurrentUserId();
        if (currentUserId == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return currentUserId;
    }
}
