package c8;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.d;
import androidx.work.e;
import androidx.work.g0;
import androidx.work.u;
import b8.c;
import b8.l;
import j8.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k8.i;
import m.j;

/* loaded from: classes.dex */
public final class b implements c, f8.b, b8.a {

    /* renamed from: i, reason: collision with root package name */
    public static final String f8053i = u.C("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f8054a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8055b;

    /* renamed from: c, reason: collision with root package name */
    public final f8.c f8056c;

    /* renamed from: e, reason: collision with root package name */
    public final a f8058e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8059f;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f8061h;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f8057d = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final Object f8060g = new Object();

    public b(Context context, d dVar, h.c cVar, l lVar) {
        this.f8054a = context;
        this.f8055b = lVar;
        this.f8056c = new f8.c(context, cVar, this);
        this.f8058e = new a(this, dVar.f2547e);
    }

    @Override // b8.c
    public final boolean a() {
        return false;
    }

    @Override // b8.a
    public final void b(String str, boolean z10) {
        synchronized (this.f8060g) {
            try {
                Iterator it = this.f8057d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    k kVar = (k) it.next();
                    if (kVar.f21074a.equals(str)) {
                        u.w().u(f8053i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f8057d.remove(kVar);
                        this.f8056c.b(this.f8057d);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b8.c
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.f8061h;
        l lVar = this.f8055b;
        if (bool == null) {
            this.f8061h = Boolean.valueOf(i.a(this.f8054a, lVar.f4109b));
        }
        boolean booleanValue = this.f8061h.booleanValue();
        String str2 = f8053i;
        if (!booleanValue) {
            u.w().z(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f8059f) {
            lVar.f4113f.a(this);
            this.f8059f = true;
        }
        u.w().u(str2, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f8058e;
        if (aVar != null && (runnable = (Runnable) aVar.f8052c.remove(str)) != null) {
            ((Handler) aVar.f8051b.f14641b).removeCallbacks(runnable);
        }
        lVar.h(str);
    }

    @Override // f8.b
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            u.w().u(f8053i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f8055b.h(str);
        }
    }

    @Override // f8.b
    public final void e(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            u.w().u(f8053i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f8055b.g(str, null);
        }
    }

    @Override // b8.c
    public final void f(k... kVarArr) {
        if (this.f8061h == null) {
            this.f8061h = Boolean.valueOf(i.a(this.f8054a, this.f8055b.f4109b));
        }
        if (!this.f8061h.booleanValue()) {
            u.w().z(f8053i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f8059f) {
            this.f8055b.f4113f.a(this);
            this.f8059f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (k kVar : kVarArr) {
            long a10 = kVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (kVar.f21075b == g0.f2565a) {
                if (currentTimeMillis < a10) {
                    a aVar = this.f8058e;
                    if (aVar != null) {
                        HashMap hashMap = aVar.f8052c;
                        Runnable runnable = (Runnable) hashMap.remove(kVar.f21074a);
                        e.l lVar = aVar.f8051b;
                        if (runnable != null) {
                            ((Handler) lVar.f14641b).removeCallbacks(runnable);
                        }
                        j jVar = new j(9, aVar, kVar);
                        hashMap.put(kVar.f21074a, jVar);
                        ((Handler) lVar.f14641b).postDelayed(jVar, kVar.a() - System.currentTimeMillis());
                    }
                } else if (kVar.b()) {
                    e eVar = kVar.f21083j;
                    if (eVar.f2554c) {
                        u.w().u(f8053i, String.format("Ignoring WorkSpec %s, Requires device idle.", kVar), new Throwable[0]);
                    } else if (eVar.f2559h.f2564a.size() > 0) {
                        u.w().u(f8053i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", kVar), new Throwable[0]);
                    } else {
                        hashSet.add(kVar);
                        hashSet2.add(kVar.f21074a);
                    }
                } else {
                    u.w().u(f8053i, String.format("Starting work for %s", kVar.f21074a), new Throwable[0]);
                    this.f8055b.g(kVar.f21074a, null);
                }
            }
        }
        synchronized (this.f8060g) {
            try {
                if (!hashSet.isEmpty()) {
                    u.w().u(f8053i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f8057d.addAll(hashSet);
                    this.f8056c.b(this.f8057d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
