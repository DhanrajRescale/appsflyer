package kt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b extends AtomicReference implements at.b, ct.b {
    private static final long serialVersionUID = -4101678820158072998L;

    /* renamed from: a, reason: collision with root package name */
    public final at.b f23487a;

    /* renamed from: b, reason: collision with root package name */
    public final at.a f23488b;

    public b(at.a aVar, at.b bVar) {
        this.f23487a = bVar;
        this.f23488b = aVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    @Override // at.b
    public final void c(ct.b bVar) {
        if (ft.b.e(this, bVar)) {
            this.f23487a.c(this);
        }
    }

    @Override // at.b
    public final void onComplete() {
        this.f23488b.a(new a(this, this.f23487a, 0));
    }

    @Override // at.b
    public final void onError(Throwable th2) {
        this.f23487a.onError(th2);
    }
}
