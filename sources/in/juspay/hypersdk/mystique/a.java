package in.juspay.hypersdk.mystique;

import android.app.NotificationChannel;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.ColorSpace;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel a(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* bridge */ /* synthetic */ ColorSpace f(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* bridge */ /* synthetic */ void q(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver, intentFilter, 2);
    }
}
