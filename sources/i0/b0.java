package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f18793b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(l0.v0 v0Var, int i10) {
        super(1);
        this.f18792a = i10;
        this.f18793b = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f18792a;
        l0.v0 v0Var = this.f18793b;
        switch (i10) {
            case 0:
                return new c.c(v0Var, 5);
            default:
                long j10 = ((m1.c) obj).f27237a;
                v0Var.q();
                return Unit.f23355a;
        }
    }
}
