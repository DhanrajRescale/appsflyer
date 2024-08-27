package id;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.GroupInfo;
import com.assetgro.stockgro.data.model.UserChatGroup;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.p0;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f19846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, int i10) {
        super(1);
        this.f19845a = i10;
        this.f19846b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        String str;
        String type;
        int i11 = this.f19845a;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        g gVar = this.f19846b;
        switch (i11) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((SocialChatListViewModel) gVar.r()).o(new m(true));
                }
                return Unit.f23355a;
            case 1:
                he.f fVar = (he.f) obj;
                if (fVar == null) {
                    i10 = -1;
                } else {
                    i10 = c.f19847a[fVar.ordinal()];
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) gVar.r();
                            socialChatListViewModel.n();
                            UserChatGroup userChatGroup = ((o) socialChatListViewModel.L.getValue()).f19872e;
                            if (userChatGroup != null) {
                                socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(socialChatListViewModel), null, null, new r(socialChatListViewModel, userChatGroup, null), 3);
                            }
                        }
                    } else {
                        SocialChatListViewModel socialChatListViewModel2 = (SocialChatListViewModel) gVar.r();
                        socialChatListViewModel2.n();
                        UserChatGroup userChatGroup2 = ((o) socialChatListViewModel2.L.getValue()).f19872e;
                        if (userChatGroup2 != null) {
                            socialChatListViewModel2.f9084g.postValue(Boolean.TRUE);
                            yk.g.H(u0.f(socialChatListViewModel2), null, null, new s(socialChatListViewModel2, userChatGroup2, null), 3);
                        }
                    }
                } else {
                    ((SocialChatListViewModel) gVar.r()).n();
                }
                return Unit.f23355a;
            case 2:
                if (Intrinsics.a(gVar.H().f9368p.getValue(), "SocialChatListFragment")) {
                    yk.g.H(yk.j.X0(gVar), null, null, new d(gVar, null), 3);
                }
                return Unit.f23355a;
            case 3:
                Context context = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Context requireContext = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String text = ((z9.i) obj).a(requireContext);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
            default:
                UserChatGroup group = (UserChatGroup) obj;
                Intrinsics.checkNotNullParameter(group, "group");
                int i12 = g.f19854k;
                gVar.H().f9366n.postValue(new Pair(null, Boolean.FALSE));
                gVar.H().f9367o.postValue(he.f.f18308a);
                Intent intent = new Intent(gVar.requireActivity(), (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", group.getGroupId());
                intent.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) gVar.r()).f9100w.getValue());
                intent.putExtra("USER_ROLE", group.getRole());
                intent.putExtra("CALL_FROM_CHAT", true);
                gVar.f19858j.a(intent);
                Intrinsics.checkNotNullParameter(group, "group");
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("group_id", group.getGroupId());
                GroupInfo groupInfo = group.getGroupInfo();
                if (groupInfo == null || (str = groupInfo.getGroupName()) == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                pairArr[1] = new Pair("group_name", str);
                GroupInfo groupInfo2 = group.getGroupInfo();
                if (groupInfo2 != null && (type = groupInfo2.getType()) != null) {
                    str2 = type;
                }
                pairArr[2] = new Pair("group_type", str2);
                pairArr[3] = new Pair("chat_group_role", group.getRole());
                gVar.y(new AnalyticEvent("app_chat_conversation_open", p0.f(pairArr)));
                return Unit.f23355a;
        }
    }
}
