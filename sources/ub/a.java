package ub;

import com.assetgro.stockgro.prod.R;
import d2.w0;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.s3;
import n1.t;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class a extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37041a = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        s3.a(w0.u(R.drawable.ic_cancel_circle, nVar, 6), "Close", null, t.f28177i, nVar, 3128, 4);
        return Unit.f23355a;
    }
}
