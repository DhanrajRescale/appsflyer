package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlb implements zzln {
    final /* synthetic */ zzlg zza;

    public zzlb(zzlg zzlgVar) {
        this.zza = zzlgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzln
    public final void zza(String str, String str2, Bundle bundle) {
        zzge zzgeVar;
        zzge zzgeVar2;
        if (TextUtils.isEmpty(str)) {
            zzlg zzlgVar = this.zza;
            zzgeVar = zzlgVar.zzn;
            if (zzgeVar != null) {
                zzgeVar2 = zzlgVar.zzn;
                zzgeVar2.zzaA().zzd().zzb("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.zza.zzaB().zzp(new zzla(this, str, "_err", bundle));
    }
}
