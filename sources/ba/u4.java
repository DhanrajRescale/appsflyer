package ba;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.portfolio.ExpiryWalletDetailData;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.model.portfolio.WalletCta;
import com.assetgro.stockgro.data.model.portfolio.WalletExpiryData;
import com.assetgro.stockgro.data.model.portfolio.WalletHomeAnnouncement;
import com.assetgro.stockgro.data.model.portfolio.WalletUIData;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class u4 extends t4 {

    /* renamed from: j0, reason: collision with root package name */
    public static final SparseIntArray f6268j0;

    /* renamed from: f0, reason: collision with root package name */
    public final ConstraintLayout f6269f0;

    /* renamed from: g0, reason: collision with root package name */
    public final TextView f6270g0;

    /* renamed from: h0, reason: collision with root package name */
    public final TextView f6271h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f6272i0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6268j0 = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 18);
        sparseIntArray.put(R.id.toolbar, 19);
        sparseIntArray.put(R.id.swipe_refresh_layout, 20);
        sparseIntArray.put(R.id.wallet_home_nested_scroll_view, 21);
        sparseIntArray.put(R.id.kyc_header, 22);
        sparseIntArray.put(R.id.user_image, 23);
        sparseIntArray.put(R.id.user_name_text, 24);
        sparseIntArray.put(R.id.kyc_action, 25);
        sparseIntArray.put(R.id.kyc_action_icon, 26);
        sparseIntArray.put(R.id.bonus_icon, 27);
        sparseIntArray.put(R.id.redeem, 28);
        sparseIntArray.put(R.id.separator_1, 29);
        sparseIntArray.put(R.id.deposit_icon, 30);
        sparseIntArray.put(R.id.add_money, 31);
        sparseIntArray.put(R.id.not_available_add_money_message, 32);
        sparseIntArray.put(R.id.separator_2, 33);
        sparseIntArray.put(R.id.sg_cash_icon, 34);
        sparseIntArray.put(R.id.not_available_withdraw_message, 35);
        sparseIntArray.put(R.id.know_your_withdrawal_limit_card, 36);
        sparseIntArray.put(R.id.detail_icon, 37);
        sparseIntArray.put(R.id.my_earning_container, 38);
        sparseIntArray.put(R.id.my_earning_image, 39);
        sparseIntArray.put(R.id.my_earning_image_text, 40);
        sparseIntArray.put(R.id.my_earning, 41);
        sparseIntArray.put(R.id.transaction_history_container, 42);
        sparseIntArray.put(R.id.transaction_history_title, 43);
        sparseIntArray.put(R.id.transaction_history_sub_title, 44);
        sparseIntArray.put(R.id.transaction_icon, 45);
        sparseIntArray.put(R.id.subscription_bullet_in_container, 46);
        sparseIntArray.put(R.id.subscription_bullet_in_view_pager, 47);
        sparseIntArray.put(R.id.subscription_bullet_in_indicator, 48);
        sparseIntArray.put(R.id.add_container, 49);
        sparseIntArray.put(R.id.add_view_pager, 50);
        sparseIntArray.put(R.id.add_indicator, 51);
        sparseIntArray.put(R.id.certificate_title, 52);
        sparseIntArray.put(R.id.certificate_sub_title, 53);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u4(android.view.View r44) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.u4.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ExpiryWalletDetailData expiryWalletDetailData;
        String str9;
        String str10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        androidx.lifecycle.e0 e0Var;
        Boolean bool;
        int i22;
        long j11;
        androidx.lifecycle.e0 e0Var2;
        WalletBalanceResponseDto walletBalanceResponseDto;
        WalletUIData walletUIData;
        WalletHomeAnnouncement walletHomeAnnouncement;
        WalletUIData walletUIData2;
        WalletUIData walletUIData3;
        WalletExpiryData walletExpiryData;
        WalletCta walletCta;
        boolean z10;
        boolean z11;
        boolean z12;
        WalletCta walletCta2;
        long j12;
        long j13;
        long j14;
        long j15;
        androidx.lifecycle.e0 e0Var3;
        Boolean bool2;
        long j16;
        synchronized (this) {
            j10 = this.f6272i0;
            this.f6272i0 = 0L;
        }
        WalletHomeViewModel walletHomeViewModel = this.f6146e0;
        int i23 = 0;
        if ((31 & j10) != 0) {
            long j17 = j10 & 25;
            if (j17 != 0) {
                if (walletHomeViewModel != null) {
                    e0Var3 = walletHomeViewModel.D;
                } else {
                    e0Var3 = null;
                }
                q(0, e0Var3);
                if (e0Var3 != null) {
                    bool2 = (Boolean) e0Var3.getValue();
                } else {
                    bool2 = null;
                }
                boolean o10 = m4.m.o(bool2);
                if (j17 != 0) {
                    if (o10) {
                        j16 = 65792;
                    } else {
                        j16 = 32896;
                    }
                    j10 |= j16;
                }
                if (o10) {
                    i16 = 8;
                } else {
                    i16 = 0;
                }
                if (o10) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
            } else {
                i16 = 0;
                i17 = 0;
            }
            long j18 = j10 & 26;
            if (j18 != 0) {
                if (walletHomeViewModel != null) {
                    e0Var2 = walletHomeViewModel.f9654t;
                } else {
                    e0Var2 = null;
                }
                boolean z13 = true;
                q(1, e0Var2);
                if (e0Var2 != null) {
                    walletBalanceResponseDto = (WalletBalanceResponseDto) e0Var2.getValue();
                } else {
                    walletBalanceResponseDto = null;
                }
                if (walletBalanceResponseDto != null) {
                    str6 = walletBalanceResponseDto.getWithdrawLimitTitle();
                    walletHomeAnnouncement = walletBalanceResponseDto.getAnnouncement();
                    walletUIData2 = walletBalanceResponseDto.getCash();
                    walletUIData3 = walletBalanceResponseDto.getBonus();
                    walletExpiryData = walletBalanceResponseDto.getExpiry();
                    walletUIData = walletBalanceResponseDto.getDeposit();
                } else {
                    walletUIData = null;
                    str6 = null;
                    walletHomeAnnouncement = null;
                    walletUIData2 = null;
                    walletUIData3 = null;
                    walletExpiryData = null;
                }
                if (walletHomeAnnouncement != null) {
                    str14 = walletHomeAnnouncement.getText();
                    walletCta = walletHomeAnnouncement.getCta();
                } else {
                    str14 = null;
                    walletCta = null;
                }
                if (walletHomeAnnouncement != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (j18 != 0) {
                    if (z10) {
                        j15 = 4096;
                    } else {
                        j15 = 2048;
                    }
                    j10 |= j15;
                }
                if (walletUIData2 != null) {
                    str11 = walletUIData2.getDisplayValue();
                    str12 = walletUIData2.getTitle();
                } else {
                    str11 = null;
                    str12 = null;
                }
                if (walletUIData3 != null) {
                    str15 = walletUIData3.getTitle();
                    str13 = walletUIData3.getDisplayValue();
                } else {
                    str13 = null;
                    str15 = null;
                }
                if (walletExpiryData != null) {
                    expiryWalletDetailData = walletExpiryData.getBonus();
                } else {
                    expiryWalletDetailData = null;
                }
                if (walletUIData != null) {
                    str16 = walletUIData.getTitle();
                    str4 = walletUIData.getDisplayValue();
                } else {
                    str4 = null;
                    str16 = null;
                }
                if (walletCta != null) {
                    str17 = walletCta.getLabel();
                } else {
                    str17 = null;
                }
                if (walletCta != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10) {
                    i19 = 0;
                } else {
                    i19 = 8;
                }
                if (expiryWalletDetailData != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((j10 & 26) != 0) {
                    if (z11) {
                        j14 = 64;
                    } else {
                        j14 = 32;
                    }
                    j10 |= j14;
                }
                if ((j10 & 26) != 0) {
                    if (z12) {
                        j13 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                    } else {
                        j13 = 512;
                    }
                    j10 |= j13;
                }
                if (expiryWalletDetailData != null) {
                    walletCta2 = expiryWalletDetailData.getCta();
                } else {
                    walletCta2 = null;
                }
                if (z11) {
                    i20 = 0;
                } else {
                    i20 = 8;
                }
                if (z12) {
                    i21 = 0;
                } else {
                    i21 = 8;
                }
                if (walletCta2 == null) {
                    z13 = false;
                }
                if ((j10 & 26) != 0) {
                    if (z13) {
                        j12 = 262144;
                    } else {
                        j12 = 131072;
                    }
                    j10 |= j12;
                }
                if (walletCta2 != null) {
                    str18 = walletCta2.getLabel();
                } else {
                    str18 = null;
                }
                if (z13) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
            } else {
                i18 = 0;
                i19 = 0;
                i20 = 0;
                i21 = 0;
                str4 = null;
                str6 = null;
                str11 = null;
                str12 = null;
                str13 = null;
                expiryWalletDetailData = null;
                str14 = null;
                str15 = null;
                str16 = null;
                str17 = null;
                str18 = null;
            }
            long j19 = j10 & 28;
            if (j19 != 0) {
                if (walletHomeViewModel != null) {
                    e0Var = walletHomeViewModel.f9084g;
                } else {
                    e0Var = null;
                }
                q(2, e0Var);
                if (e0Var != null) {
                    bool = (Boolean) e0Var.getValue();
                } else {
                    bool = null;
                }
                boolean o11 = m4.m.o(bool);
                if (j19 != 0) {
                    if (o11) {
                        j11 = Http2Stream.EMIT_BUFFER_SIZE;
                    } else {
                        j11 = 8192;
                    }
                    j10 |= j11;
                }
                if (o11) {
                    i22 = 8;
                } else {
                    i22 = 0;
                }
                i14 = i17;
                str10 = str11;
                i15 = i22;
            } else {
                i15 = 0;
                i14 = i17;
                str10 = str11;
            }
            str9 = str12;
            str = str13;
            str7 = str14;
            str5 = str15;
            str2 = str16;
            str3 = str17;
            i23 = i21;
            str8 = str18;
            i12 = i16;
            i10 = i19;
            i13 = i18;
            i11 = i20;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            expiryWalletDetailData = null;
            str9 = null;
            str10 = null;
        }
        if ((26 & j10) != 0) {
            this.f6151w.setVisibility(i10);
            this.f6152x.setVisibility(i23);
            qu.i0.K(this.f6153y, str5);
            qu.i0.K(this.f6154z, str);
            qu.i0.K(this.A, str2);
            qu.i0.K(this.B, str4);
            qu.i0.K(this.D, str6);
            qu.i0.K(this.H, str3);
            this.H.setVisibility(i11);
            qu.i0.K(this.I, str8);
            this.I.setVisibility(i13);
            qu.i0.K(this.f6270g0, str7);
            TextView textView = this.f6271h0;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            if (expiryWalletDetailData != null) {
                String text = expiryWalletDetailData.getText();
                if (text == null) {
                    text = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                spannableStringBuilder.append((CharSequence) " ");
                String timeline = expiryWalletDetailData.getTimeline();
                if (timeline != null && timeline.length() != 0) {
                    spannableStringBuilder.append((CharSequence) expiryWalletDetailData.getTimeline());
                    if (expiryWalletDetailData.getTimelineImp()) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(-65536), spannableStringBuilder.length() - expiryWalletDetailData.getTimeline().length(), spannableStringBuilder.length(), 0);
                    } else {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(-16777216), spannableStringBuilder.length() - expiryWalletDetailData.getTimeline().length(), spannableStringBuilder.length(), 0);
                    }
                }
                textView.setText(spannableStringBuilder);
            }
            qu.i0.K(this.R, str9);
            qu.i0.K(this.S, str10);
        }
        if ((28 & j10) != 0) {
            int i24 = i15;
            this.f6269f0.setVisibility(i24);
            this.X.setVisibility(i24);
        }
        if ((j10 & 25) != 0) {
            this.f6144c0.setVisibility(i12);
            this.f6145d0.setVisibility(i14);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6272i0 != 0) {
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
            this.f6272i0 = 16L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f6272i0 |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f6272i0 |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6272i0 |= 1;
        }
        return true;
    }
}
