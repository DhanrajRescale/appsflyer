package g7;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17127a;

    /* renamed from: b, reason: collision with root package name */
    public int f17128b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ tu.g f17129c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f17130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17132f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(yt.a aVar, Object obj, e4 e4Var, int i10) {
        super(3, aVar);
        this.f17127a = i10;
        this.f17131e = obj;
        this.f17132f = e4Var;
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f17127a) {
            case 0:
                return i((tu.g) obj, obj2, (yt.a) obj3);
            default:
                return i((tu.g) obj, obj2, (yt.a) obj3);
        }
    }

    public final Object i(tu.g gVar, Object obj, yt.a aVar) {
        int i10 = this.f17127a;
        Object obj2 = this.f17132f;
        Object obj3 = this.f17131e;
        switch (i10) {
            case 0:
                a3.a.u(obj2);
                y yVar = new y(aVar, (qu.f0) obj3, null, 0);
                yVar.f17129c = gVar;
                yVar.f17130d = obj;
                return yVar.invokeSuspend(Unit.f23355a);
            default:
                y yVar2 = new y(aVar, (x1) obj3, (e4) obj2, 1);
                yVar2.f17129c = gVar;
                yVar2.f17130d = obj;
                return yVar2.invokeSuspend(Unit.f23355a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [au.i, kotlin.jvm.functions.Function2] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        tu.f u10;
        int i10 = this.f17127a;
        Object obj2 = this.f17132f;
        Object obj3 = this.f17131e;
        switch (i10) {
            case 0:
                zt.a aVar = zt.a.f42823a;
                int i11 = this.f17128b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ut.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ut.n.b(obj);
                    tu.g gVar = this.f17129c;
                    c3 c3Var = (c3) this.f17130d;
                    a3.a.u(obj2);
                    d1 d1Var = new d1((qu.f0) obj3, c3Var);
                    this.f17128b = 1;
                    if (gVar.a(d1Var, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f23355a;
            default:
                zt.a aVar2 = zt.a.f42823a;
                int i12 = this.f17128b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ut.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ut.n.b(obj);
                    tu.g gVar2 = this.f17129c;
                    k1 k1Var = (k1) this.f17130d;
                    x1 x1Var = (x1) obj3;
                    t2 t2Var = k1Var.f16860a;
                    e4 e4Var = (e4) obj2;
                    x1Var.getClass();
                    if (e4Var == null) {
                        u10 = t2Var.f17075l;
                    } else {
                        w1 block = new w1(e4Var, t2Var, new h.c(22, 0), null);
                        qu.o1 controller = k1Var.f16862c;
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        Intrinsics.checkNotNullParameter(block, "block");
                        u10 = q6.l.u(new b0(controller, block, null));
                    }
                    c3 c3Var2 = new c3(new tu.u(u10, new au.i(2, null), 2), new m1(x1Var, x1Var.f17123e), new l1(k1Var.f16860a), e.f16717c);
                    this.f17128b = 1;
                    if (gVar2.a(c3Var2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f23355a;
        }
    }
}
