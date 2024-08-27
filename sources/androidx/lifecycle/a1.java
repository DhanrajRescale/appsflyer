package androidx.lifecycle;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final z4.c f1878a = new z4.c();

    public final void a(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        z4.c cVar = this.f1878a;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(closeable, "closeable");
            if (cVar.f42012d) {
                z4.c.a(closeable);
                return;
            }
            synchronized (cVar.f42009a) {
                autoCloseable = (AutoCloseable) cVar.f42010b.put(key, closeable);
            }
            z4.c.a(autoCloseable);
        }
    }

    public final void b() {
        z4.c cVar = this.f1878a;
        if (cVar != null && !cVar.f42012d) {
            cVar.f42012d = true;
            synchronized (cVar.f42009a) {
                try {
                    Iterator it = cVar.f42010b.values().iterator();
                    while (it.hasNext()) {
                        z4.c.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = cVar.f42011c.iterator();
                    while (it2.hasNext()) {
                        z4.c.a((AutoCloseable) it2.next());
                    }
                    cVar.f42011c.clear();
                    Unit unit = Unit.f23355a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String key) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        z4.c cVar = this.f1878a;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (cVar.f42009a) {
                autoCloseable = (AutoCloseable) cVar.f42010b.get(key);
            }
            return autoCloseable;
        }
        return null;
    }

    public void d() {
    }
}
