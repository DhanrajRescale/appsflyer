package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.w;
import androidx.work.u;
import d8.g;
import d8.h;
import java.util.HashMap;
import java.util.WeakHashMap;
import k8.l;

/* loaded from: classes.dex */
public class SystemAlarmService extends w implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f2596d = u.C("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public h f2597b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2598c;

    public final void a() {
        this.f2598c = true;
        u.w().u(f2596d, "All commands completed in dispatcher", new Throwable[0]);
        String str = l.f22686a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = l.f22687b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                u.w().D(l.f22686a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f2597b = hVar;
        if (hVar.f14213j != null) {
            u.w().v(h.f14203k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            hVar.f14213j = this;
        }
        this.f2598c = false;
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2598c = true;
        this.f2597b.d();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2598c) {
            u.w().z(f2596d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f2597b.d();
            h hVar = new h(this);
            this.f2597b = hVar;
            if (hVar.f14213j != null) {
                u.w().v(h.f14203k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                hVar.f14213j = this;
            }
            this.f2598c = false;
        }
        if (intent != null) {
            this.f2597b.a(i11, intent);
            return 3;
        }
        return 3;
    }
}
