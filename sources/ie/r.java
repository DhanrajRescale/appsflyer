package ie;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class r implements qj.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailHostActivity f19945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19946c;

    public /* synthetic */ r(GroupDetailHostActivity groupDetailHostActivity, String str, int i10) {
        this.f19944a = i10;
        this.f19945b = groupDetailHostActivity;
        this.f19946c = str;
    }

    @Override // qj.m
    public final void e(Dialog dialog) {
        switch (this.f19944a) {
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
        int i10 = this.f19944a;
        String str = this.f19946c;
        GroupDetailHostActivity context = this.f19945b;
        switch (i10) {
            case 0:
                String str2 = ((GroupChatHostViewModel) context.x()).A;
                if (str2 != null) {
                    ((GroupChatHostViewModel) context.x()).o(str, str2);
                    return;
                }
                return;
            case 1:
                Group group = (Group) ((GroupChatHostViewModel) context.x()).f9372q.getValue();
                if (group != null) {
                    if (Intrinsics.a(context.K().f9138s.getValue(), Boolean.TRUE)) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter("You have already blocked this user", "text");
                        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c("You have already blocked this user", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        return;
                    }
                    String str3 = ((GroupChatHostViewModel) context.x()).A;
                    if (str3 != null) {
                        ((GroupChatHostViewModel) context.x()).h(group.getFriendUserId(), str, str3);
                        return;
                    }
                    return;
                }
                return;
            default:
                String str4 = ((GroupChatHostViewModel) context.x()).A;
                if (str4 != null) {
                    ((GroupChatHostViewModel) context.x()).o(str, str4);
                    return;
                }
                return;
        }
    }

    @Override // qj.m
    public final void o() {
    }
}
