package kt;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class j extends AtomicReference implements at.b, ct.b {
    private static final long serialVersionUID = 5018523762564524046L;

    /* renamed from: a, reason: collision with root package name */
    public final at.b f23511a;

    /* renamed from: b, reason: collision with root package name */
    public final et.d f23512b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23513c;

    public j(at.b bVar, et.d dVar) {
        this.f23511a = bVar;
        this.f23512b = dVar;
    }

    @Override // ct.b
    public final void a() {
        ft.b.b(this);
    }

    @Override // at.b
    public final void c(ct.b bVar) {
        ft.b.d(this, bVar);
    }

    @Override // at.b
    public final void onComplete() {
        this.f23511a.onComplete();
    }

    @Override // at.b
    public final void onError(Throwable th2) {
        boolean z10 = this.f23513c;
        at.b bVar = this.f23511a;
        if (z10) {
            bVar.onError(th2);
            return;
        }
        this.f23513c = true;
        try {
            Object apply = this.f23512b.apply(th2);
            gt.e.a(apply, "The errorMapper returned a null CompletableSource");
            ((at.a) apply).a(this);
        } catch (Throwable th3) {
            zq.f.l0(th3);
            bVar.onError(new CompositeException(th2, th3));
        }
    }
}
