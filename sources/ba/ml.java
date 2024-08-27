package ba;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.SparseIntArray;
import com.assetgro.stockgro.feature_market.domain.model.StockOptionPendingDto;
import com.assetgro.stockgro.feature_market.presentation.fno.OptionPendingOrderViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.DisplayViewV2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ml extends ll {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.transaction_pending_text, 8);
        sparseIntArray.put(R.id.exchange, 9);
        sparseIntArray.put(R.id.first_section, 10);
        sparseIntArray.put(R.id.second_section, 11);
        sparseIntArray.put(R.id.third_section, 12);
        sparseIntArray.put(R.id.view_portfolio, 13);
        sparseIntArray.put(R.id.explore_market, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ml(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ml.D
            r2 = 15
            r12 = 0
            java.lang.Object[] r13 = m4.m.j(r15, r2, r12, r0)
            r0 = 7
            r0 = r13[r0]
            r3 = r0
            com.assetgro.stockgro.widget.DisplayViewV2 r3 = (com.assetgro.stockgro.widget.DisplayViewV2) r3
            r0 = 9
            r0 = r13[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 14
            r0 = r13[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 10
            r0 = r13[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 5
            r0 = r13[r0]
            r5 = r0
            com.assetgro.stockgro.widget.DisplayViewV2 r5 = (com.assetgro.stockgro.widget.DisplayViewV2) r5
            r0 = 4
            r0 = r13[r0]
            r6 = r0
            com.assetgro.stockgro.widget.DisplayViewV2 r6 = (com.assetgro.stockgro.widget.DisplayViewV2) r6
            r0 = 3
            r0 = r13[r0]
            r7 = r0
            com.assetgro.stockgro.widget.DisplayViewV2 r7 = (com.assetgro.stockgro.widget.DisplayViewV2) r7
            r0 = 11
            r0 = r13[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 1
            r0 = r13[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 2
            r0 = r13[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 12
            r0 = r13[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 6
            r0 = r13[r0]
            r10 = r0
            com.assetgro.stockgro.widget.DisplayViewV2 r10 = (com.assetgro.stockgro.widget.DisplayViewV2) r10
            r0 = 8
            r0 = r13[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 13
            r0 = r13[r0]
            r11 = r0
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r14.C = r0
            com.assetgro.stockgro.widget.DisplayViewV2 r0 = r14.f5369s
            r0.setTag(r12)
            r0 = 0
            r0 = r13[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r12)
            com.assetgro.stockgro.widget.DisplayViewV2 r0 = r14.f5371u
            r0.setTag(r12)
            com.assetgro.stockgro.widget.DisplayViewV2 r0 = r14.f5372v
            r0.setTag(r12)
            com.assetgro.stockgro.widget.DisplayViewV2 r0 = r14.f5373w
            r0.setTag(r12)
            android.widget.ImageView r0 = r14.f5374x
            r0.setTag(r12)
            android.widget.TextView r0 = r14.f5375y
            r0.setTag(r12)
            com.assetgro.stockgro.widget.DisplayViewV2 r0 = r14.f5376z
            r0.setTag(r12)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ml.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        double d10;
        int i10;
        String str;
        String str2;
        String str3;
        StockOptionPendingDto stockOptionPendingDto;
        androidx.lifecycle.e0 e0Var;
        StockOptionPendingDto stockOptionPendingDto2;
        String str4;
        double d11;
        int i11;
        int i12;
        synchronized (this) {
            j10 = this.C;
            this.C = 0L;
        }
        OptionPendingOrderViewModel optionPendingOrderViewModel = this.B;
        long j11 = j10 & 7;
        double d12 = 0.0d;
        String str5 = null;
        if (j11 != 0) {
            if (optionPendingOrderViewModel != null) {
                e0Var = optionPendingOrderViewModel.f8580o;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                stockOptionPendingDto2 = (StockOptionPendingDto) e0Var.getValue();
            } else {
                stockOptionPendingDto2 = null;
            }
            if (stockOptionPendingDto2 != null) {
                i11 = stockOptionPendingDto2.getNumberOfLots();
                i12 = stockOptionPendingDto2.getLotNumber();
                d11 = stockOptionPendingDto2.getMarginBalance();
                str2 = stockOptionPendingDto2.getStockOptionName();
                str3 = stockOptionPendingDto2.getOptionIconImageUrl();
                str4 = stockOptionPendingDto2.getOrderType();
                d10 = stockOptionPendingDto2.getPricePerLot();
            } else {
                d10 = 0.0d;
                str2 = null;
                str3 = null;
                str4 = null;
                d11 = 0.0d;
                i11 = 0;
                i12 = 0;
            }
            double d13 = d11;
            str = Integer.toString(i11);
            str5 = str4;
            stockOptionPendingDto = stockOptionPendingDto2;
            i10 = i12;
            d12 = d13;
        } else {
            d10 = 0.0d;
            i10 = 0;
            str = null;
            str2 = null;
            str3 = null;
            stockOptionPendingDto = null;
        }
        if (j11 != 0) {
            DisplayViewV2 displayViewV2 = this.f5369s;
            Intrinsics.checkNotNullParameter(displayViewV2, "<this>");
            ij.h hVar = ij.h.f20067a;
            displayViewV2.setValueText(ij.h.m(hVar, d12));
            this.f5371u.setValueText(str5);
            DisplayViewV2 displayViewV22 = this.f5372v;
            Intrinsics.checkNotNullParameter(displayViewV22, "<this>");
            displayViewV22.setValueText(ij.h.m(hVar, d10));
            DisplayViewV2 displayViewV23 = this.f5373w;
            Intrinsics.checkNotNullParameter(displayViewV23, "<this>");
            String str6 = "Lots (1 Lot = " + i10 + ")";
            SpannableString spannableString = new SpannableString(str6);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-7829368);
            spannableString.setSpan(new ForegroundColorSpan(-16777216), 0, 4, 33);
            spannableString.setSpan(foregroundColorSpan, 4, str6.length(), 33);
            displayViewV23.setTitleText(spannableString);
            this.f5373w.setValueText(str);
            zq.f.W(this.f5374x, str3);
            qu.i0.K(this.f5375y, str2);
            DisplayViewV2 displayViewV24 = this.f5376z;
            Intrinsics.checkNotNullParameter(displayViewV24, "<this>");
            Intrinsics.checkNotNullParameter(stockOptionPendingDto, "stockOptionPendingDto");
            displayViewV24.setValueText(ij.h.m(hVar, stockOptionPendingDto.getPricePerLot() * stockOptionPendingDto.getLotNumber()));
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
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
            this.C = 4L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }
}
