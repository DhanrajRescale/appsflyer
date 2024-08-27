package mt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r extends AtomicReference implements at.g, ct.b {
    private static final long serialVersionUID = 8094547886072529208L;

    /* renamed from: a, reason: collision with root package name */
    public final at.g f28050a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f28051b = new AtomicReference();

    public r(at.g gVar) {
        this.f28050a = gVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this.f28051b);
        ft.b.b(this);
    }

    @Override // at.g
    public final void b(Object obj) {
        this.f28050a.b(obj);
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        ft.b.e(this.f28051b, bVar);
    }

    @Override // at.g
    public final void onComplete() {
        this.f28050a.onComplete();
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        this.f28050a.onError(th2);
    }
}
