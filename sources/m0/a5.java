package m0;

import android.content.Context;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a5 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25875a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(String str, boolean z10, Context context, boolean z11, Function1 function1) {
        super(2);
        this.f25878d = str;
        this.f25876b = z10;
        this.f25879e = context;
        this.f25877c = z11;
        this.f25880f = function1;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f25875a;
        Object obj = this.f25880f;
        Object obj2 = this.f25879e;
        Object obj3 = this.f25878d;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                g8.f26217a.a(this.f25876b, this.f25877c, (a0.l) obj3, (s1) obj2, (n1.x0) obj, s0.g.f34069a, s0.g.f34069a, nVar, 12582912, 96);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                g1.l lVar = g1.l.f16404b;
                g1.o v10 = androidx.compose.foundation.layout.a.v(androidx.compose.foundation.a.d(lVar, kq.e.R(vt.y.g(new n1.t(d2.w0.e(R.color.gradientColor1, nVar)), new n1.t(d2.w0.e(R.color.gradientColor2, nVar))), Float.POSITIVE_INFINITY, 8), null, 6), s0.g.f34069a, kp.j.R(2, nVar), 1);
                String str = (String) obj3;
                boolean z10 = this.f25876b;
                Context context = (Context) obj2;
                Function1 function1 = (Function1) obj;
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(733328855);
                b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar3, 0);
                rVar3.b0(-1323940314);
                int i12 = rVar3.P;
                t0.r1 o10 = rVar3.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(v10);
                boolean z11 = rVar3.f35166a instanceof t0.f;
                if (z11) {
                    rVar3.e0();
                    if (rVar3.O) {
                        rVar3.n(jVar);
                    } else {
                        rVar3.n0();
                    }
                    c2.i iVar = c2.k.f7749e;
                    t0.t.v0(rVar3, c10, iVar);
                    c2.i iVar2 = c2.k.f7748d;
                    t0.t.v0(rVar3, o10, iVar2);
                    c2.i iVar3 = c2.k.f7750f;
                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar3, i12, iVar3);
                    }
                    nn.d.q(0, j10, new t0.m2(rVar3), rVar3, 2058660585);
                    g1.f fVar = g1.a.f16389k;
                    g1.o v11 = androidx.compose.foundation.layout.a.v(lVar, s0.g.f34069a, kp.j.R(14, rVar3), 1);
                    rVar3.b0(693286680);
                    b0.l1 a10 = b0.o1.a(b0.n.f2935a, fVar, rVar3, 48);
                    rVar3.b0(-1323940314);
                    int i13 = rVar3.P;
                    t0.r1 o11 = rVar3.o();
                    b1.c j11 = androidx.compose.ui.layout.a.j(v11);
                    if (z11) {
                        rVar3.e0();
                        if (rVar3.O) {
                            rVar3.n(jVar);
                        } else {
                            rVar3.n0();
                        }
                        t0.t.v0(rVar3, a10, iVar);
                        t0.t.v0(rVar3, o11, iVar2);
                        if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i13))) {
                            nn.d.s(i13, rVar3, i13, iVar3);
                        }
                        nn.d.q(0, j11, new t0.m2(rVar3), rVar3, 2058660585);
                        b0.q1 q1Var = b0.q1.f2981a;
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(4, rVar3)), rVar3);
                        p3.a(new f9.a(context, 3), q1Var.a(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(28, rVar3)), kp.j.R(46, rVar3)), s0.g.f34069a, kp.j.R(2, rVar3), s0.g.f34069a, s0.g.f34069a, 13), fVar), false, null, ac.g.f332a, rVar3, 24576, 12);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(4, rVar3)), rVar3);
                        long e10 = d2.w0.e(R.color.toolbarTitleColor, rVar3);
                        g1.o b10 = q1Var.b(lVar, 1.0f, true);
                        long S = kp.j.S(18, rVar3, 6);
                        long S2 = kp.j.S(25, rVar3, 6);
                        o2.v vVar = jh.c.f21377f;
                        b9.b(str, b10, e10, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, new j2.g0(androidx.compose.ui.graphics.a.d(4294967295L), S, new o2.d0(365), vVar, 0, S2, null, 16646104), rVar3, 0, 3120, 55288);
                        iu.j.c(q1Var, z10, null, null, null, null, b1.d.c(1580804131, new l0.h(function1, this.f25877c), rVar3), rVar3, 1572870, 30);
                        v.e.y(rVar3, false, true, false, false);
                        v.e.y(rVar3, false, true, false, false);
                        return;
                    }
                    al.d.v0();
                    throw null;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25875a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(boolean z10, boolean z11, a0.l lVar, s1 s1Var, n1.x0 x0Var) {
        super(2);
        this.f25876b = z10;
        this.f25877c = z11;
        this.f25878d = lVar;
        this.f25879e = s1Var;
        this.f25880f = x0Var;
    }
}
