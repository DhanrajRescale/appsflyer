package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaz implements zabz {
    final /* synthetic */ zaaa zaa;

    public /* synthetic */ zaz(zaaa zaaaVar, zay zayVar) {
        this.zaa = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(@NonNull ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            this.zaa.zak = connectionResult;
            zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            this.zaa.zak = ConnectionResult.RESULT_SUCCESS;
            zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i10, boolean z10) {
        Lock lock;
        Lock lock2;
        boolean z11;
        zabi zabiVar;
        Lock lock3;
        lock = this.zaa.zam;
        lock.lock();
        try {
            zaaa zaaaVar = this.zaa;
            z11 = zaaaVar.zal;
            if (z11) {
                zaaaVar.zal = false;
                zaaa.zan(this.zaa, i10, z10);
                lock3 = this.zaa.zam;
            } else {
                zaaaVar.zal = true;
                zabiVar = this.zaa.zad;
                zabiVar.onConnectionSuspended(i10);
                lock3 = this.zaa.zam;
            }
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.zaa.zam;
            lock2.unlock();
            throw th2;
        }
    }
}
