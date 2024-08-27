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
import aq.z;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p002firebaseauthapi.zzaai;
import com.google.android.gms.internal.p002firebaseauthapi.zzaaj;
import com.google.android.gms.internal.p002firebaseauthapi.zzaak;
import com.google.android.gms.internal.p002firebaseauthapi.zzace;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import ep.m;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import lp.g0;
import mq.c;
import org.json.JSONException;
import org.json.JSONObject;
import pp.g;
import wn.e;

@KeepName
/* loaded from: classes2.dex */
public class GenericIdpActivity extends j0 implements zzaak {

    /* renamed from: b, reason: collision with root package name */
    public static long f11654b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f11655c = v.f2758c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11656a = false;

    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            r();
            return;
        }
        long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        if (currentTimeMillis - f11654b < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f11654b = currentTimeMillis;
        if (bundle != null) {
            this.f11656a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        z zVar = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                s(u.a(intent.getStringExtra("firebaseError")));
                return;
            }
            if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (a0.f2678a) {
                    Preconditions.checkNotEmpty(packageName);
                    Preconditions.checkNotEmpty(stringExtra2);
                    SharedPreferences b10 = a0.b(this, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", stringExtra2);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", stringExtra2);
                    String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", stringExtra2);
                    String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", stringExtra2);
                    String string = b10.getString(format, null);
                    String string2 = b10.getString(format2, null);
                    String string3 = b10.getString(format3, null);
                    String string4 = b10.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
                    String string5 = b10.getString(format4, null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.remove(format3);
                    edit.remove(format4);
                    edit.apply();
                    if (string != null && string2 != null && string3 != null) {
                        zVar = new z(string, string2, string3, string4, string5);
                    }
                }
                if (zVar == null) {
                    r();
                }
                if (booleanExtra) {
                    stringExtra = e.s(getApplicationContext(), g.e(zVar.f2769e).f()).t(stringExtra);
                }
                zzaec zzaecVar = new zzaec(zVar, stringExtra);
                String str = zVar.f2768d;
                String str2 = zVar.f2766b;
                zzaecVar.zzf(str);
                if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str2) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str2) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str2)) {
                    Log.e("GenericIdpActivity", "unsupported operation: ".concat(str2));
                    r();
                    return;
                }
                f11654b = 0L;
                this.f11656a = false;
                Intent intent2 = new Intent();
                SafeParcelableSerializer.serializeToIntentExtra(zzaecVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str2);
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!b.a(this).c(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit2.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzaecVar));
                    edit2.putString("operation", str2);
                    edit2.putString("tenantId", str);
                    edit2.putLong(PaymentConstants.TIMESTAMP, DefaultClock.getInstance().currentTimeMillis());
                    edit2.commit();
                } else {
                    f11655c.a(this);
                }
                finish();
                return;
            }
            r();
            return;
        }
        if (!this.f11656a) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName2)).toLowerCase(Locale.US);
                g e10 = g.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(e10);
                if (!zzace.zzg(e10)) {
                    new zzaai(packageName2, lowerCase, getIntent(), e10, this).executeOnExecutor(firebaseAuth.f11648v, new Void[0]);
                } else {
                    e10.a();
                    zzf(q(Uri.parse(zzace.zza(e10.f31273c.f31280a)).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2, firebaseAuth.f11645s);
                }
            } catch (PackageManager.NameNotFoundException e11) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + e11.toString());
                zze(packageName2, null);
            }
            this.f11656a = true;
            return;
        }
        r();
    }

    @Override // androidx.activity.m, q3.o, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f11656a);
    }

    public final Uri.Builder q(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        String jSONObject;
        String str4;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            str3 = TextUtils.join(",", stringArrayListExtra);
        } else {
            str3 = null;
        }
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str5 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str5);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str5, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String zza = zzaaj.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        a0 a0Var = a0.f2678a;
        Context applicationContext = getApplicationContext();
        synchronized (a0Var) {
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotEmpty(uuid);
            Preconditions.checkNotEmpty(zza);
            Preconditions.checkNotEmpty(stringExtra4);
            SharedPreferences b10 = a0.b(applicationContext, str);
            a0.a(b10);
            SharedPreferences.Editor edit = b10.edit();
            str4 = jSONObject;
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", uuid), zza);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", uuid), action);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", uuid), stringExtra2);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", uuid), stringExtra4);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            edit.apply();
        }
        String u10 = e.s(getApplicationContext(), g.e(stringExtra4).f()).u();
        if (TextUtils.isEmpty(u10)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            s(g0.p("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (zza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", u10);
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("scopes", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("customParameters", str4);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    public final void r() {
        f11654b = 0L;
        this.f11656a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        boolean c10 = b.a(this).c(intent);
        v vVar = f11655c;
        if (!c10) {
            Status p10 = g0.p("WEB_CONTEXT_CANCELED");
            vVar.getClass();
            v.b(this, p10);
        } else {
            vVar.a(this);
        }
        finish();
    }

    public final void s(Status status) {
        f11654b = 0L;
        this.f11656a = false;
        Intent intent = new Intent();
        HashMap hashMap = u.f2757a;
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        boolean c10 = b.a(this).c(intent);
        v vVar = f11655c;
        if (!c10) {
            Context applicationContext = getApplicationContext();
            vVar.getClass();
            v.b(applicationContext, status);
        } else {
            vVar.a(this);
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaak
    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        return q(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaak
    public final void zze(String str, Status status) {
        if (status == null) {
            r();
        } else {
            s(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaak
    public final void zzf(Uri uri, String str, c cVar) {
        a.u(cVar.get());
        Tasks.forResult(uri).addOnCompleteListener(new m(2, this, str));
    }
}
