package b8;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.g0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.q;
import androidx.work.r;
import androidx.work.s;
import androidx.work.t;
import androidx.work.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final String f4126t = u.C("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public Context f4127a;

    /* renamed from: b, reason: collision with root package name */
    public String f4128b;

    /* renamed from: c, reason: collision with root package name */
    public List f4129c;

    /* renamed from: d, reason: collision with root package name */
    public h.c f4130d;

    /* renamed from: e, reason: collision with root package name */
    public j8.k f4131e;

    /* renamed from: f, reason: collision with root package name */
    public ListenableWorker f4132f;

    /* renamed from: g, reason: collision with root package name */
    public m8.a f4133g;

    /* renamed from: h, reason: collision with root package name */
    public t f4134h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.work.d f4135i;

    /* renamed from: j, reason: collision with root package name */
    public i8.a f4136j;

    /* renamed from: k, reason: collision with root package name */
    public WorkDatabase f4137k;

    /* renamed from: l, reason: collision with root package name */
    public j8.m f4138l;

    /* renamed from: m, reason: collision with root package name */
    public j8.c f4139m;

    /* renamed from: n, reason: collision with root package name */
    public j8.c f4140n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4141o;

    /* renamed from: p, reason: collision with root package name */
    public String f4142p;

    /* renamed from: q, reason: collision with root package name */
    public l8.j f4143q;

    /* renamed from: r, reason: collision with root package name */
    public op.a f4144r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f4145s;

    public final void a(t tVar) {
        boolean z10 = tVar instanceof s;
        String str = f4126t;
        if (z10) {
            u.w().z(str, String.format("Worker result SUCCESS for %s", this.f4142p), new Throwable[0]);
            if (this.f4131e.c()) {
                e();
                return;
            }
            j8.c cVar = this.f4139m;
            String str2 = this.f4128b;
            j8.m mVar = this.f4138l;
            WorkDatabase workDatabase = this.f4137k;
            workDatabase.c();
            try {
                mVar.x(g0.f2567c, str2);
                mVar.v(str2, ((s) this.f4134h).f2635a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = cVar.a(str2).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (mVar.m(str3) == g0.f2569e && cVar.d(str3)) {
                        u.w().z(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                        mVar.x(g0.f2565a, str3);
                        mVar.w(currentTimeMillis, str3);
                    }
                }
                workDatabase.h();
                workDatabase.f();
                f(false);
                return;
            } catch (Throwable th2) {
                workDatabase.f();
                f(false);
                throw th2;
            }
        }
        if (tVar instanceof r) {
            u.w().z(str, String.format("Worker result RETRY for %s", this.f4142p), new Throwable[0]);
            d();
            return;
        }
        u.w().z(str, String.format("Worker result FAILURE for %s", this.f4142p), new Throwable[0]);
        if (this.f4131e.c()) {
            e();
        } else {
            h();
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            j8.m mVar = this.f4138l;
            if (mVar.m(str2) != g0.f2570f) {
                mVar.x(g0.f2568d, str2);
            }
            linkedList.addAll(this.f4139m.a(str2));
        }
    }

    public final void c() {
        boolean i10 = i();
        String str = this.f4128b;
        WorkDatabase workDatabase = this.f4137k;
        if (!i10) {
            workDatabase.c();
            try {
                g0 m10 = this.f4138l.m(str);
                workDatabase.m().h(str);
                if (m10 == null) {
                    f(false);
                } else if (m10 == g0.f2566b) {
                    a(this.f4134h);
                } else if (!m10.a()) {
                    d();
                }
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
        List list = this.f4129c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).c(str);
            }
            d.a(this.f4135i, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f4128b;
        j8.m mVar = this.f4138l;
        WorkDatabase workDatabase = this.f4137k;
        workDatabase.c();
        try {
            mVar.x(g0.f2565a, str);
            mVar.w(System.currentTimeMillis(), str);
            mVar.r(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f4128b;
        j8.m mVar = this.f4138l;
        WorkDatabase workDatabase = this.f4137k;
        workDatabase.c();
        try {
            mVar.w(System.currentTimeMillis(), str);
            mVar.x(g0.f2565a, str);
            mVar.u(str);
            mVar.r(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final void f(boolean z10) {
        ListenableWorker listenableWorker;
        this.f4137k.c();
        try {
            if (!this.f4137k.n().p()) {
                k8.h.a(this.f4127a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f4138l.x(g0.f2565a, this.f4128b);
                this.f4138l.r(-1L, this.f4128b);
            }
            if (this.f4131e != null && (listenableWorker = this.f4132f) != null && listenableWorker.isRunInForeground()) {
                i8.a aVar = this.f4136j;
                String str = this.f4128b;
                b bVar = (b) aVar;
                synchronized (bVar.f4084k) {
                    bVar.f4079f.remove(str);
                    bVar.h();
                }
            }
            this.f4137k.h();
            this.f4137k.f();
            this.f4143q.j(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f4137k.f();
            throw th2;
        }
    }

    public final void g() {
        j8.m mVar = this.f4138l;
        String str = this.f4128b;
        g0 m10 = mVar.m(str);
        g0 g0Var = g0.f2566b;
        String str2 = f4126t;
        if (m10 == g0Var) {
            u.w().u(str2, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new Throwable[0]);
            f(true);
        } else {
            u.w().u(str2, String.format("Status for %s is %s; not doing any work", str, m10), new Throwable[0]);
            f(false);
        }
    }

    public final void h() {
        String str = this.f4128b;
        WorkDatabase workDatabase = this.f4137k;
        workDatabase.c();
        try {
            b(str);
            this.f4138l.v(str, ((q) this.f4134h).f2634a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.f4145s) {
            return false;
        }
        u.w().u(f4126t, String.format("Work interrupted for %s", this.f4142p), new Throwable[0]);
        if (this.f4138l.m(this.f4128b) == null) {
            f(false);
        } else {
            f(!r0.a());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if (r0.f21084k > 0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Type inference failed for: r0v36, types: [l8.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.n.run():void");
    }
}
