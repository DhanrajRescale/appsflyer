package ll;

import com.facebook.bolts.ExecutorException;
import h.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    public static final g f24924h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f24925i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f24926j;

    /* renamed from: k, reason: collision with root package name */
    public static final m f24927k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f24928a;

    /* renamed from: b, reason: collision with root package name */
    public final Condition f24929b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24930c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24931d;

    /* renamed from: e, reason: collision with root package name */
    public Object f24932e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f24933f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f24934g;

    static {
        h hVar = h.f24911c;
        ExecutorService executorService = hVar.f24912a;
        f24924h = hVar.f24913b;
        o0 o0Var = b.f24901b.f24904a;
        new m((Boolean) null);
        f24925i = new m(Boolean.TRUE);
        f24926j = new m(Boolean.FALSE);
        f24927k = new m(0);
    }

    public m() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f24928a = reentrantLock;
        this.f24929b = reentrantLock.newCondition();
        this.f24934g = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final m b(HashMap hashMap) {
        if (hashMap instanceof Boolean) {
            if (((Boolean) hashMap).booleanValue()) {
                return f24925i;
            }
            return f24926j;
        }
        m mVar = new m();
        if (mVar.g(hashMap)) {
            return mVar;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.".toString());
    }

    public final m a(i continuation) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        g executor = f24924h;
        Intrinsics.checkNotNullParameter(executor, "executor");
        n nVar = new n();
        ReentrantLock reentrantLock = this.f24928a;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            try {
                boolean z10 = this.f24930c;
                reentrantLock.unlock();
                int i10 = 0;
                if (!z10 && (arrayList = this.f24934g) != null) {
                    arrayList.add(new k(nVar, continuation, executor, i10));
                }
                Unit unit = Unit.f23355a;
                if (z10) {
                    try {
                        executor.execute(new l(nVar, continuation, this, i10));
                    } catch (Exception e10) {
                        nVar.b(new ExecutorException(e10));
                    }
                }
                return nVar.f24935a;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Exception c() {
        ReentrantLock reentrantLock = this.f24928a;
        reentrantLock.lock();
        try {
            return this.f24933f;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final m d(i continuation) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        g executor = f24924h;
        Intrinsics.checkNotNullParameter(executor, "executor");
        j continuation2 = new j(continuation, 0);
        Intrinsics.checkNotNullParameter(continuation2, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(continuation2, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        n nVar = new n();
        ReentrantLock reentrantLock = this.f24928a;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            try {
                boolean z10 = this.f24930c;
                reentrantLock.unlock();
                int i10 = 1;
                if (!z10 && (arrayList = this.f24934g) != null) {
                    arrayList.add(new k(nVar, continuation2, executor, i10));
                }
                Unit unit = Unit.f23355a;
                if (z10) {
                    try {
                        executor.execute(new l(nVar, continuation2, this, i10));
                    } catch (Exception e10) {
                        nVar.b(new ExecutorException(e10));
                    }
                }
                return nVar.f24935a;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e() {
        ReentrantLock reentrantLock = this.f24928a;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.f24934g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((i) it.next()).then(this);
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
            }
            this.f24934g = null;
            Unit unit = Unit.f23355a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final boolean f() {
        ReentrantLock reentrantLock = this.f24928a;
        reentrantLock.lock();
        try {
            if (this.f24930c) {
                reentrantLock.unlock();
                return false;
            }
            this.f24930c = true;
            this.f24931d = true;
            this.f24929b.signalAll();
            e();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean g(Object obj) {
        ReentrantLock reentrantLock = this.f24928a;
        reentrantLock.lock();
        try {
            if (this.f24930c) {
                reentrantLock.unlock();
                return false;
            }
            this.f24930c = true;
            this.f24932e = obj;
            this.f24929b.signalAll();
            e();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public m(Boolean bool) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f24928a = reentrantLock;
        this.f24929b = reentrantLock.newCondition();
        this.f24934g = new ArrayList();
        g(bool);
    }

    public m(int i10) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f24928a = reentrantLock;
        this.f24929b = reentrantLock.newCondition();
        this.f24934g = new ArrayList();
        f();
    }
}
