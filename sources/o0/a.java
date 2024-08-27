package o0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29339a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
            }
        }
        return Unit.f23355a;
    }
}
