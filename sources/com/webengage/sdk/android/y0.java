package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class y0 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, x0> f13015a = new HashMap();

    private static synchronized x0 a(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        synchronized (y0.class) {
            try {
                ResolveInfo resolveService = context.getApplicationContext().getPackageManager().resolveService(intent, 0);
                if (resolveService == null || (serviceInfo = resolveService.serviceInfo) == null) {
                    return null;
                }
                String str = serviceInfo.name;
                if (f13015a.get(str) == null) {
                    f13015a.put(str, new x0(context, intent));
                }
                return f13015a.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(Context context, Intent intent, BroadcastReceiver broadcastReceiver) {
        String str;
        try {
            context.getApplicationContext().startService(intent);
        } catch (IllegalStateException e10) {
            Logger.e("WebEngage", "Exception while starting service: " + e10.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    a(context, intent, broadcastReceiver);
                } catch (Exception unused) {
                    str = "Exception while connecting to service: " + intent;
                    Logger.e("WebEngage", str);
                }
            }
        } catch (Exception e11) {
            str = "Exception: " + e11.toString();
            Logger.e("WebEngage", str);
        }
    }

    private static void a(Context context, Intent intent, BroadcastReceiver broadcastReceiver) {
        Logger.d("WebEngage", "connect called");
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver != null ? broadcastReceiver.goAsync() : null;
        x0 a10 = a(context.getApplicationContext(), intent);
        if (a10 != null) {
            a10.a(intent, goAsync);
        }
    }
}
