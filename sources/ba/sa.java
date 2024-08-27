package ba;

import android.util.SparseIntArray;
import android.widget.TextView;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sa extends ra {
    public static final h.c F;
    public static final SparseIntArray G;
    public long E;

    static {
        h.c cVar = new h.c(17);
        F = cVar;
        cVar.W(1, new int[]{9}, new int[]{R.layout.cell_my_league_header_layout}, new String[]{"cell_my_league_header_layout"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.my_league_state, 10);
        sparseIntArray.put(R.id.player_min_max, 11);
        sparseIntArray.put(R.id.min_player, 12);
        sparseIntArray.put(R.id.max_player, 13);
        sparseIntArray.put(R.id.seat_left, 14);
        sparseIntArray.put(R.id.constraintLayout, 15);
        sparseIntArray.put(R.id.cash_left_container, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sa(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            h.c r0 = ba.sa.F
            android.util.SparseIntArray r2 = ba.sa.G
            r3 = 17
            java.lang.Object[] r12 = m4.m.j(r14, r3, r0, r2)
            r0 = 1
            r0 = r12[r0]
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0 = 16
            r0 = r12[r0]
            androidx.appcompat.widget.LinearLayoutCompat r0 = (androidx.appcompat.widget.LinearLayoutCompat) r0
            r0 = 8
            r0 = r12[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 7
            r0 = r12[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 15
            r0 = r12[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 3
            r0 = r12[r0]
            r6 = r0
            com.assetgro.stockgro.widget.BorderDrawableButton r6 = (com.assetgro.stockgro.widget.BorderDrawableButton) r6
            r0 = 2
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 13
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 12
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 4
            r0 = r12[r0]
            r8 = r0
            com.airbnb.lottie.LottieAnimationView r8 = (com.airbnb.lottie.LottieAnimationView) r8
            r0 = 6
            r0 = r12[r0]
            r9 = r0
            com.airbnb.lottie.LottieAnimationView r9 = (com.airbnb.lottie.LottieAnimationView) r9
            r0 = 9
            r0 = r12[r0]
            r10 = r0
            ba.na r10 = (ba.na) r10
            r0 = 10
            r0 = r12[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 11
            r0 = r12[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 14
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 5
            r0 = r12[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r13.E = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f5943s
            r1 = 0
            r0.setTag(r1)
            android.widget.TextView r0 = r13.f5944t
            r0.setTag(r1)
            android.widget.TextView r0 = r13.f5945u
            r0.setTag(r1)
            com.assetgro.stockgro.widget.BorderDrawableButton r0 = r13.f5946v
            r0.setTag(r1)
            android.widget.TextView r0 = r13.f5947w
            r0.setTag(r1)
            r0 = 0
            r0 = r12[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r1)
            com.airbnb.lottie.LottieAnimationView r0 = r13.f5948x
            r0.setTag(r1)
            com.airbnb.lottie.LottieAnimationView r0 = r13.f5949y
            r0.setTag(r1)
            ba.na r0 = r13.f5950z
            if (r0 == 0) goto La8
            r0.f27496j = r13
        La8:
            android.widget.TextView r0 = r13.A
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.sa.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        long j11;
        long j12;
        String str;
        String str2;
        String str3;
        Double d10;
        Boolean bool;
        long j13;
        synchronized (this) {
            j10 = this.E;
            this.E = 0L;
        }
        ArenaGame arenaGame = this.C;
        oc.c cVar = this.B;
        double d11 = 0.0d;
        int i10 = 0;
        String str4 = null;
        Long l10 = null;
        if ((j10 & 26) != 0) {
            long j14 = j10 & 18;
            if (j14 != 0) {
                if (arenaGame != null) {
                    d10 = arenaGame.getAmountLeft();
                    bool = arenaGame.getOrderPlaced();
                    str2 = arenaGame.getMessage();
                    str3 = arenaGame.getAssetClass();
                } else {
                    d10 = null;
                    bool = null;
                    str2 = null;
                    str3 = null;
                }
                if (d10 != null) {
                    d11 = d10.doubleValue();
                }
                boolean o10 = m4.m.o(bool);
                if (j14 != 0) {
                    if (o10) {
                        j13 = 64;
                    } else {
                        j13 = 32;
                    }
                    j10 |= j13;
                }
                if (o10) {
                    i10 = 8;
                }
            } else {
                str2 = null;
                str3 = null;
            }
            if (arenaGame != null) {
                l10 = arenaGame.getWinnerTime();
                j11 = arenaGame.getTradeStart();
            } else {
                j11 = 0;
            }
            if (l10 == null) {
                j12 = 0;
            } else {
                j12 = l10.longValue();
            }
            str = str2;
            str4 = str3;
        } else {
            j11 = 0;
            j12 = 0;
            str = null;
        }
        if ((18 & j10) != 0) {
            TextView textView = this.f5944t;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            textView.setText(ij.h.m(ij.h.f20067a, d11));
            bh.a.a(this.f5945u, str4);
            al.d.i0(this.f5946v, arenaGame);
            al.d.V0(this.f5948x, str4);
            this.f5948x.setVisibility(i10);
            al.d.V0(this.f5949y, str4);
            this.f5949y.setVisibility(i10);
            this.f5950z.r(arenaGame);
            qu.i0.K(this.A, str);
        }
        if ((j10 & 26) != 0) {
            al.d.P(this.f5947w, j11, true, j12, cVar);
        }
        this.f5950z.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                if (this.f5950z.f()) {
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
            this.E = 16L;
        }
        this.f5950z.h();
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
            this.E |= 1;
        }
        return true;
    }
}
