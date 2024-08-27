package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m0.q2;

/* loaded from: classes.dex */
public final class b1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(float f10, float f11, int i10) {
        super(1);
        this.f2827a = i10;
        this.f2828b = f10;
        this.f2829c = f11;
    }

    public final void a() {
        switch (this.f2827a) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q2 q2Var = q2.f26667b;
        q2 q2Var2 = q2.f26666a;
        float f10 = this.f2828b;
        float f11 = this.f2829c;
        int i10 = this.f2827a;
        switch (i10) {
            case 0:
                a3.a.u(obj);
                a();
                throw null;
            case 1:
                a3.a.u(obj);
                a();
                throw null;
            case 6:
                m0.x1 x1Var = (m0.x1) obj;
                switch (i10) {
                    case 6:
                        x1Var.a(f10, q2Var2);
                        x1Var.a(f11, q2Var);
                        break;
                    default:
                        x1Var.a(f10, Boolean.FALSE);
                        x1Var.a(f11, Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
            default:
                m0.x1 x1Var2 = (m0.x1) obj;
                switch (i10) {
                    case 6:
                        x1Var2.a(f10, q2Var2);
                        x1Var2.a(f11, q2Var);
                        break;
                    default:
                        x1Var2.a(f10, Boolean.FALSE);
                        x1Var2.a(f11, Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
