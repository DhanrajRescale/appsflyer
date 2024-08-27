package com.assetgro.stockgro.ui.chat.create;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.enums.GroupImageType;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import e.l;
import g7.b3;
import java.io.File;
import java.util.HashSet;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lc.b;
import nt.h;
import pj.a;
import t0.n1;
import t0.o3;
import t0.t;
import tu.e;
import tu.f;
import tu.k1;
import tu.l1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/create/GroupCreateViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupCreateViewModel extends BaseViewModel {
    public File A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public final k1 G;
    public final n1 H;
    public final n1 I;
    public final f J;

    /* renamed from: n, reason: collision with root package name */
    public final FollowerRepository f9115n;

    /* renamed from: o, reason: collision with root package name */
    public final ChatRepository f9116o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9117p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9118q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9119r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9120s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9121t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9122u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9123v;

    /* renamed from: w, reason: collision with root package name */
    public String f9124w;

    /* renamed from: x, reason: collision with root package name */
    public String f9125x;

    /* renamed from: y, reason: collision with root package name */
    public GroupImageType f9126y;

    /* renamed from: z, reason: collision with root package name */
    public File f9127z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupCreateViewModel(ChatRepository chatRepository, ContactsRepository contactsRepository, FollowerRepository followerRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9115n = followerRepository;
        this.f9116o = chatRepository;
        new LiveData();
        new LiveData();
        this.f9117p = new LiveData();
        this.f9118q = new LiveData();
        this.f9119r = new LiveData();
        new LiveData();
        new HashSet();
        this.f9120s = new LiveData();
        this.f9121t = new LiveData();
        this.f9122u = new LiveData();
        this.f9123v = new LiveData();
        this.f9126y = GroupImageType.Display;
        this.G = l1.a(Boolean.FALSE);
        e eVar = e.f36428a;
        o3 o3Var = o3.f35116a;
        this.H = t.n0(eVar, o3Var);
        this.I = t.n0(eVar, o3Var);
        this.J = (f) new l(new b3(10, 0, 10, 50), new b(this, 6)).f14641b;
        h c10 = chatRepository.getSocialCategories().c(((kq.e) this.f9079b).J());
        d dVar = new d(new id.h(13, new md.a(this, 4)), new id.h(14, new md.a(this, 5)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(GroupImageType groupImageType) {
        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
        this.f9126y = groupImageType;
    }

    public final void i(File imageFile, GroupImageType groupImageType) {
        Intrinsics.checkNotNullParameter(imageFile, "imageFile");
        Intrinsics.checkNotNullParameter(groupImageType, "groupImageType");
        h c10 = this.f9116o.uploadChatGroupAssets(this.B, imageFile, "image/jpeg", groupImageType).c(((kq.e) this.f9079b).J());
        d dVar = new d(new id.h(7, new md.a(this, 6)), new id.h(8, new md.a(this, 7)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
