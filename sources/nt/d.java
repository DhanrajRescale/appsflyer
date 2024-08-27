package nt;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class d extends at.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29131a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f29132b;

    public /* synthetic */ d(Callable callable, int i10) {
        this.f29131a = i10;
        this.f29132b = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ct.c, ct.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // at.m
    public final void b(at.n nVar) {
        int i10 = this.f29131a;
        Callable callable = this.f29132b;
        switch (i10) {
            case 0:
                try {
                    Object call = callable.call();
                    gt.e.a(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = (Throwable) call;
                } catch (Throwable th2) {
                    th = th2;
                    zq.f.l0(th);
                }
                nVar.c(ft.c.f16242a);
                nVar.onError(th);
                return;
            default:
                ?? atomicReference = new AtomicReference(gt.e.f17569a);
                nVar.c(atomicReference);
                if (!atomicReference.b()) {
                    try {
                        Object call2 = callable.call();
                        gt.e.a(call2, "The callable returned a null value");
                        if (!atomicReference.b()) {
                            nVar.onSuccess(call2);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        zq.f.l0(th3);
                        if (!atomicReference.b()) {
                            nVar.onError(th3);
                            return;
                        } else {
                            yk.g.M(th3);
                            return;
                        }
                    }
                }
                return;
        }
    }
}
