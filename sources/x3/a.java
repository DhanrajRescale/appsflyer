package x3;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class a {
    public static boolean a(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
