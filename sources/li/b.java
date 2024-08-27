package li;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.c0;
import androidx.navigation.k0;
import androidx.navigation.t;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.StockDetailFragment;
import com.assetgro.stockgro.ui.stock.detail.StockDetailViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ll.o;
import q6.l;

/* loaded from: classes.dex */
public final class b extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockDetailFragment f24855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StockDetailFragment stockDetailFragment, String str, int i10) {
        super(0);
        this.f24854a = i10;
        this.f24855b = stockDetailFragment;
        this.f24856c = str;
    }

    public final void a() {
        Parcelable parcelable;
        int i10 = this.f24854a;
        String str = this.f24856c;
        StockDetailFragment stockDetailFragment = this.f24855b;
        Parcelable parcelable2 = null;
        switch (i10) {
            case 0:
                if (((StockDetailViewModel) stockDetailFragment.r()).f10195o.b(qf.b.f31941p)) {
                    StockDetailFragment.H(stockDetailFragment);
                    return;
                }
                FirebaseAnalytics firebaseAnalytics = stockDetailFragment.f10188h;
                if (firebaseAnalytics != null) {
                    firebaseAnalytics.a("stock_order", (Bundle) new o(12, 0).f24937b);
                    StockDto stockDto = (StockDto) ((StockDetailViewModel) stockDetailFragment.r()).f10196p.getValue();
                    if (stockDto != null) {
                        StockSharedViewModel stockSharedViewModel = stockDetailFragment.f10187g;
                        if (stockSharedViewModel != null) {
                            if (!stockSharedViewModel.f10197n) {
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("STOCK", stockDto);
                                bundle.putString("PORTFOLIO_ID", str);
                                Bundle arguments = stockDetailFragment.getArguments();
                                if (arguments != null) {
                                    parcelable2 = arguments.getParcelable("PORTFOLIO");
                                }
                                bundle.putParcelable("PORTFOLIO", parcelable2);
                                c0 f10 = l.h(stockDetailFragment).f();
                                Intrinsics.c(f10);
                                k0 k0Var = new k0(false, false, f10.f2181h, true, false, -1, -1, -1, -1);
                                c0 f11 = l.h(stockDetailFragment).f();
                                if (f11 != null && f11.f2181h == R.id.stock_detail_fragment) {
                                    l.h(stockDetailFragment).l(R.id.action_stock_detail_fragment_to_stock_order_fragment, bundle, k0Var);
                                    return;
                                }
                                return;
                            }
                            if (stockSharedViewModel != null) {
                                stockSharedViewModel.f10199p.postValue(stockDto);
                                return;
                            } else {
                                Intrinsics.k("stockSharedViewModel");
                                throw null;
                            }
                        }
                        Intrinsics.k("stockSharedViewModel");
                        throw null;
                    }
                    return;
                }
                Intrinsics.k("firebaseAnalytics");
                throw null;
            default:
                if (((StockDetailViewModel) stockDetailFragment.r()).f10195o.b(qf.b.f31941p)) {
                    StockDetailFragment.H(stockDetailFragment);
                    return;
                }
                StockDto stockDto2 = (StockDto) ((StockDetailViewModel) stockDetailFragment.r()).f10196p.getValue();
                if (stockDto2 != null) {
                    StockSharedViewModel stockSharedViewModel2 = stockDetailFragment.f10187g;
                    if (stockSharedViewModel2 != null) {
                        if (!stockSharedViewModel2.f10197n) {
                            c0 f12 = l.h(stockDetailFragment).f();
                            if (f12 != null && f12.f2181h == R.id.stock_detail_fragment) {
                                t h10 = l.h(stockDetailFragment);
                                Bundle bundle2 = new Bundle();
                                bundle2.putParcelable("STOCK", stockDto2);
                                bundle2.putString("PORTFOLIO_ID", str);
                                Bundle arguments2 = stockDetailFragment.getArguments();
                                if (arguments2 != null) {
                                    parcelable = arguments2.getParcelable("PORTFOLIO");
                                } else {
                                    parcelable = null;
                                }
                                bundle2.putParcelable("PORTFOLIO", parcelable);
                                Unit unit = Unit.f23355a;
                                h10.l(R.id.action_stock_detail_fragment_to_stock_short_sell_order_fragment, bundle2, null);
                                return;
                            }
                            return;
                        }
                        if (stockSharedViewModel2 != null) {
                            stockSharedViewModel2.f10199p.postValue(stockDto2);
                            return;
                        } else {
                            Intrinsics.k("stockSharedViewModel");
                            throw null;
                        }
                    }
                    Intrinsics.k("stockSharedViewModel");
                    throw null;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24854a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
