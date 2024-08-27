package qu;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class k1 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f32231a;

    public k1(Function1 function1) {
        this.f32231a = function1;
    }

    @Override // qu.l1
    public final void e(Throwable th2) {
        this.f32231a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f32231a.getClass().getSimpleName() + '@' + i0.w(this) + ']';
    }
}
