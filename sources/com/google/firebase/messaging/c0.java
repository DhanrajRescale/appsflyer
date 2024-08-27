package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f11727f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f11728g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f11729h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11730a;

    /* renamed from: b, reason: collision with root package name */
    public final xk.f f11731b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f11732c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f11733d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11734e;

    public c0(a0 a0Var, Context context, xk.f fVar, long j10) {
        this.f11733d = a0Var;
        this.f11730a = context;
        this.f11734e = j10;
        this.f11731b = fVar;
        this.f11732c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f11727f) {
            try {
                Boolean bool = f11729h;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f11729h = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z10;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f11727f) {
            try {
                Boolean bool = f11728g;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f11728g = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f11730a.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z10 = true;
                }
            }
            z10 = false;
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.f11733d;
        Context context = this.f11730a;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.f11732c;
        if (c10) {
            wakeLock.acquire(f.f11743a);
        }
        try {
            try {
                synchronized (a0Var) {
                    a0Var.f11720g = true;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                synchronized (a0Var) {
                    a0Var.f11720g = false;
                    if (!c(context)) {
                        return;
                    }
                }
            }
            if (!this.f11731b.d()) {
                synchronized (a0Var) {
                    a0Var.f11720g = false;
                }
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a(context) && !d()) {
                new b0(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a0Var.d()) {
                synchronized (a0Var) {
                    a0Var.f11720g = false;
                }
            } else {
                a0Var.e(this.f11734e);
            }
            if (!c(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th2) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
