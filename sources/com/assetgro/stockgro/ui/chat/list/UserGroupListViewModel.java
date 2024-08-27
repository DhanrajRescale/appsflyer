package com.assetgro.stockgro.ui.chat.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fv.e;
import fv.g;
import java.util.HashSet;
import je.c;
import je.i;
import jr.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pj.a;
import vt.o0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/list/UserGroupListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserGroupListViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9399n;

    /* renamed from: o, reason: collision with root package name */
    public e f9400o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9401p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9402q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9403r;

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f9404s;

    /* renamed from: t, reason: collision with root package name */
    public String f9405t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9406u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public UserGroupListViewModel(ChatRepository chatRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f9399n = chatRepository;
        this.f9401p = new LiveData();
        this.f9402q = h.i();
        this.f9403r = new LiveData();
        this.f9404s = new HashSet();
        this.f9405t = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9406u = 20;
    }

    public static final void h(UserGroupListViewModel userGroupListViewModel) {
        g b10;
        String str = userGroupListViewModel.f9405t;
        if (str != null) {
            userGroupListViewModel.f9400o = le.g.f24613a.a("groupchat:".concat(str), o0.b(new Pair("token", a3.a.f("Bearer ", userGroupListViewModel.f9399n.getAccessToken()))));
        }
        e eVar = userGroupListViewModel.f9400o;
        if (eVar != null) {
            eVar.d("user:entered", c.f21319f);
        }
        e eVar2 = userGroupListViewModel.f9400o;
        if (eVar2 != null) {
            eVar2.d("phx_join", c.f21320g);
            e eVar3 = userGroupListViewModel.f9400o;
            if (eVar3 != null) {
                eVar3.d("phx_close", c.f21321h);
            }
            e eVar4 = userGroupListViewModel.f9400o;
            if (eVar4 != null) {
                eVar4.d("phx_error", c.f21322i);
            }
            e eVar5 = userGroupListViewModel.f9400o;
            if (eVar5 != null) {
                eVar5.d("phx_leave", c.f21323j);
            }
            e eVar6 = userGroupListViewModel.f9400o;
            if (eVar6 != null && (b10 = e.b(eVar6)) != null) {
                b10.a("ok", new i(userGroupListViewModel, 1));
                b10.a("error", c.f21324k);
            }
        }
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
