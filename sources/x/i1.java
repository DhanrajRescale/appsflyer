package x;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(String str, int i10) {
        super(1);
        this.f39585a = i10;
        this.f39586b = str;
    }

    public final Portfolio a(BaseResponseDto portfoliosResponse) {
        int i10 = this.f39585a;
        r1 = null;
        String str = this.f39586b;
        switch (i10) {
            case 6:
                Intrinsics.checkNotNullParameter(portfoliosResponse, "portfoliosResponse");
                List<Portfolio> list = (List) portfoliosResponse.getData();
                if (list != null) {
                    for (Portfolio portfolio : list) {
                        if (Intrinsics.a(portfolio.getPortfolioId(), str)) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return portfolio;
            default:
                Intrinsics.checkNotNullParameter(portfoliosResponse, "portfoliosResponse");
                List<Portfolio> list2 = (List) portfoliosResponse.getData();
                if (list2 != null) {
                    for (Portfolio portfolio2 : list2) {
                        if (Intrinsics.a(portfolio2.getPortfolioId(), str)) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return portfolio2;
        }
    }

    public final void d(h2.v semantics) {
        int i10 = this.f39585a;
        String str = this.f39586b;
        switch (i10) {
            case 0:
                h2.t.e(semantics, str);
                h2.t.f(semantics, 5);
                return;
            case 1:
                h2.t.e(semantics, str);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, UrlTreeKt.componentParamPrefix + str + "}Icon");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, UrlTreeKt.componentParamPrefix + str + "}Title");
                return;
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, UrlTreeKt.componentParamPrefix + str + "}Description");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39585a) {
            case 0:
                d((h2.v) obj);
                return Unit.f23355a;
            case 1:
                d((h2.v) obj);
                return Unit.f23355a;
            case 2:
                d((h2.v) obj);
                return Unit.f23355a;
            case 3:
                d((h2.v) obj);
                return Unit.f23355a;
            case 4:
                d((h2.v) obj);
                return Unit.f23355a;
            case 5:
                StockgroContact stockgroContact = (StockgroContact) obj;
                Intrinsics.checkNotNullParameter(stockgroContact, "<name for destructuring parameter 0>");
                String name = stockgroContact.getName();
                if (name != null) {
                    kotlin.text.w.s(name, this.f39586b, true);
                }
                return Boolean.FALSE;
            case 6:
                return a((BaseResponseDto) obj);
            default:
                return a((BaseResponseDto) obj);
        }
    }
}
