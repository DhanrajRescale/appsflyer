package ta;

import com.assetgro.stockgro.data.remote.response.HomePageTopDataResponse;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketStocksListViewModel f35667b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(MarketStocksListViewModel marketStocksListViewModel, int i10) {
        super(1);
        this.f35666a = i10;
        this.f35667b = marketStocksListViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.assetgro.stockgro.data.remote.response.StocksListResponse r7) {
        /*
            r6 = this;
            int r0 = r6.f35666a
            com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel r1 = r6.f35667b
            switch(r0) {
                case 1: goto L35;
                default: goto L7;
            }
        L7:
            androidx.lifecycle.e0 r0 = r1.f9084g
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.postValue(r2)
            androidx.lifecycle.e0 r0 = r1.C
            r0.postValue(r2)
            if (r7 == 0) goto L34
            ta.j r0 = new ta.j
            java.util.List r2 = r7.getStocks()
            r0.<init>(r2)
            r1.k(r0)
            int r7 = r7.getStocksCount()
            r1.f8680w = r7
            int r0 = r1.f8682y
            int r2 = r7 / r0
            r1.f8681x = r2
            int r7 = r7 % r0
            if (r7 <= 0) goto L34
            int r2 = r2 + 1
            r1.f8681x = r2
        L34:
            return
        L35:
            androidx.lifecycle.e0 r0 = r1.f9084g
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.postValue(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r7 == 0) goto Lb6
            java.util.List r7 = r7.getStocks()
            java.util.Iterator r7 = r7.iterator()
        L4b:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r7.next()
            com.assetgro.stockgro.data.model.StockDto r2 = (com.assetgro.stockgro.data.model.StockDto) r2
            ni.s r3 = r1.D
            com.assetgro.stockgro.data.repository.SortDirection r3 = r3.f28763b
            com.assetgro.stockgro.data.repository.SortDirection r4 = com.assetgro.stockgro.data.repository.SortDirection.Descending
            r5 = 0
            if (r3 != r4) goto L75
            com.assetgro.stockgro.data.model.ChangeDto r3 = r2.getChange()
            if (r3 == 0) goto L6b
            java.lang.String r3 = r3.getType()
            goto L6c
        L6b:
            r3 = r5
        L6c:
            java.lang.String r4 = "NEGATIVE"
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto L75
            goto L94
        L75:
            ni.s r3 = r1.D
            com.assetgro.stockgro.data.repository.SortDirection r3 = r3.f28763b
            com.assetgro.stockgro.data.repository.SortDirection r4 = com.assetgro.stockgro.data.repository.SortDirection.Ascending
            if (r3 != r4) goto L90
            com.assetgro.stockgro.data.model.ChangeDto r3 = r2.getChange()
            if (r3 == 0) goto L87
            java.lang.String r5 = r3.getType()
        L87:
            java.lang.String r3 = "POSITIVE"
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r5, r3)
            if (r3 == 0) goto L90
            goto L94
        L90:
            r0.add(r2)
            goto L4b
        L94:
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r7.<init>(r2)
            h.m0 r2 = new h.m0
            r3 = 19
            r2.<init>(r3, r1, r0)
            r7.post(r2)
            int r7 = r1.f8680w
            int r0 = r1.f8682y
            int r2 = r7 / r0
            r1.f8681x = r2
            int r7 = r7 % r0
            if (r7 <= 0) goto Lb6
            int r2 = r2 + 1
            r1.f8681x = r2
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.l.a(com.assetgro.stockgro.data.remote.response.StocksListResponse):void");
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f35666a;
        MarketStocksListViewModel marketStocksListViewModel = this.f35667b;
        switch (i10) {
            case 0:
                marketStocksListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 1:
            case 3:
            default:
                marketStocksListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
                marketStocksListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 4:
                marketStocksListViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f35666a;
        MarketStocksListViewModel marketStocksListViewModel = this.f35667b;
        switch (i10) {
            case 0:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 1:
                a((StocksListResponse) obj);
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                a((StocksListResponse) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 5:
                HomePageTopDataResponse homePageTopDataResponse = (HomePageTopDataResponse) obj;
                marketStocksListViewModel.f9084g.postValue(Boolean.FALSE);
                if (homePageTopDataResponse != null) {
                    marketStocksListViewModel.k(new j(homePageTopDataResponse.getTrendingStocks()));
                }
                return Unit.f23355a;
            case 6:
                invoke((Throwable) obj);
                return Unit.f23355a;
            default:
                marketStocksListViewModel.getClass();
                marketStocksListViewModel.j();
                return Unit.f23355a;
        }
    }
}
