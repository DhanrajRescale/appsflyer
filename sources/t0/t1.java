package t0;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class t1 implements g1, qu.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f35211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f35212b;

    public t1(g1 g1Var, CoroutineContext coroutineContext) {
        this.f35211a = coroutineContext;
        this.f35212b = g1Var;
    }

    @Override // qu.f0
    public final CoroutineContext H() {
        return this.f35211a;
    }

    @Override // t0.l3
    public final Object getValue() {
        return this.f35212b.getValue();
    }

    @Override // t0.g1
    public final void setValue(Object obj) {
        this.f35212b.setValue(obj);
    }
}
