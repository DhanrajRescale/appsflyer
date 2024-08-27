package com.assetgro.stockgro.ui.profile.group;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fh.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import vt.p0;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/group/GroupMyProfileViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupMyProfileViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9983n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9984o;

    /* renamed from: p, reason: collision with root package name */
    public Map f9985p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9986q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9987r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupMyProfileViewModel(ChatRepository chatRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f9983n = chatRepository;
        this.f9984o = new LiveData();
        this.f9985p = p0.d();
        this.f9986q = new LiveData();
        this.f9987r = new LiveData();
    }

    public final void h(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        g.H(u0.f(this), null, null, new e(this, userId, null), 3);
    }
}
