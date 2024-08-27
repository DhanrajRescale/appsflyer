package com.assetgro.stockgro.data;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/assetgro/stockgro/data/WifiService;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "connectivityManager", "Landroid/net/ConnectivityManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "initializeWithApplicationContext", HttpUrl.FRAGMENT_ENCODE_SET, LogCategory.CONTEXT, "Landroid/content/Context;", "isOnline", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WifiService {
    private ConnectivityManager connectivityManager;
    private WifiManager wifiManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final WifiService instance = new WifiService();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/data/WifiService$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "instance", "Lcom/assetgro/stockgro/data/WifiService;", "getInstance", "()Lcom/assetgro/stockgro/data/WifiService;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WifiService getInstance() {
            return WifiService.instance;
        }
    }

    public final void initializeWithApplicationContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        this.wifiManager = (WifiManager) systemService;
        Object systemService2 = context.getSystemService("connectivity");
        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService2;
    }

    public final boolean isOnline() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return false;
            }
            if (networkCapabilities.hasTransport(1)) {
                if (!networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
                    return false;
                }
            } else if (!networkCapabilities.hasTransport(0) || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        }
        Intrinsics.k("connectivityManager");
        throw null;
    }
}
