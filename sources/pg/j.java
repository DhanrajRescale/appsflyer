package pg;

import android.content.Context;
import android.view.View;
import ba.vu;
import ba.xt;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolioHolding;
import com.assetgro.stockgro.feature_market.data.remote.Value;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f31041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f31042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f31043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(g1 g1Var, Context context, l3 l3Var, int i10) {
        super(1);
        this.f31040a = i10;
        this.f31041b = g1Var;
        this.f31042c = context;
        this.f31043d = l3Var;
    }

    public final void a(View view) {
        String str;
        String n10;
        String n11;
        Value value;
        Value value2;
        String str2;
        String r10;
        String str3;
        String r11;
        String str4;
        String n12;
        Value value3;
        Value value4;
        Value value5;
        Value value6;
        int i10 = this.f31040a;
        String str5 = null;
        l3 l3Var = this.f31043d;
        Context context = this.f31042c;
        g1 g1Var = this.f31041b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                xt xtVar = (xt) g1Var.getValue();
                if (xtVar != null) {
                    xtVar.f6682t.setText(context.getString(R.string.margin_avaliable));
                    ij.h hVar = ij.h.f20067a;
                    FnoPortfolioHolding fnoPortfolioHolding = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding != null && (value2 = fnoPortfolioHolding.getValue()) != null) {
                        str = value2.getMarginAvailable();
                    } else {
                        str = null;
                    }
                    n10 = ij.h.f20067a.n(1, str);
                    xtVar.f6681s.setText(n10);
                    FnoPortfolioHolding fnoPortfolioHolding2 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding2 != null && (value = fnoPortfolioHolding2.getValue()) != null) {
                        str5 = value.getPendingOrderAmount();
                    }
                    n11 = ij.h.f20067a.n(1, str5);
                    xtVar.f6683u.setText(n11);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                vu vuVar = (vu) g1Var.getValue();
                if (vuVar != null) {
                    vuVar.f6478y.setText(context.getString(R.string.transaction_charges_10_order));
                    vuVar.f6473t.setText(context.getString(R.string.pending_order_margin));
                    ij.h hVar2 = ij.h.f20067a;
                    FnoPortfolioHolding fnoPortfolioHolding3 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding3 != null && (value6 = fnoPortfolioHolding3.getValue()) != null) {
                        str2 = value6.getRealizedPnl();
                    } else {
                        str2 = null;
                    }
                    r10 = ij.h.f20067a.r(1, str2);
                    vuVar.f6475v.setText(r10);
                    FnoPortfolioHolding fnoPortfolioHolding4 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding4 != null && (value5 = fnoPortfolioHolding4.getValue()) != null) {
                        str3 = value5.getUnrealizedPnl();
                    } else {
                        str3 = null;
                    }
                    r11 = ij.h.f20067a.r(1, str3);
                    vuVar.f6479z.setText(r11);
                    FnoPortfolioHolding fnoPortfolioHolding5 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding5 != null && (value4 = fnoPortfolioHolding5.getValue()) != null) {
                        str4 = value4.getTotalTransactionCharges();
                    } else {
                        str4 = null;
                    }
                    vuVar.f6477x.setText(hVar2.r(-1, str4));
                    FnoPortfolioHolding fnoPortfolioHolding6 = (FnoPortfolioHolding) l3Var.getValue();
                    if (fnoPortfolioHolding6 != null && (value3 = fnoPortfolioHolding6.getValue()) != null) {
                        str5 = value3.getPendingOrderAmount();
                    }
                    n12 = ij.h.f20067a.n(1, str5);
                    vuVar.f6474u.setText(n12);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f31040a) {
            case 0:
                a((View) obj);
                return Unit.f23355a;
            default:
                a((View) obj);
                return Unit.f23355a;
        }
    }
}
