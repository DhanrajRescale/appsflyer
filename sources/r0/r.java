package r0;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f32688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, int i10) {
        super(0);
        this.f32687a = i10;
        this.f32688b = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Object b10;
        int i10 = this.f32687a;
        float f10 = s0.g.f34069a;
        t tVar = this.f32688b;
        switch (i10) {
            case 0:
                float c10 = tVar.d().c(tVar.f32721f.getValue());
                float c11 = tVar.d().c(tVar.f32723h.getValue()) - c10;
                float abs = Math.abs(c11);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float g10 = (tVar.g() - c10) / c11;
                    if (g10 >= 1.0E-6f) {
                        if (g10 <= 0.999999f) {
                            f10 = g10;
                        }
                    }
                    return Float.valueOf(f10);
                }
                f10 = 1.0f;
                return Float.valueOf(f10);
            case 1:
                return tVar.d();
            case 2:
                return new Pair(tVar.d(), tVar.f32722g.getValue());
            case 3:
                Object value = tVar.f32726k.getValue();
                if (value == null) {
                    float i11 = tVar.f32724i.i();
                    boolean isNaN = Float.isNaN(i11);
                    t0.n1 n1Var = tVar.f32721f;
                    if (!isNaN) {
                        Object value2 = n1Var.getValue();
                        f1 d10 = tVar.d();
                        float c12 = d10.c(value2);
                        if (c12 != i11 && !Float.isNaN(c12) && (c12 >= i11 ? (b10 = d10.b(i11, false)) != null : (b10 = d10.b(i11, true)) != null)) {
                            value2 = b10;
                        }
                        return value2;
                    }
                    return n1Var.getValue();
                }
                return value;
            default:
                Object value3 = tVar.f32726k.getValue();
                if (value3 == null) {
                    float i12 = tVar.f32724i.i();
                    boolean isNaN2 = Float.isNaN(i12);
                    t0.n1 n1Var2 = tVar.f32721f;
                    if (!isNaN2) {
                        return tVar.c(i12, s0.g.f34069a, n1Var2.getValue());
                    }
                    return n1Var2.getValue();
                }
                return value3;
        }
    }
}
