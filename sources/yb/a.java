package yb;

import androidx.compose.foundation.layout.FillElement;
import b0.v;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.s3;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class a extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f41418a = new iu.k(3);

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        String it = (String) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((intValue & 81) == 16) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        g1.l lVar = g1.l.f16404b;
        FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
        g1.g gVar = g1.a.f16386h;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(733328855);
        v c10 = b0.s.c(gVar, false, rVar2, 6);
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
            t0.t.v0(rVar2, c10, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i10))) {
                nn.d.s(i10, rVar2, i10, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            s3.a(w0.u(R.drawable.ic_arrow_within_circle, rVar2, 6), null, androidx.compose.foundation.layout.d.m(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, kp.j.R(2, rVar2), 7), kp.j.R(13, rVar2)), n1.t.f28173e, rVar2, 3128, 0);
            v.e.y(rVar2, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
