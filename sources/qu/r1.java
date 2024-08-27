package qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class r1 extends vu.p implements l1, t0, i1 {

    /* renamed from: d, reason: collision with root package name */
    public x1 f32257d;

    @Override // qu.t0
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        x1 k10 = k();
        while (true) {
            Object P = k10.P();
            if (P instanceof r1) {
                if (P == this) {
                    v0 v0Var = y1.f32307g;
                    do {
                        atomicReferenceFieldUpdater2 = x1.f32296a;
                        if (atomicReferenceFieldUpdater2.compareAndSet(k10, P, v0Var)) {
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(k10) == P);
                } else {
                    return;
                }
            } else {
                if (!(P instanceof i1) || ((i1) P).d() == null) {
                    return;
                }
                while (true) {
                    Object h10 = h();
                    if (h10 instanceof vu.w) {
                        vu.p pVar = ((vu.w) h10).f38409a;
                        return;
                    }
                    if (h10 == this) {
                        return;
                    }
                    Intrinsics.d(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    vu.p pVar2 = (vu.p) h10;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = vu.p.f38398c;
                    vu.w wVar = (vu.w) atomicReferenceFieldUpdater3.get(pVar2);
                    if (wVar == null) {
                        wVar = new vu.w(pVar2);
                        atomicReferenceFieldUpdater3.set(pVar2, wVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = vu.p.f38396a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, h10, wVar)) {
                            pVar2.f();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == h10);
                }
            }
        }
    }

    @Override // qu.i1
    public final boolean b() {
        return true;
    }

    @Override // qu.i1
    public final c2 d() {
        return null;
    }

    public o1 getParent() {
        return k();
    }

    public final x1 k() {
        x1 x1Var = this.f32257d;
        if (x1Var != null) {
            return x1Var;
        }
        Intrinsics.k("job");
        throw null;
    }

    @Override // vu.p
    public final String toString() {
        return getClass().getSimpleName() + '@' + i0.w(this) + "[job@" + i0.w(k()) + ']';
    }
}
