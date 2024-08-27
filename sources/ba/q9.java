package ba;

import android.graphics.PorterDuff;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q9 extends p9 {
    public static final SparseIntArray K;
    public final View I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.league_name_layout, 16);
        sparseIntArray.put(R.id.percentage_layout, 17);
        sparseIntArray.put(R.id.portfolio_value_container, 18);
        sparseIntArray.put(R.id.portfolio_data_disclaimer, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q9(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.q9.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        double d10;
        double d11;
        String profileStatus;
        ChangeDto changeDto;
        String str;
        String str2;
        String str3;
        double d12;
        double d13;
        int color;
        int i10;
        String str4;
        int i11;
        int i12;
        String string;
        int i13;
        int color2;
        int i14;
        double d14;
        double d15;
        String str5;
        synchronized (this) {
            j10 = this.J;
            this.J = 0L;
        }
        Portfolio portfolio = this.H;
        long j11 = j10 & 3;
        double d16 = 0.0d;
        ChangeDto changeDto2 = null;
        if (j11 != 0) {
            if (portfolio != null) {
                double investedAmount = portfolio.getInvestedAmount();
                String portfolioStatus = portfolio.getPortfolioStatus();
                str5 = portfolio.getPortfolioName();
                ChangeDto totalReturns = portfolio.getTotalReturns();
                d15 = portfolio.getCashBalance();
                str2 = portfolio.getAssetClass();
                str3 = portfolio.getLeagueName();
                d11 = portfolio.getPortfolioValue();
                profileStatus = portfolioStatus;
                d14 = investedAmount;
                changeDto2 = totalReturns;
            } else {
                d14 = 0.0d;
                d15 = 0.0d;
                d11 = 0.0d;
                profileStatus = null;
                str5 = null;
                str2 = null;
                str3 = null;
            }
            if (changeDto2 != null) {
                d16 = changeDto2.getPercentage();
            }
            changeDto = changeDto2;
            double d17 = d15;
            str = str5;
            d10 = d14;
            d12 = d16;
            d16 = d17;
        } else {
            d10 = 0.0d;
            d11 = 0.0d;
            profileStatus = null;
            changeDto = null;
            str = null;
            str2 = null;
            str3 = null;
            d12 = 0.0d;
        }
        if (j11 != 0) {
            ConstraintLayout constraintLayout = this.f5733s;
            Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
            Intrinsics.checkNotNullParameter(profileStatus, "profileStatus");
            String[] strArr = bh.a.f6972a;
            boolean o10 = vt.v.o(strArr, profileStatus);
            String str6 = str;
            int i15 = R.color.white;
            if (o10) {
                d13 = d11;
                color = r3.k.getColor(constraintLayout.getContext(), R.color.white);
            } else {
                d13 = d11;
                color = r3.k.getColor(constraintLayout.getContext(), R.color.grey_827F92);
            }
            constraintLayout.setBackgroundColor(color);
            bh.a.a(this.f5734t, str2);
            TextView textView = this.f5734t;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            boolean o11 = vt.v.o(strArr, profileStatus);
            int i16 = R.color.white_FFFFFF_60;
            if (o11) {
                i10 = R.color.grey_696969;
            } else {
                i10 = R.color.white_FFFFFF_60;
            }
            a3.a.s(textView, i10);
            bh.a.b(this.f5735u, Double.valueOf(d16));
            bh.a.f(this.f5735u, profileStatus);
            TextView textView2 = this.f5736v;
            Double valueOf = Double.valueOf(d12);
            Intrinsics.checkNotNullParameter(textView2, "<this>");
            if (valueOf == null || (str4 = valueOf.toString()) == null) {
                str4 = "0";
            }
            textView2.setText(str4.concat(" %"));
            TextView textView3 = this.f5736v;
            Intrinsics.checkNotNullParameter(textView3, "<this>");
            Intrinsics.checkNotNullParameter(profileStatus, "profileStatus");
            if (Intrinsics.a(profileStatus, "Available")) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            textView3.setVisibility(i11);
            bh.a.f(this.f5736v, profileStatus);
            bh.a.c(this.f5737w, changeDto);
            ImageView imageView = this.f5738x;
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            if (vt.v.o(strArr, profileStatus)) {
                i12 = R.drawable.ic_portfolio_active;
            } else {
                i12 = R.drawable.ic_portfolio_inactive;
            }
            imageView.setImageDrawable(iu.j.m(imageView.getContext(), i12));
            TextView textView4 = this.f5739y;
            Intrinsics.checkNotNullParameter(textView4, "<this>");
            if (Intrinsics.a(str2, "EQUITY")) {
                string = textView4.getContext().getString(R.string.invested_amount);
            } else if (Intrinsics.a(str2, "OPTIONS")) {
                string = textView4.getContext().getString(R.string.margin_utilised);
            } else {
                string = textView4.getContext().getString(R.string.cash_balance);
            }
            textView4.setText(string);
            TextView textView5 = this.f5739y;
            Intrinsics.checkNotNullParameter(textView5, "<this>");
            if (vt.v.o(strArr, profileStatus)) {
                i16 = R.color.grey_696969;
            }
            a3.a.s(textView5, i16);
            bh.a.b(this.f5740z, Double.valueOf(d10));
            bh.a.f(this.f5740z, profileStatus);
            TextView textView6 = this.A;
            Intrinsics.checkNotNullParameter(textView6, "<this>");
            if (vt.v.o(strArr, profileStatus)) {
                i13 = R.color.purple_803AFF;
            } else {
                i13 = R.color.white;
            }
            a3.a.s(textView6, i13);
            TextView textView7 = this.A;
            Intrinsics.checkNotNullParameter(textView7, "<this>");
            if (str3 != null && str3.length() != 0) {
                textView7.setText(str3);
            } else {
                textView7.setText(textView7.getContext().getString(R.string.not_linked_to_any_league));
            }
            View view = this.I;
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (vt.v.o(strArr, profileStatus)) {
                color2 = r3.k.getColor(view.getContext(), R.color.black_1A1A1A_20);
            } else {
                color2 = r3.k.getColor(view.getContext(), R.color.white_EBEBEB_10);
            }
            view.setBackgroundColor(color2);
            TextView textView8 = this.B;
            Intrinsics.checkNotNullParameter(textView8, "<this>");
            if (vt.v.o(strArr, profileStatus)) {
                i14 = R.color.grey_A0A0A0;
            } else {
                i14 = R.color.white_FFFFFF_40;
            }
            a3.a.s(textView8, i14);
            bh.a.b(this.C, Double.valueOf(d13));
            bh.a.f(this.C, profileStatus);
            LinearLayout linearLayout = this.E;
            Intrinsics.checkNotNullParameter(linearLayout, "<this>");
            if (vt.v.o(strArr, profileStatus)) {
                linearLayout.setBackgroundResource(R.drawable.background_portfolio_footer_active);
            } else {
                linearLayout.setBackgroundResource(R.drawable.background_portfolio_footer_inactive);
            }
            ImageView imageView2 = this.F;
            Intrinsics.checkNotNullParameter(imageView2, "<this>");
            imageView2.setImageDrawable(iu.j.m(imageView2.getContext(), R.drawable.ic_link));
            if (vt.v.o(strArr, profileStatus)) {
                i15 = R.color.purple_803AFF;
            }
            imageView2.setColorFilter(r3.k.getColor(imageView2.getContext(), i15), PorterDuff.Mode.SRC_IN);
            bh.a.f(this.G, profileStatus);
            qu.i0.K(this.G, str6);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.J != 0) {
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
            this.J = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
