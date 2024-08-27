package pa;

import ba.tj;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailViewModel;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f30802b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i10) {
        super(1);
        this.f30801a = i10;
        this.f30802b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ni.c cVar;
        int i10 = this.f30801a;
        c cVar2 = this.f30802b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                tj tjVar = (tj) cVar2.q();
                Intrinsics.c(bool);
                tjVar.f6199t.setRefreshing(bool.booleanValue());
                return Unit.f23355a;
            default:
                List list = (List) obj;
                tj tjVar2 = (tj) cVar2.q();
                if (b.f30803a[((MarketInsightsDetailViewModel) cVar2.r()).f8664q.ordinal()] == 1) {
                    cVar = cVar2.f30807i;
                    if (cVar == null) {
                        Intrinsics.k("volumeShockerAdapter");
                        throw null;
                    }
                } else {
                    cVar = cVar2.f30806h;
                    if (cVar == null) {
                        Intrinsics.k("assetListAdapter");
                        throw null;
                    }
                }
                tjVar2.f6198s.setAdapter(cVar);
                ni.c cVar3 = cVar2.f30807i;
                if (cVar3 != null) {
                    cVar3.u(list);
                    ni.c cVar4 = cVar2.f30806h;
                    if (cVar4 != null) {
                        cVar4.u(list);
                        return Unit.f23355a;
                    }
                    Intrinsics.k("assetListAdapter");
                    throw null;
                }
                Intrinsics.k("volumeShockerAdapter");
                throw null;
        }
    }
}
