package com.google.firebase.auth.internal;

import a3.a;
import a5.b;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.j0;
import aq.a0;
import aq.u;
import aq.v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p002firebaseauthapi.zzaai;
import com.google.android.gms.internal.p002firebaseauthapi.zzaak;
import com.google.android.gms.internal.p002firebaseauthapi.zzaav;
import com.google.android.gms.internal.p002firebaseauthapi.zzace;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import ep.m;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import lp.g0;
import mq.c;
import pp.g;
import wn.e;

/* loaded from: classes2.dex */
public class RecaptchaActivity extends j0 implements zzaak {

    /* renamed from: b, reason: collision with root package name */
    public static long f11657b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f11658c = v.f2758c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11659a = false;

    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            q();
            return;
        }
        long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        if (currentTimeMillis - f11657b < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f11657b = currentTimeMillis;
        if (bundle != null) {
            this.f11659a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        String string;
        boolean isEmpty;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                r(u.a(intent.getStringExtra("firebaseError")));
                return;
            }
            if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra("link");
                a0 a0Var = a0.f2678a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (a0Var) {
                    Preconditions.checkNotEmpty(packageName);
                    Preconditions.checkNotEmpty(stringExtra2);
                    SharedPreferences b10 = a0.b(applicationContext, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", stringExtra2);
                    String string2 = b10.getString(format, null);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", stringExtra2);
                    string = b10.getString(format2, null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.apply();
                    isEmpty = TextUtils.isEmpty(string2);
                }
                if (!isEmpty) {
                    str = string;
                }
                if (TextUtils.isEmpty(str)) {
                    Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
                    r(g0.p("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = e.s(getApplicationContext(), g.e(str).f()).t(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f11657b = 0L;
                this.f11659a = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!b.a(this).c(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit2.putString("recaptchaToken", queryParameter);
                    edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit2.putLong(PaymentConstants.TIMESTAMP, DefaultClock.getInstance().currentTimeMillis());
                    edit2.commit();
                } else {
                    f11658c.a(this);
                }
                finish();
                return;
            }
            q();
            return;
        }
        if (!this.f11659a) {
            Intent intent3 = getIntent();
            String packageName2 = getPackageName();
            try {
                String lowerCase = Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName2)).toLowerCase(Locale.US);
                g e10 = g.e(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                new zzaai(packageName2, lowerCase, intent3, e10, this).executeOnExecutor(FirebaseAuth.getInstance(e10).f11648v, new Void[0]);
            } catch (PackageManager.NameNotFoundException e11) {
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName2 + " " + e11.toString());
                zze(packageName2, null);
            }
            this.f11659a = true;
            return;
        }
        q();
    }

    @Override // androidx.activity.m, q3.o, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f11659a);
    }

    public final void q() {
        f11657b = 0L;
        this.f11659a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        b.a(this).c(intent);
        f11658c.a(this);
        finish();
    }

    public final void r(Status status) {
        f11657b = 0L;
        this.f11659a = false;
        Intent intent = new Intent();
        HashMap hashMap = u.f2757a;
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        b.a(this).c(intent);
        f11658c.a(this);
        finish();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaak
    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        String str3;
        String zza;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        g e10 = g.e(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(e10);
        a0 a0Var = a0.f2678a;
        Context applicationContext = getApplicationContext();
        synchronized (a0Var) {
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotEmpty(uuid);
            SharedPreferences b10 = a0.b(applicationContext, str);
            a0.a(b10);
            SharedPreferences.Editor edit = b10.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", uuid), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", uuid), stringExtra3);
            edit.apply();
        }
        String u10 = e.s(getApplicationContext(), e10.f()).u();
        if (TextUtils.isEmpty(u10)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            r(g0.p("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.f11634h) {
            str3 = firebaseAuth.f11635i;
        }
        if (!TextUtils.isEmpty(str3)) {
            synchronized (firebaseAuth.f11634h) {
                zza = firebaseAuth.f11635i;
            }
        } else {
            zza = zzaav.zza();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", u10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaak
    public final String zzc(String str) {
        return zzace.zzb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaak
    public final HttpURLConnection zzd(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            zzaak.zza.e("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaak
    public final void zze(String str, Status status) {
        if (status == null) {
            q();
        } else {
            r(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaak
    public final void zzf(Uri uri, String str, c cVar) {
        a.u(cVar.get());
        Tasks.forResult(uri).addOnCompleteListener(new m(3, this, str));
    }
}
