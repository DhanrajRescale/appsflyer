package jf;

import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockGyanViewModel f21357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(StockGyanViewModel stockGyanViewModel, int i10) {
        super(1);
        this.f21356a = i10;
        this.f21357b = stockGyanViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f21356a;
        StockGyanViewModel stockGyanViewModel = this.f21357b;
        switch (i10) {
            case 0:
                stockGyanViewModel.f9084g.postValue(Boolean.FALSE);
                return Unit.f23355a;
            default:
                stockGyanViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
