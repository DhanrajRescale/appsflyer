package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzaex implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzaff zzaffVar = (zzaff) obj;
        zzaff zzaffVar2 = (zzaff) obj2;
        zzaew zzaewVar = new zzaew(zzaffVar);
        zzaew zzaewVar2 = new zzaew(zzaffVar2);
        while (zzaewVar.hasNext() && zzaewVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzaewVar.zza() & 255).compareTo(Integer.valueOf(zzaewVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzaffVar.zzd()).compareTo(Integer.valueOf(zzaffVar2.zzd()));
    }
}
