package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p2 f27207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.b f27208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f27209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p2 p2Var, w2.b bVar, float f10) {
        super(0);
        this.f27207a = p2Var;
        this.f27208b = bVar;
        this.f27209c = f10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Object value;
        p2 p2Var = this.f27207a;
        p2Var.f26628b = this.f27208b;
        b0.b1 b1Var = new b0.b1(this.f27209c, s0.g.f34069a, 6);
        x1 x1Var = new x1();
        b1Var.invoke(x1Var);
        y3 y3Var = new y3(x1Var.f27076a);
        y yVar = p2Var.f26627a;
        boolean isNaN = Float.isNaN(yVar.f27123j.i());
        t0.j0 j0Var = yVar.f27121h;
        if (!isNaN) {
            value = y3Var.a(yVar.f27123j.i());
            if (value == null) {
                value = j0Var.getValue();
            }
        } else {
            value = j0Var.getValue();
        }
        if (!Intrinsics.a(yVar.d(), y3Var)) {
            yVar.f27126m.setValue(y3Var);
            if (!yVar.k(value)) {
                yVar.i(value);
            }
        }
        return Unit.f23355a;
    }
}
