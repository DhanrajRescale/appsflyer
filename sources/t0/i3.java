package t0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f35058a = new AtomicReference(b1.i.f3086a);

    /* renamed from: b, reason: collision with root package name */
    public final Object f35059b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Object f35060c;

    public final Object a() {
        long id2 = Thread.currentThread().getId();
        if (id2 == c.f34956a) {
            return this.f35060c;
        }
        b1.h hVar = (b1.h) this.f35058a.get();
        int a10 = hVar.a(id2);
        if (a10 >= 0) {
            return hVar.f3085c[a10];
        }
        return null;
    }

    public final void b(Object obj) {
        long id2 = Thread.currentThread().getId();
        if (id2 == c.f34956a) {
            this.f35060c = obj;
            return;
        }
        synchronized (this.f35059b) {
            b1.h hVar = (b1.h) this.f35058a.get();
            int a10 = hVar.a(id2);
            if (a10 < 0) {
                this.f35058a.set(hVar.b(id2, obj));
                Unit unit = Unit.f23355a;
            } else {
                hVar.f3085c[a10] = obj;
            }
        }
    }
}
