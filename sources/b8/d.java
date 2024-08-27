package b8;

import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4085a = u.C("Schedulers");

    public static void a(androidx.work.d dVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            j8.m n10 = workDatabase.n();
            workDatabase.c();
            try {
                ArrayList h10 = n10.h(dVar.f2550h);
                ArrayList g10 = n10.g();
                if (h10.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = h10.iterator();
                    while (it.hasNext()) {
                        n10.r(currentTimeMillis, ((j8.k) it.next()).f21074a);
                    }
                }
                workDatabase.h();
                workDatabase.f();
                if (h10.size() > 0) {
                    j8.k[] kVarArr = (j8.k[]) h10.toArray(new j8.k[h10.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c cVar = (c) it2.next();
                        if (cVar.a()) {
                            cVar.f(kVarArr);
                        }
                    }
                }
                if (g10.size() > 0) {
                    j8.k[] kVarArr2 = (j8.k[]) g10.toArray(new j8.k[g10.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c cVar2 = (c) it3.next();
                        if (!cVar2.a()) {
                            cVar2.f(kVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
    }
}
