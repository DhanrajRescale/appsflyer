package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        super(2);
        this.f26077a = i10;
        this.f26078b = obj;
        this.f26079c = obj2;
    }

    public final void a(t0.n nVar, int i10) {
        float f10;
        int i11 = this.f26077a;
        Object obj = this.f26079c;
        Object obj2 = this.f26078b;
        switch (i11) {
            case 1:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                Function2 function2 = (Function2) obj2;
                if (function2 == null) {
                    f10 = n3.f26523d;
                } else {
                    f10 = n3.f26522c;
                }
                float f11 = f10;
                g1.l lVar = g1.l.f16404b;
                g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, f11, s0.g.f34069a, n3.f26523d, s0.g.f34069a, 10);
                g1.f fVar = g1.a.f16389k;
                Function2 function22 = (Function2) obj;
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(693286680);
                b0.l1 a10 = b0.o1.a(b0.n.f2935a, fVar, rVar2, 48);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                t0.r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(x10);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a10, c2.k.f7749e);
                    t0.t.v0(rVar2, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar);
                    }
                    v.e.w(rVar2, j10, rVar2, 0, 2058660585);
                    rVar2.b0(-1435223672);
                    if (function2 != null) {
                        function2.invoke(rVar2, 0);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, n3.f26522c), rVar2);
                    }
                    rVar2.s(false);
                    function22.invoke(rVar2, 0);
                    rVar2.s(false);
                    rVar2.s(true);
                    rVar2.s(false);
                    rVar2.s(false);
                    return;
                }
                al.d.v0();
                throw null;
            case 2:
                if ((i10 & 3) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                ((hu.c) obj2).b((b0.p1) obj, nVar, 0);
                return;
            case 3:
                if ((i10 & 3) == 2) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                ((hu.c) obj2).b(((b6) obj).f25942b, nVar, 0);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar5 = (t0.r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                a3.a.u(obj);
                Intrinsics.c(null);
                ((hu.c) obj2).b(null, nVar, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26077a) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                y yVar = ((s) this.f26078b).f26751a;
                yVar.f27123j.j(floatValue);
                yVar.f27124k.j(floatValue2);
                ((iu.w) this.f26079c).f20557a = floatValue;
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
