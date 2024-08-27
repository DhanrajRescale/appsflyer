package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a implements CoroutineContext.Element {

    /* renamed from: a, reason: collision with root package name */
    public final i f23358a;

    public a(i key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f23358a = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object R(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element g(i iVar) {
        return h.a(this, iVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final i getKey() {
        return this.f23358a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext l(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g.a(this, context);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext z(i iVar) {
        return h.b(this, iVar);
    }
}
