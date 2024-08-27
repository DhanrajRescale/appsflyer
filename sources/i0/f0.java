package i0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f18854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2.g0 f18855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18856c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f18858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2.c0 f18859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p2.l0 f18860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1.o f18861h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1.o f18862i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1.o f18863j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1.o f18864k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0.f f18865l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f18866m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f18867n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f18868o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function1 f18869p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p2.v f18870q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w2.b f18871r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(q1 q1Var, j2.g0 g0Var, int i10, int i11, q2 q2Var, p2.c0 c0Var, p2.l0 l0Var, g1.o oVar, g1.o oVar2, g1.o oVar3, g1.o oVar4, f0.f fVar, l0.v0 v0Var, boolean z10, boolean z11, Function1 function1, p2.v vVar, w2.b bVar) {
        super(2);
        this.f18854a = q1Var;
        this.f18855b = g0Var;
        this.f18856c = i10;
        this.f18857d = i11;
        this.f18858e = q2Var;
        this.f18859f = c0Var;
        this.f18860g = l0Var;
        this.f18861h = oVar;
        this.f18862i = oVar2;
        this.f18863j = oVar3;
        this.f18864k = oVar4;
        this.f18865l = fVar;
        this.f18866m = v0Var;
        this.f18867n = z10;
        this.f18868o = z11;
        this.f18869p = function1;
        this.f18870q = vVar;
        this.f18871r = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        g1.o c3Var;
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        g1.l lVar = g1.l.f16404b;
        q1 q1Var = this.f18854a;
        g1.o h10 = androidx.compose.foundation.layout.d.h(lVar, ((w2.e) q1Var.f19140g.getValue()).f38783a, Float.NaN);
        d2.s sVar = d2.s.f13613k;
        int i10 = this.f18856c;
        int i11 = this.f18857d;
        j2.g0 g0Var = this.f18855b;
        g1.o H = t0.t.H(h10, sVar, new c1(i10, i11, g0Var));
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-531187028);
        boolean j10 = rVar2.j(q1Var);
        Object Q = rVar2.Q();
        if (j10 || Q == t0.m.f35080a) {
            Q = new x.a(q1Var, 9);
            rVar2.k0(Q);
        }
        Function0 function0 = (Function0) Q;
        rVar2.s(false);
        q2 q2Var = this.f18858e;
        y.g1 g1Var = (y.g1) q2Var.f19161e.getValue();
        p2.c0 c0Var = this.f18859f;
        long j11 = c0Var.f30523b;
        int i12 = j2.f0.f20711c;
        int i13 = (int) (j11 >> 32);
        long j12 = q2Var.f19160d;
        if (i13 == ((int) (j12 >> 32)) && (i13 = (int) (j11 & 4294967295L)) == ((int) (4294967295L & j12))) {
            i13 = j2.f0.e(j11);
        }
        q2Var.f19160d = c0Var.f30523b;
        p2.j0 r10 = l1.r(this.f18860g, c0Var.f30522a);
        int ordinal = g1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c3Var = new e1(q2Var, i13, r10, function0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            c3Var = new c3(q2Var, i13, r10, function0);
        }
        dp.b.i0(androidx.compose.foundation.relocation.a.a(t0.t.H(androidx.compose.ui.draw.a.c(H).g(c3Var).g(this.f18861h).g(this.f18862i), sVar, new v.g(g0Var, 5)).g(this.f18863j).g(this.f18864k), this.f18865l), b1.d.b(rVar2, -363167407, new e0(this.f18866m, this.f18854a, this.f18867n, this.f18868o, this.f18869p, this.f18859f, this.f18870q, this.f18871r, this.f18857d)), rVar2, 48, 0);
        return Unit.f23355a;
    }
}
