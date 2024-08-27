package fj;

import a0.l;
import ad.f;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l1;
import b0.y;
import c2.i;
import c2.j;
import com.assetgro.stockgro.data.remote.response.BulletInDto;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import g1.o;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.n5;
import m0.o5;
import s0.g;
import t0.m;
import t0.m2;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;
import y8.h;

/* loaded from: classes.dex */
public final class d extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f16140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BulletInDto f16141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, BulletInDto bulletInDto, int i10) {
        super(2);
        this.f16139a = i10;
        this.f16140b = eVar;
        this.f16141c = bulletInDto;
    }

    public final void a(n nVar, int i10) {
        int i11 = 0;
        g1.e eVar = g1.a.f16391m;
        int i12 = this.f16139a;
        BulletInDto bulletInDto = this.f16141c;
        e eVar2 = this.f16140b;
        switch (i12) {
            case 0:
                if ((i10 & 11) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
                r rVar2 = (r) nVar;
                rVar2.b0(-797886644);
                Object Q = rVar2.Q();
                to.e eVar3 = m.f35080a;
                if (Q == eVar3) {
                    Q = v.e.e(rVar2);
                }
                l lVar = (l) Q;
                rVar2.s(false);
                o5 b10 = n5.b(w0.e(R.color.purple_663549E3, rVar2));
                rVar2.b0(-797875608);
                boolean h10 = rVar2.h(eVar2) | rVar2.h(bulletInDto);
                Object Q2 = rVar2.Q();
                if (h10 || Q2 == eVar3) {
                    Q2 = new f(17, eVar2, bulletInDto);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                o j10 = androidx.compose.foundation.a.j(fillElement, lVar, b10, false, null, (Function0) Q2, 28);
                rVar2.b0(-483455358);
                l1 a10 = y.a(b0.n.f2937c, eVar, rVar2, 48);
                rVar2.b0(-1323940314);
                int i13 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                j jVar = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(j10);
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
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar2, i13, iVar);
                    }
                    j11.b(new m2(rVar2), rVar2, 0);
                    rVar2.b0(2058660585);
                    h hVar = new h((Context) rVar2.m(AndroidCompositionLocals_androidKt.f1428b));
                    hVar.f41338c = bulletInDto.getContentLink();
                    hVar.b();
                    q6.l.d(hVar.a(), "User photo", fillElement, a2.k.f101f, rVar2, 1573304, 4024);
                    v.e.y(rVar2, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                r rVar4 = (r) nVar;
                rVar4.b0(-483455358);
                g1.l lVar2 = g1.l.f16404b;
                l1 a11 = y.a(b0.n.f2937c, eVar, rVar4, 0);
                rVar4.b0(-1323940314);
                int i14 = rVar4.P;
                r1 o11 = rVar4.o();
                c2.l.M.getClass();
                j jVar2 = c2.k.f7746b;
                b1.c j12 = androidx.compose.ui.layout.a.j(lVar2);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar2);
                    } else {
                        rVar4.n0();
                    }
                    t.v0(rVar4, a11, c2.k.f7749e);
                    t.v0(rVar4, o11, c2.k.f7748d);
                    i iVar2 = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i14))) {
                        nn.d.s(i14, rVar4, i14, iVar2);
                    }
                    v.e.w(rVar4, j12, rVar4, 0, 2058660585);
                    float f10 = 16;
                    pp.b.b(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar2, f10, g.f34069a, f10, g.f34069a, 10), 1.0f), 120), h0.h.b(12), n1.t.f28173e, null, 4, b1.d.c(-1744569670, new d(eVar2, bulletInDto, i11), rVar4), rVar4, 1769862, 24);
                    v.e.u(lVar2, 8, rVar4, false, true);
                    rVar4.s(false);
                    rVar4.s(false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f16139a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
