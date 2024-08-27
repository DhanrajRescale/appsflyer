package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f11796a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f11797b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f11798c;

    public w(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f11798c = firebaseMessaging;
        this.f11796a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f11688b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11797b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f11798c.f11688b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        try {
            if (this.f11798c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e10;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        t q10 = t.q();
        FirebaseMessaging firebaseMessaging = this.f11798c;
        boolean t10 = q10.t(firebaseMessaging.f11688b);
        PowerManager.WakeLock wakeLock = this.f11797b;
        if (t10) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f11695i = true;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f11695i = false;
                    if (!t.q().t(firebaseMessaging.f11688b)) {
                        return;
                    }
                }
            }
            if (!firebaseMessaging.f11694h.d()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f11695i = false;
                }
                if (t.q().t(firebaseMessaging.f11688b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (t.q().r(firebaseMessaging.f11688b) && !a()) {
                new h.a0(this).a();
                if (t.q().t(firebaseMessaging.f11688b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (b()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f11695i = false;
                }
            } else {
                firebaseMessaging.e(this.f11796a);
            }
            if (!t.q().t(firebaseMessaging.f11688b)) {
                return;
            }
            wakeLock.release();
        } catch (Throwable th2) {
            if (t.q().t(firebaseMessaging.f11688b)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
