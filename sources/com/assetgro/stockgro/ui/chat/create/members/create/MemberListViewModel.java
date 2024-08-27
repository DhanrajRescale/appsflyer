package com.assetgro.stockgro.ui.chat.create.members.create;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import at.m;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import id.h;
import java.util.HashSet;
import java.util.List;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nd.b;
import pj.a;
import vt.i0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/create/members/create/MemberListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MemberListViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final FollowerRepository f9128n;

    /* renamed from: o, reason: collision with root package name */
    public final ChatRepository f9129o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9130p;

    /* renamed from: q, reason: collision with root package name */
    public List f9131q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MemberListViewModel(ChatRepository chatRepository, ContactsRepository contactsRepository, FollowerRepository followerRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9128n = followerRepository;
        this.f9129o = chatRepository;
        new LiveData();
        new LiveData();
        this.f9130p = new LiveData();
        new HashSet();
        new LiveData();
        this.f9131q = i0.f38321a;
        m<BaseResponseDto<List<StockgroContact>>> stockgroContacts = contactsRepository.getStockgroContacts();
        h hVar = new h(15, new b(this, 5));
        stockgroContacts.getClass();
        nt.h c10 = new nt.b(new nt.b(new nt.b(stockgroContacts, hVar, 1), new h(16, new b(this, 6)), 2), new h(17, new b(this, 7)), 0).c(((e) this.f9079b).J());
        d dVar = new d(new h(18, new b(this, 8)), new h(19, new b(this, 9)));
        c10.a(dVar);
        this.f9080c.c(dVar);
        new LiveData();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel, androidx.lifecycle.a1
    public final void d() {
        super.d();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
