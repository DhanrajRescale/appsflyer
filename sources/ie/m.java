package ie;

import android.view.View;
import ba.e0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailHostActivity f19931b;

    public /* synthetic */ m(GroupDetailHostActivity groupDetailHostActivity, int i10) {
        this.f19930a = i10;
        this.f19931b = groupDetailHostActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String type;
        int i10 = this.f19930a;
        GroupDetailHostActivity this$0 = this.f19931b;
        switch (i10) {
            case 0:
                int i11 = GroupDetailHostActivity.f9382p;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Unit unit = null;
                if (((GroupChatHostViewModel) this$0.x()).n()) {
                    GroupChatHostViewModel groupChatHostViewModel = (GroupChatHostViewModel) this$0.x();
                    String str = groupChatHostViewModel.H;
                    List list = groupChatHostViewModel.M;
                    if (!list.contains(str) && !list.contains(groupChatHostViewModel.I)) {
                        if (((GroupChatHostViewModel) this$0.x()).C != null) {
                            this$0.N(false);
                            unit = Unit.f23355a;
                        }
                        if (unit == null) {
                            this$0.N(true);
                        }
                    } else {
                        if (((GroupChatHostViewModel) this$0.x()).C != null) {
                            this$0.O(false);
                            unit = Unit.f23355a;
                        }
                        if (unit == null) {
                            this$0.O(true);
                        }
                    }
                } else {
                    GroupChatHostViewModel groupChatHostViewModel2 = (GroupChatHostViewModel) this$0.x();
                    Group group = (Group) groupChatHostViewModel2.f9372q.getValue();
                    if (group != null && (type = group.getType()) != null && groupChatHostViewModel2.G.contains(type)) {
                        if (((GroupChatHostViewModel) this$0.x()).C != null) {
                            this$0.M(false);
                            unit = Unit.f23355a;
                        }
                        if (unit == null) {
                            this$0.M(true);
                        }
                    } else {
                        ((e0) this$0.w()).f4555y.setVisibility(8);
                    }
                }
                Group group2 = (Group) ((GroupChatHostViewModel) this$0.x()).f9372q.getValue();
                if (group2 != null) {
                    Intrinsics.checkNotNullParameter(group2, "group");
                    this$0.A(new AnalyticEvent("app_groupview_threedots_tapped", p0.f(new Pair("group_id", group2.getGroupId()), new Pair("group_name", group2.getGroupName()))));
                    return;
                }
                return;
            case 1:
                int i12 = GroupDetailHostActivity.f9382p;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.onBackPressed();
                this$0.setResult(-1);
                return;
            case 2:
                int i13 = GroupDetailHostActivity.f9382p;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Q();
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.onBackPressed();
                return;
        }
    }
}
