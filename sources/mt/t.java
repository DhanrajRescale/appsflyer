package mt;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class t extends at.e {

    /* renamed from: a, reason: collision with root package name */
    public final at.l f28053a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28054b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f28055c;

    public t(long j10, TimeUnit timeUnit, at.l lVar) {
        this.f28054b = j10;
        this.f28055c = timeUnit;
        this.f28053a = lVar;
    }

    @Override // at.e
    public final void f(at.g gVar) {
        s sVar = new s(gVar);
        gVar.c(sVar);
        ct.b c10 = this.f28053a.c(sVar, this.f28054b, this.f28055c);
        while (!sVar.compareAndSet(null, c10)) {
            if (sVar.get() != null) {
                if (sVar.get() == ft.b.f16240a) {
                    c10.a();
                    return;
                }
                return;
            }
        }
    }
}
