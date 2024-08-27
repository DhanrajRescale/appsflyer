package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzx extends zzz {
    final /* synthetic */ zzl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzy zzyVar, zzab zzabVar, CharSequence charSequence, zzl zzlVar) {
        super(zzabVar, charSequence);
        this.zza = zzlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzc(int i10) {
        return ((zzo) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzd(int i10) {
        if (((zzo) this.zza).zza.find(i10)) {
            return ((zzo) this.zza).zza.start();
        }
        return -1;
    }
}
