package xi;

import ba.zo;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderViewModel;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import qj.r;

/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockShortSellOrderFragment f40270b;

    public /* synthetic */ e(StockShortSellOrderFragment stockShortSellOrderFragment, int i10) {
        this.f40269a = i10;
        this.f40270b = stockShortSellOrderFragment;
    }

    @Override // qj.r
    public final void f(String orderType) {
        int i10;
        Integer g10;
        int i11 = this.f40269a;
        StockShortSellOrderFragment stockShortSellOrderFragment = this.f40270b;
        switch (i11) {
            case 0:
                if (!((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10434v && !((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10433u) {
                    ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10432t = true;
                    if (orderType != null && orderType.length() != 0) {
                        try {
                            StockShortSellOrderViewModel stockShortSellOrderViewModel = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                            ij.h hVar = ij.h.f20067a;
                            String b10 = ij.h.b(stockShortSellOrderViewModel.f10436x - ij.h.a(orderType));
                            StockShortSellOrderViewModel stockShortSellOrderViewModel2 = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                            double a10 = ij.h.a(b10);
                            double d10 = stockShortSellOrderViewModel2.f10436x;
                            double d11 = 100;
                            String b11 = ij.h.b(d11 - ((a10 * d11) / d10));
                            ((zo) stockShortSellOrderFragment.q()).f6870s.f4806s.setPrice(Double.valueOf(ij.h.a(b10)));
                            ((zo) stockShortSellOrderFragment.q()).f6870s.f4808u.setDisplayValue(String.valueOf(ij.h.a(b11)));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ((zo) stockShortSellOrderFragment.q()).f6870s.f4806s.o();
                    ((zo) stockShortSellOrderFragment.q()).f6870s.f4808u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 1:
                if (!((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10434v && !((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10432t) {
                    ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10433u = true;
                    if (orderType != null && orderType.length() != 0) {
                        try {
                            StockShortSellOrderViewModel stockShortSellOrderViewModel3 = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                            ij.h hVar2 = ij.h.f20067a;
                            String b12 = ij.h.b((1 - (ij.h.a(orderType) / 100)) * stockShortSellOrderViewModel3.f10436x);
                            String b13 = ij.h.b(((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10436x - ij.h.a(b12));
                            ((zo) stockShortSellOrderFragment.q()).f6870s.f4806s.setPrice(Double.valueOf(ij.h.a(b12)));
                            ((zo) stockShortSellOrderFragment.q()).f6870s.f4807t.setDisplayValue(String.valueOf(ij.h.a(b13)));
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    ((zo) stockShortSellOrderFragment.q()).f6870s.f4806s.o();
                    ((zo) stockShortSellOrderFragment.q()).f6870s.f4807t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 2:
                if (orderType != null && orderType.length() > 0) {
                    StockShortSellOrderViewModel stockShortSellOrderViewModel4 = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    stockShortSellOrderViewModel4.H.setValue(orderType);
                    return;
                }
                return;
            case 3:
                if (orderType != null && (g10 = kotlin.text.r.g(orderType)) != null) {
                    i10 = g10.intValue();
                } else {
                    i10 = 0;
                }
                StockShortSellOrderViewModel stockShortSellOrderViewModel5 = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                stockShortSellOrderViewModel5.f10435w = i10;
                stockShortSellOrderViewModel5.F.postValue(Double.valueOf(i10 * stockShortSellOrderViewModel5.f10436x));
                return;
            case 4:
                if (!((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10431s && !((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10430r) {
                    ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10429q = true;
                    if (orderType != null && orderType.length() != 0) {
                        try {
                            StockShortSellOrderViewModel stockShortSellOrderViewModel6 = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                            ij.h hVar3 = ij.h.f20067a;
                            String b14 = ij.h.b(stockShortSellOrderViewModel6.f10436x + ij.h.a(orderType));
                            StockShortSellOrderViewModel stockShortSellOrderViewModel7 = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                            double a11 = ij.h.a(b14);
                            double d12 = stockShortSellOrderViewModel7.f10436x;
                            double d13 = 100;
                            String b15 = ij.h.b(((a11 * d13) / d12) - d13);
                            ((zo) stockShortSellOrderFragment.q()).f6870s.M.setPrice(Double.valueOf(ij.h.a(b14)));
                            ((zo) stockShortSellOrderFragment.q()).f6870s.O.setDisplayValue(String.valueOf(ij.h.a(b15)));
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    ((zo) stockShortSellOrderFragment.q()).f6870s.M.o();
                    ((zo) stockShortSellOrderFragment.q()).f6870s.O.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            default:
                if (!((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10431s && !((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10429q) {
                    ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10430r = true;
                    if (orderType != null && orderType.length() != 0) {
                        try {
                            StockShortSellOrderViewModel stockShortSellOrderViewModel8 = (StockShortSellOrderViewModel) stockShortSellOrderFragment.r();
                            ij.h hVar4 = ij.h.f20067a;
                            String b16 = ij.h.b(((ij.h.a(orderType) / 100) + 1) * stockShortSellOrderViewModel8.f10436x);
                            String b17 = ij.h.b(ij.h.a(b16) - ((StockShortSellOrderViewModel) stockShortSellOrderFragment.r()).f10436x);
                            ((zo) stockShortSellOrderFragment.q()).f6870s.M.setPrice(Double.valueOf(ij.h.a(b16)));
                            ((zo) stockShortSellOrderFragment.q()).f6870s.N.setDisplayValue(String.valueOf(ij.h.a(b17)));
                            return;
                        } catch (Exception unused4) {
                            return;
                        }
                    }
                    ((zo) stockShortSellOrderFragment.q()).f6870s.M.o();
                    ((zo) stockShortSellOrderFragment.q()).f6870s.N.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
        }
    }
}
