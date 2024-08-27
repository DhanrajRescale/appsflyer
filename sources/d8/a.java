package d8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import b8.l;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14181a = u.C("Alarms");

    public static void a(Context context, int i10, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.a(context, str), 603979776);
        if (service != null && alarmManager != null) {
            u.w().u(f14181a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, l lVar, String str, long j10) {
        int i10;
        int i11;
        WorkDatabase workDatabase = lVar.f4110c;
        h.c k10 = workDatabase.k();
        j8.e E = k10.E(str);
        if (E != null) {
            a(context, E.f21058b, str);
            int i12 = E.f21058b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i12, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j10, service);
                return;
            }
            return;
        }
        synchronized (k8.f.class) {
            workDatabase.c();
            try {
                Long b10 = workDatabase.j().b("next_alarm_manager_id");
                if (b10 != null) {
                    i10 = b10.intValue();
                } else {
                    i10 = 0;
                }
                if (i10 == Integer.MAX_VALUE) {
                    i11 = 0;
                } else {
                    i11 = i10 + 1;
                }
                workDatabase.j().e(new j8.d("next_alarm_manager_id", i11));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
        k10.J(new j8.e(str, i10));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, i10, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j10, service2);
        }
    }
}
