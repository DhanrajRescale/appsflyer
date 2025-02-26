package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzlj;
import java.util.List;
import java.util.Map;
import t.j0;

/* loaded from: classes2.dex */
final class zza extends zzd {
    private final zzge zza;
    private final zzij zzb;

    public zza(@NonNull zzge zzgeVar) {
        super(null);
        Preconditions.checkNotNull(zzgeVar);
        this.zza = zzgeVar;
        this.zzb = zzgeVar.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final int zza(String str) {
        this.zzb.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final long zzb() {
        return this.zza.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Boolean zzc() {
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Double zzd() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Integer zze() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Long zzf() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final Object zzg(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return this.zzb.zzi();
                    }
                    return this.zzb.zzl();
                }
                return this.zzb.zzj();
            }
            return this.zzb.zzm();
        }
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzh() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzi() {
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzj() {
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzk() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final String zzl() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final List zzm(String str, String str2) {
        return this.zzb.zzs(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t.j0, java.util.Map] */
    @Override // com.google.android.gms.measurement.zzd
    public final Map zzn(boolean z10) {
        List<zzlj> zzt = this.zzb.zzt(z10);
        ?? j0Var = new j0(zzt.size());
        for (zzlj zzljVar : zzt) {
            Object zza = zzljVar.zza();
            if (zza != null) {
                j0Var.put(zzljVar.zzb, zza);
            }
        }
        return j0Var;
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final Map zzo(String str, String str2, boolean z10) {
        return this.zzb.zzu(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzp(String str) {
        this.zza.zzd().zzd(str, this.zza.zzax().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzq(String str, String str2, Bundle bundle) {
        this.zza.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzr(String str) {
        this.zza.zzd().zze(str, this.zza.zzax().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzs(String str, String str2, Bundle bundle) {
        this.zzb.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzt(String str, String str2, Bundle bundle, long j10) {
        this.zzb.zzE(str, str2, bundle, true, false, j10);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzu(zzhf zzhfVar) {
        this.zzb.zzJ(zzhfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzv(Bundle bundle) {
        this.zzb.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzw(zzhe zzheVar) {
        this.zzb.zzT(zzheVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzx(zzhf zzhfVar) {
        this.zzb.zzZ(zzhfVar);
    }
}
