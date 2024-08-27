package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.g0;

/* loaded from: classes2.dex */
final class zae extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ g0 zab;
    final /* synthetic */ int zac;

    public zae(Intent intent, g0 g0Var, int i10) {
        this.zaa = intent;
        this.zab = g0Var;
        this.zac = i10;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
