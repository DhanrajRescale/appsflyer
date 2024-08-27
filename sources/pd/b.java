package pd;

import b0.l1;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class b extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f30849b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f30850c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f30851d = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30852a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(3);
        this.f30852a = i10;
    }

    public final void a(c0.c item, t0.n nVar, int i10) {
        g1.l lVar = g1.l.f16404b;
        switch (this.f30852a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                float f10 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), nVar);
                b9.b(hl.f.c1(R.string.your_followers_compose, nVar), null, w0.e(R.color.black_1A1A1A, nVar), yk.j.e1(14), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130994);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), nVar);
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
                float f11 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), nVar);
                b9.b(hl.f.c1(R.string.people_on_stockgro, nVar), null, w0.e(R.color.black_1A1A1A, nVar), yk.j.e1(14), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130994);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), nVar);
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-483455358);
                l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar4, 0);
                rVar4.b0(-1323940314);
                int i11 = rVar4.P;
                r1 o10 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar);
                    } else {
                        rVar4.n0();
                    }
                    t0.t.v0(rVar4, a10, c2.k.f7749e);
                    t0.t.v0(rVar4, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar4, i11, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar4), rVar4, 2058660585);
                    v.e.u(lVar, 24, rVar4, false, true);
                    rVar4.s(false);
                    rVar4.s(false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f30852a) {
            case 0:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 1:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
