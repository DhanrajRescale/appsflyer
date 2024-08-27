package lk;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import h.a0;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24873a;

    /* renamed from: b, reason: collision with root package name */
    public final da.d f24874b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24875c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24876d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f24877e = new a0(this, 8);

    public c(Context context, da.d dVar) {
        this.f24873a = context.getApplicationContext();
        this.f24874b = dVar;
    }

    public static boolean i(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        al.d.V(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            return false;
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            }
            return true;
        }
    }

    @Override // lk.e
    public final void onDestroy() {
    }

    @Override // lk.e
    public final void onStart() {
        if (!this.f24876d) {
            Context context = this.f24873a;
            this.f24875c = i(context);
            try {
                context.registerReceiver(this.f24877e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f24876d = true;
            } catch (SecurityException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e10);
                }
            }
        }
    }

    @Override // lk.e
    public final void onStop() {
        if (this.f24876d) {
            this.f24873a.unregisterReceiver(this.f24877e);
            this.f24876d = false;
        }
    }
}
