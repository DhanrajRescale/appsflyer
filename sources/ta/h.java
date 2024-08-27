package ta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import ba.dk;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.HomePageTopDataResponse;
import com.assetgro.stockgro.data.repository.SortDirection;
import com.assetgro.stockgro.data.repository.SortOption;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.k0;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;
import ni.s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lta/h;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_market/presentation/market/asset/stocks/list/MarketStocksListViewModel;", "Lba/dk;", "Lni/l;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends gd.m<MarketStocksListViewModel, dk> implements ni.l {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f35649j = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f35650g;

    /* renamed from: h, reason: collision with root package name */
    public FirebaseAnalytics f35651h;

    /* renamed from: i, reason: collision with root package name */
    public ni.a f35652i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_market_stocks_list;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MarketStocksListViewModel) r()).f9084g.observe(this, new f7.i(18, new e(this, 0)));
        ((MarketStocksListViewModel) r()).f8675r.observe(this, new f7.i(18, new e(this, 1)));
        ((MarketStocksListViewModel) r()).f8676s.observe(this, new f7.i(18, new e(this, 2)));
        ((MarketStocksListViewModel) r()).f8677t.observe(this, new f7.i(18, new e(this, 3)));
        ((MarketStocksListViewModel) r()).A.observe(this, new f7.i(18, new e(this, 4)));
        MainSharedViewModel mainSharedViewModel = this.f35650g;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.f9593x.observe(this, new f7.i(18, new e(this, 5)));
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "view");
        ((dk) q()).p(this);
        final int i10 = 1;
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        final int i11 = 0;
        if (arguments != null) {
            z10 = arguments.containsKey("SORT_ORDER");
        } else {
            z10 = false;
        }
        MarketStocksListViewModel marketStocksListViewModel = (MarketStocksListViewModel) r();
        Intrinsics.checkNotNullParameter("nifty_500+", "<set-?>");
        marketStocksListViewModel.f8683z = "nifty_500+";
        I(z10);
        if (z10) {
            ((dk) q()).f4497u.setVisibility(8);
        } else {
            ((dk) q()).f4497u.setVisibility(0);
            ((dk) q()).f4497u.setOnClickListener(new View.OnClickListener(this) { // from class: ta.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f35639b;

                {
                    this.f35639b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i11;
                    h this$0 = this.f35639b;
                    switch (i12) {
                        case 0:
                            int i13 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (this$0.getChildFragmentManager().C("MarketStocksSortBottomSheetDialogFragment") == null) {
                                Bundle bundle = new Bundle();
                                ua.a aVar = new ua.a();
                                aVar.setArguments(bundle);
                                aVar.show(this$0.getChildFragmentManager(), "MarketStocksSortBottomSheetDialogFragment");
                                return;
                            }
                            return;
                        case 1:
                            int i14 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((MarketStocksListViewModel) this$0.r()).f8679v < ((MarketStocksListViewModel) this$0.r()).f8681x) {
                                ((MarketStocksListViewModel) this$0.r()).f8679v++;
                                ((MarketStocksListViewModel) this$0.r()).j();
                                return;
                            }
                            return;
                        case 2:
                            int i15 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((MarketStocksListViewModel) this$0.r()).f8679v > 1) {
                                MarketStocksListViewModel marketStocksListViewModel2 = (MarketStocksListViewModel) this$0.r();
                                marketStocksListViewModel2.f8679v--;
                                ((MarketStocksListViewModel) this$0.r()).j();
                                return;
                            }
                            return;
                        default:
                            int i16 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i17 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
        }
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f35652i = new ni.a(lifecycle, this);
        o lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        new ni.a(lifecycle2, this);
        dk dkVar = (dk) q();
        ni.a aVar = this.f35652i;
        if (aVar != null) {
            dkVar.f4500x.setAdapter(aVar);
            ((dk) q()).f4501y.setOnRefreshListener(new d(this, z10, 0));
            ((dk) q()).f4496t.getNext().setOnClickListener(new View.OnClickListener(this) { // from class: ta.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f35639b;

                {
                    this.f35639b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i10;
                    h this$0 = this.f35639b;
                    switch (i12) {
                        case 0:
                            int i13 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (this$0.getChildFragmentManager().C("MarketStocksSortBottomSheetDialogFragment") == null) {
                                Bundle bundle = new Bundle();
                                ua.a aVar2 = new ua.a();
                                aVar2.setArguments(bundle);
                                aVar2.show(this$0.getChildFragmentManager(), "MarketStocksSortBottomSheetDialogFragment");
                                return;
                            }
                            return;
                        case 1:
                            int i14 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((MarketStocksListViewModel) this$0.r()).f8679v < ((MarketStocksListViewModel) this$0.r()).f8681x) {
                                ((MarketStocksListViewModel) this$0.r()).f8679v++;
                                ((MarketStocksListViewModel) this$0.r()).j();
                                return;
                            }
                            return;
                        case 2:
                            int i15 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((MarketStocksListViewModel) this$0.r()).f8679v > 1) {
                                MarketStocksListViewModel marketStocksListViewModel2 = (MarketStocksListViewModel) this$0.r();
                                marketStocksListViewModel2.f8679v--;
                                ((MarketStocksListViewModel) this$0.r()).j();
                                return;
                            }
                            return;
                        default:
                            int i16 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i17 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            final int i12 = 2;
            ((dk) q()).f4496t.getPrev().setOnClickListener(new View.OnClickListener(this) { // from class: ta.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f35639b;

                {
                    this.f35639b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i122 = i12;
                    h this$0 = this.f35639b;
                    switch (i122) {
                        case 0:
                            int i13 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (this$0.getChildFragmentManager().C("MarketStocksSortBottomSheetDialogFragment") == null) {
                                Bundle bundle = new Bundle();
                                ua.a aVar2 = new ua.a();
                                aVar2.setArguments(bundle);
                                aVar2.show(this$0.getChildFragmentManager(), "MarketStocksSortBottomSheetDialogFragment");
                                return;
                            }
                            return;
                        case 1:
                            int i14 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((MarketStocksListViewModel) this$0.r()).f8679v < ((MarketStocksListViewModel) this$0.r()).f8681x) {
                                ((MarketStocksListViewModel) this$0.r()).f8679v++;
                                ((MarketStocksListViewModel) this$0.r()).j();
                                return;
                            }
                            return;
                        case 2:
                            int i15 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((MarketStocksListViewModel) this$0.r()).f8679v > 1) {
                                MarketStocksListViewModel marketStocksListViewModel2 = (MarketStocksListViewModel) this$0.r();
                                marketStocksListViewModel2.f8679v--;
                                ((MarketStocksListViewModel) this$0.r()).j();
                                return;
                            }
                            return;
                        default:
                            int i16 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i17 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            H();
            ((MarketStocksListViewModel) r()).k(k.f35659b);
            t viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            final int i13 = 3;
            yk.g.H(yk.j.X0(viewLifecycleOwner), null, null, new g(this, null), 3);
            if (kj.a.f23207b) {
                ((dk) q()).f4498v.setVisibility(8);
            } else {
                ((dk) q()).f4498v.setVisibility(0);
            }
            ((dk) q()).f4498v.setOnClickListener(new View.OnClickListener(this) { // from class: ta.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f35639b;

                {
                    this.f35639b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i122 = i13;
                    h this$0 = this.f35639b;
                    switch (i122) {
                        case 0:
                            int i132 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (this$0.getChildFragmentManager().C("MarketStocksSortBottomSheetDialogFragment") == null) {
                                Bundle bundle = new Bundle();
                                ua.a aVar2 = new ua.a();
                                aVar2.setArguments(bundle);
                                aVar2.show(this$0.getChildFragmentManager(), "MarketStocksSortBottomSheetDialogFragment");
                                return;
                            }
                            return;
                        case 1:
                            int i14 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((MarketStocksListViewModel) this$0.r()).f8679v < ((MarketStocksListViewModel) this$0.r()).f8681x) {
                                ((MarketStocksListViewModel) this$0.r()).f8679v++;
                                ((MarketStocksListViewModel) this$0.r()).j();
                                return;
                            }
                            return;
                        case 2:
                            int i15 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((MarketStocksListViewModel) this$0.r()).f8679v > 1) {
                                MarketStocksListViewModel marketStocksListViewModel2 = (MarketStocksListViewModel) this$0.r();
                                marketStocksListViewModel2.f8679v--;
                                ((MarketStocksListViewModel) this$0.r()).j();
                                return;
                            }
                            return;
                        default:
                            int i16 = h.f35649j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i17 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.k("stockAdapter");
        throw null;
    }

    public final void H() {
        MarketStocksListViewModel marketStocksListViewModel = (MarketStocksListViewModel) r();
        marketStocksListViewModel.f8679v = 1;
        marketStocksListViewModel.f8681x = 1;
        marketStocksListViewModel.f8678u.clear();
        ((dk) q()).f4496t.getPrev().setVisibility(4);
        ((dk) q()).f4496t.getNext().setVisibility(0);
    }

    public final void I(boolean z10) {
        String str;
        ((MarketStocksListViewModel) r()).k(k.f35662e);
        if (z10) {
            Bundle arguments = getArguments();
            if (arguments == null || (str = arguments.getString("SORT_ORDER")) == null) {
                str = "PERCENT_DESC";
            }
            switch (str.hashCode()) {
                case -2117384923:
                    if (str.equals("TRENDING")) {
                        MarketStocksListViewModel marketStocksListViewModel = (MarketStocksListViewModel) r();
                        at.m<BaseResponseDto<HomePageTopDataResponse>> homePageTopData = marketStocksListViewModel.f8672o.getHomePageTopData();
                        com.assetgro.stockgro.data.a aVar = new com.assetgro.stockgro.data.a(21, m.f35670d);
                        homePageTopData.getClass();
                        nt.h c10 = new nt.f(homePageTopData, aVar, 1).c(((kq.e) marketStocksListViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new com.assetgro.stockgro.data.a(22, new l(marketStocksListViewModel, 5)), new com.assetgro.stockgro.data.a(23, new l(marketStocksListViewModel, 6)));
                        c10.a(dVar);
                        marketStocksListViewModel.f9080c.c(dVar);
                        return;
                    }
                    return;
                case -952653604:
                    if (str.equals("FT_WEEK_HIGH")) {
                        ((MarketStocksListViewModel) r()).h("FT_WEEK_HIGH");
                        return;
                    }
                    return;
                case -653163721:
                    if (str.equals("PERCENT_ASC")) {
                        MarketStocksListViewModel marketStocksListViewModel2 = (MarketStocksListViewModel) r();
                        s sVar = new s(SortOption.Percentage, SortDirection.Ascending, R.string.percentage_ascending);
                        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
                        marketStocksListViewModel2.D = sVar;
                        H();
                        ((MarketStocksListViewModel) r()).i();
                        return;
                    }
                    return;
                case -307821382:
                    if (str.equals("FT_WEEK_LOW")) {
                        ((MarketStocksListViewModel) r()).h("FT_WEEK_LOW");
                        return;
                    }
                    return;
                case 1226837611:
                    if (str.equals("PERCENT_DESC")) {
                        MarketStocksListViewModel marketStocksListViewModel3 = (MarketStocksListViewModel) r();
                        s sVar2 = new s(SortOption.Percentage, SortDirection.Descending, R.string.percentage_descending);
                        Intrinsics.checkNotNullParameter(sVar2, "<set-?>");
                        marketStocksListViewModel3.D = sVar2;
                        H();
                        ((MarketStocksListViewModel) r()).i();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        ((MarketStocksListViewModel) r()).j();
    }

    @Override // ni.l
    public final void c(StockDto stockDto) {
        String str;
        Intrinsics.checkNotNullParameter(stockDto, "stockDto");
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("PORTFOLIO_ID");
        } else {
            str = null;
        }
        FirebaseAnalytics firebaseAnalytics = this.f35651h;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a("stock_detail", (Bundle) new ll.o(12, 0).f24937b);
            j0 activity = getActivity();
            if (activity != null) {
                Intent intent = new Intent(activity, (Class<?>) StockDetailHostActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("ADD_TO_PORTFOLIO", activity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
                bundle.putParcelable("PORTFOLIO", activity.getIntent().getParcelableExtra("PORTFOLIO"));
                bundle.putBoolean("CALL_FROM_PORTFOLIO", activity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
                bundle.putString("STOCK_NAME", stockDto.getCode());
                bundle.putParcelable("STOCK", stockDto);
                bundle.putString("PORTFOLIO_ID", str);
                intent.putExtras(bundle);
                requireActivity().startActivityForResult(intent, 10016);
                jt.e eVar = ((MarketStocksListViewModel) r()).B;
                if (eVar != null) {
                    ft.b.b(eVar);
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.k("firebaseAnalytics");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        j0 activity;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10056 && i11 == -1 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        jt.e eVar = ((MarketStocksListViewModel) r()).B;
        if (eVar != null) {
            ft.b.b(eVar);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((MarketStocksListViewModel) r()).l();
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        StockRepository stockRepository = bVar.l();
        yk.g.i(stockRepository);
        TopChartsRepository topChartsRepository = (TopChartsRepository) bVar.f14269u.get();
        yk.g.i(topChartsRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(topChartsRepository, "topChartsRepository");
        ca.c factory = new ca.c(a0.a(MarketStocksListViewModel.class), new k0(k10, c10, userRepository, stockRepository, topChartsRepository));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MarketStocksListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketStocksListViewModel.class, "<this>", MarketStocksListViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            MarketStocksListViewModel marketStocksListViewModel = (MarketStocksListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(marketStocksListViewModel);
            this.f17284b = marketStocksListViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f35650g = fragmentComponent.f();
            FirebaseAnalytics d11 = bVar.d();
            yk.g.i(d11);
            this.f35651h = d11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
