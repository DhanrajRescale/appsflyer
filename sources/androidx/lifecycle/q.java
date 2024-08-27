package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import qu.o1;

/* loaded from: classes.dex */
public final class q implements r, qu.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f1957a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f1958b;

    public q(o lifecycle, CoroutineContext coroutineContext) {
        o1 o1Var;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f1957a = lifecycle;
        this.f1958b = coroutineContext;
        if (lifecycle.b() == n.f1947a && (o1Var = (o1) coroutineContext.g(qu.c0.f32192b)) != null) {
            o1Var.a(null);
        }
    }

    @Override // qu.f0
    public final CoroutineContext H() {
        return this.f1958b;
    }

    @Override // androidx.lifecycle.r
    public final void c(t source, m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        o oVar = this.f1957a;
        if (oVar.b().compareTo(n.f1947a) <= 0) {
            oVar.c(this);
            o1 o1Var = (o1) this.f1958b.g(qu.c0.f32192b);
            if (o1Var != null) {
                o1Var.a(null);
            }
        }
    }
}
