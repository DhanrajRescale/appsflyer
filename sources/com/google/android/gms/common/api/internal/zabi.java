package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes2.dex */
public final class zabi implements zaca, zau {
    final Map<Api.AnyClientKey<?>, Api.Client> zaa;
    final ClientSettings zac;
    final Map<Api<?>, Boolean> zad;
    final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> zae;
    int zaf;
    final zabe zag;
    final zabz zah;
    private final Lock zai;
    private final Condition zaj;
    private final Context zak;
    private final GoogleApiAvailabilityLight zal;
    private final zabh zam;

    @NotOnlyInitialized
    private volatile zabf zan;
    final Map<Api.AnyClientKey<?>, ConnectionResult> zab = new HashMap();
    private ConnectionResult zao = null;

    public zabi(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zat> arrayList, zabz zabzVar) {
        this.zak = context;
        this.zai = lock;
        this.zal = googleApiAvailabilityLight;
        this.zaa = map;
        this.zac = clientSettings;
        this.zad = map2;
        this.zae = abstractClientBuilder;
        this.zag = zabeVar;
        this.zah = zabzVar;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).zaa(this);
        }
        this.zam = new zabh(this, looper);
        this.zaj = lock.newCondition();
        this.zan = new zaax(this);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.zai.lock();
        try {
            this.zan.zag(bundle);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.zai.lock();
        try {
            this.zan.zai(i10);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api<?> api, boolean z10) {
        this.zai.lock();
        try {
            this.zan.zah(connectionResult, api, z10);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        zaq();
        while (this.zan instanceof zaaw) {
            try {
                this.zaj.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.zan instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zao;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j10, TimeUnit timeUnit) {
        zaq();
        long nanos = timeUnit.toNanos(j10);
        while (this.zan instanceof zaaw) {
            if (nanos <= 0) {
                zar();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.zaj.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (this.zan instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zao;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(@NonNull Api<?> api) {
        Api.AnyClientKey<?> zab = api.zab();
        if (this.zaa.containsKey(zab)) {
            if (this.zaa.get(zab).isConnected()) {
                return ConnectionResult.RESULT_SUCCESS;
            }
            if (this.zab.containsKey(zab)) {
                return this.zab.get(zab);
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(@NonNull T t10) {
        t10.zak();
        this.zan.zaa(t10);
        return t10;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(@NonNull T t10) {
        t10.zak();
        return (T) this.zan.zab(t10);
    }

    public final void zai() {
        this.zai.lock();
        try {
            this.zag.zak();
            this.zan = new zaaj(this);
            this.zan.zad();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    public final void zaj() {
        this.zai.lock();
        try {
            this.zan = new zaaw(this, this.zac, this.zad, this.zal, this.zae, this.zai, this.zak);
            this.zan.zad();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    public final void zak(ConnectionResult connectionResult) {
        this.zai.lock();
        try {
            this.zao = connectionResult;
            this.zan = new zaax(this);
            this.zan.zad();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    public final void zal(zabg zabgVar) {
        this.zam.sendMessage(this.zam.obtainMessage(1, zabgVar));
    }

    public final void zam(RuntimeException runtimeException) {
        this.zam.sendMessage(this.zam.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.zan.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        if (this.zan.zaj()) {
            this.zab.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.zan);
        for (Api<?> api : this.zad.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.zad()).println(":");
            ((Api.Client) Preconditions.checkNotNull(this.zaa.get(api.zab()))).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        if (this.zan instanceof zaaj) {
            ((zaaj) this.zan).zaf();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        return this.zan instanceof zaaj;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        return this.zan instanceof zaaw;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        return false;
    }
}
