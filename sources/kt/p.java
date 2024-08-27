package kt;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class p extends at.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f23527a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f23528b;

    /* renamed from: c, reason: collision with root package name */
    public final at.l f23529c;

    public p(TimeUnit timeUnit, at.l lVar) {
        this.f23528b = timeUnit;
        this.f23529c = lVar;
    }

    @Override // at.a
    public final void b(at.b bVar) {
        o oVar = new o(bVar);
        bVar.c(oVar);
        ft.b.d(oVar, this.f23529c.c(oVar, this.f23527a, this.f23528b));
    }
}
