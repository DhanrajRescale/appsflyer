package q3;

import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class t0 {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
