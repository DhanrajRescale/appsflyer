package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.w;
import androidx.work.u;
import b8.l;
import i8.b;
import i8.c;
import java.util.UUID;
import z3.a;

/* loaded from: classes.dex */
public class SystemForegroundService extends w implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f2603f = u.C("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f2604b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2605c;

    /* renamed from: d, reason: collision with root package name */
    public c f2606d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f2607e;

    public final void a() {
        this.f2604b = new Handler(Looper.getMainLooper());
        this.f2607e = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f2606d = cVar;
        if (cVar.f19740i != null) {
            u.w().v(c.f19731j, "A callback already exists.", new Throwable[0]);
        } else {
            cVar.f19740i = this;
        }
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2606d.g();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.f2605c;
        String str = f2603f;
        if (z10) {
            u.w().z(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f2606d.g();
            a();
            this.f2605c = false;
        }
        if (intent != null) {
            c cVar = this.f2606d;
            cVar.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = c.f19731j;
            l lVar = cVar.f19732a;
            if (equals) {
                u.w().z(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
                int i12 = 6;
                ((h.c) cVar.f19733b).n(new a(i12, cVar, lVar.f4110c, intent.getStringExtra("KEY_WORKSPEC_ID")));
                cVar.f(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                cVar.f(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                u.w().z(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    lVar.getClass();
                    ((h.c) lVar.f4111d).n(new k8.a(lVar, fromString));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                u.w().z(str2, "Stopping foreground service", new Throwable[0]);
                b bVar = cVar.f19740i;
                if (bVar != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
                    systemForegroundService.f2605c = true;
                    u.w().u(str, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
