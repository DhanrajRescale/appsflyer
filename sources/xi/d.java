package xi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.e0;
import ba.zo;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockOrderInfoResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderViewModel;
import com.assetgro.stockgro.widget.InputView;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.assetgro.stockgro.widget.PriceInputView;
import ij.p;
import iu.k;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlin.text.s;
import kotlin.text.w;
import okhttp3.HttpUrl;
import qj.u;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockShortSellOrderFragment f40268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(StockShortSellOrderFragment stockShortSellOrderFragment, int i10) {
        super(1);
        this.f40267a = i10;
        this.f40268b = stockShortSellOrderFragment;
    }

    public final void a(Portfolio portfolio) {
        int i10 = this.f40267a;
        StockShortSellOrderFragment stockShortSellOrderFragment = this.f40268b;
        switch (i10) {
            case 12:
                if (portfolio != null) {
                    ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10428p = portfolio;
                    return;
                }
                return;
            default:
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).P.setValue(portfolio);
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10428p = portfolio;
                return;
        }
    }

    public final void d(Boolean bool) {
        int i10 = this.f40267a;
        StockShortSellOrderFragment stockShortSellOrderFragment = this.f40268b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((zo) stockShortSellOrderFragment.q()).f6870s.f4812y.setVisibility(0);
                    ((zo) stockShortSellOrderFragment.q()).f6872u.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((zo) stockShortSellOrderFragment.q()).f6870s.f4812y.setVisibility(8);
                        ((zo) stockShortSellOrderFragment.q()).f6872u.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 14:
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10429q = true;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10431s = false;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10430r = false;
                return;
            case 15:
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10429q = false;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10431s = false;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10430r = true;
                return;
            case 16:
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10429q = false;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10431s = true;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10430r = false;
                return;
            case 17:
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10432t = true;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10434v = false;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10433u = false;
                return;
            case 18:
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10432t = false;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10434v = false;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10433u = true;
                return;
            case 19:
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10432t = false;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10434v = true;
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10433u = false;
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((zo) stockShortSellOrderFragment.q()).f6871t.setVisibility(0);
                    ((zo) stockShortSellOrderFragment.q()).f6870s.K.setVisibility(8);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((zo) stockShortSellOrderFragment.q()).f6871t.setVisibility(8);
                        ((zo) stockShortSellOrderFragment.q()).f6870s.K.setVisibility(0);
                        return;
                    }
                    return;
                }
        }
    }

    public final void e(Double d10) {
        int i10 = this.f40267a;
        StockShortSellOrderFragment stockShortSellOrderFragment = this.f40268b;
        switch (i10) {
            case 4:
                ((zo) stockShortSellOrderFragment.q()).f6870s.F.setPrice(d10);
                return;
            case 5:
            default:
                if (((zo) stockShortSellOrderFragment.q()).f6870s.f4809v.isChecked() && String.valueOf(d10).length() != 0 && !d10.equals(Double.valueOf(0.0d))) {
                    Float f10 = q.f(((zo) stockShortSellOrderFragment.q()).f6870s.N.getInputValue());
                    Float f11 = q.f(((zo) stockShortSellOrderFragment.q()).f6870s.f4807t.getInputValue());
                    if (f10 != null) {
                        ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10437y.postValue(Boolean.TRUE);
                        ((zo) stockShortSellOrderFragment.q()).f6870s.N.setDisplayValue(f10.toString());
                    }
                    if (f11 != null) {
                        ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).B.postValue(Boolean.TRUE);
                        ((zo) stockShortSellOrderFragment.q()).f6870s.f4807t.setDisplayValue(f11.toString());
                        return;
                    }
                    return;
                }
                e0 e0Var = ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10437y;
                Boolean bool = Boolean.TRUE;
                e0Var.postValue(bool);
                ((zo) stockShortSellOrderFragment.q()).f6870s.N.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).B.postValue(bool);
                ((zo) stockShortSellOrderFragment.q()).f6870s.f4807t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            case 6:
                ((zo) stockShortSellOrderFragment.q()).f6870s.P.setPrice(d10);
                ((zo) stockShortSellOrderFragment.q()).f6870s.P.p();
                return;
        }
    }

    public final void f(String text) {
        String stockPrice;
        String stockPrice2;
        Double valueOf;
        String stockPrice3;
        String stockPrice4;
        int i10 = this.f40267a;
        double d10 = 0.0d;
        Double d11 = null;
        StockShortSellOrderFragment stockShortSellOrderFragment = this.f40268b;
        switch (i10) {
            case 3:
                ((zo) stockShortSellOrderFragment.q()).f6870s.A.setText(text);
                SharedViewModel sharedViewModel = stockShortSellOrderFragment.f10425i;
                if (sharedViewModel != null) {
                    sharedViewModel.f10165b.setValue(((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10428p);
                    return;
                } else {
                    Intrinsics.k("sharedViewModel");
                    throw null;
                }
            case 7:
                Context context = stockShortSellOrderFragment.requireContext();
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
            case 8:
                if (Intrinsics.a(text, "Market")) {
                    PriceInputView priceInputView = ((zo) stockShortSellOrderFragment.q()).f6870s.F;
                    StockShortSellOrderViewModel stockShortSellOrderViewModel = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                    StockOrderInfoResponseDto stockOrderInfoResponseDto = (StockOrderInfoResponseDto) ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).J.getValue();
                    if (stockOrderInfoResponseDto != null && (stockPrice2 = stockOrderInfoResponseDto.getStockPrice()) != null) {
                        d10 = Double.parseDouble(stockPrice2);
                    }
                    stockShortSellOrderViewModel.f10436x = d10;
                    StockOrderInfoResponseDto stockOrderInfoResponseDto2 = (StockOrderInfoResponseDto) ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).J.getValue();
                    if (stockOrderInfoResponseDto2 != null && (stockPrice = stockOrderInfoResponseDto2.getStockPrice()) != null) {
                        d11 = Double.valueOf(Double.parseDouble(stockPrice));
                    }
                    priceInputView.setPrice(d11);
                    ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).I.postValue(priceInputView.getPrice());
                    Double price = priceInputView.getPrice();
                    if (price != null) {
                        ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10436x = price.doubleValue();
                    }
                    ((zo) stockShortSellOrderFragment.q()).f6870s.f4813z.setSelectedTab(u.f32064a);
                    priceInputView.p();
                    return;
                }
                if (Intrinsics.a(text, "Limit")) {
                    ((zo) stockShortSellOrderFragment.q()).f6870s.f4813z.setSelectedTab(u.f32065b);
                    ((zo) stockShortSellOrderFragment.q()).f6870s.F.q();
                    return;
                } else {
                    ((zo) stockShortSellOrderFragment.q()).f6870s.F.p();
                    return;
                }
            case 11:
                ((zo) stockShortSellOrderFragment.q()).f6870s.B.setVisibility(0);
                ((zo) stockShortSellOrderFragment.q()).f6870s.B.setText(text);
                ((zo) stockShortSellOrderFragment.q()).f6870s.E.setVisibility(8);
                ((zo) stockShortSellOrderFragment.q()).f6870s.D.setVisibility(8);
                ((zo) stockShortSellOrderFragment.q()).f6870s.C.setVisibility(8);
                return;
            case 22:
                if (!((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10432t && !((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10433u) {
                    ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10434v = true;
                    String valueOf2 = String.valueOf(text);
                    ij.h hVar = ij.h.f20067a;
                    String obj = w.X(s.n(s.n(s.n(valueOf2, ij.h.d(), HttpUrl.FRAGMENT_ENCODE_SET, false), " ", HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
                    if (obj != null && obj.length() != 0) {
                        try {
                            Double price2 = ((zo) stockShortSellOrderFragment.q()).f6870s.f4806s.getPrice();
                            if (price2 != null) {
                                double doubleValue = price2.doubleValue();
                                double d12 = 100;
                                String b10 = ij.h.b(d12 - ((doubleValue * d12) / ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10436x));
                                String b11 = ij.h.b(((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10436x - doubleValue);
                                ((zo) stockShortSellOrderFragment.q()).f6870s.f4808u.setDisplayValue(String.valueOf(ij.h.a(b10)));
                                ((zo) stockShortSellOrderFragment.q()).f6870s.f4807t.setDisplayValue(String.valueOf(ij.h.a(b11)));
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ((zo) stockShortSellOrderFragment.q()).f6870s.f4807t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    ((zo) stockShortSellOrderFragment.q()).f6870s.f4808u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 23:
                Double price3 = ((zo) stockShortSellOrderFragment.q()).f6870s.F.getPrice();
                if (price3 != null) {
                    double doubleValue2 = price3.doubleValue();
                    if (doubleValue2 == 0.0d && !((zo) stockShortSellOrderFragment.q()).f6870s.F.f10677t.f6011v.hasFocus()) {
                        PriceInputView priceInputView2 = ((zo) stockShortSellOrderFragment.q()).f6870s.F;
                        StockOrderInfoResponseDto stockOrderInfoResponseDto3 = (StockOrderInfoResponseDto) ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).J.getValue();
                        if (stockOrderInfoResponseDto3 != null && (stockPrice4 = stockOrderInfoResponseDto3.getStockPrice()) != null) {
                            valueOf = Double.valueOf(Double.parseDouble(stockPrice4));
                        } else {
                            valueOf = Double.valueOf(0.0d);
                        }
                        priceInputView2.setPrice(valueOf);
                        StockShortSellOrderViewModel stockShortSellOrderViewModel2 = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                        StockOrderInfoResponseDto stockOrderInfoResponseDto4 = (StockOrderInfoResponseDto) ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).J.getValue();
                        if (stockOrderInfoResponseDto4 != null && (stockPrice3 = stockOrderInfoResponseDto4.getStockPrice()) != null) {
                            d10 = Double.parseDouble(stockPrice3);
                        }
                        stockShortSellOrderViewModel2.f10436x = d10;
                        stockShortSellOrderViewModel2.I.postValue(Double.valueOf(d10));
                        stockShortSellOrderViewModel2.F.postValue(Double.valueOf(stockShortSellOrderViewModel2.f10435w * stockShortSellOrderViewModel2.f10436x));
                        return;
                    }
                    StockShortSellOrderViewModel stockShortSellOrderViewModel3 = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                    stockShortSellOrderViewModel3.f10436x = doubleValue2;
                    stockShortSellOrderViewModel3.I.postValue(Double.valueOf(doubleValue2));
                    stockShortSellOrderViewModel3.F.postValue(Double.valueOf(stockShortSellOrderViewModel3.f10435w * stockShortSellOrderViewModel3.f10436x));
                    return;
                }
                return;
            default:
                if (!((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10429q && !((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10430r) {
                    ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10431s = true;
                    String valueOf3 = String.valueOf(text);
                    ij.h hVar2 = ij.h.f20067a;
                    String obj2 = w.X(s.n(s.n(s.n(valueOf3, ij.h.d(), HttpUrl.FRAGMENT_ENCODE_SET, false), " ", HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
                    if (obj2 != null && obj2.length() != 0) {
                        try {
                            Double price4 = ((zo) stockShortSellOrderFragment.q()).f6870s.M.getPrice();
                            if (price4 != null) {
                                double doubleValue3 = price4.doubleValue();
                                double d13 = 100;
                                String b12 = ij.h.b(((doubleValue3 * d13) / ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10436x) - d13);
                                String b13 = ij.h.b(doubleValue3 - ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10436x);
                                ((zo) stockShortSellOrderFragment.q()).f6870s.O.setDisplayValue(String.valueOf(ij.h.a(b12)));
                                ((zo) stockShortSellOrderFragment.q()).f6870s.N.setDisplayValue(String.valueOf(ij.h.a(b13)));
                                return;
                            }
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    ((zo) stockShortSellOrderFragment.q()).f6870s.N.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    ((zo) stockShortSellOrderFragment.q()).f6870s.O.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f40267a;
        StockShortSellOrderFragment stockShortSellOrderFragment = this.f40268b;
        switch (i10) {
            case 0:
                d((Boolean) obj);
                return Unit.f23355a;
            case 1:
                StockDto stockDto = ((StockDetailDto) obj).getStockDto();
                int i11 = StockShortSellOrderFragment.f10422j;
                zo zoVar = (zo) stockShortSellOrderFragment.q();
                String name = stockDto.getName();
                double ltp = stockDto.getLtp();
                String imageUrl = stockDto.getImageUrl();
                MarketAssetToolbarView marketAssetToolbarView = zoVar.f6873v;
                marketAssetToolbarView.m(ltp, name, imageUrl);
                ChangeDto change = stockDto.getChange();
                if (change != null) {
                    marketAssetToolbarView.n(change);
                }
                return Unit.f23355a;
            case 2:
                List list = (List) obj;
                ArrayAdapter arrayAdapter = stockShortSellOrderFragment.f10424h;
                if (arrayAdapter != null) {
                    arrayAdapter.addAll(list);
                    ArrayAdapter arrayAdapter2 = stockShortSellOrderFragment.f10424h;
                    if (arrayAdapter2 != null) {
                        arrayAdapter2.notifyDataSetChanged();
                        ((zo) stockShortSellOrderFragment.q()).f6870s.D.setVisibility(0);
                        ((zo) stockShortSellOrderFragment.q()).f6870s.C.setVisibility(0);
                        ((zo) stockShortSellOrderFragment.q()).f6870s.D.startAnimation(AnimationUtils.loadAnimation(stockShortSellOrderFragment.requireContext(), R.anim.anim_shake_vertically));
                        ((zo) stockShortSellOrderFragment.q()).f6870s.C.startAnimation(AnimationUtils.loadAnimation(stockShortSellOrderFragment.requireContext(), R.anim.fade_in));
                        return Unit.f23355a;
                    }
                    Intrinsics.k("spinnerArrayAdapter");
                    throw null;
                }
                Intrinsics.k("spinnerArrayAdapter");
                throw null;
            case 3:
                f((String) obj);
                return Unit.f23355a;
            case 4:
                e((Double) obj);
                return Unit.f23355a;
            case 5:
                ((zo) stockShortSellOrderFragment.q()).f6870s.L.setDisplayValue(String.valueOf((Integer) obj));
                return Unit.f23355a;
            case 6:
                e((Double) obj);
                return Unit.f23355a;
            case 7:
                f((String) obj);
                return Unit.f23355a;
            case 8:
                f((String) obj);
                return Unit.f23355a;
            case 9:
                f fVar = (f) ((j) obj).a();
                if (fVar != null) {
                    p pVar = fVar.f40271a;
                    if (!pVar.f20086a) {
                        ((zo) stockShortSellOrderFragment.q()).f6870s.L.setErrorText(pVar.f20087b);
                    } else {
                        ((zo) stockShortSellOrderFragment.q()).f6870s.L.m();
                    }
                    p pVar2 = fVar.f40273c;
                    if (!pVar2.f20086a) {
                        ((zo) stockShortSellOrderFragment.q()).f6870s.F.setError(pVar2.f20087b);
                    } else {
                        ((zo) stockShortSellOrderFragment.q()).f6870s.F.n();
                    }
                    p pVar3 = fVar.f40274d;
                    if (!pVar3.f20086a) {
                        ((zo) stockShortSellOrderFragment.q()).f6870s.O.setErrorText(pVar3.f20087b);
                    } else {
                        ((zo) stockShortSellOrderFragment.q()).f6870s.O.m();
                    }
                    p pVar4 = fVar.f40275e;
                    if (!pVar4.f20086a) {
                        ((zo) stockShortSellOrderFragment.q()).f6870s.f4808u.setErrorText(pVar4.f20087b);
                    } else {
                        ((zo) stockShortSellOrderFragment.q()).f6870s.f4808u.m();
                    }
                }
                return Unit.f23355a;
            case 10:
                e((Double) obj);
                return Unit.f23355a;
            case 11:
                f((String) obj);
                return Unit.f23355a;
            case 12:
                a((Portfolio) obj);
                return Unit.f23355a;
            case 13:
                u uVar = (u) obj;
                InputView inputView = ((zo) stockShortSellOrderFragment.q()).f6870s.f4813z;
                Intrinsics.c(uVar);
                inputView.setSelectedTab(uVar);
                return Unit.f23355a;
            case 14:
                d((Boolean) obj);
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
                a((Portfolio) obj);
                return Unit.f23355a;
            case 21:
                d((Boolean) obj);
                return Unit.f23355a;
            case 22:
                f((String) obj);
                return Unit.f23355a;
            case 23:
                f((String) obj);
                return Unit.f23355a;
            default:
                f((String) obj);
                return Unit.f23355a;
        }
    }
}
