package ba;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.data.model.WalletTransaction;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.transactions.detail.WalletTransactionDetailFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class td extends sd {
    public static final SparseIntArray E;
    public final ImageView C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.transaction_month_heading, 8);
        sparseIntArray.put(R.id.wallet_transaction_container, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public td(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.td.E
            r2 = 10
            r11 = 0
            java.lang.Object[] r12 = m4.m.j(r14, r2, r11, r0)
            r0 = 7
            r0 = r12[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 1
            r0 = r12[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 4
            r0 = r12[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2
            r0 = r12[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 8
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r12[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 3
            r0 = r12[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 9
            r0 = r12[r0]
            r10 = r0
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r13.D = r0
            android.widget.TextView r0 = r13.f6060s
            r0.setTag(r11)
            android.widget.ImageView r0 = r13.f6061t
            r0.setTag(r11)
            r0 = 0
            r0 = r12[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r11)
            r0 = 5
            r0 = r12[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r13.C = r0
            r0.setTag(r11)
            android.widget.TextView r0 = r13.f6062u
            r0.setTag(r11)
            android.widget.TextView r0 = r13.f6063v
            r0.setTag(r11)
            android.widget.TextView r0 = r13.f6065x
            r0.setTag(r11)
            android.widget.TextView r0 = r13.f6066y
            r0.setTag(r11)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.td.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String transactionStatus;
        Drawable drawable;
        String str;
        String str2;
        int i10;
        long j11;
        String f10;
        int i11;
        String str3;
        boolean z10;
        boolean z11;
        Context context;
        int i12;
        long j12;
        long j13;
        synchronized (this) {
            j10 = this.D;
            this.D = 0L;
        }
        WalletTransaction data = this.A;
        long j14 = j10 & 3;
        String creditOrDebit = null;
        if (j14 != 0) {
            if (data != null) {
                String title = data.getTitle();
                String txnStatus = data.getTxnStatus();
                str2 = data.getSubTitle();
                j11 = data.getTxnDate();
                str3 = data.getType();
                str = title;
                creditOrDebit = txnStatus;
            } else {
                j11 = 0;
                str = null;
                str2 = null;
                str3 = null;
            }
            if (creditOrDebit != null) {
                z11 = creditOrDebit.equals("SUCCESS");
                z10 = creditOrDebit.equals("PENDING");
            } else {
                z10 = false;
                z11 = false;
            }
            if (j14 != 0) {
                if (z11) {
                    j13 = 8;
                } else {
                    j13 = 4;
                }
                j10 |= j13;
            }
            if ((j10 & 3) != 0) {
                if (z10) {
                    j12 = 32;
                } else {
                    j12 = 16;
                }
                j10 |= j12;
            }
            if (z11) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            if (z10) {
                context = this.C.getContext();
                i12 = R.drawable.ic_transaction_pending_new;
            } else {
                context = this.C.getContext();
                i12 = R.drawable.ic_transaction_failed;
            }
            drawable = iu.j.m(context, i12);
            transactionStatus = creditOrDebit;
            creditOrDebit = str3;
        } else {
            transactionStatus = null;
            drawable = null;
            str = null;
            str2 = null;
            i10 = 0;
            j11 = 0;
        }
        if ((j10 & 3) != 0) {
            TextView textView = this.f6060s;
            int i13 = WalletTransactionDetailFragment.f9720h;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            Intrinsics.checkNotNullParameter(data, "data");
            if (Intrinsics.a(data.getType(), "cr")) {
                f10 = a3.a.f("+", data.getTxnAmount());
            } else {
                f10 = a3.a.f("-", data.getTxnAmount());
            }
            textView.setText(f10);
            Context context2 = textView.getContext();
            if (Intrinsics.a(data.getTxnStatus(), "FAILED")) {
                i11 = R.color.black_1A1A1A_60;
            } else if (Intrinsics.a(data.getType(), "cr")) {
                i11 = R.color.undervalues_color;
            } else {
                i11 = R.color.overvalued_color;
            }
            textView.setTextColor(r3.k.getColor(context2, i11));
            ImageView imageView = this.f6061t;
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(creditOrDebit, "creditOrDebit");
            Intrinsics.checkNotNullParameter(transactionStatus, "transactionStatus");
            boolean a10 = Intrinsics.a(creditOrDebit, "cr");
            int i14 = R.drawable.ic_diagonal_arrow_bottom_right_black;
            if (a10) {
                int hashCode = transactionStatus.hashCode();
                if (hashCode != -1149187101) {
                    if (hashCode != 35394935) {
                        if (hashCode == 2066319421) {
                            transactionStatus.equals("FAILED");
                        }
                    } else {
                        transactionStatus.equals("PENDING");
                    }
                } else if (transactionStatus.equals("SUCCESS")) {
                    i14 = R.drawable.ic_diagonal_arrow_bottom_right_green;
                }
            } else if (Intrinsics.a(creditOrDebit, "dr")) {
                int hashCode2 = transactionStatus.hashCode();
                i14 = R.drawable.ic_diagonal_arrow_top_left_black;
                if (hashCode2 != -1149187101) {
                    if (hashCode2 != 35394935) {
                        if (hashCode2 == 2066319421) {
                            transactionStatus.equals("FAILED");
                        }
                    } else {
                        transactionStatus.equals("PENDING");
                    }
                } else if (transactionStatus.equals("SUCCESS")) {
                    i14 = R.drawable.ic_diagonal_arrow_top_left_red;
                }
            }
            imageView.setImageResource(i14);
            this.C.setImageDrawable(drawable);
            this.C.setVisibility(i10);
            qu.i0.K(this.f6062u, str2);
            qu.i0.K(this.f6063v, str);
            al.d.P0(this.f6065x, transactionStatus);
            qu.i0.K(this.f6065x, str2);
            this.f6065x.setVisibility(i10);
            TextView textView2 = this.f6066y;
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(textView2, "<this>");
            if (valueOf != null) {
                valueOf.longValue();
                jv.a b10 = jv.a.b("dd MMM, hh:mm a");
                Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
                hv.e l10 = hv.e.l(0, valueOf.longValue());
                hv.q p10 = hv.q.p();
                l10.getClass();
                textView2.setText(b10.a(hv.t.p(l10, p10)));
            }
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.D != 0) {
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
            this.D = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
