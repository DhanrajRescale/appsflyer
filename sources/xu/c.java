package xu;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import vu.q;
import vu.x;

/* loaded from: classes2.dex */
public final class c implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f40573h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f40574i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40575j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final kp.g f40576k = new kp.g("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f40577a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40578b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40579c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f40580d;

    /* renamed from: e, reason: collision with root package name */
    public final f f40581e;

    /* renamed from: f, reason: collision with root package name */
    public final f f40582f;

    /* renamed from: g, reason: collision with root package name */
    public final x f40583g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r3v14, types: [vu.q, xu.f] */
    /* JADX WARN: Type inference failed for: r3v15, types: [vu.q, xu.f] */
    public c(String str, int i10, int i11, long j10) {
        this.f40577a = i10;
        this.f40578b = i11;
        this.f40579c = j10;
        this.f40580d = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 > 0) {
                        this.f40581e = new q();
                        this.f40582f = new q();
                        this.f40583g = new x((i10 + 1) * 2);
                        this.controlState$volatile = i10 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(jr.h.o("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(da.e.m("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        throw new IllegalArgumentException(jr.h.o("Core pool size ", i10, " should be at least 1").toString());
    }

    public static /* synthetic */ void c(c cVar, Runnable runnable, boolean z10, int i10) {
        de.d dVar;
        if ((i10 & 2) != 0) {
            dVar = k.f40598g;
        } else {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        cVar.b(runnable, dVar, z10);
    }

    public final int a() {
        synchronized (this.f40583g) {
            try {
                if (f40575j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f40574i;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f40577a) {
                    return 0;
                }
                if (i10 >= this.f40578b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 > 0 && this.f40583g.b(i12) == null) {
                    a aVar = new a(this, i12);
                    this.f40583g.c(i12, aVar);
                    if (i12 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i13 = i11 + 1;
                        aVar.start();
                        return i13;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Runnable runnable, de.d dVar, boolean z10) {
        i jVar;
        boolean z11;
        long j10;
        a aVar;
        boolean a10;
        b bVar;
        k.f40597f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f40589a = nanoTime;
            jVar.f40590b = dVar;
        } else {
            jVar = new j(runnable, nanoTime, dVar);
        }
        boolean z12 = false;
        if (jVar.f40590b.f14317a == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40574i;
        if (z11) {
            j10 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j10 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !Intrinsics.a(aVar.f40566h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f40561c) != b.f40571e && (jVar.f40590b.f14317a != 0 || bVar != b.f40568b)) {
            aVar.f40565g = true;
            m mVar = aVar.f40559a;
            if (z10) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f40601b.getAndSet(mVar, jVar);
                if (iVar == null) {
                    jVar = null;
                } else {
                    jVar = mVar.a(iVar);
                }
            }
        }
        if (jVar != null) {
            if (jVar.f40590b.f14317a == 1) {
                a10 = this.f40582f.a(jVar);
            } else {
                a10 = this.f40581e.a(jVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(nn.d.o(new StringBuilder(), this.f40580d, " was terminated"));
            }
        }
        if (z10 && aVar != null) {
            z12 = true;
        }
        if (z11) {
            if (!z12 && !g() && !f(j10)) {
                g();
                return;
            }
            return;
        }
        if (!z12 && !g() && !f(atomicLongFieldUpdater.get(this))) {
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = xu.c.f40575j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof xu.a
            r3 = 0
            if (r1 == 0) goto L18
            xu.a r0 = (xu.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            xu.c r1 = r0.f40566h
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            vu.x r1 = r8.f40583g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = xu.c.f40574i     // Catch: java.lang.Throwable -> Lc4
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc4
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L79
            r1 = r2
        L37:
            vu.x r5 = r8.f40583g
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.Intrinsics.c(r5)
            xu.a r5 = (xu.a) r5
            if (r5 == r0) goto L74
        L44:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L55
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L55:
            xu.m r5 = r5.f40559a
            xu.f r6 = r8.f40582f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = xu.m.f40601b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            xu.i r7 = (xu.i) r7
            if (r7 == 0) goto L69
            r6.a(r7)
        L69:
            xu.i r7 = r5.b()
            if (r7 != 0) goto L70
            goto L74
        L70:
            r6.a(r7)
            goto L69
        L74:
            if (r1 == r4) goto L79
            int r1 = r1 + 1
            goto L37
        L79:
            xu.f r1 = r8.f40582f
            r1.b()
            xu.f r1 = r8.f40581e
            r1.b()
        L83:
            if (r0 == 0) goto L8b
            xu.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb3
        L8b:
            xu.f r1 = r8.f40581e
            java.lang.Object r1 = r1.d()
            xu.i r1 = (xu.i) r1
            if (r1 != 0) goto Lb3
            xu.f r1 = r8.f40582f
            java.lang.Object r1 = r1.d()
            xu.i r1 = (xu.i) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            xu.b r1 = xu.b.f40571e
            r0.h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xu.c.f40573h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xu.c.f40574i
            r0.set(r8, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L83
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L83
        Lc4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.c.close():void");
    }

    public final void d(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f40573h.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == f40576k) {
                            i12 = -1;
                            break;
                        }
                        if (c10 == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) c10;
                        int b10 = aVar2.b();
                        if (b10 != 0) {
                            i12 = b10;
                            break;
                        }
                        c10 = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f40573h.compareAndSet(this, j10, i12 | j11)) {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, false, 6);
    }

    public final boolean f(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f40577a;
        if (i10 < i11) {
            int a10 = a();
            if (a10 == 1 && i11 > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        kp.g gVar;
        int i10;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f40573h;
            long j10 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f40583g.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c10 = aVar.c();
                while (true) {
                    gVar = f40576k;
                    if (c10 == gVar) {
                        i10 = -1;
                        break;
                    }
                    if (c10 == null) {
                        i10 = 0;
                        break;
                    }
                    a aVar2 = (a) c10;
                    i10 = aVar2.b();
                    if (i10 != 0) {
                        break;
                    }
                    c10 = aVar2.c();
                }
                if (i10 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j10, j11 | i10)) {
                    aVar.g(gVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f40558i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i10;
        ArrayList arrayList = new ArrayList();
        x xVar = this.f40583g;
        int a10 = xVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a10; i16++) {
            a aVar = (a) xVar.b(i16);
            if (aVar != null) {
                m mVar = aVar.f40559a;
                mVar.getClass();
                if (m.f40601b.get(mVar) != null) {
                    i10 = (m.f40602c.get(mVar) - m.f40603d.get(mVar)) + 1;
                } else {
                    i10 = m.f40602c.get(mVar) - m.f40603d.get(mVar);
                }
                int ordinal = aVar.f40561c.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i15++;
                                }
                            } else {
                                i14++;
                                if (i10 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i10);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i13++;
                        }
                    } else {
                        i12++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i11++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i10);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j10 = f40574i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f40580d);
        sb5.append('@');
        sb5.append(i0.w(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f40577a;
        sb5.append(i17);
        sb5.append(", max = ");
        jr.h.v(sb5, this.f40578b, "}, Worker States {CPU = ", i11, ", blocking = ");
        jr.h.v(sb5, i12, ", parked = ", i13, ", dormant = ");
        jr.h.v(sb5, i14, ", terminated = ", i15, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f40581e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f40582f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
