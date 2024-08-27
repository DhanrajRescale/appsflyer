package en;

import c2.x1;
import g1.o;
import iu.k;
import kotlin.jvm.internal.Intrinsics;
import n1.f;
import n1.x0;
import s0.g;
import t0.g1;
import t0.m;
import t0.n;
import t0.n1;
import t0.o3;
import t0.r;
import t0.t;
import v.e;
import w.f0;
import w.q1;
import w.u1;
import w.y0;
import w.y1;
import w.z1;

/* loaded from: classes2.dex */
public final class c extends k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hu.c f15755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f15756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15757c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f15759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hu.c cVar, hu.c cVar2, long j10, x0 x0Var) {
        super(3);
        this.f15755a = cVar;
        this.f15756b = cVar2;
        this.f15758d = j10;
        this.f15759e = x0Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        float f10;
        float f11;
        float f12;
        float f13;
        o composed = (o) obj;
        ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        r rVar = (r) ((n) obj2);
        Object g10 = e.g(rVar, -1214629560, 804161266);
        to.e eVar = m.f35080a;
        if (g10 == eVar) {
            g10 = new Object();
            rVar.k0(g10);
        }
        x1 x1Var = (x1) g10;
        Object h10 = e.h(rVar, false, 804161321);
        if (h10 == eVar) {
            h10 = new Object();
            rVar.k0(h10);
        }
        x1 x1Var2 = (x1) h10;
        Object h11 = e.h(rVar, false, 804161379);
        if (h11 == eVar) {
            h11 = new Object();
            rVar.k0(h11);
        }
        x1 x1Var3 = (x1) h11;
        Object h12 = e.h(rVar, false, 804161492);
        if (h12 == eVar) {
            h12 = t.n0(Float.valueOf(g.f34069a), o3.f35116a);
            rVar.k0(h12);
        }
        g1 g1Var = (g1) h12;
        Object h13 = e.h(rVar, false, 804161591);
        boolean z10 = this.f15757c;
        if (h13 == eVar) {
            h13 = new y0(Boolean.valueOf(z10));
            rVar.k0(h13);
        }
        y0 y0Var = (y0) h13;
        rVar.s(false);
        y0Var.f38733c.setValue(Boolean.valueOf(z10));
        rVar.b0(882913843);
        u1 u10 = w.e.u(y0Var, "placeholder_crossfade", rVar, 48);
        rVar.s(false);
        rVar.b0(-1338768149);
        y1 y1Var = z1.f38739a;
        rVar.b0(-142660079);
        boolean booleanValue = ((Boolean) u10.c()).booleanValue();
        rVar.b0(-2085173843);
        if (booleanValue) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        rVar.s(false);
        Float valueOf = Float.valueOf(f10);
        n1 n1Var = u10.f38689c;
        boolean booleanValue2 = ((Boolean) n1Var.getValue()).booleanValue();
        rVar.b0(-2085173843);
        if (booleanValue2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        rVar.s(false);
        q1 o10 = w.e.o(u10, valueOf, Float.valueOf(f11), (f0) this.f15755a.b(u10.e(), rVar, 0), y1Var, rVar, 196608);
        rVar.s(false);
        rVar.s(false);
        rVar.b0(-1338768149);
        rVar.b0(-142660079);
        boolean booleanValue3 = ((Boolean) u10.c()).booleanValue();
        rVar.b0(992792551);
        if (booleanValue3) {
            f12 = g.f34069a;
        } else {
            f12 = 1.0f;
        }
        rVar.s(false);
        Float valueOf2 = Float.valueOf(f12);
        boolean booleanValue4 = ((Boolean) n1Var.getValue()).booleanValue();
        rVar.b0(992792551);
        if (booleanValue4) {
            f13 = g.f34069a;
        } else {
            f13 = 1.0f;
        }
        rVar.s(false);
        q1 o11 = w.e.o(u10, valueOf2, Float.valueOf(f13), (f0) this.f15756b.b(u10.e(), rVar, 0), y1Var, rVar, 196608);
        rVar.s(false);
        rVar.s(false);
        rVar.b0(804162378);
        rVar.s(false);
        rVar.b0(804162715);
        Object Q = rVar.Q();
        if (Q == eVar) {
            Q = androidx.compose.ui.graphics.a.g();
            rVar.k0(Q);
        }
        f fVar = (f) Q;
        rVar.s(false);
        rVar.b0(804162740);
        boolean g11 = rVar.g(this.f15758d) | rVar.h(this.f15759e) | rVar.h(null);
        x0 x0Var = this.f15759e;
        long j10 = this.f15758d;
        Object Q2 = rVar.Q();
        if (g11 || Q2 == eVar) {
            Q2 = androidx.compose.ui.draw.a.f(composed, new b(fVar, x1Var3, x0Var, j10, x1Var2, x1Var, o11, o10, g1Var));
            rVar.k0(Q2);
        }
        o oVar = (o) Q2;
        rVar.s(false);
        rVar.s(false);
        return oVar;
    }
}
