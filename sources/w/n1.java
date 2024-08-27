package w;

import kotlin.jvm.functions.Function1;
import t0.l3;

/* loaded from: classes.dex */
public final class n1 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f38617a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f38618b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f38619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f38620d;

    public n1(o1 o1Var, q1 q1Var, Function1 function1, Function1 function12) {
        this.f38620d = o1Var;
        this.f38617a = q1Var;
        this.f38618b = function1;
        this.f38619c = function12;
    }

    public final void b(p1 p1Var) {
        Object invoke = this.f38619c.invoke(p1Var.f38640b);
        boolean f10 = this.f38620d.f38634c.f();
        q1 q1Var = this.f38617a;
        if (f10) {
            q1Var.g(this.f38619c.invoke(p1Var.f38639a), invoke, (f0) this.f38618b.invoke(p1Var));
        } else {
            q1Var.h(invoke, (f0) this.f38618b.invoke(p1Var));
        }
    }

    @Override // t0.l3
    public final Object getValue() {
        b(this.f38620d.f38634c.e());
        return this.f38617a.f38655i.getValue();
    }
}
