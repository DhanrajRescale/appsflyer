package li;

import androidx.fragment.app.d1;
import androidx.lifecycle.o;
import ba.yn;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.ui.stock.detail.StockDetailFragment;
import com.assetgro.stockgro.ui.stock.detail.StockDetailViewModel;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yo.n;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockDetailFragment f24853b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(StockDetailFragment stockDetailFragment, int i10) {
        super(1);
        this.f24852a = i10;
        this.f24853b = stockDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f24852a;
        StockDetailFragment stockDetailFragment = this.f24853b;
        switch (i11) {
            case 0:
                Boolean bool = (Boolean) obj;
                yn ynVar = (yn) stockDetailFragment.q();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                ynVar.f6755t.setVisibility(i10);
                return Unit.f23355a;
            default:
                StockDto stockDto = (StockDto) obj;
                Intrinsics.c(stockDto);
                int i12 = StockDetailFragment.f10186j;
                yn ynVar2 = (yn) stockDetailFragment.q();
                String name = stockDto.getName();
                double ltp = stockDto.getLtp();
                String imageUrl = stockDto.getImageUrl();
                MarketAssetToolbarView marketAssetToolbarView = ynVar2.f6758w;
                marketAssetToolbarView.m(ltp, name, imageUrl);
                ChangeDto change = stockDto.getChange();
                if (change != null) {
                    marketAssetToolbarView.n(change);
                }
                yn ynVar3 = (yn) stockDetailFragment.q();
                d1 childFragmentManager = stockDetailFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                o lifecycle = stockDetailFragment.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                String str = (String) stockDetailFragment.f10189i.getValue();
                Intrinsics.checkNotNullExpressionValue(str, "access$getStockId(...)");
                Object value = ((StockDetailViewModel) stockDetailFragment.r()).f10196p.getValue();
                Intrinsics.c(value);
                ((StockDto) value).getLtp();
                ynVar3.f6757v.setAdapter(new f(childFragmentManager, lifecycle, str));
                yn ynVar4 = (yn) stockDetailFragment.q();
                yn ynVar5 = (yn) stockDetailFragment.q();
                new n(ynVar4.f6759x, ynVar5.f6757v, new vc.b(stockDetailFragment, 28)).a();
                ((yn) stockDetailFragment.q()).f6757v.setUserInputEnabled(true);
                yn ynVar6 = (yn) stockDetailFragment.q();
                ynVar6.f6759x.a(new nc.c(stockDetailFragment, 10));
                return Unit.f23355a;
        }
    }
}
