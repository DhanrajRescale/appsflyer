package l7;

import android.database.Cursor;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public volatile p7.a f24159a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f24160b;

    /* renamed from: c, reason: collision with root package name */
    public y f24161c;

    /* renamed from: d, reason: collision with root package name */
    public p7.d f24162d;

    /* renamed from: e, reason: collision with root package name */
    public final k f24163e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24164f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24165g;

    /* renamed from: h, reason: collision with root package name */
    public List f24166h;

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantReadWriteLock f24167i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f24168j = new ThreadLocal();

    public s() {
        new ConcurrentHashMap();
        this.f24163e = d();
    }

    public final void a() {
        if (this.f24164f || Looper.getMainLooper().getThread() != Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((q7.b) this.f24162d.A()).f31808a.inTransaction() && this.f24168j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        p7.a A = this.f24162d.A();
        this.f24163e.f(A);
        ((q7.b) A).a();
    }

    public abstract k d();

    public abstract p7.d e(a aVar);

    public final void f() {
        ((q7.b) this.f24162d.A()).b();
        if (!((q7.b) this.f24162d.A()).f31808a.inTransaction()) {
            k kVar = this.f24163e;
            if (kVar.f24132e.compareAndSet(false, true)) {
                kVar.f24131d.f24160b.execute(kVar.f24138k);
            }
        }
    }

    public final Cursor g(p7.e eVar) {
        a();
        b();
        return ((q7.b) this.f24162d.A()).f(eVar);
    }

    public final void h() {
        ((q7.b) this.f24162d.A()).g();
    }
}
