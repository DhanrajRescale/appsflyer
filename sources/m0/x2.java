package m0;

import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class x2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27078b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(int i10, boolean z10) {
        super(2);
        this.f27077a = i10;
        this.f27078b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [g1.o] */
    public final void a(t0.n nVar, int i10) {
        float f10;
        long j10;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f27077a;
        boolean z10 = this.f27078b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                r1.f fVar = zq.f.f42804b;
                if (fVar == null) {
                    r1.e eVar = new r1.e("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    vt.i0 i0Var = r1.h0.f32945a;
                    n1.z0 z0Var = new n1.z0(n1.t.f28170b);
                    Object obj = new t9.c(8).f35633b;
                    ArrayList arrayList = (ArrayList) obj;
                    arrayList.add(new r1.n(7.0f, 10.0f));
                    ((ArrayList) obj).add(new r1.u(5.0f, 5.0f));
                    ((ArrayList) obj).add(new r1.u(5.0f, -5.0f));
                    arrayList.add(r1.j.f32953c);
                    eVar.b();
                    ((r1.d) jr.h.l(eVar.f32884i, 1)).f32873j.add(new r1.k0(HttpUrl.FRAGMENT_ENCODE_SET, arrayList, 0, z0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, s0.g.f34069a, 1.0f, s0.g.f34069a));
                    fVar = eVar.a();
                    zq.f.f42804b = fVar;
                }
                if (z10) {
                    f10 = 180.0f;
                } else {
                    f10 = 360.0f;
                }
                float f11 = f10;
                if (f11 != s0.g.f34069a) {
                    lVar = androidx.compose.ui.graphics.a.r(lVar, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, f11, null, false, 130815);
                }
                s3.b(fVar, "Trailing icon for exposed dropdown menu", lVar, 0L, nVar, 48, 8);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                q1.b u10 = d2.w0.u(R.drawable.ic_unfilled_circle_indicator, nVar, 6);
                g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, kp.j.R(18, nVar));
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(-107854913);
                if (!z10) {
                    j10 = d2.w0.e(R.color.transaction_success, rVar3);
                } else {
                    j10 = n1.t.f28177i;
                }
                long j11 = j10;
                rVar3.s(false);
                s3.a(u10, "Start", m10, j11, rVar3, 56, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27077a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
