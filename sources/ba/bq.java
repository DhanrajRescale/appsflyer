package ba;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.assetgro.stockgro.data.remote.response.AmountDetailDto;
import com.assetgro.stockgro.data.remote.response.TransactionBeneficiary;
import com.assetgro.stockgro.data.remote.response.TransactionDetailAmountDto;
import com.assetgro.stockgro.data.remote.response.TransactionDetailResponse;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.transactions.detail.WalletTransactionDetailViewModel;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class bq extends aq {
    public static final SparseIntArray T;
    public final Group R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 22);
        sparseIntArray.put(R.id.toolbar, 23);
        sparseIntArray.put(R.id.transaction_container, 24);
        sparseIntArray.put(R.id.data_container, 25);
        sparseIntArray.put(R.id.transaction_icon, 26);
        sparseIntArray.put(R.id.transaction_id_title, 27);
        sparseIntArray.put(R.id.separator_one, 28);
        sparseIntArray.put(R.id.cash_bifurcation_icon, 29);
        sparseIntArray.put(R.id.separator_two, 30);
        sparseIntArray.put(R.id.animation_background, 31);
        sparseIntArray.put(R.id.transaction_status_lottie, 32);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bq(android.view.View r30) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.bq.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        long j11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String url;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        androidx.lifecycle.d0 d0Var;
        androidx.lifecycle.e0 e0Var;
        TransactionDetailResponse transactionDetailResponse;
        TransactionDetailAmountDto transactionDetailAmountDto;
        TransactionBeneficiary transactionBeneficiary;
        boolean z10;
        AmountDetailDto amountDetailDto;
        AmountDetailDto amountDetailDto2;
        AmountDetailDto amountDetailDto3;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        synchronized (this) {
            j10 = this.S;
            this.S = 0L;
        }
        WalletTransactionDetailViewModel walletTransactionDetailViewModel = this.Q;
        int i20 = 0;
        String str28 = null;
        if ((15 & j10) != 0) {
            long j18 = j10 & 13;
            if (j18 != 0) {
                if (walletTransactionDetailViewModel != null) {
                    e0Var = walletTransactionDetailViewModel.f9724p;
                } else {
                    e0Var = null;
                }
                q(0, e0Var);
                if (e0Var != null) {
                    transactionDetailResponse = (TransactionDetailResponse) e0Var.getValue();
                } else {
                    transactionDetailResponse = null;
                }
                if (transactionDetailResponse != null) {
                    str14 = transactionDetailResponse.getStatus();
                    str15 = transactionDetailResponse.getRemark();
                    transactionDetailAmountDto = transactionDetailResponse.getAmount();
                    transactionBeneficiary = transactionDetailResponse.getBeneficiary();
                    str17 = transactionDetailResponse.getTitle();
                    str18 = transactionDetailResponse.getTxnID();
                    j11 = transactionDetailResponse.getDate();
                } else {
                    j11 = 0;
                    str14 = null;
                    str15 = null;
                    transactionDetailAmountDto = null;
                    transactionBeneficiary = null;
                    str17 = null;
                    str18 = null;
                }
                if (transactionDetailResponse == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (j18 != 0) {
                    if (z10) {
                        j17 = 128;
                    } else {
                        j17 = 64;
                    }
                    j10 |= j17;
                }
                if (transactionDetailAmountDto != null) {
                    amountDetailDto = transactionDetailAmountDto.getCash();
                    amountDetailDto3 = transactionDetailAmountDto.getBonus();
                    amountDetailDto2 = transactionDetailAmountDto.getDeposit();
                } else {
                    amountDetailDto = null;
                    amountDetailDto2 = null;
                    amountDetailDto3 = null;
                }
                if (transactionBeneficiary != null) {
                    str20 = transactionBeneficiary.getBeneficiaryTitle();
                    str21 = transactionBeneficiary.getBeneficiaryIcon();
                    str22 = transactionBeneficiary.getDetail();
                    str23 = transactionBeneficiary.getSectionTitle();
                } else {
                    str20 = null;
                    str21 = null;
                    str22 = null;
                    str23 = null;
                }
                if (transactionBeneficiary == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i17 = 8;
                if (z10) {
                    i15 = 8;
                } else {
                    i15 = 0;
                }
                if ((j10 & 13) != 0) {
                    if (z11) {
                        j16 = 8192;
                    } else {
                        j16 = 4096;
                    }
                    j10 |= j16;
                }
                if (amountDetailDto != null) {
                    str24 = amountDetailDto.getTitle();
                    str25 = amountDetailDto.getValue();
                } else {
                    str24 = null;
                    str25 = null;
                }
                if (amountDetailDto == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (amountDetailDto3 == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (amountDetailDto2 == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z11) {
                    i16 = 8;
                } else {
                    i16 = 0;
                }
                if ((j10 & 13) != 0) {
                    if (z12) {
                        j15 = 2048;
                    } else {
                        j15 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                    }
                    j10 |= j15;
                }
                if ((j10 & 13) != 0) {
                    if (z13) {
                        j14 = 512;
                    } else {
                        j14 = 256;
                    }
                    j10 |= j14;
                }
                if ((j10 & 13) != 0) {
                    if (z14) {
                        j13 = 32768;
                    } else {
                        j13 = Http2Stream.EMIT_BUFFER_SIZE;
                    }
                    j10 |= j13;
                }
                if (amountDetailDto3 != null) {
                    str26 = amountDetailDto3.getValue();
                    str19 = amountDetailDto3.getTitle();
                } else {
                    str19 = null;
                    str26 = null;
                }
                if (amountDetailDto2 != null) {
                    str27 = amountDetailDto2.getValue();
                    str16 = amountDetailDto2.getTitle();
                } else {
                    str16 = null;
                    str27 = null;
                }
                if (str22 != null) {
                    z15 = str22.isEmpty();
                } else {
                    z15 = false;
                }
                if ((j10 & 13) != 0) {
                    if (z15) {
                        j12 = 32;
                    } else {
                        j12 = 16;
                    }
                    j10 |= j12;
                }
                if (z12) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                if (z13) {
                    i18 = 8;
                } else {
                    i18 = 0;
                }
                if (z14) {
                    i19 = 8;
                } else {
                    i19 = 0;
                }
                if (!z15) {
                    i17 = 0;
                }
            } else {
                j11 = 0;
                i10 = 0;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                str14 = null;
                str15 = null;
                str16 = null;
                str17 = null;
                str18 = null;
                str19 = null;
                str20 = null;
                str21 = null;
                str22 = null;
                str23 = null;
                str24 = null;
                str25 = null;
                str26 = null;
                str27 = null;
            }
            if ((j10 & 14) != 0) {
                if (walletTransactionDetailViewModel != null) {
                    d0Var = walletTransactionDetailViewModel.f9725q;
                } else {
                    d0Var = null;
                }
                q(1, d0Var);
                if (d0Var != null) {
                    str28 = (String) d0Var.getValue();
                }
            }
            str13 = str28;
            i13 = i15;
            str10 = str14;
            str11 = str15;
            str7 = str16;
            i20 = i16;
            str12 = str17;
            str9 = str18;
            str2 = str19;
            str = str20;
            url = str21;
            str28 = str22;
            str4 = str23;
            i12 = i17;
            str6 = str24;
            str5 = str25;
            i11 = i18;
            i14 = i19;
            str3 = str26;
            str8 = str27;
        } else {
            j11 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            url = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            str12 = null;
            str13 = null;
        }
        if ((13 & j10) != 0) {
            this.f4218s.setVisibility(i20);
            qu.i0.K(this.f4219t, str28);
            this.f4219t.setVisibility(i12);
            ImageView imageView = this.f4220u;
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            if (url != null) {
                Intrinsics.checkNotNullParameter(imageView, "<this>");
                Intrinsics.checkNotNullParameter(url, "url");
                com.bumptech.glide.b.f(imageView).m(url).z(imageView);
            }
            qu.i0.K(this.f4221v, str);
            this.f4222w.setVisibility(i11);
            qu.i0.K(this.f4223x, str2);
            qu.i0.K(this.f4224y, str3);
            this.f4225z.setVisibility(i10);
            qu.i0.K(this.B, str6);
            qu.i0.K(this.C, str5);
            qu.i0.K(this.D, str4);
            this.E.setVisibility(i14);
            qu.i0.K(this.F, str7);
            qu.i0.K(this.G, str8);
            this.R.setVisibility(i13);
            TextView textView = this.K;
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(textView, "<this>");
            if (valueOf != null) {
                valueOf.longValue();
                jv.a b10 = jv.a.b("dd MMM yyyy hh:mm a");
                Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
                hv.e l10 = hv.e.l(0, valueOf.longValue());
                hv.q p10 = hv.q.p();
                l10.getClass();
                textView.setText(b10.a(hv.t.p(l10, p10)));
            }
            qu.i0.K(this.L, str9);
            TextView textView2 = this.M;
            Intrinsics.checkNotNullParameter(textView2, "<this>");
            Context context = textView2.getContext();
            int i21 = R.color.transaction_success;
            String str29 = str10;
            if (str29 != null) {
                int hashCode = str29.hashCode();
                if (hashCode != -1149187101) {
                    if (hashCode != 35394935) {
                        if (hashCode == 2066319421 && str29.equals("FAILED")) {
                            i21 = R.color.transaction_failed;
                        }
                    } else if (str29.equals("PENDING")) {
                        i21 = R.color.transaction_pending;
                    }
                } else {
                    str29.equals("SUCCESS");
                }
            }
            textView2.setTextColor(r3.k.getColor(context, i21));
            qu.i0.K(this.M, str11);
            al.d.P0(this.N, str29);
            qu.i0.K(this.P, str12);
        }
        if ((j10 & 14) != 0) {
            qu.i0.K(this.I, str13);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.S != 0) {
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
            this.S = 8L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.S |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.S |= 1;
        }
        return true;
    }
}
