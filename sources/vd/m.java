package vd;

import android.app.Dialog;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements qj.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListActivity f37990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37991c;

    public /* synthetic */ m(GroupMemberListActivity groupMemberListActivity, String str, int i10) {
        this.f37989a = i10;
        this.f37990b = groupMemberListActivity;
        this.f37991c = str;
    }

    @Override // qj.m
    public final void e(Dialog dialog) {
        switch (this.f37989a) {
            case 0:
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }

    @Override // qj.m
    public final void m(Dialog dialog) {
        int i10 = this.f37989a;
        String userId = this.f37991c;
        GroupMemberListActivity groupMemberListActivity = this.f37990b;
        switch (i10) {
            case 0:
                ((GroupMemberListViewModel) groupMemberListActivity.x()).i(userId, true);
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) groupMemberListActivity.x();
                Intrinsics.checkNotNullParameter(userId, "userId");
                groupMemberListViewModel.f9084g.postValue(Boolean.TRUE);
                yk.g.H(u0.f(groupMemberListViewModel), null, null, new u(groupMemberListViewModel, userId, null), 3);
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }

    @Override // qj.m
    public final void o() {
    }
}
