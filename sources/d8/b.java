package d8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.u;
import androidx.work.v;
import b8.l;
import j8.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements b8.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f14182d = u.C("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f14183a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14184b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f14185c = new Object();

    public b(Context context) {
        this.f14183a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // b8.a
    public final void b(String str, boolean z10) {
        synchronized (this.f14185c) {
            try {
                b8.a aVar = (b8.a) this.f14184b.remove(str);
                if (aVar != null) {
                    aVar.b(str, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Intent intent, int i10, h hVar) {
        boolean z10;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            u.w().u(f14182d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            d dVar = new d(this.f14183a, i10, hVar);
            ArrayList l10 = hVar.f14208e.f4110c.n().l();
            String str = c.f14186a;
            Iterator it = l10.iterator();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            while (it.hasNext()) {
                androidx.work.e eVar = ((k) it.next()).f21083j;
                z11 |= eVar.f2555d;
                z12 |= eVar.f2553b;
                z13 |= eVar.f2556e;
                if (eVar.f2552a != v.f2638a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z14 |= z10;
                if (z11 && z12 && z13 && z14) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f2594a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f14188a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z12).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z14);
            context.sendBroadcast(intent2);
            f8.c cVar = dVar.f14190c;
            cVar.b(l10);
            ArrayList arrayList = new ArrayList(l10.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = l10.iterator();
            while (it2.hasNext()) {
                k kVar = (k) it2.next();
                String str3 = kVar.f21074a;
                if (currentTimeMillis >= kVar.a() && (!kVar.b() || cVar.a(str3))) {
                    arrayList.add(kVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((k) it3.next()).f21074a;
                Intent a10 = a(context, str4);
                u.w().u(d.f14187d, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                hVar.e(new b.d(hVar, a10, dVar.f14189b));
            }
            cVar.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            u.w().u(f14182d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            hVar.f14208e.f();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                String str5 = f14182d;
                u.w().u(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
                WorkDatabase workDatabase = hVar.f14208e.f4110c;
                workDatabase.c();
                try {
                    k o10 = workDatabase.n().o(string);
                    if (o10 == null) {
                        u.w().D(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                    } else if (o10.f21075b.a()) {
                        u.w().D(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                    } else {
                        long a11 = o10.a();
                        boolean b10 = o10.b();
                        Context context2 = this.f14183a;
                        l lVar = hVar.f14208e;
                        if (!b10) {
                            u.w().u(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a11)), new Throwable[0]);
                            a.b(context2, lVar, string, a11);
                        } else {
                            u.w().u(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a11)), new Throwable[0]);
                            a.b(context2, lVar, string, a11);
                            Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                            intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                            hVar.e(new b.d(hVar, intent3, i10));
                        }
                        workDatabase.h();
                    }
                    workDatabase.f();
                    return;
                } catch (Throwable th2) {
                    workDatabase.f();
                    throw th2;
                }
            }
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f14185c) {
                    try {
                        String string2 = extras2.getString("KEY_WORKSPEC_ID");
                        u w10 = u.w();
                        String str6 = f14182d;
                        w10.u(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                        if (!this.f14184b.containsKey(string2)) {
                            e eVar2 = new e(this.f14183a, i10, string2, hVar);
                            this.f14184b.put(string2, eVar2);
                            eVar2.c();
                        } else {
                            u.w().u(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                        }
                    } finally {
                    }
                }
                return;
            }
            if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                u.w().u(f14182d, String.format("Handing stopWork work for %s", string3), new Throwable[0]);
                hVar.f14208e.h(string3);
                String str7 = a.f14181a;
                h.c k10 = hVar.f14208e.f4110c.k();
                j8.e E = k10.E(string3);
                if (E != null) {
                    a.a(this.f14183a, E.f21058b, string3);
                    u.w().u(a.f14181a, String.format("Removing SystemIdInfo for workSpecId (%s)", string3), new Throwable[0]);
                    k10.S(string3);
                }
                hVar.b(string3, false);
                return;
            }
            if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras3 = intent.getExtras();
                String string4 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z15 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                u.w().u(f14182d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
                b(string4, z15);
                return;
            }
            u.w().D(f14182d, String.format("Ignoring intent %s", intent), new Throwable[0]);
            return;
        }
        u.w().v(f14182d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
    }
}
