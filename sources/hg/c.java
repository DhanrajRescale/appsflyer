package hg;

import b0.l1;
import b0.o1;
import c2.i;
import c2.j;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import g1.l;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.m2;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public final class c extends k implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f18445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ char f18446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, char c10) {
        super(4);
        this.f18445a = list;
        this.f18446b = c10;
    }

    @Override // hu.d
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        c0.c cVar = (c0.c) obj;
        int intValue = ((Number) obj2).intValue();
        n nVar = (n) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((r) nVar).h(cVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | intValue2;
        } else {
            i10 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((r) nVar).f(intValue)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 147) == 146) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        int i13 = i10 & 14;
        String str = (String) this.f18445a.get(intValue);
        r rVar2 = (r) nVar;
        rVar2.b0(1140387465);
        g1.f fVar = g1.a.f16388j;
        rVar2.b0(693286680);
        l lVar = l.f16404b;
        l1 a10 = o1.a(b0.n.f2935a, fVar, rVar2, 48);
        rVar2.b0(-1323940314);
        int i14 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t.v0(rVar2, a10, c2.k.f7749e);
            t.v0(rVar2, o10, c2.k.f7748d);
            i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                nn.d.s(i14, rVar2, i14, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            float f10 = 8;
            al.d.C(String.valueOf(this.f18446b), androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, f10, s0.g.f34069a, 11), w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(24), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 3120, 0, 131056);
            al.d.C(str, null, w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, ((i13 >> 3) & 14) | 3072, 0, 131058);
            v.e.y(rVar2, false, true, false, false);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.m(lVar, f10), rVar2);
            rVar2.s(false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
