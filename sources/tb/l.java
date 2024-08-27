package tb;

import c0.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class l extends iu.k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f35716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.c f35718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f35719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f35720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f35721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f35722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0 f35723h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hu.c f35724i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hu.c f35725j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, String str, sb.c cVar, g1 g1Var, Function2 function2, Function1 function1, Function1 function12, m0 m0Var, hu.c cVar2, hu.c cVar3) {
        super(4);
        this.f35716a = list;
        this.f35717b = str;
        this.f35718c = cVar;
        this.f35719d = g1Var;
        this.f35720e = function2;
        this.f35721f = function1;
        this.f35722g = function12;
        this.f35723h = m0Var;
        this.f35724i = cVar2;
        this.f35725j = cVar3;
    }

    @Override // hu.d
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        sb.c cVar;
        int i11;
        int i12;
        c0.c cVar2 = (c0.c) obj;
        int intValue = ((Number) obj2).intValue();
        t0.n nVar = (t0.n) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((t0.r) nVar).h(cVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | intValue2;
        } else {
            i10 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((t0.r) nVar).f(intValue)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 147) == 146) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        int i13 = i10 & 14;
        hb.u uVar = (hb.u) this.f35716a.get(intValue);
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(202863998);
        rVar2.b0(1253470062);
        String str = this.f35717b;
        boolean h10 = rVar2.h(str) | rVar2.h(this.f35718c);
        Object Q = rVar2.Q();
        to.e eVar = t0.m.f35080a;
        if (h10 || Q == eVar) {
            if (Intrinsics.a(uVar.f18230a.f18224a, str)) {
                cVar = sb.c.f34440d;
            } else {
                cVar = null;
            }
            Q = cVar;
            rVar2.k0(Q);
        }
        sb.c cVar3 = (sb.c) Q;
        Object h11 = v.e.h(rVar2, false, 1253488252);
        if (h11 == eVar) {
            h11 = new k(this.f35724i, uVar, 0);
            rVar2.k0(h11);
        }
        Function2 function2 = (Function2) h11;
        Object h12 = v.e.h(rVar2, false, 1253508371);
        if (h12 == eVar) {
            h12 = new k(this.f35725j, uVar, 1);
            rVar2.k0(h12);
        }
        rVar2.s(false);
        yk.j.y(uVar, this.f35719d, cVar3, this.f35720e, (Function2) h12, this.f35721f, this.f35722g, function2, this.f35723h, rVar2, ((i13 >> 3) & 14) | 12607536, 0);
        rVar2.s(false);
        return Unit.f23355a;
    }
}
