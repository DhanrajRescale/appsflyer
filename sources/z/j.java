package z;

import iu.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t0.n1;
import y.q1;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f41878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f41879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f41880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f41881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(float f10, w wVar, q1 q1Var, d dVar, int i10) {
        super(1);
        this.f41877a = i10;
        this.f41878b = f10;
        this.f41879c = wVar;
        this.f41880d = q1Var;
        this.f41881e = dVar;
    }

    public final void a(w.m mVar) {
        int i10 = this.f41877a;
        Function1 function1 = this.f41881e;
        q1 q1Var = this.f41880d;
        w wVar = this.f41879c;
        float f10 = this.f41878b;
        switch (i10) {
            case 0:
                float abs = Math.abs(((Number) mVar.f38600e.getValue()).floatValue());
                float abs2 = Math.abs(f10);
                Function0 function0 = mVar.f38599d;
                n1 n1Var = mVar.f38604i;
                n1 n1Var2 = mVar.f38600e;
                if (abs >= abs2) {
                    float c10 = l.c(((Number) n1Var2.getValue()).floatValue(), f10);
                    float f11 = c10 - wVar.f20557a;
                    float a10 = q1Var.a(f11);
                    function1.invoke(Float.valueOf(a10));
                    if (Math.abs(f11 - a10) > 0.5f) {
                        n1Var.setValue(Boolean.FALSE);
                        function0.mo2invoke();
                    }
                    n1Var.setValue(Boolean.FALSE);
                    function0.mo2invoke();
                    wVar.f20557a = c10;
                    return;
                }
                float floatValue = ((Number) n1Var2.getValue()).floatValue() - wVar.f20557a;
                float a11 = q1Var.a(floatValue);
                function1.invoke(Float.valueOf(a11));
                if (Math.abs(floatValue - a11) > 0.5f) {
                    n1Var.setValue(Boolean.FALSE);
                    function0.mo2invoke();
                }
                wVar.f20557a = ((Number) n1Var2.getValue()).floatValue();
                return;
            default:
                float c11 = l.c(((Number) mVar.f38600e.getValue()).floatValue(), f10);
                float f12 = c11 - wVar.f20557a;
                float a12 = q1Var.a(f12);
                function1.invoke(Float.valueOf(a12));
                if (Math.abs(f12 - a12) > 0.5f || c11 != ((Number) mVar.f38600e.getValue()).floatValue()) {
                    mVar.f38604i.setValue(Boolean.FALSE);
                    mVar.f38599d.mo2invoke();
                }
                wVar.f20557a += a12;
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f41877a) {
            case 0:
                a((w.m) obj);
                return Unit.f23355a;
            default:
                a((w.m) obj);
                return Unit.f23355a;
        }
    }
}
