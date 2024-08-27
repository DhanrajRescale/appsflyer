package mt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class w implements at.g {

    /* renamed from: a, reason: collision with root package name */
    public final v f28065a;

    /* renamed from: b, reason: collision with root package name */
    public final ot.b f28066b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f28067c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f28068d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f28069e = new AtomicReference();

    public w(v vVar, int i10) {
        this.f28065a = vVar;
        this.f28066b = new ot.b(i10);
    }

    @Override // at.g
    public final void b(Object obj) {
        this.f28066b.offer(obj);
        this.f28065a.c();
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        ft.b.e(this.f28069e, bVar);
    }

    @Override // at.g
    public final void onComplete() {
        this.f28067c = true;
        this.f28065a.c();
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        this.f28068d = th2;
        this.f28067c = true;
        this.f28065a.c();
    }
}
