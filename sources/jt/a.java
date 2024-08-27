package jt;

import at.g;

/* loaded from: classes2.dex */
public abstract class a implements g, ht.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f21658a;

    /* renamed from: b, reason: collision with root package name */
    public ct.b f21659b;

    /* renamed from: c, reason: collision with root package name */
    public ht.a f21660c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21661d;

    public a(g gVar) {
        this.f21658a = gVar;
    }

    @Override // ct.b
    public final void a() {
        this.f21659b.a();
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        if (ft.b.f(this.f21659b, bVar)) {
            this.f21659b = bVar;
            if (bVar instanceof ht.a) {
                this.f21660c = (ht.a) bVar;
            }
            this.f21658a.c(this);
        }
    }

    @Override // ht.c
    public final void clear() {
        this.f21660c.clear();
    }

    @Override // ht.c
    public final boolean isEmpty() {
        return this.f21660c.isEmpty();
    }

    @Override // ht.c
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // at.g
    public final void onComplete() {
        if (this.f21661d) {
            return;
        }
        this.f21661d = true;
        this.f21658a.onComplete();
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        if (this.f21661d) {
            yk.g.M(th2);
        } else {
            this.f21661d = true;
            this.f21658a.onError(th2);
        }
    }
}
