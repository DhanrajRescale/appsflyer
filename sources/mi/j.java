package mi;

import ba.jo;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderFragment;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderViewModel;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import qj.r;

/* loaded from: classes.dex */
public final class j implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockOrderFragment f27796b;

    public /* synthetic */ j(StockOrderFragment stockOrderFragment, int i10) {
        this.f27795a = i10;
        this.f27796b = stockOrderFragment;
    }

    @Override // qj.r
    public final void f(String orderType) {
        int i10;
        Integer g10;
        int i11 = this.f27795a;
        StockOrderFragment stockOrderFragment = this.f27796b;
        switch (i11) {
            case 0:
                if (!((StockOrderViewModel) stockOrderFragment.r()).f10240v && !((StockOrderViewModel) stockOrderFragment.r()).f10239u) {
                    ((StockOrderViewModel) stockOrderFragment.r()).f10238t = true;
                    if (orderType != null && orderType.length() != 0) {
                        try {
                            StockOrderViewModel stockOrderViewModel = (StockOrderViewModel) stockOrderFragment.r();
                            ij.h hVar = ij.h.f20067a;
                            String b10 = ij.h.b(stockOrderViewModel.f10242x + ij.h.a(orderType));
                            StockOrderViewModel stockOrderViewModel2 = (StockOrderViewModel) stockOrderFragment.r();
                            double a10 = ij.h.a(b10);
                            double d10 = stockOrderViewModel2.f10242x;
                            double d11 = 100;
                            String b11 = ij.h.b(((a10 * d11) / d10) - d11);
                            ((jo) stockOrderFragment.q()).f5160s.f4190s.setPrice(Double.valueOf(ij.h.a(b10)));
                            ((jo) stockOrderFragment.q()).f5160s.f4192u.setDisplayValue(String.valueOf(ij.h.a(b11)));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ((jo) stockOrderFragment.q()).f5160s.f4190s.o();
                    ((jo) stockOrderFragment.q()).f5160s.f4192u.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 1:
                if (!((StockOrderViewModel) stockOrderFragment.r()).f10240v && !((StockOrderViewModel) stockOrderFragment.r()).f10238t) {
                    ((StockOrderViewModel) stockOrderFragment.r()).f10239u = true;
                    if (orderType != null && orderType.length() != 0) {
                        try {
                            StockOrderViewModel stockOrderViewModel3 = (StockOrderViewModel) stockOrderFragment.r();
                            ij.h hVar2 = ij.h.f20067a;
                            String b12 = ij.h.b(((ij.h.a(orderType) / 100) + 1) * stockOrderViewModel3.f10242x);
                            String b13 = ij.h.b(ij.h.a(b12) - ((StockOrderViewModel) stockOrderFragment.r()).f10242x);
                            ((jo) stockOrderFragment.q()).f5160s.f4190s.setPrice(Double.valueOf(ij.h.a(b12)));
                            ((jo) stockOrderFragment.q()).f5160s.f4191t.setDisplayValue(String.valueOf(ij.h.a(b13)));
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    ((jo) stockOrderFragment.q()).f5160s.f4190s.o();
                    ((jo) stockOrderFragment.q()).f5160s.f4191t.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 2:
                if (orderType != null && orderType.length() > 0) {
                    StockOrderViewModel stockOrderViewModel4 = (StockOrderViewModel) stockOrderFragment.r();
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    stockOrderViewModel4.H.setValue(orderType);
                    return;
                }
                return;
            case 3:
                if (orderType != null && (g10 = kotlin.text.r.g(orderType)) != null) {
                    i10 = g10.intValue();
                } else {
                    i10 = 0;
                }
                StockOrderViewModel stockOrderViewModel5 = (StockOrderViewModel) stockOrderFragment.r();
                stockOrderViewModel5.f10241w = i10;
                stockOrderViewModel5.F.postValue(Double.valueOf(i10 * stockOrderViewModel5.f10242x));
                return;
            case 4:
                if (!((StockOrderViewModel) stockOrderFragment.r()).f10237s && !((StockOrderViewModel) stockOrderFragment.r()).f10236r) {
                    ((StockOrderViewModel) stockOrderFragment.r()).f10235q = true;
                    if (orderType != null && orderType.length() != 0) {
                        try {
                            StockOrderViewModel stockOrderViewModel6 = (StockOrderViewModel) stockOrderFragment.r();
                            ij.h hVar3 = ij.h.f20067a;
                            String b14 = ij.h.b(stockOrderViewModel6.f10242x - ij.h.a(orderType));
                            StockOrderViewModel stockOrderViewModel7 = (StockOrderViewModel) stockOrderFragment.r();
                            double a11 = ij.h.a(b14);
                            double d12 = stockOrderViewModel7.f10242x;
                            double d13 = 100;
                            String b15 = ij.h.b(d13 - ((a11 * d13) / d12));
                            ((jo) stockOrderFragment.q()).f5160s.L.setPrice(Double.valueOf(ij.h.a(b14)));
                            ((jo) stockOrderFragment.q()).f5160s.N.setDisplayValue(String.valueOf(ij.h.a(b15)));
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    ((jo) stockOrderFragment.q()).f5160s.L.o();
                    ((jo) stockOrderFragment.q()).f5160s.N.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            default:
                if (!((StockOrderViewModel) stockOrderFragment.r()).f10237s && !((StockOrderViewModel) stockOrderFragment.r()).f10235q) {
                    ((StockOrderViewModel) stockOrderFragment.r()).f10236r = true;
                    if (orderType != null && orderType.length() != 0) {
                        try {
                            StockOrderViewModel stockOrderViewModel8 = (StockOrderViewModel) stockOrderFragment.r();
                            ij.h hVar4 = ij.h.f20067a;
                            String b16 = ij.h.b((1 - (ij.h.a(orderType) / 100)) * stockOrderViewModel8.f10242x);
                            String b17 = ij.h.b(((StockOrderViewModel) stockOrderFragment.r()).f10242x - ij.h.a(b16));
                            ((jo) stockOrderFragment.q()).f5160s.L.setPrice(Double.valueOf(ij.h.a(b16)));
                            ((jo) stockOrderFragment.q()).f5160s.M.setDisplayValue(String.valueOf(ij.h.a(b17)));
                            return;
                        } catch (Exception unused4) {
                            return;
                        }
                    }
                    ((jo) stockOrderFragment.q()).f5160s.L.o();
                    ((jo) stockOrderFragment.q()).f5160s.M.setDisplayValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
        }
    }
}
