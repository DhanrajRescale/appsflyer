package xd;

import android.view.View;
import androidx.lifecycle.e0;
import androidx.lifecycle.o;
import ba.fk;
import com.assetgro.stockgro.data.model.GroupInfoActions;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupUIConfig;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoViewModel;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import ut.g;
import vt.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxd/f;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/bottomsheet/ReusedBottomSheetViewModel;", "Lba/fk;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends h<ReusedBottomSheetViewModel, fk> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f40182k = 0;

    /* renamed from: i, reason: collision with root package name */
    public b f40183i;

    /* renamed from: j, reason: collision with root package name */
    public final g f40184j = ut.h.a(new lc.b(this, 17));

    public final BaseViewModel B() {
        return (BaseViewModel) this.f40184j.getValue();
    }

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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // gd.h
    public final void z(View view) {
        String role;
        GroupInfoActions userActions;
        GroupMember groupMember;
        String globalRole;
        GroupMember groupMember2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (B() instanceof GroupMemberListViewModel) {
            o lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            b bVar = new b(lifecycle, new e(this, 0));
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            this.f40183i = bVar;
            BaseViewModel B = B();
            Intrinsics.d(B, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel");
            GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) B;
            ArrayList c10 = y.c(new a("View Profile", Scopes.PROFILE));
            GroupUIConfig groupUIConfig = (GroupUIConfig) groupMemberListViewModel.f9293u.getValue();
            if (groupUIConfig != null) {
                e0 e0Var = groupMemberListViewModel.f9290r;
                GroupMember groupMember3 = (GroupMember) e0Var.getValue();
                if (groupMember3 != null && (role = groupMember3.getRole()) != null) {
                    switch (role.hashCode()) {
                        case -1822363906:
                            if (role.equals("Seeder")) {
                                userActions = groupUIConfig.getSeederActions();
                                break;
                            }
                            userActions = groupUIConfig.getUserActions();
                            break;
                        case -736027:
                            if (role.equals("Moderator")) {
                                userActions = groupUIConfig.getModeratorActions();
                                break;
                            }
                            userActions = groupUIConfig.getUserActions();
                            break;
                        case 2645995:
                            if (role.equals("User")) {
                                userActions = groupUIConfig.getUserActions();
                                break;
                            }
                            userActions = groupUIConfig.getUserActions();
                            break;
                        case 63116079:
                            if (role.equals("Admin")) {
                                userActions = groupUIConfig.getAdminActions();
                                break;
                            }
                            userActions = groupUIConfig.getUserActions();
                            break;
                        default:
                            userActions = groupUIConfig.getUserActions();
                            break;
                    }
                    if (userActions != null) {
                        if (userActions.getMessageUser()) {
                            c10.add(new a("Chat", "chat"));
                        }
                        if (userActions.getDismiss()) {
                            c10.add(new a("Dismiss as ".concat(role), "dismiss"));
                        }
                        if (userActions.getRemove()) {
                            c10.add(new a("Remove", "remove"));
                        }
                        if (userActions.getBlock() && (groupMember2 = (GroupMember) e0Var.getValue()) != null) {
                            if (groupMember2.getIBlocked()) {
                                c10.add(new a("Unblock", "unblock"));
                            } else {
                                c10.add(new a("Block", "block"));
                            }
                        }
                        if (userActions.getReport()) {
                            c10.add(new a("Report", "report"));
                        }
                        if (userActions.getBan()) {
                            c10.add(new a("Ban", "ban"));
                        }
                        if (userActions.getMakeSeeder()) {
                            c10.add(new a("Make Seeder", "make_seeder"));
                        }
                        if (userActions.getMakeAdmin()) {
                            c10.add(new a("Make Admin", "make_admin"));
                        }
                        if (userActions.getMakeModerator()) {
                            c10.add(new a("Make Moderator", "make_moderator"));
                        }
                        if ((userActions.getActivate() || userActions.getDeactivate()) && (groupMember = (GroupMember) e0Var.getValue()) != null && (globalRole = groupMember.getGlobalRole()) != null) {
                            if (Intrinsics.a(globalRole, "Rogue")) {
                                c10.add(new a("Activate", "activate"));
                            } else {
                                c10.add(new a("Deactivate", "deactivate"));
                            }
                        }
                    }
                }
            }
            b bVar2 = this.f40183i;
            if (bVar2 != null) {
                bVar2.u(c10);
            } else {
                Intrinsics.k("chatBottomSheetListAdapter");
                throw null;
            }
        } else if (B() instanceof MessageThreadInfoViewModel) {
            o lifecycle2 = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
            b bVar3 = new b(lifecycle2, new e(this, 1));
            Intrinsics.checkNotNullParameter(bVar3, "<set-?>");
            this.f40183i = bVar3;
            BaseViewModel B2 = B();
            Intrinsics.d(B2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoViewModel");
            y.c(new a("Chat", "chat"), new a("View Profile", Scopes.PROFILE));
            throw null;
        }
        fk fkVar = (fk) r();
        b bVar4 = this.f40183i;
        if (bVar4 != null) {
            fkVar.f4716s.setAdapter(bVar4);
        } else {
            Intrinsics.k("chatBottomSheetListAdapter");
            throw null;
        }
    }
}
