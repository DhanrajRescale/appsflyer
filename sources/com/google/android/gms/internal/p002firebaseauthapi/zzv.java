package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzv extends zzz {
    final /* synthetic */ zzw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzw zzwVar, zzab zzabVar, CharSequence charSequence) {
        super(zzabVar, charSequence);
        this.zza = zzwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzd(int i10) {
        zzj zzjVar = this.zza.zza;
        CharSequence charSequence = ((zzz) this).zzb;
        int length = charSequence.length();
        zzu.zzb(i10, length, "index");
        while (i10 < length) {
            if (!zzjVar.zza(charSequence.charAt(i10))) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }
}
