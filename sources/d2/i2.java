package d2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i2 implements g1.q {

    /* renamed from: a, reason: collision with root package name */
    public final t0.k1 f13459a = dp.b.y1(1.0f);

    @Override // kotlin.coroutines.CoroutineContext
    public final Object R(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.a(this, iVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext l(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kotlin.coroutines.g.a(this, context);
    }

    @Override // g1.q
    public final float x() {
        return this.f13459a.i();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.b(this, iVar);
    }
}
