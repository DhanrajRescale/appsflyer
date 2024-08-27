package j9;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorService f21136e = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f21137a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f21138b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f21139c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile c0 f21140d = null;

    public d0(Callable callable, boolean z10) {
        if (z10) {
            try {
                c((c0) callable.call());
                return;
            } catch (Throwable th2) {
                c(new c0(th2));
                return;
            }
        }
        f21136e.execute(new androidx.loader.content.h(this, callable, 1));
    }

    public final synchronized void a(a0 a0Var) {
        Throwable th2;
        try {
            c0 c0Var = this.f21140d;
            if (c0Var != null && (th2 = c0Var.f21134b) != null) {
                a0Var.onResult(th2);
            }
            this.f21138b.add(a0Var);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(a0 a0Var) {
        Object obj;
        try {
            c0 c0Var = this.f21140d;
            if (c0Var != null && (obj = c0Var.f21133a) != null) {
                a0Var.onResult(obj);
            }
            this.f21137a.add(a0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(c0 c0Var) {
        if (this.f21140d == null) {
            this.f21140d = c0Var;
            this.f21139c.post(new androidx.activity.b(this, 22));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
