package com.assetgro.stockgro.ui.chat.detail.members;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import e.l;
import g7.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lc.b;
import okhttp3.HttpUrl;
import pj.a;
import t0.n1;
import t0.o3;
import t0.t;
import tu.e;
import tu.f;
import tu.k1;
import tu.l1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/members/GroupInvitedListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupInvitedListViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9274n;

    /* renamed from: o, reason: collision with root package name */
    public String f9275o;

    /* renamed from: p, reason: collision with root package name */
    public final n1 f9276p;

    /* renamed from: q, reason: collision with root package name */
    public final k1 f9277q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupInvitedListViewModel(ChatRepository chatRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f9274n = chatRepository;
        this.f9275o = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9276p = t.n0(e.f36428a, o3.f35116a);
        this.f9277q = l1.a(Boolean.FALSE);
    }

    public final void h() {
        this.f9276p.setValue((f) new l(new b3(10, 0, 10, 50), new b(this, 14)).f14641b);
    }
}
