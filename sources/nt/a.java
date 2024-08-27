package nt;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements at.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29122a;

    /* renamed from: b, reason: collision with root package name */
    public final at.n f29123b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f29124c;

    public /* synthetic */ a(Object obj, at.n nVar, int i10) {
        this.f29122a = i10;
        this.f29124c = obj;
        this.f29123b = nVar;
    }

    @Override // at.n
    public final void c(ct.b bVar) {
        int i10 = this.f29122a;
        at.n nVar = this.f29123b;
        switch (i10) {
            case 0:
                nVar.c(bVar);
                return;
            case 1:
                nVar.c(bVar);
                return;
            case 2:
                ft.b.d((AtomicReference) this.f29124c, bVar);
                return;
            case 3:
                nVar.c(bVar);
                return;
            default:
                nVar.c(bVar);
                return;
        }
    }

    @Override // at.n
    public final void onError(Throwable th2) {
        Object apply;
        int i10 = this.f29122a;
        Object obj = this.f29124c;
        at.n nVar = this.f29123b;
        switch (i10) {
            case 0:
                try {
                    ((b) obj).f29127c.b(th2);
                } catch (Throwable th3) {
                    zq.f.l0(th3);
                    th2 = new CompositeException(th2, th3);
                }
                nVar.onError(th2);
                return;
            case 1:
                nVar.onError(th2);
                return;
            case 2:
                nVar.onError(th2);
                return;
            case 3:
                nVar.onError(th2);
                return;
            default:
                if (((i) obj).f29146b != null) {
                    try {
                        apply = ((i) obj).f29146b.apply(th2);
                    } catch (Throwable th4) {
                        zq.f.l0(th4);
                        nVar.onError(new CompositeException(th2, th4));
                        return;
                    }
                } else {
                    apply = null;
                }
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                    nullPointerException.initCause(th2);
                    nVar.onError(nullPointerException);
                    return;
                }
                nVar.onSuccess(apply);
                return;
        }
    }

    @Override // at.n
    public final void onSuccess(Object obj) {
        int i10 = this.f29122a;
        Object obj2 = this.f29124c;
        at.n nVar = this.f29123b;
        switch (i10) {
            case 0:
                nVar.onSuccess(obj);
                return;
            case 1:
                try {
                    ((b) obj2).f29127c.b(obj);
                    nVar.onSuccess(obj);
                    return;
                } catch (Throwable th2) {
                    zq.f.l0(th2);
                    nVar.onError(th2);
                    return;
                }
            case 2:
                nVar.onSuccess(obj);
                return;
            case 3:
                try {
                    Object apply = ((et.d) obj2).apply(obj);
                    gt.e.a(apply, "The mapper function returned a null value.");
                    nVar.onSuccess(apply);
                    return;
                } catch (Throwable th3) {
                    zq.f.l0(th3);
                    onError(th3);
                    return;
                }
            default:
                nVar.onSuccess(obj);
                return;
        }
    }

    public a(at.n nVar, et.d dVar) {
        this.f29122a = 3;
        this.f29123b = nVar;
        this.f29124c = dVar;
    }
}
