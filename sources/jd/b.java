package jd;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import ba.o0;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.OneToOneChatGroup;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListActivity;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import iu.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nt.h;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeactivatedMembersListActivity f21302b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(DeactivatedMembersListActivity deactivatedMembersListActivity, int i10) {
        super(1);
        this.f21301a = i10;
        this.f21302b = deactivatedMembersListActivity;
    }

    public final void a(GroupMember it) {
        Class cls;
        int i10 = this.f21301a;
        DeactivatedMembersListActivity deactivatedMembersListActivity = this.f21302b;
        switch (i10) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                sb.b bVar = DeactivatedMembersListActivity.f9104l;
                deactivatedMembersListActivity.getClass();
                if (it.getIsExpert()) {
                    cls = RiaProfileActivity.class;
                } else {
                    cls = UserProfileActivity.class;
                }
                Intent intent = new Intent(deactivatedMembersListActivity, (Class<?>) cls);
                intent.putExtra("USER_IDENTIFIER", it.getUserId());
                intent.putExtra("CALL_FROM_CHAT", true);
                intent.putExtra("USER_NAME", it.getMemberName());
                deactivatedMembersListActivity.startActivity(intent);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                sb.b bVar2 = DeactivatedMembersListActivity.f9104l;
                DeactivatedMembersListViewModel deactivatedMembersListViewModel = (DeactivatedMembersListViewModel) deactivatedMembersListActivity.x();
                String userId = it.getUserId();
                String d10 = a3.a.d("toString(...)");
                deactivatedMembersListViewModel.f9084g.postValue(Boolean.TRUE);
                ChatRepository chatRepository = deactivatedMembersListViewModel.f9106n;
                h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, userId, chatRepository.getUserId())).c(((kq.e) deactivatedMembersListViewModel.f9079b).J());
                jt.d dVar = new jt.d(new id.h(5, new e(deactivatedMembersListViewModel, 0)), new id.h(6, new e(deactivatedMembersListViewModel, 1)));
                c10.a(dVar);
                deactivatedMembersListViewModel.f9080c.c(dVar);
                return;
        }
    }

    public final void d(String text) {
        int i10 = this.f21301a;
        DeactivatedMembersListActivity context = this.f21302b;
        switch (i10) {
            case 2:
                List p10 = context.K().p();
                Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : p10) {
                    if (!Intrinsics.a(((GroupMember) obj).getUserId(), text)) {
                        arrayList.add(obj);
                    }
                }
                context.K().u(arrayList);
                return;
            default:
                Intrinsics.c(text);
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
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f21301a;
        DeactivatedMembersListActivity deactivatedMembersListActivity = this.f21302b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                o0 o0Var = (o0) deactivatedMembersListActivity.w();
                Intrinsics.c(bool);
                o0Var.f5632u.setRefreshing(bool.booleanValue());
                return Unit.f23355a;
            case 1:
                List list = (List) obj;
                if (((DeactivatedMembersListViewModel) deactivatedMembersListActivity.x()).f9112t > 0) {
                    ArrayList arrayList = new ArrayList();
                    List p10 = deactivatedMembersListActivity.K().p();
                    Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
                    arrayList.addAll(p10);
                    int size = arrayList.size();
                    Intrinsics.c(list);
                    arrayList.addAll(list);
                    deactivatedMembersListActivity.K().u(arrayList);
                    deactivatedMembersListActivity.K().f(size, list.size());
                } else {
                    deactivatedMembersListActivity.K().u(list);
                }
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                Group chatGroup = (Group) obj;
                Intrinsics.c(chatGroup);
                deactivatedMembersListActivity.getClass();
                Intrinsics.checkNotNullParameter(chatGroup, "chatGroup");
                Intent intent = new Intent(deactivatedMembersListActivity, (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", chatGroup.getGroupId());
                deactivatedMembersListActivity.startActivity(intent);
                return Unit.f23355a;
            case 4:
                d((String) obj);
                return Unit.f23355a;
            case 5:
                a((GroupMember) obj);
                return Unit.f23355a;
            default:
                a((GroupMember) obj);
                return Unit.f23355a;
        }
    }
}
