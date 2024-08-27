package com.assetgro.stockgro.ui.stock.modify.short_sell;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.activity.x;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import ba.go;
import bb.a;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderViewModel;
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
import okhttp3.HttpUrl;
import qj.j;
import qu.i0;
import si.f;
import ti.d;
import ti.g;
import ti.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/short_sell/ModifyShortSellOrderFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/short_sell/ModifyShortSellOrderViewModel;", "Lba/go;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyShortSellOrderFragment extends m<ModifyShortSellOrderViewModel, go> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f10352j = 0;

    /* renamed from: g, reason: collision with root package name */
    public StockSharedViewModel f10353g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayAdapter f10354h;

    /* renamed from: i, reason: collision with root package name */
    public SharedViewModel f10355i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_modify_short_sell_order;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((ModifyShortSellOrderViewModel) r()).G.observe(this, new c(19, new d(this, 10)));
        ((ModifyShortSellOrderViewModel) r()).f10368x.observe(this, new c(19, new d(this, 16)));
        ((ModifyShortSellOrderViewModel) r()).f10369y.observe(this, new c(19, new d(this, 17)));
        ((ModifyShortSellOrderViewModel) r()).f10370z.observe(this, new c(19, new d(this, 18)));
        ((ModifyShortSellOrderViewModel) r()).A.observe(this, new c(19, new d(this, 19)));
        ((ModifyShortSellOrderViewModel) r()).B.observe(this, new c(19, new d(this, 20)));
        ((ModifyShortSellOrderViewModel) r()).C.observe(this, new c(19, new d(this, 21)));
        ((ModifyShortSellOrderViewModel) r()).U.observe(this, new c(19, new d(this, 22)));
        ((ModifyShortSellOrderViewModel) r()).f9084g.observe(this, new c(19, new d(this, 23)));
        ((ModifyShortSellOrderViewModel) r()).S.observe(this, new c(19, new d(this, 0)));
        ((ModifyShortSellOrderViewModel) r()).T.observe(this, new c(19, new d(this, 1)));
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel = (ModifyShortSellOrderViewModel) r();
        modifyShortSellOrderViewModel.f10357b0.observe(this, new c(19, new d(this, 2)));
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel2 = (ModifyShortSellOrderViewModel) r();
        modifyShortSellOrderViewModel2.H.observe(this, new c(19, new d(this, 3)));
        ((ModifyShortSellOrderViewModel) r()).N.observe(this, new c(19, new d(this, 4)));
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel3 = (ModifyShortSellOrderViewModel) r();
        modifyShortSellOrderViewModel3.Z.observe(this, new c(19, new d(this, 5)));
        ((ModifyShortSellOrderViewModel) r()).L.observe(this, new c(19, new d(this, 6)));
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel4 = (ModifyShortSellOrderViewModel) r();
        modifyShortSellOrderViewModel4.I.observe(this, new c(19, new d(this, 7)));
        ((ModifyShortSellOrderViewModel) r()).R.observe(this, new c(19, new d(this, 8)));
        ((ModifyShortSellOrderViewModel) r()).O.observe(this, new c(19, new d(this, 9)));
        ((ModifyShortSellOrderViewModel) r()).P.observe(this, new c(19, new d(this, 11)));
        ((ModifyShortSellOrderViewModel) r()).K.observe(this, new c(19, new d(this, 12)));
        ((ModifyShortSellOrderViewModel) r()).J.observe(this, new c(19, new d(this, 13)));
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel5 = (ModifyShortSellOrderViewModel) r();
        modifyShortSellOrderViewModel5.f10356a0.observe(this, new c(19, new d(this, 14)));
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel6 = (ModifyShortSellOrderViewModel) r();
        modifyShortSellOrderViewModel6.Y.observe(this, new c(19, new d(this, 15)));
    }

    @Override // gd.m
    public final void E(View view) {
        Portfolio portfolio;
        Intrinsics.checkNotNullParameter(view, "view");
        String stockId = requireArguments().getString("STOCK_NAME");
        if (stockId == null && (stockId = H().f10202s) == null) {
            throw new IllegalStateException("StockID not supplied as an argument".toString());
        }
        Parcelable parcelable = requireArguments().getParcelable("PORTFOLIO");
        if (parcelable instanceof Portfolio) {
            portfolio = (Portfolio) parcelable;
        } else {
            portfolio = null;
        }
        if (portfolio == null) {
            portfolio = H().f10201r;
        }
        if (portfolio != null) {
            ((ModifyShortSellOrderViewModel) r()).W.setValue(portfolio);
            ((ModifyShortSellOrderViewModel) r()).f10360p = portfolio;
        }
        ChipView chipView = ((go) q()).f4834s.F;
        String string = getString(R.string.short_sell);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        chipView.setChipText(string);
        chipView.setChipType(j.f32017a);
        String type = requireArguments().getString("ORDER_TYPE");
        if (type == null && (type = H().f10204u) == null) {
            throw new IllegalStateException("OrderType not supplied as an argument".toString());
        }
        String orderId = requireArguments().getString("ORDERID");
        if (orderId == null && (orderId = H().f10203t) == null) {
            throw new IllegalStateException("OrderID not supplied as an argument".toString());
        }
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel = (ModifyShortSellOrderViewModel) r();
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        at.m<BaseResponseDto<StockDetailDto>> stockDetails = modifyShortSellOrderViewModel.f10358n.getStockDetails(stockId);
        f fVar = new f(20, h.f36107c);
        stockDetails.getClass();
        final int i10 = 1;
        nt.h c10 = new b(new b(new b(new nt.f(stockDetails, fVar, 1), new f(21, new g(modifyShortSellOrderViewModel, 8)), 1), new f(22, new g(modifyShortSellOrderViewModel, 9)), 2), new f(23, new g(modifyShortSellOrderViewModel, 10)), 0).c(((e) modifyShortSellOrderViewModel.f9079b).J());
        jt.d dVar = new jt.d(new f(24, new g(modifyShortSellOrderViewModel, 11)), new f(25, new g(modifyShortSellOrderViewModel, 12)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        modifyShortSellOrderViewModel.f9080c.c(dVar);
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel2 = (ModifyShortSellOrderViewModel) r();
        Portfolio portfolio2 = ((ModifyShortSellOrderViewModel) r()).f10360p;
        Intrinsics.c(portfolio2);
        String portfolioId = portfolio2.getPortfolioId();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        modifyShortSellOrderViewModel2.f9084g.postValue(Boolean.TRUE);
        nt.h c11 = modifyShortSellOrderViewModel2.f10358n.getStockOrderInfoForPortfolio(portfolioId, stockId).c(((e) modifyShortSellOrderViewModel2.f9079b).J());
        jt.d dVar2 = new jt.d(new f(26, new g(modifyShortSellOrderViewModel2, 14)), new f(27, new g(modifyShortSellOrderViewModel2, 15)));
        c11.a(dVar2);
        modifyShortSellOrderViewModel2.f9080c.c(dVar2);
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel3 = (ModifyShortSellOrderViewModel) r();
        Portfolio portfolio3 = ((ModifyShortSellOrderViewModel) r()).f10360p;
        Intrinsics.c(portfolio3);
        String portfolioId2 = portfolio3.getPortfolioId();
        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        at.m<BaseResponseDto<StockModifyInfoDto>> orderDetails = modifyShortSellOrderViewModel3.f10358n.getOrderDetails(portfolioId2, stockId, type, orderId);
        f fVar2 = new f(14, h.f36106b);
        orderDetails.getClass();
        nt.f fVar3 = new nt.f(orderDetails, fVar2, 1);
        final int i11 = 3;
        final int i12 = 4;
        final int i13 = 5;
        nt.h c12 = new b(new b(new b(fVar3, new f(15, new g(modifyShortSellOrderViewModel3, 3)), 1), new f(16, new g(modifyShortSellOrderViewModel3, 4)), 2), new f(17, new g(modifyShortSellOrderViewModel3, 5)), 0).c(((e) modifyShortSellOrderViewModel3.f9079b).J());
        jt.d dVar3 = new jt.d(new f(18, new g(modifyShortSellOrderViewModel3, 6)), new f(19, new g(modifyShortSellOrderViewModel3, 7)));
        c12.a(dVar3);
        Intrinsics.checkNotNullExpressionValue(dVar3, "subscribe(...)");
        modifyShortSellOrderViewModel3.f9080c.c(dVar3);
        ((go) q()).f4834s.H.setOnInputViewActionDone(new eb.f(this, 5));
        ((go) q()).f4834s.H.setOnInputViewAction(new ti.e(this, 3));
        ((go) q()).f4834s.C.m(new d(this, 25));
        ((go) q()).f4834s.J.setOnInputViewAction(new ti.e(this, 4));
        ((go) q()).f4834s.I.o();
        ((go) q()).f4834s.I.m(new d(this, 26));
        ((go) q()).f4834s.K.setOnInputViewAction(new ti.e(this, 5));
        final int i14 = 0;
        ((go) q()).f4834s.J.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ti.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyShortSellOrderFragment f36090b;

            {
                this.f36090b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i15 = i14;
                ModifyShortSellOrderFragment this$0 = this.f36090b;
                switch (i15) {
                    case 0:
                        int i16 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10361q = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10368x.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i17 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10363s = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10370z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i18 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10362r = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10369y.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i19 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10364t = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i20 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10366v = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i21 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10365u = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((go) q()).f4834s.I.getInputField().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ti.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyShortSellOrderFragment f36090b;

            {
                this.f36090b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i15 = i10;
                ModifyShortSellOrderFragment this$0 = this.f36090b;
                switch (i15) {
                    case 0:
                        int i16 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10361q = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10368x.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i17 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10363s = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10370z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i18 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10362r = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10369y.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i19 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10364t = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i20 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10366v = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i21 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10365u = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        final int i15 = 2;
        ((go) q()).f4834s.K.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ti.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyShortSellOrderFragment f36090b;

            {
                this.f36090b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i152 = i15;
                ModifyShortSellOrderFragment this$0 = this.f36090b;
                switch (i152) {
                    case 0:
                        int i16 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10361q = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10368x.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i17 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10363s = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10370z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i18 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10362r = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10369y.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i19 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10364t = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i20 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10366v = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i21 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10365u = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((go) q()).f4834s.f6719t.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ti.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyShortSellOrderFragment f36090b;

            {
                this.f36090b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i152 = i11;
                ModifyShortSellOrderFragment this$0 = this.f36090b;
                switch (i152) {
                    case 0:
                        int i16 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10361q = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10368x.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i17 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10363s = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10370z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i18 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10362r = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10369y.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i19 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10364t = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i20 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10366v = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i21 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10365u = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((go) q()).f4834s.f6718s.getInputField().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ti.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyShortSellOrderFragment f36090b;

            {
                this.f36090b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i152 = i12;
                ModifyShortSellOrderFragment this$0 = this.f36090b;
                switch (i152) {
                    case 0:
                        int i16 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10361q = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10368x.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i17 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10363s = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10370z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i18 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10362r = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10369y.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i19 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10364t = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i20 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10366v = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i21 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10365u = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((go) q()).f4834s.f6720u.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: ti.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyShortSellOrderFragment f36090b;

            {
                this.f36090b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i152 = i13;
                ModifyShortSellOrderFragment this$0 = this.f36090b;
                switch (i152) {
                    case 0:
                        int i16 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10361q = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10368x.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i17 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10363s = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10370z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i18 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10362r = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10369y.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i19 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10364t = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i20 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10366v = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i21 = ModifyShortSellOrderFragment.f10352j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyShortSellOrderViewModel) this$0.r()).f10365u = false;
                            return;
                        } else {
                            ((ModifyShortSellOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((go) q()).f4834s.f6719t.setOnInputViewAction(new ti.e(this, 0));
        ((go) q()).f4834s.f6718s.o();
        ((go) q()).f4834s.f6718s.m(new d(this, 24));
        ((go) q()).f4834s.f6720u.setOnInputViewAction(new ti.e(this, 1));
        ((go) q()).f4836u.setOnClickListener(new a(26, this, stockId));
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.layout_spinner_selected, new ArrayList());
        Intrinsics.checkNotNullParameter(arrayAdapter, "<set-?>");
        this.f10354h = arrayAdapter;
        ArrayAdapter arrayAdapter2 = this.f10354h;
        if (arrayAdapter2 != null) {
            arrayAdapter2.setDropDownViewResource(R.layout.layout_custom_spinner);
            Spinner spinner = ((go) q()).f4834s.B;
            ArrayAdapter arrayAdapter3 = this.f10354h;
            if (arrayAdapter3 != null) {
                spinner.setAdapter((SpinnerAdapter) arrayAdapter3);
                ((go) q()).f4834s.B.setOnItemSelectedListener(new c2(this, 5));
                final int i16 = 2;
                ((go) q()).f4834s.f6724y.setOnInputViewAction(new ti.e(this, 2));
                ((go) q()).f4838w.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ti.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ModifyShortSellOrderFragment f36092b;

                    {
                        this.f36092b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i17 = i16;
                        ModifyShortSellOrderFragment this$0 = this.f36092b;
                        switch (i17) {
                            case 0:
                                int i18 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.D.performClick();
                                return;
                            case 1:
                                int i19 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.f6721v.performClick();
                                return;
                            default:
                                int i20 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                    return;
                                }
                                return;
                        }
                    }
                });
                requireActivity().getOnBackPressedDispatcher().a(this, new x(this, 12));
                boolean z10 = H().f10198o;
                if (z10) {
                    ((go) q()).f4834s.B.setEnabled(false);
                } else if (!z10) {
                    ((go) q()).f4834s.B.setEnabled(true);
                }
                final int i17 = 0;
                ((go) q()).f4834s.D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ti.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ModifyShortSellOrderFragment f36094b;

                    {
                        this.f36094b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        int i18 = i17;
                        ModifyShortSellOrderFragment this$0 = this.f36094b;
                        switch (i18) {
                            case 0:
                                int i19 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.f6721v.setChecked(!z11);
                                if (z11) {
                                    e0 e0Var = ((ModifyShortSellOrderViewModel) this$0.r()).f10369y;
                                    Boolean bool = Boolean.TRUE;
                                    e0Var.postValue(bool);
                                    ((go) this$0.q()).f4834s.K.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    ((ModifyShortSellOrderViewModel) this$0.r()).B.postValue(bool);
                                    ((go) this$0.q()).f4834s.f6720u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    LinearLayout bracketOrderLayout = ((go) this$0.q()).f4834s.f6723x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout, "bracketOrderLayout");
                                    this$0.t(bracketOrderLayout);
                                    return;
                                }
                                return;
                            default:
                                int i20 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.D.setChecked(!z11);
                                if (z11) {
                                    LinearLayout bracketOrderLayout2 = ((go) this$0.q()).f4834s.f6723x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout2, "bracketOrderLayout");
                                    this$0.F(bracketOrderLayout2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((go) q()).f4834s.f6721v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ti.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ModifyShortSellOrderFragment f36094b;

                    {
                        this.f36094b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        int i18 = i10;
                        ModifyShortSellOrderFragment this$0 = this.f36094b;
                        switch (i18) {
                            case 0:
                                int i19 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.f6721v.setChecked(!z11);
                                if (z11) {
                                    e0 e0Var = ((ModifyShortSellOrderViewModel) this$0.r()).f10369y;
                                    Boolean bool = Boolean.TRUE;
                                    e0Var.postValue(bool);
                                    ((go) this$0.q()).f4834s.K.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    ((ModifyShortSellOrderViewModel) this$0.r()).B.postValue(bool);
                                    ((go) this$0.q()).f4834s.f6720u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                    LinearLayout bracketOrderLayout = ((go) this$0.q()).f4834s.f6723x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout, "bracketOrderLayout");
                                    this$0.t(bracketOrderLayout);
                                    return;
                                }
                                return;
                            default:
                                int i20 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.D.setChecked(!z11);
                                if (z11) {
                                    LinearLayout bracketOrderLayout2 = ((go) this$0.q()).f4834s.f6723x;
                                    Intrinsics.checkNotNullExpressionValue(bracketOrderLayout2, "bracketOrderLayout");
                                    this$0.F(bracketOrderLayout2);
                                    return;
                                }
                                return;
                        }
                    }
                });
                final int i18 = 0;
                ((go) q()).f4834s.E.setOnClickListener(new View.OnClickListener(this) { // from class: ti.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ModifyShortSellOrderFragment f36092b;

                    {
                        this.f36092b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i172 = i18;
                        ModifyShortSellOrderFragment this$0 = this.f36092b;
                        switch (i172) {
                            case 0:
                                int i182 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.D.performClick();
                                return;
                            case 1:
                                int i19 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.f6721v.performClick();
                                return;
                            default:
                                int i20 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((go) q()).f4834s.f6722w.setOnClickListener(new View.OnClickListener(this) { // from class: ti.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ModifyShortSellOrderFragment f36092b;

                    {
                        this.f36092b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i172 = i10;
                        ModifyShortSellOrderFragment this$0 = this.f36092b;
                        switch (i172) {
                            case 0:
                                int i182 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.D.performClick();
                                return;
                            case 1:
                                int i19 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                ((go) this$0.q()).f4834s.f6721v.performClick();
                                return;
                            default:
                                int i20 = ModifyShortSellOrderFragment.f10352j;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            }
            Intrinsics.k("spinnerArrayAdapter");
            throw null;
        }
        Intrinsics.k("spinnerArrayAdapter");
        throw null;
    }

    public final StockSharedViewModel H() {
        StockSharedViewModel stockSharedViewModel = this.f10353g;
        if (stockSharedViewModel != null) {
            return stockSharedViewModel;
        }
        Intrinsics.k("stockSharedViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityCreated(Bundle bundle) {
        SharedViewModel sharedViewModel;
        super.onActivityCreated(bundle);
        j0 activity = getActivity();
        if (activity != null && (sharedViewModel = (SharedViewModel) new g1(activity).a(SharedViewModel.class)) != null) {
            this.f10355i = sharedViewModel;
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
        PortfolioRepository portfolioRepository = bVar.j();
        yk.g.i(portfolioRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(orderValidator, "orderValidator");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(ModifyShortSellOrderViewModel.class), new d1.b(k10, c10, stockRepository, orderValidator, portfolioRepository, userRepository, 5));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ModifyShortSellOrderViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ModifyShortSellOrderViewModel.class, "<this>", ModifyShortSellOrderViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ModifyShortSellOrderViewModel modifyShortSellOrderViewModel = (ModifyShortSellOrderViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(modifyShortSellOrderViewModel);
            this.f17284b = modifyShortSellOrderViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f10353g = fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
