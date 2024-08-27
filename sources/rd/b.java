package rd;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f33607a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        el.l.m(true, a.f33603a, nVar, 54, 0);
        return Unit.f23355a;
    }
}
