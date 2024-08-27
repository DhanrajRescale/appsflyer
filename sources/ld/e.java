package ld;

import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f24553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Function0 function0, int i10) {
        super(2);
        this.f24552a = i10;
        this.f24553b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f24552a;
        Function0 function0 = this.f24553b;
        switch (i10) {
            case 0:
                t0.n nVar = (t0.n) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                g1.o x10 = androidx.compose.foundation.layout.a.x(g1.l.f16404b, 8, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-1124598428);
                boolean h10 = rVar2.h(function0);
                Object Q = rVar2.Q();
                if (h10 || Q == t0.m.f35080a) {
                    Q = v.e.p(function0, 21, rVar2);
                }
                rVar2.s(false);
                al.d.z(R.drawable.ic_back, null, androidx.compose.foundation.a.k(x10, (Function0) Q, 7), 0L, rVar2, 6, 10);
                return Unit.f23355a;
            default:
                String deeplink = (String) obj;
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                function0.mo2invoke();
                return Unit.f23355a;
        }
    }
}
