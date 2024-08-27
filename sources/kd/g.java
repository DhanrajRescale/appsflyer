package kd;

import g1.l;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class g extends k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public static final g f23088a = new k(3);

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        c0.c item = (c0.c) obj;
        n nVar = (n) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((intValue & 81) == 16) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.x(l.f16404b, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 80, 7), nVar);
        return Unit.f23355a;
    }
}
