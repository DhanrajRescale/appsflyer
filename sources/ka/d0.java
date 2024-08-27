package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class d0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(long j10, g1.o oVar) {
        super(2);
        this.f22764a = 2;
        this.f22766c = j10;
        this.f22765b = oVar;
    }

    public final void a(t0.n nVar, int i10) {
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f22764a;
        Object obj = this.f22765b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                long e12 = yk.j.e1(16);
                o2.v vVar = jh.c.f21373b;
                al.d.C((String) obj, androidx.compose.foundation.layout.a.m(lVar), this.f22766c, e12, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1576368, 0, 130992);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                long e13 = yk.j.e1(16);
                o2.v vVar2 = jh.c.f21373b;
                al.d.C((String) obj, androidx.compose.foundation.layout.a.m(lVar), this.f22766c, e13, null, null, vVar2, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1576368, 0, 130992);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                long j10 = this.f22766c;
                if (j10 != 9205357640488583168L) {
                    t0.r rVar4 = (t0.r) nVar;
                    rVar4.b0(1275644075);
                    g1.o l10 = androidx.compose.foundation.layout.d.l((g1.o) obj, w2.g.b(j10), w2.g.a(j10));
                    g1.g gVar = g1.a.f16380b;
                    rVar4.b0(733328855);
                    b0.v c10 = b0.s.c(gVar, false, rVar4, 6);
                    rVar4.b0(-1323940314);
                    int i12 = rVar4.P;
                    r1 o10 = rVar4.o();
                    c2.l.M.getClass();
                    c2.j jVar = c2.k.f7746b;
                    b1.c j11 = androidx.compose.ui.layout.a.j(l10);
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
                        if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i12))) {
                            nn.d.s(i12, rVar4, i12, iVar);
                        }
                        nn.d.q(0, j11, new m2(rVar4), rVar4, 2058660585);
                        i0.f.b(null, rVar4, 0, 1);
                        v.e.y(rVar4, false, true, false, false);
                        rVar4.s(false);
                        return;
                    }
                    al.d.v0();
                    throw null;
                }
                t0.r rVar5 = (t0.r) nVar;
                rVar5.b0(1275644418);
                i0.f.b((g1.o) obj, rVar5, 0, 0);
                rVar5.s(false);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f22764a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(String str, long j10, int i10) {
        super(2);
        this.f22764a = i10;
        this.f22765b = str;
        this.f22766c = j10;
    }
}
