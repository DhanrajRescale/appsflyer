package ba;

import android.util.SparseIntArray;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ma extends la {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.background_view, 9);
        sparseIntArray.put(R.id.percentage_layout, 10);
        sparseIntArray.put(R.id.portfolio_balance_layout, 11);
        sparseIntArray.put(R.id.portfolio_balance_text, 12);
        sparseIntArray.put(R.id.portfolio_data_disclaimer, 13);
        sparseIntArray.put(R.id.invested_amount_text, 14);
        sparseIntArray.put(R.id.cash_balance_text, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ma(android.view.View r20) {
        /*
            r19 = this;
            r15 = r19
            r14 = r20
            r1 = 0
            android.util.SparseIntArray r0 = ba.ma.G
            r2 = 16
            r13 = 0
            java.lang.Object[] r16 = m4.m.j(r14, r2, r13, r0)
            r0 = 9
            r0 = r16[r0]
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0 = 15
            r0 = r16[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 8
            r0 = r16[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 3
            r0 = r16[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 4
            r0 = r16[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 2
            r0 = r16[r0]
            r8 = r0
            com.airbnb.lottie.LottieAnimationView r8 = (com.airbnb.lottie.LottieAnimationView) r8
            r0 = 14
            r0 = r16[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 7
            r0 = r16[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 10
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 11
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 12
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 5
            r0 = r16[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 13
            r0 = r16[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 6
            r0 = r16[r0]
            r17 = r0
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            r0 = 1
            r0 = r16[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = r19
            r2 = r20
            r13 = r17
            r14 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1
            r15.F = r0
            android.widget.TextView r0 = r15.f5336u
            r1 = 0
            r0.setTag(r1)
            android.widget.TextView r0 = r15.f5337v
            r0.setTag(r1)
            android.widget.ImageView r0 = r15.f5338w
            r0.setTag(r1)
            com.airbnb.lottie.LottieAnimationView r0 = r15.f5339x
            r0.setTag(r1)
            android.widget.TextView r0 = r15.f5341z
            r0.setTag(r1)
            r0 = 0
            r0 = r16[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r1)
            android.widget.TextView r0 = r15.A
            r0.setTag(r1)
            android.widget.LinearLayout r0 = r15.C
            r0.setTag(r1)
            android.widget.TextView r0 = r15.D
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r20
            r1.setTag(r0, r15)
            r19.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ma.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        double d10;
        double d11;
        double d12;
        String profileStatus;
        String str;
        ChangeDto changeDto;
        String str2;
        String str3;
        int i10;
        int i11;
        double d13;
        double d14;
        String str4;
        String str5;
        ChangeDto changeDto2;
        synchronized (this) {
            j10 = this.F;
            this.F = 0L;
        }
        Portfolio portfolio = this.E;
        long j11 = j10 & 3;
        double d15 = 0.0d;
        Unit unit = null;
        if (j11 != 0) {
            if (portfolio != null) {
                d13 = portfolio.getInvestedAmount();
                str4 = portfolio.getPortfolioStatus();
                str5 = portfolio.getPortfolioName();
                changeDto2 = portfolio.getTotalReturns();
                d14 = portfolio.getCashBalance();
                str2 = portfolio.getAssetClass();
                d12 = portfolio.getPortfolioValue();
            } else {
                d13 = 0.0d;
                d14 = 0.0d;
                d12 = 0.0d;
                str4 = null;
                str5 = null;
                changeDto2 = null;
                str2 = null;
            }
            if (changeDto2 != null) {
                d15 = changeDto2.getPercentage();
            }
            profileStatus = str4;
            ChangeDto changeDto3 = changeDto2;
            str = str5;
            d11 = d13;
            d10 = d15;
            d15 = d14;
            changeDto = changeDto3;
        } else {
            d10 = 0.0d;
            d11 = 0.0d;
            d12 = 0.0d;
            profileStatus = null;
            str = null;
            changeDto = null;
            str2 = null;
        }
        if (j11 != 0) {
            bh.a.b(this.f5336u, Double.valueOf(d15));
            TextView textView = this.f5337v;
            Double valueOf = Double.valueOf(d10);
            Intrinsics.checkNotNullParameter(textView, "<this>");
            if (valueOf == null || (str3 = valueOf.toString()) == null) {
                str3 = "0";
            }
            textView.setText(str3.concat(" %"));
            TextView textView2 = this.f5337v;
            Intrinsics.checkNotNullParameter(textView2, "<this>");
            Intrinsics.checkNotNullParameter(profileStatus, "profileStatus");
            if (Intrinsics.a(profileStatus, "Available")) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView2.setVisibility(i10);
            bh.a.c(this.f5338w, changeDto);
            LottieAnimationView lottieAnimationView = this.f5339x;
            Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
            if (str2 != null) {
                if (Intrinsics.a(str2, "EQUITY")) {
                    lottieAnimationView.setAnimation("portfolio_stocks.json");
                } else if (Intrinsics.a(str2, "OPTIONS")) {
                    lottieAnimationView.setAnimation("portfolio_fno_v2.json");
                } else {
                    lottieAnimationView.setAnimation("portfolio_stocks.json");
                }
            }
            bh.a.b(this.f5341z, Double.valueOf(d11));
            bh.a.b(this.A, Double.valueOf(d12));
            LinearLayout linearLayout = this.C;
            Intrinsics.checkNotNullParameter(linearLayout, "<this>");
            if (str2 != null) {
                if (Intrinsics.a(str2, "EQUITY") || !Intrinsics.a(str2, "OPTIONS")) {
                    i11 = R.drawable.background_portfolio_footer_stocks;
                } else {
                    i11 = R.drawable.background_portfolio_footer_fno;
                }
                linearLayout.setBackground(iu.j.m(linearLayout.getContext(), i11));
                unit = Unit.f23355a;
            }
            if (unit == null) {
                linearLayout.setBackground(iu.j.m(linearLayout.getContext(), R.drawable.background_portfolio_footer_stocks));
            }
            qu.i0.K(this.D, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.m
    public final void h() {
        synchronized (this) {
            this.F = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
