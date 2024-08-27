package x;

import androidx.compose.foundation.ScrollingLayoutElement;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m2 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2 f39634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f39636c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f39637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y.x0 f39638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(o2 o2Var, y.x0 x0Var, boolean z10, boolean z11, boolean z12) {
        super(3);
        this.f39634a = o2Var;
        this.f39635b = z10;
        this.f39636c = z11;
        this.f39637d = z12;
        this.f39638e = x0Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        y.g1 g1Var;
        g1.o oVar = (g1.o) obj;
        ((Number) obj3).intValue();
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(1478351300);
        rVar.b0(773894976);
        rVar.b0(-723523240);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (Q == eVar) {
            Q = v.e.o(t0.t.I(kotlin.coroutines.k.f23369a, rVar), rVar);
        }
        rVar.s(false);
        qu.f0 f0Var = ((t0.d0) Q).f34970a;
        rVar.s(false);
        rVar.b0(-1641237577);
        o2 o2Var = this.f39634a;
        boolean h10 = rVar.h(o2Var);
        boolean z10 = this.f39635b;
        boolean i10 = h10 | rVar.i(z10);
        boolean z11 = this.f39636c;
        boolean i11 = i10 | rVar.i(z11) | rVar.i(this.f39637d) | rVar.j(f0Var);
        boolean z12 = this.f39635b;
        boolean z13 = this.f39636c;
        boolean z14 = this.f39637d;
        o2 o2Var2 = this.f39634a;
        Object Q2 = rVar.Q();
        if (i11 || Q2 == eVar) {
            Q2 = new i2(z12, z13, z14, o2Var2, f0Var);
            rVar.k0(Q2);
        }
        rVar.s(false);
        g1.o a10 = h2.l.a(oVar, false, (Function1) Q2);
        if (z11) {
            g1Var = y.g1.f40723a;
        } else {
            g1Var = y.g1.f40724b;
        }
        g1.o g10 = androidx.compose.foundation.a.p(a10, o2Var, g1Var, this.f39637d, this.f39635b, this.f39638e, o2Var.f39655c, null, rVar, 64).g(new ScrollingLayoutElement(o2Var, z10, z11));
        rVar.s(false);
        return g10;
    }
}
