package com.assetgro.stockgro.ui.profile.user;

import ak.p;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import b1.d;
import b3.t;
import ba.p4;
import com.assetgro.stockgro.data.model.OneToOneChatGroup;
import com.assetgro.stockgro.data.remote.response.ReportEntityType;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.UserProfileSharedViewModel;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import e.c;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import m0.o0;
import nh.i;
import nk.a;
import nk.e;
import okhttp3.HttpUrl;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/user/UserProfileActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/profile/user/UserProfileViewModel;", "Lba/p4;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "isSheetOpened", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserProfileActivity extends b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f10064p = 0;

    /* renamed from: k, reason: collision with root package name */
    public String f10065k = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10066l;

    /* renamed from: m, reason: collision with root package name */
    public final c f10067m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10068n;

    /* renamed from: o, reason: collision with root package name */
    public UserProfileSharedViewModel f10069o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [f.a, java.lang.Object] */
    public UserProfileActivity() {
        c registerForActivityResult = registerForActivityResult(new Object(), new t(this, 11));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f10067m = registerForActivityResult;
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_user_profile;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((UserProfileViewModel) x()).f10072p.observe(this, new ch.c(13, new i(this, 0)));
        ((UserProfileViewModel) x()).f10077u.observe(this, new ch.c(13, new i(this, 1)));
        ((UserProfileViewModel) x()).f10078v.observe(this, new ch.c(13, new i(this, 2)));
        ((UserProfileViewModel) x()).f10074r.observe(this, new ch.c(13, new i(this, 3)));
        ((UserProfileViewModel) x()).f10075s.observe(this, new ch.c(13, new i(this, 4)));
        ((UserProfileViewModel) x()).f10076t.observe(this, new ch.c(13, new i(this, 5)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, android.view.View$OnTouchListener] */
    @Override // gd.b
    public final void I() {
        String str;
        this.f17260h = "user-profile";
        p4 p4Var = (p4) w();
        final int i10 = 0;
        p4Var.f5721v.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: nh.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f28694b;

            {
                this.f28694b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                UserProfileActivity this$0 = this.f28694b;
                switch (i11) {
                    case 0:
                        int i12 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserProfileViewModel userProfileViewModel = (UserProfileViewModel) this$0.x();
                        String uuid = this$0.f10065k;
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        userProfileViewModel.f10072p.postValue(Boolean.TRUE);
                        yk.g.H(u0.f(userProfileViewModel), null, null, new l(userProfileViewModel, uuid, null), 3);
                        return;
                    case 2:
                        int i14 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserProfileViewModel userProfileViewModel2 = (UserProfileViewModel) this$0.x();
                        String str2 = this$0.f10065k;
                        String d10 = a3.a.d("toString(...)");
                        userProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                        ChatRepository chatRepository = userProfileViewModel2.f10071o;
                        nt.h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, str2, chatRepository.getUserId())).c(((kq.e) userProfileViewModel2.f9079b).J());
                        jt.d dVar = new jt.d(new k(3, new m(userProfileViewModel2, 1)), new k(4, new m(userProfileViewModel2, 2)));
                        c10.a(dVar);
                        userProfileViewModel2.f9080c.c(dVar);
                        return;
                    default:
                        int i15 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.finish();
                        return;
                }
            }
        });
        Toolbar toolbar = ((p4) w()).f5721v;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("USER_IDENTIFIER");
        } else {
            str = null;
        }
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        this.f10065k = str;
        ((UserProfileViewModel) x()).f10079w = this.f10065k;
        ((UserProfileViewModel) x()).i();
        a p10 = ((e) ((e) new a().f(p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
        Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
        p4 p4Var2 = (p4) w();
        final int i11 = 1;
        p4Var2.f5718s.setOnClickListener(new View.OnClickListener(this) { // from class: nh.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f28694b;

            {
                this.f28694b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                UserProfileActivity this$0 = this.f28694b;
                switch (i112) {
                    case 0:
                        int i12 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserProfileViewModel userProfileViewModel = (UserProfileViewModel) this$0.x();
                        String uuid = this$0.f10065k;
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        userProfileViewModel.f10072p.postValue(Boolean.TRUE);
                        yk.g.H(u0.f(userProfileViewModel), null, null, new l(userProfileViewModel, uuid, null), 3);
                        return;
                    case 2:
                        int i14 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserProfileViewModel userProfileViewModel2 = (UserProfileViewModel) this$0.x();
                        String str2 = this$0.f10065k;
                        String d10 = a3.a.d("toString(...)");
                        userProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                        ChatRepository chatRepository = userProfileViewModel2.f10071o;
                        nt.h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, str2, chatRepository.getUserId())).c(((kq.e) userProfileViewModel2.f9079b).J());
                        jt.d dVar = new jt.d(new k(3, new m(userProfileViewModel2, 1)), new k(4, new m(userProfileViewModel2, 2)));
                        c10.a(dVar);
                        userProfileViewModel2.f9080c.c(dVar);
                        return;
                    default:
                        int i15 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.finish();
                        return;
                }
            }
        });
        p4 p4Var3 = (p4) w();
        final int i12 = 2;
        p4Var3.f5719t.setOnClickListener(new View.OnClickListener(this) { // from class: nh.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f28694b;

            {
                this.f28694b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                UserProfileActivity this$0 = this.f28694b;
                switch (i112) {
                    case 0:
                        int i122 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserProfileViewModel userProfileViewModel = (UserProfileViewModel) this$0.x();
                        String uuid = this$0.f10065k;
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        userProfileViewModel.f10072p.postValue(Boolean.TRUE);
                        yk.g.H(u0.f(userProfileViewModel), null, null, new l(userProfileViewModel, uuid, null), 3);
                        return;
                    case 2:
                        int i14 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserProfileViewModel userProfileViewModel2 = (UserProfileViewModel) this$0.x();
                        String str2 = this$0.f10065k;
                        String d10 = a3.a.d("toString(...)");
                        userProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                        ChatRepository chatRepository = userProfileViewModel2.f10071o;
                        nt.h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, str2, chatRepository.getUserId())).c(((kq.e) userProfileViewModel2.f9079b).J());
                        jt.d dVar = new jt.d(new k(3, new m(userProfileViewModel2, 1)), new k(4, new m(userProfileViewModel2, 2)));
                        c10.a(dVar);
                        userProfileViewModel2.f9080c.c(dVar);
                        return;
                    default:
                        int i15 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.finish();
                        return;
                }
            }
        });
        if (!Intrinsics.a(this.f10065k, ((UserProfileViewModel) x()).h())) {
            u(((p4) w()).f5721v);
        }
        p4 p4Var4 = (p4) w();
        final int i13 = 3;
        p4Var4.f5721v.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: nh.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f28694b;

            {
                this.f28694b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                UserProfileActivity this$0 = this.f28694b;
                switch (i112) {
                    case 0:
                        int i122 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i132 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserProfileViewModel userProfileViewModel = (UserProfileViewModel) this$0.x();
                        String uuid = this$0.f10065k;
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        userProfileViewModel.f10072p.postValue(Boolean.TRUE);
                        yk.g.H(u0.f(userProfileViewModel), null, null, new l(userProfileViewModel, uuid, null), 3);
                        return;
                    case 2:
                        int i14 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserProfileViewModel userProfileViewModel2 = (UserProfileViewModel) this$0.x();
                        String str2 = this$0.f10065k;
                        String d10 = a3.a.d("toString(...)");
                        userProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                        ChatRepository chatRepository = userProfileViewModel2.f10071o;
                        nt.h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, str2, chatRepository.getUserId())).c(((kq.e) userProfileViewModel2.f9079b).J());
                        jt.d dVar = new jt.d(new k(3, new m(userProfileViewModel2, 1)), new k(4, new m(userProfileViewModel2, 2)));
                        c10.a(dVar);
                        userProfileViewModel2.f9080c.c(dVar);
                        return;
                    default:
                        int i15 = UserProfileActivity.f10064p;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.setResult(-1);
                        this$0.finish();
                        return;
                }
            }
        });
        p4 p4Var5 = (p4) w();
        p4Var5.f5719t.setOnTouchListener(new Object());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.menu_user_profile, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        String str = null;
        if (itemId != R.id.menu_options_block_user) {
            if (itemId == R.id.menu_options_report_user) {
                Intent intent = new Intent(this, (Class<?>) ReportEntityActivity.class);
                Intent intent2 = getIntent();
                if (intent2 != null) {
                    str = intent2.getStringExtra("USER_NAME");
                }
                intent.putExtra("REPORT_USER_NAME", str);
                intent.putExtra("USER_ID_TO_BE_REPORTED", ((UserProfileViewModel) x()).f10079w);
                intent.putExtra("ENTITY_TYPE_TO_BE_REPORTED", ReportEntityType.User);
                intent.putExtra("IS_BLOCKED", this.f10066l);
                this.f10067m.a(intent);
            }
        } else {
            View findViewById = findViewById(android.R.id.content);
            Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) findViewById;
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ComposeView composeView = new ComposeView(context, null, 6);
            o0 o0Var = new o0(19, composeView, this, viewGroup);
            Object obj = d.f3079a;
            composeView.setContent(new b1.c(o0Var, true, -1773200179));
            viewGroup.addView(composeView);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem;
        if (menu != null) {
            menuItem = menu.findItem(R.id.menu_options_block_user);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(!this.f10066l);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.s();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        g.i(h10);
        this.f17258f = h10;
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
        ca.c factory = new ca.c(a0.a(UserProfileSharedViewModel.class), new ea.d(schedulerProvider, compositeDisposable, userRepository, chatRepository, 7));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, UserProfileSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(UserProfileSharedViewModel.class, "<this>", UserProfileSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            UserProfileSharedViewModel userProfileSharedViewModel = (UserProfileSharedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(userProfileSharedViewModel);
            this.f10069o = userProfileSharedViewModel;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
