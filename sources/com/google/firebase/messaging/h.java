package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11753c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static g0 f11754d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11755a;

    /* renamed from: b, reason: collision with root package name */
    public final n.a f11756b = new n.a(6);

    public h(Context context) {
        this.f11755a = context;
    }

    public static Task a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (t.q().t(context)) {
            g0 b10 = b(context);
            synchronized (d0.f11738b) {
                try {
                    if (d0.f11739c == null) {
                        WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                        d0.f11739c = wakeLock;
                        wakeLock.setReferenceCounted(true);
                    }
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        d0.f11739c.acquire(d0.f11737a);
                    }
                    b10.b(intent).addOnCompleteListener(new b3.t(intent, 5));
                } finally {
                }
            }
        } else {
            b(context).b(intent);
        }
        return Tasks.forResult(-1);
    }

    public static g0 b(Context context) {
        g0 g0Var;
        synchronized (f11753c) {
            try {
                if (f11754d == null) {
                    f11754d = new g0(context);
                }
                g0Var = f11754d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    public final Task c(Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean isAtLeastO = PlatformVersion.isAtLeastO();
        Context context = this.f11755a;
        if (isAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (z10 && !z11) {
            return a(context, intent);
        }
        j9.f fVar = new j9.f(4, context, intent);
        n.a aVar = this.f11756b;
        return Tasks.call(aVar, fVar).continueWithTask(aVar, new bm.c(14, context, intent));
    }
}
