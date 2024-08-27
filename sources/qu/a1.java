package qu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a1 extends b1 implements n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32178g = AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32179h = AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, "_delayed$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32180i = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // qu.n0
    public t0 H(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return k0.f32230a.H(j10, runnable, coroutineContext);
    }

    @Override // qu.b0
    public final void b0(CoroutineContext coroutineContext, Runnable runnable) {
        n0(runnable);
    }

    @Override // qu.n0
    public final void f(long j10, i iVar) {
        kp.g gVar = c1.f32193a;
        long j11 = 0;
        if (j10 > 0) {
            if (j10 >= 9223372036854L) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = 1000000 * j10;
            }
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            w0 w0Var = new w0(this, j11 + nanoTime, iVar);
            q0(nanoTime, w0Var);
            yk.g.G(iVar, new f(w0Var, 2));
        }
    }

    @Override // qu.b1
    public final long k0() {
        Runnable runnable;
        long j10;
        y0 y0Var;
        y0 y0Var2;
        if (l0()) {
            return 0L;
        }
        z0 z0Var = (z0) f32179h.get(this);
        y0 y0Var3 = null;
        if (z0Var != null && vu.g0.f38371b.get(z0Var) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (z0Var) {
                    y0[] y0VarArr = z0Var.f38372a;
                    if (y0VarArr != null) {
                        y0Var = y0VarArr[0];
                    } else {
                        y0Var = null;
                    }
                    if (y0Var == null) {
                        y0Var2 = null;
                    } else if (nanoTime - y0Var.f32299a >= 0 && o0(y0Var)) {
                        y0Var2 = z0Var.b(0);
                    } else {
                        y0Var2 = null;
                    }
                }
            } while (y0Var2 != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32178g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (obj instanceof vu.s) {
                vu.s sVar = (vu.s) obj;
                Object d10 = sVar.d();
                if (d10 != vu.s.f38403g) {
                    runnable = (Runnable) d10;
                    break;
                }
                vu.s c10 = sVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == c1.f32194b) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (Runnable) obj;
                break loop1;
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        vt.q qVar = this.f32187e;
        if (qVar == null || qVar.isEmpty()) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = 0;
        }
        if (j10 == 0) {
            return 0L;
        }
        Object obj2 = f32178g.get(this);
        if (obj2 != null) {
            if (obj2 instanceof vu.s) {
                long j11 = vu.s.f38402f.get((vu.s) obj2);
                if (((int) (1073741823 & j11)) != ((int) ((j11 & 1152921503533105152L) >> 30))) {
                    return 0L;
                }
            } else {
                if (obj2 != c1.f32194b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        z0 z0Var2 = (z0) f32179h.get(this);
        if (z0Var2 != null) {
            synchronized (z0Var2) {
                y0[] y0VarArr2 = z0Var2.f38372a;
                if (y0VarArr2 != null) {
                    y0Var3 = y0VarArr2[0];
                }
            }
            if (y0Var3 != null) {
                return kotlin.ranges.d.b(y0Var3.f32299a - System.nanoTime());
            }
        }
        return Long.MAX_VALUE;
    }

    public void n0(Runnable runnable) {
        if (o0(runnable)) {
            Thread h02 = h0();
            if (Thread.currentThread() != h02) {
                LockSupport.unpark(h02);
                return;
            }
            return;
        }
        j0.f32226j.n0(runnable);
    }

    public final boolean o0(Runnable runnable) {
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32178g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f32180i.get(this) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (obj instanceof vu.s) {
                vu.s sVar = (vu.s) obj;
                int a10 = sVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    if (a10 == 2) {
                        return false;
                    }
                } else {
                    vu.s c10 = sVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            } else {
                if (obj == c1.f32194b) {
                    return false;
                }
                vu.s sVar2 = new vu.s(8, true);
                sVar2.a((Runnable) obj);
                sVar2.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
        }
    }

    public final boolean p0() {
        boolean z10;
        vt.q qVar = this.f32187e;
        if (qVar != null) {
            z10 = qVar.isEmpty();
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        z0 z0Var = (z0) f32179h.get(this);
        if (z0Var != null && vu.g0.f38371b.get(z0Var) != 0) {
            return false;
        }
        Object obj = f32178g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof vu.s) {
            long j10 = vu.s.f38402f.get((vu.s) obj);
            if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == c1.f32194b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, qu.z0] */
    public final void q0(long j10, y0 y0Var) {
        boolean z10;
        int d10;
        Thread h02;
        if (f32180i.get(this) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32179h;
        y0 y0Var2 = null;
        if (z10) {
            d10 = 1;
        } else {
            z0 z0Var = (z0) atomicReferenceFieldUpdater.get(this);
            if (z0Var == null) {
                ?? obj = new Object();
                obj.f32309c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                Intrinsics.c(obj2);
                z0Var = (z0) obj2;
            }
            d10 = y0Var.d(j10, z0Var, this);
        }
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                m0(j10, y0Var);
                return;
            }
        }
        z0 z0Var2 = (z0) atomicReferenceFieldUpdater.get(this);
        if (z0Var2 != null) {
            synchronized (z0Var2) {
                y0[] y0VarArr = z0Var2.f38372a;
                if (y0VarArr != null) {
                    y0Var2 = y0VarArr[0];
                }
            }
        }
        if (y0Var2 == y0Var && Thread.currentThread() != (h02 = h0())) {
            LockSupport.unpark(h02);
        }
    }

    @Override // qu.b1
    public void shutdown() {
        y0 y0Var;
        ThreadLocal threadLocal = k2.f32232a;
        k2.f32232a.set(null);
        f32180i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32178g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                kp.g gVar = c1.f32194b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, gVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            }
            if (obj instanceof vu.s) {
                ((vu.s) obj).b();
                break;
            }
            if (obj != c1.f32194b) {
                vu.s sVar = new vu.s(8, true);
                sVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        do {
        } while (k0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            z0 z0Var = (z0) f32179h.get(this);
            if (z0Var != null) {
                synchronized (z0Var) {
                    if (vu.g0.f38371b.get(z0Var) > 0) {
                        y0Var = z0Var.b(0);
                    } else {
                        y0Var = null;
                    }
                }
                if (y0Var != null) {
                    m0(nanoTime, y0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
