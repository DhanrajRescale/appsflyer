package mi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.e0;
import ba.jo;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockOrderInfoResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderFragment;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderViewModel;
import com.assetgro.stockgro.widget.InputView;
import com.assetgro.stockgro.widget.MarketAssetToolbarView;
import com.assetgro.stockgro.widget.PriceInputView;
import ij.p;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlin.text.s;
import kotlin.text.w;
import okhttp3.HttpUrl;
import qj.u;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockOrderFragment f27794b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(StockOrderFragment stockOrderFragment, int i10) {
        super(1);
        this.f27793a = i10;
        this.f27794b = stockOrderFragment;
    }

    public final void a(Portfolio portfolio) {
        int i10 = this.f27793a;
        StockOrderFragment stockOrderFragment = this.f27794b;
        switch (i10) {
            case 12:
                if (portfolio != null) {
                    ((StockOrderViewModel) stockOrderFragment.r()).f10234p = portfolio;
                    return;
                }
                return;
            default:
                ((StockOrderViewModel) stockOrderFragment.r()).P.setValue(portfolio);
                ((StockOrderViewModel) stockOrderFragment.r()).f10234p = portfolio;
                return;
        }
    }

    public final void d(Boolean bool) {
        int i10 = this.f27793a;
        StockOrderFragment stockOrderFragment = this.f27794b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((jo) stockOrderFragment.q()).f5160s.f4196y.setVisibility(0);
                    ((jo) stockOrderFragment.q()).f5162u.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((jo) stockOrderFragment.q()).f5160s.f4196y.setVisibility(8);
                        ((jo) stockOrderFragment.q()).f5162u.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 14:
                ((StockOrderViewModel) stockOrderFragment.r()).f10235q = true;
                ((StockOrderViewModel) stockOrderFragment.r()).f10237s = false;
                ((StockOrderViewModel) stockOrderFragment.r()).f10236r = false;
                return;
            case 15:
                ((StockOrderViewModel) stockOrderFragment.r()).f10235q = false;
                ((StockOrderViewModel) stockOrderFragment.r()).f10237s = false;
                ((StockOrderViewModel) stockOrderFragment.r()).f10236r = true;
                return;
            case 16:
                ((StockOrderViewModel) stockOrderFragment.r()).f10235q = false;
                ((StockOrderViewModel) stockOrderFragment.r()).f10237s = true;
                ((StockOrderViewModel) stockOrderFragment.r()).f10236r = false;
                return;
            case 17:
                ((StockOrderViewModel) stockOrderFragment.r()).f10238t = true;
                ((StockOrderViewModel) stockOrderFragment.r()).f10240v = false;
                ((StockOrderViewModel) stockOrderFragment.r()).f10239u = false;
                return;
            case 18:
                ((StockOrderViewModel) stockOrderFragment.r()).f10238t = false;
                ((StockOrderViewModel) stockOrderFragment.r()).f10240v = false;
                ((StockOrderViewModel) stockOrderFragment.r()).f10239u = true;
                return;
            case 19:
                ((StockOrderViewModel) stockOrderFragment.r()).f10238t = false;
                ((StockOrderViewModel) stockOrderFragment.r()).f10240v = true;
                ((StockOrderViewModel) stockOrderFragment.r()).f10239u = false;
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((jo) stockOrderFragment.q()).f5161t.setVisibility(0);
                    ((jo) stockOrderFragment.q()).f5160s.J.setVisibility(8);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((jo) stockOrderFragment.q()).f5161t.setVisibility(8);
                        ((jo) stockOrderFragment.q()).f5160s.J.setVisibility(0);
                        return;
                    }
                    return;
                }
        }
    }

    public final void e(Double d10) {
        int i10 = this.f27793a;
        StockOrderFragment stockOrderFragment = this.f27794b;
        switch (i10) {
            case 4:
                ((jo) stockOrderFragment.q()).f5160s.F.setPrice(d10);
                return;
            case 5:
            default:
                if (((jo) stockOrderFragment.q()).f5160s.f4193v.isChecked() && String.valueOf(d10).length() != 0 && !d10.equals(Double.valueOf(0.0d))) {
                    Float f10 = q.f(((jo) stockOrderFragment.q()).f5160s.M.getInputValue());
                    Float f11 = q.f(((jo) stockOrderFragment.q()).f5160s.f4191t.getInputValue());
                    if (f10 != null) {
                        ((StockOrderViewModel) stockOrderFragment.r()).f10243y.postValue(Boolean.TRUE);
                        ((jo) stockOrderFragment.q()).f5160s.M.setDisplayValue(f10.toString());
                    }
                    if (f11 != null) {
                        ((StockOrderViewModel) stockOrderFragment.r()).B.postValue(Boolean.TRUE);
                        ((jo) stockOrderFragment.q()).f5160s.f4191t.setDisplayValue(f11.toString());
                        return;
                    }
                    return;
                }
                e0 e0Var = ((StockOrderViewModel) stockOrderFragment.r()).f10243y;
                Boolean bool = Boolean.TRUE;
                e0Var.postValue(bool);
                ((jo) stockOrderFragment.q()).f5160s.M.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                ((StockOrderViewModel) stockOrderFragment.r()).B.postValue(bool);
                ((jo) stockOrderFragment.q()).f5160s.f4191t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            case 6:
                ((jo) stockOrderFragment.q()).f5160s.O.setPrice(d10);
                ((jo) stockOrderFragment.q()).f5160s.O.p();
                return;
        }
    }

    public final void f(String text) {
        String stockPrice;
        String stockPrice2;
        Double valueOf;
        String stockPrice3;
        String stockPrice4;
        int i10 = this.f27793a;
        double d10 = 0.0d;
        Double d11 = null;
        StockOrderFragment stockOrderFragment = this.f27794b;
        switch (i10) {
            case 3:
                ((jo) stockOrderFragment.q()).f5160s.A.setText(text);
                SharedViewModel sharedViewModel = stockOrderFragment.f10222i;
                if (sharedViewModel != null) {
                    sharedViewModel.f10165b.setValue(((StockOrderViewModel) stockOrderFragment.r()).f10234p);
                    return;
                } else {
                    Intrinsics.k("sharedViewModel");
                    throw null;
                }
            case 7:
                Context context = stockOrderFragment.requireContext();
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
                    PriceInputView priceInputView = ((jo) stockOrderFragment.q()).f5160s.F;
                    StockOrderViewModel stockOrderViewModel = (StockOrderViewModel) stockOrderFragment.r();
                    StockOrderInfoResponseDto stockOrderInfoResponseDto = (StockOrderInfoResponseDto) ((StockOrderViewModel) stockOrderFragment.r()).J.getValue();
                    if (stockOrderInfoResponseDto != null && (stockPrice2 = stockOrderInfoResponseDto.getStockPrice()) != null) {
                        d10 = Double.parseDouble(stockPrice2);
                    }
                    stockOrderViewModel.f10242x = d10;
                    StockOrderInfoResponseDto stockOrderInfoResponseDto2 = (StockOrderInfoResponseDto) ((StockOrderViewModel) stockOrderFragment.r()).J.getValue();
                    if (stockOrderInfoResponseDto2 != null && (stockPrice = stockOrderInfoResponseDto2.getStockPrice()) != null) {
                        d11 = Double.valueOf(Double.parseDouble(stockPrice));
                    }
                    priceInputView.setPrice(d11);
                    ((StockOrderViewModel) stockOrderFragment.r()).I.postValue(priceInputView.getPrice());
                    Double price = priceInputView.getPrice();
                    if (price != null) {
                        ((StockOrderViewModel) stockOrderFragment.r()).f10242x = price.doubleValue();
                    }
                    ((jo) stockOrderFragment.q()).f5160s.f4197z.setSelectedTab(u.f32064a);
                    priceInputView.p();
                    return;
                }
                if (Intrinsics.a(text, "Limit")) {
                    ((jo) stockOrderFragment.q()).f5160s.f4197z.setSelectedTab(u.f32065b);
                    ((jo) stockOrderFragment.q()).f5160s.F.q();
                    return;
                } else {
                    ((jo) stockOrderFragment.q()).f5160s.F.p();
                    return;
                }
            case 11:
                ((jo) stockOrderFragment.q()).f5160s.B.setVisibility(0);
                ((jo) stockOrderFragment.q()).f5160s.B.setText(text);
                ((jo) stockOrderFragment.q()).f5160s.E.setVisibility(8);
                ((jo) stockOrderFragment.q()).f5160s.D.setVisibility(8);
                ((jo) stockOrderFragment.q()).f5160s.C.setVisibility(8);
                return;
            case 22:
                if (!((StockOrderViewModel) stockOrderFragment.r()).f10238t && !((StockOrderViewModel) stockOrderFragment.r()).f10239u) {
                    ((StockOrderViewModel) stockOrderFragment.r()).f10240v = true;
                    String valueOf2 = String.valueOf(text);
                    ij.h hVar = ij.h.f20067a;
                    String obj = w.X(s.n(s.n(s.n(valueOf2, ij.h.d(), HttpUrl.FRAGMENT_ENCODE_SET, false), " ", HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
                    if (obj != null && obj.length() != 0) {
                        try {
                            Double price2 = ((jo) stockOrderFragment.q()).f5160s.f4190s.getPrice();
                            if (price2 != null) {
                                double doubleValue = price2.doubleValue();
                                double d12 = 100;
                                String b10 = ij.h.b(((doubleValue * d12) / ((StockOrderViewModel) stockOrderFragment.r()).f10242x) - d12);
                                String b11 = ij.h.b(doubleValue - ((StockOrderViewModel) stockOrderFragment.r()).f10242x);
                                ((jo) stockOrderFragment.q()).f5160s.f4192u.setDisplayValue(String.valueOf(ij.h.a(b10)));
                                ((jo) stockOrderFragment.q()).f5160s.f4191t.setDisplayValue(String.valueOf(ij.h.a(b11)));
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ((jo) stockOrderFragment.q()).f5160s.f4191t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    ((jo) stockOrderFragment.q()).f5160s.f4192u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 23:
                Double price3 = ((jo) stockOrderFragment.q()).f5160s.F.getPrice();
                if (price3 != null) {
                    double doubleValue2 = price3.doubleValue();
                    if (doubleValue2 == 0.0d && !((jo) stockOrderFragment.q()).f5160s.F.f10677t.f6011v.hasFocus()) {
                        PriceInputView priceInputView2 = ((jo) stockOrderFragment.q()).f5160s.F;
                        StockOrderInfoResponseDto stockOrderInfoResponseDto3 = (StockOrderInfoResponseDto) ((StockOrderViewModel) stockOrderFragment.r()).J.getValue();
                        if (stockOrderInfoResponseDto3 != null && (stockPrice4 = stockOrderInfoResponseDto3.getStockPrice()) != null) {
                            valueOf = Double.valueOf(Double.parseDouble(stockPrice4));
                        } else {
                            valueOf = Double.valueOf(0.0d);
                        }
                        priceInputView2.setPrice(valueOf);
                        StockOrderViewModel stockOrderViewModel2 = (StockOrderViewModel) stockOrderFragment.r();
                        StockOrderInfoResponseDto stockOrderInfoResponseDto4 = (StockOrderInfoResponseDto) ((StockOrderViewModel) stockOrderFragment.r()).J.getValue();
                        if (stockOrderInfoResponseDto4 != null && (stockPrice3 = stockOrderInfoResponseDto4.getStockPrice()) != null) {
                            d10 = Double.parseDouble(stockPrice3);
                        }
                        stockOrderViewModel2.f10242x = d10;
                        stockOrderViewModel2.I.postValue(Double.valueOf(d10));
                        stockOrderViewModel2.F.postValue(Double.valueOf(stockOrderViewModel2.f10241w * stockOrderViewModel2.f10242x));
                        return;
                    }
                    StockOrderViewModel stockOrderViewModel3 = (StockOrderViewModel) stockOrderFragment.r();
                    stockOrderViewModel3.f10242x = doubleValue2;
                    stockOrderViewModel3.I.postValue(Double.valueOf(doubleValue2));
                    stockOrderViewModel3.F.postValue(Double.valueOf(stockOrderViewModel3.f10241w * stockOrderViewModel3.f10242x));
                    return;
                }
                return;
            default:
                if (!((StockOrderViewModel) stockOrderFragment.r()).f10235q && !((StockOrderViewModel) stockOrderFragment.r()).f10236r) {
                    ((StockOrderViewModel) stockOrderFragment.r()).f10237s = true;
                    String valueOf3 = String.valueOf(text);
                    ij.h hVar2 = ij.h.f20067a;
                    String obj2 = w.X(s.n(s.n(s.n(valueOf3, ij.h.d(), HttpUrl.FRAGMENT_ENCODE_SET, false), " ", HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
                    if (obj2 != null && obj2.length() != 0) {
                        try {
                            Double price4 = ((jo) stockOrderFragment.q()).f5160s.L.getPrice();
                            if (price4 != null) {
                                double doubleValue3 = price4.doubleValue();
                                double d13 = 100;
                                String b12 = ij.h.b(d13 - ((doubleValue3 * d13) / ((StockOrderViewModel) stockOrderFragment.r()).f10242x));
                                String b13 = ij.h.b(((StockOrderViewModel) stockOrderFragment.r()).f10242x - doubleValue3);
                                ((jo) stockOrderFragment.q()).f5160s.N.setDisplayValue(String.valueOf(ij.h.a(b12)));
                                ((jo) stockOrderFragment.q()).f5160s.M.setDisplayValue(String.valueOf(ij.h.a(b13)));
                                return;
                            }
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    ((jo) stockOrderFragment.q()).f5160s.M.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    ((jo) stockOrderFragment.q()).f5160s.N.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f27793a;
        StockOrderFragment stockOrderFragment = this.f27794b;
        switch (i10) {
            case 0:
                d((Boolean) obj);
                return Unit.f23355a;
            case 1:
                StockDto stockDto = ((StockDetailDto) obj).getStockDto();
                int i11 = StockOrderFragment.f10219j;
                jo joVar = (jo) stockOrderFragment.q();
                String name = stockDto.getName();
                double ltp = stockDto.getLtp();
                String imageUrl = stockDto.getImageUrl();
                MarketAssetToolbarView marketAssetToolbarView = joVar.f5163v;
                marketAssetToolbarView.m(ltp, name, imageUrl);
                ChangeDto change = stockDto.getChange();
                if (change != null) {
                    marketAssetToolbarView.n(change);
                }
                return Unit.f23355a;
            case 2:
                List list = (List) obj;
                ArrayAdapter arrayAdapter = stockOrderFragment.f10221h;
                if (arrayAdapter != null) {
                    arrayAdapter.addAll(list);
                    ArrayAdapter arrayAdapter2 = stockOrderFragment.f10221h;
                    if (arrayAdapter2 != null) {
                        arrayAdapter2.notifyDataSetChanged();
                        ((jo) stockOrderFragment.q()).f5160s.D.setVisibility(0);
                        ((jo) stockOrderFragment.q()).f5160s.C.setVisibility(0);
                        ((jo) stockOrderFragment.q()).f5160s.D.startAnimation(AnimationUtils.loadAnimation(stockOrderFragment.requireContext(), R.anim.anim_shake_vertically));
                        ((jo) stockOrderFragment.q()).f5160s.C.startAnimation(AnimationUtils.loadAnimation(stockOrderFragment.requireContext(), R.anim.fade_in));
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
                ((jo) stockOrderFragment.q()).f5160s.K.setDisplayValue(String.valueOf((Integer) obj));
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
                n nVar = (n) ((kj.j) obj).a();
                if (nVar != null) {
                    p pVar = nVar.f27802a;
                    if (!pVar.f20086a) {
                        ((jo) stockOrderFragment.q()).f5160s.K.setErrorText(pVar.f20087b);
                    } else {
                        ((jo) stockOrderFragment.q()).f5160s.K.m();
                    }
                    p pVar2 = nVar.f27804c;
                    if (!pVar2.f20086a) {
                        ((jo) stockOrderFragment.q()).f5160s.F.setError(pVar2.f20087b);
                    } else {
                        ((jo) stockOrderFragment.q()).f5160s.F.n();
                    }
                    p pVar3 = nVar.f27805d;
                    if (!pVar3.f20086a) {
                        ((jo) stockOrderFragment.q()).f5160s.N.setErrorText(pVar3.f20087b);
                    } else {
                        ((jo) stockOrderFragment.q()).f5160s.N.m();
                    }
                    p pVar4 = nVar.f27806e;
                    if (!pVar4.f20086a) {
                        ((jo) stockOrderFragment.q()).f5160s.f4192u.setErrorText(pVar4.f20087b);
                    } else {
                        ((jo) stockOrderFragment.q()).f5160s.f4192u.m();
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
                InputView inputView = ((jo) stockOrderFragment.q()).f5160s.f4197z;
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
