package ae;

import android.view.View;
import androidx.lifecycle.o;
import ba.fk;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import vt.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lae/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/bottomsheet/ReusedBottomSheetViewModel;", "Lba/fk;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends gd.h<ReusedBottomSheetViewModel, fk> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f373k = 0;

    /* renamed from: i, reason: collision with root package name */
    public xd.b f374i;

    /* renamed from: j, reason: collision with root package name */
    public final ut.g f375j = ut.h.a(new lc.b(this, 18));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.k();
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        yk.g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        yk.g.i(o10);
        this.f17274f = o10;
        n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        yk.g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_member_options_bottom_sheet;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        xd.b bVar = new xd.b(lifecycle, new ub.f(this, 11));
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f374i = bVar;
        ((GroupChatViewModel) this.f375j.getValue()).getClass();
        ArrayList c10 = y.c(new xd.a("Delete", "delete"));
        xd.b bVar2 = this.f374i;
        if (bVar2 != null) {
            bVar2.u(c10);
            fk fkVar = (fk) r();
            xd.b bVar3 = this.f374i;
            if (bVar3 != null) {
                fkVar.f4716s.setAdapter(bVar3);
                return;
            } else {
                Intrinsics.k("chatBottomSheetListAdapter");
                throw null;
            }
        }
        Intrinsics.k("chatBottomSheetListAdapter");
        throw null;
    }
}
