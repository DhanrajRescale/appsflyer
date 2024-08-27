package kt;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements at.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23484a;

    /* renamed from: b, reason: collision with root package name */
    public final at.b f23485b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23486c;

    public /* synthetic */ a(Object obj, at.b bVar, int i10) {
        this.f23484a = i10;
        this.f23486c = obj;
        this.f23485b = bVar;
    }

    @Override // at.b
    public final void c(ct.b bVar) {
        switch (this.f23484a) {
            case 0:
                ft.b.d((AtomicReference) this.f23486c, bVar);
                return;
            default:
                this.f23485b.c(bVar);
                return;
        }
    }

    @Override // at.b
    public final void onComplete() {
        int i10 = this.f23484a;
        at.b bVar = this.f23485b;
        switch (i10) {
            case 0:
                bVar.onComplete();
                return;
            default:
                bVar.onComplete();
                return;
        }
    }

    @Override // at.b
    public final void onError(Throwable th2) {
        int i10 = this.f23484a;
        at.b bVar = this.f23485b;
        switch (i10) {
            case 0:
                bVar.onError(th2);
                return;
            default:
                try {
                    if (((et.e) ((c) this.f23486c).f23491c).d(th2)) {
                        bVar.onComplete();
                        return;
                    } else {
                        bVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    zq.f.l0(th3);
                    bVar.onError(new CompositeException(th2, th3));
                    return;
                }
        }
    }
}
