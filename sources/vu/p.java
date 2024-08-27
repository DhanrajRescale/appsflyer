package vu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38396a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38397b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38398c = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((vu.w) r6).f38409a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final vu.p f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vu.p.f38397b
            java.lang.Object r1 = r0.get(r9)
            vu.p r1 = (vu.p) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = vu.p.f38396a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.j()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof vu.v
            if (r7 == 0) goto L38
            vu.v r6 = (vu.v) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof vu.w
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            vu.w r6 = (vu.w) r6
            vu.p r6 = r6.f38409a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            vu.p r3 = (vu.p) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.d(r6, r4)
            r4 = r6
            vu.p r4 = (vu.p) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.p.f():vu.p");
    }

    public final void g(p pVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38397b;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(pVar);
            if (h() != pVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(pVar, pVar2, this)) {
                if (atomicReferenceFieldUpdater.get(pVar) != pVar2) {
                    break;
                }
            }
            if (j()) {
                pVar.f();
                return;
            }
            return;
        }
    }

    public final Object h() {
        while (true) {
            Object obj = f38396a.get(this);
            if (!(obj instanceof v)) {
                return obj;
            }
            ((v) obj).a(this);
        }
    }

    public final p i() {
        w wVar;
        p pVar;
        Object h10 = h();
        if (h10 instanceof w) {
            wVar = (w) h10;
        } else {
            wVar = null;
        }
        if (wVar == null || (pVar = wVar.f38409a) == null) {
            Intrinsics.d(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (p) h10;
        }
        return pVar;
    }

    public boolean j() {
        return h() instanceof w;
    }

    public String toString() {
        return new c0.q(this, 2) + '@' + qu.i0.w(this);
    }
}
