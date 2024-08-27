package lf;

import b0.l1;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Winner;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListItem f24691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f24692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ListItem listItem, g gVar, int i10) {
        super(2);
        this.f24690a = i10;
        this.f24691b = listItem;
        this.f24692c = gVar;
    }

    public final void a(t0.n nVar, int i10) {
        String str;
        String str2;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f24690a;
        g gVar = this.f24692c;
        ListItem listItem = this.f24691b;
        boolean z10 = false;
        z10 = false;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                float f10 = 16;
                g1.o t10 = androidx.compose.foundation.layout.a.t(lVar, f10);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-1172423505);
                Object Q = rVar2.Q();
                if (Q == t0.m.f35080a) {
                    Q = v.e.e(rVar2);
                }
                rVar2.s(false);
                g1.o a10 = h2.l.a(androidx.compose.foundation.a.j(t10, (a0.l) Q, null, false, null, e.f24687a, 28), false, d.f24657c);
                g1.e eVar = g1.a.f16392n;
                rVar2.b0(-483455358);
                l1 a11 = b0.y.a(b0.n.f2937c, eVar, rVar2, 48);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(a10);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a11, c2.k.f7749e);
                    t0.t.v0(rVar2, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                    String title = listItem.getTitle();
                    if (title == null) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        str = title;
                    }
                    al.d.D(str, h2.l.a(lVar, false, d.f24658d), 32, w0.e(R.color.black_1A1A1A, rVar2), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 1, 0, null, null, rVar2, 12583296, 24576, 245616);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar2);
                    String subtitle = listItem.getSubtitle();
                    if (subtitle == null) {
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        str2 = subtitle;
                    }
                    al.d.C(str2, h2.l.a(lVar, false, d.f24659e), w0.e(R.color.black_1A1A1A_60, rVar2), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131064);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar2);
                    List<Winner> winners = listItem.getWinners();
                    if (winners != null) {
                        int i13 = 0;
                        for (Object obj : winners) {
                            int i14 = i13 + 1;
                            if (i13 >= 0) {
                                int i15 = i13;
                                dp.b.r0(null, (Winner) obj, gVar.f24721f, gVar.f24720e, i13, rVar2, 0, 1);
                                rVar2.b0(1935465104);
                                if (i15 != listItem.getWinners().size() - 1) {
                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 20), rVar2);
                                }
                                z10 = false;
                                rVar2.s(false);
                                i13 = i14;
                            } else {
                                vt.y.j();
                                throw null;
                            }
                        }
                    }
                    v.e.y(rVar2, z10, true, z10, z10);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                pp.b.b(h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, 280), 220), false, d.f24656b), h0.h.b(12), n1.t.f28173e, null, s0.g.f34069a, b1.d.c(-332429386, new f(listItem, gVar, z10 ? 1 : 0), nVar), nVar, 1573248, 56);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24690a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
