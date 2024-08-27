package a2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i1 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f87b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(j1 j1Var, int i10) {
        super(2);
        this.f86a = i10;
        this.f87b = j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f86a;
        j1 j1Var = this.f87b;
        switch (i10) {
            case 0:
                j1Var.a().f71b = (t0.v) obj2;
                return Unit.f23355a;
            case 1:
                i0 a10 = j1Var.a();
                ((androidx.compose.ui.node.a) obj).Y(new f0(a10, (Function2) obj2, a10.f85p));
                return Unit.f23355a;
            default:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                i0 i0Var = aVar.f1424y;
                if (i0Var == null) {
                    i0Var = new i0(aVar, j1Var.f91a);
                    aVar.f1424y = i0Var;
                }
                j1Var.f92b = i0Var;
                j1Var.a().d();
                i0 a11 = j1Var.a();
                m1 m1Var = a11.f72c;
                m1 m1Var2 = j1Var.f91a;
                if (m1Var != m1Var2) {
                    a11.f72c = m1Var2;
                    a11.e(false);
                    androidx.compose.ui.node.a.S(a11.f70a, false, 3);
                }
                return Unit.f23355a;
        }
    }
}
