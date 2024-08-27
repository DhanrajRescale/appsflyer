package jt;

import at.g;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import ll.f;

/* loaded from: classes2.dex */
public final class e extends AtomicReference implements g, ct.b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: a, reason: collision with root package name */
    public final et.c f21666a;

    /* renamed from: b, reason: collision with root package name */
    public final et.c f21667b;

    /* renamed from: c, reason: collision with root package name */
    public final et.a f21668c;

    /* renamed from: d, reason: collision with root package name */
    public final et.c f21669d;

    public e(et.c cVar, et.c cVar2) {
        ll.e eVar = gt.e.f17570b;
        f fVar = gt.e.f17571c;
        this.f21666a = cVar;
        this.f21667b = cVar2;
        this.f21668c = eVar;
        this.f21669d = fVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    @Override // at.g
    public final void b(Object obj) {
        if (!d()) {
            try {
                this.f21666a.b(obj);
            } catch (Throwable th2) {
                zq.f.l0(th2);
                ((ct.b) get()).a();
                onError(th2);
            }
        }
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        if (ft.b.e(this, bVar)) {
            try {
                this.f21669d.b(this);
            } catch (Throwable th2) {
                zq.f.l0(th2);
                bVar.a();
                onError(th2);
            }
        }
    }

    public final boolean d() {
        if (get() == ft.b.f16240a) {
            return true;
        }
        return false;
    }

    @Override // at.g
    public final void onComplete() {
        if (!d()) {
            lazySet(ft.b.f16240a);
            try {
                this.f21668c.run();
            } catch (Throwable th2) {
                zq.f.l0(th2);
                yk.g.M(th2);
            }
        }
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        if (!d()) {
            lazySet(ft.b.f16240a);
            try {
                this.f21667b.b(th2);
                return;
            } catch (Throwable th3) {
                zq.f.l0(th3);
                yk.g.M(new CompositeException(th2, th3));
                return;
            }
        }
        yk.g.M(th2);
    }
}
