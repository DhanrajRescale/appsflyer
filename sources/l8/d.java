package l8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24213b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24214c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24215d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24216e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24217f;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f24213b = atomicReferenceFieldUpdater;
        this.f24214c = atomicReferenceFieldUpdater2;
        this.f24215d = atomicReferenceFieldUpdater3;
        this.f24216e = atomicReferenceFieldUpdater4;
        this.f24217f = atomicReferenceFieldUpdater5;
    }

    @Override // bl.j
    public final void U(g gVar, g gVar2) {
        this.f24214c.lazySet(gVar, gVar2);
    }

    @Override // bl.j
    public final void W(g gVar, Thread thread) {
        this.f24213b.lazySet(gVar, thread);
    }

    @Override // bl.j
    public final boolean q(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24216e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // bl.j
    public final boolean s(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24217f;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // bl.j
    public final boolean u(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24215d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
