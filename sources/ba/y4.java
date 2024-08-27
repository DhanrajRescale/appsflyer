package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;

/* loaded from: classes.dex */
public final class y4 extends x4 {
    public static final h.c G;
    public static final SparseIntArray H;
    public long F;

    static {
        h.c cVar = new h.c(18);
        G = cVar;
        cVar.W(1, new int[]{7}, new int[]{R.layout.layout_transfer_pending}, new String[]{"layout_transfer_pending"});
        cVar.W(2, new int[]{4, 5, 6}, new int[]{R.layout.layout_withdrawal_bank, R.layout.layout_withdrawal_paytm_wallet, R.layout.layout_withdrawal_upi}, new String[]{"layout_withdrawal_bank", "layout_withdrawal_paytm_wallet", "layout_withdrawal_upi"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 8);
        sparseIntArray.put(R.id.withdrawal_details_layout, 9);
        sparseIntArray.put(R.id.know_your_withdrawal_limit_card, 10);
        sparseIntArray.put(R.id.know_your_withdrawal_limit_title, 11);
        sparseIntArray.put(R.id.detail_icon, 12);
        sparseIntArray.put(R.id.payment_withdrawal_message, 13);
        sparseIntArray.put(R.id.transfer_container, 14);
        sparseIntArray.put(R.id.withdrawal_check_button, 15);
        sparseIntArray.put(R.id.withdrawal_tnc_label, 16);
        sparseIntArray.put(R.id.placeholder_view, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y4(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.y4.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        boolean z10;
        androidx.lifecycle.e0 e0Var;
        synchronized (this) {
            j10 = this.F;
            this.F = 0L;
        }
        WithdrawalDetailViewModel withdrawalDetailViewModel = this.E;
        long j11 = j10 & 100;
        if (j11 != 0) {
            Boolean bool = null;
            if (withdrawalDetailViewModel != null) {
                e0Var = withdrawalDetailViewModel.f9760p;
            } else {
                e0Var = null;
            }
            q(2, e0Var);
            if (e0Var != null) {
                bool = (Boolean) e0Var.getValue();
            }
            z10 = m4.m.o(bool);
        } else {
            z10 = false;
        }
        if (j11 != 0) {
            this.f6600s.setEnabled(z10);
        }
        this.f6604w.c();
        this.f6605x.c();
        this.f6606y.c();
        this.A.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                if (this.f6604w.f() || this.f6605x.f() || this.f6606y.f() || this.A.f()) {
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
            this.F = 64L;
        }
        this.f6604w.h();
        this.f6605x.h();
        this.f6606y.h();
        this.A.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return false;
                        }
                        if (i11 != 0) {
                            return false;
                        }
                        synchronized (this) {
                            this.F |= 16;
                        }
                        return true;
                    }
                    if (i11 != 0) {
                        return false;
                    }
                    synchronized (this) {
                        this.F |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.F |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.f6604w.p(tVar);
        this.f6605x.p(tVar);
        this.f6606y.p(tVar);
        this.A.p(tVar);
    }
}
