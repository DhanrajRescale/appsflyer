package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.model.WalletPaymentOption;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class gw extends fw {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f4877y;

    /* renamed from: x, reason: collision with root package name */
    public long f4878x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4877y = sparseIntArray;
        sparseIntArray.put(R.id.available_title, 5);
        sparseIntArray.put(R.id.debit_title, 6);
        sparseIntArray.put(R.id.deposit_title, 7);
        sparseIntArray.put(R.id.separator, 8);
        sparseIntArray.put(R.id.sg_title, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gw(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.gw.f4877y
            r2 = 10
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r2, r7, r0)
            r0 = 5
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 6
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 1
            r0 = r8[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2
            r0 = r8[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 7
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 8
            r0 = r8[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 3
            r0 = r8[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 4
            r0 = r8[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 9
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f4878x = r0
            android.widget.TextView r0 = r9.f4751s
            r0.setTag(r7)
            android.widget.TextView r0 = r9.f4752t
            r0.setTag(r7)
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r7)
            android.widget.TextView r0 = r9.f4753u
            r0.setTag(r7)
            android.widget.TextView r0 = r9.f4754v
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.gw.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j10 = this.f4878x;
            this.f4878x = 0L;
        }
        WalletPaymentOption walletPaymentOption = this.f4755w;
        long j11 = j10 & 3;
        if (j11 != 0 && walletPaymentOption != null) {
            str = walletPaymentOption.getDeposit();
            str2 = walletPaymentOption.getBreakdownCash();
            str3 = walletPaymentOption.getBreakdownDeposit();
            str4 = walletPaymentOption.getCash();
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if (j11 != 0) {
            qu.i0.K(this.f4751s, str);
            qu.i0.K(this.f4752t, str3);
            qu.i0.K(this.f4753u, str4);
            qu.i0.K(this.f4754v, str2);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4878x != 0) {
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
            this.f4878x = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
