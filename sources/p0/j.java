package p0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import t0.k1;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends iu.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        o oVar = (o) this.f20529a;
        boolean c10 = oVar.c();
        float f10 = s0.g.f34069a;
        if (!c10) {
            if (oVar.a() > oVar.f30486g.i()) {
                ((Function0) oVar.f30481b.getValue()).mo2invoke();
            }
            yk.g.H(oVar.f30480a, null, null, new n(oVar, s0.g.f34069a, null), 3);
            k1 k1Var = oVar.f30485f;
            if (k1Var.i() == s0.g.f34069a || floatValue < s0.g.f34069a) {
                floatValue = 0.0f;
            }
            k1Var.j(s0.g.f34069a);
            f10 = floatValue;
        }
        return new Float(f10);
    }
}
