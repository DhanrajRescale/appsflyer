package mt;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k extends at.e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28025a;

    public k(Integer num) {
        this.f28025a = num;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f28025a;
    }

    @Override // at.e
    public final void f(at.g gVar) {
        o oVar = new o(gVar, this.f28025a);
        gVar.c(oVar);
        oVar.run();
    }
}
