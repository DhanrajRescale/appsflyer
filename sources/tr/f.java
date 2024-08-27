package tr;

import io.reactivex.exceptions.CompositeException;
import nv.v0;

/* loaded from: classes2.dex */
public final class f implements at.g {

    /* renamed from: a, reason: collision with root package name */
    public final at.g f36363a;

    public f(at.g gVar) {
        this.f36363a = gVar;
    }

    @Override // at.g
    public final void b(Object obj) {
        v0 v0Var = (v0) obj;
        if (v0Var != null) {
            this.f36363a.b(new e(0, v0Var, (Object) null));
            return;
        }
        throw new NullPointerException("response == null");
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        this.f36363a.c(bVar);
    }

    @Override // at.g
    public final void onComplete() {
        this.f36363a.onComplete();
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        at.g gVar = this.f36363a;
        int i10 = 0;
        try {
            if (th2 != null) {
                gVar.b(new e(i10, (Object) null, th2));
                gVar.onComplete();
                return;
            }
            throw new NullPointerException("error == null");
        } catch (Throwable th3) {
            try {
                gVar.onError(th3);
            } catch (Throwable th4) {
                zq.f.l0(th4);
                yk.g.M(new CompositeException(th3, th4));
            }
        }
    }
}
