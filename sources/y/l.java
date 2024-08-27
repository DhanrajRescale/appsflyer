package y;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import ut.l;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final v0.h f40834a = new v0.h(new p[16]);

    public final void a(CancellationException cancellationException) {
        v0.h hVar = this.f40834a;
        int i10 = hVar.f37655c;
        qu.h[] hVarArr = new qu.h[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            hVarArr[i11] = ((p) hVar.f37653a[i11]).f40881b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            hVarArr[i12].r(cancellationException);
        }
        if (!hVar.k()) {
            throw new IllegalStateException("uncancelled requests present".toString());
        }
    }

    public final void b() {
        v0.h hVar = this.f40834a;
        int i10 = 0;
        int i11 = new kotlin.ranges.c(0, hVar.f37655c - 1, 1).f23382b;
        if (i11 >= 0) {
            while (true) {
                qu.h hVar2 = ((p) hVar.f37653a[i10]).f40881b;
                Unit unit = Unit.f23355a;
                l.Companion companion = ut.l.INSTANCE;
                hVar2.resumeWith(unit);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        hVar.g();
    }
}
