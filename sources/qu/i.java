package qu;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class i extends p0 implements h, au.d, s2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32212f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32213g = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32214h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final yt.a f32215d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f32216e;

    public i(int i10, yt.a aVar) {
        super(i10);
        this.f32215d = aVar;
        this.f32216e = aVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f32182a;
    }

    public static Object B(f2 f2Var, Object obj, int i10, Function1 function1) {
        g gVar;
        if (!(obj instanceof t) && q0.a(i10)) {
            if (function1 != null || (f2Var instanceof g)) {
                if (f2Var instanceof g) {
                    gVar = (g) f2Var;
                } else {
                    gVar = null;
                }
                return new s(obj, gVar, function1, (CancellationException) null, 16);
            }
            return obj;
        }
        return obj;
    }

    public static void x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(Object obj, int i10, Function1 function1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32213g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f2) {
                Object B = B((f2) obj2, obj, i10, function1);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    l();
                }
                n(i10);
                return;
            }
            if (obj2 instanceof k) {
                k kVar = (k) obj2;
                kVar.getClass();
                if (k.f32229c.compareAndSet(kVar, 0, 1)) {
                    if (function1 != null) {
                        j(function1, kVar.f32267a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // qu.h
    public final boolean D() {
        return !(f32213g.get(this) instanceof f2);
    }

    @Override // qu.h
    public final void E(Object obj) {
        n(this.f32251c);
    }

    @Override // qu.s2
    public final void a(vu.z zVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f32212f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(zVar);
    }

    @Override // qu.p0
    public final void b(Object obj, CancellationException cancellationException) {
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32213g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof f2)) {
                if (obj2 instanceof t) {
                    return;
                }
                if (obj2 instanceof s) {
                    s sVar = (s) obj2;
                    if (sVar.f32263e != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        s a10 = s.a(sVar, null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        g gVar = sVar.f32260b;
                        if (gVar != null) {
                            i(gVar, cancellationException);
                        }
                        Function1 function1 = sVar.f32261c;
                        if (function1 != null) {
                            j(function1, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                s sVar2 = new s(obj2, (g) null, (Function1) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, sVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            throw new IllegalStateException("Not completed".toString());
        }
    }

    @Override // qu.p0
    public final yt.a c() {
        return this.f32215d;
    }

    @Override // qu.p0
    public final Throwable d(Object obj) {
        Throwable d10 = super.d(obj);
        if (d10 == null) {
            return null;
        }
        return d10;
    }

    @Override // qu.h
    public final kp.g e(Object obj, Function1 function1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32213g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f2) {
                Object B = B((f2) obj2, obj, this.f32251c, function1);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    l();
                }
                return j.f32225a;
            }
            boolean z10 = obj2 instanceof s;
            return null;
        }
    }

    @Override // qu.p0
    public final Object f(Object obj) {
        if (obj instanceof s) {
            return ((s) obj).f32259a;
        }
        return obj;
    }

    @Override // au.d
    public final au.d getCallerFrame() {
        yt.a aVar = this.f32215d;
        if (aVar instanceof au.d) {
            return (au.d) aVar;
        }
        return null;
    }

    @Override // yt.a
    public final CoroutineContext getContext() {
        return this.f32216e;
    }

    @Override // qu.p0
    public final Object h() {
        return f32213g.get(this);
    }

    public final void i(g gVar, Throwable th2) {
        try {
            f fVar = (f) gVar;
            int i10 = fVar.f32202a;
            Object obj = fVar.f32203b;
            switch (i10) {
                case 0:
                    if (th2 != null) {
                        ((Future) obj).cancel(false);
                        break;
                    }
                    break;
                case 1:
                    ((Function1) obj).invoke(th2);
                    break;
                default:
                    ((t0) obj).a();
                    break;
            }
        } catch (Throwable th3) {
            el.l.k0(this.f32216e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void j(Function1 function1, Throwable th2) {
        try {
            function1.invoke(th2);
        } catch (Throwable th3) {
            el.l.k0(this.f32216e, new RuntimeException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void k(vu.z zVar, Throwable th2) {
        CoroutineContext coroutineContext = this.f32216e;
        int i10 = f32212f.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                zVar.g(i10, coroutineContext);
                return;
            } catch (Throwable th3) {
                el.l.k0(coroutineContext, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32214h;
        t0 t0Var = (t0) atomicReferenceFieldUpdater.get(this);
        if (t0Var == null) {
            return;
        }
        t0Var.a();
        atomicReferenceFieldUpdater.set(this, e2.f32201a);
    }

    @Override // qu.h
    public final void m(Function1 function1, Object obj) {
        A(obj, this.f32251c, function1);
    }

    public final void n(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        boolean z10;
        do {
            atomicIntegerFieldUpdater = f32212f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yt.a aVar = this.f32215d;
                    if (!z10 && (aVar instanceof vu.h) && q0.a(i10) == q0.a(this.f32251c)) {
                        b0 b0Var = ((vu.h) aVar).f38374d;
                        CoroutineContext context = aVar.getContext();
                        if (b0Var.d0()) {
                            b0Var.b0(context, this);
                            return;
                        }
                        b1 a10 = k2.a();
                        if (a10.j0()) {
                            a10.g0(this);
                            return;
                        }
                        a10.i0(true);
                        try {
                            q0.b(this, aVar, true);
                            do {
                            } while (a10.l0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    q0.b(this, aVar, z10);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable o(x1 x1Var) {
        return x1Var.v();
    }

    public final Object p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean w10 = w();
        do {
            atomicIntegerFieldUpdater = f32212f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    if (w10) {
                        z();
                    }
                    Object obj = f32213g.get(this);
                    if (!(obj instanceof t)) {
                        if (q0.a(this.f32251c)) {
                            o1 o1Var = (o1) this.f32216e.g(c0.f32192b);
                            if (o1Var != null && !o1Var.b()) {
                                CancellationException v10 = o1Var.v();
                                b(obj, v10);
                                throw v10;
                            }
                        }
                        return f(obj);
                    }
                    throw ((t) obj).f32267a;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((t0) f32214h.get(this)) == null) {
            t();
        }
        if (w10) {
            z();
        }
        return zt.a.f42823a;
    }

    @Override // qu.h
    public final void q(b0 b0Var, Unit unit) {
        vu.h hVar;
        b0 b0Var2;
        int i10;
        yt.a aVar = this.f32215d;
        if (aVar instanceof vu.h) {
            hVar = (vu.h) aVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            b0Var2 = hVar.f38374d;
        } else {
            b0Var2 = null;
        }
        if (b0Var2 == b0Var) {
            i10 = 4;
        } else {
            i10 = this.f32251c;
        }
        A(unit, i10, null);
    }

    @Override // qu.h
    public final boolean r(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32213g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (!(obj instanceof f2)) {
                return false;
            }
            if ((obj instanceof g) || (obj instanceof vu.z)) {
                z10 = true;
            }
            k kVar = new k(this, th2, z10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            f2 f2Var = (f2) obj;
            if (f2Var instanceof g) {
                i((g) obj, th2);
            } else if (f2Var instanceof vu.z) {
                k((vu.z) obj, th2);
            }
            if (!w()) {
                l();
            }
            n(this.f32251c);
            return true;
        }
    }

    @Override // yt.a
    public final void resumeWith(Object obj) {
        Throwable a10 = ut.l.a(obj);
        if (a10 != null) {
            obj = new t(a10, false);
        }
        A(obj, this.f32251c, null);
    }

    public final void s() {
        t0 t10 = t();
        if (t10 != null && D()) {
            t10.a();
            f32214h.set(this, e2.f32201a);
        }
    }

    public final t0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o1 o1Var = (o1) this.f32216e.g(c0.f32192b);
        if (o1Var == null) {
            return null;
        }
        t0 s02 = hl.f.s0(o1Var, true, new l(this), 2);
        do {
            atomicReferenceFieldUpdater = f32214h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, s02)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return s02;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y());
        sb2.append('(');
        sb2.append(i0.M(this.f32215d));
        sb2.append("){");
        Object obj = f32213g.get(this);
        if (obj instanceof f2) {
            str = "Active";
        } else if (obj instanceof k) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(i0.w(this));
        return sb2.toString();
    }

    public final void u(Function1 function1) {
        yk.g.G(this, new f(function1, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ab, code lost:
    
        x(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ae, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qu.i.f32213g
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof qu.b
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof qu.g
            r2 = 0
            if (r1 != 0) goto Lab
            boolean r1 = r7 instanceof vu.z
            if (r1 != 0) goto Lab
            boolean r1 = r7 instanceof qu.t
            if (r1 == 0) goto L55
            r0 = r7
            qu.t r0 = (qu.t) r0
            r0.getClass()
            r3 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = qu.t.f32266b
            r5 = 0
            boolean r3 = r4.compareAndSet(r0, r5, r3)
            if (r3 == 0) goto L51
            boolean r3 = r7 instanceof qu.k
            if (r3 == 0) goto L50
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L41
            java.lang.Throwable r2 = r0.f32267a
        L41:
            boolean r0 = r10 instanceof qu.g
            if (r0 == 0) goto L4b
            qu.g r10 = (qu.g) r10
            r9.i(r10, r2)
            goto L50
        L4b:
            vu.z r10 = (vu.z) r10
            r9.k(r10, r2)
        L50:
            return
        L51:
            x(r10, r7)
            throw r2
        L55:
            boolean r1 = r7 instanceof qu.s
            if (r1 == 0) goto L89
            r1 = r7
            qu.s r1 = (qu.s) r1
            qu.g r3 = r1.f32260b
            if (r3 != 0) goto L85
            boolean r3 = r10 instanceof vu.z
            if (r3 == 0) goto L65
            return
        L65:
            r3 = r10
            qu.g r3 = (qu.g) r3
            java.lang.Throwable r4 = r1.f32263e
            if (r4 == 0) goto L70
            r9.i(r3, r4)
            return
        L70:
            r4 = 29
            qu.s r1 = qu.s.a(r1, r3, r2, r4)
        L76:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L7d
            return
        L7d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L76
            goto L0
        L85:
            x(r10, r7)
            throw r2
        L89:
            boolean r1 = r10 instanceof vu.z
            if (r1 == 0) goto L8e
            return
        L8e:
            r3 = r10
            qu.g r3 = (qu.g) r3
            qu.s r8 = new qu.s
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L9c:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto La3
            return
        La3:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto L9c
            goto L0
        Lab:
            x(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.i.v(java.lang.Object):void");
    }

    public final boolean w() {
        if (this.f32251c == 2) {
            yt.a aVar = this.f32215d;
            Intrinsics.d(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (vu.h.f38373h.get((vu.h) aVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        vu.h hVar;
        yt.a aVar = this.f32215d;
        Throwable th2 = null;
        if (aVar instanceof vu.h) {
            hVar = (vu.h) aVar;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            return;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vu.h.f38373h;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            kp.g gVar = vu.i.f38382b;
            if (obj != gVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                th2 = (Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, this)) {
                if (atomicReferenceFieldUpdater.get(hVar) != gVar) {
                    break;
                }
            }
        }
        if (th2 != null) {
            l();
            r(th2);
        }
    }
}
