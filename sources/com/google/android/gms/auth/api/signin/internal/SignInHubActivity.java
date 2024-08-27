package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.j0;
import androidx.loader.app.a;
import androidx.loader.content.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zzaz;
import in.juspay.hypersdk.core.PaymentConstants;

@KeepName
/* loaded from: classes2.dex */
public class SignInHubActivity extends j0 {
    private static boolean zzcw = false;
    private boolean zzcx = false;
    private SignInConfiguration zzcy;
    private boolean zzcz;
    private int zzda;
    private Intent zzdb;

    /* loaded from: classes2.dex */
    public class zzc implements a {
        private zzc() {
        }

        @Override // androidx.loader.app.a
        public final e onCreateLoader(int i10, Bundle bundle) {
            return new zzd(SignInHubActivity.this, GoogleApiClient.getAllClients());
        }

        @Override // androidx.loader.app.a
        public final /* synthetic */ void onLoadFinished(e eVar, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.zzda, SignInHubActivity.this.zzdb);
            SignInHubActivity.this.finish();
        }

        @Override // androidx.loader.app.a
        public final void onLoaderReset(e eVar) {
        }
    }

    private final void zzc(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zzcw = false;
    }

    private final void zzv() {
        getSupportLoaderManager().b(new zzc());
        zzcw = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.zzcx) {
            return;
        }
        setResult(0);
        if (i10 == 40962) {
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                if (signInAccount != null && signInAccount.getGoogleSignInAccount() != null) {
                    GoogleSignInAccount googleSignInAccount = signInAccount.getGoogleSignInAccount();
                    zzq.zzd(this).zzc(this.zzcy.zzu(), (GoogleSignInAccount) zzaz.checkNotNull(googleSignInAccount));
                    intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.zzcz = true;
                    this.zzda = i11;
                    this.zzdb = intent;
                    zzv();
                    return;
                }
                if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                    }
                    zzc(intExtra);
                    return;
                }
            }
            zzc(8);
        }
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str2 = (String) zzaz.checkNotNull(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str2)) {
            zzc(GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !str2.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str = "Unknown action: ".concat(valueOf);
            } else {
                str = new String("Unknown action: ");
            }
            Log.e("AuthSignInClient", str);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) zzaz.checkNotNull(intent.getBundleExtra(PaymentConstants.Category.CONFIG))).getParcelable(PaymentConstants.Category.CONFIG);
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.zzcy = signInConfiguration;
        if (bundle == null) {
            if (zzcw) {
                setResult(0);
                zzc(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                return;
            }
            zzcw = true;
            Intent intent2 = new Intent(str2);
            if (str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent2.setPackage("com.google.android.gms");
            } else {
                intent2.setPackage(getPackageName());
            }
            intent2.putExtra(PaymentConstants.Category.CONFIG, this.zzcy);
            try {
                startActivityForResult(intent2, 40962);
                return;
            } catch (ActivityNotFoundException unused) {
                this.zzcx = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                zzc(17);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.zzcz = z10;
        if (z10) {
            this.zzda = bundle.getInt("signInResultCode");
            this.zzdb = (Intent) zzaz.checkNotNull((Intent) bundle.getParcelable("signInResultData"));
            zzv();
        }
    }

    @Override // androidx.activity.m, q3.o, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zzcz);
        if (this.zzcz) {
            bundle.putInt("signInResultCode", this.zzda);
            bundle.putParcelable("signInResultData", this.zzdb);
        }
    }
}
