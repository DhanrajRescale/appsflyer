package h8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.u;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: i, reason: collision with root package name */
    public static final String f18050i = u.C("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f18051g;

    /* renamed from: h, reason: collision with root package name */
    public final e f18052h;

    public f(Context context, m8.a aVar) {
        super(context, aVar);
        this.f18051g = (ConnectivityManager) this.f18044b.getSystemService("connectivity");
        this.f18052h = new e(this, 0);
    }

    @Override // h8.d
    public final Object a() {
        return f();
    }

    @Override // h8.d
    public final void d() {
        String str = f18050i;
        try {
            u.w().u(str, "Registering network callback", new Throwable[0]);
            this.f18051g.registerDefaultNetworkCallback(this.f18052h);
        } catch (IllegalArgumentException | SecurityException e10) {
            u.w().v(str, "Received exception while registering network callback", e10);
        }
    }

    @Override // h8.d
    public final void e() {
        String str = f18050i;
        try {
            u.w().u(str, "Unregistering network callback", new Throwable[0]);
            this.f18051g.unregisterNetworkCallback(this.f18052h);
        } catch (IllegalArgumentException | SecurityException e10) {
            u.w().v(str, "Received exception while unregistering network callback", e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, f8.a] */
    public final f8.a f() {
        boolean z10;
        boolean z11;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f18051g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z12 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e10) {
            u.w().v(f18050i, "Unable to validate active network", e10);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z11 = true;
                boolean a10 = x3.a.a(connectivityManager);
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z12 = true;
                }
                ?? obj = new Object();
                obj.f15979a = z10;
                obj.f15980b = z11;
                obj.f15981c = a10;
                obj.f15982d = z12;
                return obj;
            }
        }
        z11 = false;
        boolean a102 = x3.a.a(connectivityManager);
        if (activeNetworkInfo != null) {
            z12 = true;
        }
        ?? obj2 = new Object();
        obj2.f15979a = z10;
        obj2.f15980b = z11;
        obj2.f15981c = a102;
        obj2.f15982d = z12;
        return obj2;
    }
}
