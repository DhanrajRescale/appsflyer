package ba;

import android.util.SparseIntArray;
import android.view.View;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class oa extends na {
    public static final SparseIntArray C;
    public final View A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.ll_subtype_date_container, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public oa(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.oa.C
            r2 = 10
            r10 = 0
            java.lang.Object[] r11 = m4.m.j(r13, r2, r10, r0)
            r0 = 7
            r0 = r11[r0]
            r3 = r0
            com.google.android.material.chip.Chip r3 = (com.google.android.material.chip.Chip) r3
            r0 = 3
            r0 = r11[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 4
            r0 = r11[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 5
            r0 = r11[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 8
            r0 = r11[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r11[r0]
            r8 = r0
            com.google.android.material.chip.Chip r8 = (com.google.android.material.chip.Chip) r8
            r0 = 9
            r0 = r11[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2
            r0 = r11[r0]
            r9 = r0
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r12.B = r0
            com.google.android.material.chip.Chip r0 = r12.f5538s
            r0.setTag(r10)
            android.widget.ImageView r0 = r12.f5539t
            r0.setTag(r10)
            android.widget.TextView r0 = r12.f5540u
            r0.setTag(r10)
            android.widget.TextView r0 = r12.f5541v
            r0.setTag(r10)
            android.widget.TextView r0 = r12.f5542w
            r0.setTag(r10)
            com.google.android.material.chip.Chip r0 = r12.f5543x
            r0.setTag(r10)
            r0 = 0
            r0 = r11[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r10)
            r0 = 1
            r0 = r11[r0]
            android.view.View r0 = (android.view.View) r0
            r12.A = r0
            r0.setTag(r10)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r12.f5544y
            r0.setTag(r10)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r13.setTag(r0, r12)
            r12.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.oa.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        long j11;
        String str;
        String str2;
        String str3;
        String str4;
        long j12;
        String str5;
        boolean z10;
        long j13;
        synchronized (this) {
            j10 = this.B;
            this.B = 0L;
        }
        ArenaGame arenaGame = this.f5545z;
        long j14 = j10 & 3;
        int i10 = 0;
        String str6 = null;
        if (j14 != 0) {
            if (arenaGame != null) {
                String frequency = arenaGame.getFrequency();
                long tradeStart = arenaGame.getTradeStart();
                str2 = arenaGame.getDisplayPic();
                str3 = arenaGame.getAssetClass();
                str4 = arenaGame.getName();
                str5 = frequency;
                str6 = arenaGame.getType();
                j12 = tradeStart;
            } else {
                j12 = 0;
                str5 = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (str6 != null && str6.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (j14 != 0) {
                if (z10) {
                    j13 = 8;
                } else {
                    j13 = 4;
                }
                j10 |= j13;
            }
            if (!z10) {
                i10 = 8;
            }
            str = str6;
            str6 = str5;
            j11 = j12;
        } else {
            j11 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if ((j10 & 3) != 0) {
            al.d.R0(this.f5538s, str6);
            al.d.A0(this.f5539t, str2);
            qu.i0.K(this.f5540u, str4);
            qu.i0.K(this.f5541v, str);
            this.f5541v.setVisibility(i10);
            al.d.f0(this.f5542w, j11);
            al.d.S0(this.f5543x, str3);
            al.d.U0(this.A, arenaGame);
            al.d.T0(this.f5544y, arenaGame);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.B != 0) {
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
            this.B = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }

    @Override // ba.na
    public final void r(ArenaGame arenaGame) {
        this.f5545z = arenaGame;
        synchronized (this) {
            this.B |= 1;
        }
        a(6);
        m();
    }
}
