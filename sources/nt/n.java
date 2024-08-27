package nt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class n extends AtomicReference implements at.n {
    private static final long serialVersionUID = 3323743579927613702L;

    /* renamed from: a, reason: collision with root package name */
    public final m f29161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29162b;

    public n(m mVar, int i10) {
        this.f29161a = mVar;
        this.f29162b = i10;
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        ft.b.e(this, bVar);
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        this.f29161a.b(this.f29162b, th2);
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        m mVar = this.f29161a;
        at.n nVar = mVar.f29157a;
        int i10 = this.f29162b;
        Object[] objArr = mVar.f29160d;
        objArr[i10] = obj;
        if (mVar.decrementAndGet() == 0) {
            try {
                Object apply = mVar.f29158b.apply(objArr);
                gt.e.a(apply, "The zipper returned a null value");
                nVar.onSuccess(apply);
            } catch (Throwable th2) {
                zq.f.l0(th2);
                nVar.onError(th2);
            }
        }
    }
}
