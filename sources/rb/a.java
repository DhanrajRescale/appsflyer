package rb;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.n;
import t0.r;
import yk.j;

/* loaded from: classes.dex */
public final class a extends k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33562a = new k(4);

    @Override // hu.d
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        c0.c items = (c0.c) obj;
        ((Number) obj2).intValue();
        n nVar = (n) obj3;
        int intValue = ((Number) obj4).intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((intValue & 641) == 128) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        j.A(nVar, 0);
        return Unit.f23355a;
    }
}
