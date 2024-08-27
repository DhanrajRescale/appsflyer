package yu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import qu.s2;
import vu.z;

/* loaded from: classes2.dex */
public class i implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41829c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f41830d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41831e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f41832f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41833g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f41834a;

    /* renamed from: b, reason: collision with root package name */
    public final qg.a f41835b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i(int i10, int i11) {
        this.f41834a = i10;
        if (i10 > 0) {
            if (i11 >= 0 && i11 <= i10) {
                k kVar = new k(0L, null, 2);
                this.head$volatile = kVar;
                this.tail$volatile = kVar;
                this._availablePermits$volatile = i10 - i11;
                this.f41835b = new qg.a(this, 27);
                return;
            }
            throw new IllegalArgumentException(jr.h.n("The number of acquired permits should be in 0..", i10).toString());
        }
        throw new IllegalArgumentException(jr.h.n("Semaphore should have at least 1 permit, but had ", i10).toString());
    }

    public final boolean c(s2 s2Var) {
        Object a10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41831e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f41832f.getAndIncrement(this);
        g gVar = g.f41827i;
        long j10 = andIncrement / j.f41841f;
        loop0: while (true) {
            a10 = vu.d.a(kVar, j10, gVar);
            if (!hl.f.w0(a10)) {
                z o02 = hl.f.o0(a10);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f38412c >= o02.f38412c) {
                        break loop0;
                    }
                    if (!o02.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, zVar, o02)) {
                        if (atomicReferenceFieldUpdater.get(this) != zVar) {
                            if (o02.e()) {
                                o02.d();
                            }
                        }
                    }
                    if (zVar.e()) {
                        zVar.d();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) hl.f.o0(a10);
        int i10 = (int) (andIncrement % j.f41841f);
        AtomicReferenceArray atomicReferenceArray = kVar2.f41842e;
        while (!atomicReferenceArray.compareAndSet(i10, null, s2Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                kp.g gVar2 = j.f41837b;
                kp.g gVar3 = j.f41838c;
                while (!atomicReferenceArray.compareAndSet(i10, gVar2, gVar3)) {
                    if (atomicReferenceArray.get(i10) != gVar2) {
                        return false;
                    }
                }
                ((qu.h) s2Var).m(this.f41835b, Unit.f23355a);
                return true;
            }
        }
        s2Var.a(kVar2, i10);
        return true;
    }

    public final void d() {
        int i10;
        Object a10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f41833g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f41834a;
            if (andIncrement < i11) {
                if (andIncrement >= 0) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41829c;
                k kVar = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f41830d.getAndIncrement(this);
                long j10 = andIncrement2 / j.f41841f;
                h hVar = h.f41828i;
                while (true) {
                    a10 = vu.d.a(kVar, j10, hVar);
                    if (hl.f.w0(a10)) {
                        break;
                    }
                    z o02 = hl.f.o0(a10);
                    while (true) {
                        z zVar = (z) atomicReferenceFieldUpdater.get(this);
                        if (zVar.f38412c >= o02.f38412c) {
                            break;
                        }
                        if (!o02.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, zVar, o02)) {
                            if (atomicReferenceFieldUpdater.get(this) != zVar) {
                                if (o02.e()) {
                                    o02.d();
                                }
                            }
                        }
                        if (zVar.e()) {
                            zVar.d();
                        }
                    }
                }
                k kVar2 = (k) hl.f.o0(a10);
                kVar2.a();
                if (kVar2.f38412c <= j10) {
                    int i12 = (int) (andIncrement2 % j.f41841f);
                    kp.g gVar = j.f41837b;
                    AtomicReferenceArray atomicReferenceArray = kVar2.f41842e;
                    Object andSet = atomicReferenceArray.getAndSet(i12, gVar);
                    if (andSet == null) {
                        int i13 = j.f41836a;
                        boolean z10 = false;
                        for (int i14 = 0; i14 < i13; i14++) {
                            if (atomicReferenceArray.get(i12) == j.f41838c) {
                                return;
                            }
                        }
                        kp.g gVar2 = j.f41837b;
                        kp.g gVar3 = j.f41839d;
                        while (true) {
                            if (atomicReferenceArray.compareAndSet(i12, gVar2, gVar3)) {
                                z10 = true;
                                break;
                            } else if (atomicReferenceArray.get(i12) != gVar2) {
                                break;
                            }
                        }
                        if (!z10) {
                            return;
                        }
                    } else if (andSet == j.f41840e) {
                        continue;
                    } else if (andSet instanceof qu.h) {
                        qu.h hVar2 = (qu.h) andSet;
                        kp.g e10 = hVar2.e(Unit.f23355a, this.f41835b);
                        if (e10 != null) {
                            hVar2.E(e10);
                            return;
                        }
                    } else {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                }
            } else {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
        }
    }
}
