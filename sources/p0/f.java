package p0;

import androidx.compose.foundation.layout.FillElement;
import b0.s;
import b0.v;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.l5;
import t0.m2;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public final class f extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f30448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j10, o oVar) {
        super(3);
        this.f30448a = j10;
        this.f30449b = oVar;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((r) nVar).i(booleanValue)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 19) == 18) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        g1.l lVar = g1.l.f16404b;
        FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
        g1.g gVar = g1.a.f16383e;
        long j10 = this.f30448a;
        o oVar = this.f30449b;
        r rVar2 = (r) nVar;
        rVar2.b0(733328855);
        v c10 = s.c(gVar, false, rVar2, 6);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j11 = androidx.compose.ui.layout.a.j(fillElement);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t.v0(rVar2, c10, c2.k.f7749e);
            t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar);
            }
            nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
            float f10 = h.f30460c;
            float f11 = h.f30461d;
            float f12 = (f10 + f11) * 2;
            if (booleanValue) {
                rVar2.b0(-2035146990);
                z10 = false;
                l5.a(androidx.compose.foundation.layout.d.m(lVar, f12), j10, f11, 0L, 0, rVar2, 390, 24);
                rVar2.s(false);
            } else {
                z10 = false;
                rVar2.b0(-2035146736);
                h.b(oVar, j10, androidx.compose.foundation.layout.d.m(lVar, f12), rVar2, 384);
                rVar2.s(false);
            }
            v.e.y(rVar2, z10, true, z10, z10);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
