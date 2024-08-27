package o8;

import a2.a1;
import a2.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f29834b;

    public /* synthetic */ r(int i10, a1 a1Var) {
        this.f29833a = i10;
        this.f29834b = a1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f29833a;
        a1 a1Var = this.f29834b;
        switch (i10) {
            case 0:
                z0.d((z0) obj, a1Var, 0, 0);
                return Unit.f23355a;
            default:
                z0.g((z0) obj, a1Var, 0, 0);
                return Unit.f23355a;
        }
    }
}
