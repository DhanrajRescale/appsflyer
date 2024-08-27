package pt;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class w extends AtomicReferenceArray implements Runnable, Callable, ct.b {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f31399b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f31400c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f31401d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f31402e = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f31403a;

    public w(Runnable runnable, ft.a aVar) {
        super(3);
        this.f31403a = runnable;
        lazySet(0, aVar);
    }

    @Override // ct.b
    public final void a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z10;
        while (true) {
            Object obj6 = get(1);
            obj = f31402e;
            if (obj6 == obj || obj6 == (obj4 = f31400c) || obj6 == (obj5 = f31401d)) {
                break;
            }
            if (get(2) != Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z10);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f31399b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((ft.a) obj2).d(this);
    }

    public final void b(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f31402e) {
                return;
            }
            if (obj == f31400c) {
                future.cancel(false);
                return;
            } else if (obj == f31401d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean compareAndSet;
        Object obj2;
        Object obj3;
        Object obj4 = f31401d;
        Object obj5 = f31400c;
        Object obj6 = f31399b;
        Object obj7 = f31402e;
        lazySet(2, Thread.currentThread());
        try {
            this.f31403a.run();
        } finally {
            try {
                lazySet(2, null);
                obj2 = get(0);
                if (obj2 != obj6) {
                    ((ft.a) obj2).d(this);
                }
                do {
                    obj3 = get(1);
                    if (obj3 != obj5) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj3, obj7));
            } catch (Throwable th2) {
                do {
                    if (obj == obj5 || obj == obj4) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj2 = get(0);
        if (obj2 != obj6 && compareAndSet(0, obj2, obj7) && obj2 != null) {
            ((ft.a) obj2).d(this);
        }
        do {
            obj3 = get(1);
            if (obj3 != obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }
}
