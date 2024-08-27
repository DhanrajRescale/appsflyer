package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import tn.c;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f8373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f8374b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f8374b = bVar;
        if (installReferrerStateListener != null) {
            this.f8373a = installReferrerStateListener;
            return;
        }
        throw new RuntimeException("Please specify a listener to know when setup is done.");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c aVar;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i10 = tn.b.f36225a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof c) {
                aVar = (c) queryLocalInterface;
            } else {
                aVar = new tn.a(iBinder);
            }
        }
        b bVar = this.f8374b;
        bVar.f8377c = aVar;
        bVar.f8375a = 2;
        this.f8373a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f8374b;
        bVar.f8377c = null;
        bVar.f8375a = 0;
        this.f8373a.onInstallReferrerServiceDisconnected();
    }
}
