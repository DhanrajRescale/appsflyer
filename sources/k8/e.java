package k8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import androidx.work.u;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f22665d = u.C("ForceStopRunnable");

    /* renamed from: e, reason: collision with root package name */
    public static final long f22666e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f22667a;

    /* renamed from: b, reason: collision with root package name */
    public final b8.l f22668b;

    /* renamed from: c, reason: collision with root package name */
    public int f22669c = 0;

    public e(Context context, b8.l lVar) {
        this.f22667a = context.getApplicationContext();
        this.f22668b = lVar;
    }

    public static void c(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (y3.b.b()) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + f22666e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.e.a():void");
    }

    public final boolean b() {
        androidx.work.d dVar = this.f22668b.f4109b;
        dVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f22665d;
        if (isEmpty) {
            u.w().u(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a10 = i.a(this.f22667a, dVar);
        u.w().u(str, String.format("Is default app process = %s", Boolean.valueOf(a10)), new Throwable[0]);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f22665d;
        b8.l lVar = this.f22668b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                b8.k.a(this.f22667a);
                u.w().u(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.f22669c + 1;
                    this.f22669c = i10;
                    if (i10 < 3) {
                        u.w().u(str, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                        try {
                            Thread.sleep(this.f22669c * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        u.w().v(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        lVar.f4109b.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            lVar.e();
        }
    }
}
