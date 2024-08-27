package vd;

import android.os.Bundle;
import androidx.fragment.app.j1;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements r7.j, j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListActivity f37986a;

    @Override // androidx.fragment.app.j1
    public final void d(Bundle bundle, String str) {
        String userId;
        int i10 = GroupMemberListActivity.f9283m;
        GroupMemberListActivity this$0 = this.f37986a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("bundleKey");
        if (Intrinsics.a(string, "SOCIAL_BOTTOM_SHEET_PRIMARY_ACTION")) {
            GroupMember groupMember = (GroupMember) ((GroupMemberListViewModel) this$0.x()).f9290r.getValue();
            if (groupMember != null && (userId = groupMember.getUserId()) != null) {
                ((GroupMemberListViewModel) this$0.x()).k(userId, "Admin");
                return;
            }
            return;
        }
        Intrinsics.a(string, "SOCIAL_BOTTOM_SHEET_SECONDARY_ACTION");
    }

    @Override // r7.j
    public final void i() {
        int i10 = GroupMemberListActivity.f9283m;
        GroupMemberListActivity this$0 = this.f37986a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) this$0.x();
        groupMemberListViewModel.F = HttpUrl.FRAGMENT_ENCODE_SET;
        groupMemberListViewModel.H = 0;
        groupMemberListViewModel.m();
    }
}
