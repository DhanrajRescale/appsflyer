package com.google.android.gms.internal.icing;

/* loaded from: classes2.dex */
final class zzdr extends zzds {
    public /* synthetic */ zzdr(zzdp zzdpVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.icing.zzds
    public final void zza(Object obj, long j10) {
        ((zzdg) zzfn.zzn(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.icing.zzds
    public final <E> void zzb(Object obj, Object obj2, long j10) {
        zzdg zzdgVar = (zzdg) zzfn.zzn(obj, j10);
        zzdg zzdgVar2 = (zzdg) zzfn.zzn(obj2, j10);
        int size = zzdgVar.size();
        int size2 = zzdgVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzdgVar.zza()) {
                zzdgVar = zzdgVar.zze(size2 + size);
            }
            zzdgVar.addAll(zzdgVar2);
        }
        if (size > 0) {
            zzdgVar2 = zzdgVar;
        }
        zzfn.zzo(obj, j10, zzdgVar2);
    }

    private zzdr() {
        super(null);
    }
}
