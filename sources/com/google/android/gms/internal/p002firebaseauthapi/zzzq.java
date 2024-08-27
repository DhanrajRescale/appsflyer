package com.google.android.gms.internal.p002firebaseauthapi;

import aq.d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzzq extends zzabg {
    private final boolean zzB;
    private final boolean zzC;
    private final String zzD;
    private final String zzE;
    private final boolean zzF;
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;

    public zzzq(d dVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotEmpty(str);
        this.zza = Preconditions.checkNotEmpty(dVar.f2693a);
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j10;
        this.zzB = z10;
        this.zzC = z11;
        this.zzD = str3;
        this.zzE = str4;
        this.zzF = z12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "startMfaEnrollmentWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zzB(this.zza, this.zzb, this.zzc, this.zzd, this.zzB, this.zzC, this.zzD, this.zzE, this.zzF, this.zzf);
    }
}
