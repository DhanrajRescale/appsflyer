package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f11737a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f11738b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static WakeLock f11739c;

    public static void a(Intent intent) {
        synchronized (f11738b) {
            try {
                if (f11739c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f11739c.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        synchronized (f11738b) {
            try {
                if (f11739c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f11739c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f11739c.acquire(f11737a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
