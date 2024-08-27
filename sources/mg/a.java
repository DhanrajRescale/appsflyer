package mg;

import b0.v;
import c2.i;
import c2.j;
import g1.l;
import g1.o;
import iu.k;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n1.s0;
import o2.s;
import s0.g;
import t0.m2;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public final class a extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f27736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27737e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j10, String str, long j11, s sVar, int i10) {
        super(2);
        this.f27733a = j10;
        this.f27734b = str;
        this.f27735c = j11;
        this.f27736d = sVar;
        this.f27737e = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        float f10 = 2;
        o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.s(androidx.compose.foundation.a.e(l.f16404b, this.f27733a, s0.f28162a), 50, g.f34069a, 2), g.f34069a, f10, g.f34069a, f10, 5);
        g1.g gVar = g1.a.f16383e;
        long j10 = this.f27735c;
        s sVar = this.f27736d;
        r rVar2 = (r) nVar;
        rVar2.b0(733328855);
        v c10 = b0.s.c(gVar, false, rVar2, 6);
        rVar2.b0(-1323940314);
        int i10 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        j jVar = c2.k.f7746b;
        b1.c j11 = androidx.compose.ui.layout.a.j(x10);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t.v0(rVar2, c10, c2.k.f7749e);
            t.v0(rVar2, o10, c2.k.f7748d);
            i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i10))) {
                nn.d.s(i10, rVar2, i10, iVar);
            }
            nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
            String upperCase = this.f27734b.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            al.d.C(upperCase, null, j10, yk.j.e1(10), null, null, sVar, 0L, null, new u2.i(this.f27737e), 0L, 0, false, 0, 0, null, null, rVar2, 3072, 0, 130482);
            v.e.y(rVar2, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
