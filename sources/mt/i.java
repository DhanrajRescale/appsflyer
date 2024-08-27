package mt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class i extends AtomicReference implements ct.b, Runnable {
    private static final long serialVersionUID = 346773832286157679L;

    /* renamed from: a, reason: collision with root package name */
    public final at.g f28019a;

    /* renamed from: b, reason: collision with root package name */
    public long f28020b;

    public i(at.g gVar) {
        this.f28019a = gVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != ft.b.f16240a) {
            long j10 = this.f28020b;
            this.f28020b = 1 + j10;
            this.f28019a.b(Long.valueOf(j10));
        }
    }
}
