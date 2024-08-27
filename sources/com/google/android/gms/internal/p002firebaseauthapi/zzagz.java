package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzagz extends zzahd {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzagz(zzagy zzagyVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j10, int i10) {
        zzagw zzagwVar;
        List arrayList;
        List list = (List) zzajf.zzf(obj, j10);
        if (list.isEmpty()) {
            if (list instanceof zzagx) {
                arrayList = new zzagw(i10);
            } else if ((list instanceof zzahw) && (list instanceof zzagp)) {
                arrayList = ((zzagp) list).zzd(i10);
            } else {
                arrayList = new ArrayList(i10);
            }
            zzajf.zzs(obj, j10, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            zzajf.zzs(obj, j10, arrayList2);
            zzagwVar = arrayList2;
        } else if (list instanceof zzaja) {
            zzagw zzagwVar2 = new zzagw(list.size() + i10);
            zzagwVar2.addAll(zzagwVar2.size(), (zzaja) list);
            zzajf.zzs(obj, j10, zzagwVar2);
            zzagwVar = zzagwVar2;
        } else {
            if ((list instanceof zzahw) && (list instanceof zzagp)) {
                zzagp zzagpVar = (zzagp) list;
                if (!zzagpVar.zzc()) {
                    zzagp zzd = zzagpVar.zzd(list.size() + i10);
                    zzajf.zzs(obj, j10, zzd);
                    return zzd;
                }
                return list;
            }
            return list;
        }
        return zzagwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahd
    public final List zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahd
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzajf.zzf(obj, j10);
        if (list instanceof zzagx) {
            unmodifiableList = ((zzagx) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzahw) && (list instanceof zzagp)) {
                zzagp zzagpVar = (zzagp) list;
                if (zzagpVar.zzc()) {
                    zzagpVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzajf.zzs(obj, j10, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahd
    public final void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzajf.zzf(obj2, j10);
        List zzf = zzf(obj, j10, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzajf.zzs(obj, j10, list);
    }

    private zzagz() {
        super(null);
    }
}
