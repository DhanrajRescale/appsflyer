package ll;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24915b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f24914a = i10;
        this.f24915b = obj;
    }

    @Override // ll.i
    public final Object then(m task) {
        ReentrantLock reentrantLock;
        boolean z10 = false;
        int i10 = this.f24914a;
        Object obj = this.f24915b;
        switch (i10) {
            case 0:
                i continuation = (i) obj;
                Intrinsics.checkNotNullParameter(continuation, "$continuation");
                Intrinsics.checkNotNullParameter(task, "task");
                reentrantLock = task.f24928a;
                reentrantLock.lock();
                try {
                    if (task.f24933f != null) {
                        z10 = true;
                    }
                    reentrantLock.unlock();
                    g gVar = m.f24924h;
                    if (z10) {
                        Exception c10 = task.c();
                        m mVar = new m();
                        reentrantLock = mVar.f24928a;
                        reentrantLock.lock();
                        try {
                            if (!mVar.f24930c) {
                                mVar.f24930c = true;
                                mVar.f24933f = c10;
                                mVar.f24929b.signalAll();
                                mVar.e();
                                return mVar;
                            }
                            reentrantLock.unlock();
                            throw new IllegalStateException("Cannot set the error on a completed task.".toString());
                        } finally {
                        }
                    }
                    task.f24928a.lock();
                    try {
                        if (task.f24931d) {
                            return m.f24927k;
                        }
                        return task.a(continuation);
                    } finally {
                    }
                } finally {
                }
            default:
                n tcs = (n) obj;
                Intrinsics.checkNotNullParameter(tcs, "$tcs");
                Intrinsics.checkNotNullParameter(task, "task");
                task.f24928a.lock();
                try {
                    if (task.f24931d) {
                        tcs.a();
                        return null;
                    }
                    reentrantLock = task.f24928a;
                    reentrantLock.lock();
                    try {
                        if (task.f24933f != null) {
                            z10 = true;
                        }
                        if (z10) {
                            tcs.b(task.c());
                            return null;
                        }
                        reentrantLock.lock();
                        try {
                            Object obj2 = task.f24932e;
                            reentrantLock.unlock();
                            tcs.c(obj2);
                            return null;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
        }
    }
}
