package kh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.d1;
import androidx.fragment.app.j0;
import ba.p4;
import ba.wp;
import ba.xp;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.UserProfileSharedViewModel;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingActivity;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkh/y;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/profile/statistics/UserStatisticsViewModel;", "Lba/wp;", "<init>", "()V", "yk/g", HttpUrl.FRAGMENT_ENCODE_SET, "isSheetOpened", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class y extends gd.m<UserStatisticsViewModel, wp> {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f23187n = 0;

    /* renamed from: g, reason: collision with root package name */
    public String f23188g;

    /* renamed from: h, reason: collision with root package name */
    public String f23189h = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: i, reason: collision with root package name */
    public String f23190i = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: j, reason: collision with root package name */
    public yk.j f23191j = p.f23164a;

    /* renamed from: k, reason: collision with root package name */
    public final e.c f23192k;

    /* renamed from: l, reason: collision with root package name */
    public UserProfileSharedViewModel f23193l;

    /* renamed from: m, reason: collision with root package name */
    public ch.h f23194m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f.a, java.lang.Object] */
    public y() {
        e.c registerForActivityResult = registerForActivityResult(new Object(), new b3.t(this, 10));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f23192k = registerForActivityResult;
    }

    public static final void H(y yVar) {
        if (yVar.getActivity() instanceof UserProfileActivity) {
            j0 activity = yVar.getActivity();
            Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.user.UserProfileActivity");
            ((UserProfileActivity) activity).f10066l = false;
            j0 activity2 = yVar.getActivity();
            Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.user.UserProfileActivity");
            FloatingActionButton chat = ((p4) ((UserProfileActivity) activity2).w()).f5719t;
            Intrinsics.checkNotNullExpressionValue(chat, "chat");
            zq.f.m0(chat);
            j0 activity3 = yVar.getActivity();
            Intrinsics.d(activity3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.user.UserProfileActivity");
            ((UserProfileActivity) activity3).invalidateOptionsMenu();
        }
        TabLayout tabLayout = ((wp) yVar.q()).f6567z;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        zq.f.m0(tabLayout);
        ConstraintLayout userYouBlocked = ((wp) yVar.q()).H;
        Intrinsics.checkNotNullExpressionValue(userYouBlocked, "userYouBlocked");
        zq.f.M(userYouBlocked);
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_user_stats;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((UserStatisticsViewModel) r()).f10057t.observe(this, new ch.c(12, new s(this, 2)));
        ((UserStatisticsViewModel) r()).D.observe(this, new ch.c(12, new s(this, 3)));
        ((UserStatisticsViewModel) r()).f10063z.observe(this, new ch.c(12, new s(this, 4)));
        ((UserStatisticsViewModel) r()).f10058u.observe(this, new ch.c(12, new s(this, 5)));
        ((UserStatisticsViewModel) r()).f10059v.observe(this, new ch.c(12, new s(this, 6)));
        ((UserStatisticsViewModel) r()).f9084g.observe(this, new ch.c(12, new s(this, 7)));
        ((UserStatisticsViewModel) r()).f10061x.observe(this, new ch.c(12, new s(this, 8)));
        UserProfileSharedViewModel userProfileSharedViewModel = this.f23193l;
        if (userProfileSharedViewModel != null) {
            userProfileSharedViewModel.f9976n.observe(this, new ch.c(12, new s(this, 9)));
            ((UserStatisticsViewModel) r()).f10062y.observe(this, new ch.c(12, new s(this, 10)));
            ((UserStatisticsViewModel) r()).A.observe(this, new ch.c(12, new s(this, 0)));
            ((UserStatisticsViewModel) r()).B.observe(this, new ch.c(12, new s(this, 1)));
            return;
        }
        Intrinsics.k("userProfileSharedViewModel");
        throw null;
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(view, "view");
        ((wp) q()).p(this);
        xp xpVar = (xp) ((wp) q());
        xpVar.I = (UserStatisticsViewModel) r();
        synchronized (xpVar) {
            xpVar.J |= 4;
        }
        xpVar.a(24);
        xpVar.m();
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            str = arguments.getString("USER_NAME");
        } else {
            str = null;
        }
        if (str == null) {
            str = getString(R.string.player);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this.f23188g = str;
        ((wp) q()).f6566y.setOnRefreshListener(new q(this));
        final int i10 = 1;
        if (K()) {
            ((wp) q()).f6560s.setText(getString(R.string.channel_action_edit));
            this.f23191j = p.f23164a;
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null && arguments2.getBoolean("IS_FRIEND")) {
                String string = getString(R.string.cta_following);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                L(string, p.f23166c, R.drawable.secondary_button_background, R.color.secondary_button_text_color);
            } else {
                String string2 = getString(R.string.follow);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                L(string2, p.f23165b, R.drawable.primary_button, R.color.primary_button_text_color);
            }
        }
        ((wp) q()).f6560s.setOnClickListener(new p004if.c(this, 28));
        MaterialTextView materialTextView = ((wp) q()).G;
        String str4 = this.f23188g;
        if (str4 != null) {
            materialTextView.setText(str4);
            j0 activity = getActivity();
            if (activity instanceof UserProfileActivity) {
                j0 activity2 = getActivity();
                Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.user.UserProfileActivity");
            } else if (activity instanceof MyProfileActivity) {
                j0 activity3 = getActivity();
                Intrinsics.d(activity3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.self.MyProfileActivity");
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str2 = arguments3.getString("USER_IDENTIFIER");
            } else {
                str2 = null;
            }
            this.f23190i = str2;
            if (str2 != null) {
                UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) r();
                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                userStatisticsViewModel.f10054q = str2;
                ((UserStatisticsViewModel) r()).j();
            }
            final Intent intent = new Intent(requireContext(), (Class<?>) FollowerFollowingActivity.class);
            intent.putExtra("USER_IDENTIFIER", this.f23190i);
            final int i11 = 0;
            ((wp) q()).f6561t.setOnClickListener(new View.OnClickListener() { // from class: kh.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i11;
                    y this$0 = this;
                    Intent intentToFollowersFollowing = intent;
                    switch (i12) {
                        case 0:
                            int i13 = y.f23187n;
                            Intrinsics.checkNotNullParameter(intentToFollowersFollowing, "$intentToFollowersFollowing");
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            intentToFollowersFollowing.putExtra("FOLLOWER_FOLLOWING", 0);
                            intentToFollowersFollowing.putExtra("HIDE_FOLLOWING", (Serializable) ((UserStatisticsViewModel) this$0.r()).M.getValue());
                            this$0.f23192k.a(intentToFollowersFollowing);
                            return;
                        default:
                            int i14 = y.f23187n;
                            Intrinsics.checkNotNullParameter(intentToFollowersFollowing, "$intentToFollowersFollowing");
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            intentToFollowersFollowing.putExtra("FOLLOWER_FOLLOWING", 1);
                            this$0.f23192k.a(intentToFollowersFollowing);
                            return;
                    }
                }
            });
            ((wp) q()).f6562u.setOnClickListener(new View.OnClickListener() { // from class: kh.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i10;
                    y this$0 = this;
                    Intent intentToFollowersFollowing = intent;
                    switch (i12) {
                        case 0:
                            int i13 = y.f23187n;
                            Intrinsics.checkNotNullParameter(intentToFollowersFollowing, "$intentToFollowersFollowing");
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            intentToFollowersFollowing.putExtra("FOLLOWER_FOLLOWING", 0);
                            intentToFollowersFollowing.putExtra("HIDE_FOLLOWING", (Serializable) ((UserStatisticsViewModel) this$0.r()).M.getValue());
                            this$0.f23192k.a(intentToFollowersFollowing);
                            return;
                        default:
                            int i14 = y.f23187n;
                            Intrinsics.checkNotNullParameter(intentToFollowersFollowing, "$intentToFollowersFollowing");
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            intentToFollowersFollowing.putExtra("FOLLOWER_FOLLOWING", 1);
                            this$0.f23192k.a(intentToFollowersFollowing);
                            return;
                    }
                }
            });
            d1 childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            androidx.lifecycle.o lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            String str5 = this.f23190i;
            if (str5 == null) {
                str5 = ((UserStatisticsViewModel) r()).f10054q;
            }
            String str6 = str5;
            String str7 = this.f23188g;
            if (str7 != null) {
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    str3 = arguments4.getString("USER_PROFILE_PHOTO");
                }
                ch.h hVar = new ch.h(childFragmentManager, lifecycle, str6, str7, str3, getArguments());
                Intrinsics.checkNotNullParameter(hVar, "<set-?>");
                this.f23194m = hVar;
                ((wp) q()).f6563v.setAdapter(J());
                new yo.n(((wp) q()).f6567z, ((wp) q()).f6563v, new q(this)).a();
                ((wp) q()).f6566y.setRefreshing(false);
                return;
            }
            Intrinsics.k("userName");
            throw null;
        }
        Intrinsics.k("userName");
        throw null;
    }

    public final void I(boolean z10) {
        if (getActivity() instanceof UserProfileActivity) {
            j0 activity = getActivity();
            Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.user.UserProfileActivity");
            ((UserProfileActivity) activity).f10066l = true;
            j0 activity2 = getActivity();
            Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.user.UserProfileActivity");
            ((UserProfileActivity) activity2).invalidateOptionsMenu();
        }
        TabLayout tabLayout = ((wp) q()).f6567z;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        zq.f.M(tabLayout);
        ConstraintLayout userYouBlocked = ((wp) q()).H;
        Intrinsics.checkNotNullExpressionValue(userYouBlocked, "userYouBlocked");
        zq.f.m0(userYouBlocked);
        if (getActivity() instanceof UserProfileActivity) {
            j0 activity3 = getActivity();
            Intrinsics.d(activity3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.user.UserProfileActivity");
            FloatingActionButton chat = ((p4) ((UserProfileActivity) activity3).w()).f5719t;
            Intrinsics.checkNotNullExpressionValue(chat, "chat");
            zq.f.M(chat);
        }
        String string = getString(R.string.text_unblock_normal);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        L(string, p.f23167d, R.drawable.secondary_button_background, R.color.secondary_button_text_color);
        if (z10) {
            MaterialButton btnEditFollowFollowing = ((wp) q()).f6560s;
            Intrinsics.checkNotNullExpressionValue(btnEditFollowFollowing, "btnEditFollowFollowing");
            zq.f.M(btnEditFollowFollowing);
        }
    }

    public final ch.h J() {
        ch.h hVar = this.f23194m;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.k("myProfileTabAdapter");
        throw null;
    }

    public final boolean K() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("USER_IDENTIFIER")) == null || !((UserStatisticsViewModel) r()).i(string)) {
            return false;
        }
        return true;
    }

    public final void L(String str, yk.j jVar, int i10, int i11) {
        ((wp) q()).f6560s.setText(str);
        ((wp) q()).f6560s.setBackgroundResource(i10);
        if (i11 != -1) {
            wp wpVar = (wp) q();
            wpVar.f6560s.setTextColor(r3.k.getColor(requireContext(), i11));
        }
        this.f23191j = jVar;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.n();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        yk.g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        yk.g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        yk.g.i(h10);
        this.f17287e = h10;
        this.f23193l = fragmentComponent.m();
    }
}
