package ll;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final m f24935a = new m();

    public final void a() {
        if (this.f24935a.f()) {
        } else {
            throw new IllegalStateException("Cannot cancel a completed task.".toString());
        }
    }

    public final void b(Exception exc) {
        m mVar = this.f24935a;
        ReentrantLock reentrantLock = mVar.f24928a;
        reentrantLock.lock();
        try {
            if (!mVar.f24930c) {
                mVar.f24930c = true;
                mVar.f24933f = exc;
                mVar.f24929b.signalAll();
                mVar.e();
                return;
            }
            reentrantLock.unlock();
            throw new IllegalStateException("Cannot set the error on a completed task.".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(Object obj) {
        if (this.f24935a.g(obj)) {
        } else {
            throw new IllegalStateException("Cannot set the result of a completed task.".toString());
        }
    }
}
