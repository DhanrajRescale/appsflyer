package pd;

import b0.l1;
import com.assetgro.stockgro.data.model.CreateGroupUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class p extends iu.k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f30940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.s f30941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(e1.s sVar, e1.s sVar2, int i10) {
        super(4);
        this.f30939a = i10;
        this.f30940b = sVar;
        this.f30941c = sVar2;
    }

    public final void a(c0.c cVar, int i10, t0.n nVar, int i11) {
        int i12;
        int i13;
        to.e eVar = t0.m.f35080a;
        int i14 = this.f30939a;
        e1.s sVar = this.f30941c;
        List list = this.f30940b;
        int i15 = 16;
        int i16 = 32;
        int i17 = 2;
        switch (i14) {
            case 0:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i17 = 4;
                    }
                    i12 = i11 | i17;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (!((t0.r) nVar).f(i10)) {
                        i16 = 16;
                    }
                    i12 |= i16;
                }
                if ((i12 & 147) == 146) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                CreateGroupUser createGroupUser = (CreateGroupUser) list.get(i10);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(670655802);
                float f10 = 16;
                g1.o x10 = androidx.compose.foundation.layout.a.x(g1.l.f16404b, f10, s0.g.f34069a, f10, s0.g.f34069a, 10);
                rVar2.b0(-483455358);
                l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
                rVar2.b0(-1323940314);
                int i18 = rVar2.P;
                r1 o10 = rVar2.o();
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
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i18))) {
                        nn.d.s(i18, rVar2, i18, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                    boolean contains = sVar.contains(createGroupUser);
                    rVar2.b0(-1023024058);
                    Object Q = rVar2.Q();
                    if (Q == eVar) {
                        Q = new o(sVar, 0);
                        rVar2.k0(Q);
                    }
                    rVar2.s(false);
                    kp.j.l(createGroupUser, contains, false, (Function2) Q, rVar2, 3464, 0);
                    v.e.y(rVar2, false, true, false, false);
                    rVar2.s(false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                if ((i11 & 6) == 0) {
                    if (((t0.r) nVar).h(cVar)) {
                        i17 = 4;
                    }
                    i13 = i11 | i17;
                } else {
                    i13 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((t0.r) nVar).f(i10)) {
                        i15 = 32;
                    }
                    i13 |= i15;
                }
                if ((i13 & 147) == 146) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                CreateGroupUser createGroupUser2 = (CreateGroupUser) list.get(i10);
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-423141499);
                boolean contains2 = sVar.contains(createGroupUser2);
                rVar4.b0(-152189339);
                Object Q2 = rVar4.Q();
                if (Q2 == eVar) {
                    Q2 = new o(sVar, 3);
                    rVar4.k0(Q2);
                }
                rVar4.s(false);
                kp.j.l(createGroupUser2, contains2, false, (Function2) Q2, rVar4, 3464, 0);
                rVar4.s(false);
                return;
        }
    }

    @Override // hu.d
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f30939a) {
            case 0:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, ((Number) obj2).intValue(), (t0.n) obj3, ((Number) obj4).intValue());
                return Unit.f23355a;
        }
    }
}
