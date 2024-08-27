package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;
import zp.o;
import zp.q;
import zp.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabs extends r {
    final /* synthetic */ r zza;
    final /* synthetic */ String zzb;

    public zzabs(r rVar, String str) {
        this.zza = rVar;
        this.zzb = str;
    }

    @Override // zp.r
    public final void onCodeAutoRetrievalTimeOut(@NonNull String str) {
        zzabu.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // zp.r
    public final void onCodeSent(@NonNull String str, @NonNull q qVar) {
        this.zza.onCodeSent(str, qVar);
    }

    @Override // zp.r
    public final void onVerificationCompleted(@NonNull o oVar) {
        zzabu.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(oVar);
    }

    @Override // zp.r
    public final void onVerificationFailed(@NonNull FirebaseException firebaseException) {
        zzabu.zza.remove(this.zzb);
        this.zza.onVerificationFailed(firebaseException);
    }
}
