package p0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n1.f0;
import n1.u0;
import w.e0;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f30466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30467b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(o oVar, boolean z10) {
        super(1);
        this.f30466a = oVar;
        this.f30467b = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o oVar = this.f30466a;
        u0 u0Var = (u0) ((f0) obj);
        u0Var.z(oVar.f30484e.i() - m1.f.c(u0Var.f28198r));
        if (this.f30467b && !oVar.c()) {
            float b10 = e0.f38471b.b(oVar.f30484e.i() / oVar.f30486g.i());
            if (b10 < s0.g.f34069a) {
                b10 = 0.0f;
            }
            if (b10 > 1.0f) {
                b10 = 1.0f;
            }
            u0Var.i(b10);
            u0Var.j(b10);
        }
        return Unit.f23355a;
    }
}
