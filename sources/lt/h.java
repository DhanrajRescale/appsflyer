package lt;

import at.n;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h implements at.d, ct.b {

    /* renamed from: a, reason: collision with root package name */
    public final n f25388a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25389b;

    /* renamed from: c, reason: collision with root package name */
    public gv.a f25390c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25391d;

    /* renamed from: e, reason: collision with root package name */
    public Object f25392e;

    public h(n nVar, Object obj) {
        this.f25388a = nVar;
        this.f25389b = obj;
    }

    @Override // ct.b
    public final void a() {
        this.f25390c.cancel();
        this.f25390c = qt.c.f32175a;
    }

    @Override // at.d
    public final void b(Object obj) {
        if (this.f25391d) {
            return;
        }
        if (this.f25392e != null) {
            this.f25391d = true;
            this.f25390c.cancel();
            this.f25390c = qt.c.f32175a;
            this.f25388a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.f25392e = obj;
    }

    @Override // at.d
    public final void c(gv.a aVar) {
        if (qt.c.a(this.f25390c, aVar)) {
            this.f25390c = aVar;
            this.f25388a.c(this);
            aVar.request();
        }
    }

    @Override // at.d
    public final void onComplete() {
        if (this.f25391d) {
            return;
        }
        this.f25391d = true;
        this.f25390c = qt.c.f32175a;
        Object obj = this.f25392e;
        this.f25392e = null;
        if (obj == null) {
            obj = this.f25389b;
        }
        n nVar = this.f25388a;
        if (obj != null) {
            nVar.onSuccess(obj);
        } else {
            nVar.onError(new NoSuchElementException());
        }
    }

    @Override // at.d
    public final void onError(Throwable th2) {
        if (this.f25391d) {
            yk.g.M(th2);
            return;
        }
        this.f25391d = true;
        this.f25390c = qt.c.f32175a;
        this.f25388a.onError(th2);
    }
}
