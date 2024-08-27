package com.webengage.sdk.android;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class z {
    public static synchronized void a(PushChannelConfiguration pushChannelConfiguration, Context context) {
        Uri defaultUri;
        synchronized (z.class) {
            try {
                if (context == null || pushChannelConfiguration == null) {
                    throw new IllegalArgumentException("Invalid Arguments");
                }
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (Build.VERSION.SDK_INT >= 26) {
                    b4.f.n();
                    NotificationChannel b10 = z0.b(pushChannelConfiguration.getNotificationChannelId(), pushChannelConfiguration.getNotificationChannelName(), pushChannelConfiguration.getNotificationChannelImportance());
                    if (pushChannelConfiguration.getNotificationChannelDescription() != null) {
                        b10.setDescription(pushChannelConfiguration.getNotificationChannelDescription());
                    }
                    if (pushChannelConfiguration.getNotificationChannelGroup() != null) {
                        b10.setGroup(pushChannelConfiguration.getNotificationChannelGroup());
                    }
                    if (pushChannelConfiguration.getNotificationChannelLightColor() != -1) {
                        b10.enableLights(true);
                        b10.setLightColor(pushChannelConfiguration.getNotificationChannelLightColor());
                    }
                    b10.setLockscreenVisibility(pushChannelConfiguration.getNotificationChannelLockScreenVisibility());
                    b10.setShowBadge(pushChannelConfiguration.isNotificationChannelShowBadge());
                    if (pushChannelConfiguration.getNotificationChannelSound() != null) {
                        int identifier = context.getResources().getIdentifier(pushChannelConfiguration.getNotificationChannelSound(), "raw", context.getPackageName());
                        if (identifier != 0) {
                            defaultUri = Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier);
                        } else {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                            Logger.e("WebEngage", "No sound resources found in raw folder for name: " + pushChannelConfiguration.getNotificationChannelSound() + ", using default tone.");
                        }
                        b10.setSound(defaultUri, null);
                    }
                    b10.enableVibration(pushChannelConfiguration.isNotificationChannelVibration());
                    notificationManager.createNotificationChannel(b10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized boolean b(String str, Context context) {
        NotificationChannel notificationChannel;
        synchronized (z.class) {
            if (Build.VERSION.SDK_INT < 26) {
                return true;
            }
            if (str != null && context != null) {
                notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str);
                return notificationChannel != null;
            }
            return false;
        }
    }

    public static synchronized boolean a(String str, Context context) {
        List notificationChannelGroups;
        String id2;
        synchronized (z.class) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (str != null && context != null) {
                    notificationChannelGroups = ((NotificationManager) context.getSystemService("notification")).getNotificationChannelGroups();
                    if (notificationChannelGroups != null) {
                        Iterator it = notificationChannelGroups.iterator();
                        while (it.hasNext()) {
                            id2 = z0.c(it.next()).getId();
                            if (str.equals(id2)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return false;
        }
    }
}
