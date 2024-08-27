package qu;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class p2 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f32252c = 0;

    static {
        new b0();
    }

    @Override // qu.b0
    public final void b0(CoroutineContext coroutineContext, Runnable runnable) {
        t2 t2Var = (t2) coroutineContext.g(t2.f32272c);
        if (t2Var != null) {
            t2Var.f32273b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // qu.b0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
