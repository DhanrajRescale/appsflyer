package com.assetgro.stockgro.ui.chat.host;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.d1;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.navigation.i;
import ba.sh;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import id.a;
import ie.l;
import ie.t;
import iu.a0;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import ub.f;
import vc.b;
import yk.g;
import yo.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/host/GroupFeedAndChatHostFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/host/GroupFeedAndChatHostViewModel;", "Lba/sh;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupFeedAndChatHostFragment extends m<GroupFeedAndChatHostViewModel, sh> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9388j = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f9389g = new i(a0.a(t.class), new z1(this, 21));

    /* renamed from: h, reason: collision with root package name */
    public ChatSharedViewModel f9390h;

    /* renamed from: i, reason: collision with root package name */
    public l f9391i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_group_feed_and_chat_host;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((GroupFeedAndChatHostViewModel) r()).f9393n.observe(this, new a(25, new f(this, 13)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [yo.c, java.lang.Object] */
    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d1 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Bundle bundle = new Bundle();
        i iVar = this.f9389g;
        bundle.putString("GROUP_CHAT_ID", ((t) iVar.getValue()).f19949a);
        Unit unit = Unit.f23355a;
        l lVar = new l(childFragmentManager, lifecycle, bundle);
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f9391i = lVar;
        sh shVar = (sh) q();
        l lVar2 = this.f9391i;
        if (lVar2 != null) {
            shVar.f6087t.setAdapter(lVar2);
            ((sh) q()).f6087t.setUserInputEnabled(false);
            sh shVar2 = (sh) q();
            sh shVar3 = (sh) q();
            new n(shVar2.f6086s, shVar3.f6087t, new b(this, 8)).a();
            sh shVar4 = (sh) q();
            shVar4.f6086s.a(new Object());
            ((sh) q()).f6087t.c(((t) iVar.getValue()).f19950b, false);
            return;
        }
        Intrinsics.k("groupChatTabAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ChatSharedViewModel chatSharedViewModel = this.f9390h;
        if (chatSharedViewModel != null) {
            chatSharedViewModel.f9136q.postValue(new j(Unit.f23355a));
        } else {
            Intrinsics.k("chatSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = bVar.g();
        g.i(maintenanceConfigManager);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        c factory = new c(a0.a(GroupFeedAndChatHostViewModel.class), new ea.o(k10, c10, userRepository, maintenanceConfigManager, 5));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, GroupFeedAndChatHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupFeedAndChatHostViewModel.class, "<this>", GroupFeedAndChatHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupFeedAndChatHostViewModel groupFeedAndChatHostViewModel = (GroupFeedAndChatHostViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupFeedAndChatHostViewModel);
            this.f17284b = groupFeedAndChatHostViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            this.f9390h = fragmentComponent.b();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
