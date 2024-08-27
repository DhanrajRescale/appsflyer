package su;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.UndeliveredElementException;
import qu.s2;
import ut.l;
import vu.a0;
import vu.z;

/* loaded from: classes2.dex */
public class c implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f34783c = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f34784d = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f34785e = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f34786f = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34787g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34788h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34789i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34790j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34791k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f34792a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f34793b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i10, Function1 function1) {
        long j10;
        this.f34792a = i10;
        this.f34793b = function1;
        if (i10 >= 0) {
            k kVar = e.f34795a;
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    j10 = i10;
                } else {
                    j10 = Long.MAX_VALUE;
                }
            } else {
                j10 = 0;
            }
            this.bufferEnd$volatile = j10;
            this.completedExpandBuffersAndPauseFlag$volatile = f34785e.get(this);
            k kVar2 = new k(0L, null, this, 3);
            this.sendSegment$volatile = kVar2;
            this.receiveSegment$volatile = kVar2;
            if (x()) {
                kVar2 = e.f34795a;
                Intrinsics.d(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = kVar2;
            this._closeCause$volatile = e.f34813s;
            return;
        }
        throw new IllegalArgumentException(jr.h.o("Invalid channel capacity: ", i10, ", should be >=0").toString());
    }

    public static boolean C(Object obj) {
        if (obj instanceof qu.h) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((qu.h) obj, Unit.f23355a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final k b(c cVar, long j10, k kVar) {
        Object a10;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        long j12;
        cVar.getClass();
        k kVar2 = e.f34795a;
        d dVar = d.f34794i;
        loop0: while (true) {
            a10 = vu.d.a(kVar, j10, dVar);
            if (!hl.f.w0(a10)) {
                z o02 = hl.f.o0(a10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34787g;
                    z zVar = (z) atomicReferenceFieldUpdater.get(cVar);
                    if (zVar.f38412c >= o02.f38412c) {
                        break loop0;
                    }
                    if (!o02.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, zVar, o02)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != zVar) {
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
        boolean w02 = hl.f.w0(a10);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f34784d;
        if (w02) {
            cVar.l();
            if (kVar.f38412c * e.f34796b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) hl.f.o0(a10);
        long j13 = kVar3.f38412c;
        if (j13 > j10) {
            long j14 = e.f34796b * j13;
            do {
                atomicLongFieldUpdater = f34783c;
                j11 = atomicLongFieldUpdater.get(cVar);
                j12 = 1152921504606846975L & j11;
                if (j12 >= j14) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j11, j12 + (((int) (j11 >> 60)) << 60)));
            if (j13 * e.f34796b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar3.a();
            return null;
        }
        return kVar3;
    }

    public static final void c(c cVar, Object obj, qu.i iVar) {
        UndeliveredElementException y10;
        Function1 function1 = cVar.f34793b;
        if (function1 != null && (y10 = el.l.y(function1, obj, null)) != null) {
            el.l.k0(iVar.f32216e, y10);
        }
        Throwable s7 = cVar.s();
        l.Companion companion = ut.l.INSTANCE;
        iVar.resumeWith(ut.n.a(s7));
    }

    public static final int d(c cVar, k kVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        cVar.getClass();
        kVar.m(i10, obj);
        if (z10) {
            return cVar.E(kVar, i10, obj, j10, obj2, z10);
        }
        Object k10 = kVar.k(i10);
        if (k10 == null) {
            if (cVar.e(j10)) {
                if (kVar.j(i10, null, e.f34798d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (k10 instanceof s2) {
            kVar.m(i10, null);
            if (cVar.B(k10, obj)) {
                kVar.n(i10, e.f34803i);
                return 0;
            }
            kp.g gVar = e.f34805k;
            if (kVar.f34819f.getAndSet((i10 * 2) + 1, gVar) != gVar) {
                kVar.l(i10, true);
            }
            return 5;
        }
        return cVar.E(kVar, i10, obj, j10, obj2, z10);
    }

    public static void u(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f34786f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0);
    }

    public final void A(s2 s2Var, boolean z10) {
        Throwable s7;
        if (s2Var instanceof qu.h) {
            yt.a aVar = (yt.a) s2Var;
            l.Companion companion = ut.l.INSTANCE;
            if (z10) {
                s7 = r();
            } else {
                s7 = s();
            }
            aVar.resumeWith(ut.n.a(s7));
            return;
        }
        if (s2Var instanceof b) {
            b bVar = (b) s2Var;
            qu.i iVar = bVar.f34781b;
            Intrinsics.c(iVar);
            bVar.f34781b = null;
            bVar.f34780a = e.f34806l;
            Throwable q10 = bVar.f34782c.q();
            if (q10 == null) {
                l.Companion companion2 = ut.l.INSTANCE;
                iVar.resumeWith(Boolean.FALSE);
                return;
            } else {
                l.Companion companion3 = ut.l.INSTANCE;
                iVar.resumeWith(ut.n.a(q10));
                return;
            }
        }
        throw new IllegalStateException(("Unexpected waiter: " + s2Var).toString());
    }

    public final boolean B(Object obj, Object obj2) {
        rb.f fVar = null;
        if (obj instanceof b) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            b bVar = (b) obj;
            qu.i iVar = bVar.f34781b;
            Intrinsics.c(iVar);
            bVar.f34781b = null;
            bVar.f34780a = obj2;
            Boolean bool = Boolean.TRUE;
            Function1 function1 = bVar.f34782c.f34793b;
            if (function1 != null) {
                fVar = el.l.v(function1, obj2, iVar.f32216e);
            }
            return e.a(iVar, bool, fVar);
        }
        if (obj instanceof qu.h) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            qu.h hVar = (qu.h) obj;
            Function1 function12 = this.f34793b;
            if (function12 != null) {
                fVar = el.l.v(function12, obj2, hVar.getContext());
            }
            return e.a(hVar, obj2, fVar);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object D(k kVar, int i10, long j10, Object obj) {
        Object k10 = kVar.k(i10);
        AtomicReferenceArray atomicReferenceArray = kVar.f34819f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f34783c;
        if (k10 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f34808n;
                }
                if (kVar.j(i10, k10, obj)) {
                    n();
                    return e.f34807m;
                }
            }
        } else if (k10 == e.f34798d && kVar.j(i10, k10, e.f34803i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            kVar.m(i10, null);
            return obj2;
        }
        while (true) {
            Object k11 = kVar.k(i10);
            if (k11 != null && k11 != e.f34799e) {
                if (k11 == e.f34798d) {
                    if (kVar.j(i10, k11, e.f34803i)) {
                        n();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        kVar.m(i10, null);
                        return obj3;
                    }
                } else {
                    kp.g gVar = e.f34804j;
                    if (k11 == gVar) {
                        return e.f34809o;
                    }
                    if (k11 == e.f34802h) {
                        return e.f34809o;
                    }
                    if (k11 == e.f34806l) {
                        n();
                        return e.f34809o;
                    }
                    if (k11 != e.f34801g && kVar.j(i10, k11, e.f34800f)) {
                        boolean z10 = k11 instanceof q;
                        if (z10) {
                            k11 = ((q) k11).f34822a;
                        }
                        if (C(k11)) {
                            kVar.n(i10, e.f34803i);
                            n();
                            Object obj4 = atomicReferenceArray.get(i10 * 2);
                            kVar.m(i10, null);
                            return obj4;
                        }
                        kVar.n(i10, gVar);
                        kVar.l(i10, false);
                        if (z10) {
                            n();
                        }
                        return e.f34809o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (kVar.j(i10, k11, e.f34802h)) {
                    n();
                    return e.f34809o;
                }
            } else {
                if (obj == null) {
                    return e.f34808n;
                }
                if (kVar.j(i10, k11, obj)) {
                    n();
                    return e.f34807m;
                }
            }
        }
    }

    public final int E(k kVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object k10 = kVar.k(i10);
            if (k10 == null) {
                if (e(j10) && !z10) {
                    if (kVar.j(i10, null, e.f34798d)) {
                        return 1;
                    }
                } else if (z10) {
                    if (kVar.j(i10, null, e.f34804j)) {
                        kVar.l(i10, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (kVar.j(i10, null, obj2)) {
                        return 2;
                    }
                }
            } else if (k10 == e.f34799e) {
                if (kVar.j(i10, k10, e.f34798d)) {
                    return 1;
                }
            } else {
                kp.g gVar = e.f34805k;
                if (k10 == gVar) {
                    kVar.m(i10, null);
                    return 5;
                }
                if (k10 == e.f34802h) {
                    kVar.m(i10, null);
                    return 5;
                }
                if (k10 == e.f34806l) {
                    kVar.m(i10, null);
                    l();
                    return 4;
                }
                kVar.m(i10, null);
                if (k10 instanceof q) {
                    k10 = ((q) k10).f34822a;
                }
                if (B(k10, obj)) {
                    kVar.n(i10, e.f34803i);
                    return 0;
                }
                if (kVar.f34819f.getAndSet((i10 * 2) + 1, gVar) != gVar) {
                    kVar.l(i10, true);
                }
                return 5;
            }
        }
    }

    public final void F(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        boolean z10;
        long j12;
        if (x()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f34785e;
        } while (atomicLongFieldUpdater.get(this) <= j10);
        int i10 = e.f34797c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f34786f;
            if (i11 < i10) {
                long j13 = atomicLongFieldUpdater.get(this);
                if (j13 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j13 == atomicLongFieldUpdater.get(this)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                do {
                    j11 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, 4611686018427387904L + (j11 & 4611686018427387903L)));
                while (true) {
                    long j14 = atomicLongFieldUpdater.get(this);
                    long j15 = atomicLongFieldUpdater2.get(this);
                    long j16 = j15 & 4611686018427387903L;
                    if ((j15 & 4611686018427387904L) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j14 == j16 && j14 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z10) {
                        atomicLongFieldUpdater2.compareAndSet(this, j15, j16 + 4611686018427387904L);
                    }
                }
                do {
                    j12 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, j12 & 4611686018427387903L));
                return;
            }
        }
    }

    @Override // su.o
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean e(long j10) {
        if (j10 >= f34785e.get(this) && j10 >= f34784d.get(this) + this.f34792a) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [qu.i] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [su.c, java.lang.Object] */
    @Override // su.o
    public final Object f(au.i frame) {
        k kVar;
        ?? r10;
        Object D;
        qu.i iVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34788h;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f34783c;
            if (!v(atomicLongFieldUpdater.get(this), true)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f34784d;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
                long j10 = e.f34796b;
                long j11 = andIncrement / j10;
                int i10 = (int) (andIncrement % j10);
                if (kVar2.f38412c != j11) {
                    k p10 = p(j11, kVar2);
                    if (p10 == null) {
                        continue;
                    } else {
                        kVar = p10;
                    }
                } else {
                    kVar = kVar2;
                }
                Object D2 = D(kVar, i10, andIncrement, null);
                kp.g gVar = e.f34807m;
                if (D2 != gVar) {
                    kp.g gVar2 = e.f34809o;
                    if (D2 == gVar2) {
                        if (andIncrement < t()) {
                            kVar.a();
                        }
                        kVar2 = kVar;
                    } else {
                        if (D2 == e.f34808n) {
                            qu.i A = yk.g.A(zt.f.b(frame));
                            kp.g gVar3 = gVar;
                            try {
                                D = D(kVar, i10, andIncrement, A);
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = A;
                            }
                            try {
                                if (D == gVar3) {
                                    iVar = A;
                                    iVar.a(kVar, i10);
                                } else {
                                    iVar = A;
                                    rb.f fVar = null;
                                    Function1 function1 = this.f34793b;
                                    CoroutineContext coroutineContext = iVar.f32216e;
                                    if (D == gVar2) {
                                        if (andIncrement < t()) {
                                            kVar.a();
                                        }
                                        k kVar3 = (k) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            if (v(atomicLongFieldUpdater.get(this), true)) {
                                                l.Companion companion = ut.l.INSTANCE;
                                                iVar.resumeWith(ut.n.a(r()));
                                                break;
                                            }
                                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                            long j12 = e.f34796b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j13 = andIncrement2 / j12;
                                            int i11 = (int) (andIncrement2 % j12);
                                            if (kVar3.f38412c != j13) {
                                                k p11 = p(j13, kVar3);
                                                if (p11 == null) {
                                                    continue;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                } else {
                                                    kVar3 = p11;
                                                }
                                            }
                                            CoroutineContext coroutineContext2 = coroutineContext;
                                            Function1 function12 = function1;
                                            D = D(kVar3, i11, andIncrement2, iVar);
                                            if (D == e.f34807m) {
                                                iVar.a(kVar3, i11);
                                                break;
                                            }
                                            if (D == e.f34809o) {
                                                if (andIncrement2 < t()) {
                                                    kVar3.a();
                                                }
                                                coroutineContext = coroutineContext2;
                                                function1 = function12;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                            } else if (D != e.f34808n) {
                                                kVar3.a();
                                                if (function12 != null) {
                                                    fVar = el.l.v(function12, D, coroutineContext2);
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                        }
                                    } else {
                                        kVar.a();
                                        if (function1 != null) {
                                            fVar = el.l.v(function1, D, coroutineContext);
                                        }
                                    }
                                    iVar.m(fVar, D);
                                }
                                D2 = iVar.p();
                                if (D2 == zt.a.f42823a) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r10 = gVar3;
                                r10.z();
                                throw th;
                            }
                        } else {
                            kVar.a();
                        }
                        return D2;
                    }
                } else {
                    throw new IllegalStateException("unexpected".toString());
                }
            } else {
                Throwable r11 = r();
                int i12 = a0.f38355a;
                throw r11;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3 = su.e.f34813s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = su.c.f34790j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r4.compareAndSet(r13, r3, r14) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r4.get(r13) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r15 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r9.compareAndSet(r13, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r11 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r14 = su.c.f34791k;
        r15 = r14.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r15 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = su.e.f34811q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r14.compareAndSet(r13, r15, r0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r15 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r14.get(r13) == r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r15 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        zq.f.z(1, r15);
        ((kotlin.jvm.functions.Function1) r15).invoke(q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r0 = su.e.f34812r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r5 = r9.get(r13);
        r14 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r14 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r14 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        if (r9.compareAndSet(r13, r5, (r3 << 60) + r14) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0061, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002e, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r7 = su.e.f34795a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r9.compareAndSet(r13, r5, (1 << 60) + (r5 & 1152921504606846975L)) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Throwable r14, boolean r15) {
        /*
            r13 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = su.c.f34783c
            r10 = 1
            if (r15 == 0) goto L24
        Lc:
            long r5 = r9.get(r13)
            long r3 = r5 >> r0
            int r3 = (int) r3
            if (r3 != 0) goto L24
            long r3 = r5 & r1
            su.k r7 = su.e.f34795a
            long r7 = (long) r10
            long r7 = r7 << r0
            long r7 = r7 + r3
            r3 = r9
            r4 = r13
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto Lc
        L24:
            kp.g r3 = su.e.f34813s
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = su.c.f34790j
            boolean r5 = r4.compareAndSet(r13, r3, r14)
            if (r5 == 0) goto L30
            r11 = r10
            goto L38
        L30:
            java.lang.Object r4 = r4.get(r13)
            if (r4 == r3) goto L26
            r14 = 0
            r11 = r14
        L38:
            r12 = 3
            if (r15 == 0) goto L4e
        L3b:
            long r5 = r9.get(r13)
            long r14 = r5 & r1
            long r3 = (long) r12
            long r3 = r3 << r0
            long r7 = r3 + r14
            r3 = r9
            r4 = r13
            boolean r14 = r3.compareAndSet(r4, r5, r7)
            if (r14 == 0) goto L3b
            goto L6e
        L4e:
            long r5 = r9.get(r13)
            long r14 = r5 >> r0
            int r14 = (int) r14
            if (r14 == 0) goto L61
            if (r14 == r10) goto L5a
            goto L6e
        L5a:
            long r14 = r5 & r1
            long r3 = (long) r12
        L5d:
            long r3 = r3 << r0
            long r3 = r3 + r14
            r7 = r3
            goto L66
        L61:
            long r14 = r5 & r1
            r3 = 2
            long r3 = (long) r3
            goto L5d
        L66:
            r3 = r9
            r4 = r13
            boolean r14 = r3.compareAndSet(r4, r5, r7)
            if (r14 == 0) goto L4e
        L6e:
            r13.l()
            if (r11 == 0) goto L9d
        L73:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = su.c.f34791k
            java.lang.Object r15 = r14.get(r13)
            if (r15 != 0) goto L7e
            kp.g r0 = su.e.f34811q
            goto L80
        L7e:
            kp.g r0 = su.e.f34812r
        L80:
            boolean r1 = r14.compareAndSet(r13, r15, r0)
            if (r1 == 0) goto L96
            if (r15 != 0) goto L89
            goto L9d
        L89:
            zq.f.z(r10, r15)
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            java.lang.Throwable r14 = r13.q()
            r15.invoke(r14)
            goto L9d
        L96:
            java.lang.Object r1 = r14.get(r13)
            if (r1 == r15) goto L80
            goto L73
        L9d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: su.c.g(java.lang.Throwable, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e5, code lost:
    
        return kotlin.Unit.f23355a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        c(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ef, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c8, code lost:
    
        r2.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0137, code lost:
    
        if (r18 >= r5.get(r26)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0139, code lost:
    
        r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013c, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [qu.i] */
    @Override // su.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.lang.Object r27, yt.a r28) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.c.h(java.lang.Object, yt.a):java.lang.Object");
    }

    @Override // su.o
    public final Object i() {
        s2 s2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f34784d;
        long j10 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f34783c;
        long j11 = atomicLongFieldUpdater2.get(this);
        if (v(j11, true)) {
            return new h(q());
        }
        long j12 = j11 & 1152921504606846975L;
        Object obj = j.f34817a;
        if (j10 >= j12) {
            return obj;
        }
        Object obj2 = e.f34805k;
        k kVar = (k) f34788h.get(this);
        while (!v(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = e.f34796b;
            long j14 = andIncrement / j13;
            int i10 = (int) (andIncrement % j13);
            if (kVar.f38412c != j14) {
                k p10 = p(j14, kVar);
                if (p10 == null) {
                    continue;
                } else {
                    kVar = p10;
                }
            }
            Object D = D(kVar, i10, andIncrement, obj2);
            if (D == e.f34807m) {
                if (obj2 instanceof s2) {
                    s2Var = (s2) obj2;
                } else {
                    s2Var = null;
                }
                if (s2Var != null) {
                    s2Var.a(kVar, i10);
                }
                F(andIncrement);
                kVar.h();
            } else if (D == e.f34809o) {
                if (andIncrement < t()) {
                    kVar.a();
                }
            } else if (D != e.f34808n) {
                kVar.a();
                obj = D;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
            return obj;
        }
        return new h(q());
    }

    @Override // su.o
    public final b iterator() {
        return new b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        r1 = (su.k) ((vu.e) vu.e.f38363b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.k j(long r13) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.c.j(long):su.k");
    }

    @Override // su.p
    public final boolean k(Throwable th2) {
        return g(th2, false);
    }

    public final void l() {
        v(f34783c.get(this), false);
    }

    public final void m(long j10) {
        UndeliveredElementException y10;
        k kVar = (k) f34788h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f34784d;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f34792a + j11, f34785e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                long j12 = e.f34796b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (kVar.f38412c != j13) {
                    k p10 = p(j13, kVar);
                    if (p10 == null) {
                        continue;
                    } else {
                        kVar = p10;
                    }
                }
                Object D = D(kVar, i10, j11, null);
                if (D == e.f34809o) {
                    if (j11 < t()) {
                        kVar.a();
                    }
                } else {
                    kVar.a();
                    Function1 function1 = this.f34793b;
                    if (function1 != null && (y10 = el.l.y(function1, D, null)) != null) {
                        throw y10;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00c4, code lost:
    
        if ((r0.addAndGet(r16, r14 - r9) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00cd, code lost:
    
        if ((r0.get(r16) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.c.n():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return kotlin.Unit.f23355a;
     */
    @Override // su.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.c.o(java.lang.Object):java.lang.Object");
    }

    public final k p(long j10, k kVar) {
        Object a10;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        k kVar2 = e.f34795a;
        d dVar = d.f34794i;
        loop0: while (true) {
            a10 = vu.d.a(kVar, j10, dVar);
            if (!hl.f.w0(a10)) {
                z o02 = hl.f.o0(a10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34788h;
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
        if (hl.f.w0(a10)) {
            l();
            if (kVar.f38412c * e.f34796b >= t()) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) hl.f.o0(a10);
        boolean x10 = x();
        long j12 = kVar3.f38412c;
        if (!x10 && j10 <= f34785e.get(this) / e.f34796b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f34789i;
                z zVar2 = (z) atomicReferenceFieldUpdater2.get(this);
                if (zVar2.f38412c >= j12) {
                    break;
                }
                if (!kVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, zVar2, kVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != zVar2) {
                        if (kVar3.e()) {
                            kVar3.d();
                        }
                    }
                }
                if (zVar2.e()) {
                    zVar2.d();
                }
            }
        }
        if (j12 > j10) {
            long j13 = e.f34796b * j12;
            do {
                atomicLongFieldUpdater = f34784d;
                j11 = atomicLongFieldUpdater.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j13));
            if (j12 * e.f34796b >= t()) {
                return null;
            }
            kVar3.a();
            return null;
        }
        return kVar3;
    }

    public final Throwable q() {
        return (Throwable) f34790j.get(this);
    }

    public final Throwable r() {
        Throwable q10 = q();
        if (q10 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return q10;
    }

    public final Throwable s() {
        Throwable q10 = q();
        if (q10 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return q10;
    }

    public final long t() {
        return f34783c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0194, code lost:
    
        r3 = (su.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019b, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.c.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (su.k) ((vu.e) vu.e.f38363b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.c.v(long, boolean):boolean");
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long j10 = f34785e.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(long r5, su.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f38412c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            vu.e r0 = r7.b()
            su.k r0 = (su.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            vu.e r5 = r7.b()
            su.k r5 = (su.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = su.c.f34789i
            java.lang.Object r6 = r5.get(r4)
            vu.z r6 = (vu.z) r6
            long r0 = r6.f38412c
            long r2 = r7.f38412c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: su.c.y(long, su.k):void");
    }

    public final Object z(Object obj, yt.a frame) {
        UndeliveredElementException y10;
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        Function1 function1 = this.f34793b;
        if (function1 != null && (y10 = el.l.y(function1, obj, null)) != null) {
            ut.c.a(y10, s());
            l.Companion companion = ut.l.INSTANCE;
            iVar.resumeWith(ut.n.a(y10));
        } else {
            Throwable s7 = s();
            l.Companion companion2 = ut.l.INSTANCE;
            iVar.resumeWith(ut.n.a(s7));
        }
        Object p10 = iVar.p();
        zt.a aVar = zt.a.f42823a;
        if (p10 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (p10 == aVar) {
            return p10;
        }
        return Unit.f23355a;
    }
}
