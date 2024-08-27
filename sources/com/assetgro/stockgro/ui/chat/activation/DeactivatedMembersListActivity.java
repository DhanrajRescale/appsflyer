package com.assetgro.stockgro.ui.chat.activation;

import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.e;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.o0;
import ca.c;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import id.a;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import vd.d;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/activation/DeactivatedMembersListActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/activation/DeactivatedMembersListViewModel;", "Lba/o0;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DeactivatedMembersListActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final sb.b f9104l = new sb.b(17, 0);

    /* renamed from: k, reason: collision with root package name */
    public d f9105k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_group_members_list;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((DeactivatedMembersListViewModel) x()).f9084g.observe(this, new a(1, new jd.b(this, 0)));
        ((DeactivatedMembersListViewModel) x()).f9107o.observe(this, new a(1, new jd.b(this, 1)));
        ((DeactivatedMembersListViewModel) x()).f9108p.observe(this, new a(1, new jd.b(this, 2)));
        ((DeactivatedMembersListViewModel) x()).f9109q.observe(this, new a(1, new jd.b(this, 3)));
        ((DeactivatedMembersListViewModel) x()).f9110r.observe(this, new a(1, new jd.b(this, 4)));
    }

    @Override // gd.b
    public final void I() {
        o0 o0Var = (o0) w();
        String string = getString(R.string.text_deactivated_members);
        Toolbar toolbar = o0Var.f5633v;
        toolbar.setTitle(string);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new jd.a(this, 0));
        v(toolbar);
        ((DeactivatedMembersListViewModel) x()).h();
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        d dVar = new d(lifecycle, ((DeactivatedMembersListViewModel) x()).f9106n.getUserId(), new jd.b(this, 5), new jd.b(this, 6), new e(this, 21), true, false);
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f9105k = dVar;
        o0 o0Var2 = (o0) w();
        o0Var2.f5632u.setOnRefreshListener(new vc.b(this, 3));
        o0 o0Var3 = (o0) w();
        o0Var3.f5631t.setAdapter(K());
        o0 o0Var4 = (o0) w();
        o0Var4.f5630s.setMyScrollChangeListener(new va.b(this, 1));
    }

    public final d K() {
        d dVar = this.f9105k;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.k("groupMemberAdapter");
        throw null;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        ChatRepository chatRepository = activityComponent.f14246a.b();
        g.i(chatRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        c factory = new c(a0.a(DeactivatedMembersListViewModel.class), new ea.d(schedulerProvider, compositeDisposable, userRepository, chatRepository, 1));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, DeactivatedMembersListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(DeactivatedMembersListViewModel.class, "<this>", DeactivatedMembersListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            DeactivatedMembersListViewModel deactivatedMembersListViewModel = (DeactivatedMembersListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(deactivatedMembersListViewModel);
            this.f17254b = deactivatedMembersListViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
