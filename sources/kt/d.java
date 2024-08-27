package kt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class d extends at.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23492a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23493b;

    public d(Object obj, int i10) {
        this.f23492a = i10;
        this.f23493b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ct.c, ct.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // at.a
    public final void b(at.b bVar) {
        int i10 = this.f23492a;
        Object obj = this.f23493b;
        switch (i10) {
            case 0:
                ?? atomicReference = new AtomicReference(gt.e.f17569a);
                bVar.c(atomicReference);
                try {
                    ((et.a) obj).run();
                    if (!atomicReference.b()) {
                        bVar.onComplete();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    zq.f.l0(th2);
                    if (!atomicReference.b()) {
                        bVar.onError(th2);
                        return;
                    } else {
                        yk.g.M(th2);
                        return;
                    }
                }
            case 1:
                ((at.m) ((at.o) obj)).a(new e(bVar));
                return;
            default:
                ((at.e) ((at.f) obj)).e(new mt.h(bVar));
                return;
        }
    }
}
