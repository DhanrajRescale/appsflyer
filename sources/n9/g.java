package n9;

import kotlin.jvm.functions.Function0;
import t0.n1;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f28436b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i10) {
        super(0);
        this.f28435a = i10;
        this.f28436b = iVar;
    }

    public final Float a() {
        float floatValue;
        int i10 = this.f28435a;
        i iVar = this.f28436b;
        switch (i10) {
            case 0:
                j9.i iVar2 = (j9.i) iVar.f28450i.getValue();
                float f10 = s0.g.f34069a;
                if (iVar2 != null) {
                    float floatValue2 = ((Number) iVar.f28447f.getValue()).floatValue();
                    n1 n1Var = iVar.f28446e;
                    if (floatValue2 < s0.g.f34069a) {
                        a3.a.u(n1Var.getValue());
                    } else {
                        a3.a.u(n1Var.getValue());
                        f10 = 1.0f;
                    }
                }
                return Float.valueOf(f10);
            default:
                boolean booleanValue = ((Boolean) iVar.f28445d.getValue()).booleanValue();
                n1 n1Var2 = iVar.f28447f;
                if (booleanValue && iVar.f() % 2 == 0) {
                    floatValue = -((Number) n1Var2.getValue()).floatValue();
                } else {
                    floatValue = ((Number) n1Var2.getValue()).floatValue();
                }
                return Float.valueOf(floatValue);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        boolean z10;
        switch (this.f28435a) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                i iVar = this.f28436b;
                if (iVar.f() == ((Number) iVar.f28444c.getValue()).intValue() && ((Number) iVar.f28452k.getValue()).floatValue() == iVar.e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
