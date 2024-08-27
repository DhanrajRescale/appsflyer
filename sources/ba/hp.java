package ba;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class hp extends gp {

    /* renamed from: i0, reason: collision with root package name */
    public static final h.c f4962i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final SparseIntArray f4963j0;

    /* renamed from: f0, reason: collision with root package name */
    public final NestedScrollView f4964f0;

    /* renamed from: g0, reason: collision with root package name */
    public final ConstraintLayout f4965g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f4966h0;

    static {
        h.c cVar = new h.c(51);
        f4962i0 = cVar;
        cVar.W(19, new int[]{38}, new int[]{R.layout.cell_maintenance_view}, new String[]{"cell_maintenance_view"});
        cVar.W(20, new int[]{37}, new int[]{R.layout.layout_wallet_bifurcation}, new String[]{"layout_wallet_bifurcation"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4963j0 = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 39);
        sparseIntArray.put(R.id.toolbar, 40);
        sparseIntArray.put(R.id.title_purchase_summary, 41);
        sparseIntArray.put(R.id.new_plan_detail_container, 42);
        sparseIntArray.put(R.id.title_subscription_date, 43);
        sparseIntArray.put(R.id.title_amount, 44);
        sparseIntArray.put(R.id.title_payment_method, 45);
        sparseIntArray.put(R.id.payment_detail_container, 46);
        sparseIntArray.put(R.id.upi_auto_pay_option_views, 47);
        sparseIntArray.put(R.id.radio_upi_auto_pay, 48);
        sparseIntArray.put(R.id.separator, 49);
        sparseIntArray.put(R.id.icon_stockgro_cash, 50);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hp(android.view.View r44) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.hp.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.hp.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4966h0 != 0) {
                    return true;
                }
                if (this.A.f() || this.f4846u.f()) {
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
            this.f4966h0 = 64L;
        }
        this.A.h();
        this.f4846u.h();
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
                            this.f4966h0 |= 16;
                        }
                        return true;
                    }
                    if (i11 != 0) {
                        return false;
                    }
                    synchronized (this) {
                        this.f4966h0 |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f4966h0 |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f4966h0 |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f4966h0 |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.A.p(tVar);
        this.f4846u.p(tVar);
    }
}
