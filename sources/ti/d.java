package ti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.e0;
import ba.go;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderViewModel;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.assetgro.stockgro.widget.PriceInputView;
import com.google.firebase.crashlytics.internal.common.IdManager;
import ij.p;
import java.util.List;
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
    public final /* synthetic */ int f36095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyShortSellOrderFragment f36096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ModifyShortSellOrderFragment modifyShortSellOrderFragment, int i10) {
        super(1);
        this.f36095a = i10;
        this.f36096b = modifyShortSellOrderFragment;
    }

    public final void a(Portfolio portfolio) {
        int i10 = this.f36095a;
        ModifyShortSellOrderFragment modifyShortSellOrderFragment = this.f36096b;
        switch (i10) {
            case 15:
                if (portfolio != null) {
                    ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10360p = portfolio;
                    return;
                }
                return;
            default:
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).W.setValue(portfolio);
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10360p = portfolio;
                return;
        }
    }

    public final void d(Boolean bool) {
        int i10 = this.f36095a;
        ModifyShortSellOrderFragment modifyShortSellOrderFragment = this.f36096b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((go) modifyShortSellOrderFragment.q()).f4836u.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((go) modifyShortSellOrderFragment.q()).f4836u.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 16:
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10361q = true;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10363s = false;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10362r = false;
                return;
            case 17:
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10361q = false;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10363s = false;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10362r = true;
                return;
            case 18:
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10361q = false;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10363s = true;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10362r = false;
                return;
            case 19:
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10364t = true;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10366v = false;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10365u = false;
                return;
            case 20:
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10364t = false;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10366v = false;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10365u = true;
                return;
            case 21:
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10364t = false;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10366v = true;
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10365u = false;
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((go) modifyShortSellOrderFragment.q()).f4835t.setVisibility(0);
                    ((go) modifyShortSellOrderFragment.q()).f4834s.G.setVisibility(8);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((go) modifyShortSellOrderFragment.q()).f4835t.setVisibility(8);
                        ((go) modifyShortSellOrderFragment.q()).f4834s.G.setVisibility(0);
                        return;
                    }
                    return;
                }
        }
    }

    public final void e(Double d10) {
        int i10 = this.f36095a;
        ModifyShortSellOrderFragment modifyShortSellOrderFragment = this.f36096b;
        switch (i10) {
            case 4:
                ((go) modifyShortSellOrderFragment.q()).f4834s.C.setPrice(d10);
                return;
            case 7:
                ((go) modifyShortSellOrderFragment.q()).f4834s.L.setPrice(d10);
                ((go) modifyShortSellOrderFragment.q()).f4834s.L.p();
                return;
            default:
                if (((go) modifyShortSellOrderFragment.q()).f4834s.f6721v.isChecked() && String.valueOf(d10).length() != 0 && !d10.equals(Double.valueOf(0.0d))) {
                    Float f10 = q.f(((go) modifyShortSellOrderFragment.q()).f4834s.J.getInputValue());
                    Float f11 = q.f(((go) modifyShortSellOrderFragment.q()).f4834s.f6719t.getInputValue());
                    if (f10 != null) {
                        ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10368x.postValue(Boolean.TRUE);
                        ((go) modifyShortSellOrderFragment.q()).f4834s.J.setDisplayValue(f10.toString());
                    }
                    if (f11 != null) {
                        ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).A.postValue(Boolean.TRUE);
                        ((go) modifyShortSellOrderFragment.q()).f4834s.f6719t.setDisplayValue(f11.toString());
                        return;
                    }
                    return;
                }
                e0 e0Var = ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10368x;
                Boolean bool = Boolean.TRUE;
                e0Var.postValue(bool);
                ((go) modifyShortSellOrderFragment.q()).f4834s.J.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).A.postValue(bool);
                ((go) modifyShortSellOrderFragment.q()).f4834s.f6719t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
        }
    }

    public final void f(Float f10) {
        int i10 = this.f36095a;
        ModifyShortSellOrderFragment modifyShortSellOrderFragment = this.f36096b;
        switch (i10) {
            case 9:
                String valueOf = String.valueOf(f10);
                if (valueOf.length() == 0 || Intrinsics.a(valueOf, IdManager.DEFAULT_VERSION_NAME)) {
                    ((go) modifyShortSellOrderFragment.q()).f4834s.D.performClick();
                    return;
                } else {
                    ((go) modifyShortSellOrderFragment.q()).f4834s.K.setDisplayValue(valueOf);
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6721v.performClick();
                    return;
                }
            default:
                String valueOf2 = String.valueOf(f10);
                if (valueOf2.length() == 0 || Intrinsics.a(valueOf2, IdManager.DEFAULT_VERSION_NAME)) {
                    ((go) modifyShortSellOrderFragment.q()).f4834s.D.performClick();
                    return;
                } else {
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6720u.setDisplayValue(valueOf2);
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6721v.performClick();
                    return;
                }
        }
    }

    public final void i(String text) {
        double d10;
        Double valueOf;
        int i10 = this.f36095a;
        Double d11 = null;
        ModifyShortSellOrderFragment modifyShortSellOrderFragment = this.f36096b;
        switch (i10) {
            case 3:
                ((go) modifyShortSellOrderFragment.q()).f4834s.f6725z.setText(text);
                SharedViewModel sharedViewModel = modifyShortSellOrderFragment.f10355i;
                if (sharedViewModel != null) {
                    sharedViewModel.f10165b.setValue(((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10360p);
                    return;
                } else {
                    Intrinsics.k("sharedViewModel");
                    throw null;
                }
            case 5:
                if (s.j(text, modifyShortSellOrderFragment.getString(R.string.parent_order_type_regular), false)) {
                    ((go) modifyShortSellOrderFragment.q()).f4834s.D.setChecked(true);
                    return;
                } else {
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6721v.setChecked(true);
                    return;
                }
            case 8:
                Context context = modifyShortSellOrderFragment.requireContext();
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
            case 12:
                if (Intrinsics.a(text, "Market")) {
                    PriceInputView priceInputView = ((go) modifyShortSellOrderFragment.q()).f4834s.C;
                    if (priceInputView != null) {
                        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel = (ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r();
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).Q.getValue();
                        if (stockSellSelectOrderResponseDto != null) {
                            d10 = stockSellSelectOrderResponseDto.getStockPrice();
                        } else {
                            d10 = 0.0d;
                        }
                        modifyShortSellOrderViewModel.f10367w = d10;
                        StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto2 = (StockSellSelectOrderResponseDto) ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).Q.getValue();
                        if (stockSellSelectOrderResponseDto2 != null) {
                            valueOf = Double.valueOf(stockSellSelectOrderResponseDto2.getStockPrice());
                        } else {
                            valueOf = Double.valueOf(0.0d);
                        }
                        priceInputView.setPrice(valueOf);
                        Double price = priceInputView.getPrice();
                        if (price != null) {
                            double doubleValue = price.doubleValue();
                            ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).h(doubleValue);
                            ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).G.postValue(Double.valueOf(doubleValue));
                            ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10367w = doubleValue;
                        }
                        priceInputView.p();
                    }
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6724y.getTabOne().performClick();
                    return;
                }
                if (Intrinsics.a(text, "Limit")) {
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6724y.getTabTwo().performClick();
                    ((go) modifyShortSellOrderFragment.q()).f4834s.C.q();
                    return;
                } else {
                    ((go) modifyShortSellOrderFragment.q()).f4834s.C.p();
                    return;
                }
            case 14:
                ((go) modifyShortSellOrderFragment.q()).f4834s.A.setVisibility(0);
                ((go) modifyShortSellOrderFragment.q()).f4834s.A.setText(text);
                ((go) modifyShortSellOrderFragment.q()).f4834s.B.setVisibility(8);
                return;
            case 24:
                if (!((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10364t && !((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10365u) {
                    ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10366v = true;
                    String valueOf2 = String.valueOf(text);
                    ij.h hVar = ij.h.f20067a;
                    String obj = w.X(s.n(s.n(s.n(valueOf2, ij.h.d(), HttpUrl.FRAGMENT_ENCODE_SET, false), " ", HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
                    if (obj != null && obj.length() != 0) {
                        try {
                            Double price2 = ((go) modifyShortSellOrderFragment.q()).f4834s.f6718s.getPrice();
                            if (price2 != null) {
                                double doubleValue2 = price2.doubleValue();
                                double d12 = 100;
                                String b10 = ij.h.b(d12 - ((doubleValue2 * d12) / ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10367w));
                                String b11 = ij.h.b(((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10367w - doubleValue2);
                                ((go) modifyShortSellOrderFragment.q()).f4834s.f6720u.setDisplayValue(String.valueOf(ij.h.a(b10)));
                                ((go) modifyShortSellOrderFragment.q()).f4834s.f6719t.setDisplayValue(String.valueOf(ij.h.a(b11)));
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6719t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    ((go) modifyShortSellOrderFragment.q()).f4834s.f6720u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 25:
                if (text != null) {
                    d11 = q.e(text);
                }
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto3 = (StockSellSelectOrderResponseDto) ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).Q.getValue();
                if (stockSellSelectOrderResponseDto3 != null) {
                    double stockPrice = stockSellSelectOrderResponseDto3.getStockPrice();
                    if (d11 != null && d11.doubleValue() == 0.0d && !((go) modifyShortSellOrderFragment.q()).f4834s.C.f10677t.f6011v.hasFocus() && (d11 == null || d11.doubleValue() != stockPrice)) {
                        ((go) modifyShortSellOrderFragment.q()).f4834s.C.setPrice(Double.valueOf(stockPrice));
                        ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).h(stockPrice);
                        return;
                    } else {
                        if (d11 != null) {
                            ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).h(d11.doubleValue());
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                if (!((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10361q && !((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10362r) {
                    ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10363s = true;
                    String valueOf3 = String.valueOf(text);
                    ij.h hVar2 = ij.h.f20067a;
                    String obj2 = w.X(s.n(s.n(s.n(valueOf3, ij.h.d(), HttpUrl.FRAGMENT_ENCODE_SET, false), " ", HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
                    if (obj2 != null && obj2.length() != 0) {
                        try {
                            Double price3 = ((go) modifyShortSellOrderFragment.q()).f4834s.I.getPrice();
                            if (price3 != null) {
                                double doubleValue3 = price3.doubleValue();
                                double d13 = 100;
                                String b12 = ij.h.b(((doubleValue3 * d13) / ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10367w) - d13);
                                String b13 = ij.h.b(doubleValue3 - ((ModifyShortSellOrderViewModel) modifyShortSellOrderFragment.r()).f10367w);
                                ((go) modifyShortSellOrderFragment.q()).f4834s.K.setDisplayValue(String.valueOf(ij.h.a(b12)));
                                ((go) modifyShortSellOrderFragment.q()).f4834s.J.setDisplayValue(String.valueOf(ij.h.a(b13)));
                                return;
                            }
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    ((go) modifyShortSellOrderFragment.q()).f4834s.J.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    ((go) modifyShortSellOrderFragment.q()).f4834s.K.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f36095a;
        ModifyShortSellOrderFragment modifyShortSellOrderFragment = this.f36096b;
        switch (i10) {
            case 0:
                d((Boolean) obj);
                return Unit.f23355a;
            case 1:
                StockDto stockDto = ((StockDetailDto) obj).getStockDto();
                int i11 = ModifyShortSellOrderFragment.f10352j;
                go goVar = (go) modifyShortSellOrderFragment.q();
                String name = stockDto.getName();
                double ltp = stockDto.getLtp();
                String imageUrl = stockDto.getImageUrl();
                MarketAssetToolbarView marketAssetToolbarView = goVar.f4837v;
                marketAssetToolbarView.m(ltp, name, imageUrl);
                ChangeDto change = stockDto.getChange();
                if (change != null) {
                    marketAssetToolbarView.n(change);
                }
                return Unit.f23355a;
            case 2:
                List list = (List) obj;
                ArrayAdapter arrayAdapter = modifyShortSellOrderFragment.f10354h;
                if (arrayAdapter != null) {
                    arrayAdapter.addAll(list);
                    ArrayAdapter arrayAdapter2 = modifyShortSellOrderFragment.f10354h;
                    if (arrayAdapter2 != null) {
                        arrayAdapter2.notifyDataSetChanged();
                        return Unit.f23355a;
                    }
                    Intrinsics.k("spinnerArrayAdapter");
                    throw null;
                }
                Intrinsics.k("spinnerArrayAdapter");
                throw null;
            case 3:
                i((String) obj);
                return Unit.f23355a;
            case 4:
                e((Double) obj);
                return Unit.f23355a;
            case 5:
                i((String) obj);
                return Unit.f23355a;
            case 6:
                ((go) modifyShortSellOrderFragment.q()).f4834s.H.setDisplayValue(String.valueOf((Integer) obj));
                return Unit.f23355a;
            case 7:
                e((Double) obj);
                return Unit.f23355a;
            case 8:
                i((String) obj);
                return Unit.f23355a;
            case 9:
                f((Float) obj);
                return Unit.f23355a;
            case 10:
                e((Double) obj);
                return Unit.f23355a;
            case 11:
                f((Float) obj);
                return Unit.f23355a;
            case 12:
                i((String) obj);
                return Unit.f23355a;
            case 13:
                f fVar = (f) ((kj.j) obj).a();
                if (fVar != null) {
                    p pVar = fVar.f36099a;
                    if (!pVar.f20086a) {
                        ((go) modifyShortSellOrderFragment.q()).f4834s.H.setErrorText(pVar.f20087b);
                    } else {
                        ((go) modifyShortSellOrderFragment.q()).f4834s.H.m();
                    }
                    p pVar2 = fVar.f36101c;
                    if (!pVar2.f20086a) {
                        ((go) modifyShortSellOrderFragment.q()).f4834s.C.setError(pVar2.f20087b);
                    } else {
                        ((go) modifyShortSellOrderFragment.q()).f4834s.C.n();
                    }
                    p pVar3 = fVar.f36102d;
                    if (!pVar3.f20086a) {
                        ((go) modifyShortSellOrderFragment.q()).f4834s.K.setErrorText(pVar3.f20087b);
                    } else {
                        ((go) modifyShortSellOrderFragment.q()).f4834s.K.m();
                    }
                    p pVar4 = fVar.f36103e;
                    if (!pVar4.f20086a) {
                        ((go) modifyShortSellOrderFragment.q()).f4834s.f6720u.setErrorText(pVar4.f20087b);
                    } else {
                        ((go) modifyShortSellOrderFragment.q()).f4834s.f6720u.m();
                    }
                }
                return Unit.f23355a;
            case 14:
                i((String) obj);
                return Unit.f23355a;
            case 15:
                a((Portfolio) obj);
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
                d((Boolean) obj);
                return Unit.f23355a;
            case 22:
                a((Portfolio) obj);
                return Unit.f23355a;
            case 23:
                d((Boolean) obj);
                return Unit.f23355a;
            case 24:
                i((String) obj);
                return Unit.f23355a;
            case 25:
                i((String) obj);
                return Unit.f23355a;
            default:
                i((String) obj);
                return Unit.f23355a;
        }
    }
}
