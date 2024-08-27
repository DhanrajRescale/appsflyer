package b4;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ NotificationChannel C(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("push_message_service", "Receive push messages", 4);
    }

    public static /* synthetic */ NotificationChannel f(String str) {
        return new NotificationChannel(str, "Syncing Contacts", 3);
    }

    public static /* synthetic */ NotificationChannel g(String str, String str2) {
        return new NotificationChannel(str, str2, 4);
    }

    public static /* bridge */ /* synthetic */ VibrationEffect i() {
        return VibrationEffect.createOneShot(20L, -1);
    }

    public static /* synthetic */ void n() {
    }

    public static /* bridge */ /* synthetic */ void t(Vibrator vibrator, VibrationEffect vibrationEffect) {
        vibrator.vibrate(vibrationEffect);
    }

    public static /* bridge */ /* synthetic */ boolean x(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel z(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }
}
