package a3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class i implements op.a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f152d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f153e = Logger.getLogger(i.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final bl.j f154f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f155g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f156a;

    /* renamed from: b, reason: collision with root package name */
    public volatile e f157b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f158c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [bl.j] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    static {
        ?? r22;
        try {
            th = null;
            r22 = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
        } catch (Throwable th2) {
            th = th2;
            r22 = new Object();
        }
        f154f = r22;
        if (th != null) {
            f153e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f155g = new Object();
    }

    public static void d(i iVar) {
        h hVar;
        e eVar;
        e eVar2;
        e eVar3;
        do {
            hVar = iVar.f158c;
        } while (!f154f.t(iVar, hVar, h.f149c));
        while (true) {
            eVar = null;
            if (hVar == null) {
                break;
            }
            Thread thread = hVar.f150a;
            if (thread != null) {
                hVar.f150a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f151b;
        }
        iVar.c();
        do {
            eVar2 = iVar.f157b;
        } while (!f154f.p(iVar, eVar2, e.f140d));
        while (true) {
            eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                break;
            }
            eVar2 = eVar.f143c;
            eVar.f143c = eVar3;
        }
        while (eVar3 != null) {
            e eVar4 = eVar3.f143c;
            e(eVar3.f141a, eVar3.f142b);
            eVar3 = eVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f153e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof d)) {
                if (obj == f155g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f139a);
        }
        Throwable th2 = ((b) obj).f137b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    @Override // op.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        e eVar = this.f157b;
        e eVar2 = e.f140d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f143c = eVar;
                if (f154f.p(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.f157b;
                }
            } while (eVar != eVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        Object obj;
        String valueOf;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (RuntimeException e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e11) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e11.getCause());
                    sb2.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb2.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb2.append(valueOf);
        sb2.append("]");
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        b bVar;
        Object obj = this.f156a;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (f152d) {
                bVar = new b(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                bVar = b.f134c;
            } else {
                bVar = b.f135d;
            }
            if (f154f.r(this, obj, bVar)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    public final void g(h hVar) {
        hVar.f150a = null;
        while (true) {
            h hVar2 = this.f158c;
            if (hVar2 == h.f149c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f151b;
                if (hVar2.f150a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f151b = hVar4;
                    if (hVar3.f150a == null) {
                        break;
                    }
                } else if (!f154f.t(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009f -> B:33:0x006e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f156a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f156a != null) & true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f156a instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
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
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f156a;
        if ((obj2 != null) & true) {
            return f(obj2);
        }
        h hVar = this.f158c;
        h hVar2 = h.f149c;
        if (hVar != hVar2) {
            h hVar3 = new h();
            do {
                bl.j jVar = f154f;
                jVar.T(hVar3, hVar);
                if (jVar.t(this, hVar, hVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(hVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f156a;
                    } while (!((obj != null) & true));
                    return f(obj);
                }
                hVar = this.f158c;
            } while (hVar != hVar2);
        }
        return f(this.f156a);
    }
}
