package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import pp.g;

/* loaded from: classes2.dex */
public final class zzaau {
    private final Context zza;
    private zzabp zzb;
    private final String zzc;
    private final g zzd;
    private boolean zze = false;
    private String zzf;

    public zzaau(Context context, g gVar, String str) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzd = (g) Preconditions.checkNotNull(gVar);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.net.URLConnection r5) {
        /*
            r4 = this;
            boolean r0 = r4.zze
            if (r0 == 0) goto L11
            java.lang.String r0 = r4.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "/FirebaseUI-Android"
            java.lang.String r0 = r0.concat(r1)
            goto L1d
        L11:
            java.lang.String r0 = r4.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "/FirebaseCore-Android"
            java.lang.String r0 = r0.concat(r1)
        L1d:
            com.google.android.gms.internal.firebase-auth-api.zzabp r1 = r4.zzb
            if (r1 != 0) goto L2e
            com.google.android.gms.internal.firebase-auth-api.zzabp r1 = new com.google.android.gms.internal.firebase-auth-api.zzabp
            android.content.Context r2 = r4.zza
            java.lang.String r3 = r2.getPackageName()
            r1.<init>(r2, r3)
            r4.zzb = r1
        L2e:
            com.google.android.gms.internal.firebase-auth-api.zzabp r1 = r4.zzb
            java.lang.String r1 = r1.zzb()
            java.lang.String r2 = "X-Android-Package"
            r5.setRequestProperty(r2, r1)
            com.google.android.gms.internal.firebase-auth-api.zzabp r1 = r4.zzb
            java.lang.String r1 = r1.zza()
            java.lang.String r2 = "X-Android-Cert"
            r5.setRequestProperty(r2, r1)
            java.lang.String r1 = "Accept-Language"
            java.lang.String r2 = com.google.android.gms.internal.p002firebaseauthapi.zzaav.zza()
            r5.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Client-Version"
            r5.setRequestProperty(r1, r0)
            java.lang.String r0 = r4.zzf
            java.lang.String r1 = "X-Firebase-Locale"
            r5.setRequestProperty(r1, r0)
            pp.g r0 = r4.zzd
            r0.a()
            pp.h r0 = r0.f31273c
            java.lang.String r0 = r0.f31281b
            java.lang.String r1 = "X-Firebase-GMPID"
            r5.setRequestProperty(r1, r0)
            pp.g r0 = r4.zzd
            com.google.firebase.auth.FirebaseAuth r0 = com.google.firebase.auth.FirebaseAuth.getInstance(r0)
            mq.c r0 = r0.f11646t
            java.lang.Object r0 = r0.get()
            kq.f r0 = (kq.f) r0
            r1 = 0
            if (r0 == 0) goto Lb4
            kq.d r0 = (kq.d) r0     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
            android.content.Context r2 = r0.f23462b     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
            boolean r2 = y3.q.a(r2)     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
            r2 = r2 ^ 1
            if (r2 == 0) goto L8b
            java.lang.String r0 = ""
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
            goto L97
        L8b:
            kq.c r2 = new kq.c     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
            r3 = 0
            r2.<init>(r0, r3)     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
            java.util.concurrent.Executor r0 = r0.f23465e     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.call(r0, r2)     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
        L97:
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L9e java.util.concurrent.ExecutionException -> La0
            goto Lb5
        L9e:
            r0 = move-exception
            goto La1
        La0:
            r0 = move-exception
        La1:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Unable to get heartbeats: "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "LocalRequestInterceptor"
            android.util.Log.w(r2, r0)
        Lb4:
            r0 = r1
        Lb5:
            java.lang.String r2 = "X-Firebase-Client"
            r5.setRequestProperty(r2, r0)
            pp.g r0 = r4.zzd
            com.google.firebase.auth.FirebaseAuth r0 = com.google.firebase.auth.FirebaseAuth.getInstance(r0)
            mq.c r0 = r0.f11645s
            java.lang.Object r0 = r0.get()
            a3.a.u(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = "X-Firebase-AppCheck"
            r5.setRequestProperty(r0, r1)
        Ld4:
            r4.zzf = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaau.zza(java.net.URLConnection):void");
    }

    public final void zzb(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zzc(String str) {
        this.zzf = str;
    }
}
