package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzys extends zzabg {
    private final zzwb zza;

    public zzys() {
        super(11);
        this.zza = new zzwb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "getRecaptchaParam";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
        zzm(this.zzy);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zzk(this.zza, this.zzf);
    }
}
