package com.webengage.sdk.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.webengage.sdk.android.actions.database.r;

/* loaded from: classes2.dex */
public class EventLogService extends w0 {

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12125a;

        static {
            int[] iArr = new int[j0.values().length];
            f12125a = iArr;
            try {
                iArr[j0.f12601e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.webengage.sdk.android.w0
    public void a(Intent intent) {
        j0 j0Var;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (j0Var = (j0) extras.get("topic")) != null && a.f12125a[j0Var.ordinal()] == 1) {
                    h0.a(getApplicationContext()).a(j0Var, extras.get("data"));
                }
            } catch (Exception e10) {
                try {
                    h0.a(getApplicationContext()).a(j0.f12603g, e10);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public void onDestroy() {
        r.c(true);
        super.onDestroy();
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
