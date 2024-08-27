package vd;

import android.view.View;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListActivity f37985b;

    public /* synthetic */ j(GroupMemberListActivity groupMemberListActivity, int i10) {
        this.f37984a = i10;
        this.f37985b = groupMemberListActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f37984a;
        GroupMemberListActivity this$0 = this.f37985b;
        switch (i10) {
            case 0:
                int i11 = GroupMemberListActivity.f9283m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                return;
            default:
                int i12 = GroupMemberListActivity.f9283m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) this$0.x();
                groupMemberListViewModel.f9287o = true;
                groupMemberListViewModel.H = 0;
                return;
        }
    }
}
