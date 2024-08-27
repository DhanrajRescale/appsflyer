package x8;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import d9.l;
import kotlin.jvm.internal.Intrinsics;
import n8.o;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f40111a;

    /* renamed from: b, reason: collision with root package name */
    public final f f40112b;

    /* renamed from: c, reason: collision with root package name */
    public final h8.e f40113c;

    public h(ConnectivityManager connectivityManager, f fVar) {
        this.f40111a = connectivityManager;
        this.f40112b = fVar;
        h8.e eVar = new h8.e(this, 1);
        this.f40113c = eVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), eVar);
    }

    public static final void a(h hVar, Network network, boolean z10) {
        boolean z11 = false;
        for (Network network2 : hVar.f40111a.getAllNetworks()) {
            if (Intrinsics.a(network2, network)) {
                if (z10) {
                    z11 = true;
                    break;
                }
            } else {
                NetworkCapabilities networkCapabilities = hVar.f40111a.getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z11 = true;
                    break;
                }
            }
        }
        l lVar = (l) hVar.f40112b;
        synchronized (lVar) {
            try {
                if (((o) lVar.f14239a.get()) != null) {
                    lVar.f14243e = z11;
                } else {
                    lVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x8.g
    public final boolean e() {
        ConnectivityManager connectivityManager = this.f40111a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.g
    public final void shutdown() {
        this.f40111a.unregisterNetworkCallback(this.f40113c);
    }
}
