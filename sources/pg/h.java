package pg;

import android.view.View;
import android.widget.ImageView;
import ba.vt;
import ba.zt;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.Pnl;
import com.assetgro.stockgro.feature_market.data.remote.Value;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f31035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f31036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, g1 g1Var, l3 l3Var) {
        super(1);
        this.f31034a = i10;
        this.f31035b = g1Var;
        this.f31036c = l3Var;
    }

    public final void a(View it) {
        String n10;
        Value value;
        String str;
        String n11;
        String str2;
        String n12;
        String str3;
        String r10;
        String str4;
        Value value2;
        Pnl pnl;
        Value value3;
        Pnl pnl2;
        Value value4;
        Pnl pnl3;
        Value value5;
        Value value6;
        int i10 = this.f31034a;
        String str5 = null;
        l3 l3Var = this.f31036c;
        g1 g1Var = this.f31035b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "<anonymous parameter 0>");
                vt vtVar = (vt) g1Var.getValue();
                if (vtVar != null) {
                    ij.h hVar = ij.h.f20067a;
                    FnoPortfolioHolding fnoPortfolioHolding = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding != null && (value = fnoPortfolioHolding.getValue()) != null) {
                        str5 = value.getPortfolioValue();
                    }
                    n10 = ij.h.f20067a.n(1, str5);
                    vtVar.f6471t.setText(n10);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                zt ztVar = (zt) g1Var.getValue();
                if (ztVar != null) {
                    ij.h hVar2 = ij.h.f20067a;
                    FnoPortfolioHolding fnoPortfolioHolding2 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding2 != null && (value6 = fnoPortfolioHolding2.getValue()) != null) {
                        str = value6.getMarginAvailable();
                    } else {
                        str = null;
                    }
                    n11 = ij.h.f20067a.n(1, str);
                    ztVar.f6887v.setText(n11);
                    FnoPortfolioHolding fnoPortfolioHolding3 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding3 != null && (value5 = fnoPortfolioHolding3.getValue()) != null) {
                        str2 = value5.getMarginUtilised();
                    } else {
                        str2 = null;
                    }
                    n12 = ij.h.f20067a.n(1, str2);
                    ztVar.f6886u.setText(n12);
                    FnoPortfolioHolding fnoPortfolioHolding4 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding4 != null && (value4 = fnoPortfolioHolding4.getValue()) != null && (pnl3 = value4.getPnl()) != null) {
                        str3 = pnl3.getNetPnl();
                    } else {
                        str3 = null;
                    }
                    r10 = ij.h.f20067a.r(1, str3);
                    ztVar.f6889x.setText(r10);
                    FnoPortfolioHolding fnoPortfolioHolding5 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding5 != null && (value3 = fnoPortfolioHolding5.getValue()) != null && (pnl2 = value3.getPnl()) != null) {
                        str4 = pnl2.getPercentage();
                    } else {
                        str4 = null;
                    }
                    ztVar.f6884s.setText(ij.h.t(str4));
                    FnoPortfolioHolding fnoPortfolioHolding6 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding6 != null && (value2 = fnoPortfolioHolding6.getValue()) != null && (pnl = value2.getPnl()) != null) {
                        str5 = pnl.getType();
                    }
                    boolean a10 = Intrinsics.a(str5, "POSITIVE");
                    ImageView imageView = ztVar.f6885t;
                    if (a10) {
                        imageView.setImageResource(R.drawable.ic_stock_up_arrow);
                        return;
                    } else if (Intrinsics.a(str5, "NEGATIVE")) {
                        imageView.setImageResource(R.drawable.ic_stock_down_arrow);
                        return;
                    } else {
                        imageView.setVisibility(8);
                        return;
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f31034a) {
            case 0:
                a((View) obj);
                return Unit.f23355a;
            default:
                a((View) obj);
                return Unit.f23355a;
        }
    }
}
