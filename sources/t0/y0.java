package t0;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y0 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f35271a;

    /* renamed from: b, reason: collision with root package name */
    public final vu.f f35272b;

    /* renamed from: c, reason: collision with root package name */
    public qu.h2 f35273c;

    public y0(CoroutineContext coroutineContext, Function2 function2) {
        this.f35271a = function2;
        this.f35272b = hl.f.d(coroutineContext);
    }

    @Override // t0.h2
    public final void a() {
        qu.h2 h2Var = this.f35273c;
        if (h2Var != null) {
            h2Var.a(new w.z0(2));
        }
        this.f35273c = null;
    }

    @Override // t0.h2
    public final void b() {
        qu.h2 h2Var = this.f35273c;
        if (h2Var != null) {
            h2Var.a(new w.z0(2));
        }
        this.f35273c = null;
    }

    @Override // t0.h2
    public final void d() {
        qu.h2 h2Var = this.f35273c;
        if (h2Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            h2Var.a(cancellationException);
        }
        this.f35273c = yk.g.H(this.f35272b, null, null, this.f35271a, 3);
    }
}
