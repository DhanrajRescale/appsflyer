package lb;

import b0.p1;
import b0.v;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r0.h2;
import r0.n3;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class q extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final q f24498b = new q(0);

    /* renamed from: c, reason: collision with root package name */
    public static final q f24499c = new q(1);

    /* renamed from: d, reason: collision with root package name */
    public static final q f24500d = new q(2);

    /* renamed from: e, reason: collision with root package name */
    public static final q f24501e = new q(3);

    /* renamed from: f, reason: collision with root package name */
    public static final q f24502f = new q(4);

    /* renamed from: g, reason: collision with root package name */
    public static final q f24503g = new q(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24504a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10) {
        super(3);
        this.f24504a = i10;
    }

    public final void a(p1 Button, t0.n nVar, int i10) {
        switch (this.f24504a) {
            case 4:
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                n3.a("Cancel", null, 0L, kp.j.S(18, nVar, 6), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1572870, 0, 130998);
                return;
            default:
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i10 & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                n3.a("Delete", null, 0L, kp.j.S(18, nVar, 6), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1572870, 0, 130998);
                return;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f24504a) {
            case 0:
                d((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 1:
                d((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 2:
                d((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 3:
                d((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 4:
                a((p1) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((p1) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }

    public final void d(c0.c item, t0.n nVar, int i10) {
        g1.l lVar = g1.l.f16404b;
        switch (this.f24504a) {
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
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(10, nVar)), nVar);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                g1.o a10 = h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(60, nVar)), false, a.f24399q);
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(733328855);
                v c10 = b0.s.c(g1.a.f16379a, false, rVar4, 0);
                rVar4.b0(-1323940314);
                int i11 = rVar4.P;
                r1 o10 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(a10);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar);
                    } else {
                        rVar4.n0();
                    }
                    t0.t.v0(rVar4, c10, c2.k.f7749e);
                    t0.t.v0(rVar4, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar4, i11, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar4), rVar4, 2058660585);
                    h2.a(androidx.compose.foundation.layout.b.f1281a.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(24, rVar4)), g1.a.f16383e), 0L, s0.g.f34069a, 0L, 0, rVar4, 0, 30);
                    v.e.y(rVar4, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
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
}
