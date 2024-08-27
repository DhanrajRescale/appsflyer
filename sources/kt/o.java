package kt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o extends AtomicReference implements ct.b, Runnable {
    private static final long serialVersionUID = 3167244060586201109L;

    /* renamed from: a, reason: collision with root package name */
    public final at.b f23526a;

    public o(at.b bVar) {
        this.f23526a = bVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23526a.onComplete();
    }
}
