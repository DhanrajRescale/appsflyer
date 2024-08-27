package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.data.remote.response.CommonConfig;
import com.assetgro.stockgro.data.remote.response.ConfigDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;

/* loaded from: classes.dex */
public final class g3 extends f3 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.container, 3);
        sparseIntArray.put(R.id.add_money_input_view, 4);
        sparseIntArray.put(R.id.chip_container, 5);
        sparseIntArray.put(R.id.add_money_fifty, 6);
        sparseIntArray.put(R.id.add_money_hundred, 7);
        sparseIntArray.put(R.id.add_money_two_fifty, 8);
        sparseIntArray.put(R.id.add_money_five_hundred, 9);
        sparseIntArray.put(R.id.payment_add_message, 10);
        sparseIntArray.put(R.id.title_note, 11);
        sparseIntArray.put(R.id.add_money_background, 12);
        sparseIntArray.put(R.id.add_money_button, 13);
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.e0 e0Var;
        ConfigDto configDto;
        CommonConfig commonConfig;
        synchronized (this) {
            j10 = this.D;
            this.D = 0L;
        }
        RechargeWalletViewModel rechargeWalletViewModel = this.C;
        long j11 = j10 & 7;
        String str = null;
        if (j11 != 0) {
            if (rechargeWalletViewModel != null) {
                e0Var = rechargeWalletViewModel.f9719z;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                configDto = (ConfigDto) e0Var.getValue();
            } else {
                configDto = null;
            }
            if (configDto != null) {
                commonConfig = configDto.getCommonConfig();
            } else {
                commonConfig = null;
            }
            if (commonConfig != null) {
                str = commonConfig.getDepositNote();
            }
        }
        if (j11 != 0) {
            qu.i0.K(this.f4664y, str);
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
            this.D = 4L;
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
            this.D |= 1;
        }
        return true;
    }
}
