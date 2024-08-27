package com.firebase.ui.auth.ui.idp;

import am.b;
import am.e;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.g1;
import cm.a;
import cm.c;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookSdk;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.data.remote.FacebookSignInHandler;
import com.firebase.ui.auth.data.remote.GenericIdpAnonymousUpgradeLinkingHandler;
import com.firebase.ui.auth.data.remote.GoogleSignInHandler;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;
import com.firebase.ui.auth.viewmodel.idp.LinkingSocialProviderResponseHandler;
import el.l;
import zl.d;

/* loaded from: classes.dex */
public class WelcomeBackIdpPrompt extends a {

    /* renamed from: c, reason: collision with root package name */
    public ProviderSignInBase f10941c;

    /* renamed from: d, reason: collision with root package name */
    public Button f10942d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressBar f10943e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f10944f;

    public static Intent B(ContextWrapper contextWrapper, b bVar, e eVar, d dVar) {
        return c.v(contextWrapper, WelcomeBackIdpPrompt.class, bVar).putExtra("extra_idp_response", dVar).putExtra("extra_user", eVar);
    }

    @Override // cm.g
    public final void b() {
        this.f10942d.setEnabled(true);
        this.f10943e.setVisibility(4);
    }

    @Override // cm.g
    public final void f(int i10) {
        this.f10942d.setEnabled(false);
        this.f10943e.setVisibility(0);
    }

    @Override // cm.c, androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f10941c.i(i10, i11, intent);
    }

    @Override // cm.a, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.fui_welcome_back_idp_prompt_layout);
        this.f10942d = (Button) findViewById(R.id.welcome_back_idp_button);
        this.f10943e = (ProgressBar) findViewById(R.id.top_progress_bar);
        this.f10944f = (TextView) findViewById(R.id.welcome_back_idp_prompt);
        e eVar = (e) getIntent().getParcelableExtra("extra_user");
        d b10 = d.b(getIntent());
        g1 g1Var = new g1(this);
        LinkingSocialProviderResponseHandler linkingSocialProviderResponseHandler = (LinkingSocialProviderResponseHandler) g1Var.a(LinkingSocialProviderResponseHandler.class);
        linkingSocialProviderResponseHandler.f(y());
        if (b10 != null) {
            zp.d b02 = l.b0(b10);
            String str = eVar.f765b;
            linkingSocialProviderResponseHandler.f10963h = b02;
            linkingSocialProviderResponseHandler.f10964i = str;
        }
        String str2 = eVar.f764a;
        zl.b d02 = l.d0(str2, y().f742b);
        int i10 = 3;
        int i11 = 0;
        if (d02 == null) {
            w(0, d.d(new FirebaseUiException(3, a3.a.f("Firebase login unsuccessful. Account linking failed due to provider not enabled by application: ", str2))));
            return;
        }
        String string2 = d02.a().getString("generic_oauth_provider_id");
        x();
        str2.getClass();
        boolean equals = str2.equals("google.com");
        String str3 = eVar.f765b;
        if (!equals) {
            if (!str2.equals(FacebookSdk.FACEBOOK_COM)) {
                if (TextUtils.equals(str2, string2)) {
                    GenericIdpAnonymousUpgradeLinkingHandler genericIdpAnonymousUpgradeLinkingHandler = (GenericIdpAnonymousUpgradeLinkingHandler) g1Var.a(GenericIdpAnonymousUpgradeLinkingHandler.class);
                    genericIdpAnonymousUpgradeLinkingHandler.f(d02);
                    this.f10941c = genericIdpAnonymousUpgradeLinkingHandler;
                    string = d02.a().getString("generic_oauth_provider_name");
                } else {
                    throw new IllegalStateException("Invalid provider id: ".concat(str2));
                }
            } else {
                FacebookSignInHandler facebookSignInHandler = (FacebookSignInHandler) g1Var.a(FacebookSignInHandler.class);
                facebookSignInHandler.f(d02);
                this.f10941c = facebookSignInHandler;
                string = getString(R.string.fui_idp_name_facebook);
            }
        } else {
            GoogleSignInHandler googleSignInHandler = (GoogleSignInHandler) g1Var.a(GoogleSignInHandler.class);
            googleSignInHandler.f(new bm.d(d02, str3));
            this.f10941c = googleSignInHandler;
            string = getString(R.string.fui_idp_name_google);
        }
        this.f10941c.f10959e.observe(this, new dm.a(this, this, linkingSocialProviderResponseHandler, i10));
        this.f10944f.setText(getString(R.string.fui_welcome_back_idp_prompt, str3, string));
        this.f10942d.setOnClickListener(new fm.a(i11, this, str2));
        linkingSocialProviderResponseHandler.f10959e.observe(this, new zl.e(this, this, 10));
        al.d.Z0(this, y(), (TextView) findViewById(R.id.email_footer_tos_and_pp_text));
    }
}
