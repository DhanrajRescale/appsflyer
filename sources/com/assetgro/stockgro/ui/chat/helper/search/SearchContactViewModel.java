package com.assetgro.stockgro.ui.chat.helper.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import androidx.work.i0;
import at.l;
import at.m;
import c1.a;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.NonStockgroContact;
import com.assetgro.stockgro.data.model.OneToOneChatGroup;
import com.assetgro.stockgro.data.model.RedirectConfig;
import com.assetgro.stockgro.data.model.TemplateParams;
import com.assetgro.stockgro.data.remote.response.ContactResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ft.b;
import ge.q;
import ge.r;
import ge.s;
import ge.t;
import java.util.ArrayList;
import java.util.List;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import kq.e;
import lt.i;
import mt.f;
import ni.j;
import nt.h;
import okhttp3.HttpUrl;
import x.i1;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/helper/search/SearchContactViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "ge/r", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SearchContactViewModel extends BaseViewModel {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public final e0 E;
    public final e0 F;
    public final a G;

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9351n;

    /* renamed from: o, reason: collision with root package name */
    public final ContactsRepository f9352o;

    /* renamed from: p, reason: collision with root package name */
    public final i0 f9353p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9354q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9355r;

    /* renamed from: s, reason: collision with root package name */
    public final vt.i0 f9356s;

    /* renamed from: t, reason: collision with root package name */
    public d f9357t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9358u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9359v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9360w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f9361x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9362y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9363z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public SearchContactViewModel(pj.a schedulerProvider, ct.a compositeDisposable, ChatRepository chatRepository, ContactsRepository contactsRepository, UserRepository userRepository, FollowerRepository followerRepository, i0 workManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        InviteTemplateDto inviteTemplateDto;
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f9351n = chatRepository;
        this.f9352o = contactsRepository;
        this.f9353p = workManager;
        this.f9356s = vt.i0.f38321a;
        this.f9358u = new LiveData();
        this.f9359v = new LiveData();
        this.f9360w = new LiveData(Boolean.valueOf(this.f9354q));
        this.f9361x = new ArrayList();
        this.f9362y = new LiveData();
        this.f9363z = new LiveData();
        this.A = true;
        this.B = true;
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            UserRepository userRepository2 = this.f9081d;
            if (userRepository2.getCurrentUserId() != null) {
                inviteTemplateDto = new InviteTemplateDto("new_user_invite", new TemplateParams(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET), Boolean.TRUE, new RedirectConfig(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "appsflyer", userRepository2.getUserReferralCode()));
            } else {
                inviteTemplateDto = null;
            }
            this.f9084g.postValue(Boolean.TRUE);
            g.H(u0.f(this), null, null, new t(this, inviteTemplateDto, null), 3);
        }
        i(HttpUrl.FRAGMENT_ENCODE_SET);
        this.E = new LiveData();
        this.F = new LiveData(new kj.j(r.f17337a));
        this.G = new a(this, 2);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel, androidx.lifecycle.a1
    public final void d() {
        super.d();
        d dVar = this.f9357t;
        if (dVar != null) {
            b.b(dVar);
        }
    }

    public final void h(String str) {
        String d10 = a3.a.d("toString(...)");
        this.f9084g.postValue(Boolean.TRUE);
        ChatRepository chatRepository = this.f9351n;
        h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, str, chatRepository.getUserId())).c(((e) this.f9079b).J());
        d dVar = new d(new vd.a(29, new s(this, 0)), new q(0, new s(this, 1)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void i(String search) {
        Intrinsics.checkNotNullParameter(search, "search");
        m<ContactResponseDto<List<NonStockgroContact>>> phoneContacts = this.f9352o.getPhoneContacts(String.valueOf(this.C), search);
        vd.a aVar = new vd.a(24, new s(this, 2));
        phoneContacts.getClass();
        h c10 = new nt.b(new nt.b(new nt.b(phoneContacts, aVar, 1), new vd.a(25, new s(this, 3)), 2), new vd.a(26, new s(this, 4)), 0).c(((e) this.f9079b).J());
        d dVar = new d(new vd.a(27, new s(this, 5)), new vd.a(28, new s(this, 6)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void j(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        d dVar = this.f9357t;
        if (dVar != null) {
            dVar.a();
        }
        boolean C = w.C(query);
        vt.i0 i0Var = this.f9356s;
        if (C) {
            this.f9358u.setValue(i0Var);
            return;
        }
        if (i0Var != null) {
            f fVar = new f(new tr.d(i0Var, 1), new vd.a(22, new i1(query, 5)), 0);
            gt.e.b(16, "capacityHint");
            i iVar = new i(fVar);
            ((e) this.f9079b).getClass();
            l lVar = st.e.f34774b;
            Intrinsics.checkNotNullExpressionValue(lVar, "computation(...)");
            h c10 = iVar.c(lVar);
            d dVar2 = new d(new vd.a(23, new s(this, 7)), gt.e.f17572d);
            c10.a(dVar2);
            this.f9357t = dVar2;
            return;
        }
        throw new NullPointerException("source is null");
    }
}
