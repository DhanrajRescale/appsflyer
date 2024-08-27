package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class g0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11747a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f11748b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f11749c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f11750d;

    /* renamed from: e, reason: collision with root package name */
    public e0 f11751e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11752f;

    public g0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f11750d = new ArrayDeque();
        this.f11752f = false;
        Context applicationContext = context.getApplicationContext();
        this.f11747a = applicationContext;
        this.f11748b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f11749c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f11750d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                e0 e0Var = this.f11751e;
                if (e0Var != null && e0Var.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.f11751e.a((f0) this.f11750d.poll());
                } else {
                    c();
                    return;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        f0 f0Var;
        boolean z10;
        long j10;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            f0Var = new f0(intent);
            ScheduledExecutorService scheduledExecutorService = this.f11749c;
            if ((f0Var.f11744a.getFlags() & 268435456) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            bl.d dVar = new bl.d(f0Var, 17);
            if (z10) {
                j10 = d0.f11737a;
            } else {
                j10 = 9000;
            }
            f0Var.f11745b.getTask().addOnCompleteListener(scheduledExecutorService, new b3.t(scheduledExecutorService.schedule(dVar, j10, TimeUnit.MILLISECONDS), 7));
            this.f11750d.add(f0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return f0Var.f11745b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f11752f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f11752f) {
            return;
        }
        this.f11752f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (ConnectionTracker.getInstance().bindService(this.f11747a, this.f11748b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f11752f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f11750d;
            if (!arrayDeque.isEmpty()) {
                ((f0) arrayDeque.poll()).f11745b.trySetResult(null);
            } else {
                return;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f11752f = false;
            if (!(iBinder instanceof e0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.f11750d;
                    if (!arrayDeque.isEmpty()) {
                        ((f0) arrayDeque.poll()).f11745b.trySetResult(null);
                    } else {
                        return;
                    }
                }
            } else {
                this.f11751e = (e0) iBinder;
                a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
