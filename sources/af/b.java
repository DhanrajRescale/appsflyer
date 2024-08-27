package af;

import com.assetgro.stockgro.data.model.CardInteraction;
import com.assetgro.stockgro.data.model.StockGyanDto;
import com.assetgro.stockgro.data.model.StockGyanGroup;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsViewModel;
import iu.k;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockGyanGroupsViewModel f399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StockGyanGroupsViewModel stockGyanGroupsViewModel, int i10) {
        super(1);
        this.f398a = i10;
        this.f399b = stockGyanGroupsViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f398a;
        StockGyanGroupsViewModel stockGyanGroupsViewModel = this.f399b;
        switch (i10) {
            case 0:
                stockGyanGroupsViewModel.f9084g.postValue(Boolean.FALSE);
                StockGyanDto stockGyanDto = (StockGyanDto) ((BaseResponseDto) obj).getData();
                if (stockGyanDto != null) {
                    List<StockGyanGroup> stockGyanGroups = stockGyanDto.getStockGyanGroups();
                    if (stockGyanGroups != null) {
                        stockGyanGroupsViewModel.f9503p.postValue(stockGyanGroups);
                    }
                    HashMap<String, CardInteraction> cardInteraction = stockGyanDto.getCardInteraction();
                    if (cardInteraction != null) {
                        Intrinsics.checkNotNullParameter(cardInteraction, "<set-?>");
                        stockGyanGroupsViewModel.f9505r = cardInteraction;
                    }
                }
                return Unit.f23355a;
            default:
                stockGyanGroupsViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
