package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class v1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f19236b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(a2 a2Var, int i10) {
        super(1);
        this.f19235a = i10;
        this.f19236b = a2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f19235a;
        a2 a2Var = this.f19236b;
        switch (i10) {
            case 0:
                a2Var.b(((m1.c) obj).f27237a);
                return Unit.f23355a;
            default:
                x1.t tVar = (x1.t) obj;
                a2Var.e(t0.t.p0(tVar, false));
                tVar.a();
                return Unit.f23355a;
        }
    }
}
