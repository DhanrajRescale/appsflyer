package qu;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import ut.l;

/* loaded from: classes2.dex */
public final class a2 extends h2 {

    /* renamed from: d, reason: collision with root package name */
    public final yt.a f32181d;

    public a2(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f32181d = zt.f.a(this, this, function2);
    }

    @Override // qu.x1
    public final void f0() {
        try {
            yt.a b10 = zt.f.b(this.f32181d);
            l.Companion companion = ut.l.INSTANCE;
            vu.i.a(b10, Unit.f23355a, null);
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            resumeWith(ut.n.a(th2));
            throw th2;
        }
    }
}
