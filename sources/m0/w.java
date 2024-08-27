package m0;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f26990b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(y yVar, int i10) {
        super(0);
        this.f26989a = i10;
        this.f26990b = yVar;
    }

    public final Float a() {
        int i10 = this.f26989a;
        y yVar = this.f26990b;
        switch (i10) {
            case 0:
                float c10 = yVar.d().c(yVar.f27120g.getValue());
                float c11 = yVar.d().c(yVar.f27122i.getValue()) - c10;
                float abs = Math.abs(c11);
                float f10 = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float g10 = (yVar.g() - c10) / c11;
                    if (g10 < 1.0E-6f) {
                        f10 = s0.g.f34069a;
                    } else if (g10 <= 0.999999f) {
                        f10 = g10;
                    }
                }
                return Float.valueOf(f10);
            default:
                return Float.valueOf(yVar.g());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Object b10;
        int i10 = this.f26989a;
        y yVar = this.f26990b;
        switch (i10) {
            case 0:
                return a();
            case 1:
                return yVar.d();
            case 2:
                return new Pair(yVar.d(), yVar.f27121h.getValue());
            case 3:
                Object value = yVar.f27125l.getValue();
                if (value == null) {
                    float i11 = yVar.f27123j.i();
                    boolean isNaN = Float.isNaN(i11);
                    t0.n1 n1Var = yVar.f27120g;
                    if (!isNaN) {
                        Object value2 = n1Var.getValue();
                        y3 d10 = yVar.d();
                        float c10 = d10.c(value2);
                        if (c10 != i11 && !Float.isNaN(c10) && (c10 >= i11 ? (b10 = d10.b(i11, false)) != null : (b10 = d10.b(i11, true)) != null)) {
                            value2 = b10;
                        }
                        return value2;
                    }
                    return n1Var.getValue();
                }
                return value;
            case 4:
                Object value3 = yVar.f27125l.getValue();
                if (value3 == null) {
                    float i12 = yVar.f27123j.i();
                    boolean isNaN2 = Float.isNaN(i12);
                    t0.n1 n1Var2 = yVar.f27120g;
                    if (!isNaN2) {
                        return yVar.c(i12, s0.g.f34069a, n1Var2.getValue());
                    }
                    return n1Var2.getValue();
                }
                return value3;
            case 5:
                return (Boolean) yVar.f27120g.getValue();
            default:
                return a();
        }
    }
}
