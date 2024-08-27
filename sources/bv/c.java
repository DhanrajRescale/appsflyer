package bv;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    /* JADX WARN: Incorrect condition in loop: B:10:0x0052 */
    /* JADX WARN: Type inference failed for: r4v8, types: [bv.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(bv.c r4, bv.f r5, long r6, boolean r8) {
        /*
            r4.getClass()
            bv.f r4 = bv.f.access$getHead$cp()
            if (r4 != 0) goto L19
            bv.f r4 = new bv.f
            r4.<init>()
            bv.f.access$setHead$cp(r4)
            pt.s r4 = new pt.s
            r4.<init>()
            r4.start()
        L19:
            long r0 = java.lang.System.nanoTime()
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L33
            if (r8 == 0) goto L33
            long r2 = r5.deadlineNanoTime()
            long r2 = r2 - r0
            long r6 = java.lang.Math.min(r6, r2)
            long r6 = r6 + r0
            bv.f.access$setTimeoutAt$p(r5, r6)
            goto L43
        L33:
            if (r4 == 0) goto L3a
            long r6 = r6 + r0
            bv.f.access$setTimeoutAt$p(r5, r6)
            goto L43
        L3a:
            if (r8 == 0) goto L84
            long r6 = r5.deadlineNanoTime()
            bv.f.access$setTimeoutAt$p(r5, r6)
        L43:
            long r6 = bv.f.access$remainingNanos(r5, r0)
            bv.f r4 = bv.f.access$getHead$cp()
            kotlin.jvm.internal.Intrinsics.c(r4)
        L4e:
            bv.f r8 = bv.f.access$getNext$p(r4)
            if (r8 == 0) goto L6c
            bv.f r8 = bv.f.access$getNext$p(r4)
            kotlin.jvm.internal.Intrinsics.c(r8)
            long r2 = bv.f.access$remainingNanos(r8, r0)
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L64
            goto L6c
        L64:
            bv.f r4 = bv.f.access$getNext$p(r4)
            kotlin.jvm.internal.Intrinsics.c(r4)
            goto L4e
        L6c:
            bv.f r6 = bv.f.access$getNext$p(r4)
            bv.f.access$setNext$p(r5, r6)
            bv.f.access$setNext$p(r4, r5)
            bv.f r5 = bv.f.access$getHead$cp()
            if (r4 != r5) goto L83
            java.util.concurrent.locks.Condition r4 = bv.f.access$getCondition$cp()
            r4.signal()
        L83:
            return
        L84:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.c.a(bv.c, bv.f, long, boolean):void");
    }

    public static final void b(c cVar, f fVar) {
        f fVar2;
        f fVar3;
        f fVar4;
        cVar.getClass();
        for (fVar2 = f.head; fVar2 != null; fVar2 = fVar2.next) {
            fVar3 = fVar2.next;
            if (fVar3 == fVar) {
                fVar4 = fVar.next;
                fVar2.next = fVar4;
                fVar.next = null;
                return;
            }
        }
        throw new IllegalStateException("node was not found in the queue".toString());
    }

    public static f c() {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        Condition condition;
        Condition condition2;
        long j10;
        f fVar5;
        f fVar6;
        long j11;
        f fVar7;
        fVar = f.head;
        Intrinsics.c(fVar);
        fVar2 = fVar.next;
        if (fVar2 == null) {
            long nanoTime = System.nanoTime();
            condition2 = f.condition;
            j10 = f.IDLE_TIMEOUT_MILLIS;
            condition2.await(j10, TimeUnit.MILLISECONDS);
            fVar5 = f.head;
            Intrinsics.c(fVar5);
            fVar6 = fVar5.next;
            if (fVar6 != null) {
                return null;
            }
            long nanoTime2 = System.nanoTime() - nanoTime;
            j11 = f.IDLE_TIMEOUT_NANOS;
            if (nanoTime2 >= j11) {
                fVar7 = f.head;
                return fVar7;
            }
            return null;
        }
        long access$remainingNanos = f.access$remainingNanos(fVar2, System.nanoTime());
        if (access$remainingNanos > 0) {
            condition = f.condition;
            condition.await(access$remainingNanos, TimeUnit.NANOSECONDS);
            return null;
        }
        fVar3 = f.head;
        Intrinsics.c(fVar3);
        fVar4 = fVar2.next;
        fVar3.next = fVar4;
        fVar2.next = null;
        fVar2.state = 2;
        return fVar2;
    }
}
