package k8;

import androidx.work.b0;
import androidx.work.g0;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import androidx.work.y;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final tr.e f22661a = new tr.e(26);

    public static void a(b8.l lVar, String str) {
        WorkDatabase workDatabase = lVar.f4110c;
        j8.m n10 = workDatabase.n();
        j8.c i10 = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            g0 m10 = n10.m(str2);
            if (m10 != g0.f2567c && m10 != g0.f2568d) {
                n10.x(g0.f2570f, str2);
            }
            linkedList.addAll(i10.a(str2));
        }
        b8.b bVar = lVar.f4113f;
        synchronized (bVar.f4084k) {
            try {
                boolean z10 = false;
                u.w().u(b8.b.f4073l, String.format("Processor cancelling %s", str), new Throwable[0]);
                bVar.f4082i.add(str);
                b8.n nVar = (b8.n) bVar.f4079f.remove(str);
                if (nVar != null) {
                    z10 = true;
                }
                if (nVar == null) {
                    nVar = (b8.n) bVar.f4080g.remove(str);
                }
                b8.b.c(str, nVar);
                if (z10) {
                    bVar.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = lVar.f4112e.iterator();
        while (it.hasNext()) {
            ((b8.c) it.next()).c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        tr.e eVar = this.f22661a;
        try {
            b();
            eVar.D(b0.K);
        } catch (Throwable th2) {
            eVar.D(new y(th2));
        }
    }
}
