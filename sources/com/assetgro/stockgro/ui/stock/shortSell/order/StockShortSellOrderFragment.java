package com.assetgro.stockgro.ui.stock.shortSell.order;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.navigation.c0;
import androidx.navigation.n;
import ba.zo;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderViewModel;
import com.assetgro.stockgro.widget.ChipView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import li.c;
import m.c2;
import nt.b;
import nt.f;
import okhttp3.HttpUrl;
import q6.l;
import qj.j;
import qu.i0;
import ui.a;
import xi.d;
import xi.g;
import xi.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/shortSell/order/StockShortSellOrderFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/shortSell/order/StockShortSellOrderViewModel;", "Lba/zo;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockShortSellOrderFragment extends m<StockShortSellOrderViewModel, zo> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f10422j = 0;

    /* renamed from: g, reason: collision with root package name */
    public StockSharedViewModel f10423g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayAdapter f10424h;

    /* renamed from: i, reason: collision with root package name */
    public SharedViewModel f10425i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_short_sell_order;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockShortSellOrderViewModel) r()).I.observe(this, new c(27, new d(this, 10)));
        ((StockShortSellOrderViewModel) r()).f10437y.observe(this, new c(27, new d(this, 14)));
        ((StockShortSellOrderViewModel) r()).f10438z.observe(this, new c(27, new d(this, 15)));
        ((StockShortSellOrderViewModel) r()).A.observe(this, new c(27, new d(this, 16)));
        ((StockShortSellOrderViewModel) r()).B.observe(this, new c(27, new d(this, 17)));
        ((StockShortSellOrderViewModel) r()).C.observe(this, new c(27, new d(this, 18)));
        ((StockShortSellOrderViewModel) r()).D.observe(this, new c(27, new d(this, 19)));
        ((StockShortSellOrderViewModel) r()).N.observe(this, new c(27, new d(this, 20)));
        ((StockShortSellOrderViewModel) r()).f9084g.observe(this, new c(27, new d(this, 21)));
        ((StockShortSellOrderViewModel) r()).L.observe(this, new c(27, new d(this, 0)));
        ((StockShortSellOrderViewModel) r()).M.observe(this, new c(27, new d(this, 1)));
        StockShortSellOrderViewModel stockShortSellOrderViewModel = (StockShortSellOrderViewModel) r();
        stockShortSellOrderViewModel.V.observe(this, new c(27, new d(this, 2)));
        StockShortSellOrderViewModel stockShortSellOrderViewModel2 = (StockShortSellOrderViewModel) r();
        stockShortSellOrderViewModel2.E.observe(this, new c(27, new d(this, 3)));
        StockShortSellOrderViewModel stockShortSellOrderViewModel3 = (StockShortSellOrderViewModel) r();
        stockShortSellOrderViewModel3.T.observe(this, new c(27, new d(this, 4)));
        StockShortSellOrderViewModel stockShortSellOrderViewModel4 = (StockShortSellOrderViewModel) r();
        stockShortSellOrderViewModel4.S.observe(this, new c(27, new d(this, 5)));
        StockShortSellOrderViewModel stockShortSellOrderViewModel5 = (StockShortSellOrderViewModel) r();
        stockShortSellOrderViewModel5.F.observe(this, new c(27, new d(this, 6)));
        ((StockShortSellOrderViewModel) r()).K.observe(this, new c(27, new d(this, 7)));
        ((StockShortSellOrderViewModel) r()).H.observe(this, new c(27, new d(this, 8)));
        ((StockShortSellOrderViewModel) r()).G.observe(this, new c(27, new d(this, 9)));
        StockShortSellOrderViewModel stockShortSellOrderViewModel6 = (StockShortSellOrderViewModel) r();
        stockShortSellOrderViewModel6.U.observe(this, new c(27, new d(this, 11)));
        StockShortSellOrderViewModel stockShortSellOrderViewModel7 = (StockShortSellOrderViewModel) r();
        stockShortSellOrderViewModel7.R.observe(this, new c(27, new d(this, 12)));
        ((StockShortSellOrderViewModel) r()).Q.observe(this, new c(27, new d(this, 13)));
    }

    @Override // gd.m
    public final void E(View view) {
        Portfolio portfolio;
        Intrinsics.checkNotNullParameter(view, "view");
        String stockName = requireArguments().getString("STOCK_NAME");
        if (stockName == null) {
            StockSharedViewModel stockSharedViewModel = this.f10423g;
            if (stockSharedViewModel != null) {
                stockName = stockSharedViewModel.f10202s;
            } else {
                Intrinsics.k("stockSharedViewModel");
                throw null;
            }
        }
        final int i10 = 0;
        final int i11 = 2;
        final int i12 = 1;
        final int i13 = 5;
        final int i14 = 4;
        final int i15 = 3;
        if (stockName != null) {
            StockShortSellOrderViewModel stockShortSellOrderViewModel = (StockShortSellOrderViewModel) r();
            Intrinsics.checkNotNullParameter(stockName, "stockId");
            at.m<BaseResponseDto<StockDetailDto>> stockDetails = stockShortSellOrderViewModel.f10426n.getStockDetails(stockName);
            a aVar = new a(19, h.f40279c);
            stockDetails.getClass();
            nt.h c10 = new b(new b(new b(new f(stockDetails, aVar, 1), new a(20, new g(stockShortSellOrderViewModel, 3)), 1), new a(21, new g(stockShortSellOrderViewModel, 4)), 2), new a(22, new g(stockShortSellOrderViewModel, 5)), 0).c(((e) stockShortSellOrderViewModel.f9079b).J());
            jt.d dVar = new jt.d(new a(23, new g(stockShortSellOrderViewModel, 6)), new a(24, new g(stockShortSellOrderViewModel, 7)));
            c10.a(dVar);
            Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
            stockShortSellOrderViewModel.f9080c.c(dVar);
            StockShortSellOrderViewModel stockShortSellOrderViewModel2 = (StockShortSellOrderViewModel) r();
            Intrinsics.checkNotNullParameter(stockName, "stockName");
            stockShortSellOrderViewModel2.f9084g.postValue(Boolean.TRUE);
            nt.h c11 = stockShortSellOrderViewModel2.f10426n.getStockOrderInfo(stockName).c(((e) stockShortSellOrderViewModel2.f9079b).J());
            jt.d dVar2 = new jt.d(new a(17, new g(stockShortSellOrderViewModel2, 9)), new a(18, new g(stockShortSellOrderViewModel2, 10)));
            c11.a(dVar2);
            stockShortSellOrderViewModel2.f9080c.c(dVar2);
        }
        ChipView chipView = ((zo) q()).f6870s.J;
        String string = getString(R.string.short_sell);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        chipView.setChipText(string);
        chipView.setChipType(j.f32017a);
        Parcelable parcelable = requireArguments().getParcelable("PORTFOLIO");
        if (parcelable instanceof Portfolio) {
            portfolio = (Portfolio) parcelable;
        } else {
            portfolio = null;
        }
        if (portfolio == null) {
            StockSharedViewModel stockSharedViewModel2 = this.f10423g;
            if (stockSharedViewModel2 != null) {
                portfolio = stockSharedViewModel2.f10201r;
            } else {
                Intrinsics.k("stockSharedViewModel");
                throw null;
            }
        }
        if (portfolio != null) {
            ((StockShortSellOrderViewModel) r()).P.setValue(portfolio);
            ((StockShortSellOrderViewModel) r()).f10428p = portfolio;
        }
        ((zo) q()).f6870s.L.setOnInputViewActionDone(new eb.f(this, 6));
        ((zo) q()).f6870s.L.setOnInputViewAction(new xi.e(this, 3));
        ((zo) q()).f6870s.F.m(new d(this, 23));
        ((zo) q()).f6870s.N.setOnInputViewAction(new xi.e(this, 4));
        ((zo) q()).f6870s.M.o();
        ((zo) q()).f6870s.M.m(new d(this, 24));
        ((zo) q()).f6870s.O.setOnInputViewAction(new xi.e(this, 5));
        ((zo) q()).f6870s.N.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: xi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockShortSellOrderFragment f40262b;

            {
                this.f40262b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i10;
                StockShortSellOrderFragment this$0 = this.f40262b;
                switch (i16) {
                    case 0:
                        int i17 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10429q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i18 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10431s = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10430r = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).f10438z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10432t = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10434v = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10433u = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((zo) q()).f6870s.M.getInputField().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: xi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockShortSellOrderFragment f40262b;

            {
                this.f40262b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i12;
                StockShortSellOrderFragment this$0 = this.f40262b;
                switch (i16) {
                    case 0:
                        int i17 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10429q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i18 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10431s = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10430r = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).f10438z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10432t = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10434v = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10433u = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((zo) q()).f6870s.O.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: xi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockShortSellOrderFragment f40262b;

            {
                this.f40262b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i11;
                StockShortSellOrderFragment this$0 = this.f40262b;
                switch (i16) {
                    case 0:
                        int i17 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10429q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i18 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10431s = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10430r = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).f10438z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10432t = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10434v = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10433u = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((zo) q()).f6870s.f4807t.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: xi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockShortSellOrderFragment f40262b;

            {
                this.f40262b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i15;
                StockShortSellOrderFragment this$0 = this.f40262b;
                switch (i16) {
                    case 0:
                        int i17 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10429q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i18 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10431s = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10430r = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).f10438z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10432t = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10434v = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10433u = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((zo) q()).f6870s.f4806s.getInputField().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: xi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockShortSellOrderFragment f40262b;

            {
                this.f40262b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i14;
                StockShortSellOrderFragment this$0 = this.f40262b;
                switch (i16) {
                    case 0:
                        int i17 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10429q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i18 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10431s = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10430r = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).f10438z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10432t = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10434v = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10433u = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((zo) q()).f6870s.f4808u.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: xi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockShortSellOrderFragment f40262b;

            {
                this.f40262b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i13;
                StockShortSellOrderFragment this$0 = this.f40262b;
                switch (i16) {
                    case 0:
                        int i17 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10429q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i18 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10431s = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10430r = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).f10438z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10432t = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10434v = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = StockShortSellOrderFragment.f10422j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockShortSellOrderViewModel) this$0.r()).f10433u = false;
                            return;
                        } else {
                            ((StockShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((zo) q()).f6870s.f4807t.setOnInputViewAction(new xi.e(this, 0));
        ((zo) q()).f6870s.f4806s.o();
        ((zo) q()).f6870s.f4806s.m(new d(this, 22));
        ((zo) q()).f6870s.f4808u.setOnInputViewAction(new xi.e(this, 1));
        zo zoVar = (zo) q();
        zoVar.f6872u.setOnClickListener(new bb.a(27, this, stockName));
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.layout_spinner_selected, new ArrayList());
        Intrinsics.checkNotNullParameter(arrayAdapter, "<set-?>");
        this.f10424h = arrayAdapter;
        arrayAdapter.setDropDownViewResource(R.layout.layout_custom_spinner);
        Spinner spinner = ((zo) q()).f6870s.E;
        ArrayAdapter arrayAdapter2 = this.f10424h;
        if (arrayAdapter2 != null) {
            spinner.setAdapter((SpinnerAdapter) arrayAdapter2);
            ((zo) q()).f6870s.E.setOnItemSelectedListener(new c2(this, 6));
            ((zo) q()).f6870s.f4813z.setOnInputViewAction(new xi.e(this, 2));
            zo zoVar2 = (zo) q();
            zoVar2.f6874w.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: xi.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StockShortSellOrderFragment f40264b;

                {
                    this.f40264b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Integer num;
                    c0 c0Var;
                    int i16 = i11;
                    StockShortSellOrderFragment this$0 = this.f40264b;
                    switch (i16) {
                        case 0:
                            int i17 = StockShortSellOrderFragment.f10422j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ((zo) this$0.q()).f6870s.H.performClick();
                            return;
                        case 1:
                            int i18 = StockShortSellOrderFragment.f10422j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ((zo) this$0.q()).f6870s.f4809v.performClick();
                            return;
                        default:
                            int i19 = StockShortSellOrderFragment.f10422j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            n j10 = l.h(this$0).j();
                            if (j10 != null && (c0Var = j10.f2258b) != null) {
                                num = Integer.valueOf(c0Var.f2181h);
                            } else {
                                num = null;
                            }
                            if (num == null || num.intValue() != R.id.stock_detail_fragment) {
                                this$0.requireActivity().finish();
                                return;
                            } else {
                                l.h(this$0).p();
                                return;
                            }
                    }
                }
            });
            StockSharedViewModel stockSharedViewModel3 = this.f10423g;
            if (stockSharedViewModel3 != null) {
                boolean z10 = stockSharedViewModel3.f10198o;
                if (z10) {
                    ((zo) q()).f6870s.E.setEnabled(false);
                } else if (!z10) {
                    ((zo) q()).f6870s.E.setEnabled(true);
                }
                ((zo) q()).f6870s.H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: xi.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StockShortSellOrderFragment f40266b;

                    {
                        this.f40266b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        int i16 = i10;
                        StockShortSellOrderFragment this$0 = this.f40266b;
                        switch (i16) {
                            case 0:
                                int i17 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((zo) this$0.q()).f6870s.f4809v.setChecked(!z11);
                                if (z11) {
                                    e0 e0Var = ((StockShortSellOrderViewModel) this$0.r()).f10438z;
                                    Boolean bool = Boolean.TRUE;
                                    e0Var.postValue(bool);
                                    ((zo) this$0.q()).f6870s.O.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    ((StockShortSellOrderViewModel) this$0.r()).C.postValue(bool);
                                    ((zo) this$0.q()).f6870s.f4808u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    LinearLayout bracketOrderLayout = ((zo) this$0.q()).f6870s.f4811x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout, "bracketOrderLayout");
                                    this$0.t(bracketOrderLayout);
                                    return;
                                }
                                return;
                            default:
                                int i18 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((zo) this$0.q()).f6870s.H.setChecked(!z11);
                                if (z11) {
                                    LinearLayout bracketOrderLayout2 = ((zo) this$0.q()).f6870s.f4811x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout2, "bracketOrderLayout");
                                    this$0.F(bracketOrderLayout2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((zo) q()).f6870s.f4809v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: xi.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StockShortSellOrderFragment f40266b;

                    {
                        this.f40266b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        int i16 = i12;
                        StockShortSellOrderFragment this$0 = this.f40266b;
                        switch (i16) {
                            case 0:
                                int i17 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((zo) this$0.q()).f6870s.f4809v.setChecked(!z11);
                                if (z11) {
                                    e0 e0Var = ((StockShortSellOrderViewModel) this$0.r()).f10438z;
                                    Boolean bool = Boolean.TRUE;
                                    e0Var.postValue(bool);
                                    ((zo) this$0.q()).f6870s.O.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    ((StockShortSellOrderViewModel) this$0.r()).C.postValue(bool);
                                    ((zo) this$0.q()).f6870s.f4808u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    LinearLayout bracketOrderLayout = ((zo) this$0.q()).f6870s.f4811x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout, "bracketOrderLayout");
                                    this$0.t(bracketOrderLayout);
                                    return;
                                }
                                return;
                            default:
                                int i18 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((zo) this$0.q()).f6870s.H.setChecked(!z11);
                                if (z11) {
                                    LinearLayout bracketOrderLayout2 = ((zo) this$0.q()).f6870s.f4811x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout2, "bracketOrderLayout");
                                    this$0.F(bracketOrderLayout2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((zo) q()).f6870s.H.setChecked(true);
                ((zo) q()).f6870s.f4809v.setChecked(false);
                ((zo) q()).f6870s.I.setOnClickListener(new View.OnClickListener(this) { // from class: xi.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StockShortSellOrderFragment f40264b;

                    {
                        this.f40264b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Integer num;
                        c0 c0Var;
                        int i16 = i10;
                        StockShortSellOrderFragment this$0 = this.f40264b;
                        switch (i16) {
                            case 0:
                                int i17 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((zo) this$0.q()).f6870s.H.performClick();
                                return;
                            case 1:
                                int i18 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((zo) this$0.q()).f6870s.f4809v.performClick();
                                return;
                            default:
                                int i19 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                n j10 = l.h(this$0).j();
                                if (j10 != null && (c0Var = j10.f2258b) != null) {
                                    num = Integer.valueOf(c0Var.f2181h);
                                } else {
                                    num = null;
                                }
                                if (num == null || num.intValue() != R.id.stock_detail_fragment) {
                                    this$0.requireActivity().finish();
                                    return;
                                } else {
                                    l.h(this$0).p();
                                    return;
                                }
                        }
                    }
                });
                ((zo) q()).f6870s.f4810w.setOnClickListener(new View.OnClickListener(this) { // from class: xi.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StockShortSellOrderFragment f40264b;

                    {
                        this.f40264b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Integer num;
                        c0 c0Var;
                        int i16 = i12;
                        StockShortSellOrderFragment this$0 = this.f40264b;
                        switch (i16) {
                            case 0:
                                int i17 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((zo) this$0.q()).f6870s.H.performClick();
                                return;
                            case 1:
                                int i18 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((zo) this$0.q()).f6870s.f4809v.performClick();
                                return;
                            default:
                                int i19 = StockShortSellOrderFragment.f10422j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                n j10 = l.h(this$0).j();
                                if (j10 != null && (c0Var = j10.f2258b) != null) {
                                    num = Integer.valueOf(c0Var.f2181h);
                                } else {
                                    num = null;
                                }
                                if (num == null || num.intValue() != R.id.stock_detail_fragment) {
                                    this$0.requireActivity().finish();
                                    return;
                                } else {
                                    l.h(this$0).p();
                                    return;
                                }
                        }
                    }
                });
                return;
            }
            Intrinsics.k("stockSharedViewModel");
            throw null;
        }
        Intrinsics.k("spinnerArrayAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityCreated(Bundle bundle) {
        SharedViewModel sharedViewModel;
        super.onActivityCreated(bundle);
        j0 activity = getActivity();
        if (activity != null && (sharedViewModel = (SharedViewModel) new g1(activity).a(SharedViewModel.class)) != null) {
            this.f10425i = sharedViewModel;
            return;
        }
        throw new Exception("Invalid Activity");
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        yk.g.i(stockRepository);
        Object orderValidator = new Object();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(orderValidator, "orderValidator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockShortSellOrderViewModel.class), new z2.e(k10, c10, stockRepository, orderValidator, userRepository, 7));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockShortSellOrderViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockShortSellOrderViewModel.class, "<this>", StockShortSellOrderViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockShortSellOrderViewModel stockShortSellOrderViewModel = (StockShortSellOrderViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockShortSellOrderViewModel);
            this.f17284b = stockShortSellOrderViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f10423g = fragmentComponent.l();
            yk.g.i(bVar.d());
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
