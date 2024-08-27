package vu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38362a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38363b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public e(e eVar) {
        this._prev$volatile = eVar;
    }

    public final void a() {
        f38363b.set(this, null);
    }

    public final e b() {
        Object obj = f38362a.get(this);
        if (obj == d.f38360a) {
            return null;
        }
        return (e) obj;
    }

    public abstract boolean c();

    public final void d() {
        e eVar;
        e b10;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38363b;
            e eVar2 = (e) atomicReferenceFieldUpdater.get(this);
            while (eVar2 != null && eVar2.c()) {
                eVar2 = (e) atomicReferenceFieldUpdater.get(eVar2);
            }
            e b11 = b();
            Intrinsics.c(b11);
            while (b11.c() && (b10 = b11.b()) != null) {
                b11 = b10;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b11);
                if (((e) obj) == null) {
                    eVar = null;
                } else {
                    eVar = eVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b11, obj, eVar)) {
                    if (atomicReferenceFieldUpdater.get(b11) != obj) {
                        break;
                    }
                }
            }
            if (eVar2 != null) {
                f38362a.set(eVar2, b11);
            }
            if (!b11.c() || b11.b() == null) {
                if (eVar2 == null || !eVar2.c()) {
                    return;
                }
            }
        }
    }
}
