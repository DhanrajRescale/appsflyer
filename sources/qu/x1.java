package qu;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public class x1 implements o1, o, g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32296a = AtomicReferenceFieldUpdater.newUpdater(x1.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32297b = AtomicReferenceFieldUpdater.newUpdater(x1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public x1(boolean z10) {
        v0 v0Var;
        if (z10) {
            v0Var = y1.f32307g;
        } else {
            v0Var = y1.f32306f;
        }
        this._state$volatile = v0Var;
    }

    public static n c0(vu.p pVar) {
        while (pVar.j()) {
            vu.p f10 = pVar.f();
            if (f10 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vu.p.f38397b;
                Object obj = atomicReferenceFieldUpdater.get(pVar);
                while (true) {
                    pVar = (vu.p) obj;
                    if (!pVar.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(pVar);
                }
            } else {
                pVar = f10;
            }
        }
        while (true) {
            pVar = pVar.i();
            if (!pVar.j()) {
                if (pVar instanceof n) {
                    return (n) pVar;
                }
                if (pVar instanceof c2) {
                    return null;
                }
            }
        }
    }

    public static String i0(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (u1Var.e()) {
                return "Cancelling";
            }
            if (!u1Var.f()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof i1) {
            if (((i1) obj).b()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof t) {
            return "Cancelled";
        }
        return "Completed";
    }

    public final boolean A(Throwable th2) {
        if (Y()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        m mVar = (m) f32297b.get(this);
        if (mVar != null && mVar != e2.f32201a) {
            if (mVar.c(th2) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public String B() {
        return "Job was cancelled";
    }

    public boolean C(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (w(th2) && M()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, kotlinx.coroutines.CompletionHandlerException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, kotlinx.coroutines.CompletionHandlerException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void F(i1 i1Var, Object obj) {
        t tVar;
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32297b;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        if (mVar != null) {
            mVar.a();
            atomicReferenceFieldUpdater.set(this, e2.f32201a);
        }
        CompletionHandlerException completionHandlerException = 0;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            th2 = tVar.f32267a;
        } else {
            th2 = null;
        }
        if (i1Var instanceof r1) {
            try {
                ((r1) i1Var).e(th2);
                return;
            } catch (Throwable th3) {
                T(new RuntimeException("Exception in completion handler " + i1Var + " for " + this, th3));
                return;
            }
        }
        c2 d10 = i1Var.d();
        if (d10 != null) {
            Object h10 = d10.h();
            Intrinsics.d(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            vu.p pVar = (vu.p) h10;
            while (!Intrinsics.a(pVar, d10)) {
                if (pVar instanceof r1) {
                    r1 r1Var = (r1) pVar;
                    try {
                        r1Var.e(th2);
                    } catch (Throwable th4) {
                        if (completionHandlerException != 0) {
                            ut.c.a(completionHandlerException, th4);
                        } else {
                            completionHandlerException = new RuntimeException("Exception in completion handler " + r1Var + " for " + this, th4);
                            Unit unit = Unit.f23355a;
                        }
                    }
                }
                pVar = pVar.i();
                completionHandlerException = completionHandlerException;
            }
            if (completionHandlerException != 0) {
                T(completionHandlerException);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable G(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        x1 x1Var = (x1) ((g2) obj);
        Object P = x1Var.P();
        CancellationException cancellationException2 = null;
        if (P instanceof u1) {
            cancellationException = ((u1) P).c();
        } else if (P instanceof t) {
            cancellationException = ((t) P).f32267a;
        } else if (!(P instanceof i1)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + P).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            cancellationException2 = new JobCancellationException("Parent job is ".concat(i0(P)), cancellationException, x1Var);
        }
        return cancellationException2;
    }

    @Override // qu.o1
    public final t0 I(Function1 function1) {
        return W(false, true, new k1(function1));
    }

    public final Object J(u1 u1Var, Object obj) {
        t tVar;
        Throwable L;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            th2 = tVar.f32267a;
        }
        synchronized (u1Var) {
            u1Var.e();
            ArrayList<Throwable> g10 = u1Var.g(th2);
            L = L(u1Var, g10);
            if (L != null && g10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g10.size()));
                for (Throwable th3 : g10) {
                    if (th3 != L && th3 != L && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        ut.c.a(L, th3);
                    }
                }
            }
        }
        if (L != null && L != th2) {
            obj = new t(L, false);
        }
        if (L != null && (A(L) || Q(L))) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            t.f32266b.compareAndSet((t) obj, 0, 1);
        }
        e0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32296a;
        if (obj instanceof i1) {
            obj2 = new j1((i1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, u1Var, obj2) && atomicReferenceFieldUpdater.get(this) == u1Var) {
        }
        F(u1Var, obj);
        return obj;
    }

    public final Object K() {
        Object P = P();
        if (!(P instanceof i1)) {
            if (!(P instanceof t)) {
                return y1.a(P);
            }
            throw ((t) P).f32267a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final Throwable L(u1 u1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!u1Var.e()) {
                return null;
            }
            return new JobCancellationException(B(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean M() {
        return true;
    }

    public boolean N() {
        return this instanceof q;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [vu.p, qu.c2] */
    public final c2 O(i1 i1Var) {
        c2 d10 = i1Var.d();
        if (d10 == null) {
            if (i1Var instanceof v0) {
                return new vu.p();
            }
            if (i1Var instanceof r1) {
                g0((r1) i1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + i1Var).toString());
        }
        return d10;
    }

    public final Object P() {
        while (true) {
            Object obj = f32296a.get(this);
            if (!(obj instanceof vu.v)) {
                return obj;
            }
            ((vu.v) obj).a(this);
        }
    }

    public boolean Q(Throwable th2) {
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object R(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // qu.o1
    public final Object S(yt.a frame) {
        Object P;
        do {
            P = P();
            if (!(P instanceof i1)) {
                hl.f.W(frame.getContext());
                return Unit.f23355a;
            }
        } while (h0(P) < 0);
        i iVar = new i(1, zt.f.b(frame));
        iVar.s();
        yk.g.G(iVar, new f(hl.f.s0(this, false, new u0(iVar, 3), 3), 2));
        Object p10 = iVar.p();
        zt.a aVar = zt.a.f42823a;
        if (p10 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (p10 != aVar) {
            p10 = Unit.f23355a;
        }
        if (p10 == aVar) {
            return p10;
        }
        return Unit.f23355a;
    }

    public final void V(o1 o1Var) {
        e2 e2Var = e2.f32201a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32297b;
        if (o1Var == null) {
            atomicReferenceFieldUpdater.set(this, e2Var);
            return;
        }
        o1Var.start();
        m d10 = o1Var.d(this);
        atomicReferenceFieldUpdater.set(this, d10);
        if (!(P() instanceof i1)) {
            d10.a();
            atomicReferenceFieldUpdater.set(this, e2Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [vu.p, qu.c2] */
    public final t0 W(boolean z10, boolean z11, l1 l1Var) {
        r1 r1Var;
        h1 h1Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t tVar;
        Throwable th2;
        Throwable th3 = null;
        if (z10) {
            if (l1Var instanceof p1) {
                r1Var = (p1) l1Var;
            } else {
                r1Var = null;
            }
            if (r1Var == null) {
                r1Var = new n1(l1Var);
            }
        } else {
            if (l1Var instanceof r1) {
                r1Var = (r1) l1Var;
            } else {
                r1Var = null;
            }
            if (r1Var == null) {
                r1Var = new u0(l1Var, 1);
            }
        }
        r1Var.f32257d = this;
        while (true) {
            Object P = P();
            if (P instanceof v0) {
                v0 v0Var = (v0) P;
                if (v0Var.f32282a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f32296a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, P, r1Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != P) {
                            break;
                        }
                    }
                    return r1Var;
                }
                ?? pVar = new vu.p();
                if (v0Var.f32282a) {
                    h1Var = pVar;
                } else {
                    h1Var = new h1(pVar);
                }
                do {
                    atomicReferenceFieldUpdater = f32296a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, v0Var, h1Var)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == v0Var);
            } else if (P instanceof i1) {
                c2 d10 = ((i1) P).d();
                if (d10 == null) {
                    Intrinsics.d(P, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    g0((r1) P);
                } else {
                    t0 t0Var = e2.f32201a;
                    if (z10 && (P instanceof u1)) {
                        synchronized (P) {
                            try {
                                th2 = ((u1) P).c();
                                if (th2 != null) {
                                    if ((l1Var instanceof n) && !((u1) P).f()) {
                                    }
                                    Unit unit = Unit.f23355a;
                                }
                                if (p(P, d10, r1Var)) {
                                    if (th2 == null) {
                                        return r1Var;
                                    }
                                    t0Var = r1Var;
                                    Unit unit2 = Unit.f23355a;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    } else {
                        th2 = null;
                    }
                    if (th2 != null) {
                        if (z11) {
                            l1Var.e(th2);
                        }
                        return t0Var;
                    }
                    if (p(P, d10, r1Var)) {
                        return r1Var;
                    }
                }
            } else {
                if (z11) {
                    if (P instanceof t) {
                        tVar = (t) P;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        th3 = tVar.f32267a;
                    }
                    l1Var.e(th3);
                }
                return e2.f32201a;
            }
        }
    }

    public boolean Y() {
        return this instanceof d;
    }

    public final boolean Z(Object obj) {
        Object j02;
        do {
            j02 = j0(P(), obj);
            if (j02 == y1.f32301a) {
                return false;
            }
            if (j02 == y1.f32302b) {
                return true;
            }
        } while (j02 == y1.f32303c);
        s(j02);
        return true;
    }

    @Override // qu.o1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(B(), null, this);
        }
        y(cancellationException);
    }

    public final Object a0(Object obj) {
        Object j02;
        t tVar;
        do {
            j02 = j0(P(), obj);
            if (j02 == y1.f32301a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof t) {
                    tVar = (t) obj;
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    th2 = tVar.f32267a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (j02 == y1.f32303c);
        return j02;
    }

    @Override // qu.o1
    public boolean b() {
        Object P = P();
        if ((P instanceof i1) && ((i1) P).b()) {
            return true;
        }
        return false;
    }

    public String b0() {
        return getClass().getSimpleName();
    }

    public Object c() {
        return K();
    }

    @Override // qu.o1
    public final m d(x1 x1Var) {
        t0 s02 = hl.f.s0(this, true, new n(x1Var), 2);
        Intrinsics.d(s02, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (m) s02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, kotlinx.coroutines.CompletionHandlerException] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final void d0(c2 c2Var, Throwable th2) {
        Object h10 = c2Var.h();
        Intrinsics.d(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        vu.p pVar = (vu.p) h10;
        CompletionHandlerException completionHandlerException = 0;
        while (!Intrinsics.a(pVar, c2Var)) {
            if (pVar instanceof p1) {
                r1 r1Var = (r1) pVar;
                try {
                    r1Var.e(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != 0) {
                        ut.c.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new RuntimeException("Exception in completion handler " + r1Var + " for " + this, th3);
                        Unit unit = Unit.f23355a;
                    }
                }
            }
            pVar = pVar.i();
            completionHandlerException = completionHandlerException;
        }
        if (completionHandlerException != 0) {
            T(completionHandlerException);
        }
        A(th2);
    }

    public void e0(Object obj) {
    }

    public void f0() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.a(this, iVar);
    }

    public final void g0(r1 r1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        vu.p pVar = new vu.p();
        r1Var.getClass();
        vu.p.f38397b.set(pVar, r1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vu.p.f38396a;
        atomicReferenceFieldUpdater2.set(pVar, r1Var);
        loop0: while (true) {
            if (r1Var.h() != r1Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(r1Var, r1Var, pVar)) {
                if (atomicReferenceFieldUpdater2.get(r1Var) != r1Var) {
                    break;
                }
            }
            pVar.g(r1Var);
        }
        vu.p i10 = r1Var.i();
        do {
            atomicReferenceFieldUpdater = f32296a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, r1Var, i10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == r1Var);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.i getKey() {
        return c0.f32192b;
    }

    @Override // qu.o1
    public final o1 getParent() {
        m mVar = (m) f32297b.get(this);
        if (mVar != null) {
            return mVar.getParent();
        }
        return null;
    }

    public final int h0(Object obj) {
        boolean z10 = obj instanceof v0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32296a;
        if (z10) {
            if (((v0) obj).f32282a) {
                return 0;
            }
            v0 v0Var = y1.f32307g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, v0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            f0();
            return 1;
        }
        if (!(obj instanceof h1)) {
            return 0;
        }
        c2 c2Var = ((h1) obj).f32211a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        f0();
        return 1;
    }

    @Override // qu.o1
    public final t0 j(boolean z10, boolean z11, i0.g2 g2Var) {
        return W(z10, z11, new k1(g2Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        if (r2 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
    
        if (hl.f.s0(r2.f32242e, false, new qu.t1(r7, r1, r2, r9), 1) == qu.e2.f32201a) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ea, code lost:
    
        r2 = c0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ee, code lost:
    
        if (r2 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return qu.y1.f32302b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f4, code lost:
    
        return J(r1, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j0(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.x1.j0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext l(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kotlin.coroutines.g.a(this, context);
    }

    @Override // qu.o1
    public final Sequence n() {
        return pu.j.a(new w1(null, this));
    }

    public final boolean p(Object obj, c2 c2Var, r1 r1Var) {
        char c10;
        v1 v1Var = new v1(r1Var, this, obj);
        do {
            vu.p f10 = c2Var.f();
            if (f10 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vu.p.f38397b;
                Object obj2 = atomicReferenceFieldUpdater.get(c2Var);
                while (true) {
                    f10 = (vu.p) obj2;
                    if (!f10.j()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(f10);
                }
            }
            vu.p.f38397b.set(r1Var, f10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vu.p.f38396a;
            atomicReferenceFieldUpdater2.set(r1Var, c2Var);
            v1Var.f32284c = c2Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(f10, c2Var, v1Var)) {
                    if (v1Var.a(f10) == null) {
                        c10 = 1;
                    } else {
                        c10 = 2;
                    }
                } else if (atomicReferenceFieldUpdater2.get(f10) != c2Var) {
                    c10 = 0;
                    break;
                }
            }
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    public void s(Object obj) {
    }

    @Override // qu.o1
    public final boolean start() {
        int h02;
        do {
            h02 = h0(P());
            if (h02 == 0) {
                return false;
            }
        } while (h02 != 1);
        return true;
    }

    public void t(Object obj) {
        s(obj);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b0() + UrlTreeKt.componentParamPrefixChar + i0(P()) + UrlTreeKt.componentParamSuffixChar);
        sb2.append('@');
        sb2.append(i0.w(this));
        return sb2.toString();
    }

    public final Object u(yt.a frame) {
        Object P;
        do {
            P = P();
            if (!(P instanceof i1)) {
                if (!(P instanceof t)) {
                    return y1.a(P);
                }
                throw ((t) P).f32267a;
            }
        } while (h0(P) < 0);
        s1 s1Var = new s1(zt.f.b(frame), this);
        s1Var.s();
        yk.g.G(s1Var, new f(hl.f.s0(this, false, new u0(s1Var, 2), 3), 2));
        Object p10 = s1Var.p();
        if (p10 == zt.a.f42823a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return p10;
    }

    @Override // qu.o1
    public final CancellationException v() {
        Object P = P();
        CancellationException cancellationException = null;
        if (P instanceof u1) {
            Throwable c10 = ((u1) P).c();
            if (c10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c10 instanceof CancellationException) {
                    cancellationException = (CancellationException) c10;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = B();
                    }
                    return new JobCancellationException(concat, c10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(P instanceof i1)) {
            if (P instanceof t) {
                Throwable th2 = ((t) P).f32267a;
                if (th2 instanceof CancellationException) {
                    cancellationException = (CancellationException) th2;
                }
                if (cancellationException == null) {
                    return new JobCancellationException(B(), th2, this);
                }
                return cancellationException;
            }
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = qu.y1.f32301a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != qu.y1.f32302b) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = j0(r0, new qu.t(G(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == qu.y1.f32303c) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 != qu.y1.f32301a) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r4 = P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r4 instanceof qu.u1) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if ((r4 instanceof qu.i1) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        r1 = G(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        r5 = (qu.i1) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (N() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r5.b() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        r5 = j0(r4, new qu.t(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r5 == qu.y1.f32301a) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (r5 == qu.y1.f32303c) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r6 = O(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        if (r6 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
    
        r7 = new qu.u1(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        r4 = qu.x1.f32296a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof qu.i1) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        if (r4.get(r9) == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b3, code lost:
    
        d0(r6, r1);
        r10 = qu.y1.f32301a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0058, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        r10 = qu.y1.f32304d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0053, code lost:
    
        if (qu.u1.f32280d.get((qu.u1) r4) != qu.y1.f32305e) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0055, code lost:
    
        r10 = qu.y1.f32304d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0057, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005b, code lost:
    
        r5 = ((qu.u1) r4).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0062, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0064, code lost:
    
        r1 = G(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof qu.u1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006b, code lost:
    
        ((qu.u1) r4).a(r1);
        r10 = ((qu.u1) r4).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007a, code lost:
    
        if ((!r5) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007c, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007e, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0080, code lost:
    
        d0(((qu.u1) r4).f32281a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0087, code lost:
    
        r10 = qu.y1.f32301a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0069, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008b, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f2, code lost:
    
        if (r0 != qu.y1.f32301a) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0104, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        if (r0 != qu.y1.f32302b) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fd, code lost:
    
        if (r0 != qu.y1.f32304d) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0100, code lost:
    
        s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((qu.u1) r0).f() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.x1.w(java.lang.Object):boolean");
    }

    public void y(CancellationException cancellationException) {
        w(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.b(this, iVar);
    }

    public void T(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }
}
