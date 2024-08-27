package o8;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class l implements a9.a, z8.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f29808b;

    public /* synthetic */ l(n nVar) {
        this.f29808b = nVar;
    }

    @Override // a9.a
    public void b() {
    }

    @Override // a9.a
    public void c(Drawable drawable) {
        q1.b bVar;
        n nVar = this.f29808b;
        if (drawable != null) {
            bVar = nVar.j(drawable);
        } else {
            bVar = null;
        }
        nVar.k(new g(bVar));
    }

    @Override // z8.h
    public Object d(n8.l lVar) {
        return el.l.T(new g7.x(this.f29808b.f29814f, 2), lVar);
    }

    @Override // a9.a
    public void onSuccess() {
    }
}
