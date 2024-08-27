package w;

import kotlin.jvm.functions.Function1;
import t0.o3;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f38632a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.n1 f38633b = t0.t.n0(null, o3.f35116a);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f38634c;

    public o1(u1 u1Var, y1 y1Var, String str) {
        this.f38634c = u1Var;
        this.f38632a = y1Var;
    }

    public final n1 a(Function1 function1, Function1 function12) {
        t0.n1 n1Var = this.f38633b;
        n1 n1Var2 = (n1) n1Var.getValue();
        u1 u1Var = this.f38634c;
        if (n1Var2 == null) {
            Object invoke = function12.invoke(u1Var.c());
            Object invoke2 = function12.invoke(u1Var.c());
            y1 y1Var = this.f38632a;
            t tVar = (t) y1Var.f38734a.invoke(invoke2);
            tVar.d();
            q1 q1Var = new q1(u1Var, invoke, tVar, y1Var);
            n1Var2 = new n1(this, q1Var, function1, function12);
            n1Var.setValue(n1Var2);
            u1Var.f38694h.add(q1Var);
        }
        n1Var2.f38619c = function12;
        n1Var2.f38618b = function1;
        n1Var2.b(u1Var.e());
        return n1Var2;
    }
}
