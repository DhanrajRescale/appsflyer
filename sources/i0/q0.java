package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p2.j0 f19125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2.c0 f19126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.o f19129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q1 f19130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p2.v f19131g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f19132h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1.o f19133i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p2.j0 j0Var, p2.c0 c0Var, boolean z10, boolean z11, p2.o oVar, q1 q1Var, p2.v vVar, l0.v0 v0Var, l1.o oVar2) {
        super(1);
        this.f19125a = j0Var;
        this.f19126b = c0Var;
        this.f19127c = z10;
        this.f19128d = z11;
        this.f19129e = oVar;
        this.f19130f = q1Var;
        this.f19131g = vVar;
        this.f19132h = v0Var;
        this.f19133i = oVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h2.v vVar = (h2.v) obj;
        j2.e eVar = this.f19125a.f30580a;
        ou.g[] gVarArr = h2.t.f17908a;
        h2.u uVar = h2.r.f17906z;
        ou.g[] gVarArr2 = h2.t.f17908a;
        ou.g gVar = gVarArr2[13];
        uVar.a(vVar, eVar);
        p2.c0 c0Var = this.f19126b;
        long j10 = c0Var.f30523b;
        h2.u uVar2 = h2.r.A;
        ou.g gVar2 = gVarArr2[14];
        uVar2.a(vVar, new j2.f0(j10));
        boolean z10 = this.f19127c;
        if (!z10) {
            ((h2.j) vVar).h(h2.r.f17890j, Unit.f23355a);
        }
        boolean z11 = this.f19128d;
        if (z10 && !z11) {
            ((h2.j) vVar).h(h2.r.H, Unit.f23355a);
        }
        q1 q1Var = this.f19130f;
        h2.t.c(vVar, new h0(q1Var, 2));
        h2.j jVar = (h2.j) vVar;
        jVar.h(h2.i.f17832h, new h2.a(null, new m0(z11, z10, q1Var, vVar)));
        jVar.h(h2.i.f17836l, new h2.a(null, new n0(this.f19128d, this.f19127c, this.f19130f, vVar, this.f19126b)));
        jVar.h(h2.i.f17831g, new h2.a(null, new o0(this.f19131g, this.f19127c, this.f19126b, this.f19132h, this.f19130f)));
        p2.o oVar = this.f19129e;
        int i10 = oVar.f30600e;
        x.y0 y0Var = new x.y0(4, q1Var, oVar);
        jVar.h(h2.r.B, new p2.n(i10));
        jVar.h(h2.i.f17837m, new h2.a(null, y0Var));
        jVar.h(h2.i.f17826b, new h2.a(null, new p0(q1Var, this.f19133i, z11, 0)));
        l0.v0 v0Var = this.f19132h;
        jVar.h(h2.i.f17827c, new h2.a(null, new l0(v0Var, 1)));
        if (!j2.f0.b(c0Var.f30523b)) {
            jVar.h(h2.i.f17838n, new h2.a(null, new l0(v0Var, 2)));
            if (z10 && !z11) {
                jVar.h(h2.i.f17839o, new h2.a(null, new l0(v0Var, 3)));
            }
        }
        if (z10 && !z11) {
            jVar.h(h2.i.f17840p, new h2.a(null, new l0(v0Var, 0)));
        }
        return Unit.f23355a;
    }
}
