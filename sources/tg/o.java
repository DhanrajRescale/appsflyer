package tg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.j0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import ba.mm;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.model.portfolio.orders.Bought;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioSharedViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioOrdersViewModel;
import com.assetgro.stockgro.ui.stock.modify.StockModifyHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;
import m.c2;
import okhttp3.HttpUrl;
import xf.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ltg/o;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/portfolio/orders/PortfolioOrdersViewModel;", "Lba/mm;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends gd.m<PortfolioOrdersViewModel, mm> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f36067i = 0;

    /* renamed from: g, reason: collision with root package name */
    public k f36068g;

    /* renamed from: h, reason: collision with root package name */
    public PortfolioSharedViewModel f36069h;

    public static final void H(o oVar, Bought bought) {
        String portfolioId = ((PortfolioOrdersViewModel) oVar.r()).f9920s;
        PortfolioOrdersViewModel portfolioOrdersViewModel = (PortfolioOrdersViewModel) oVar.r();
        String stockId = bought.getStockIdentifier();
        String orderId = bought.getOrderId();
        String transactionType = bought.getTransactionType();
        Intrinsics.c(portfolioId);
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        portfolioOrdersViewModel.f9084g.postValue(Boolean.TRUE);
        nt.h c10 = portfolioOrdersViewModel.f9915n.cancelOrder(stockId, orderId, transactionType, portfolioId).c(((kq.e) portfolioOrdersViewModel.f9079b).J());
        jt.d dVar = new jt.d(new fg.g(28, new j(portfolioOrdersViewModel, 0)), new fg.g(29, new j(portfolioOrdersViewModel, 1)));
        c10.a(dVar);
        portfolioOrdersViewModel.f9080c.e(dVar);
    }

    public static final void I(o oVar, Bought bought) {
        oVar.getClass();
        Intent intent = new Intent(oVar.requireContext(), (Class<?>) StockModifyHostActivity.class);
        String transactionType = bought.getTransactionType();
        switch (transactionType.hashCode()) {
            case 97926:
                if (transactionType.equals("buy")) {
                    intent.putExtras(hl.f.y(new Pair("STOCK_NAME", bought.getStockIdentifier()), new Pair("ORDERID", bought.getOrderId()), new Pair("ORDER_TYPE", bought.getTransactionType()), new Pair("PORTFOLIO_ID", ((PortfolioOrdersViewModel) oVar.r()).f9920s), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE), new Pair("PORTFOLIO", ((PortfolioOrdersViewModel) oVar.r()).f9921t), new Pair("DEEPLINK", "stockgro://stocks/buy/modify")));
                    break;
                }
                break;
            case 3526482:
                if (transactionType.equals("sell")) {
                    intent.putExtras(hl.f.y(new Pair("PORTFOLIO_ID", ((PortfolioOrdersViewModel) oVar.r()).f9920s), new Pair("ORDERID", bought.getOrderId()), new Pair("STOCK_NAME", bought.getStockIdentifier()), new Pair("ORDER_TYPE", bought.getTransactionType()), new Pair("PORTFOLIO", ((PortfolioOrdersViewModel) oVar.r()).f9921t), new Pair("DEEPLINK", "stockgro://stocks/sell/modify?portfolioId=" + ((PortfolioOrdersViewModel) oVar.r()).f9920s + "&stockId=" + bought.getStockIdentifier()), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE)));
                    break;
                }
                break;
            case 94852023:
                if (transactionType.equals("cover")) {
                    intent.putExtras(hl.f.y(new Pair("PORTFOLIO_ID", ((PortfolioOrdersViewModel) oVar.r()).f9920s), new Pair("ORDERID", bought.getOrderId()), new Pair("STOCK_NAME", bought.getStockIdentifier()), new Pair("ORDER_TYPE", bought.getTransactionType()), new Pair("PORTFOLIO", ((PortfolioOrdersViewModel) oVar.r()).f9921t), new Pair("DEEPLINK", "stockgro://stocks/cover/modify?portfolioId=" + ((PortfolioOrdersViewModel) oVar.r()).f9920s + "&stockId=" + bought.getStockIdentifier()), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE)));
                    break;
                }
                break;
            case 109413500:
                if (transactionType.equals("short")) {
                    intent.putExtras(hl.f.y(new Pair("STOCK_NAME", bought.getStockIdentifier()), new Pair("ORDERID", bought.getOrderId()), new Pair("ORDER_TYPE", bought.getTransactionType()), new Pair("PORTFOLIO_ID", ((PortfolioOrdersViewModel) oVar.r()).f9920s), new Pair("CALL_FROM_PORTFOLIO", Boolean.TRUE), new Pair("PORTFOLIO", ((PortfolioOrdersViewModel) oVar.r()).f9921t), new Pair("DEEPLINK", "stockgro://stocks/short/modify")));
                    break;
                }
                break;
        }
        oVar.startActivityForResult(intent, 10020);
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_portfolio_stock_order;
    }

    @Override // gd.m
    public final void D() {
        PortfolioSharedViewModel portfolioSharedViewModel;
        super.D();
        ((PortfolioOrdersViewModel) r()).f9916o.observe(this, new v(19, new m(this, 0)));
        ((PortfolioOrdersViewModel) r()).f9084g.observe(this, new v(19, new m(this, 1)));
        ((PortfolioOrdersViewModel) r()).f9919r.observe(this, new v(19, new m(this, 2)));
        ((PortfolioOrdersViewModel) r()).f9917p.observe(this, new v(19, new m(this, 3)));
        j0 activity = getActivity();
        if (activity != null && (portfolioSharedViewModel = (PortfolioSharedViewModel) new g1(activity).a(PortfolioSharedViewModel.class)) != null) {
            this.f36069h = portfolioSharedViewModel;
            portfolioSharedViewModel.f9790b.observe(this, new v(19, new m(this, 4)));
            PortfolioSharedViewModel portfolioSharedViewModel2 = this.f36069h;
            if (portfolioSharedViewModel2 != null) {
                portfolioSharedViewModel2.f9793e.observe(this, new v(19, new m(this, 5)));
                return;
            } else {
                Intrinsics.k("model");
                throw null;
            }
        }
        throw new Exception("Invalid Activity");
    }

    @Override // gd.m
    public final void E(View view) {
        Portfolio portfolio;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            portfolio = (Portfolio) arguments.getParcelable("PORTFOLIO");
        } else {
            portfolio = null;
        }
        if (!(portfolio instanceof Portfolio)) {
            portfolio = null;
        }
        if (portfolio != null) {
            ((PortfolioOrdersViewModel) r()).f9921t = portfolio;
            ((PortfolioOrdersViewModel) r()).f9920s = portfolio.getPortfolioId();
            ((PortfolioOrdersViewModel) r()).f9923v = new BottomSheetItem("All Orders", HttpUrl.FRAGMENT_ENCODE_SET);
            ((PortfolioOrdersViewModel) r()).h(portfolio.getPortfolioId());
            ((PortfolioOrdersViewModel) r()).f9918q.postValue(portfolio.getAssetClass());
        }
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        final int i10 = 0;
        final int i11 = 1;
        this.f36068g = new k(lifecycle, new n(this, 0), new n(this, 1), new m(this, 6));
        mm mmVar = (mm) q();
        k kVar = this.f36068g;
        if (kVar != null) {
            mmVar.f5484u.setAdapter(kVar);
            ((mm) q()).f5486w.setOnClickListener(new View.OnClickListener(this) { // from class: tg.l

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f36062b;

                {
                    this.f36062b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i10;
                    o this$0 = this.f36062b;
                    switch (i12) {
                        case 0:
                            int i13 = o.f36067i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i14 = hd.d.f18292k;
                            Bundle bundle = new Bundle();
                            hd.d dVar = new hd.d();
                            dVar.setArguments(bundle);
                            dVar.show(this$0.getChildFragmentManager(), "PortfolioCustomBottomSheetDialogFragment");
                            return;
                        default:
                            int i15 = o.f36067i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i16 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            ((mm) q()).f5487x.setOnRefreshListener(new vc.b(this, 20));
            ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.layout_spinner_selected, ((PortfolioOrdersViewModel) r()).f9924w);
            arrayAdapter.setDropDownViewResource(R.layout.layout_custom_spinner);
            ((mm) q()).f5482s.setAdapter((SpinnerAdapter) arrayAdapter);
            ((mm) q()).f5482s.setSelection(0, false);
            ((mm) q()).f5482s.setOnTouchListener(new ha.g(this, 4));
            ((mm) q()).f5482s.setOnItemSelectedListener(new c2(this, 3));
            if (kj.a.f23207b) {
                ((mm) q()).f5485v.setVisibility(8);
            } else {
                ((mm) q()).f5485v.setVisibility(0);
            }
            ((mm) q()).f5485v.setOnClickListener(new View.OnClickListener(this) { // from class: tg.l

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f36062b;

                {
                    this.f36062b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i11;
                    o this$0 = this.f36062b;
                    switch (i12) {
                        case 0:
                            int i13 = o.f36067i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i14 = hd.d.f18292k;
                            Bundle bundle = new Bundle();
                            hd.d dVar = new hd.d();
                            dVar.setArguments(bundle);
                            dVar.show(this$0.getChildFragmentManager(), "PortfolioCustomBottomSheetDialogFragment");
                            return;
                        default:
                            int i15 = o.f36067i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i16 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.k("portfolioStockOrderAdapter");
        throw null;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        PortfolioRepository portfolioRepository = bVar.j();
        yk.g.i(portfolioRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(PortfolioOrdersViewModel.class), new ea.m(k10, c10, portfolioRepository, userRepository, 8));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, PortfolioOrdersViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PortfolioOrdersViewModel.class, "<this>", PortfolioOrdersViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            PortfolioOrdersViewModel portfolioOrdersViewModel = (PortfolioOrdersViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(portfolioOrdersViewModel);
            this.f17284b = portfolioOrdersViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
