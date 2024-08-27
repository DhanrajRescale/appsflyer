package mt;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class q implements at.g, ct.b {

    /* renamed from: a, reason: collision with root package name */
    public final at.n f28045a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28046b;

    /* renamed from: c, reason: collision with root package name */
    public ct.b f28047c;

    /* renamed from: d, reason: collision with root package name */
    public Object f28048d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28049e;

    public q(at.n nVar, Object obj) {
        this.f28045a = nVar;
        this.f28046b = obj;
    }

    @Override // ct.b
    public final void a() {
        this.f28047c.a();
    }

    @Override // at.g
    public final void b(Object obj) {
        if (this.f28049e) {
            return;
        }
        if (this.f28048d != null) {
            this.f28049e = true;
            this.f28047c.a();
            this.f28045a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.f28048d = obj;
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        if (ft.b.f(this.f28047c, bVar)) {
            this.f28047c = bVar;
            this.f28045a.c(this);
        }
    }

    @Override // at.g
    public final void onComplete() {
        if (this.f28049e) {
            return;
        }
        this.f28049e = true;
        Object obj = this.f28048d;
        this.f28048d = null;
        if (obj == null) {
            obj = this.f28046b;
        }
        at.n nVar = this.f28045a;
        if (obj != null) {
            nVar.onSuccess(obj);
        } else {
            nVar.onError(new NoSuchElementException());
        }
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        if (this.f28049e) {
            yk.g.M(th2);
        } else {
            this.f28049e = true;
            this.f28045a.onError(th2);
        }
    }
}
