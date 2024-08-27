package vd;

import android.view.View;
import androidx.lifecycle.e0;
import ba.fk;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import vt.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvd/v;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/bottomsheet/ReusedBottomSheetViewModel;", "Lba/fk;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class v extends gd.h<ReusedBottomSheetViewModel, fk> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f38018k = 0;

    /* renamed from: i, reason: collision with root package name */
    public xd.b f38019i;

    /* renamed from: j, reason: collision with root package name */
    public final ut.g f38020j = ut.h.a(new lc.b(this, 15));

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
        String role;
        GroupMember groupMember;
        String globalRole;
        Intrinsics.checkNotNullParameter(view, "view");
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        xd.b bVar = new xd.b(lifecycle, new ub.f(this, 9));
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f38019i = bVar;
        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) this.f38020j.getValue();
        groupChatViewModel.getClass();
        ArrayList c10 = y.c(new xd.a("Chat", "chat"), new xd.a("View Profile", Scopes.PROFILE));
        boolean contains = groupChatViewModel.f9165c0.contains(groupChatViewModel.f9192v0);
        e0 e0Var = groupChatViewModel.N;
        if (contains && (groupMember = (GroupMember) e0Var.getValue()) != null && (globalRole = groupMember.getGlobalRole()) != null) {
            if (Intrinsics.a(globalRole, "User")) {
                c10.add(new xd.a("Deactivate", "deactivate"));
            } else if (Intrinsics.a(globalRole, "Rogue")) {
                c10.add(new xd.a("Activate", "activate"));
            }
        }
        if (groupChatViewModel.w()) {
            GroupMember groupMember2 = (GroupMember) e0Var.getValue();
            if (groupMember2 != null && (role = groupMember2.getRole()) != null) {
                if (Intrinsics.a(role, "User")) {
                    c10.add(new xd.a("Ban", "ban"));
                } else if (Intrinsics.a(role, "Rogue")) {
                    c10.add(new xd.a("Unban", "unban"));
                }
            }
            c10.add(new xd.a("Remove from group", "remove"));
        }
        xd.b bVar2 = this.f38019i;
        if (bVar2 != null) {
            bVar2.u(c10);
            fk fkVar = (fk) r();
            xd.b bVar3 = this.f38019i;
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
