package su;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import vu.z;

/* loaded from: classes2.dex */
public final class k extends z {

    /* renamed from: e, reason: collision with root package name */
    public final c f34818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f34819f;

    public k(long j10, k kVar, c cVar, int i10) {
        super(j10, kVar, i10);
        this.f34818e = cVar;
        this.f34819f = new AtomicReferenceArray(e.f34796b * 2);
    }

    @Override // vu.z
    public final int f() {
        return e.f34796b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        kotlin.jvm.internal.Intrinsics.c(r5);
        r7 = r5.f34793b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = el.l.y(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        el.l.k0(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // vu.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r7, kotlin.coroutines.CoroutineContext r8) {
        /*
            r6 = this;
            int r0 = su.e.f34796b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f34819f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof qu.s2
            r4 = 0
            su.c r5 = r6.f34818e
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof su.q
            if (r3 == 0) goto L22
            goto L71
        L22:
            kp.g r3 = su.e.f34804j
            if (r2 == r3) goto L5b
            kp.g r3 = su.e.f34805k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            kp.g r3 = su.e.f34801g
            if (r2 == r3) goto L12
            kp.g r3 = su.e.f34800f
            if (r2 != r3) goto L34
            goto L12
        L34:
            kp.g r7 = su.e.f34803i
            if (r2 == r7) goto L5a
            kp.g r7 = su.e.f34798d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            kp.g r7 = su.e.f34806l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r4)
            if (r1 == 0) goto L70
            kotlin.jvm.internal.Intrinsics.c(r5)
            kotlin.jvm.functions.Function1 r7 = r5.f34793b
            if (r7 == 0) goto L70
            kotlinx.coroutines.internal.UndeliveredElementException r7 = el.l.y(r7, r0, r4)
            if (r7 == 0) goto L70
            el.l.k0(r8, r7)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            kp.g r3 = su.e.f34804j
            goto L78
        L76:
            kp.g r3 = su.e.f34805k
        L78:
            boolean r2 = r6.j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r4)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            kotlin.jvm.internal.Intrinsics.c(r5)
            kotlin.jvm.functions.Function1 r7 = r5.f34793b
            if (r7 == 0) goto L98
            kotlinx.coroutines.internal.UndeliveredElementException r7 = el.l.y(r7, r0, r4)
            if (r7 == 0) goto L98
            el.l.k0(r8, r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.k.g(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f34819f;
        int i11 = (i10 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i10) {
        return this.f34819f.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z10) {
        if (z10) {
            c cVar = this.f34818e;
            Intrinsics.c(cVar);
            cVar.F((this.f38412c * e.f34796b) + i10);
        }
        h();
    }

    public final void m(int i10, Object obj) {
        this.f34819f.set(i10 * 2, obj);
    }

    public final void n(int i10, kp.g gVar) {
        this.f34819f.set((i10 * 2) + 1, gVar);
    }
}
