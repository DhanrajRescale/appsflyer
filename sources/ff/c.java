package ff;

import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.data.remote.response.AssetUploadResponse;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockGroHelpViewModel f16057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(StockGroHelpViewModel stockGroHelpViewModel, int i10) {
        super(1);
        this.f16056a = i10;
        this.f16057b = stockGroHelpViewModel;
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f16056a;
        StockGroHelpViewModel stockGroHelpViewModel = this.f16057b;
        switch (i10) {
            case 1:
                stockGroHelpViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
            default:
                stockGroHelpViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 3:
                stockGroHelpViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f16056a;
        StockGroHelpViewModel stockGroHelpViewModel = this.f16057b;
        switch (i10) {
            case 0:
                stockGroHelpViewModel.f9084g.postValue(Boolean.FALSE);
                stockGroHelpViewModel.f9543w = (KycResponseDto) obj;
                return Unit.f23355a;
            case 1:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 2:
                stockGroHelpViewModel.f9084g.postValue(Boolean.FALSE);
                stockGroHelpViewModel.f9544x.postValue((KycSupportTicketResponseDto) obj);
                return Unit.f23355a;
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                String url = ((AssetUploadResponse) obj).getUrl();
                if (url != null) {
                    stockGroHelpViewModel.f9541u.add(url);
                    int i11 = stockGroHelpViewModel.f9536p + 1;
                    stockGroHelpViewModel.f9536p = i11;
                    if (i11 == stockGroHelpViewModel.f9535o) {
                        stockGroHelpViewModel.i(stockGroHelpViewModel.f9540t, stockGroHelpViewModel.f9539s);
                    }
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
