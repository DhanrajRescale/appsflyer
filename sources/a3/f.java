package a3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f144b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f145c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f146d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f147e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f148f;

    public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f144b = atomicReferenceFieldUpdater;
        this.f145c = atomicReferenceFieldUpdater2;
        this.f146d = atomicReferenceFieldUpdater3;
        this.f147e = atomicReferenceFieldUpdater4;
        this.f148f = atomicReferenceFieldUpdater5;
    }

    @Override // bl.j
    public final void T(h hVar, h hVar2) {
        this.f145c.lazySet(hVar, hVar2);
    }

    @Override // bl.j
    public final void V(h hVar, Thread thread) {
        this.f144b.lazySet(hVar, thread);
    }

    @Override // bl.j
    public final boolean p(i iVar, e eVar, e eVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f147e;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, eVar, eVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == eVar);
        return false;
    }

    @Override // bl.j
    public final boolean r(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f148f;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // bl.j
    public final boolean t(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f146d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }
}
