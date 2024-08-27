package uu;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class b0 implements yt.a, au.d {

    /* renamed from: a, reason: collision with root package name */
    public final yt.a f37419a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f37420b;

    public b0(yt.a aVar, CoroutineContext coroutineContext) {
        this.f37419a = aVar;
        this.f37420b = coroutineContext;
    }

    @Override // au.d
    public final au.d getCallerFrame() {
        yt.a aVar = this.f37419a;
        if (aVar instanceof au.d) {
            return (au.d) aVar;
        }
        return null;
    }

    @Override // yt.a
    public final CoroutineContext getContext() {
        return this.f37420b;
    }

    @Override // yt.a
    public final void resumeWith(Object obj) {
        this.f37419a.resumeWith(obj);
    }
}
