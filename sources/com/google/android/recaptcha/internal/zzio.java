package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzio extends zziy {
    public zzio(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.recaptcha.internal.zziy
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                ((zzgd) zzg(i10).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzgd) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
