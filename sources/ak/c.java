package ak;

import h.q0;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f449a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f450b;

    /* renamed from: c, reason: collision with root package name */
    public final ReferenceQueue f451c;

    /* renamed from: d, reason: collision with root package name */
    public y f452d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new Object());
        this.f450b = new HashMap();
        this.f451c = new ReferenceQueue();
        this.f449a = false;
        newSingleThreadExecutor.execute(new q0(this, 20));
    }

    public final synchronized void a(xj.g gVar, z zVar) {
        b bVar = (b) this.f450b.put(gVar, new b(gVar, zVar, this.f451c, this.f449a));
        if (bVar != null) {
            bVar.f448c = null;
            bVar.clear();
        }
    }

    public final void b(b bVar) {
        e0 e0Var;
        synchronized (this) {
            this.f450b.remove(bVar.f446a);
            if (bVar.f447b && (e0Var = bVar.f448c) != null) {
                ((r) this.f452d).e(bVar.f446a, new z(e0Var, true, false, bVar.f446a, this.f452d));
            }
        }
    }
}
