package a2;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f0 extends c2.g0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f59b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f60c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, Function2 function2, String str) {
        super(str);
        this.f59b = i0Var;
        this.f60c = function2;
    }

    @Override // a2.m0
    public final n0 a(o0 o0Var, List list, long j10) {
        i0 i0Var = this.f59b;
        i0Var.f77h.f49a = o0Var.getLayoutDirection();
        i0Var.f77h.f50b = o0Var.b();
        i0Var.f77h.f51c = o0Var.Y();
        boolean a02 = o0Var.a0();
        Function2 function2 = this.f60c;
        if (!a02 && i0Var.f70a.f1402c != null) {
            i0Var.f74e = 0;
            n0 n0Var = (n0) function2.invoke(i0Var.f78i, new w2.a(j10));
            i0 i0Var2 = this.f59b;
            return new e0(n0Var, i0Var2, i0Var2.f74e, n0Var, 0);
        }
        i0Var.f73d = 0;
        n0 n0Var2 = (n0) function2.invoke(i0Var.f77h, new w2.a(j10));
        i0 i0Var3 = this.f59b;
        return new e0(n0Var2, i0Var3, i0Var3.f73d, n0Var2, 1);
    }
}
