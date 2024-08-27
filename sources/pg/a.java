package pg;

import b0.l1;
import b0.y;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class a extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31011b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f31012c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f31013d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f31014e = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31015a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(3);
        this.f31015a = i10;
    }

    public final void a(c0.c item, t0.n nVar, int i10) {
        g1.l lVar = g1.l.f16404b;
        switch (this.f31015a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-483455358);
                l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
                rVar2.b0(-1323940314);
                int i11 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a10, c2.k.f7749e);
                    t0.t.v0(rVar2, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar2, i11, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                    dp.b.u(null, R.drawable.ic_empty_image_holdings, hl.f.c1(R.string.no_holdings_yet, rVar2), hl.f.c1(R.string.fno_no_orders_holdings_text, rVar2), null, null, rVar2, 48, 49);
                    v.e.u(lVar, 16, rVar2, false, true);
                    rVar2.s(false);
                    rVar2.s(false);
                    return;
                }
                al.d.v0();
                throw null;
            case 1:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 60), nVar);
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 60), nVar);
                return;
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f31015a) {
            case 0:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 1:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 2:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                List it = (List) obj;
                ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f23355a;
        }
    }
}
