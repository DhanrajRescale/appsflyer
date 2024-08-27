package e8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.e;
import androidx.work.f;
import androidx.work.g0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.u;
import androidx.work.v;
import b8.c;
import b8.l;
import j8.d;
import j8.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f15093e = u.C("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f15094a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f15095b;

    /* renamed from: c, reason: collision with root package name */
    public final l f15096c;

    /* renamed from: d, reason: collision with root package name */
    public final a f15097d;

    public b(Context context, l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f15094a = context;
        this.f15096c = lVar;
        this.f15095b = jobScheduler;
        this.f15097d = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            u.w().v(f15093e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            u.w().v(f15093e, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // b8.c
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[SYNTHETIC] */
    @Override // b8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f15094a
            android.app.job.JobScheduler r1 = r8.f15095b
            java.util.ArrayList r0 = d(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L49
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            java.lang.String r5 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r4.getExtras()
            if (r6 == 0) goto L35
            boolean r7 = r6.containsKey(r5)     // Catch: java.lang.NullPointerException -> L35
            if (r7 == 0) goto L35
            java.lang.String r5 = r6.getString(r5)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r5 = r2
        L36:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L16
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L16
        L48:
            r2 = r3
        L49:
            if (r2 == 0) goto L74
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L74
            java.util.Iterator r0 = r2.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            b(r1, r2)
            goto L55
        L69:
            b8.l r0 = r8.f15096c
            androidx.work.impl.WorkDatabase r0 = r0.f4110c
            h.c r0 = r0.k()
            r0.S(r9)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.b.c(java.lang.String):void");
    }

    public final void e(k kVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        JobScheduler jobScheduler = this.f15095b;
        a aVar = this.f15097d;
        aVar.getClass();
        e eVar = kVar.f21083j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", kVar.f21074a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", kVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i10, aVar.f15092a).setRequiresCharging(eVar.f2553b).setRequiresDeviceIdle(eVar.f2554c).setExtras(persistableBundle);
        v vVar = eVar.f2552a;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30 && vVar == v.f2643f) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int ordinal = vVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        i11 = 3;
                        if (ordinal != 3) {
                            i11 = 4;
                            if (ordinal != 4 || i14 < 26) {
                                u.w().u(a.f15091b, String.format("API version too low. Cannot convert network type value %s", vVar), new Throwable[0]);
                            }
                        }
                    } else {
                        i11 = 2;
                    }
                }
                i11 = 1;
            } else {
                i11 = 0;
            }
            extras.setRequiredNetworkType(i11);
        }
        if (!eVar.f2554c) {
            if (kVar.f21085l == 2) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            extras.setBackoffCriteria(kVar.f21086m, i13);
        }
        long max = Math.max(kVar.a() - System.currentTimeMillis(), 0L);
        if (i14 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!kVar.f21090q) {
            extras.setImportantWhileForeground(true);
        }
        if (eVar.f2559h.f2564a.size() > 0) {
            Iterator it = eVar.f2559h.f2564a.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(fVar.f2560a, fVar.f2561b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(eVar.f2557f);
            extras.setTriggerContentMaxDelay(eVar.f2558g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(eVar.f2555d);
            extras.setRequiresStorageNotLow(eVar.f2556e);
        }
        if (kVar.f21084k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (max > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (y3.b.b() && kVar.f21090q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str = f15093e;
        u.w().u(str, String.format("Scheduling work ID %s Job ID %s", kVar.f21074a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                u.w().D(str, String.format("Unable to schedule work ID %s", kVar.f21074a), new Throwable[0]);
                if (kVar.f21090q && kVar.f21091r == 1) {
                    kVar.f21090q = false;
                    u.w().u(str, String.format("Scheduling a non-expedited job (work ID %s)", kVar.f21074a), new Throwable[0]);
                    e(kVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList d10 = d(this.f15094a, jobScheduler);
            if (d10 != null) {
                i12 = d10.size();
            } else {
                i12 = 0;
            }
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(i12);
            l lVar = this.f15096c;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(lVar.f4110c.n().l().size()), Integer.valueOf(lVar.f4109b.f2550h));
            u.w().v(str, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th2) {
            u.w().v(str, String.format("Unable to schedule %s", kVar), th2);
        }
    }

    @Override // b8.c
    public final void f(k... kVarArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        l lVar = this.f15096c;
        WorkDatabase workDatabase = lVar.f4110c;
        int length = kVarArr.length;
        int i14 = 0;
        int i15 = 0;
        while (i15 < length) {
            k kVar = kVarArr[i15];
            workDatabase.c();
            try {
                k o10 = workDatabase.n().o(kVar.f21074a);
                String str = f15093e;
                if (o10 == null) {
                    u.w().D(str, "Skipping scheduling " + kVar.f21074a + " because it's no longer in the DB", new Throwable[i14]);
                    workDatabase.h();
                } else if (o10.f21075b != g0.f2565a) {
                    u.w().D(str, "Skipping scheduling " + kVar.f21074a + " because it is no longer enqueued", new Throwable[i14]);
                    workDatabase.h();
                } else {
                    j8.e E = workDatabase.k().E(kVar.f21074a);
                    if (E != null) {
                        i13 = E.f21058b;
                        i12 = i15;
                    } else {
                        lVar.f4109b.getClass();
                        int i16 = lVar.f4109b.f2549g;
                        synchronized (k8.f.class) {
                            workDatabase.c();
                            try {
                                Long b10 = workDatabase.j().b("next_job_scheduler_id");
                                if (b10 != null) {
                                    i10 = b10.intValue();
                                } else {
                                    i10 = i14;
                                }
                                if (i10 == Integer.MAX_VALUE) {
                                    i11 = i14;
                                } else {
                                    i11 = i10 + 1;
                                }
                                i12 = i15;
                                workDatabase.j().e(new d("next_job_scheduler_id", i11));
                                workDatabase.h();
                                workDatabase.f();
                                if (i10 >= 0 && i10 <= i16) {
                                    i13 = i10;
                                }
                                workDatabase.j().e(new d("next_job_scheduler_id", 1));
                                i13 = 0;
                            } finally {
                            }
                        }
                    }
                    if (E == null) {
                        lVar.f4110c.k().J(new j8.e(kVar.f21074a, i13));
                    }
                    e(kVar, i13);
                    workDatabase.h();
                    i15 = i12 + 1;
                    i14 = 0;
                }
                workDatabase.f();
                i12 = i15;
                i15 = i12 + 1;
                i14 = 0;
            } finally {
                workDatabase.f();
            }
        }
    }
}
