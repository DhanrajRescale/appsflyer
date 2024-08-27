package yu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qu.i0;

/* loaded from: classes2.dex */
public final class d extends i implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41825h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z10) {
        super(1, z10 ? 1 : 0);
        kp.g gVar;
        if (z10) {
            gVar = null;
        } else {
            gVar = e.f41826a;
        }
        this.owner$volatile = gVar;
    }

    @Override // yu.a
    public final void a(Object obj) {
        while (Math.max(i.f41833g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41825h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            kp.g gVar = e.f41826a;
            if (obj2 != gVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, gVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                d();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0022, code lost:
    
        r1.m(r3.f41835b, kotlin.Unit.f23355a);
     */
    @Override // yu.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4, yt.a r5) {
        /*
            r3 = this;
            boolean r0 = r3.e(r4)
            if (r0 == 0) goto L9
            kotlin.Unit r4 = kotlin.Unit.f23355a
            goto L47
        L9:
            yt.a r0 = zt.f.b(r5)
            qu.i r0 = yk.g.A(r0)
            yu.c r1 = new yu.c     // Catch: java.lang.Throwable -> L48
            r1.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L48
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = yu.i.f41833g     // Catch: java.lang.Throwable -> L48
            int r4 = r4.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L48
            int r2 = r3.f41834a     // Catch: java.lang.Throwable -> L48
            if (r4 > r2) goto L16
            if (r4 <= 0) goto L2a
            kotlin.Unit r4 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L48
            qg.a r2 = r3.f41835b     // Catch: java.lang.Throwable -> L48
            r1.m(r2, r4)     // Catch: java.lang.Throwable -> L48
            goto L30
        L2a:
            boolean r4 = r3.c(r1)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L16
        L30:
            java.lang.Object r4 = r0.p()
            zt.a r0 = zt.a.f42823a
            if (r4 != r0) goto L3d
            java.lang.String r1 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
        L3d:
            if (r4 != r0) goto L40
            goto L42
        L40:
            kotlin.Unit r4 = kotlin.Unit.f23355a
        L42:
            if (r4 != r0) goto L45
            goto L47
        L45:
            kotlin.Unit r4 = kotlin.Unit.f23355a
        L47:
            return r4
        L48:
            r4 = move-exception
            r0.z()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yu.d.b(java.lang.Object, yt.a):java.lang.Object");
    }

    public final boolean e(Object obj) {
        int i10;
        char c10;
        char c11;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f41833g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f41834a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > i12) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41825h;
                if (i11 <= 0) {
                    if (obj == null) {
                        break;
                    }
                    while (true) {
                        if (Math.max(atomicIntegerFieldUpdater.get(this), 0) == 0) {
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f41826a) {
                                if (obj2 == obj) {
                                    c11 = 1;
                                } else {
                                    c11 = 2;
                                }
                            }
                        } else {
                            c11 = 0;
                            break;
                        }
                    }
                    if (c11 != 1) {
                        if (c11 == 2) {
                            break;
                        }
                    } else {
                        c10 = 2;
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c10 = 0;
                    break;
                }
            }
        }
        c10 = 1;
        if (c10 == 0) {
            return true;
        }
        if (c10 == 1) {
            return false;
        }
        if (c10 != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Mutex@");
        sb2.append(i0.w(this));
        sb2.append("[isLocked=");
        boolean z10 = false;
        if (Math.max(i.f41833g.get(this), 0) == 0) {
            z10 = true;
        }
        sb2.append(z10);
        sb2.append(",owner=");
        sb2.append(f41825h.get(this));
        sb2.append(']');
        return sb2.toString();
    }
}
