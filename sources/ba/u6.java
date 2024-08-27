package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.portfolio.WalletCta;
import com.assetgro.stockgro.data.model.portfolio.WalletCtaDetails;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u6 extends t6 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f6275z;

    /* renamed from: y, reason: collision with root package name */
    public long f6276y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6275z = sparseIntArray;
        sparseIntArray.put(R.id.cancel, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u6(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.u6.f6275z
            r2 = 5
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r2, r7, r0)
            r0 = 3
            r0 = r8[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 4
            r0 = r8[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 1
            r0 = r8[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2
            r0 = r8[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f6276y = r0
            com.google.android.material.button.MaterialButton r0 = r9.f6159s
            r0.setTag(r7)
            android.widget.TextView r0 = r9.f6161u
            r0.setTag(r7)
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r7)
            android.widget.LinearLayout r0 = r9.f6162v
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.u6.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        ArrayList<zi.i> arrayList;
        int i10;
        WalletCtaDetails walletCtaDetails;
        boolean z10;
        boolean z11;
        long j11;
        long j12;
        synchronized (this) {
            j10 = this.f6276y;
            this.f6276y = 0L;
        }
        WalletCta walletCta = this.f6163w;
        long j13 = j10 & 3;
        String str2 = null;
        int i11 = 0;
        if (j13 != 0) {
            if (walletCta != null) {
                arrayList = walletCta.toNarration();
                walletCtaDetails = walletCta.getDetails();
            } else {
                walletCtaDetails = null;
                arrayList = null;
            }
            if (walletCtaDetails == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (j13 != 0) {
                if (z10) {
                    j12 = 8;
                } else {
                    j12 = 4;
                }
                j10 |= j12;
            }
            if (walletCtaDetails != null) {
                str2 = walletCtaDetails.getCtaLabel();
                z11 = walletCtaDetails.getCta();
                str = walletCtaDetails.getTitle();
            } else {
                str = null;
                z11 = false;
            }
            if ((j10 & 3) != 0) {
                if (z11) {
                    j11 = 32;
                } else {
                    j11 = 16;
                }
                j10 |= j11;
            }
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            if (!z11) {
                i11 = 8;
            }
        } else {
            str = null;
            arrayList = null;
            i10 = 0;
        }
        if ((j10 & 3) != 0) {
            qu.i0.K(this.f6159s, str2);
            this.f6159s.setVisibility(i11);
            qu.i0.K(this.f6161u, str);
            this.f6161u.setVisibility(i10);
            el.l.C0(this.f6162v, arrayList);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6276y != 0) {
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
            this.f6276y = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
