package com.assetgro.stockgro.ui.stock.modify.buy;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.activity.x;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import ba.eo;
import bb.a;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import li.c;
import ni.q;
import nt.b;
import nt.f;
import okhttp3.HttpUrl;
import pi.d;
import pi.g;
import pi.h;
import pi.i;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/buy/ModifyBuyOrderFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/buy/ModifyBuyOrderViewModel;", "Lba/eo;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyBuyOrderFragment extends m<ModifyBuyOrderViewModel, eo> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10267i = 0;

    /* renamed from: g, reason: collision with root package name */
    public StockSharedViewModel f10268g;

    /* renamed from: h, reason: collision with root package name */
    public SharedViewModel f10269h;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_modify_buy_order;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((ModifyBuyOrderViewModel) r()).I.observe(this, new c(10, new d(this, 10)));
        ((ModifyBuyOrderViewModel) r()).f10285z.observe(this, new c(10, new d(this, 15)));
        ((ModifyBuyOrderViewModel) r()).A.observe(this, new c(10, new d(this, 16)));
        ((ModifyBuyOrderViewModel) r()).B.observe(this, new c(10, new d(this, 17)));
        ((ModifyBuyOrderViewModel) r()).C.observe(this, new c(10, new d(this, 18)));
        ((ModifyBuyOrderViewModel) r()).D.observe(this, new c(10, new d(this, 19)));
        ((ModifyBuyOrderViewModel) r()).E.observe(this, new c(10, new d(this, 20)));
        ((ModifyBuyOrderViewModel) r()).W.observe(this, new c(10, new d(this, 21)));
        ((ModifyBuyOrderViewModel) r()).f9084g.observe(this, new c(10, new d(this, 22)));
        ((ModifyBuyOrderViewModel) r()).U.observe(this, new c(10, new d(this, 0)));
        ((ModifyBuyOrderViewModel) r()).V.observe(this, new c(10, new d(this, 1)));
        ModifyBuyOrderViewModel modifyBuyOrderViewModel = (ModifyBuyOrderViewModel) r();
        modifyBuyOrderViewModel.J.observe(this, new c(10, new d(this, 2)));
        ((ModifyBuyOrderViewModel) r()).P.observe(this, new c(10, new d(this, 3)));
        ModifyBuyOrderViewModel modifyBuyOrderViewModel2 = (ModifyBuyOrderViewModel) r();
        modifyBuyOrderViewModel2.f10271b0.observe(this, new c(10, new d(this, 4)));
        ((ModifyBuyOrderViewModel) r()).N.observe(this, new c(10, new d(this, 5)));
        ModifyBuyOrderViewModel modifyBuyOrderViewModel3 = (ModifyBuyOrderViewModel) r();
        modifyBuyOrderViewModel3.K.observe(this, new c(10, new d(this, 6)));
        ((ModifyBuyOrderViewModel) r()).T.observe(this, new c(10, new d(this, 7)));
        ((ModifyBuyOrderViewModel) r()).Q.observe(this, new c(10, new d(this, 8)));
        ((ModifyBuyOrderViewModel) r()).R.observe(this, new c(10, new d(this, 9)));
        ((ModifyBuyOrderViewModel) r()).M.observe(this, new c(10, new d(this, 11)));
        ((ModifyBuyOrderViewModel) r()).L.observe(this, new c(10, new d(this, 12)));
        ModifyBuyOrderViewModel modifyBuyOrderViewModel4 = (ModifyBuyOrderViewModel) r();
        modifyBuyOrderViewModel4.f10272c0.observe(this, new c(10, new d(this, 13)));
        ModifyBuyOrderViewModel modifyBuyOrderViewModel5 = (ModifyBuyOrderViewModel) r();
        modifyBuyOrderViewModel5.f10270a0.observe(this, new c(10, new d(this, 14)));
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
            ((ModifyBuyOrderViewModel) r()).Y.setValue(portfolio);
            ((ModifyBuyOrderViewModel) r()).f10275p = portfolio;
        }
        String string = requireArguments().getString("ORDER_TYPE");
        if (string == null && (string = H().f10204u) == null) {
            throw new IllegalStateException("OrderType not supplied as an argument".toString());
        }
        String string2 = requireArguments().getString("ORDERID");
        if (string2 == null && (string2 = H().f10203t) == null) {
            throw new IllegalStateException("OrderID not supplied as an argument".toString());
        }
        ((ModifyBuyOrderViewModel) r()).f10276q = string;
        ((ModifyBuyOrderViewModel) r()).f10277r = string2;
        ModifyBuyOrderViewModel modifyBuyOrderViewModel = (ModifyBuyOrderViewModel) r();
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        at.m<BaseResponseDto<StockDetailDto>> stockDetails = modifyBuyOrderViewModel.f10273n.getStockDetails(stockId);
        q qVar = new q(6, h.f31125c);
        stockDetails.getClass();
        final int i10 = 1;
        final int i11 = 2;
        final int i12 = 0;
        nt.h c10 = new b(new b(new b(new f(stockDetails, qVar, 1), new q(7, new g(modifyBuyOrderViewModel, 7)), 1), new q(8, new g(modifyBuyOrderViewModel, 8)), 2), new q(9, new g(modifyBuyOrderViewModel, 9)), 0).c(((e) modifyBuyOrderViewModel.f9079b).J());
        jt.d dVar = new jt.d(new q(10, new i(modifyBuyOrderViewModel, stockId, 0)), new q(11, new g(modifyBuyOrderViewModel, 10)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        modifyBuyOrderViewModel.f9080c.c(dVar);
        final int i13 = 4;
        ((eo) q()).f4629s.F.setOnInputViewActionDone(new eb.f(this, 4));
        final int i14 = 3;
        ((eo) q()).f4629s.F.setOnInputViewAction(new pi.e(this, 3));
        ((eo) q()).f4629s.B.m(new d(this, 24));
        ((eo) q()).f4629s.H.setOnInputViewAction(new pi.e(this, 4));
        ((eo) q()).f4629s.G.o();
        ((eo) q()).f4629s.G.m(new d(this, 25));
        final int i15 = 5;
        ((eo) q()).f4629s.I.setOnInputViewAction(new pi.e(this, 5));
        ((eo) q()).f4629s.H.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: pi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31108b;

            {
                this.f31108b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i12;
                ModifyBuyOrderFragment this$0 = this.f31108b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10278s = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10285z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10280u = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10279t = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10281v = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10283x = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).E.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10282w = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((eo) q()).f4629s.G.getInputField().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: pi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31108b;

            {
                this.f31108b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i10;
                ModifyBuyOrderFragment this$0 = this.f31108b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10278s = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10285z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10280u = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10279t = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10281v = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10283x = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).E.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10282w = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((eo) q()).f4629s.I.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: pi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31108b;

            {
                this.f31108b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i11;
                ModifyBuyOrderFragment this$0 = this.f31108b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10278s = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10285z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10280u = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10279t = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10281v = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10283x = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).E.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10282w = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((eo) q()).f4629s.f6523t.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: pi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31108b;

            {
                this.f31108b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i14;
                ModifyBuyOrderFragment this$0 = this.f31108b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10278s = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10285z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10280u = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10279t = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10281v = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10283x = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).E.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10282w = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((eo) q()).f4629s.f6522s.getInputField().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: pi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31108b;

            {
                this.f31108b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i13;
                ModifyBuyOrderFragment this$0 = this.f31108b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10278s = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10285z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10280u = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10279t = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10281v = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10283x = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).E.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10282w = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((eo) q()).f4629s.f6524u.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: pi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31108b;

            {
                this.f31108b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                int i16 = i15;
                ModifyBuyOrderFragment this$0 = this.f31108b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10278s = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10285z.postValue(Boolean.TRUE);
                            return;
                        }
                    case 1:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10280u = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).B.postValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i19 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10279t = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).A.postValue(Boolean.TRUE);
                            return;
                        }
                    case 3:
                        int i20 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10281v = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                            return;
                        }
                    case 4:
                        int i21 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10283x = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).E.postValue(Boolean.TRUE);
                            return;
                        }
                    default:
                        int i22 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!z10) {
                            ((ModifyBuyOrderViewModel) this$0.r()).f10282w = false;
                            return;
                        } else {
                            ((ModifyBuyOrderViewModel) this$0.r()).D.postValue(Boolean.TRUE);
                            return;
                        }
                }
            }
        });
        ((eo) q()).f4629s.f6523t.setOnInputViewAction(new pi.e(this, 0));
        ((eo) q()).f4629s.f6522s.o();
        ((eo) q()).f4629s.f6522s.m(new d(this, 23));
        ((eo) q()).f4629s.f6524u.setOnInputViewAction(new pi.e(this, 1));
        ((eo) q()).f4631u.setOnClickListener(new a(23, this, stockId));
        ((eo) q()).f4629s.f6528y.setOnInputViewAction(new pi.e(this, 2));
        ((eo) q()).f4633w.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: pi.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31110b;

            {
                this.f31110b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i11;
                ModifyBuyOrderFragment this$0 = this.f31110b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.C.performClick();
                        return;
                    case 1:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.f6525v.performClick();
                        return;
                    default:
                        int i19 = ModifyBuyOrderFragment.f10267i;
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
        requireActivity().getOnBackPressedDispatcher().a(this, new x(this, 7));
        ((eo) q()).f4629s.C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: pi.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31112b;

            {
                this.f31112b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                int i16 = i12;
                ModifyBuyOrderFragment this$0 = this.f31112b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.f6525v.setChecked(!z10);
                        if (z10) {
                            e0 e0Var = ((ModifyBuyOrderViewModel) this$0.r()).A;
                            Boolean bool = Boolean.TRUE;
                            e0Var.postValue(bool);
                            ((eo) this$0.q()).f4629s.I.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                            ((ModifyBuyOrderViewModel) this$0.r()).D.postValue(bool);
                            ((eo) this$0.q()).f4629s.f6524u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                            LinearLayout bracketOrderLayout = ((eo) this$0.q()).f4629s.f6527x;
                            Intrinsics.checkNotNullExpressionValue(bracketOrderLayout, "bracketOrderLayout");
                            this$0.t(bracketOrderLayout);
                            return;
                        }
                        return;
                    default:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.C.setChecked(!z10);
                        if (z10) {
                            LinearLayout bracketOrderLayout2 = ((eo) this$0.q()).f4629s.f6527x;
                            Intrinsics.checkNotNullExpressionValue(bracketOrderLayout2, "bracketOrderLayout");
                            this$0.F(bracketOrderLayout2);
                            return;
                        }
                        return;
                }
            }
        });
        ((eo) q()).f4629s.f6525v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: pi.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31112b;

            {
                this.f31112b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                int i16 = i10;
                ModifyBuyOrderFragment this$0 = this.f31112b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.f6525v.setChecked(!z10);
                        if (z10) {
                            e0 e0Var = ((ModifyBuyOrderViewModel) this$0.r()).A;
                            Boolean bool = Boolean.TRUE;
                            e0Var.postValue(bool);
                            ((eo) this$0.q()).f4629s.I.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                            ((ModifyBuyOrderViewModel) this$0.r()).D.postValue(bool);
                            ((eo) this$0.q()).f4629s.f6524u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                            LinearLayout bracketOrderLayout = ((eo) this$0.q()).f4629s.f6527x;
                            Intrinsics.checkNotNullExpressionValue(bracketOrderLayout, "bracketOrderLayout");
                            this$0.t(bracketOrderLayout);
                            return;
                        }
                        return;
                    default:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.C.setChecked(!z10);
                        if (z10) {
                            LinearLayout bracketOrderLayout2 = ((eo) this$0.q()).f4629s.f6527x;
                            Intrinsics.checkNotNullExpressionValue(bracketOrderLayout2, "bracketOrderLayout");
                            this$0.F(bracketOrderLayout2);
                            return;
                        }
                        return;
                }
            }
        });
        ((eo) q()).f4629s.D.setOnClickListener(new View.OnClickListener(this) { // from class: pi.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31110b;

            {
                this.f31110b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i12;
                ModifyBuyOrderFragment this$0 = this.f31110b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.C.performClick();
                        return;
                    case 1:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.f6525v.performClick();
                        return;
                    default:
                        int i19 = ModifyBuyOrderFragment.f10267i;
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
        ((eo) q()).f4629s.f6526w.setOnClickListener(new View.OnClickListener(this) { // from class: pi.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyBuyOrderFragment f31110b;

            {
                this.f31110b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i10;
                ModifyBuyOrderFragment this$0 = this.f31110b;
                switch (i16) {
                    case 0:
                        int i17 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.C.performClick();
                        return;
                    case 1:
                        int i18 = ModifyBuyOrderFragment.f10267i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((eo) this$0.q()).f4629s.f6525v.performClick();
                        return;
                    default:
                        int i19 = ModifyBuyOrderFragment.f10267i;
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
    }

    public final StockSharedViewModel H() {
        StockSharedViewModel stockSharedViewModel = this.f10268g;
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
            this.f10269h = sharedViewModel;
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
        ca.c factory = new ca.c(a0.a(ModifyBuyOrderViewModel.class), new d1.b(k10, c10, stockRepository, orderValidator, portfolioRepository, userRepository, 4));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ModifyBuyOrderViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ModifyBuyOrderViewModel.class, "<this>", ModifyBuyOrderViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ModifyBuyOrderViewModel modifyBuyOrderViewModel = (ModifyBuyOrderViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(modifyBuyOrderViewModel);
            this.f17284b = modifyBuyOrderViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f10268g = fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
