package mt;

import java.util.concurrent.TimeUnit;
import pt.c0;

/* loaded from: classes2.dex */
public final class j extends at.e {

    /* renamed from: a, reason: collision with root package name */
    public final at.l f28021a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28022b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28023c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f28024d;

    public j(long j10, long j11, TimeUnit timeUnit, at.l lVar) {
        this.f28022b = j10;
        this.f28023c = j11;
        this.f28024d = timeUnit;
        this.f28021a = lVar;
    }

    @Override // at.e
    public final void f(at.g gVar) {
        i iVar = new i(gVar);
        gVar.c(iVar);
        at.l lVar = this.f28021a;
        if (lVar instanceof c0) {
            at.k a10 = lVar.a();
            ft.b.e(iVar, a10);
            a10.d(iVar, this.f28022b, this.f28023c, this.f28024d);
            return;
        }
        ft.b.e(iVar, lVar.d(iVar, this.f28022b, this.f28023c, this.f28024d));
    }
}
