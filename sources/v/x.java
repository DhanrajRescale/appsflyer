package v;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.l3;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f37630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(l3 l3Var, int i10) {
        super(1);
        this.f37629a = i10;
        this.f37630b = l3Var;
    }

    public final void a(n1.f0 graphicsLayer) {
        int i10 = this.f37629a;
        l3 l3Var = this.f37630b;
        switch (i10) {
            case 0:
                ((n1.u0) graphicsLayer).a(((Number) l3Var.getValue()).floatValue());
                return;
            default:
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                ((n1.u0) graphicsLayer).g(((Number) l3Var.getValue()).floatValue());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f37629a;
        l3 l3Var = this.f37630b;
        switch (i10) {
            case 0:
                a((n1.f0) obj);
                return Unit.f23355a;
            case 1:
                return (Float) ((Function1) l3Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
            case 2:
                ((Function1) l3Var.getValue()).invoke(new m1.c(((m1.c) obj).f27237a));
                return Unit.f23355a;
            default:
                a((n1.f0) obj);
                return Unit.f23355a;
        }
    }
}
