package h8;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.u;

/* loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18049b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f18048a = i10;
        this.f18049b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f18048a) {
            case 1:
                x8.h.a((x8.h) this.f18049b, network, true);
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f18048a) {
            case 0:
                u.w().u(f.f18050i, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
                f fVar = (f) this.f18049b;
                fVar.c(fVar.f());
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i10 = this.f18048a;
        Object obj = this.f18049b;
        switch (i10) {
            case 0:
                u.w().u(f.f18050i, "Network connection lost", new Throwable[0]);
                f fVar = (f) obj;
                fVar.c(fVar.f());
                return;
            default:
                x8.h.a((x8.h) obj, network, false);
                return;
        }
    }
}
