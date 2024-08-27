package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class lm extends km {
    public static final h.c G;
    public static final SparseIntArray H;
    public long F;

    static {
        h.c cVar = new h.c(19);
        G = cVar;
        cVar.W(1, new int[]{3, 4, 5}, new int[]{R.layout.layout_portfolio_balance, R.layout.layout_portfolio_data_league, R.layout.layout_portfolio_value}, new String[]{"layout_portfolio_balance", "layout_portfolio_data_league", "layout_portfolio_value"});
        cVar.W(2, new int[]{6, 7, 8, 9}, new int[]{R.layout.layout_profit_container, R.layout.layout_portfolio_returns, R.layout.layout_leagues_joined, R.layout.layout_portfolio_holdings_stocks}, new String[]{"layout_profit_container", "layout_portfolio_returns", "layout_leagues_joined", "layout_portfolio_holdings_stocks"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.swipe_refresh_layout, 10);
        sparseIntArray.put(R.id.holdings_nested_scrollview, 11);
        sparseIntArray.put(R.id.portfolio_disclaimer, 12);
        sparseIntArray.put(R.id.portfolio_disclaimer_text, 13);
        sparseIntArray.put(R.id.pending_order_message_container, 14);
        sparseIntArray.put(R.id.image, 15);
        sparseIntArray.put(R.id.no_stocks_layout, 16);
        sparseIntArray.put(R.id.no_asset_text, 17);
        sparseIntArray.put(R.id.progress_bar, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lm(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.lm.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.F = 0L;
        }
        this.f5266x.c();
        this.f5261s.c();
        this.f5262t.c();
        this.f5263u.c();
        this.B.c();
        this.A.c();
        this.C.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                if (this.f5266x.f() || this.f5261s.f() || this.f5262t.f() || this.f5263u.f() || this.B.f() || this.A.f() || this.C.f()) {
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
            this.F = 256L;
        }
        this.f5266x.h();
        this.f5261s.h();
        this.f5262t.h();
        this.f5263u.h();
        this.B.h();
        this.A.h();
        this.C.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        switch (i10) {
            case 0:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.F |= 1;
                }
                return true;
            case 1:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.F |= 2;
                }
                return true;
            case 2:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.F |= 4;
                }
                return true;
            case 3:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.F |= 8;
                }
                return true;
            case 4:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.F |= 16;
                }
                return true;
            case 5:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.F |= 32;
                }
                return true;
            case 6:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.F |= 64;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.f5266x.p(tVar);
        this.f5261s.p(tVar);
        this.f5262t.p(tVar);
        this.f5263u.p(tVar);
        this.B.p(tVar);
        this.A.p(tVar);
        this.C.p(tVar);
    }
}
