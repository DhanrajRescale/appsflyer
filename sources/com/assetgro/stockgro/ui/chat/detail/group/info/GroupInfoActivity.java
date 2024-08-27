package com.assetgro.stockgro.ui.chat.detail.group.info;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.navigation.i0;
import androidx.navigation.t;
import ba.k0;
import com.assetgro.stockgro.data.model.CharLimit;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.j;
import ea.v;
import gd.b;
import id.a;
import iu.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import td.c;
import td.d;
import ut.g;
import ut.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/group/info/GroupInfoActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/detail/group/info/GroupInfoViewModel;", "Lba/k0;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupInfoActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9214l = 0;

    /* renamed from: k, reason: collision with root package name */
    public final g f9215k = h.a(new lc.b(this, 9));

    @Override // gd.b
    public final int F() {
        return R.layout.activity_group_info_host;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((GroupInfoViewModel) x()).f9252t.observe(this, new a(7, new c(this, 0)));
        ((GroupInfoViewModel) x()).f9254u.observe(this, new a(7, new c(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        CharLimit charLimit;
        String string;
        Bundle extras;
        k0 k0Var = (k0) w();
        String string2 = getString(R.string.text_group_information);
        Toolbar toolbar = k0Var.f5191s;
        toolbar.setTitle(string2);
        v(toolbar);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new jd.a(this, 3));
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            charLimit = (CharLimit) extras.getParcelable("CHAR_LIMIT");
        } else {
            charLimit = null;
        }
        if (charLimit != null) {
            ((GroupInfoViewModel) x()).f9263z.postValue(charLimit);
        }
        ((GroupInfoViewModel) x()).D = (ne.a) getIntent().getSerializableExtra("INVITE_TYPE");
        g gVar = this.f9215k;
        t tVar = (t) gVar.getValue();
        tVar.x(((i0) tVar.B.getValue()).b(R.navigation.social_group_info_navigation), null);
        Unit unit = Unit.f23355a;
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null && (string = extras2.getString("DEEPLINK")) != null) {
            t tVar2 = (t) gVar.getValue();
            Uri parse = Uri.parse(string);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            tVar2.m(parse, yk.g.I(d.f35833c));
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        setResult(-1);
        finish();
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        yk.g.i(userRepository);
        ChatRepository chatRepository = activityComponent.f14246a.b();
        yk.g.i(chatRepository);
        ArenaRepository arenaRepository = activityComponent.f14246a.a();
        yk.g.i(arenaRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        ca.c factory = new ca.c(a0.a(GroupInfoViewModel.class), new j(schedulerProvider, compositeDisposable, chatRepository, userRepository, arenaRepository, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, GroupInfoViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupInfoViewModel.class, "<this>", GroupInfoViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(groupInfoViewModel);
            this.f17254b = groupInfoViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
