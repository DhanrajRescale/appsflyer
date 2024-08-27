package vu;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38401e = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f38402f = AtomicLongFieldUpdater.newUpdater(s.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final kp.g f38403g = new kp.g("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f38404a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38405b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f38407d;

    public s(int i10, boolean z10) {
        this.f38404a = i10;
        this.f38405b = z10;
        int i11 = i10 - 1;
        this.f38406c = i11;
        this.f38407d = new AtomicReferenceArray(i10);
        if (i11 <= 1073741823) {
            if ((i10 & i11) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0053, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
        L3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = vu.s.f38402f
            long r2 = r8.get(r15)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L1c
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L1b
            r1 = 2
        L1b:
            return r1
        L1c:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r11 = 30
            long r4 = r4 >> r11
            int r12 = (int) r4
            int r4 = r12 + 2
            int r13 = r6.f38406c
            r4 = r4 & r13
            r5 = r0 & r13
            if (r4 != r5) goto L35
            return r1
        L35:
            boolean r4 = r6.f38405b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r6.f38407d
            if (r4 != 0) goto L54
            r4 = r12 & r13
            java.lang.Object r4 = r14.get(r4)
            if (r4 == 0) goto L54
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r6.f38404a
            if (r3 < r2) goto L53
            int r12 = r12 - r0
            r0 = r12 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L3
        L53:
            return r1
        L54:
            int r0 = r12 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = vu.s.f38402f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r9 = (long) r0
            long r9 = r9 << r11
            long r4 = r4 | r9
            r0 = r1
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3
            r0 = r12 & r13
            r14.set(r0, r7)
            r0 = r6
        L70:
            long r1 = r8.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L9b
            vu.s r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f38407d
            int r2 = r0.f38406c
            r2 = r2 & r12
            java.lang.Object r5 = r1.get(r2)
            boolean r9 = r5 instanceof vu.r
            if (r9 == 0) goto L98
            vu.r r5 = (vu.r) r5
            int r5 = r5.f38400a
            if (r5 != r12) goto L98
            r1.set(r2, r7)
            goto L99
        L98:
            r0 = 0
        L99:
            if (r0 != 0) goto L70
        L9b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.s.a(java.lang.Object):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f38402f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final s c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        while (true) {
            atomicLongFieldUpdater = f38402f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                break;
            }
            long j11 = j10 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38401e;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar != null) {
                return sVar;
            }
            s sVar2 = new s(this.f38404a * 2, this.f38405b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = this.f38406c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = this.f38407d.get(i13);
                if (obj == null) {
                    obj = new r(i10);
                }
                sVar2.f38407d.set(sVar2.f38406c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(sVar2, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, sVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f38402f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return f38403g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = this.f38406c;
            int i12 = i10 & i11;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == i12) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f38407d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z10 = this.f38405b;
            if (obj == null) {
                if (z10) {
                    return null;
                }
            } else {
                if (obj instanceof r) {
                    return null;
                }
                long j11 = (i10 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                if (z10) {
                    s sVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f38402f;
                        long j12 = atomicLongFieldUpdater2.get(sVar);
                        int i13 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            sVar = sVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(sVar, j12, (j12 & (-1073741824)) | j11)) {
                                sVar.f38407d.set(sVar.f38406c & i13, null);
                                sVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (sVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
