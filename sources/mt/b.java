package mt;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes2.dex */
public final class b implements at.g, ct.b {

    /* renamed from: a, reason: collision with root package name */
    public final at.g f27995a;

    /* renamed from: b, reason: collision with root package name */
    public final et.c f27996b;

    /* renamed from: c, reason: collision with root package name */
    public final et.c f27997c;

    /* renamed from: d, reason: collision with root package name */
    public final et.a f27998d;

    /* renamed from: e, reason: collision with root package name */
    public final et.a f27999e;

    /* renamed from: f, reason: collision with root package name */
    public ct.b f28000f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28001g;

    public b(at.g gVar, et.c cVar, et.c cVar2, et.a aVar, et.a aVar2) {
        this.f27995a = gVar;
        this.f27996b = cVar;
        this.f27997c = cVar2;
        this.f27998d = aVar;
        this.f27999e = aVar2;
    }

    @Override // ct.b
    public final void a() {
        this.f28000f.a();
    }

    @Override // at.g
    public final void b(Object obj) {
        if (this.f28001g) {
            return;
        }
        try {
            this.f27996b.b(obj);
            this.f27995a.b(obj);
        } catch (Throwable th2) {
            zq.f.l0(th2);
            this.f28000f.a();
            onError(th2);
        }
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        if (ft.b.f(this.f28000f, bVar)) {
            this.f28000f = bVar;
            this.f27995a.c(this);
        }
    }

    @Override // at.g
    public final void onComplete() {
        if (this.f28001g) {
            return;
        }
        try {
            this.f27998d.run();
            this.f28001g = true;
            this.f27995a.onComplete();
            try {
                this.f27999e.run();
            } catch (Throwable th2) {
                zq.f.l0(th2);
                yk.g.M(th2);
            }
        } catch (Throwable th3) {
            zq.f.l0(th3);
            onError(th3);
        }
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        if (this.f28001g) {
            yk.g.M(th2);
            return;
        }
        this.f28001g = true;
        try {
            this.f27997c.b(th2);
        } catch (Throwable th3) {
            zq.f.l0(th3);
            th2 = new CompositeException(th2, th3);
        }
        this.f27995a.onError(th2);
        try {
            this.f27999e.run();
        } catch (Throwable th4) {
            zq.f.l0(th4);
            yk.g.M(th4);
        }
    }
}
