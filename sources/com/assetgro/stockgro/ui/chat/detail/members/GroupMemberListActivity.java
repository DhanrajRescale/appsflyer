package com.assetgro.stockgro.ui.chat.detail.members;

import a3.a;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.e;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import b3.t;
import ba.o0;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import e.c;
import ea.v;
import gd.b;
import ge.f;
import in.juspay.hyper.constants.LogSubCategory;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;
import vd.d;
import vd.j;
import vd.k;
import vd.l;
import vd.s;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/members/GroupMemberListActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/detail/members/GroupMemberListViewModel;", "Lba/o0;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupMemberListActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9283m = 0;

    /* renamed from: k, reason: collision with root package name */
    public final c f9284k;

    /* renamed from: l, reason: collision with root package name */
    public d f9285l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    public GroupMemberListActivity() {
        c registerForActivityResult = registerForActivityResult(new Object(), new t(this, 0));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f9284k = registerForActivityResult;
    }

    public static final void K(GroupMemberListActivity groupMemberListActivity, GroupMember groupMember) {
        Class cls;
        groupMemberListActivity.getClass();
        if (groupMember.getIsExpert()) {
            cls = RiaProfileActivity.class;
        } else {
            cls = UserProfileActivity.class;
        }
        Intent intent = new Intent(groupMemberListActivity, (Class<?>) cls);
        intent.putExtra("USER_IDENTIFIER", groupMember.getUserId());
        intent.putExtra("CALL_FROM_CHAT", true);
        intent.putExtra("USER_NAME", groupMember.getMemberName());
        groupMemberListActivity.startActivity(intent);
    }

    public static final void L(GroupMemberListActivity groupMemberListActivity, GroupMember groupMember) {
        String str;
        Group group = (Group) ((GroupMemberListViewModel) groupMemberListActivity.x()).K.getValue();
        if (group != null) {
            str = group.getGroupName();
        } else {
            str = null;
        }
        String memberName = groupMember.getMemberName();
        if (memberName == null) {
            memberName = LogSubCategory.Action.USER;
        }
        String username = groupMember.getUsername();
        String string = groupMemberListActivity.getString(R.string.text_are_you_sure_to_add_admin);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String m10 = a.m(new Object[]{memberName, username, str}, 3, string, "format(...)");
        int length = memberName.length() + 20;
        SpannableString spannableString = new SpannableString(m10);
        spannableString.setSpan(new StyleSpan(1), 20, length, 33);
        String string2 = groupMemberListActivity.getString(R.string.text_add_as_admin);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = groupMemberListActivity.getString(R.string.text_yes);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = groupMemberListActivity.getString(R.string.cancel);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        ci.c socialBottomSheetData = new ci.c(R.drawable.ic_add_admin, string2, spannableString, string3, string4);
        int i10 = ci.b.f8154i;
        Intrinsics.checkNotNullParameter(socialBottomSheetData, "socialBottomSheetData");
        Bundle bundle = new Bundle();
        ci.b bVar = new ci.b();
        bundle.putSerializable("DATA", socialBottomSheetData);
        bVar.setArguments(bundle);
        bVar.show(groupMemberListActivity.getSupportFragmentManager(), "SocialActionConfirmationBottomSheet");
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_group_members_list;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((GroupMemberListViewModel) x()).f9084g.observe(this, new id.a(10, new l(this, 2)));
        ((GroupMemberListViewModel) x()).f9289q.observe(this, new id.a(10, new l(this, 3)));
        ((GroupMemberListViewModel) x()).A.observe(this, new id.a(10, new l(this, 4)));
        ((GroupMemberListViewModel) x()).f9291s.observe(this, new id.a(10, new l(this, 5)));
        ((GroupMemberListViewModel) x()).f9288p.observe(this, new id.a(10, new l(this, 6)));
        ((GroupMemberListViewModel) x()).f9292t.observe(this, new id.a(10, new l(this, 7)));
        ((GroupMemberListViewModel) x()).f9294v.observe(this, new id.a(10, new l(this, 8)));
        ((GroupMemberListViewModel) x()).f9295w.observe(this, new id.a(10, new l(this, 9)));
        ((GroupMemberListViewModel) x()).f9296x.observe(this, new id.a(10, new l(this, 10)));
        ((GroupMemberListViewModel) x()).f9297y.observe(this, new id.a(10, new l(this, 0)));
        ((GroupMemberListViewModel) x()).M.observe(this, new id.a(10, new l(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        int i10;
        String stringExtra = getIntent().getStringExtra("CHAT_GROUP_ID");
        int i11 = 3;
        if (stringExtra != null) {
            GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) x();
            Intrinsics.checkNotNullParameter(stringExtra, "<set-?>");
            groupMemberListViewModel.E = stringExtra;
            ((GroupMemberListViewModel) x()).m();
            GroupMemberListViewModel groupMemberListViewModel2 = (GroupMemberListViewModel) x();
            groupMemberListViewModel2.f9084g.postValue(Boolean.TRUE);
            g.H(u0.f(groupMemberListViewModel2), null, null, new s(groupMemberListViewModel2, null), 3);
        }
        String stringExtra2 = getIntent().getStringExtra("CHAT_GROUP_TYPE");
        if (stringExtra2 != null) {
            GroupMemberListViewModel groupMemberListViewModel3 = (GroupMemberListViewModel) x();
            Intrinsics.checkNotNullParameter(stringExtra2, "<set-?>");
            groupMemberListViewModel3.D = stringExtra2;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("SHOW_SELECT_ADMIN_VIEW", false);
        ((GroupMemberListViewModel) x()).I = booleanExtra;
        if (booleanExtra) {
            i10 = R.string.text_choose_an_admin;
        } else {
            i10 = R.string.group_members;
        }
        boolean z10 = !booleanExtra;
        o0 o0Var = (o0) w();
        String string = getString(i10);
        Toolbar toolbar = o0Var.f5633v;
        toolbar.setTitle(string);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new j(this, 0));
        v(toolbar);
        String userId = ((GroupMemberListViewModel) x()).f9286n.getUserId();
        if (userId != null) {
            GroupMemberListViewModel groupMemberListViewModel4 = (GroupMemberListViewModel) x();
            Intrinsics.checkNotNullParameter(userId, "userId");
            groupMemberListViewModel4.f9084g.postValue(Boolean.TRUE);
            g.H(u0.f(groupMemberListViewModel4), null, null, new vd.t(groupMemberListViewModel4, userId, null), 3);
        }
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        d dVar = new d(lifecycle, ((GroupMemberListViewModel) x()).f9286n.getUserId(), new ja.g(booleanExtra, this, i11), new l(this, 12), new e(this, 26), z10, false);
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f9285l = dVar;
        ((o0) w()).f5632u.setOnRefreshListener(new k(this));
        ((o0) w()).f5631t.setAdapter(M());
        ((o0) w()).f5630s.setMyScrollChangeListener(new va.b(this, 2));
        getSupportFragmentManager().a0(this, new k(this));
    }

    public final d M() {
        d dVar = this.f9285l;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.k("groupMemberAdapter");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.toolbar_menu_search, menu);
        Intrinsics.c(menu);
        MenuItem findItem = menu.findItem(R.id.action_search);
        findItem.setVisible(true);
        findItem.setOnActionExpandListener(new la.a(this, 3));
        View actionView = findItem.getActionView();
        Intrinsics.d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setOnSearchClickListener(new j(this, 1));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        searchView.setOnQueryTextListener(new f(lifecycle, new l(this, 11)));
        return super.onCreateOptionsMenu(menu);
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
        ca.c factory = new ca.c(a0.a(GroupMemberListViewModel.class), new ea.d(schedulerProvider, compositeDisposable, userRepository, chatRepository, 3));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, GroupMemberListViewModel.class, "modelClass");
        iu.e b10 = a.b(GroupMemberListViewModel.class, "<this>", GroupMemberListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupMemberListViewModel);
            this.f17254b = groupMemberListViewModel;
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
