package com.assetgro.stockgro.ui.chat.detail.members;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import e.l;
import g7.b3;
import java.util.ArrayList;
import java.util.HashSet;
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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/members/AddMembersViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AddMembersViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9264n;

    /* renamed from: o, reason: collision with root package name */
    public final FollowerRepository f9265o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9266p;

    /* renamed from: q, reason: collision with root package name */
    public String f9267q;

    /* renamed from: r, reason: collision with root package name */
    public final k1 f9268r;

    /* renamed from: s, reason: collision with root package name */
    public final n1 f9269s;

    /* renamed from: t, reason: collision with root package name */
    public final n1 f9270t;

    /* renamed from: u, reason: collision with root package name */
    public final f f9271u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public AddMembersViewModel(ChatRepository chatRepository, ContactsRepository contactsRepository, FollowerRepository followerRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9264n = chatRepository;
        this.f9265o = followerRepository;
        new HashSet();
        new LiveData();
        new ArrayList();
        new LiveData();
        this.f9266p = new LiveData();
        new LiveData();
        new LiveData();
        new LiveData();
        this.f9267q = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9268r = l1.a(Boolean.FALSE);
        e eVar = e.f36428a;
        o3 o3Var = o3.f35116a;
        this.f9269s = t.n0(eVar, o3Var);
        this.f9270t = t.n0(eVar, o3Var);
        this.f9271u = (f) new l(new b3(10, 0, 10, 50), new b(this, 12)).f14641b;
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
