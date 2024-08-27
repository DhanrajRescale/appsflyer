package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o1 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iu.w f40874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f40875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(iu.w wVar, q1 q1Var, int i10) {
        super(2);
        this.f40873a = i10;
        this.f40874b = wVar;
        this.f40875c = q1Var;
    }

    public final void a(float f10) {
        int i10 = this.f40873a;
        q1 q1Var = this.f40875c;
        iu.w wVar = this.f40874b;
        switch (i10) {
            case 0:
                float f11 = wVar.f20557a;
                wVar.f20557a = q1Var.a(f10 - f11) + f11;
                return;
            default:
                wVar.f20557a += q1Var.a(f10 - wVar.f20557a);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f40873a) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                a(floatValue);
                return Unit.f23355a;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                a(floatValue2);
                return Unit.f23355a;
        }
    }
}
