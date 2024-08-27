package td;

import android.app.Dialog;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.remote.response.ReportEntityType;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a0 implements qj.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35823d;

    public /* synthetic */ a0(String str, String str2, int i10, Object obj) {
        this.f35820a = i10;
        this.f35823d = obj;
        this.f35821b = str;
        this.f35822c = str2;
    }

    @Override // qj.m
    public final void e(Dialog dialog) {
        switch (this.f35820a) {
            case 0:
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
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
        int i10 = this.f35820a;
        String str = this.f35821b;
        Object obj = this.f35822c;
        Object obj2 = this.f35823d;
        switch (i10) {
            case 0:
                GroupInfoV2Fragment groupInfoV2Fragment = (GroupInfoV2Fragment) obj2;
                Intent intent = new Intent(groupInfoV2Fragment.requireContext(), (Class<?>) ReportEntityActivity.class);
                intent.putExtra("REPORT_USER_NAME", str);
                intent.putExtra("USER_ID_TO_BE_REPORTED", (String) obj);
                intent.putExtra("ENTITY_TYPE_TO_BE_REPORTED", ReportEntityType.User);
                groupInfoV2Fragment.f9225o.a(intent);
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                GroupMemberListActivity groupMemberListActivity = (GroupMemberListActivity) obj2;
                Intent intent2 = new Intent(groupMemberListActivity, (Class<?>) ReportEntityActivity.class);
                intent2.putExtra("REPORT_USER_NAME", str);
                intent2.putExtra("USER_ID_TO_BE_REPORTED", (String) obj);
                intent2.putExtra("ENTITY_TYPE_TO_BE_REPORTED", ReportEntityType.User);
                groupMemberListActivity.f9284k.a(intent2);
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                GroupDetailHostActivity context = (GroupDetailHostActivity) obj2;
                if (Intrinsics.a(context.K().f9138s.getValue(), Boolean.TRUE)) {
                    String text = context.getString(R.string.you_have_already_blocked_this_user);
                    Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        return;
                    }
                    return;
                }
                String str2 = ((GroupChatHostViewModel) context.x()).A;
                if (str2 != null) {
                    ((GroupChatHostViewModel) context.x()).h(((Group) obj).getFriendUserId(), str, str2);
                    return;
                }
                return;
        }
    }

    @Override // qj.m
    public final void o() {
    }

    public a0(GroupDetailHostActivity groupDetailHostActivity, Group group, String str) {
        this.f35820a = 2;
        this.f35823d = groupDetailHostActivity;
        this.f35822c = group;
        this.f35821b = str;
    }
}
