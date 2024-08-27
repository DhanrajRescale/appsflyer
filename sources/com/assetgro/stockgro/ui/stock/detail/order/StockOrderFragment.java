package com.assetgro.stockgro.ui.stock.detail.order;

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
import ba.jo;
import bb.a;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderFragment;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderViewModel;
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
import mi.d;
import mi.i;
import mi.j;
import mi.o;
import nt.b;
import nt.f;
import nt.h;
import okhttp3.HttpUrl;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/order/StockOrderFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/detail/order/StockOrderViewModel;", "Lba/jo;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockOrderFragment extends m<StockOrderViewModel, jo> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f10219j = 0;

    /* renamed from: g, reason: collision with root package name */
    public StockSharedViewModel f10220g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayAdapter f10221h;

    /* renamed from: i, reason: collision with root package name */
    public SharedViewModel f10222i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_order;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockOrderViewModel) r()).I.observe(this, new c(2, new i(this, 10)));
        ((StockOrderViewModel) r()).f10243y.observe(this, new c(2, new i(this, 14)));
        ((StockOrderViewModel) r()).f10244z.observe(this, new c(2, new i(this, 15)));
        ((StockOrderViewModel) r()).A.observe(this, new c(2, new i(this, 16)));
        ((StockOrderViewModel) r()).B.observe(this, new c(2, new i(this, 17)));
        ((StockOrderViewModel) r()).C.observe(this, new c(2, new i(this, 18)));
        ((StockOrderViewModel) r()).D.observe(this, new c(2, new i(this, 19)));
        ((StockOrderViewModel) r()).N.observe(this, new c(2, new i(this, 20)));
        ((StockOrderViewModel) r()).f9084g.observe(this, new c(2, new i(this, 21)));
        ((StockOrderViewModel) r()).L.observe(this, new c(2, new i(this, 0)));
        ((StockOrderViewModel) r()).M.observe(this, new c(2, new i(this, 1)));
        StockOrderViewModel stockOrderViewModel = (StockOrderViewModel) r();
        stockOrderViewModel.V.observe(this, new c(2, new i(this, 2)));
        StockOrderViewModel stockOrderViewModel2 = (StockOrderViewModel) r();
        stockOrderViewModel2.E.observe(this, new c(2, new i(this, 3)));
        StockOrderViewModel stockOrderViewModel3 = (StockOrderViewModel) r();
        stockOrderViewModel3.T.observe(this, new c(2, new i(this, 4)));
        StockOrderViewModel stockOrderViewModel4 = (StockOrderViewModel) r();
        stockOrderViewModel4.S.observe(this, new c(2, new i(this, 5)));
        StockOrderViewModel stockOrderViewModel5 = (StockOrderViewModel) r();
        stockOrderViewModel5.F.observe(this, new c(2, new i(this, 6)));
        ((StockOrderViewModel) r()).K.observe(this, new c(2, new i(this, 7)));
        ((StockOrderViewModel) r()).H.observe(this, new c(2, new i(this, 8)));
        ((StockOrderViewModel) r()).G.observe(this, new c(2, new i(this, 9)));
        StockOrderViewModel stockOrderViewModel6 = (StockOrderViewModel) r();
        stockOrderViewModel6.U.observe(this, new c(2, new i(this, 11)));
        StockOrderViewModel stockOrderViewModel7 = (StockOrderViewModel) r();
        stockOrderViewModel7.R.observe(this, new c(2, new i(this, 12)));
        ((StockOrderViewModel) r()).Q.observe(this, new c(2, new i(this, 13)));
    }

    @Override // gd.m
    public final void E(View view) {
        Portfolio portfolio;
        Intrinsics.checkNotNullParameter(view, "view");
        String stockName = requireArguments().getString("STOCK_NAME");
        if (stockName == null) {
            StockSharedViewModel stockSharedViewModel = this.f10220g;
            if (stockSharedViewModel != null) {
                stockName = stockSharedViewModel.f10202s;
            } else {
                Intrinsics.k("stockSharedViewModel");
                throw null;
            }
        }
        final int i10 = 0;
        final int i11 = 5;
        final int i12 = 4;
        final int i13 = 3;
        if (stockName != null) {
            StockOrderViewModel stockOrderViewModel = (StockOrderViewModel) r();
            Intrinsics.checkNotNullParameter(stockName, "stockId");
            at.m<BaseResponseDto<StockDetailDto>> stockDetails = stockOrderViewModel.f10232n.getStockDetails(stockName);
            hi.c cVar = new hi.c(23, d.f27778p);
            stockDetails.getClass();
            h c10 = new b(new b(new b(new f(stockDetails, cVar, 1), new hi.c(24, new o(stockOrderViewModel, 3)), 1), new hi.c(25, new o(stockOrderViewModel, 4)), 2), new hi.c(26, new o(stockOrderViewModel, 5)), 0).c(((e) stockOrderViewModel.f9079b).J());
            jt.d dVar = new jt.d(new hi.c(27, new o(stockOrderViewModel, 6)), new hi.c(28, new o(stockOrderViewModel, 7)));
            c10.a(dVar);
            Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
            stockOrderViewModel.f9080c.c(dVar);
            StockOrderViewModel stockOrderViewModel2 = (StockOrderViewModel) r();
            Intrinsics.checkNotNullParameter(stockName, "stockName");
            stockOrderViewModel2.f9084g.postValue(Boolean.TRUE);
            h c11 = stockOrderViewModel2.f10232n.getStockOrderInfo(stockName).c(((e) stockOrderViewModel2.f9079b).J());
            jt.d dVar2 = new jt.d(new hi.c(21, new o(stockOrderViewModel2, 9)), new hi.c(22, new o(stockOrderViewModel2, 10)));
            c11.a(dVar2);
            stockOrderViewModel2.f9080c.c(dVar2);
        }
        Parcelable parcelable = requireArguments().getParcelable("PORTFOLIO");
        if (parcelable instanceof Portfolio) {
            portfolio = (Portfolio) parcelable;
        } else {
            portfolio = null;
        }
        if (portfolio == null) {
            StockSharedViewModel stockSharedViewModel2 = this.f10220g;
            if (stockSharedViewModel2 != null) {
                portfolio = stockSharedViewModel2.f10201r;
            } else {
                Intrinsics.k("stockSharedViewModel");
                throw null;
            }
        }
        if (portfolio != null) {
            ((StockOrderViewModel) r()).P.setValue(portfolio);
            ((StockOrderViewModel) r()).f10234p = portfolio;
        }
        ((jo) q()).f5160s.K.setOnInputViewActionDone(new eb.f(this, 3));
        ((jo) q()).f5160s.K.setOnInputViewAction(new j(this, 3));
        ((jo) q()).f5160s.F.m(new i(this, 23));
        ((jo) q()).f5160s.M.setOnInputViewAction(new j(this, 4));
        ((jo) q()).f5160s.L.o();
        ((jo) q()).f5160s.L.m(new i(this, 24));
        ((jo) q()).f5160s.N.setOnInputViewAction(new j(this, 5));
        ((jo) q()).f5160s.M.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: mi.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderFragment f27788b;

            {
                this.f27788b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i14 = i10;
                StockOrderFragment this$0 = this.f27788b;
                switch (i14) {
                    case 0:
                        int i15 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10235q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i16 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10237s = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i17 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10236r = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).f10244z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i18 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10238t = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i19 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10240v = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i20 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10239u = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        final int i14 = 1;
        ((jo) q()).f5160s.L.getInputField().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: mi.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderFragment f27788b;

            {
                this.f27788b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i142 = i14;
                StockOrderFragment this$0 = this.f27788b;
                switch (i142) {
                    case 0:
                        int i15 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10235q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i16 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10237s = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i17 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10236r = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).f10244z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i18 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10238t = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i19 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10240v = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i20 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10239u = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        final int i15 = 2;
        ((jo) q()).f5160s.N.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: mi.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderFragment f27788b;

            {
                this.f27788b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i142 = i15;
                StockOrderFragment this$0 = this.f27788b;
                switch (i142) {
                    case 0:
                        int i152 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10235q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i16 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10237s = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i17 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10236r = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).f10244z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i18 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10238t = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i19 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10240v = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i20 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10239u = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((jo) q()).f5160s.f4191t.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: mi.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderFragment f27788b;

            {
                this.f27788b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i142 = i13;
                StockOrderFragment this$0 = this.f27788b;
                switch (i142) {
                    case 0:
                        int i152 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10235q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i16 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10237s = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i17 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10236r = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).f10244z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i18 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10238t = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i19 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10240v = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i20 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10239u = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((jo) q()).f5160s.f4190s.getInputField().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: mi.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderFragment f27788b;

            {
                this.f27788b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i142 = i12;
                StockOrderFragment this$0 = this.f27788b;
                switch (i142) {
                    case 0:
                        int i152 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10235q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i16 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10237s = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i17 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10236r = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).f10244z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i18 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10238t = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i19 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10240v = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i20 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10239u = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((jo) q()).f5160s.f4192u.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: mi.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderFragment f27788b;

            {
                this.f27788b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i142 = i11;
                StockOrderFragment this$0 = this.f27788b;
                switch (i142) {
                    case 0:
                        int i152 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10235q = false;
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        int i16 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10237s = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i17 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10236r = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).f10244z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i18 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10238t = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i19 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10240v = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i20 = StockOrderFragment.f10219j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((StockOrderViewModel) this$0.r()).f10239u = false;
                            return;
                        } else {
                            ((StockOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((jo) q()).f5160s.f4191t.setOnInputViewAction(new j(this, 0));
        ((jo) q()).f5160s.f4190s.o();
        ((jo) q()).f5160s.f4190s.m(new i(this, 22));
        ((jo) q()).f5160s.f4192u.setOnInputViewAction(new j(this, 1));
        jo joVar = (jo) q();
        joVar.f5162u.setOnClickListener(new a(22, this, stockName));
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.layout_spinner_selected, new ArrayList());
        this.f10221h = arrayAdapter;
        arrayAdapter.setDropDownViewResource(R.layout.layout_custom_spinner);
        Spinner spinner = ((jo) q()).f5160s.E;
        ArrayAdapter arrayAdapter2 = this.f10221h;
        if (arrayAdapter2 != null) {
            spinner.setAdapter((SpinnerAdapter) arrayAdapter2);
            ((jo) q()).f5160s.E.setOnItemSelectedListener(new c2(this, 4));
            final int i16 = 2;
            ((jo) q()).f5160s.f4197z.setOnInputViewAction(new j(this, 2));
            jo joVar2 = (jo) q();
            joVar2.f5164w.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: mi.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StockOrderFragment f27790b;

                {
                    this.f27790b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Integer num;
                    c0 c0Var;
                    int i17 = i16;
                    StockOrderFragment this$0 = this.f27790b;
                    switch (i17) {
                        case 0:
                            int i18 = StockOrderFragment.f10219j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ((jo) this$0.q()).f5160s.H.performClick();
                            return;
                        case 1:
                            int i19 = StockOrderFragment.f10219j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ((jo) this$0.q()).f5160s.f4193v.performClick();
                            return;
                        default:
                            int i20 = StockOrderFragment.f10219j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            androidx.navigation.n j10 = q6.l.h(this$0).j();
                            if (j10 != null && (c0Var = j10.f2258b) != null) {
                                num = Integer.valueOf(c0Var.f2181h);
                            } else {
                                num = null;
                            }
                            if (num == null || num.intValue() != R.id.stock_detail_fragment) {
                                this$0.requireActivity().finish();
                                return;
                            } else {
                                q6.l.h(this$0).p();
                                return;
                            }
                    }
                }
            });
            StockSharedViewModel stockSharedViewModel3 = this.f10220g;
            if (stockSharedViewModel3 != null) {
                boolean z10 = stockSharedViewModel3.f10198o;
                if (z10) {
                    ((jo) q()).f5160s.E.setEnabled(false);
                } else if (!z10) {
                    ((jo) q()).f5160s.E.setEnabled(true);
                }
                ((jo) q()).f5160s.H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: mi.h

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StockOrderFragment f27792b;

                    {
                        this.f27792b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        int i17 = i10;
                        StockOrderFragment this$0 = this.f27792b;
                        switch (i17) {
                            case 0:
                                int i18 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((jo) this$0.q()).f5160s.f4193v.setChecked(!z11);
                                if (z11) {
                                    e0 e0Var = ((StockOrderViewModel) this$0.r()).f10244z;
                                    Boolean bool = Boolean.TRUE;
                                    e0Var.postValue(bool);
                                    ((jo) this$0.q()).f5160s.N.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    ((StockOrderViewModel) this$0.r()).C.postValue(bool);
                                    ((jo) this$0.q()).f5160s.f4192u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    LinearLayout bracketOrderLayout = ((jo) this$0.q()).f5160s.f4195x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout, "bracketOrderLayout");
                                    this$0.t(bracketOrderLayout);
                                    return;
                                }
                                return;
                            default:
                                int i19 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((jo) this$0.q()).f5160s.H.setChecked(!z11);
                                if (z11) {
                                    LinearLayout bracketOrderLayout2 = ((jo) this$0.q()).f5160s.f4195x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout2, "bracketOrderLayout");
                                    this$0.F(bracketOrderLayout2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                final int i17 = 1;
                ((jo) q()).f5160s.f4193v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: mi.h

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StockOrderFragment f27792b;

                    {
                        this.f27792b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        int i172 = i17;
                        StockOrderFragment this$0 = this.f27792b;
                        switch (i172) {
                            case 0:
                                int i18 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((jo) this$0.q()).f5160s.f4193v.setChecked(!z11);
                                if (z11) {
                                    e0 e0Var = ((StockOrderViewModel) this$0.r()).f10244z;
                                    Boolean bool = Boolean.TRUE;
                                    e0Var.postValue(bool);
                                    ((jo) this$0.q()).f5160s.N.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    ((StockOrderViewModel) this$0.r()).C.postValue(bool);
                                    ((jo) this$0.q()).f5160s.f4192u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    LinearLayout bracketOrderLayout = ((jo) this$0.q()).f5160s.f4195x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout, "bracketOrderLayout");
                                    this$0.t(bracketOrderLayout);
                                    return;
                                }
                                return;
                            default:
                                int i19 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((jo) this$0.q()).f5160s.H.setChecked(!z11);
                                if (z11) {
                                    LinearLayout bracketOrderLayout2 = ((jo) this$0.q()).f5160s.f4195x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout2, "bracketOrderLayout");
                                    this$0.F(bracketOrderLayout2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((jo) q()).f5160s.H.setChecked(true);
                ((jo) q()).f5160s.f4193v.setChecked(false);
                ((jo) q()).f5160s.I.setOnClickListener(new View.OnClickListener(this) { // from class: mi.g

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StockOrderFragment f27790b;

                    {
                        this.f27790b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Integer num;
                        c0 c0Var;
                        int i172 = i10;
                        StockOrderFragment this$0 = this.f27790b;
                        switch (i172) {
                            case 0:
                                int i18 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((jo) this$0.q()).f5160s.H.performClick();
                                return;
                            case 1:
                                int i19 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((jo) this$0.q()).f5160s.f4193v.performClick();
                                return;
                            default:
                                int i20 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                androidx.navigation.n j10 = q6.l.h(this$0).j();
                                if (j10 != null && (c0Var = j10.f2258b) != null) {
                                    num = Integer.valueOf(c0Var.f2181h);
                                } else {
                                    num = null;
                                }
                                if (num == null || num.intValue() != R.id.stock_detail_fragment) {
                                    this$0.requireActivity().finish();
                                    return;
                                } else {
                                    q6.l.h(this$0).p();
                                    return;
                                }
                        }
                    }
                });
                final int i18 = 1;
                ((jo) q()).f5160s.f4194w.setOnClickListener(new View.OnClickListener(this) { // from class: mi.g

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StockOrderFragment f27790b;

                    {
                        this.f27790b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Integer num;
                        c0 c0Var;
                        int i172 = i18;
                        StockOrderFragment this$0 = this.f27790b;
                        switch (i172) {
                            case 0:
                                int i182 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((jo) this$0.q()).f5160s.H.performClick();
                                return;
                            case 1:
                                int i19 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((jo) this$0.q()).f5160s.f4193v.performClick();
                                return;
                            default:
                                int i20 = StockOrderFragment.f10219j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                androidx.navigation.n j10 = q6.l.h(this$0).j();
                                if (j10 != null && (c0Var = j10.f2258b) != null) {
                                    num = Integer.valueOf(c0Var.f2181h);
                                } else {
                                    num = null;
                                }
                                if (num == null || num.intValue() != R.id.stock_detail_fragment) {
                                    this$0.requireActivity().finish();
                                    return;
                                } else {
                                    q6.l.h(this$0).p();
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
            this.f10222i = sharedViewModel;
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
        g.i(stockRepository);
        Object orderValidator = new Object();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(orderValidator, "orderValidator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockOrderViewModel.class), new z2.e(k10, c10, stockRepository, orderValidator, userRepository, 5));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockOrderViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockOrderViewModel.class, "<this>", StockOrderViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockOrderViewModel stockOrderViewModel = (StockOrderViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockOrderViewModel);
            this.f17284b = stockOrderViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f10220g = fragmentComponent.l();
            g.i(bVar.d());
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
