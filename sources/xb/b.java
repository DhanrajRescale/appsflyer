package xb;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.n;
import t0.r;
import yk.o;

/* loaded from: classes.dex */
public final class b extends k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f40153a = new k(4);

    @Override // hu.d
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        g gVar;
        int i10;
        c0.c items = (c0.c) obj;
        int intValue = ((Number) obj2).intValue();
        n nVar = (n) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            if (((r) nVar).f(intValue)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            intValue2 |= i10;
        }
        if ((intValue2 & 721) == 144) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        int i11 = intValue % 3;
        if (i11 != 0) {
            if (i11 != 1) {
                gVar = g.f40168c;
            } else {
                gVar = g.f40167b;
            }
        } else {
            gVar = g.f40166a;
        }
        o.j(gVar, nVar, 0);
        return Unit.f23355a;
    }
}
