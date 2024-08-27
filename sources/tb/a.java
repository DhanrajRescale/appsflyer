package tb;

import b0.p1;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import r0.h2;
import r0.n3;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class a extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f35674b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f35675c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f35676d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f35677e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f35678f = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35679a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(3);
        this.f35679a = i10;
    }

    public final void a(c0.c item, t0.n nVar, int i10) {
        g1.l lVar = g1.l.f16404b;
        switch (this.f35679a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(16, nVar)), nVar);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                g1.o a10 = h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(100, nVar)), false, b.f35680b);
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(733328855);
                b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar3, 0);
                rVar3.b0(-1323940314);
                int i11 = rVar3.P;
                r1 o10 = rVar3.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(a10);
                if (rVar3.f35166a instanceof t0.f) {
                    rVar3.e0();
                    if (rVar3.O) {
                        rVar3.n(jVar);
                    } else {
                        rVar3.n0();
                    }
                    t0.t.v0(rVar3, c10, c2.k.f7749e);
                    t0.t.v0(rVar3, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar3, i11, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar3), rVar3, 2058660585);
                    h2.a(androidx.compose.foundation.layout.b.f1281a.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(40, rVar3)), g1.a.f16383e), 0L, s0.g.f34069a, 0L, 0, rVar3, 0, 30);
                    v.e.y(rVar3, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                o2.v vVar = jh.c.f21377f;
                long S = kp.j.S(12, nVar, 6);
                b9.b("Looks like you've seen all the posts for now. Take a break and come back later for fresh updates!", h2.l.a(androidx.compose.foundation.layout.a.v(lVar, kp.j.R(16, nVar), s0.g.f34069a, 2), false, b.f35681c), w0.e(R.color.black_2E2E2E, nVar), S, null, null, vVar, 0L, null, new u2.i(3), 0L, 0, false, 0, 0, null, null, nVar, 1572870, 0, 130480);
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar5 = (t0.r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(16, nVar)), nVar);
                return;
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f35679a) {
            case 0:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 1:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 2:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 3:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                p1 Button = (p1) obj;
                t0.n nVar = (t0.n) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((intValue & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                String c12 = hl.f.c1(R.string.retry, nVar);
                long j10 = n1.t.f28173e;
                o2.v vVar = jh.c.f21378g;
                n3.a(c12, h2.l.a(g1.l.f16404b, false, b.f35682d), j10, kp.j.S(16, nVar, 6), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1573248, 0, 130992);
                return Unit.f23355a;
        }
    }
}
