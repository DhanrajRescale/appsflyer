package com.google.android.gms.internal.p002firebaseauthapi;

import a3.a;
import aq.d0;
import aq.g0;
import aq.y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import zp.h;
import zp.k;

/* loaded from: classes2.dex */
final class zzyq extends zzabg {
    private final k zza;
    private final String zzb;
    private final String zzc;

    public zzyq(k kVar, String str, String str2) {
        super(2);
        a.u(Preconditions.checkNotNull(kVar));
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabg
    public final void zzb() {
        g0 zzQ = zzaac.zzQ(this.zzg, this.zzo);
        h hVar = this.zzh;
        if (hVar != null && !((g0) hVar).f2717b.f2702a.equalsIgnoreCase(zzQ.f2717b.f2702a)) {
            zzl(new Status(17024));
        } else {
            ((y) this.zzi).a(this.zzn, zzQ);
            zzm(new d0(zzQ));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabi
    public final void zzc(TaskCompletionSource taskCompletionSource, zzaaf zzaafVar) {
        this.zzk = new zzabf(this, taskCompletionSource);
        zzaafVar.zzi(this.zzb, null, this.zzc, this.zzf);
    }
}
