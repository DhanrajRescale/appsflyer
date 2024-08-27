package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzyl extends zzabg {
    private final zzwa zza;

    public zzyl(String str, String str2, String str3) {
        super(4);
        Preconditions.checkNotEmpty(str, "code cannot be null or empty");
        Preconditions.checkNotEmpty(str2, "new password cannot be null or empty");
        this.zza = new zzwa(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "confirmPasswordReset";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zze(this.zza, this.zzf);
    }
}
