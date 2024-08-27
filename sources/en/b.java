package en;

import c2.j0;
import c2.x1;
import el.l;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.f;
import n1.o0;
import n1.r;
import n1.x0;
import p1.e;
import t0.g1;
import t0.l3;
import t0.t;
import w.q1;

/* loaded from: classes2.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f15746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f15747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f15748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1 f15750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1 f15751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l3 f15752g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l3 f15753h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1 f15754i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, x1 x1Var, x0 x0Var, long j10, x1 x1Var2, x1 x1Var3, q1 q1Var, q1 q1Var2, g1 g1Var) {
        super(1);
        this.f15746a = fVar;
        this.f15747b = x1Var;
        this.f15748c = x0Var;
        this.f15749d = j10;
        this.f15750e = x1Var2;
        this.f15751f = x1Var3;
        this.f15752g = q1Var;
        this.f15753h = q1Var2;
        this.f15754i = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e drawWithContent = (e) obj;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        l3 l3Var = this.f15752g;
        float floatValue = ((Number) l3Var.getValue()).floatValue();
        f fVar = this.f15746a;
        if (0.01f <= floatValue && floatValue <= 0.99f) {
            fVar.d(((Number) l3Var.getValue()).floatValue());
            j0 j0Var = (j0) drawWithContent;
            r a10 = j0Var.f7740a.f30501b.a();
            a10.n(t.F0(j0Var.f7740a.d()), fVar);
            j0Var.a();
            a10.s();
        } else if (((Number) l3Var.getValue()).floatValue() >= 0.99f) {
            ((j0) drawWithContent).a();
        }
        l3 l3Var2 = this.f15753h;
        float floatValue2 = ((Number) l3Var2.getValue()).floatValue();
        g1 g1Var = this.f15754i;
        x1 x1Var = this.f15751f;
        x1 x1Var2 = this.f15750e;
        x1 x1Var3 = this.f15747b;
        if (0.01f <= floatValue2 && floatValue2 <= 0.99f) {
            fVar.d(((Number) l3Var2.getValue()).floatValue());
            x0 x0Var = this.f15748c;
            long j10 = this.f15749d;
            j0 j0Var2 = (j0) drawWithContent;
            r a11 = j0Var2.f7740a.f30501b.a();
            a11.n(t.F0(j0Var2.f7740a.d()), fVar);
            x1Var3.f7881a = l.o(j0Var2, x0Var, j10, ((Number) g1Var.getValue()).floatValue(), (o0) x1Var3.f7881a, (w2.k) x1Var2.f7881a, (m1.f) x1Var.f7881a);
            a11.s();
        } else if (((Number) l3Var2.getValue()).floatValue() >= 0.99f) {
            x1Var3.f7881a = l.o(drawWithContent, this.f15748c, this.f15749d, ((Number) g1Var.getValue()).floatValue(), (o0) x1Var3.f7881a, (w2.k) x1Var2.f7881a, (m1.f) x1Var.f7881a);
        }
        j0 j0Var3 = (j0) drawWithContent;
        x1Var.f7881a = new m1.f(j0Var3.f7740a.d());
        x1Var2.f7881a = j0Var3.getLayoutDirection();
        return Unit.f23355a;
    }
}
