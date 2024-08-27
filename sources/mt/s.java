package mt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class s extends AtomicReference implements ct.b, Runnable {
    private static final long serialVersionUID = -2809475196591179431L;

    /* renamed from: a, reason: collision with root package name */
    public final at.g f28052a;

    public s(at.g gVar) {
        this.f28052a = gVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    public final boolean b() {
        if (get() == ft.b.f16240a) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!b()) {
            at.g gVar = this.f28052a;
            gVar.b(0L);
            lazySet(ft.c.f16242a);
            gVar.onComplete();
        }
    }
}
