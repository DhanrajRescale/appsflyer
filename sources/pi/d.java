package pi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.e0;
import ba.eo;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderViewModel;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.assetgro.stockgro.widget.PriceInputView;
import com.google.firebase.crashlytics.internal.common.IdManager;
import ij.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlin.text.s;
import kotlin.text.w;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyBuyOrderFragment f31114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ModifyBuyOrderFragment modifyBuyOrderFragment, int i10) {
        super(1);
        this.f31113a = i10;
        this.f31114b = modifyBuyOrderFragment;
    }

    public final void a(Portfolio portfolio) {
        int i10 = this.f31113a;
        ModifyBuyOrderFragment modifyBuyOrderFragment = this.f31114b;
        switch (i10) {
            case 14:
                if (portfolio != null) {
                    ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10275p = portfolio;
                    return;
                }
                return;
            default:
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).Y.setValue(portfolio);
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10275p = portfolio;
                return;
        }
    }

    public final void d(Boolean bool) {
        int i10 = this.f31113a;
        ModifyBuyOrderFragment modifyBuyOrderFragment = this.f31114b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((eo) modifyBuyOrderFragment.q()).f4631u.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((eo) modifyBuyOrderFragment.q()).f4631u.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 15:
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10278s = true;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10280u = false;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10279t = false;
                return;
            case 16:
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10278s = false;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10280u = false;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10279t = true;
                return;
            case 17:
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10278s = false;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10280u = true;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10279t = false;
                return;
            case 18:
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10281v = true;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10283x = false;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10282w = false;
                return;
            case 19:
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10281v = false;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10283x = false;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10282w = true;
                return;
            case 20:
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10281v = false;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10283x = true;
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10282w = false;
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((eo) modifyBuyOrderFragment.q()).f4630t.setVisibility(0);
                    ((eo) modifyBuyOrderFragment.q()).f4629s.E.setVisibility(8);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((eo) modifyBuyOrderFragment.q()).f4630t.setVisibility(8);
                        ((eo) modifyBuyOrderFragment.q()).f4629s.E.setVisibility(0);
                        return;
                    }
                    return;
                }
        }
    }

    public final void e(Double d10) {
        int i10 = this.f31113a;
        ModifyBuyOrderFragment modifyBuyOrderFragment = this.f31114b;
        switch (i10) {
            case 3:
                ((eo) modifyBuyOrderFragment.q()).f4629s.B.setPrice(d10);
                return;
            case 6:
                ((eo) modifyBuyOrderFragment.q()).f4629s.J.setPrice(d10);
                ((eo) modifyBuyOrderFragment.q()).f4629s.J.p();
                return;
            default:
                if (((eo) modifyBuyOrderFragment.q()).f4629s.f6525v.isChecked() && String.valueOf(d10).length() != 0 && !d10.equals(Double.valueOf(0.0d))) {
                    Float f10 = q.f(((eo) modifyBuyOrderFragment.q()).f4629s.H.getInputValue());
                    Float f11 = q.f(((eo) modifyBuyOrderFragment.q()).f4629s.f6523t.getInputValue());
                    if (f10 != null) {
                        ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10285z.postValue(Boolean.TRUE);
                        ((eo) modifyBuyOrderFragment.q()).f4629s.H.setDisplayValue(f10.toString());
                    }
                    if (f11 != null) {
                        ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).C.postValue(Boolean.TRUE);
                        ((eo) modifyBuyOrderFragment.q()).f4629s.f6523t.setDisplayValue(f11.toString());
                        return;
                    }
                    return;
                }
                e0 e0Var = ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10285z;
                Boolean bool = Boolean.TRUE;
                e0Var.postValue(bool);
                ((eo) modifyBuyOrderFragment.q()).f4629s.H.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).C.postValue(bool);
                ((eo) modifyBuyOrderFragment.q()).f4629s.f6523t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
        }
    }

    public final void f(Float f10) {
        int i10 = this.f31113a;
        ModifyBuyOrderFragment modifyBuyOrderFragment = this.f31114b;
        switch (i10) {
            case 8:
                String valueOf = String.valueOf(f10);
                if (valueOf.length() == 0 || Intrinsics.a(valueOf, IdManager.DEFAULT_VERSION_NAME)) {
                    ((eo) modifyBuyOrderFragment.q()).f4629s.C.performClick();
                    return;
                } else {
                    ((eo) modifyBuyOrderFragment.q()).f4629s.I.setDisplayValue(valueOf);
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6525v.performClick();
                    return;
                }
            default:
                String valueOf2 = String.valueOf(f10);
                if (valueOf2.length() == 0 || Intrinsics.a(valueOf2, IdManager.DEFAULT_VERSION_NAME)) {
                    ((eo) modifyBuyOrderFragment.q()).f4629s.C.performClick();
                    return;
                } else {
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6524u.setDisplayValue(valueOf2);
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6525v.performClick();
                    return;
                }
        }
    }

    public final void i(String text) {
        double d10 = 0.0d;
        Double valueOf = Double.valueOf(0.0d);
        int i10 = this.f31113a;
        ModifyBuyOrderFragment modifyBuyOrderFragment = this.f31114b;
        switch (i10) {
            case 2:
                ((eo) modifyBuyOrderFragment.q()).f4629s.f6529z.setText(text);
                SharedViewModel sharedViewModel = modifyBuyOrderFragment.f10269h;
                if (sharedViewModel != null) {
                    sharedViewModel.f10165b.setValue(((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10275p);
                    return;
                } else {
                    Intrinsics.k("sharedViewModel");
                    throw null;
                }
            case 4:
                if (s.j(text, modifyBuyOrderFragment.getString(R.string.parent_order_type_regular), false)) {
                    ((eo) modifyBuyOrderFragment.q()).f4629s.C.setChecked(true);
                    return;
                } else {
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6525v.setChecked(true);
                    return;
                }
            case 7:
                Context context = modifyBuyOrderFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                return;
            case 11:
                if (Intrinsics.a(text, "Market")) {
                    PriceInputView priceInputView = ((eo) modifyBuyOrderFragment.q()).f4629s.B;
                    if (priceInputView != null) {
                        ModifyBuyOrderViewModel modifyBuyOrderViewModel = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).S.getValue();
                        if (stockSellSelectOrderResponseDto != null) {
                            d10 = stockSellSelectOrderResponseDto.getStockPrice();
                        }
                        modifyBuyOrderViewModel.f10284y = d10;
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto2 = (StockSellSelectOrderResponseDto) ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).S.getValue();
                        if (stockSellSelectOrderResponseDto2 != null) {
                            valueOf = Double.valueOf(stockSellSelectOrderResponseDto2.getStockPrice());
                        }
                        priceInputView.setPrice(valueOf);
                        Double price = priceInputView.getPrice();
                        if (price != null) {
                            double doubleValue = price.doubleValue();
                            ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).h(doubleValue);
                            ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).I.postValue(Double.valueOf(doubleValue));
                            ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10284y = doubleValue;
                        }
                        priceInputView.p();
                    }
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6528y.getTabOne().performClick();
                    return;
                }
                if (Intrinsics.a(text, "Limit")) {
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6528y.getTabTwo().performClick();
                    ((eo) modifyBuyOrderFragment.q()).f4629s.B.q();
                    return;
                } else {
                    ((eo) modifyBuyOrderFragment.q()).f4629s.B.p();
                    return;
                }
            case 13:
                ((eo) modifyBuyOrderFragment.q()).f4629s.A.setVisibility(0);
                ((eo) modifyBuyOrderFragment.q()).f4629s.A.setText(text);
                return;
            case 23:
                if (!((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10281v && !((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10282w) {
                    ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10283x = true;
                    String valueOf2 = String.valueOf(text);
                    ij.h hVar = ij.h.f20067a;
                    String obj = w.X(s.n(s.n(s.n(valueOf2, ij.h.d(), HttpUrl.FRAGMENT_ENCODE_SET, false), " ", HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
                    if (obj != null && obj.length() != 0) {
                        try {
                            Double price2 = ((eo) modifyBuyOrderFragment.q()).f4629s.f6522s.getPrice();
                            if (price2 != null) {
                                double doubleValue2 = price2.doubleValue();
                                double d11 = 100;
                                String b10 = ij.h.b(((doubleValue2 * d11) / ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10284y) - d11);
                                String b11 = ij.h.b(doubleValue2 - ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10284y);
                                ((eo) modifyBuyOrderFragment.q()).f4629s.f6524u.setDisplayValue(String.valueOf(ij.h.a(b10)));
                                ((eo) modifyBuyOrderFragment.q()).f4629s.f6523t.setDisplayValue(String.valueOf(ij.h.a(b11)));
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6523t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    ((eo) modifyBuyOrderFragment.q()).f4629s.f6524u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 24:
                Double price3 = ((eo) modifyBuyOrderFragment.q()).f4629s.B.getPrice();
                if (price3 != null) {
                    double doubleValue3 = price3.doubleValue();
                    if (doubleValue3 == 0.0d && !((eo) modifyBuyOrderFragment.q()).f4629s.B.f10677t.f6011v.hasFocus()) {
                        PriceInputView priceInputView2 = ((eo) modifyBuyOrderFragment.q()).f4629s.B;
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto3 = (StockSellSelectOrderResponseDto) ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).S.getValue();
                        if (stockSellSelectOrderResponseDto3 != null) {
                            valueOf = Double.valueOf(stockSellSelectOrderResponseDto3.getStockPrice());
                        }
                        priceInputView2.setPrice(valueOf);
                        ModifyBuyOrderViewModel modifyBuyOrderViewModel2 = (ModifyBuyOrderViewModel) modifyBuyOrderFragment.r();
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto4 = (StockSellSelectOrderResponseDto) ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).S.getValue();
                        if (stockSellSelectOrderResponseDto4 != null) {
                            d10 = stockSellSelectOrderResponseDto4.getStockPrice();
                        }
                        modifyBuyOrderViewModel2.h(d10);
                        return;
                    }
                    ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).h(doubleValue3);
                    return;
                }
                return;
            default:
                if (!((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10278s && !((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10279t) {
                    ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10280u = true;
                    String valueOf3 = String.valueOf(text);
                    ij.h hVar2 = ij.h.f20067a;
                    String obj2 = w.X(s.n(s.n(s.n(valueOf3, ij.h.d(), HttpUrl.FRAGMENT_ENCODE_SET, false), " ", HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
                    if (obj2 != null && obj2.length() != 0) {
                        try {
                            Double price4 = ((eo) modifyBuyOrderFragment.q()).f4629s.G.getPrice();
                            if (price4 != null) {
                                double doubleValue4 = price4.doubleValue();
                                double d12 = 100;
                                String b12 = ij.h.b(d12 - ((doubleValue4 * d12) / ((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10284y));
                                String b13 = ij.h.b(((ModifyBuyOrderViewModel) modifyBuyOrderFragment.r()).f10284y - doubleValue4);
                                ((eo) modifyBuyOrderFragment.q()).f4629s.I.setDisplayValue(String.valueOf(ij.h.a(b12)));
                                ((eo) modifyBuyOrderFragment.q()).f4629s.H.setDisplayValue(String.valueOf(ij.h.a(b13)));
                                return;
                            }
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    ((eo) modifyBuyOrderFragment.q()).f4629s.H.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    ((eo) modifyBuyOrderFragment.q()).f4629s.I.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f31113a;
        ModifyBuyOrderFragment modifyBuyOrderFragment = this.f31114b;
        switch (i10) {
            case 0:
                d((Boolean) obj);
                return Unit.f23355a;
            case 1:
                StockDto stockDto = ((StockDetailDto) obj).getStockDto();
                int i11 = ModifyBuyOrderFragment.f10267i;
                eo eoVar = (eo) modifyBuyOrderFragment.q();
                String name = stockDto.getName();
                double ltp = stockDto.getLtp();
                String imageUrl = stockDto.getImageUrl();
                MarketAssetToolbarView marketAssetToolbarView = eoVar.f4632v;
                marketAssetToolbarView.m(ltp, name, imageUrl);
                ChangeDto change = stockDto.getChange();
                if (change != null) {
                    marketAssetToolbarView.n(change);
                }
                return Unit.f23355a;
            case 2:
                i((String) obj);
                return Unit.f23355a;
            case 3:
                e((Double) obj);
                return Unit.f23355a;
            case 4:
                i((String) obj);
                return Unit.f23355a;
            case 5:
                ((eo) modifyBuyOrderFragment.q()).f4629s.F.setDisplayValue(String.valueOf((Integer) obj));
                return Unit.f23355a;
            case 6:
                e((Double) obj);
                return Unit.f23355a;
            case 7:
                i((String) obj);
                return Unit.f23355a;
            case 8:
                f((Float) obj);
                return Unit.f23355a;
            case 9:
                f((Float) obj);
                return Unit.f23355a;
            case 10:
                e((Double) obj);
                return Unit.f23355a;
            case 11:
                i((String) obj);
                return Unit.f23355a;
            case 12:
                f fVar = (f) ((kj.j) obj).a();
                if (fVar != null) {
                    p pVar = fVar.f31117a;
                    if (!pVar.f20086a) {
                        ((eo) modifyBuyOrderFragment.q()).f4629s.F.setErrorText(pVar.f20087b);
                    } else {
                        ((eo) modifyBuyOrderFragment.q()).f4629s.F.m();
                    }
                    p pVar2 = fVar.f31119c;
                    if (!pVar2.f20086a) {
                        ((eo) modifyBuyOrderFragment.q()).f4629s.B.setError(pVar2.f20087b);
                    } else {
                        ((eo) modifyBuyOrderFragment.q()).f4629s.B.n();
                    }
                    p pVar3 = fVar.f31120d;
                    if (!pVar3.f20086a) {
                        ((eo) modifyBuyOrderFragment.q()).f4629s.I.setErrorText(pVar3.f20087b);
                    } else {
                        ((eo) modifyBuyOrderFragment.q()).f4629s.I.m();
                    }
                    p pVar4 = fVar.f31121e;
                    if (!pVar4.f20086a) {
                        ((eo) modifyBuyOrderFragment.q()).f4629s.f6524u.setErrorText(pVar4.f20087b);
                    } else {
                        ((eo) modifyBuyOrderFragment.q()).f4629s.f6524u.m();
                    }
                }
                return Unit.f23355a;
            case 13:
                i((String) obj);
                return Unit.f23355a;
            case 14:
                a((Portfolio) obj);
                return Unit.f23355a;
            case 15:
                d((Boolean) obj);
                return Unit.f23355a;
            case 16:
                d((Boolean) obj);
                return Unit.f23355a;
            case 17:
                d((Boolean) obj);
                return Unit.f23355a;
            case 18:
                d((Boolean) obj);
                return Unit.f23355a;
            case 19:
                d((Boolean) obj);
                return Unit.f23355a;
            case 20:
                d((Boolean) obj);
                return Unit.f23355a;
            case 21:
                a((Portfolio) obj);
                return Unit.f23355a;
            case 22:
                d((Boolean) obj);
                return Unit.f23355a;
            case 23:
                i((String) obj);
                return Unit.f23355a;
            case 24:
                i((String) obj);
                return Unit.f23355a;
            default:
                i((String) obj);
                return Unit.f23355a;
        }
    }
}
