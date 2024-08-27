package og;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import ba.km;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements r7.j, yo.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f30059a;

    public /* synthetic */ m(o oVar) {
        this.f30059a = oVar;
    }

    @Override // r7.j
    public final void i() {
        int i10 = o.f30062j;
        o this$0 = this.f30059a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((PortfolioHoldingsViewModel) this$0.r()).j();
    }

    @Override // yo.k
    public final void j(yo.g tab, int i10) {
        int i11 = o.f30062j;
        o this$0 = this.f30059a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.b((CharSequence) ((PortfolioHoldingsViewModel) this$0.r()).f9843w.get(i10));
        View childAt = ((km) this$0.q()).C.f4530y.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        if (childAt instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) childAt;
            linearLayout.setShowDividers(2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(r3.k.getColor(this$0.requireContext(), R.color.tabSeparatorColor));
            gradientDrawable.setSize(3, 1);
            linearLayout.setDividerPadding(35);
            linearLayout.setDividerDrawable(gradientDrawable);
        }
        if (i10 == 0) {
            tab.f41758g.setBackgroundResource(R.drawable.tab_start_selector);
        } else if (i10 == ((PortfolioHoldingsViewModel) this$0.r()).f9843w.size() - 1) {
            tab.f41758g.setBackgroundResource(R.drawable.tab_end_selector);
        } else {
            tab.f41758g.setBackgroundResource(R.drawable.tab_center_selector);
        }
    }
}
