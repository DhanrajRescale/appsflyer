package com.assetgro.stockgro.ui.chat.detail.messages.pin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.ChatMessage;
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
import vt.y;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/messages/pin/GroupPinnedMessagesViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupPinnedMessagesViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9303n;

    /* renamed from: o, reason: collision with root package name */
    public ChatMessage f9304o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9305p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9306q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9307r;

    /* renamed from: s, reason: collision with root package name */
    public final List f9308s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9309t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9310u;

    /* renamed from: v, reason: collision with root package name */
    public String f9311v;

    /* renamed from: w, reason: collision with root package name */
    public String f9312w;

    /* renamed from: x, reason: collision with root package name */
    public String f9313x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupPinnedMessagesViewModel(ChatRepository chatRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f9303n = chatRepository;
        this.f9305p = h.i();
        this.f9306q = new LiveData();
        this.f9307r = new LiveData();
        this.f9308s = y.g("Admin", "Moderator");
        this.f9309t = new LiveData();
        this.f9310u = new LiveData();
        this.f9311v = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9312w = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9313x = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public final void h() {
        boolean a10 = Intrinsics.a(this.f9312w, "GROUP_PINNED_MESSAGES");
        e0 e0Var = this.f9084g;
        ct.a aVar = this.f9080c;
        a aVar2 = this.f9079b;
        ChatRepository chatRepository = this.f9303n;
        if (a10) {
            e0Var.postValue(Boolean.TRUE);
            nt.h c10 = chatRepository.getGroupPinnedMessages(this.f9313x).c(((e) aVar2).J());
            d dVar = new d(new vd.a(10, new zd.d(this, 0)), new vd.a(11, new zd.d(this, 1)));
            c10.a(dVar);
            aVar.c(dVar);
            return;
        }
        e0Var.postValue(Boolean.TRUE);
        nt.h c11 = chatRepository.getStarredMessagesForUser(this.f9313x).c(((e) aVar2).J());
        d dVar2 = new d(new vd.a(13, new zd.d(this, 2)), new vd.a(14, new zd.d(this, 3)));
        c11.a(dVar2);
        aVar.c(dVar2);
    }
}
