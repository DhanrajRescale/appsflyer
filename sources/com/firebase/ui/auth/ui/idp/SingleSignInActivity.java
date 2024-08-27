package com.firebase.ui.auth.ui.idp;

import a3.a;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.g1;
import cm.e;
import com.facebook.FacebookSdk;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.data.remote.FacebookSignInHandler;
import com.firebase.ui.auth.data.remote.GenericIdpSignInHandler;
import com.firebase.ui.auth.data.remote.GoogleSignInHandler;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;
import com.firebase.ui.auth.viewmodel.idp.SocialProviderResponseHandler;
import el.l;
import zl.b;
import zl.d;

/* loaded from: classes.dex */
public class SingleSignInActivity extends e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10938h = 0;

    /* renamed from: f, reason: collision with root package name */
    public SocialProviderResponseHandler f10939f;

    /* renamed from: g, reason: collision with root package name */
    public ProviderSignInBase f10940g;

    @Override // cm.c, androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f10939f.k(i10, i11, intent);
        this.f10940g.i(i10, i11, intent);
    }

    @Override // cm.e, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        am.e eVar = (am.e) getIntent().getParcelableExtra("extra_user");
        String str = eVar.f764a;
        b d02 = l.d0(str, y().f742b);
        if (d02 == null) {
            w(0, d.d(new FirebaseUiException(3, a.f("Provider not enabled: ", str))));
            return;
        }
        g1 g1Var = new g1(this);
        SocialProviderResponseHandler socialProviderResponseHandler = (SocialProviderResponseHandler) g1Var.a(SocialProviderResponseHandler.class);
        this.f10939f = socialProviderResponseHandler;
        socialProviderResponseHandler.f(y());
        x();
        str.getClass();
        if (!str.equals("google.com")) {
            if (!str.equals(FacebookSdk.FACEBOOK_COM)) {
                if (!TextUtils.isEmpty(d02.a().getString("generic_oauth_provider_id"))) {
                    GenericIdpSignInHandler genericIdpSignInHandler = (GenericIdpSignInHandler) g1Var.a(GenericIdpSignInHandler.class);
                    genericIdpSignInHandler.f(d02);
                    this.f10940g = genericIdpSignInHandler;
                } else {
                    throw new IllegalStateException("Invalid provider id: ".concat(str));
                }
            } else {
                FacebookSignInHandler facebookSignInHandler = (FacebookSignInHandler) g1Var.a(FacebookSignInHandler.class);
                facebookSignInHandler.f(d02);
                this.f10940g = facebookSignInHandler;
            }
        } else {
            GoogleSignInHandler googleSignInHandler = (GoogleSignInHandler) g1Var.a(GoogleSignInHandler.class);
            googleSignInHandler.f(new bm.d(d02, eVar.f765b));
            this.f10940g = googleSignInHandler;
        }
        this.f10940g.f10959e.observe(this, new dm.a(this, this, str, 2));
        this.f10939f.f10959e.observe(this, new zl.e(this, this, 9));
        if (this.f10939f.f10959e.getValue() == null) {
            this.f10940g.j(x().f42562b, this, str);
        }
    }
}
