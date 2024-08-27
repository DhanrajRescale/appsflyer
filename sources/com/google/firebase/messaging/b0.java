package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public c0 f11724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f11725b;

    public b0(c0 c0Var, c0 c0Var2) {
        this.f11725b = c0Var;
        this.f11724a = c0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f11725b.f11730a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            c0 c0Var = this.f11724a;
            if (c0Var == null) {
                return;
            }
            if (!c0Var.d()) {
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            c0 c0Var2 = this.f11724a;
            c0Var2.f11733d.f11719f.schedule(c0Var2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f11724a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
