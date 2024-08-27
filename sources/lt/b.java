package lt;

import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class b extends at.c {

    /* renamed from: b, reason: collision with root package name */
    public final Future f25373b;

    public b(op.a aVar) {
        this.f25373b = aVar;
    }

    @Override // at.c
    public final void b(at.d dVar) {
        qt.b bVar = new qt.b(dVar);
        dVar.c(bVar);
        try {
            Object obj = this.f25373b.get();
            if (obj == null) {
                dVar.onError(new NullPointerException("The future returned null"));
                return;
            }
            int i10 = bVar.get();
            do {
                at.d dVar2 = bVar.f32173a;
                if (i10 == 8) {
                    bVar.f32174b = obj;
                    bVar.lazySet(16);
                    dVar2.b(obj);
                    if (bVar.get() != 4) {
                        dVar2.onComplete();
                        return;
                    }
                    return;
                }
                if ((i10 & (-3)) == 0) {
                    if (i10 == 2) {
                        bVar.lazySet(3);
                        dVar2.b(obj);
                        if (bVar.get() != 4) {
                            dVar2.onComplete();
                            return;
                        }
                        return;
                    }
                    bVar.f32174b = obj;
                    if (!bVar.compareAndSet(0, 1)) {
                        i10 = bVar.get();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (i10 != 4);
            bVar.f32174b = null;
        } catch (Throwable th2) {
            zq.f.l0(th2);
            if (bVar.get() != 4) {
                dVar.onError(th2);
            }
        }
    }
}
