package l0;

import b0.l1;
import b0.o1;
import b0.p1;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import m0.s3;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class h extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ut.d f23757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, Function0 function0, boolean z10) {
        super(3);
        this.f23756a = i10;
        this.f23757b = function0;
        this.f23758c = z10;
    }

    public final void a(v.r AnimatedVisibility, t0.n nVar) {
        int i10;
        long e10;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f23756a;
        ut.d dVar = this.f23757b;
        boolean z10 = this.f23758c;
        switch (i11) {
            case 1:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                g1.o a10 = h2.l.a(androidx.compose.foundation.a.k(lVar, (Function0) dVar, 7), false, vb.a.f37838k);
                t0.r rVar = (t0.r) nVar;
                rVar.b0(733328855);
                b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o10 = rVar.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(a10);
                if (rVar.f35166a instanceof t0.f) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, c10, c2.k.f7749e);
                    t0.t.v0(rVar, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar, i12, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                    if (z10) {
                        i10 = R.drawable.ic_feed_post_bookmark_selected;
                    } else {
                        i10 = R.drawable.ic_feed_post_bookmark_unselected;
                    }
                    q1.b u10 = d2.w0.u(i10, rVar, 0);
                    rVar.b0(293382216);
                    if (z10) {
                        e10 = androidx.compose.ui.graphics.a.c(R.color.purpleSubmitBackground);
                    } else {
                        e10 = d2.w0.e(R.color.colorPrimarySeparator, rVar);
                    }
                    long j11 = e10;
                    rVar.s(false);
                    s3.a(u10, null, h2.l.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(22, rVar)), false, vb.a.f37839l), j11, rVar, 56, 0);
                    v.e.y(rVar, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            default:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                kp.j.a(!z10, androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, kp.j.R(10, nVar), s0.g.f34069a, 11), (Function1) dVar, nVar, 0);
                return;
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        to.e eVar = t0.m.f35080a;
        int i12 = this.f23756a;
        boolean z10 = this.f23758c;
        ut.d dVar = this.f23757b;
        switch (i12) {
            case 0:
                g1.o oVar = (g1.o) obj;
                ((Number) obj3).intValue();
                t0.r rVar = (t0.r) ((t0.n) obj2);
                rVar.b0(-196777734);
                long j10 = ((b1) rVar.m(c1.f23727a)).f23717a;
                rVar.b0(-1183152124);
                Function0 function0 = (Function0) dVar;
                boolean g10 = rVar.g(j10) | rVar.j(function0) | rVar.i(z10);
                Object Q = rVar.Q();
                if (g10 || Q == eVar) {
                    Q = new g(j10, function0, z10);
                    rVar.k0(Q);
                }
                rVar.s(false);
                g1.o e10 = androidx.compose.ui.draw.a.e(oVar, (Function1) Q);
                rVar.s(false);
                return e10;
            case 1:
                ((Number) obj3).intValue();
                a((v.r) obj, (t0.n) obj2);
                return Unit.f23355a;
            case 2:
                p1 TopAppBar = (p1) obj;
                t0.n nVar = (t0.n) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                if ((intValue & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return Unit.f23355a;
                    }
                }
                Function0 function02 = (Function0) dVar;
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(693286680);
                g1.l lVar = g1.l.f16404b;
                l1 a10 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar3, 0);
                rVar3.b0(-1323940314);
                int i13 = rVar3.P;
                r1 o10 = rVar3.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                if (rVar3.f35166a instanceof t0.f) {
                    rVar3.e0();
                    if (rVar3.O) {
                        rVar3.n(jVar);
                    } else {
                        rVar3.n0();
                    }
                    t0.t.v0(rVar3, a10, c2.k.f7749e);
                    t0.t.v0(rVar3, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar3, i13, iVar);
                    }
                    nn.d.q(0, j11, new m2(rVar3), rVar3, 2058660585);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 16), rVar3);
                    q1.b u10 = d2.w0.u(R.drawable.ic_back, rVar3, 6);
                    rVar3.b0(765139949);
                    boolean h10 = rVar3.h(function02);
                    Object Q2 = rVar3.Q();
                    if (h10 || Q2 == eVar) {
                        Q2 = v.e.n(function02, 2, rVar3);
                    }
                    rVar3.s(false);
                    androidx.compose.foundation.a.c(u10, "Go back to previous page", androidx.compose.foundation.a.k(lVar, (Function0) Q2, 7), null, null, s0.g.f34069a, null, rVar3, 56, 120);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 8), rVar3);
                    if (z10) {
                        i10 = 765146044;
                        i11 = R.string.text_add_members;
                    } else {
                        i10 = 765147758;
                        i11 = R.string.create_group_capital;
                    }
                    b9.b(jr.h.t(rVar3, i10, i11, rVar3, false), null, n1.t.f28173e, yk.j.e1(16), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 1576320, 0, 130994);
                    v.e.y(rVar3, false, true, false, false);
                    return Unit.f23355a;
                }
                al.d.v0();
                throw null;
            default:
                ((Number) obj3).intValue();
                a((v.r) obj, (t0.n) obj2);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Function1 function1, boolean z10) {
        super(3);
        this.f23756a = 3;
        this.f23758c = z10;
        this.f23757b = function1;
    }
}
