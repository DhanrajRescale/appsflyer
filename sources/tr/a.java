package tr;

import com.jakewharton.retrofit2.adapter.rxjava2.HttpException;
import io.reactivex.exceptions.CompositeException;
import nv.v0;

/* loaded from: classes2.dex */
public final class a implements at.g {

    /* renamed from: a, reason: collision with root package name */
    public final at.g f36353a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36354b;

    public a(at.g gVar) {
        this.f36353a = gVar;
    }

    @Override // at.g
    public final void b(Object obj) {
        v0 v0Var = (v0) obj;
        boolean isSuccessful = v0Var.f29302a.isSuccessful();
        at.g gVar = this.f36353a;
        if (isSuccessful) {
            gVar.b(v0Var.f29303b);
            return;
        }
        this.f36354b = true;
        HttpException httpException = new HttpException(v0Var);
        try {
            gVar.onError(httpException);
        } catch (Throwable th2) {
            zq.f.l0(th2);
            yk.g.M(new CompositeException(httpException, th2));
        }
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        this.f36353a.c(bVar);
    }

    @Override // at.g
    public final void onComplete() {
        if (!this.f36354b) {
            this.f36353a.onComplete();
        }
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        if (!this.f36354b) {
            this.f36353a.onError(th2);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th2);
        yk.g.M(assertionError);
    }
}
