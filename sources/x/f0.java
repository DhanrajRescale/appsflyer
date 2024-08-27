package x;

import d2.q3;
import d2.r3;
import i0.s2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f39553g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f39547a = i10;
        this.f39549c = obj;
        this.f39548b = z10;
        this.f39550d = obj2;
        this.f39551e = obj3;
        this.f39552f = obj4;
        this.f39553g = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p2.i0 i0Var;
        a2.u uVar;
        a2.u uVar2;
        int i10 = this.f39547a;
        Object obj2 = this.f39553g;
        Object obj3 = this.f39550d;
        Object obj4 = this.f39551e;
        Object obj5 = this.f39552f;
        boolean z10 = this.f39548b;
        Object obj6 = this.f39549c;
        switch (i10) {
            case 1:
                h2.v vVar = (h2.v) obj;
                ou.g[] gVarArr = h2.t.f17908a;
                h2.u uVar3 = h2.r.f17893m;
                ou.g[] gVarArr2 = h2.t.f17908a;
                ou.g gVar = gVarArr2[5];
                uVar3.a(vVar, Boolean.TRUE);
                h2.j jVar = (h2.j) vVar;
                jVar.h(h2.r.G, (Function1) obj6);
                if (z10) {
                    h2.u uVar4 = h2.r.f17898r;
                    ou.g gVar2 = gVarArr2[8];
                    uVar4.a(vVar, (h2.h) obj3);
                } else {
                    h2.u uVar5 = h2.r.f17897q;
                    ou.g gVar3 = gVarArr2[7];
                    uVar5.a(vVar, (h2.h) obj3);
                }
                Function2 function2 = (Function2) obj4;
                if (function2 != null) {
                    jVar.h(h2.i.f17828d, new h2.a(null, function2));
                }
                Function1 function1 = (Function1) obj5;
                if (function1 != null) {
                    jVar.h(h2.i.f17829e, new h2.a(null, function1));
                }
                h2.u uVar6 = h2.r.f17887g;
                ou.g gVar4 = gVarArr2[17];
                uVar6.a(vVar, (h2.b) obj2);
                return Unit.f23355a;
            default:
                a2.u uVar7 = (a2.u) obj;
                i0.q1 q1Var = (i0.q1) obj6;
                q1Var.f19141h = uVar7;
                s2 d10 = q1Var.d();
                if (d10 != null) {
                    d10.f19195b = uVar7;
                }
                if (z10) {
                    i0.a1 a10 = q1Var.a();
                    i0.a1 a1Var = i0.a1.f18783b;
                    t0.n1 n1Var = q1Var.f19148o;
                    if (a10 == a1Var) {
                        if (((Boolean) q1Var.f19145l.getValue()).booleanValue() && ((Boolean) ((r3) ((q3) obj3)).f13603a.getValue()).booleanValue()) {
                            ((l0.v0) obj4).q();
                        } else {
                            ((l0.v0) obj4).l();
                        }
                        l0.v0 v0Var = (l0.v0) obj4;
                        q1Var.f19146m.setValue(Boolean.valueOf(al.d.w0(v0Var, true)));
                        q1Var.f19147n.setValue(Boolean.valueOf(al.d.w0(v0Var, false)));
                        n1Var.setValue(Boolean.valueOf(j2.f0.b(((p2.c0) obj5).f30523b)));
                    } else if (q1Var.a() == i0.a1.f18784c) {
                        n1Var.setValue(Boolean.valueOf(al.d.w0((l0.v0) obj4, true)));
                    }
                    p2.c0 c0Var = (p2.c0) obj5;
                    p2.v vVar2 = (p2.v) obj2;
                    i0.l1.v(q1Var, c0Var, vVar2);
                    s2 d11 = q1Var.d();
                    if (d11 != null && (i0Var = q1Var.f19138e) != null && q1Var.b() && (uVar = d11.f19195b) != null && uVar.m() && (uVar2 = d11.f19196c) != null) {
                        j2.e0 e0Var = d11.f19194a;
                        t.g0 g0Var = new t.g0(uVar, 14);
                        m1.d a11 = l0.l0.a(uVar);
                        m1.d i11 = uVar.i(uVar2, false);
                        if (Intrinsics.a((p2.i0) i0Var.f30576a.f30533b.get(), i0Var)) {
                            i0Var.f30577b.a(c0Var, vVar2, e0Var, g0Var, a11, i11);
                        }
                    }
                }
                return Unit.f23355a;
        }
    }
}
