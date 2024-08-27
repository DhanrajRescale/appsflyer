package com.google.android.gms.internal.icing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzdq extends zzds {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzdq(zzdp zzdpVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.icing.zzds
    public final void zza(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzfn.zzn(obj, j10);
        if (list instanceof zzdo) {
            unmodifiableList = ((zzdo) list).zzi();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzel) && (list instanceof zzdg)) {
                zzdg zzdgVar = (zzdg) list;
                if (zzdgVar.zza()) {
                    zzdgVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzfn.zzo(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.icing.zzds
    public final <E> void zzb(Object obj, Object obj2, long j10) {
        zzdn zzdnVar;
        List list = (List) zzfn.zzn(obj2, j10);
        int size = list.size();
        List list2 = (List) zzfn.zzn(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof zzdo) {
                list2 = new zzdn(size);
            } else if ((list2 instanceof zzel) && (list2 instanceof zzdg)) {
                list2 = ((zzdg) list2).zze(size);
            } else {
                list2 = new ArrayList(size);
            }
            zzfn.zzo(obj, j10, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzfn.zzo(obj, j10, arrayList);
                zzdnVar = arrayList;
            } else if (list2 instanceof zzfi) {
                zzdn zzdnVar2 = new zzdn(list2.size() + size);
                zzdnVar2.addAll(zzdnVar2.size(), (zzfi) list2);
                zzfn.zzo(obj, j10, zzdnVar2);
                zzdnVar = zzdnVar2;
            } else if ((list2 instanceof zzel) && (list2 instanceof zzdg)) {
                zzdg zzdgVar = (zzdg) list2;
                if (!zzdgVar.zza()) {
                    list2 = zzdgVar.zze(list2.size() + size);
                    zzfn.zzo(obj, j10, list2);
                }
            }
            list2 = zzdnVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzfn.zzo(obj, j10, list);
    }

    private zzdq() {
        super(null);
    }
}
