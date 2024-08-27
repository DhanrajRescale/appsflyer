package hf;

import androidx.compose.foundation.layout.FillElement;
import b0.l1;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18360a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        g1.l lVar = g1.l.f16404b;
        FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
        b0.g gVar = b0.n.f2939e;
        g1.e eVar = g1.a.f16392n;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-483455358);
        l1 a10 = b0.y.a(gVar, eVar, rVar2, 54);
        rVar2.b0(-1323940314);
        int i10 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(fillElement);
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
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i10))) {
                nn.d.s(i10, rVar2, i10, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            g1.o a11 = h2.l.a(lVar, false, b.f18329b);
            al.d.C(hl.f.c1(R.string.view_more_ith_ellipsis, rVar2), a11, w0.e(R.color.primaryButtonColor, rVar2), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1572864, 0, 131000);
            v.e.y(rVar2, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
