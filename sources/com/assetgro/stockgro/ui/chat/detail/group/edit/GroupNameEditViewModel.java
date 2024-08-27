package com.assetgro.stockgro.ui.chat.detail.group.edit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pj.a;
import sd.h;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/group/edit/GroupNameEditViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupNameEditViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9208n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9209o;

    /* renamed from: p, reason: collision with root package name */
    public String[] f9210p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9211q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9212r;

    /* renamed from: s, reason: collision with root package name */
    public String f9213s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupNameEditViewModel(ChatRepository chatRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9208n = chatRepository;
        this.f9209o = new LiveData();
        this.f9210p = new String[0];
        ?? liveData = new LiveData();
        this.f9211q = liveData;
        this.f9212r = liveData;
        this.f9213s = HttpUrl.FRAGMENT_ENCODE_SET;
        g.H(u0.f(this), null, null, new h(this, null), 3);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
