package l7;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f24179b;

    public /* synthetic */ u(v vVar, int i10) {
        this.f24178a = i10;
        this.f24179b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        Executor executor;
        int i10 = this.f24178a;
        v vVar = this.f24179b;
        switch (i10) {
            case 0:
                if (vVar.f24187h.compareAndSet(false, true)) {
                    k kVar = vVar.f24180a.f24163e;
                    kVar.getClass();
                    kVar.a(new j(kVar, vVar.f24184e));
                }
                do {
                    AtomicBoolean atomicBoolean2 = vVar.f24186g;
                    if (atomicBoolean2.compareAndSet(false, true)) {
                        Object obj = null;
                        boolean z10 = false;
                        while (true) {
                            atomicBoolean = vVar.f24185f;
                            try {
                                if (atomicBoolean.compareAndSet(true, false)) {
                                    try {
                                        obj = vVar.f24182c.call();
                                        z10 = true;
                                    } catch (Exception e10) {
                                        throw new RuntimeException("Exception while computing database live data.", e10);
                                    }
                                } else {
                                    if (z10) {
                                        vVar.postValue(obj);
                                    }
                                    if (!z10) {
                                        return;
                                    }
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                    } else {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                boolean hasActiveObservers = vVar.hasActiveObservers();
                if (vVar.f24185f.compareAndSet(false, true) && hasActiveObservers) {
                    boolean z11 = vVar.f24181b;
                    s sVar = vVar.f24180a;
                    if (z11) {
                        executor = sVar.f24161c;
                    } else {
                        executor = sVar.f24160b;
                    }
                    executor.execute(vVar.f24188i);
                    return;
                }
                return;
        }
    }
}
