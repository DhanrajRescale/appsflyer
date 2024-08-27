package xu;

import com.google.android.gms.common.api.Api;
import iu.z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40558i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final m f40559a;

    /* renamed from: b, reason: collision with root package name */
    public final z f40560b;

    /* renamed from: c, reason: collision with root package name */
    public b f40561c;

    /* renamed from: d, reason: collision with root package name */
    public long f40562d;

    /* renamed from: e, reason: collision with root package name */
    public long f40563e;

    /* renamed from: f, reason: collision with root package name */
    public int f40564f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f40566h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f40566h = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f40559a = new m();
        this.f40560b = new z();
        this.f40561c = b.f40570d;
        this.nextParkedWorker = c.f40576k;
        int nanoTime = (int) System.nanoTime();
        this.f40564f = nanoTime == 0 ? 42 : nanoTime;
        f(i10);
    }

    public final i a(boolean z10) {
        i e10;
        i e11;
        long j10;
        b bVar = this.f40561c;
        b bVar2 = b.f40567a;
        i iVar = null;
        m mVar = this.f40559a;
        boolean z11 = true;
        c cVar = this.f40566h;
        if (bVar != bVar2) {
            c cVar2 = this.f40566h;
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f40574i;
            do {
                j10 = atomicLongFieldUpdater.get(cVar2);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f40601b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || iVar2.f40590b.f14317a != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                break;
                            }
                        }
                        iVar = iVar2;
                    }
                    int i10 = m.f40603d.get(mVar);
                    int i11 = m.f40602c.get(mVar);
                    while (true) {
                        if (i10 == i11 || m.f40604e.get(mVar) == 0) {
                            break;
                        }
                        i11--;
                        i c10 = mVar.c(i11, true);
                        if (c10 != null) {
                            iVar = c10;
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar.f40582f.d();
                        if (iVar3 == null) {
                            return i(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f40574i.compareAndSet(cVar2, j10, j10 - 4398046511104L));
            this.f40561c = b.f40567a;
        }
        if (z10) {
            if (d(cVar.f40577a * 2) != 0) {
                z11 = false;
            }
            if (!z11 || (e11 = e()) == null) {
                mVar.getClass();
                i iVar4 = (i) m.f40601b.getAndSet(mVar, null);
                if (iVar4 == null) {
                    iVar4 = mVar.b();
                }
                if (iVar4 == null) {
                    if (!z11 && (e10 = e()) != null) {
                        return e10;
                    }
                } else {
                    return iVar4;
                }
            } else {
                return e11;
            }
        } else {
            i e12 = e();
            if (e12 != null) {
                return e12;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f40564f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f40564f = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i10;
    }

    public final i e() {
        int d10 = d(2);
        c cVar = this.f40566h;
        if (d10 == 0) {
            i iVar = (i) cVar.f40581e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f40582f.d();
        }
        i iVar2 = (i) cVar.f40582f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f40581e.d();
    }

    public final void f(int i10) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40566h.f40580d);
        sb2.append("-worker-");
        if (i10 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i10);
        }
        sb2.append(valueOf);
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        boolean z10;
        b bVar2 = this.f40561c;
        if (bVar2 == b.f40567a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.f40574i.addAndGet(this.f40566h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f40561c = bVar;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final xu.i i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.a.i(int):xu.i");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        loop0: while (true) {
            boolean z14 = z13;
            while (true) {
                c cVar = this.f40566h;
                cVar.getClass();
                if (c.f40575j.get(cVar) == 0) {
                    b bVar = this.f40561c;
                    b bVar2 = b.f40571e;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a10 = a(this.f40565g);
                    long j10 = -2097152;
                    if (a10 != null) {
                        this.f40563e = 0L;
                        int i10 = a10.f40590b.f14317a;
                        this.f40562d = 0L;
                        if (this.f40561c == b.f40569c) {
                            this.f40561c = b.f40568b;
                        }
                        c cVar2 = this.f40566h;
                        if (i10 != 0 && h(b.f40568b) && !cVar2.g() && !cVar2.f(c.f40574i.get(cVar2))) {
                            cVar2.g();
                        }
                        cVar2.getClass();
                        try {
                            a10.run();
                        } catch (Throwable th2) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                        }
                        if (i10 != 0) {
                            c.f40574i.addAndGet(cVar2, -2097152L);
                            if (this.f40561c != bVar2) {
                                this.f40561c = b.f40570d;
                            }
                        }
                    } else {
                        this.f40565g = z13;
                        if (this.f40563e != 0) {
                            if (!z14) {
                                z14 = true;
                            } else {
                                h(b.f40569c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f40563e);
                                this.f40563e = 0L;
                                break;
                            }
                        } else {
                            Object obj = this.nextParkedWorker;
                            kp.g gVar = c.f40576k;
                            if (obj != gVar) {
                                z10 = true;
                            } else {
                                z10 = z13;
                            }
                            if (!z10) {
                                c cVar3 = this.f40566h;
                                cVar3.getClass();
                                if (this.nextParkedWorker == gVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f40573h;
                                        long j11 = atomicLongFieldUpdater.get(cVar3);
                                        int i11 = this.indexInArray;
                                        this.nextParkedWorker = cVar3.f40583g.b((int) (j11 & 2097151));
                                        if (atomicLongFieldUpdater.compareAndSet(cVar3, j11, ((2097152 + j11) & j10) | i11)) {
                                            break;
                                        } else {
                                            j10 = -2097152;
                                        }
                                    }
                                }
                            } else {
                                f40558i.set(this, -1);
                                while (this.nextParkedWorker != c.f40576k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f40558i;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar4 = this.f40566h;
                                    cVar4.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.f40575j;
                                    if (atomicIntegerFieldUpdater3.get(cVar4) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f40561c;
                                    b bVar4 = b.f40571e;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f40569c);
                                    Thread.interrupted();
                                    if (this.f40562d == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f40562d = System.nanoTime() + this.f40566h.f40579c;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f40566h.f40579c);
                                    if (System.nanoTime() - this.f40562d >= 0) {
                                        this.f40562d = 0L;
                                        c cVar5 = this.f40566h;
                                        synchronized (cVar5.f40583g) {
                                            try {
                                                if (atomicIntegerFieldUpdater3.get(cVar5) != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (!z12) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f40574i;
                                                    if (((int) (atomicLongFieldUpdater2.get(cVar5) & 2097151)) > cVar5.f40577a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i12 = this.indexInArray;
                                                            z11 = false;
                                                            f(0);
                                                            cVar5.d(this, i12, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar5) & 2097151);
                                                            if (andDecrement != i12) {
                                                                Object b10 = cVar5.f40583g.b(andDecrement);
                                                                Intrinsics.c(b10);
                                                                a aVar = (a) b10;
                                                                cVar5.f40583g.c(i12, aVar);
                                                                aVar.f(i12);
                                                                cVar5.d(aVar, andDecrement, i12);
                                                            }
                                                            cVar5.f40583g.c(andDecrement, null);
                                                            Unit unit = Unit.f23355a;
                                                            this.f40561c = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        z13 = z11;
                                    }
                                    z11 = false;
                                    z13 = z11;
                                }
                            }
                            z13 = z13;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f40571e);
    }
}
