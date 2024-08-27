package ud;

import android.view.View;
import androidx.compose.foundation.layout.e;
import b1.c;
import b1.d;
import ba.ud;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.bottomSheet.EmptyBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lc.b;
import ls.n0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lud/a;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/chat/detail/group/info/bottomSheet/EmptyBottomSheetViewModel;", "Lba/ud;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends h<EmptyBottomSheetViewModel, ud> {
    public a() {
        ut.h.a(new b(this, 11));
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.e();
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        g.i(o10);
        this.f17274f = o10;
        n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.compose_bottom_sheet;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ud udVar = (ud) r();
        e eVar = new e(this, 24);
        Object obj = d.f3079a;
        udVar.f6286s.setContent(new c(eVar, true, 536444142));
    }
}
