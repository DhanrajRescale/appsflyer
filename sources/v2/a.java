package v2;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.b9;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class a extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37674a = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        b9.d("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, nVar, 6, 0, 65534);
        return Unit.f23355a;
    }
}
