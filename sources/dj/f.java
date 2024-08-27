package dj;

import ba.po;
import com.assetgro.stockgro.data.AnalyticEvent;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f14396b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i10) {
        super(1);
        this.f14395a = i10;
        this.f14396b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f14395a;
        g gVar = this.f14396b;
        switch (i10) {
            case 0:
                zi.e eVar = (zi.e) obj;
                ((po) gVar.q()).f5795v.setRefreshing(false);
                a aVar = gVar.f14398g;
                if (aVar != null) {
                    aVar.u(eVar.f42471a);
                    return Unit.f23355a;
                }
                Intrinsics.k("stockOverviewSectionAdapter");
                throw null;
            case 1:
                zi.k it = (zi.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i11 = aj.c.f442c;
                ni.g.c(it).show(gVar.getChildFragmentManager(), "MarketSectionTermBottomSheetDialogFragment");
                return Unit.f23355a;
            default:
                AnalyticEvent it2 = (AnalyticEvent) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gVar.z(it2);
                return Unit.f23355a;
        }
    }
}
