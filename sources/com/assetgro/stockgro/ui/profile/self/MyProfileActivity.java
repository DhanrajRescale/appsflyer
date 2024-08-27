package com.assetgro.stockgro.ui.profile.self;

import android.content.Intent;
import androidx.fragment.app.g0;
import ba.q2;
import ch.c;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import gd.b;
import ih.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/self/MyProfileActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/profile/user/UserProfileViewModel;", "Lba/q2;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MyProfileActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10050k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_my_profile;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((UserProfileViewModel) x()).f10078v.observe(this, new c(10, new t(this, 0)));
        ((UserProfileViewModel) x()).f9084g.observe(this, new c(10, new t(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        this.f17260h = "my-profile";
        ((UserProfileViewModel) x()).i();
        ((q2) w()).f5827u.setTitle(HttpUrl.FRAGMENT_ENCODE_SET);
        u(((q2) w()).f5827u);
        q2 q2Var = (q2) w();
        q2Var.f5827u.setNavigationOnClickListener(new p004if.c(this, 27));
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        g0 C = getSupportFragmentManager().C("SubscribeToAccessBottomSheetDialogFragment");
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        } else if (C != null) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
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
    }
}
