package com.assetgro.stockgro.ui.drawer.about;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ba.e;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.about.AppAboutSectionActivity;
import com.assetgro.stockgro.ui.drawer.about.AppPrivacyPolicyActivity;
import com.assetgro.stockgro.ui.drawer.about.AppTncActivity;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import gd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/about/AppAboutSectionActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/drawer/about/AppAboutViewModel;", "Lba/e;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AppAboutSectionActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9470k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_app_about_section;
    }

    @Override // gd.b
    public final void I() {
        e eVar = (e) w();
        String string = getString(R.string.text_about);
        Toolbar toolbar = eVar.f4548u;
        toolbar.setTitle(string);
        v(toolbar);
        u(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ve.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppAboutSectionActivity f38022b;

            {
                this.f38022b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                AppAboutSectionActivity this$0 = this.f38022b;
                switch (i11) {
                    case 0:
                        int i12 = AppAboutSectionActivity.f9470k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 1:
                        int i13 = AppAboutSectionActivity.f9470k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.startActivity(new Intent(this$0, (Class<?>) AppTncActivity.class));
                        return;
                    default:
                        int i14 = AppAboutSectionActivity.f9470k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.startActivity(new Intent(this$0, (Class<?>) AppPrivacyPolicyActivity.class));
                        return;
                }
            }
        });
        e eVar2 = (e) w();
        final int i11 = 1;
        eVar2.f4547t.setOnClickListener(new View.OnClickListener(this) { // from class: ve.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppAboutSectionActivity f38022b;

            {
                this.f38022b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                AppAboutSectionActivity this$0 = this.f38022b;
                switch (i112) {
                    case 0:
                        int i12 = AppAboutSectionActivity.f9470k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 1:
                        int i13 = AppAboutSectionActivity.f9470k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.startActivity(new Intent(this$0, (Class<?>) AppTncActivity.class));
                        return;
                    default:
                        int i14 = AppAboutSectionActivity.f9470k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.startActivity(new Intent(this$0, (Class<?>) AppPrivacyPolicyActivity.class));
                        return;
                }
            }
        });
        e eVar3 = (e) w();
        final int i12 = 2;
        eVar3.f4546s.setOnClickListener(new View.OnClickListener(this) { // from class: ve.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppAboutSectionActivity f38022b;

            {
                this.f38022b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                AppAboutSectionActivity this$0 = this.f38022b;
                switch (i112) {
                    case 0:
                        int i122 = AppAboutSectionActivity.f9470k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    case 1:
                        int i13 = AppAboutSectionActivity.f9470k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.startActivity(new Intent(this$0, (Class<?>) AppTncActivity.class));
                        return;
                    default:
                        int i14 = AppAboutSectionActivity.f9470k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        this$0.startActivity(new Intent(this$0, (Class<?>) AppPrivacyPolicyActivity.class));
                        return;
                }
            }
        });
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.a();
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
