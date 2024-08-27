package ba;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ConstraintLayoutWithGreyscaleDisableSupport;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w9 extends v9 {
    public static final SparseIntArray U;
    public final ImageView R;
    public final TextView S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(R.id.player_min_max, 23);
        sparseIntArray.put(R.id.fillingFast, 24);
        sparseIntArray.put(R.id.fillingFastText, 25);
        sparseIntArray.put(R.id.ll_subtype_date_container, 26);
        sparseIntArray.put(R.id.constraintLayout2, 27);
        sparseIntArray.put(R.id.prize_text, 28);
        sparseIntArray.put(R.id.linearLayoutCompat2, 29);
        sparseIntArray.put(R.id.special_gift_chance_seperator, 30);
        sparseIntArray.put(R.id.linearLayout4, 31);
        sparseIntArray.put(R.id.entry_text, 32);
        sparseIntArray.put(R.id.entry_amount_wrapper, 33);
        sparseIntArray.put(R.id.free_image_view, 34);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w9(android.view.View r28) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.w9.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        long j11;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j12;
        int i14;
        int i15;
        int i16;
        Context context;
        int i17;
        int i18;
        int i19;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z12;
        int i20;
        int i21;
        boolean z13;
        long j13;
        long j14;
        synchronized (this) {
            j10 = this.T;
            this.T = 0L;
        }
        ArenaGame arenaGame = this.P;
        rc.e eVar = this.O;
        String str13 = null;
        if ((j10 & 7) != 0) {
            long j15 = j10 & 5;
            if (j15 != 0) {
                if (arenaGame != null) {
                    z12 = arenaGame.getWinCash();
                    str7 = arenaGame.getAssetClass();
                    str8 = arenaGame.getFrequency();
                    i18 = arenaGame.getMaximumPlayers();
                    i20 = arenaGame.getSeatsLeft();
                    str9 = arenaGame.getPromotionCopy();
                    str10 = arenaGame.getDisplayPic();
                    i19 = arenaGame.getPrizePool();
                    i21 = arenaGame.getJoiningFee();
                    str11 = arenaGame.getName();
                    str12 = arenaGame.getType();
                } else {
                    i18 = 0;
                    i20 = 0;
                    i19 = 0;
                    i21 = 0;
                    str7 = null;
                    str8 = null;
                    str9 = null;
                    str10 = null;
                    str11 = null;
                    str12 = null;
                    z12 = false;
                }
                if (i20 == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                str = String.valueOf(i21);
                if (j15 != 0) {
                    if (z13) {
                        j14 = 64;
                    } else {
                        j14 = 32;
                    }
                    j10 |= j14;
                }
                if (z13) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (str != null) {
                    z10 = str.equalsIgnoreCase("0");
                } else {
                    z10 = false;
                }
                if ((j10 & 5) != 0) {
                    if (z10) {
                        j13 = 16;
                    } else {
                        j13 = 8;
                    }
                    j10 |= j13;
                }
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
            } else {
                z10 = false;
                i10 = 0;
                i11 = 0;
                i18 = 0;
                i19 = 0;
                str = null;
                str7 = null;
                str8 = null;
                str9 = null;
                str10 = null;
                str11 = null;
                str12 = null;
                z12 = false;
            }
            if (arenaGame != null) {
                str5 = str7;
                i12 = i18;
                str6 = str9;
                str2 = str10;
                i13 = i19;
                str3 = str11;
                str4 = str12;
                j11 = arenaGame.getTradeStart();
            } else {
                j11 = 0;
                str5 = str7;
                i12 = i18;
                str6 = str9;
                str2 = str10;
                i13 = i19;
                str3 = str11;
                str4 = str12;
            }
            z11 = z12;
            str13 = str8;
        } else {
            j11 = 0;
            z10 = false;
            i10 = 0;
            i11 = 0;
            z11 = false;
            i12 = 0;
            i13 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        if ((5 & j10) != 0) {
            ConstraintLayoutWithGreyscaleDisableSupport constraintLayoutWithGreyscaleDisableSupport = this.f6404s;
            Intrinsics.checkNotNullParameter(constraintLayoutWithGreyscaleDisableSupport, "<this>");
            Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
            constraintLayoutWithGreyscaleDisableSupport.setDisabled(el.l.q0(arenaGame.getTradeStart()));
            LinearLayoutCompat linearLayoutCompat = this.f6405t;
            Intrinsics.checkNotNullParameter(linearLayoutCompat, "<this>");
            View findViewById = linearLayoutCompat.findViewById(R.id.entry_amount_wrapper);
            View findViewById2 = linearLayoutCompat.findViewById(R.id.free_image_view);
            if (!z10) {
                findViewById.setVisibility(0);
                findViewById2.setVisibility(8);
            } else {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
            }
            ConstraintLayout constraintLayout = this.f6406u;
            Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
            Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
            if (!el.l.q0(arenaGame.getTradeStart()) && arenaGame.getSeatsLeft() != 0) {
                constraintLayout.setVisibility(0);
            } else {
                constraintLayout.setVisibility(8);
            }
            al.d.R0(this.f6408w, str13);
            al.d.x0(this.f6409x, str);
            LinearLayout linearLayout = this.f6411z;
            Intrinsics.checkNotNullParameter(linearLayout, "<this>");
            Intrinsics.checkNotNullParameter(arenaGame, "data");
            if (arenaGame.getFillingFast()) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            linearLayout.setVisibility(i14);
            al.d.A0(this.A, str2);
            qu.i0.K(this.B, str3);
            qu.i0.K(this.C, str4);
            j12 = j11;
            al.d.f0(this.D, j12);
            al.d.S0(this.E, str5);
            TextView textView = this.F;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            textView.setText(ij.h.f(i12, 2));
            al.d.c1(this.R, Boolean.valueOf(z11));
            this.R.setVisibility(i10);
            al.d.Q0(this.S, arenaGame);
            TextView textView2 = this.S;
            Intrinsics.checkNotNullParameter(textView2, "<this>");
            Intrinsics.checkNotNullParameter(arenaGame, "data");
            if (arenaGame.getFillingFast()) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            textView2.setVisibility(i15);
            al.d.U0(this.G, arenaGame);
            TextView textView3 = this.I;
            Intrinsics.checkNotNullParameter(textView3, "<this>");
            Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
            if (el.l.q0(arenaGame.getTradeStart())) {
                i16 = R.drawable.ic_prepzone_red_clock;
            } else {
                i16 = R.drawable.ic_prepzone_finished_red;
            }
            if (el.l.q0(arenaGame.getTradeStart())) {
                context = textView3.getContext();
                i17 = R.string.entry_is_closed;
            } else {
                context = textView3.getContext();
                i17 = R.string.seats_full;
            }
            String string = context.getString(i17);
            Intrinsics.c(string);
            textView3.setText(string);
            textView3.setCompoundDrawablesWithIntrinsicBounds(i16, 0, 0, 0);
            if (!el.l.q0(arenaGame.getTradeStart()) && arenaGame.getSeatsLeft() != 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
            }
            this.I.setVisibility(i11);
            qu.i0.K(this.J, str6);
            al.d.Y0(this.J, arenaGame);
            TextView textView4 = this.K;
            Intrinsics.checkNotNullParameter(textView4, "<this>");
            textView4.setText(ij.h.h(i13, 0, false, 4));
            al.d.Q0(this.L, arenaGame);
            ConstraintLayout constraintLayout2 = this.M;
            Intrinsics.checkNotNullParameter(constraintLayout2, "<this>");
            Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
            String assetClass = arenaGame.getAssetClass();
            if (Intrinsics.a(assetClass, "EQUITY")) {
                constraintLayout2.setBackground(r3.k.getDrawable(constraintLayout2.getContext(), R.drawable.purple_rectancle_8dp_rounded_background));
            } else if (Intrinsics.a(assetClass, "OPTIONS")) {
                constraintLayout2.setBackground(r3.k.getDrawable(constraintLayout2.getContext(), R.drawable.teal_rectancle_8dp_rounded_background));
            }
            if (el.l.q0(arenaGame.getTradeStart())) {
                constraintLayout2.setBackground(r3.k.getDrawable(constraintLayout2.getContext(), R.drawable.light_grey_rectancle_8dp_rounded_background));
            }
            al.d.c1(this.N, Boolean.valueOf(z11));
        } else {
            j12 = j11;
        }
        if ((7 & j10) != 0) {
            al.d.O(this.f6407v, j12, eVar);
        }
        if ((j10 & 4) != 0) {
            al.d.a0(this.f6411z, Arrays.asList(this.f6410y, this.L));
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.T != 0) {
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
            this.T = 4L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
