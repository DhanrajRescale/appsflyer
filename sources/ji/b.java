package ji;

import android.transition.TransitionManager;
import ba.un;
import ba.zk;
import com.assetgro.stockgro.ui.stock.cover.order.StockCoverOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderFragment;
import com.google.android.material.appbar.AppBarLayout;
import gd.m;
import iu.v;
import iu.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements wn.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f21394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f21395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f21396d;

    public /* synthetic */ b(x xVar, m mVar, v vVar, int i10) {
        this.f21393a = i10;
        this.f21394b = xVar;
        this.f21396d = mVar;
        this.f21395c = vVar;
    }

    @Override // wn.d
    public final void a(AppBarLayout appBarLayout, int i10) {
        int i11 = this.f21393a;
        Integer num = null;
        v isShown = this.f21395c;
        x scrollRange = this.f21394b;
        m mVar = this.f21396d;
        switch (i11) {
            case 0:
                StockCoverOrderFragment this$0 = (StockCoverOrderFragment) mVar;
                int i12 = StockCoverOrderFragment.f10170h;
                Intrinsics.checkNotNullParameter(scrollRange, "$scrollRange");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(isShown, "$isShown");
                if (scrollRange.f20558a == -1) {
                    if (appBarLayout != null) {
                        num = Integer.valueOf(appBarLayout.getTotalScrollRange());
                    }
                    Intrinsics.c(num);
                    scrollRange.f20558a = num.intValue();
                }
                if (scrollRange.f20558a + i10 == 0) {
                    TransitionManager.beginDelayedTransition(((un) this$0.q()).B);
                    ((un) this$0.q()).B.setVisibility(0);
                    isShown.f20556a = true;
                    return;
                } else {
                    if (isShown.f20556a) {
                        TransitionManager.beginDelayedTransition(((un) this$0.q()).B);
                        ((un) this$0.q()).B.setVisibility(4);
                        isShown.f20556a = false;
                        return;
                    }
                    return;
                }
            default:
                ModifyStockCoverOrderFragment this$02 = (ModifyStockCoverOrderFragment) mVar;
                int i13 = ModifyStockCoverOrderFragment.f10316i;
                Intrinsics.checkNotNullParameter(scrollRange, "$scrollRange");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(isShown, "$isShown");
                if (scrollRange.f20558a == -1) {
                    if (appBarLayout != null) {
                        num = Integer.valueOf(appBarLayout.getTotalScrollRange());
                    }
                    Intrinsics.c(num);
                    scrollRange.f20558a = num.intValue();
                }
                if (scrollRange.f20558a + i10 == 0) {
                    TransitionManager.beginDelayedTransition(((zk) this$02.q()).B);
                    ((zk) this$02.q()).B.setVisibility(0);
                    isShown.f20556a = true;
                    return;
                } else {
                    if (isShown.f20556a) {
                        TransitionManager.beginDelayedTransition(((zk) this$02.q()).B);
                        ((zk) this$02.q()).B.setVisibility(4);
                        isShown.f20556a = false;
                        return;
                    }
                    return;
                }
        }
    }
}
