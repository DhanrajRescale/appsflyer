package pt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g extends AtomicReference implements Runnable, ct.b {
    private static final long serialVersionUID = -4101336210206799084L;

    /* renamed from: a, reason: collision with root package name */
    public final ft.e f31353a;

    /* renamed from: b, reason: collision with root package name */
    public final ft.e f31354b;

    /* JADX WARN: Type inference failed for: r1v1, types: [ft.e, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ft.e, java.util.concurrent.atomic.AtomicReference] */
    public g(Runnable runnable) {
        super(runnable);
        this.f31353a = new AtomicReference();
        this.f31354b = new AtomicReference();
    }

    @Override // ct.b
    public final void a() {
        if (getAndSet(null) != null) {
            ft.e eVar = this.f31353a;
            eVar.getClass();
            ft.b.b(eVar);
            ft.e eVar2 = this.f31354b;
            eVar2.getClass();
            ft.b.b(eVar2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ft.e eVar = this.f31354b;
        ft.e eVar2 = this.f31353a;
        ft.b bVar = ft.b.f16240a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                eVar2.lazySet(bVar);
                eVar.lazySet(bVar);
            }
        }
    }
}
