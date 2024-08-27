package com.assetgro.stockgro.ui.drawer.rate;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import at.m;
import ba.d3;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.rate.RateAppActivity;
import com.assetgro.stockgro.ui.drawer.rate.RateAppViewModel;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.v;
import gd.b;
import ge.q;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import nt.h;
import okhttp3.HttpUrl;
import qu.i0;
import r3.k;
import re.d;
import yk.g;
import ze.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/rate/RateAppActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/drawer/rate/RateAppViewModel;", "Lba/d3;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RateAppActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9497k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_rate_app;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((RateAppViewModel) x()).f9084g.observe(this, new d(5, new c(this, 0)));
        ((RateAppViewModel) x()).f9498n.observe(this, new d(5, new c(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        this.f17260h = "rate-app";
        d3 d3Var = (d3) w();
        d3Var.f4439v.setText(getString(R.string.excellent));
        d3 d3Var2 = (d3) w();
        d3Var2.f4437t.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: ze.a
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f10, boolean z10) {
                int i10 = RateAppActivity.f9497k;
                RateAppActivity this$0 = RateAppActivity.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (f10 == 1.0f) {
                    d3 d3Var3 = (d3) this$0.w();
                    d3Var3.f4438u.setImageDrawable(k.getDrawable(this$0, R.drawable.ic_rating_one));
                    d3 d3Var4 = (d3) this$0.w();
                    d3Var4.f4439v.setText(this$0.getString(R.string.poor));
                    return;
                }
                if (f10 == 2.0f) {
                    d3 d3Var5 = (d3) this$0.w();
                    d3Var5.f4438u.setImageDrawable(k.getDrawable(this$0, R.drawable.ic_rating_two));
                    d3 d3Var6 = (d3) this$0.w();
                    d3Var6.f4439v.setText(this$0.getString(R.string.average));
                    return;
                }
                if (f10 == 3.0f) {
                    d3 d3Var7 = (d3) this$0.w();
                    d3Var7.f4438u.setImageDrawable(k.getDrawable(this$0, R.drawable.ic_rating_three));
                    d3 d3Var8 = (d3) this$0.w();
                    d3Var8.f4439v.setText(this$0.getString(R.string.ok));
                    return;
                }
                if (f10 == 4.0f) {
                    d3 d3Var9 = (d3) this$0.w();
                    d3Var9.f4438u.setImageDrawable(k.getDrawable(this$0, R.drawable.ic_rating_four));
                    d3 d3Var10 = (d3) this$0.w();
                    d3Var10.f4439v.setText(this$0.getString(R.string.good));
                    return;
                }
                if (f10 == 5.0f) {
                    d3 d3Var11 = (d3) this$0.w();
                    d3Var11.f4438u.setImageDrawable(k.getDrawable(this$0, R.drawable.ic_rating_five));
                    d3 d3Var12 = (d3) this$0.w();
                    d3Var12.f4439v.setText(this$0.getString(R.string.excellent));
                }
            }
        });
        d3 d3Var3 = (d3) w();
        final int i10 = 0;
        d3Var3.f4441x.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ze.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RateAppActivity f42437b;

            {
                this.f42437b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                RateAppActivity this$0 = this.f42437b;
                switch (i11) {
                    case 0:
                        int i12 = RateAppActivity.f9497k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    default:
                        int i13 = RateAppActivity.f9497k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String feedback = ((d3) this$0.w()).f4436s.getText().toString();
                        if (feedback.length() > 0) {
                            RateAppViewModel rateAppViewModel = (RateAppViewModel) this$0.x();
                            String rating = String.valueOf(((d3) this$0.w()).f4437t.getRating());
                            Intrinsics.checkNotNullParameter(rating, "rating");
                            Intrinsics.checkNotNullParameter(feedback, "feedback");
                            m<BaseResponseDto<Object>> submitFeedback = rateAppViewModel.f9081d.submitFeedback(rating, feedback);
                            q qVar = new q(13, new d(rateAppViewModel, 0));
                            submitFeedback.getClass();
                            h c10 = new nt.b(new nt.b(new nt.b(submitFeedback, qVar, 1), new q(14, new d(rateAppViewModel, 1)), 2), new q(15, new d(rateAppViewModel, 2)), 0).c(((e) rateAppViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new q(16, new d(rateAppViewModel, 3)), new q(17, new d(rateAppViewModel, 4)));
                            c10.a(dVar);
                            Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
                            rateAppViewModel.f9080c.c(dVar);
                            return;
                        }
                        String text = this$0.getString(R.string.leave_feedback_message);
                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                        Intrinsics.checkNotNullParameter(this$0, "context");
                        Intrinsics.checkNotNullParameter(text, "text");
                        if (text.length() != 0) {
                            Toast makeText = Toast.makeText(this$0, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                            Object systemService = this$0.getSystemService("layout_inflater");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                            return;
                        }
                        return;
                }
            }
        });
        Toolbar toolbar = ((d3) w()).f4441x;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        d3 d3Var4 = (d3) w();
        final int i11 = 1;
        d3Var4.f4440w.setOnClickListener(new View.OnClickListener(this) { // from class: ze.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RateAppActivity f42437b;

            {
                this.f42437b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                RateAppActivity this$0 = this.f42437b;
                switch (i112) {
                    case 0:
                        int i12 = RateAppActivity.f9497k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return;
                    default:
                        int i13 = RateAppActivity.f9497k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String feedback = ((d3) this$0.w()).f4436s.getText().toString();
                        if (feedback.length() > 0) {
                            RateAppViewModel rateAppViewModel = (RateAppViewModel) this$0.x();
                            String rating = String.valueOf(((d3) this$0.w()).f4437t.getRating());
                            Intrinsics.checkNotNullParameter(rating, "rating");
                            Intrinsics.checkNotNullParameter(feedback, "feedback");
                            m<BaseResponseDto<Object>> submitFeedback = rateAppViewModel.f9081d.submitFeedback(rating, feedback);
                            q qVar = new q(13, new d(rateAppViewModel, 0));
                            submitFeedback.getClass();
                            h c10 = new nt.b(new nt.b(new nt.b(submitFeedback, qVar, 1), new q(14, new d(rateAppViewModel, 1)), 2), new q(15, new d(rateAppViewModel, 2)), 0).c(((e) rateAppViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new q(16, new d(rateAppViewModel, 3)), new q(17, new d(rateAppViewModel, 4)));
                            c10.a(dVar);
                            Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
                            rateAppViewModel.f9080c.c(dVar);
                            return;
                        }
                        String text = this$0.getString(R.string.leave_feedback_message);
                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                        Intrinsics.checkNotNullParameter(this$0, "context");
                        Intrinsics.checkNotNullParameter(text, "text");
                        if (text.length() != 0) {
                            Toast makeText = Toast.makeText(this$0, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                            Object systemService = this$0.getSystemService("layout_inflater");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                            return;
                        }
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
        v vVar = (v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(RateAppViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 15));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, RateAppViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(RateAppViewModel.class, "<this>", RateAppViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            RateAppViewModel rateAppViewModel = (RateAppViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(rateAppViewModel);
            this.f17254b = rateAppViewModel;
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
