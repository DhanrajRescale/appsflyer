package b8;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.lifecycle.d0;
import androidx.work.i0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.u;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import l7.r;
import l7.s;
import l7.t;
import l7.v;
import l7.w;
import l7.x;
import l7.y;

/* loaded from: classes.dex */
public final class l extends i0 {

    /* renamed from: j, reason: collision with root package name */
    public static l f4105j;

    /* renamed from: k, reason: collision with root package name */
    public static l f4106k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f4107l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4108a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.d f4109b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f4110c;

    /* renamed from: d, reason: collision with root package name */
    public final m8.a f4111d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4112e;

    /* renamed from: f, reason: collision with root package name */
    public final b f4113f;

    /* renamed from: g, reason: collision with root package name */
    public final k8.f f4114g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4115h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f4116i;

    static {
        u.C("WorkManagerImpl");
        f4105j = null;
        f4106k = null;
        f4107l = new Object();
    }

    public l(Context context, androidx.work.d dVar, h.c cVar) {
        r rVar;
        Executor executor;
        int i10;
        String str;
        boolean z10;
        boolean z11 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        k8.j jVar = (k8.j) cVar.f17583b;
        int i11 = WorkDatabase.f2585l;
        if (z11) {
            rVar = new r(applicationContext, null);
            rVar.f24154h = true;
        } else {
            String str2 = k.f4103a;
            rVar = new r(applicationContext, "androidx.work.workdb");
            rVar.f24153g = new f(applicationContext);
        }
        rVar.f24151e = jVar;
        Object obj = new Object();
        if (rVar.f24150d == null) {
            rVar.f24150d = new ArrayList();
        }
        rVar.f24150d.add(obj);
        rVar.a(j.f4096a);
        rVar.a(new i(applicationContext, 2, 3));
        rVar.a(j.f4097b);
        rVar.a(j.f4098c);
        rVar.a(new i(applicationContext, 5, 6));
        rVar.a(j.f4099d);
        rVar.a(j.f4100e);
        rVar.a(j.f4101f);
        rVar.a(new i(applicationContext));
        rVar.a(new i(applicationContext, 10, 11));
        rVar.a(j.f4102g);
        rVar.f24155i = false;
        rVar.f24156j = true;
        Context context2 = rVar.f24149c;
        if (context2 != null) {
            Class cls = rVar.f24147a;
            if (cls != null) {
                Executor executor2 = rVar.f24151e;
                if (executor2 == null && rVar.f24152f == null) {
                    n.a aVar = n.b.f28108i;
                    rVar.f24152f = aVar;
                    rVar.f24151e = aVar;
                } else if (executor2 != null && rVar.f24152f == null) {
                    rVar.f24152f = executor2;
                } else if (executor2 == null && (executor = rVar.f24152f) != null) {
                    rVar.f24151e = executor;
                }
                if (rVar.f24153g == null) {
                    rVar.f24153g = new ni.j(25);
                }
                String str3 = rVar.f24148b;
                p7.c cVar2 = rVar.f24153g;
                hr.c cVar3 = rVar.f24157k;
                ArrayList arrayList = rVar.f24150d;
                boolean z12 = rVar.f24154h;
                ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                if (activityManager != null && !activityManager.isLowRamDevice()) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                Executor executor3 = rVar.f24151e;
                Executor executor4 = rVar.f24152f;
                l7.a aVar2 = new l7.a(context2, str3, cVar2, cVar3, arrayList, z12, i10, executor3, executor4, rVar.f24155i, rVar.f24156j);
                String name = cls.getPackage().getName();
                String canonicalName = cls.getCanonicalName();
                String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
                try {
                    if (name.isEmpty()) {
                        str = str4;
                    } else {
                        str = name + "." + str4;
                    }
                    s sVar = (s) Class.forName(str).newInstance();
                    p7.d e10 = sVar.e(aVar2);
                    sVar.f24162d = e10;
                    if (e10 instanceof w) {
                        ((w) e10).f24195f = aVar2;
                    }
                    if (i10 == 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e10.setWriteAheadLoggingEnabled(z10);
                    sVar.f24166h = arrayList;
                    sVar.f24160b = executor3;
                    sVar.f24161c = new y(executor4);
                    sVar.f24164f = z12;
                    sVar.f24165g = z10;
                    WorkDatabase workDatabase = (WorkDatabase) sVar;
                    Context applicationContext2 = context.getApplicationContext();
                    u uVar = new u(dVar.f2548f);
                    synchronized (u.class) {
                        u.f2636b = uVar;
                    }
                    String str5 = d.f4085a;
                    e8.b bVar = new e8.b(applicationContext2, this);
                    k8.h.a(applicationContext2, SystemJobService.class, true);
                    u.w().u(d.f4085a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                    List asList = Arrays.asList(bVar, new c8.b(applicationContext2, dVar, cVar, this));
                    b bVar2 = new b(context, dVar, cVar, workDatabase, asList);
                    Context applicationContext3 = context.getApplicationContext();
                    this.f4108a = applicationContext3;
                    this.f4109b = dVar;
                    this.f4111d = cVar;
                    this.f4110c = workDatabase;
                    this.f4112e = asList;
                    this.f4113f = bVar2;
                    this.f4114g = new k8.f(workDatabase);
                    this.f4115h = false;
                    if (!applicationContext3.isDeviceProtectedStorage()) {
                        ((h.c) this.f4111d).n(new k8.e(applicationContext3, this));
                        return;
                    }
                    throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                } catch (ClassNotFoundException unused) {
                    throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
                } catch (IllegalAccessException unused2) {
                    throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
                } catch (InstantiationException unused3) {
                    throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
                }
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        throw r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b8.l c(android.content.Context r2) {
        /*
            java.lang.Object r0 = b8.l.f4107l
            monitor-enter(r0)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2a
            b8.l r1 = b8.l.f4105j     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            goto Lf
        La:
            r2 = move-exception
            goto L36
        Lc:
            b8.l r1 = b8.l.f4106k     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
        Lf:
            if (r1 != 0) goto L34
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r2 instanceof androidx.work.c     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            r1 = r2
            androidx.work.c r1 = (androidx.work.c) r1     // Catch: java.lang.Throwable -> L2a
            com.assetgro.stockgro.StockGroApplication r1 = (com.assetgro.stockgro.StockGroApplication) r1     // Catch: java.lang.Throwable -> L2a
            androidx.work.d r1 = r1.b()     // Catch: java.lang.Throwable -> L2a
            d(r2, r1)     // Catch: java.lang.Throwable -> L2a
            b8.l r1 = c(r2)     // Catch: java.lang.Throwable -> L2a
            goto L34
        L2a:
            r2 = move-exception
            goto L38
        L2c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return r1
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2     // Catch: java.lang.Throwable -> L2a
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.l.c(android.content.Context):b8.l");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (b8.l.f4106k != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        b8.l.f4106k = new b8.l(r4, r5, new h.c(r5.f2544b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        b8.l.f4105j = b8.l.f4106k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r4, androidx.work.d r5) {
        /*
            java.lang.Object r0 = b8.l.f4107l
            monitor-enter(r0)
            b8.l r1 = b8.l.f4105j     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            b8.l r2 = b8.l.f4106k     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L34
        L16:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            b8.l r1 = b8.l.f4106k     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L2e
            b8.l r1 = new b8.l     // Catch: java.lang.Throwable -> L14
            h.c r2 = new h.c     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ExecutorService r3 = r5.f2544b     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            b8.l.f4106k = r1     // Catch: java.lang.Throwable -> L14
        L2e:
            b8.l r4 = b8.l.f4106k     // Catch: java.lang.Throwable -> L14
            b8.l.f4105j = r4     // Catch: java.lang.Throwable -> L14
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.l.d(android.content.Context, androidx.work.d):void");
    }

    @Override // androidx.work.i0
    public final d0 b(UUID uuid) {
        j8.m n10 = this.f4110c.n();
        List<String> singletonList = Collections.singletonList(uuid.toString());
        n10.getClass();
        StringBuilder p10 = da.e.p("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = singletonList.size();
        al.d.N(size, p10);
        p10.append(")");
        t a10 = t.a(size, p10.toString());
        int i10 = 1;
        for (String str : singletonList) {
            if (str == null) {
                a10.c(i10);
            } else {
                a10.d(i10, str);
            }
            i10++;
        }
        l7.k kVar = ((s) n10.f21093a).f24163e;
        androidx.loader.content.g gVar = new androidx.loader.content.g(n10, a10);
        String[] d10 = kVar.d(new String[]{"WorkTag", "WorkProgress", "workspec"});
        for (String str2 : d10) {
            if (!kVar.f24128a.containsKey(str2.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
        }
        tr.e eVar = kVar.f24136i;
        eVar.getClass();
        v vVar = new v((s) eVar.f36362c, eVar, gVar, d10);
        hr.c cVar = new hr.c(this, 19);
        m8.a aVar = this.f4111d;
        Object obj = new Object();
        d0 d0Var = new d0();
        d0Var.a(vVar, new k8.g(aVar, obj, cVar, d0Var));
        return d0Var;
    }

    public final void e() {
        synchronized (f4107l) {
            try {
                this.f4115h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f4116i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f4116i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        ArrayList d10;
        Context context = this.f4108a;
        String str = e8.b.f15093e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d10 = e8.b.d(context, jobScheduler)) != null && !d10.isEmpty()) {
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                e8.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        j8.m n10 = this.f4110c.n();
        Object obj = n10.f21093a;
        s sVar = (s) obj;
        sVar.b();
        x xVar = (x) n10.f21101i;
        q7.g a10 = xVar.a();
        sVar.c();
        try {
            a10.f31822b.executeUpdateDelete();
            ((s) obj).h();
            sVar.f();
            xVar.c(a10);
            d.a(this.f4109b, this.f4110c, this.f4112e);
        } catch (Throwable th2) {
            sVar.f();
            xVar.c(a10);
            throw th2;
        }
    }

    public final void g(String str, h.c cVar) {
        ((h.c) this.f4111d).n(new z3.a(this, str, cVar, 7));
    }

    public final void h(String str) {
        ((h.c) this.f4111d).n(new k8.k(this, str, false));
    }
}
