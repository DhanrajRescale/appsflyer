package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import lp.g0;
import pp.g;

/* loaded from: classes2.dex */
public final class zzaai extends AsyncTask {
    private static final Logger zza = new Logger("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final g zzg;

    public zzaai(String str, String str2, Intent intent, g gVar, zzaak zzaakVar) {
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzg = (g) Preconditions.checkNotNull(gVar);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(intent);
        String checkNotEmpty = Preconditions.checkNotEmpty(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzaakVar.zzc(checkNotEmpty)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", checkNotEmpty).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) Preconditions.checkNotNull(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference(zzaakVar);
        this.zze = zzaakVar.zzb(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzaah zzaahVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzaak zzaakVar = (zzaak) this.zzd.get();
        if (zzaahVar != null) {
            str = zzaahVar.zzc();
            str2 = zzaahVar.zzd();
        } else {
            str = null;
            str2 = null;
        }
        if (zzaakVar == null) {
            zza.e("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str) && (builder = this.zze) != null) {
            builder.authority(str);
            zzaakVar.zzf(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f11645s);
        } else {
            zzaakVar.zze(this.zzb, g0.p(str2));
        }
    }

    private static byte[] zzb(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        HttpURLConnection zzd;
        int responseCode;
        String str;
        if (!TextUtils.isEmpty(this.zzf)) {
            return zzaah.zza(this.zzf);
        }
        try {
            try {
                URL url = new URL(this.zzc);
                zzaak zzaakVar = (zzaak) this.zzd.get();
                zzd = zzaakVar.zzd(url);
                zzd.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
                zzd.setConnectTimeout(60000);
                new zzaau(zzaakVar.zza(), this.zzg, zzaas.zza().zzb()).zza(zzd);
                responseCode = zzd.getResponseCode();
            } catch (zzyi e10) {
                zza.e("ConversionException encountered: ".concat(String.valueOf(e10.getMessage())), new Object[0]);
            } catch (NullPointerException e11) {
                zza.e("Null pointer encountered: ".concat(String.valueOf(e11.getMessage())), new Object[0]);
            }
        } catch (IOException e12) {
            zza.e("IOException occurred: ".concat(String.valueOf(e12.getMessage())), new Object[0]);
        }
        if (responseCode == 200) {
            zzadb zzadbVar = new zzadb();
            zzadbVar.zzb(new String(zzb(zzd.getInputStream(), 128)));
            for (String str2 : zzadbVar.zzc()) {
                if (!str2.endsWith("firebaseapp.com") && !str2.endsWith("web.app")) {
                }
                return zzaah.zza(str2);
            }
            return null;
        }
        try {
        } catch (IOException e13) {
            zza.w("Error parsing error message from response body in getErrorMessageFromBody. ".concat(e13.toString()), new Object[0]);
        }
        if (zzd.getResponseCode() >= 400) {
            InputStream errorStream = zzd.getErrorStream();
            if (errorStream == null) {
                str = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            } else {
                str = (String) zzaap.zza(new String(zzb(errorStream, 128)), String.class);
            }
            zza.e(String.format("Error getting project config. Failed with %s %s", str, Integer.valueOf(responseCode)), new Object[0]);
            return zzaah.zzb(str);
        }
        str = null;
        zza.e(String.format("Error getting project config. Failed with %s %s", str, Integer.valueOf(responseCode)), new Object[0]);
        return zzaah.zzb(str);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(Object obj) {
        onPostExecute(null);
    }
}
