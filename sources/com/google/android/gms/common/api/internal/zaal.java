package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class zaal implements BaseGmsClient.ConnectionProgressReportCallbacks {
    private final WeakReference<zaaw> zaa;
    private final Api<?> zab;
    private final boolean zac;

    public zaal(zaaw zaawVar, Api<?> api, boolean z10) {
        this.zaa = new WeakReference<>(zaawVar);
        this.zab = api;
        this.zac = z10;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        zabi zabiVar;
        boolean z10;
        Lock lock;
        Lock lock2;
        boolean zaG;
        boolean zaH;
        Lock lock3;
        zaaw zaawVar = this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        zabiVar = zaawVar.zaa;
        if (myLooper == zabiVar.zag.getLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = zaawVar.zab;
        lock.lock();
        try {
            zaG = zaawVar.zaG(0);
            if (!zaG) {
                lock3 = zaawVar.zab;
            } else {
                if (!connectionResult.isSuccess()) {
                    zaawVar.zaE(connectionResult, this.zab, this.zac);
                }
                zaH = zaawVar.zaH();
                if (zaH) {
                    zaawVar.zaF();
                }
                lock3 = zaawVar.zab;
            }
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = zaawVar.zab;
            lock2.unlock();
            throw th2;
        }
    }
}
