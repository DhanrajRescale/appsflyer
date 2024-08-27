package pd;

import androidx.compose.foundation.layout.LayoutWeightElement;
import b0.l1;
import b0.o1;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import t0.r1;

/* loaded from: classes.dex */
public final class n extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.s f30936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(e1.s sVar, int i10) {
        super(3);
        this.f30935a = i10;
        this.f30936b = sVar;
    }

    public final void a(c0.c item, t0.n nVar, int i10) {
        g1.f fVar = g1.a.f16388j;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f30935a;
        e1.s sVar = this.f30936b;
        switch (i11) {
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
                g1.o e10 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, s0.g.f34069a, 10), 1.0f);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(693286680);
                l1 a10 = o1.a(b0.n.f2935a, fVar, rVar2, 0);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(e10);
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
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar);
                    }
                    v.e.w(rVar2, j10, rVar2, 0, 2058660585);
                    b9.b(hl.f.d1(R.string.selected_text_value, new Object[]{Integer.valueOf(sVar.size())}, rVar2), null, w0.e(R.color.black_1A1A1A, rVar2), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1572864, 0, 131002);
                    if (1.0f > 0.0d) {
                        androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar2);
                        rVar2.s(false);
                        rVar2.s(true);
                        rVar2.s(false);
                        rVar2.s(false);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar2);
                        return;
                    }
                    throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                }
                al.d.v0();
                throw null;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                g1.o e11 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(693286680);
                l1 a11 = o1.a(b0.n.f2935a, fVar, rVar4, 0);
                rVar4.b0(-1323940314);
                int i13 = rVar4.P;
                r1 o11 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(e11);
                if (rVar4.f35166a instanceof t0.f) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar2);
                    } else {
                        rVar4.n0();
                    }
                    t0.t.v0(rVar4, a11, c2.k.f7749e);
                    t0.t.v0(rVar4, o11, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar4, i13, iVar2);
                    }
                    v.e.w(rVar4, j11, rVar4, 0, 2058660585);
                    b9.b(hl.f.d1(R.string.selected_add_members_screen, new Object[]{Integer.valueOf(sVar.size())}, rVar4), null, w0.e(R.color.black_1A1A1A, rVar4), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1572864, 0, 131002);
                    v.e.y(rVar4, false, true, false, false);
                    return;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f30935a) {
            case 0:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
