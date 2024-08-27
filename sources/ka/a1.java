package ka;

import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import m0.k1;
import m0.z2;
import t0.g1;

/* loaded from: classes.dex */
public final class a1 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22742b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(g1 g1Var, int i10) {
        super(2);
        this.f22741a = i10;
        this.f22742b = g1Var;
    }

    public final void a(t0.n nVar, int i10) {
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f22741a;
        g1 g1Var = this.f22742b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                z2.f27210a.a(((Boolean) g1Var.getValue()).booleanValue(), null, nVar, 0, 2);
                return;
            case 1:
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                boolean booleanValue = ((Boolean) g1Var.getValue()).booleanValue();
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(-220996385);
                k1 n10 = qu.i0.n(d2.w0.e(R.color.purpleSubmitBackground, rVar3), rVar3, 0, 30);
                Object h10 = v.e.h(rVar3, false, -666383381);
                if (h10 == t0.m.f35080a) {
                    h10 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var, 17, rVar3);
                }
                rVar3.s(false);
                m0.u0.a(booleanValue, (Function1) h10, null, false, null, n10, rVar3, 48, 28);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 8), rVar3);
                b9.b(hl.f.c1(R.string.exit_group, rVar3), null, n1.t.f28170b, yk.j.e1(12), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 1576320, 0, 130994);
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                String str = (String) g1Var.getValue();
                if (str == null) {
                    str = "Media";
                }
                long e10 = d2.w0.e(R.color.white, nVar);
                o2.v vVar = jh.c.f21373b;
                al.d.C(str, h2.l.a(lVar, false, ld.b.f24533e), e10, yk.j.e1(16), null, null, vVar, 0L, null, null, 0L, 0, false, 1, 0, null, null, nVar, 1575936, 3072, 122800);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f22741a;
        g1 g1Var = this.f22742b;
        switch (i10) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                g1Var.setValue(Float.valueOf(floatValue));
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                x1.t change = (x1.t) obj;
                long j10 = ((m1.c) obj2).f27237a;
                Intrinsics.checkNotNullParameter(change, "change");
                g1Var.setValue(new m1.c(change.f39911c));
                return Unit.f23355a;
        }
    }
}
