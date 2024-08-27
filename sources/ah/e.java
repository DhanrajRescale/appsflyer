package ah;

import com.assetgro.stockgro.data.remote.response.ExpiryOption;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioData;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioResponse;
import ij.h;
import iu.k;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import vt.g0;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f427b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f428c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f429d = new e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f430e = new e(3);

    /* renamed from: f, reason: collision with root package name */
    public static final e f431f = new e(4);

    /* renamed from: g, reason: collision with root package name */
    public static final e f432g = new e(5);

    /* renamed from: h, reason: collision with root package name */
    public static final e f433h = new e(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f434a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f434a = i10;
    }

    public final String a(UnlockPortfolioData unlockPortfolioData) {
        String format;
        switch (this.f434a) {
            case 0:
                return unlockPortfolioData.getPortfolioName();
            case 1:
                h hVar = h.f20067a;
                return a3.a.g(h.m(hVar, ((ExpiryOption) g0.u(unlockPortfolioData.getExpiry_options())).getPrice()), " to ", h.m(hVar, ((ExpiryOption) g0.C(unlockPortfolioData.getExpiry_options())).getPrice()));
            default:
                h hVar2 = h.f20067a;
                long portfolioValueLimit = unlockPortfolioData.getPortfolioValueLimit();
                try {
                    if (kj.a.f23207b) {
                        NumberFormat numberFormat = h.f20068b;
                        if (numberFormat != null) {
                            numberFormat.setMaximumFractionDigits(3);
                            if (portfolioValueLimit < 0) {
                                String d10 = h.d();
                                NumberFormat numberFormat2 = h.f20069c;
                                if (numberFormat2 != null) {
                                    String format2 = numberFormat2.format(portfolioValueLimit);
                                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                                    format = "-" + d10 + " " + w.K("-", format2);
                                } else {
                                    Intrinsics.k("numberFormatter");
                                    throw null;
                                }
                            } else {
                                String d11 = h.d();
                                NumberFormat numberFormat3 = h.f20069c;
                                if (numberFormat3 != null) {
                                    format = d11 + " " + numberFormat3.format(portfolioValueLimit);
                                } else {
                                    Intrinsics.k("numberFormatter");
                                    throw null;
                                }
                            }
                        } else {
                            Intrinsics.k("currencyFormatter");
                            throw null;
                        }
                    } else {
                        NumberFormat numberFormat4 = h.f20068b;
                        if (numberFormat4 != null) {
                            numberFormat4.setMaximumFractionDigits(2);
                            NumberFormat numberFormat5 = h.f20068b;
                            if (numberFormat5 != null) {
                                format = numberFormat5.format(portfolioValueLimit);
                            } else {
                                Intrinsics.k("currencyFormatter");
                                throw null;
                            }
                        } else {
                            Intrinsics.k("currencyFormatter");
                            throw null;
                        }
                    }
                    Intrinsics.c(format);
                    return format;
                } catch (IllegalArgumentException unused) {
                    return h.k(2, String.valueOf(portfolioValueLimit));
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f434a) {
            case 0:
                return a((UnlockPortfolioData) obj);
            case 1:
                return a((UnlockPortfolioData) obj);
            case 2:
                return a((UnlockPortfolioData) obj);
            case 3:
                return Unit.f23355a;
            case 4:
                List<UnlockPortfolioData> portfolioData = ((UnlockPortfolioResponse) obj).getPortfolioData();
                if (portfolioData != null && !portfolioData.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 5:
                return ((UnlockPortfolioResponse) obj).getPortfolioData();
            default:
                return ((UnlockPortfolioResponse) obj).getWalletData();
        }
    }
}
