package ub;

import b0.i;
import b0.m0;
import b0.o0;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import g1.l;
import g1.o;
import iu.k;
import j2.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp.j;
import m0.b9;
import n1.t;
import o2.v;
import okhttp3.HttpUrl;
import s0.g;
import t0.m2;
import t0.n;
import t0.r;
import t0.r1;
import ut.p;

/* loaded from: classes.dex */
public final class e extends k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f37056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p pVar, int i10) {
        super(3);
        this.f37055a = i10;
        this.f37056b = pVar;
    }

    public final void a(c0.c item, n nVar, int i10) {
        l lVar = l.f16404b;
        int i11 = this.f37055a;
        p pVar = this.f37056b;
        switch (i11) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                String str = (String) pVar.f37401b;
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                v vVar = jh.c.f21381j;
                long S = j.S(16, nVar, 6);
                b9.b(str, h2.l.a(lVar, false, d.f37051c), t.f28170b, S, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1573248, 0, 130992);
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                o a10 = h2.l.a(androidx.compose.foundation.layout.a.x(lVar, g.f34069a, j.R(16, nVar), g.f34069a, j.R(16, nVar), 5), false, d.f37052d);
                b0.d dVar = b0.n.f2935a;
                i iVar = new i(j.R(4, nVar), true, b0.k.f2888b);
                r rVar3 = (r) nVar;
                rVar3.b0(1098475987);
                o0 c10 = m0.c(iVar, rVar3);
                rVar3.b0(-1323940314);
                int i12 = rVar3.P;
                r1 o10 = rVar3.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(a10);
                ArrayList arrayList = null;
                if (rVar3.f35166a instanceof t0.f) {
                    rVar3.e0();
                    if (rVar3.O) {
                        rVar3.n(jVar);
                    } else {
                        rVar3.n0();
                    }
                    t0.t.v0(rVar3, c10, c2.k.f7749e);
                    t0.t.v0(rVar3, o10, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar3, i12, iVar2);
                    }
                    nn.d.q(0, j10, new m2(rVar3), rVar3, 2058660585);
                    List list = (List) pVar.f37402c;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            j2.e eVar = new j2.e((String) it.next(), arrayList, 6);
                            o a11 = h2.l.a(androidx.compose.foundation.layout.a.v(lVar, g.f34069a, j.R(2, rVar3), 1), false, d.f37053e);
                            v vVar2 = jh.c.f21380i;
                            b9.c(eVar, a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new g0(w0.e(R.color.black_2E2E2E, rVar3), j.S(17, rVar3, 6), null, vVar2, 0, 0L, null, 16777180), rVar3, 0, 0, 131068);
                            arrayList = arrayList;
                        }
                    }
                    v.e.y(rVar3, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f37055a) {
            case 0:
                a((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
