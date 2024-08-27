package b0;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i10, int i11, Object obj) {
        super(1);
        this.f2907a = i11;
        this.f2908b = i10;
        this.f2909c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f2907a;
        int i11 = this.f2908b;
        Object obj2 = this.f2909c;
        switch (i10) {
            case 0:
                ((a2.a1[]) obj2)[i11 + 1] = (a2.a1) obj;
                return Unit.f23355a;
            case 1:
                return Boolean.valueOf(((List) obj).addAll(i11, (Collection) obj2));
            default:
                n1.f0 graphicsLayer = (n1.f0) obj;
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                float i12 = ((e0.j0) obj2).f14718d.f14651c.i() + Math.abs(i11 - r2.f14718d.f14650b.i());
                float z02 = hl.f.z0(0.85f, 1.0f, 1.0f - kotlin.ranges.d.e(i12, s0.g.f34069a, 1.0f));
                n1.u0 u0Var = (n1.u0) graphicsLayer;
                u0Var.i(z02);
                u0Var.j(z02);
                u0Var.a(hl.f.z0(0.9f, 1.0f, 1.0f - kotlin.ranges.d.e(i12, s0.g.f34069a, 1.0f)));
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(a2.a1[] a1VarArr, int i10) {
        super(1);
        this.f2907a = 0;
        this.f2909c = a1VarArr;
        this.f2908b = i10;
    }
}
