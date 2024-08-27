package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f39589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2 f39590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(boolean z10, boolean z11, boolean z12, o2 o2Var, qu.f0 f0Var) {
        super(1);
        this.f39587a = z10;
        this.f39588b = z11;
        this.f39589c = z12;
        this.f39590d = o2Var;
        this.f39591e = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h2.v vVar = (h2.v) obj;
        ou.g[] gVarArr = h2.t.f17908a;
        h2.u uVar = h2.r.f17893m;
        ou.g[] gVarArr2 = h2.t.f17908a;
        ou.g gVar = gVarArr2[5];
        uVar.a(vVar, Boolean.TRUE);
        o2 o2Var = this.f39590d;
        h2.h hVar = new h2.h(new l2(o2Var, 0), new l2(o2Var, 1), this.f39587a);
        boolean z10 = this.f39588b;
        if (z10) {
            h2.u uVar2 = h2.r.f17898r;
            ou.g gVar2 = gVarArr2[8];
            uVar2.a(vVar, hVar);
        } else {
            h2.u uVar3 = h2.r.f17897q;
            ou.g gVar3 = gVarArr2[7];
            uVar3.a(vVar, hVar);
        }
        if (this.f39589c) {
            h2.j jVar = (h2.j) vVar;
            jVar.h(h2.i.f17828d, new h2.a(null, new k2((qu.f0) this.f39591e, z10, o2Var)));
        }
        return Unit.f23355a;
    }
}
