package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d7 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f26055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7(t0.l3 l3Var, int i10) {
        super(1);
        this.f26054a = i10;
        this.f26055b = l3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f26054a;
        t0.l3 l3Var = this.f26055b;
        switch (i10) {
            case 0:
                p1.h hVar = (p1.h) obj;
                long j10 = ((n1.t) l3Var.getValue()).f28179a;
                float c02 = hVar.c0(f7.f26170a);
                float c03 = hVar.c0(f7.f26171b);
                float f10 = c03 / 2;
                p1.h.v0(hVar, j10, t0.t.g(f10, m1.c.e(hVar.p0())), t0.t.g(c02 - f10, m1.c.e(hVar.p0())), c03, 1, 480);
                return Unit.f23355a;
            default:
                return new w2.h(hl.f.j(((w2.b) obj).m0(((w2.e) l3Var.getValue()).f38783a), 0));
        }
    }
}
