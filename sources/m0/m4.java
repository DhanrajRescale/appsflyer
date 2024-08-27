package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m4 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(int i10, Object obj, Object obj2) {
        super(1);
        this.f26489a = i10;
        this.f26490b = obj;
        this.f26491c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f26489a;
        Object obj2 = this.f26491c;
        Object obj3 = this.f26490b;
        switch (i10) {
            case 0:
                h2.v vVar = (h2.v) obj;
                w4 w4Var = (w4) obj3;
                if (w4Var.f27020b.f27120g.getValue() != x4.f27081a) {
                    qu.f0 f0Var = (qu.f0) obj2;
                    h4 h4Var = new h4(1, w4Var, f0Var);
                    ou.g[] gVarArr = h2.t.f17908a;
                    h2.j jVar = (h2.j) vVar;
                    jVar.h(h2.i.f17843s, new h2.a(null, h4Var));
                    y yVar = w4Var.f27020b;
                    Object value = yVar.f27120g.getValue();
                    x4 x4Var = x4.f27083c;
                    if (value == x4Var) {
                        jVar.h(h2.i.f17841q, new h2.a(null, new h4(2, w4Var, f0Var)));
                    } else if (yVar.d().f27137a.containsKey(x4Var)) {
                        jVar.h(h2.i.f17842r, new h2.a(null, new h4(3, w4Var, f0Var)));
                    }
                }
                return Unit.f23355a;
            default:
                ((y4) obj3).f27138a.setValue(new b0.f0((b0.x1) obj2, (b0.x1) obj));
                return Unit.f23355a;
        }
    }
}
