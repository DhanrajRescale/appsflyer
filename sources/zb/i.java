package zb;

import b0.v;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.common.api.Api;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.s3;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f42273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f42274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f42275c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f42276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hb.c f42277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, boolean z10, boolean z11, boolean z12, hb.c cVar) {
        super(2);
        this.f42273a = eVar;
        this.f42274b = z10;
        this.f42275c = z11;
        this.f42276d = z12;
        this.f42277e = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long d10;
        n9.b H;
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        c cVar = this.f42273a.f42255b;
        c cVar2 = c.f42247a;
        g1.g gVar = g1.a.f16383e;
        g1.l lVar = g1.l.f16404b;
        boolean z10 = this.f42275c;
        if (cVar == cVar2) {
            t0.r rVar2 = (t0.r) nVar;
            rVar2.b0(951774065);
            boolean z11 = this.f42274b;
            int i10 = R.raw.social_feed_walking_man_forward;
            if (!z11 ? z10 : !z10) {
                i10 = R.raw.social_feed_walking_man_backward;
            }
            n9.o V = yk.o.V(new n9.q(i10), rVar2, 0);
            if (this.f42276d) {
                rVar2.b0(-107824190);
                H = yk.o.H((j9.i) V.getValue(), false, false, false, s0.g.f34069a, Api.BaseClientBuilder.API_PRIORITY_OTHER, rVar2, 958);
                rVar2.s(false);
            } else {
                rVar2.b0(-107818488);
                H = yk.o.H((j9.i) V.getValue(), false, false, false, s0.g.f34069a, 0, rVar2, 1020);
                rVar2.s(false);
            }
            g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, kp.j.R(43, rVar2));
            rVar2.b0(733328855);
            v c10 = b0.s.c(gVar, false, rVar2, 6);
            rVar2.b0(-1323940314);
            int i11 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(m10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, c10, c2.k.f7749e);
                t0.t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar2, i11, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                bl.j.d((j9.i) V.getValue(), ((Number) ((n9.i) H).getValue()).floatValue(), h2.l.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(43, rVar2)), false, a.f42239v), false, false, false, null, false, null, null, false, rVar2, 8, 0, 4088);
                v.e.y(rVar2, false, true, false, false);
                rVar2.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        } else {
            t0.r rVar3 = (t0.r) nVar;
            rVar3.b0(953340805);
            g1.o m11 = androidx.compose.foundation.layout.d.m(lVar, kp.j.R(43, rVar3));
            rVar3.b0(733328855);
            v c11 = b0.s.c(gVar, false, rVar3, 6);
            rVar3.b0(-1323940314);
            int i12 = rVar3.P;
            r1 o11 = rVar3.o();
            c2.l.M.getClass();
            c2.j jVar2 = c2.k.f7746b;
            b1.c j11 = androidx.compose.ui.layout.a.j(m11);
            if (rVar3.f35166a instanceof t0.f) {
                rVar3.e0();
                if (rVar3.O) {
                    rVar3.n(jVar2);
                } else {
                    rVar3.n0();
                }
                t0.t.v0(rVar3, c11, c2.k.f7749e);
                t0.t.v0(rVar3, o11, c2.k.f7748d);
                c2.i iVar2 = c2.k.f7750f;
                if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i12))) {
                    nn.d.s(i12, rVar3, i12, iVar2);
                }
                nn.d.q(0, j11, new m2(rVar3), rVar3, 2058660585);
                float f10 = this.f42277e.f18146a;
                q1.b u10 = w0.u(R.drawable.ic_unfilled_circle_indicator, rVar3, 0);
                g1.o m12 = androidx.compose.foundation.layout.d.m(lVar, kp.j.R(12, rVar3));
                rVar3.b0(-1416284260);
                if (!z10) {
                    d10 = w0.e(R.color.transaction_success, rVar3);
                } else {
                    d10 = androidx.compose.ui.graphics.a.d(4292006610L);
                }
                long j12 = d10;
                rVar3.s(false);
                s3.a(u10, "Start", m12, j12, rVar3, 56, 0);
                v.e.y(rVar3, false, true, false, false);
                rVar3.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        return Unit.f23355a;
    }
}
