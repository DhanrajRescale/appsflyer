package com.assetgro.stockgro.ui.social.auth.util.linkedin.helpers;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.u0;
import ch.c;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.social.auth.SocialActivityViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.t;
import com.webengage.sdk.android.Analytics;
import gd.b;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import ls.n0;
import nn.d;
import okhttp3.HttpUrl;
import qg.a;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/social/auth/util/linkedin/helpers/LinkedInAuthenticationActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/social/auth/SocialActivityViewModel;", "Lba/s1;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LinkedInAuthenticationActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10115k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_linkedin_authentication;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((SocialActivityViewModel) x()).f10112v.observe(this, new c(22, new a(this, 14)));
    }

    @Override // gd.b
    public final void I() {
        vl.b r10;
        getWindow().setFlags(UserMetadata.MAX_ATTRIBUTE_SIZE, UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (r() != null && (r10 = r()) != null) {
            r10.F();
        }
        getIntent().getStringExtra(PaymentConstants.CLIENT_ID);
        getIntent().getStringExtra("client_secret");
        getIntent().getStringExtra("redirect_uri");
        getIntent().getStringExtra("state");
        String j10 = d.j("linkedin", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        SocialActivityViewModel socialActivityViewModel = (SocialActivityViewModel) x();
        byte[] bArr = kj.a.f23206a;
        String str = "https://www.linkedin.com/oauth/v2/authorization?response_type=code&client_id=8689q2q53gx356&scope=r_liteprofile%20r_emailaddress&state=" + j10 + "&redirect_uri=https://stockgro.onelink.me/vNON/mega6my1";
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        socialActivityViewModel.f10107q = str;
        String str2 = ((SocialActivityViewModel) x()).f10107q;
        if (str2 != null) {
            t.f(this, "com.android.chrome", new zh.a(str2, this));
        } else {
            Intrinsics.k("linkedinAuthURLFull");
            throw null;
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Uri uri;
        String str;
        String str2;
        Uri data;
        Uri data2;
        super.onNewIntent(intent);
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        String valueOf = String.valueOf(uri);
        if (w.s(valueOf, "user_cancelled_authorize", false)) {
            Intent intent2 = new Intent();
            intent2.putExtra("err_code", 11);
            setResult(0, intent2);
            finish();
        }
        if (intent != null && (data2 = intent.getData()) != null) {
            str = data2.getQueryParameter("code");
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            SocialActivityViewModel socialActivityViewModel = (SocialActivityViewModel) x();
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            socialActivityViewModel.f10108r = str;
            SocialActivityViewModel socialActivityViewModel2 = (SocialActivityViewModel) x();
            g.H(u0.f(socialActivityViewModel2), null, null, new wh.c(socialActivityViewModel2, null), 3);
            return;
        }
        if (w.s(valueOf, "error", false)) {
            if (intent == null || (data = intent.getData()) == null || (str2 = data.getQueryParameter("error")) == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Intent intent3 = new Intent();
            intent3.putExtra("err_code", 12);
            intent3.putExtra("error", str2);
            setResult(0, intent3);
            finish();
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.l();
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
