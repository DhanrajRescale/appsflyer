package k8;

import androidx.work.g0;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f22682d = u.C("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final b8.l f22683a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22684b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22685c;

    public k(b8.l lVar, String str, boolean z10) {
        this.f22683a = lVar;
        this.f22684b = str;
        this.f22685c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean j10;
        b8.l lVar = this.f22683a;
        WorkDatabase workDatabase = lVar.f4110c;
        b8.b bVar = lVar.f4113f;
        j8.m n10 = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f22684b;
            synchronized (bVar.f4084k) {
                containsKey = bVar.f4079f.containsKey(str);
            }
            if (this.f22685c) {
                j10 = this.f22683a.f4113f.i(this.f22684b);
            } else {
                if (!containsKey && n10.m(this.f22684b) == g0.f2566b) {
                    n10.x(g0.f2565a, this.f22684b);
                }
                j10 = this.f22683a.f4113f.j(this.f22684b);
            }
            u.w().u(f22682d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f22684b, Boolean.valueOf(j10)), new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
