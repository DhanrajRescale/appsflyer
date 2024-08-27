package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f18987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.d0 f18990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.c0 f18991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2.o f18992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p2.v f18993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f18994h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f18995i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0.f f18996j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(q1 q1Var, boolean z10, boolean z11, p2.d0 d0Var, p2.c0 c0Var, p2.o oVar, p2.v vVar, l0.v0 v0Var, qu.f0 f0Var, f0.f fVar) {
        super(1);
        this.f18987a = q1Var;
        this.f18988b = z10;
        this.f18989c = z11;
        this.f18990d = d0Var;
        this.f18991e = c0Var;
        this.f18992f = oVar;
        this.f18993g = vVar;
        this.f18994h = v0Var;
        this.f18995i = f0Var;
        this.f18996j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2 d10;
        q1 q1Var = this.f18987a;
        l1.s sVar = (l1.s) ((l1.r) obj);
        if (q1Var.b() != sVar.a()) {
            q1Var.f19139f.setValue(Boolean.valueOf(sVar.a()));
            if (q1Var.b() && this.f18988b && !this.f18989c) {
                l1.o(this.f18990d, q1Var, this.f18991e, this.f18992f, this.f18993g);
            } else {
                l1.k(q1Var);
            }
            if (sVar.a() && (d10 = q1Var.d()) != null) {
                yk.g.H(this.f18995i, null, null, new i0(this.f18996j, this.f18991e, this.f18987a, d10, this.f18993g, null), 3);
            }
            if (!sVar.a()) {
                this.f18994h.g(null);
            }
        }
        return Unit.f23355a;
    }
}
