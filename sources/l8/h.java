package l8;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class h implements op.a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f24223d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f24224e = Logger.getLogger(h.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final bl.j f24225f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f24226g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f24227a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f24228b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f24229c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [bl.j] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    static {
        ?? r22;
        try {
            th = null;
            r22 = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
        } catch (Throwable th2) {
            th = th2;
            r22 = new Object();
        }
        f24225f = r22;
        if (th != null) {
            f24224e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f24226g = new Object();
    }

    public static void c(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f24229c;
            if (f24225f.u(hVar, gVar, g.f24220c)) {
                while (gVar != null) {
                    Thread thread = gVar.f24221a;
                    if (thread != null) {
                        gVar.f24221a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f24222b;
                }
                do {
                    cVar = hVar.f24228b;
                } while (!f24225f.q(hVar, cVar, c.f24209d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f24212c;
                    cVar3.f24212c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f24212c;
                    Runnable runnable = cVar2.f24210a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f24218a;
                        if (hVar.f24227a == eVar) {
                            if (f24225f.s(hVar, eVar, f(eVar.f24219b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f24211b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f24224e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == f24226g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).f24208a);
        }
        Throwable th2 = ((a) obj).f24206b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public static Object f(op.a aVar) {
        if (aVar instanceof h) {
            Object obj = ((h) aVar).f24227a;
            if (obj instanceof a) {
                a aVar2 = (a) obj;
                if (aVar2.f24205a) {
                    if (aVar2.f24206b != null) {
                        return new a(aVar2.f24206b, false);
                    }
                    return a.f24204d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f24223d) & isCancelled) {
            return a.f24204d;
        }
        try {
            Object g10 = g(aVar);
            if (g10 == null) {
                return f24226g;
            }
            return g10;
        } catch (CancellationException e10) {
            if (!isCancelled) {
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
            }
            return new a(e10, false);
        } catch (ExecutionException e11) {
            return new b(e11.getCause());
        } catch (Throwable th2) {
            return new b(th2);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // op.a
    public final void a(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        c cVar = this.f24228b;
        c cVar2 = c.f24209d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f24212c = cVar;
                if (f24225f.q(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f24228b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        String valueOf;
        try {
            Object g10 = g(this);
            sb2.append("SUCCESS, result=[");
            if (g10 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(g10);
            }
            sb2.append(valueOf);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        a aVar;
        boolean z12;
        Object obj = this.f24227a;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z11 | (obj instanceof e))) {
            return false;
        }
        if (f24223d) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z10);
        } else if (z10) {
            aVar = a.f24203c;
        } else {
            aVar = a.f24204d;
        }
        h hVar = this;
        boolean z13 = false;
        while (true) {
            if (f24225f.s(hVar, obj, aVar)) {
                c(hVar);
                if (!(obj instanceof e)) {
                    return true;
                }
                op.a aVar2 = ((e) obj).f24219b;
                if (aVar2 instanceof h) {
                    hVar = (h) aVar2;
                    obj = hVar.f24227a;
                    if (obj == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!(z12 | (obj instanceof e))) {
                        return true;
                    }
                    z13 = true;
                } else {
                    aVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = hVar.f24227a;
                if (!(obj instanceof e)) {
                    return z13;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:33:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.h.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        String valueOf;
        Object obj = this.f24227a;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            op.a aVar = ((e) obj).f24219b;
            if (aVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(aVar);
            }
            return nn.d.o(sb2, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void i(g gVar) {
        gVar.f24221a = null;
        while (true) {
            g gVar2 = this.f24229c;
            if (gVar2 == g.f24220c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f24222b;
                if (gVar2.f24221a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f24222b = gVar4;
                    if (gVar3.f24221a == null) {
                        break;
                    }
                } else if (!f24225f.u(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24227a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        if (this.f24227a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(r0 instanceof e)) & z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f24227a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = h();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f24227a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar = this.f24229c;
            g gVar2 = g.f24220c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    bl.j jVar = f24225f;
                    jVar.U(gVar3, gVar);
                    if (jVar.u(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                            obj = this.f24227a;
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar = this.f24229c;
                } while (gVar != gVar2);
            }
            return e(this.f24227a);
        }
        throw new InterruptedException();
    }
}
