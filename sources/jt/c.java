package jt;

import ge.p;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;
import nf.l;
import yk.g;
import zq.f;

/* loaded from: classes2.dex */
public final class c extends AtomicReference implements at.b, ct.b, et.c {
    private static final long serialVersionUID = -4361286194466301354L;

    /* renamed from: a, reason: collision with root package name */
    public final et.c f21662a;

    /* renamed from: b, reason: collision with root package name */
    public final et.a f21663b;

    public c(p pVar) {
        this.f21662a = this;
        this.f21663b = pVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    @Override // et.c
    public final void b(Object obj) {
        g.M(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // at.b
    public final void c(ct.b bVar) {
        ft.b.e(this, bVar);
    }

    @Override // at.b
    public final void onComplete() {
        try {
            this.f21663b.run();
        } catch (Throwable th2) {
            f.l0(th2);
            g.M(th2);
        }
        lazySet(ft.b.f16240a);
    }

    @Override // at.b
    public final void onError(Throwable th2) {
        try {
            this.f21662a.b(th2);
        } catch (Throwable th3) {
            f.l0(th3);
            g.M(th3);
        }
        lazySet(ft.b.f16240a);
    }

    public c(l lVar, jf.g gVar) {
        this.f21662a = gVar;
        this.f21663b = lVar;
    }
}
