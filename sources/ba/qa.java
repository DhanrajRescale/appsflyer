package ba;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.BorderDrawableButton;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qa extends pa {
    public static final h.c I;
    public static final SparseIntArray J;
    public long H;

    static {
        h.c cVar = new h.c(26);
        I = cVar;
        cVar.W(1, new int[]{12}, new int[]{R.layout.cell_my_league_header_layout}, new String[]{"cell_my_league_header_layout"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.my_league_state, 13);
        sparseIntArray.put(R.id.rank_container, 14);
        sparseIntArray.put(R.id.rank_text_subtitle, 15);
        sparseIntArray.put(R.id.cl_profit_section_ongoing, 16);
        sparseIntArray.put(R.id.profit_text, 17);
        sparseIntArray.put(R.id.percentage_container, 18);
        sparseIntArray.put(R.id.tv_start_building_portfolio, 19);
        sparseIntArray.put(R.id.player_min_max, 20);
        sparseIntArray.put(R.id.min_player, 21);
        sparseIntArray.put(R.id.max_player, 22);
        sparseIntArray.put(R.id.seat_left, 23);
        sparseIntArray.put(R.id.constraintLayout, 24);
        sparseIntArray.put(R.id.cash_left_container, 25);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qa(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.qa.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        long j11;
        long j12;
        oc.c cVar;
        Drawable drawable;
        String str;
        String str2;
        String str3;
        double d10;
        double d11;
        Double e10;
        Drawable drawable2;
        String str4;
        String str5;
        String str6;
        String str7;
        double d12;
        Double d13;
        Float f10;
        Float f11;
        boolean z10;
        boolean z11;
        int i10;
        long j13;
        long j14;
        synchronized (this) {
            j10 = this.H;
            this.H = 0L;
        }
        ArenaGame arenaGame = this.F;
        oc.c cVar2 = this.E;
        int i11 = 0;
        String str8 = null;
        Long l10 = null;
        if ((j10 & 26) != 0) {
            long j15 = j10 & 18;
            if (j15 != 0) {
                if (arenaGame != null) {
                    d13 = arenaGame.getAmountLeft();
                    str5 = arenaGame.getRank();
                    f10 = arenaGame.getPortfolioPercent();
                    str7 = arenaGame.getAssetClass();
                    f11 = arenaGame.getPortfolioValue();
                } else {
                    d13 = null;
                    str5 = null;
                    f10 = null;
                    str7 = null;
                    f11 = null;
                }
                if (d13 == null) {
                    d12 = 0.0d;
                } else {
                    d12 = d13.doubleValue();
                }
                float n10 = m4.m.n(f10);
                float n11 = m4.m.n(f11);
                str4 = Float.toString(n10);
                if (n11 != s0.g.f34069a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (n11 > s0.g.f34069a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                str6 = Float.toString(n11);
                if (j15 != 0) {
                    if (z10) {
                        j14 = 256;
                    } else {
                        j14 = 128;
                    }
                    j10 |= j14;
                }
                if ((j10 & 18) != 0) {
                    if (z11) {
                        j13 = 64;
                    } else {
                        j13 = 32;
                    }
                    j10 |= j13;
                }
                if (!z10) {
                    i11 = 8;
                }
                Context context = this.A.getContext();
                if (z11) {
                    i10 = R.drawable.ic_stock_up_arrow;
                } else {
                    i10 = R.drawable.ic_stock_down_arrow;
                }
                drawable2 = iu.j.m(context, i10);
            } else {
                drawable2 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                d12 = 0.0d;
            }
            if (arenaGame != null) {
                j11 = arenaGame.getTradeEnd();
                l10 = arenaGame.getWinnerTime();
            } else {
                j11 = 0;
            }
            if (l10 == null) {
                j12 = 0;
            } else {
                j12 = l10.longValue();
            }
            drawable = drawable2;
            str = str4;
            str3 = str5;
            str8 = str6;
            str2 = str7;
            cVar = cVar2;
            d10 = d12;
        } else {
            j11 = 0;
            j12 = 0;
            cVar = cVar2;
            drawable = null;
            str = null;
            str2 = null;
            str3 = null;
            d10 = 0.0d;
        }
        if ((18 & j10) != 0) {
            TextView textView = this.f5742t;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            ij.h hVar = ij.h.f20067a;
            textView.setText(ij.h.m(hVar, d10));
            bh.a.a(this.f5743u, str2);
            al.d.i0(this.f5744v, arenaGame);
            BorderDrawableButton borderDrawableButton = this.f5745w;
            Intrinsics.checkNotNullParameter(borderDrawableButton, "<this>");
            Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
            int i12 = ij.a.f20036a[arenaGame.getLeagueStatus().ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        borderDrawableButton.setBdbText(borderDrawableButton.getContext().getString(R.string.view_portfolio));
                    } else {
                        borderDrawableButton.setBdbText(borderDrawableButton.getContext().getString(R.string.view_portfolio));
                    }
                } else {
                    borderDrawableButton.setBdbText(borderDrawableButton.getContext().getString(R.string.modify_portfolio));
                }
            } else {
                borderDrawableButton.setBdbText(borderDrawableButton.getContext().getString(R.string.modify_portfolio));
            }
            al.d.i0(this.f5745w, arenaGame);
            this.f5747y.r(arenaGame);
            TextView textView2 = this.f5748z;
            Intrinsics.checkNotNullParameter(textView2, "<this>");
            if (str8 != null && (e10 = kotlin.text.q.e(str8)) != null) {
                d11 = e10.doubleValue();
            } else {
                d11 = 0.0d;
            }
            textView2.setText(ij.h.m(hVar, d11));
            this.A.setImageDrawable(drawable);
            this.A.setVisibility(i11);
            al.d.a1(this.B, str);
            TextView textView3 = this.C;
            Intrinsics.checkNotNullParameter(textView3, "<this>");
            String str9 = str3;
            if (str9 != null && str9.length() != 0 && !Intrinsics.a(str9, "0")) {
                textView3.setText("#".concat(str9));
            } else {
                textView3.setText("-");
            }
            al.d.b1(this.D, str);
        }
        if ((j10 & 26) != 0) {
            al.d.P(this.f5746x, j11, false, j12, cVar);
        }
        this.f5747y.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                if (this.f5747y.f()) {
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
            this.H = 16L;
        }
        this.f5747y.h();
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
            this.H |= 1;
        }
        return true;
    }
}
