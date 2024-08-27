package com.google.android.recaptcha.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgl implements zzgd {
    final int zza;
    final zzjv zzb;

    public zzgl(zzgr zzgrVar, int i10, zzjv zzjvVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zzjvVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgl) obj).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzgd
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzgd
    public final zzhx zzb(zzhx zzhxVar, zzhy zzhyVar) {
        ((zzgi) zzhxVar).zzg((zzgo) zzhyVar);
        return zzhxVar;
    }

    @Override // com.google.android.recaptcha.internal.zzgd
    public final zzid zzc(zzid zzidVar, zzid zzidVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.recaptcha.internal.zzgd
    public final zzjv zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzgd
    public final zzjw zze() {
        return this.zzb.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzgd
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzgd
    public final boolean zzg() {
        return false;
    }
}
