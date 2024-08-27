package lf;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l1;
import b0.o1;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.n5;
import t0.r1;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f24743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ListItem f24744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, ListItem listItem, int i10, int i11) {
        super(2);
        this.f24742a = i11;
        this.f24743b = mVar;
        this.f24744c = listItem;
        this.f24745d = i10;
    }

    public final void a(t0.n nVar, int i10) {
        c2.i iVar;
        boolean z10;
        boolean z11;
        int i11 = 0;
        g1.l lVar = g1.l.f16404b;
        int i12 = this.f24742a;
        m mVar = this.f24743b;
        int i13 = this.f24745d;
        ListItem listItem = this.f24744c;
        switch (i12) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                g1.o b10 = androidx.compose.ui.draw.a.b(lVar, h0.h.b(8));
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-2113671211);
                Object Q = rVar2.Q();
                to.e eVar = t0.m.f35080a;
                if (Q == eVar) {
                    Q = v.e.e(rVar2);
                }
                rVar2.s(false);
                g1.o a10 = h2.l.a(androidx.compose.foundation.a.j(b10, (a0.l) Q, null, false, null, new k(mVar, listItem, i13), 28), false, d.f24661g);
                rVar2.b0(733328855);
                b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
                rVar2.b0(-1323940314);
                int i14 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(a10);
                boolean z12 = rVar2.f35166a instanceof t0.f;
                if (z12) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    c2.i iVar2 = c2.k.f7749e;
                    t0.t.v0(rVar2, c10, iVar2);
                    c2.i iVar3 = c2.k.f7748d;
                    t0.t.v0(rVar2, o10, iVar3);
                    c2.i iVar4 = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                        nn.d.s(i14, rVar2, i14, iVar4);
                    }
                    v.e.w(rVar2, j10, rVar2, 0, 2058660585);
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
                    y8.h hVar = new y8.h((Context) rVar2.m(AndroidCompositionLocals_androidKt.f1428b));
                    hVar.f41338c = listItem.getImageUrl();
                    hVar.b();
                    q6.l.d(hVar.a(), "User photo", h2.l.a(bVar.a(androidx.compose.foundation.layout.d.f1286c, g1.a.f16383e), false, d.f24662h), a2.k.f101f, rVar2, 1572920, 4024);
                    if (listItem.getButtonImage() == null) {
                        z10 = true;
                        z11 = false;
                    } else {
                        g1.o a11 = h2.l.a(bVar.a(lVar, g1.a.f16385g), false, d.f24663i);
                        rVar2.b0(-483455358);
                        l1 a12 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
                        rVar2.b0(-1323940314);
                        int i15 = rVar2.P;
                        r1 o11 = rVar2.o();
                        b1.c j11 = androidx.compose.ui.layout.a.j(a11);
                        if (z12) {
                            rVar2.e0();
                            if (rVar2.O) {
                                rVar2.n(jVar);
                            } else {
                                rVar2.n0();
                            }
                            t0.t.v0(rVar2, a12, iVar2);
                            t0.t.v0(rVar2, o11, iVar3);
                            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i15))) {
                                iVar = iVar4;
                                nn.d.s(i15, rVar2, i15, iVar);
                            } else {
                                iVar = iVar4;
                            }
                            v.e.w(rVar2, j11, rVar2, 0, 2058660585);
                            rVar2.b0(693286680);
                            l1 a13 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar2, 0);
                            rVar2.b0(-1323940314);
                            int i16 = rVar2.P;
                            r1 o12 = rVar2.o();
                            b1.c j12 = androidx.compose.ui.layout.a.j(lVar);
                            if (z12) {
                                rVar2.e0();
                                if (rVar2.O) {
                                    rVar2.n(jVar);
                                } else {
                                    rVar2.n0();
                                }
                                t0.t.v0(rVar2, a13, iVar2);
                                t0.t.v0(rVar2, o12, iVar3);
                                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i16))) {
                                    nn.d.s(i16, rVar2, i16, iVar);
                                }
                                v.e.w(rVar2, j12, rVar2, 0, 2058660585);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 20), rVar2);
                                String buttonImage = listItem.getButtonImage();
                                q1.b u10 = w0.u(R.drawable.ic_placeholder_user, rVar2, 6);
                                androidx.work.u uVar = a2.k.f97b;
                                float f10 = 28;
                                g1.o b11 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(lVar, f10), h0.h.b(6));
                                rVar2.b0(814420433);
                                Object Q2 = rVar2.Q();
                                if (Q2 == eVar) {
                                    Q2 = v.e.e(rVar2);
                                }
                                rVar2.s(false);
                                z10 = true;
                                q6.l.c(buttonImage, "User photo", h2.l.a(androidx.compose.foundation.a.j(b11, (a0.l) Q2, n5.b(w0.e(R.color.purple_663549E3, rVar2)), false, null, new k(listItem, mVar, i13), 28), false, d.f24664j), u10, null, uVar, null, rVar2, 4144, 6, 64496);
                                z11 = false;
                                v.e.y(rVar2, false, true, false, false);
                                v.e.u(lVar, f10, rVar2, false, true);
                                rVar2.s(false);
                                rVar2.s(false);
                                Unit unit = Unit.f23355a;
                            } else {
                                al.d.v0();
                                throw null;
                            }
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    }
                    v.e.y(rVar2, z11, z10, z11, z11);
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
                float f11 = 6;
                pp.b.b(h2.l.a(androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.a.w(lVar, f11, f11, f11, f11), 280), 1.28f), false, d.f24660f), h0.h.b(12), n1.t.f28173e, null, 4, b1.d.c(1697636802, new l(mVar, listItem, i13, i11), nVar), nVar, 1769856, 24);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24742a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
