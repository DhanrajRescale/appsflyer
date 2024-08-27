package uu;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q implements CoroutineContext {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f37460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f37461b;

    public q(CoroutineContext coroutineContext, Throwable th2) {
        this.f37460a = th2;
        this.f37461b = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object R(Object obj, Function2 function2) {
        return this.f37461b.R(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.i iVar) {
        return this.f37461b.g(iVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext l(CoroutineContext coroutineContext) {
        return this.f37461b.l(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.i iVar) {
        return this.f37461b.z(iVar);
    }
}
