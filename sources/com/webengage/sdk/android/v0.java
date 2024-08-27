package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12990a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledFuture f12991b;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f12992c;

    /* renamed from: d, reason: collision with root package name */
    private Intent f12993d;

    private v0() {
        this.f12990a = false;
        this.f12991b = null;
        this.f12992c = null;
        this.f12993d = null;
    }

    public synchronized void a() {
        BroadcastReceiver.PendingResult pendingResult = this.f12992c;
        if (pendingResult != null && !this.f12990a) {
            try {
                pendingResult.finish();
                this.f12991b.cancel(false);
                this.f12990a = true;
            } catch (Exception e10) {
                Logger.e("WebEngage", e10.toString());
            }
        }
    }

    public Intent b() {
        return this.f12993d;
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }

    public v0(Intent intent, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, BroadcastReceiver.PendingResult pendingResult) {
        this.f12990a = false;
        this.f12991b = null;
        this.f12992c = null;
        this.f12993d = intent;
        this.f12991b = scheduledThreadPoolExecutor.schedule(this, 8000L, TimeUnit.MILLISECONDS);
        this.f12992c = pendingResult;
    }
}
