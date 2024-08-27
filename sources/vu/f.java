package vu;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class f implements qu.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f38365a;

    public f(CoroutineContext coroutineContext) {
        this.f38365a = coroutineContext;
    }

    @Override // qu.f0
    public final CoroutineContext H() {
        return this.f38365a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f38365a + ')';
    }
}
