package com.google.android.gms.internal.p002firebaseauthapi;

import a3.a;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import zp.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaca {
    private static final Logger zza = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap zzd = new HashMap();

    public zzaca(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    public static void zzd(zzaca zzacaVar, String str) {
        zzabz zzabzVar = (zzabz) zzacaVar.zzd.get(str);
        if (zzabzVar != null && !zzac.zzd(zzabzVar.zzd) && !zzac.zzd(zzabzVar.zze) && !zzabzVar.zzb.isEmpty()) {
            Iterator it = zzabzVar.zzb.iterator();
            while (it.hasNext()) {
                ((zzaae) it.next()).zzq(new o(zzabzVar.zzd, zzabzVar.zze, null, null, true));
            }
            zzabzVar.zzh = true;
        }
    }

    private static String zzl(String str, String str2) {
        String g10 = a.g(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(g10.getBytes(zzk.zzc));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.d("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            zza.e("NoSuchAlgorithm: ".concat(String.valueOf(e10.getMessage())), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(String str) {
        zzabz zzabzVar = (zzabz) this.zzd.get(str);
        if (zzabzVar != null && !zzabzVar.zzh && !zzac.zzd(zzabzVar.zzd)) {
            zza.w("Timed out waiting for SMS.", new Object[0]);
            Iterator it = zzabzVar.zzb.iterator();
            while (it.hasNext()) {
                ((zzaae) it.next()).zza(zzabzVar.zzd);
            }
            zzabzVar.zzi = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzg(String str) {
        zzabz zzabzVar = (zzabz) this.zzd.get(str);
        if (zzabzVar == null) {
            return;
        }
        if (!zzabzVar.zzi) {
            zzm(str);
        }
        zzi(str);
    }

    public final String zzb() {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 134217728).signingInfo;
                apkContentsSigners = signingInfo.getApkContentsSigners();
            } else {
                apkContentsSigners = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 64).signatures;
            }
            String zzl = zzl(packageName, apkContentsSigners[0].toCharsString());
            if (zzl != null) {
                return zzl;
            }
            zza.e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void zzh(zzaae zzaaeVar, String str) {
        zzabz zzabzVar = (zzabz) this.zzd.get(str);
        if (zzabzVar == null) {
            return;
        }
        zzabzVar.zzb.add(zzaaeVar);
        if (zzabzVar.zzg) {
            zzaaeVar.zzb(zzabzVar.zzd);
        }
        if (zzabzVar.zzh) {
            zzaaeVar.zzq(new o(zzabzVar.zzd, zzabzVar.zze, null, null, true));
        }
        if (zzabzVar.zzi) {
            zzaaeVar.zza(zzabzVar.zzd);
        }
    }

    public final void zzi(String str) {
        zzabz zzabzVar = (zzabz) this.zzd.get(str);
        if (zzabzVar == null) {
            return;
        }
        ScheduledFuture scheduledFuture = zzabzVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzabzVar.zzf.cancel(false);
        }
        zzabzVar.zzb.clear();
        this.zzd.remove(str);
    }

    public final void zzj(final String str, zzaae zzaaeVar, long j10, boolean z10) {
        this.zzd.put(str, new zzabz(j10, z10));
        zzh(zzaaeVar, str);
        zzabz zzabzVar = (zzabz) this.zzd.get(str);
        long j11 = zzabzVar.zza;
        if (j11 <= 0) {
            zza.w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzabzVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzabv
            @Override // java.lang.Runnable
            public final void run() {
                zzaca.this.zzg(str);
            }
        }, j11, TimeUnit.SECONDS);
        if (!zzabzVar.zzc) {
            zza.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaby zzabyVar = new zzaby(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        zzb.zza(this.zzb.getApplicationContext(), zzabyVar, intentFilter);
        SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new zzabw(this));
    }

    public final boolean zzk(String str) {
        if (this.zzd.get(str) != null) {
            return true;
        }
        return false;
    }
}
