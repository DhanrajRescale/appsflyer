package ml;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements NsdManager.RegistrationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27822b;

    public a(String str, String str2) {
        this.f27821a = str;
        this.f27822b = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        b bVar = b.f27823a;
        b.a(this.f27822b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
        Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
        if (!Intrinsics.a(this.f27821a, NsdServiceInfo.getServiceName())) {
            b bVar = b.f27823a;
            b.a(this.f27822b);
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
    }
}
