package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11768a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11770c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11771d;

    public /* synthetic */ p(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f11770c = context;
        this.f11769b = z10;
        this.f11771d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        int i10 = this.f11768a;
        boolean z10 = this.f11769b;
        Object obj = this.f11771d;
        Object obj2 = this.f11770c;
        switch (i10) {
            case 0:
                Context context = (Context) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z10) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    taskCompletionSource.trySetResult(null);
                    return;
                } catch (Throwable th2) {
                    taskCompletionSource.trySetResult(null);
                    throw th2;
                }
            default:
                ((LogSessioniserExp) obj2).lambda$pushToPusher$3((ConcurrentHashMap) obj, z10);
                return;
        }
    }

    public /* synthetic */ p(LogSessioniserExp logSessioniserExp, ConcurrentHashMap concurrentHashMap, boolean z10) {
        this.f11770c = logSessioniserExp;
        this.f11771d = concurrentHashMap;
        this.f11769b = z10;
    }
}
