package z4;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import qu.c0;
import qu.f0;
import qu.o1;

/* loaded from: classes.dex */
public final class a implements AutoCloseable, f0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f42007a;

    public a(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f42007a = coroutineContext;
    }

    @Override // qu.f0
    public final CoroutineContext H() {
        return this.f42007a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        o1 o1Var = (o1) this.f42007a.g(c0.f32192b);
        if (o1Var != null) {
            o1Var.a(null);
        }
    }
}
