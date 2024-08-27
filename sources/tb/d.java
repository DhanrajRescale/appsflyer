package tb;

import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r0.a1;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f35697a = new iu.k(2);

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
        a1.a(w0.u(R.drawable.ic_refresh, nVar, 6), null, null, n1.t.f28177i, nVar, 3128, 4);
        return Unit.f23355a;
    }
}
