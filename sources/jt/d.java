package jt;

import at.n;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import yk.g;
import zq.f;

/* loaded from: classes2.dex */
public final class d extends AtomicReference implements n, ct.b {
    private static final long serialVersionUID = -7012088219455310787L;

    /* renamed from: a, reason: collision with root package name */
    public final et.c f21664a;

    /* renamed from: b, reason: collision with root package name */
    public final et.c f21665b;

    public d(et.c cVar, et.c cVar2) {
        this.f21664a = cVar;
        this.f21665b = cVar2;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        ft.b.e(this, bVar);
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        lazySet(ft.b.f16240a);
        try {
            this.f21665b.b(th2);
        } catch (Throwable th3) {
            f.l0(th3);
            g.M(new CompositeException(th2, th3));
        }
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        lazySet(ft.b.f16240a);
        try {
            this.f21664a.b(obj);
        } catch (Throwable th2) {
            f.l0(th2);
            g.M(th2);
        }
    }
}
