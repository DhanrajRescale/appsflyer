package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23567a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23568b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23569c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23571e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f23567a = i10;
        this.f23571e = obj;
        this.f23568b = obj2;
        this.f23569c = obj3;
        this.f23570d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8.k o10;
        int i10 = this.f23567a;
        Object obj = this.f23571e;
        Object obj2 = this.f23570d;
        Object obj3 = this.f23569c;
        Object obj4 = this.f23568b;
        switch (i10) {
            case 0:
                h hVar = (h) obj4;
                if (hVar != null) {
                    e.l lVar = (e.l) obj;
                    ((i) lVar.f14641b).A = true;
                    hVar.f23573b.c(false);
                    ((i) lVar.f14641b).A = false;
                }
                MenuItem menuItem = (MenuItem) obj3;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) obj2).q(menuItem, null, 4);
                    return;
                }
                return;
            case 1:
                try {
                    boolean booleanExtra = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) obj4).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) obj4).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    androidx.work.u.w().u(ConstraintProxyUpdateReceiver.f2594a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                    k8.h.a((Context) obj3, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    k8.h.a((Context) obj3, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    k8.h.a((Context) obj3, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    k8.h.a((Context) obj3, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) obj2).finish();
                }
            case 2:
                UUID uuid = (UUID) obj4;
                String uuid2 = uuid.toString();
                androidx.work.u w10 = androidx.work.u.w();
                String str = k8.p.f22701c;
                w10.u(str, String.format("Updating progress for %s (%s)", uuid, (androidx.work.k) obj3), new Throwable[0]);
                k8.p pVar = (k8.p) obj;
                WorkDatabase workDatabase = pVar.f22702a;
                WorkDatabase workDatabase2 = pVar.f22702a;
                workDatabase.c();
                try {
                    o10 = ((k8.p) obj).f22702a.n().o(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (o10 != null) {
                    if (o10.f21075b == androidx.work.g0.f2566b) {
                        ((k8.p) obj).f22702a.m().u(new j8.g(uuid2, (androidx.work.k) obj3));
                    } else {
                        androidx.work.u.w().D(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid2), new Throwable[0]);
                    }
                    ((l8.j) obj2).j(null);
                    ((k8.p) obj).f22702a.h();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            default:
                if (((AtomicBoolean) obj4).compareAndSet(false, true)) {
                    ((ct.a) obj3).f();
                    kt.n nVar = (kt.n) obj;
                    at.a aVar = nVar.f23525e;
                    if (aVar == null) {
                        ((at.b) obj2).onError(new TimeoutException(rt.b.a(nVar.f23522b, nVar.f23523c)));
                        return;
                    } else {
                        aVar.a(new kt.l(this));
                        return;
                    }
                }
                return;
        }
    }
}
