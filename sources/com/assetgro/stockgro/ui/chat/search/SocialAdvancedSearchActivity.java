package com.assetgro.stockgro.ui.chat.search;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.v3;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.u;
import ea.v;
import gd.b;
import ge.f;
import id.a;
import iu.a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qe.c;
import qu.i0;
import r3.k;
import se.d;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/search/SocialAdvancedSearchActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/search/SocialAdvancedSearchViewModel;", "Lba/v3;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SocialAdvancedSearchActivity extends b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f9423o = 0;

    /* renamed from: k, reason: collision with root package name */
    public d f9424k;

    /* renamed from: l, reason: collision with root package name */
    public te.b f9425l;

    /* renamed from: m, reason: collision with root package name */
    public re.b f9426m;

    /* renamed from: n, reason: collision with root package name */
    public Menu f9427n;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_social_search_advanced;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((SocialAdvancedSearchViewModel) x()).f9084g.observe(this, new a(29, new c(this, 0)));
        ((SocialAdvancedSearchViewModel) x()).f9430p.observe(this, new a(29, new c(this, 1)));
        ((SocialAdvancedSearchViewModel) x()).f9431q.observe(this, new a(29, new c(this, 2)));
        ((SocialAdvancedSearchViewModel) x()).f9432r.observe(this, new a(29, new c(this, 3)));
        ((SocialAdvancedSearchViewModel) x()).f9433s.observe(this, new a(29, new c(this, 4)));
        ((SocialAdvancedSearchViewModel) x()).f9434t.observe(this, new a(29, new c(this, 5)));
    }

    @Override // gd.b
    public final void I() {
        v3 v3Var = (v3) w();
        v3Var.B.setTitle(getString(R.string.text_social_lowercase));
        Toolbar toolbar = ((v3) w()).B;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((v3) w()).B);
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        int i10 = 7;
        d dVar = new d(lifecycle, new c(this, 7));
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f9424k = dVar;
        v3 v3Var2 = (v3) w();
        d dVar2 = this.f9424k;
        if (dVar2 != null) {
            v3Var2.f6378y.setAdapter(dVar2);
            o lifecycle2 = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
            re.b bVar = new re.b(lifecycle2, new c(this, 8), new qe.d(this, 0));
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            this.f9426m = bVar;
            o lifecycle3 = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle3, "<get-lifecycle>(...)");
            te.b bVar2 = new te.b(lifecycle3, new c(this, 9), new qe.d(this, 1));
            Intrinsics.checkNotNullParameter(bVar2, "<set-?>");
            this.f9425l = bVar2;
            ((v3) w()).f6373t.A.setAdapter(L());
            ((v3) w()).f6373t.D.setAdapter(K());
            v3 v3Var3 = (v3) w();
            v3Var3.f6375v.setOnClickListener(new qe.b(this, 4));
            ((v3) w()).f6373t.f4869s.setOnClickListener(new qe.b(this, 5));
            ((v3) w()).f6373t.f4870t.setOnClickListener(new qe.b(this, 6));
            ((v3) w()).f6373t.f4871u.setOnClickListener(new qe.b(this, i10));
            return;
        }
        Intrinsics.k("searchHistoryAdapter");
        throw null;
    }

    public final re.b K() {
        re.b bVar = this.f9426m;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.k("groupSearchAdapter");
        throw null;
    }

    public final te.b L() {
        te.b bVar = this.f9425l;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.k("userSearchAdapter");
        throw null;
    }

    public final void M() {
        ((v3) w()).f6373t.f4874x.setVisibility(8);
        ((v3) w()).f6373t.f4875y.setVisibility(8);
        ((v3) w()).f6373t.f4876z.setVisibility(0);
        ((v3) w()).f6373t.B.setVisibility(8);
        ((v3) w()).f6373t.G.setVisibility(8);
    }

    public final void N(TextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(k.getDrawable(this, R.drawable.background_social_search_chip_unselected));
    }

    public final void O(List list) {
        if (((SocialAdvancedSearchViewModel) x()).f9438x == 0) {
            K().u(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        List p10 = K().p();
        Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
        arrayList.addAll(p10);
        arrayList.addAll(list);
        K().u(arrayList);
    }

    public final void P(List list) {
        if (((SocialAdvancedSearchViewModel) x()).f9438x == 0) {
            L().u(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        List p10 = L().p();
        Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
        arrayList.addAll(p10);
        arrayList.addAll(list);
        L().u(arrayList);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.toolbar_menu_search, menu);
        if (menu != null) {
            this.f9427n = menu;
            MenuItem findItem = menu.findItem(R.id.action_search);
            findItem.setVisible(true);
            findItem.expandActionView();
            findItem.setOnActionExpandListener(new la.a(this, 5));
            View actionView = findItem.getActionView();
            Intrinsics.d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
            SearchView searchView = (SearchView) actionView;
            searchView.setOnSearchClickListener(new qe.b(this, 0));
            o lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            searchView.setOnQueryTextListener(new f(lifecycle, new c(this, 6)));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        ChatRepository chatRepository = activityComponent.f14246a.b();
        g.i(chatRepository);
        FollowerRepository followerRepository = activityComponent.f14246a.f();
        g.i(followerRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        ca.c factory = new ca.c(a0.a(SocialAdvancedSearchViewModel.class), new u(chatRepository, followerRepository, userRepository, schedulerProvider, compositeDisposable));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, SocialAdvancedSearchViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SocialAdvancedSearchViewModel.class, "<this>", SocialAdvancedSearchViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = (SocialAdvancedSearchViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(socialAdvancedSearchViewModel);
            this.f17254b = socialAdvancedSearchViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            g.i(activityComponent.f14246a.d());
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
