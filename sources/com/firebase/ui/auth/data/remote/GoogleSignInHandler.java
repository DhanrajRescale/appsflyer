package com.firebase.ui.auth.data.remote;

import am.e;
import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import bm.d;
import cm.c;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.auth.FirebaseAuth;
import q0.g0;
import zl.b;

/* loaded from: classes.dex */
public class GoogleSignInHandler extends SingleProviderSignInHandler<d> {

    /* renamed from: f, reason: collision with root package name */
    public b f10908f;

    /* renamed from: g, reason: collision with root package name */
    public String f10909g;

    public GoogleSignInHandler(Application application) {
        super(application);
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase
    public final void g() {
        d dVar = (d) this.f10961d;
        this.f10908f = dVar.f7130a;
        this.f10909g = dVar.f7131b;
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void i(int i10, int i11, Intent intent) {
        if (i10 != 110) {
            return;
        }
        try {
            GoogleSignInAccount result = GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
            g0 g0Var = new g0(new e("google.com", result.getEmail(), null, result.getDisplayName(), result.getPhotoUrl()));
            g0Var.f31494d = result.getIdToken();
            h(am.d.c(g0Var.a()));
        } catch (ApiException e10) {
            if (e10.getStatusCode() == 5) {
                this.f10909g = null;
                k();
                return;
            }
            if (e10.getStatusCode() == 12502) {
                k();
                return;
            }
            if (e10.getStatusCode() == 12501) {
                h(am.d.a(new UserCancellationException()));
                return;
            }
            if (e10.getStatusCode() == 10) {
                Log.w("GoogleSignInHandler", "Developer error: this application is misconfigured. Check your SHA1 and package name in the Firebase console.");
            }
            h(am.d.a(new FirebaseUiException(4, "Code: " + e10.getStatusCode() + ", message: " + e10.getMessage())));
        }
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public final void j(FirebaseAuth firebaseAuth, c cVar, String str) {
        k();
    }

    public final void k() {
        h(am.d.b());
        Application e10 = e();
        GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder((GoogleSignInOptions) this.f10908f.a().getParcelable("extra_google_sign_in_options"));
        if (!TextUtils.isEmpty(this.f10909g)) {
            builder.setAccountName(this.f10909g);
        }
        h(am.d.a(new IntentRequiredException(110, GoogleSignIn.getClient(e10, builder.build()).getSignInIntent())));
    }
}
