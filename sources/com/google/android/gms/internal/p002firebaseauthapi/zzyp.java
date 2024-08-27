package com.google.android.gms.internal.p002firebaseauthapi;

import a3.a;
import aq.y;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import zp.k;

/* loaded from: classes2.dex */
final class zzyp extends zzabg {
    private final k zza;
    private final String zzb;
    private final String zzc;

    public zzyp(k kVar, String str, String str2, String str3) {
        super(2);
        a.u(Preconditions.checkNotNull(kVar));
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
        ((y) this.zzi).a(this.zzn, zzaac.zzQ(this.zzg, this.zzo));
        zzm(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zzh(null, this.zzb, this.zzc, null, this.zzf);
    }
}
