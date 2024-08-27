package vu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import qu.k0;
import qu.n0;
import qu.t0;

/* loaded from: classes2.dex */
public final class n extends qu.b0 implements n0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38389h = AtomicIntegerFieldUpdater.newUpdater(n.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final qu.b0 f38390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f38392e;

    /* renamed from: f, reason: collision with root package name */
    public final q f38393f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f38394g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public n(qu.b0 b0Var, int i10) {
        n0 n0Var;
        this.f38390c = b0Var;
        this.f38391d = i10;
        if (b0Var instanceof n0) {
            n0Var = (n0) b0Var;
        } else {
            n0Var = null;
        }
        this.f38392e = n0Var == null ? k0.f32230a : n0Var;
        this.f38393f = new q();
        this.f38394g = new Object();
    }

    @Override // qu.n0
    public final t0 H(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f38392e.H(j10, runnable, coroutineContext);
    }

    @Override // qu.b0
    public final void b0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable f02;
        this.f38393f.a(runnable);
        if (f38389h.get(this) < this.f38391d && g0() && (f02 = f0()) != null) {
            this.f38390c.b0(this, new m.j(27, this, f02));
        }
    }

    @Override // qu.b0
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable f02;
        this.f38393f.a(runnable);
        if (f38389h.get(this) < this.f38391d && g0() && (f02 = f0()) != null) {
            this.f38390c.c0(this, new m.j(27, this, f02));
        }
    }

    @Override // qu.n0
    public final void f(long j10, qu.i iVar) {
        this.f38392e.f(j10, iVar);
    }

    public final Runnable f0() {
        while (true) {
            Runnable runnable = (Runnable) this.f38393f.d();
            if (runnable == null) {
                synchronized (this.f38394g) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38389h;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f38393f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    public final boolean g0() {
        synchronized (this.f38394g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38389h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f38391d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
