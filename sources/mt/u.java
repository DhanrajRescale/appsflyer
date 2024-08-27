package mt;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class u implements at.g, ct.b {

    /* renamed from: a, reason: collision with root package name */
    public final at.n f28056a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f28057b;

    /* renamed from: c, reason: collision with root package name */
    public ct.b f28058c;

    public u(at.n nVar, Collection collection) {
        this.f28056a = nVar;
        this.f28057b = collection;
    }

    @Override // ct.b
    public final void a() {
        this.f28058c.a();
    }

    @Override // at.g
    public final void b(Object obj) {
        this.f28057b.add(obj);
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        if (ft.b.f(this.f28058c, bVar)) {
            this.f28058c = bVar;
            this.f28056a.c(this);
        }
    }

    @Override // at.g
    public final void onComplete() {
        Collection collection = this.f28057b;
        this.f28057b = null;
        this.f28056a.onSuccess(collection);
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        this.f28057b = null;
        this.f28056a.onError(th2);
    }
}
