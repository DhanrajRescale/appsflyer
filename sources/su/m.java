package su;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobCancellationException;
import qu.t;
import qu.u1;

/* loaded from: classes2.dex */
public final class m extends qu.a implements n, g {

    /* renamed from: d, reason: collision with root package name */
    public final g f34821d;

    public m(CoroutineContext coroutineContext, c cVar) {
        super(coroutineContext, true);
        this.f34821d = cVar;
    }

    @Override // qu.x1, qu.o1
    public final void a(CancellationException cancellationException) {
        Object P = P();
        if (!(P instanceof t)) {
            if (!(P instanceof u1) || !((u1) P).e()) {
                if (cancellationException == null) {
                    cancellationException = new JobCancellationException(B(), null, this);
                }
                y(cancellationException);
            }
        }
    }

    @Override // qu.a, qu.x1, qu.o1
    public final boolean b() {
        return super.b();
    }

    @Override // su.o
    public final Object f(au.i iVar) {
        return this.f34821d.f(iVar);
    }

    @Override // su.p
    public final Object h(Object obj, yt.a aVar) {
        return this.f34821d.h(obj, aVar);
    }

    @Override // su.o
    public final Object i() {
        return this.f34821d.i();
    }

    @Override // su.o
    public final b iterator() {
        return this.f34821d.iterator();
    }

    @Override // su.p
    public final boolean k(Throwable th2) {
        return this.f34821d.k(th2);
    }

    @Override // qu.a
    public final void k0(Throwable th2, boolean z10) {
        if (!this.f34821d.k(th2) && !z10) {
            el.l.k0(this.f32177c, th2);
        }
    }

    @Override // qu.a
    public final void l0(Object obj) {
        this.f34821d.k(null);
    }

    @Override // su.p
    public final Object o(Object obj) {
        return this.f34821d.o(obj);
    }

    @Override // qu.x1
    public final void y(CancellationException cancellationException) {
        this.f34821d.a(cancellationException);
        w(cancellationException);
    }
}
