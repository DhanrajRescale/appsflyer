package af;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import ba.e4;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsViewModel;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanIndexActivity;
import kotlin.jvm.internal.Intrinsics;
import r7.j;
import yo.g;
import yo.k;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements j, k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StockGyanIndexActivity f400a;

    public /* synthetic */ c(StockGyanIndexActivity stockGyanIndexActivity) {
        this.f400a = stockGyanIndexActivity;
    }

    @Override // r7.j
    public final void i() {
        int i10 = StockGyanIndexActivity.f9509l;
        StockGyanIndexActivity this$0 = this.f400a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((StockGyanGroupsViewModel) this$0.x()).h();
    }

    @Override // yo.k
    public final void j(g tab, int i10) {
        int i11 = StockGyanIndexActivity.f9509l;
        StockGyanIndexActivity this$0 = this.f400a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.b((CharSequence) ((StockGyanGroupsViewModel) this$0.x()).f9508u.get(i10));
        View childAt = ((e4) this$0.w()).f4569u.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        if (childAt instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) childAt;
            linearLayout.setShowDividers(2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(r3.k.getColor(this$0, R.color.tabSeparatorColor));
            gradientDrawable.setSize(3, 1);
            linearLayout.setDividerPadding(35);
            linearLayout.setDividerDrawable(gradientDrawable);
        }
        if (i10 == 0) {
            tab.f41758g.setBackgroundResource(R.drawable.tab_start_selector);
        } else if (i10 == ((StockGyanGroupsViewModel) this$0.x()).f9508u.size() - 1) {
            tab.f41758g.setBackgroundResource(R.drawable.tab_end_selector);
        } else {
            tab.f41758g.setBackgroundResource(R.drawable.tab_center_selector);
        }
    }
}
