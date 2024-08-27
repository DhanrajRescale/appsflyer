package ga;

import ba.kh;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionChain;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionChainFragment f17180b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(OptionChainFragment optionChainFragment, int i10) {
        super(1);
        this.f17179a = i10;
        this.f17180b = optionChainFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17179a;
        OptionChainFragment optionChainFragment = this.f17180b;
        switch (i10) {
            case 0:
                FnoOption identifierInfo = ((OptionChain) obj).getIdentifierInfo();
                int i11 = OptionChainFragment.f8581h;
                optionChainFragment.H(identifierInfo);
                ((kh) optionChainFragment.q()).f5246v.setVisibility(0);
                return Unit.f23355a;
            case 1:
                List list = (List) obj;
                ((kh) optionChainFragment.q()).f5247w.setRefreshing(false);
                b bVar = optionChainFragment.f8582g;
                if (bVar != null) {
                    bVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("optionChainAdapter");
                throw null;
            default:
                AnalyticEvent analyticEvent = new AnalyticEvent("app_market_optlist_putcall_toggle", null, 2, null);
                optionChainFragment.z(analyticEvent);
                optionChainFragment.B(analyticEvent);
                return Unit.f23355a;
        }
    }
}
