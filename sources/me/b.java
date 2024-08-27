package me;

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
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.chat.members.BannedMemberListViewModel;
import com.assetgro.stockgro.ui.chat.members.BannedMembersListActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import ge.q;
import iu.k;
import java.util.ArrayList;
import java.util.List;
import jt.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannedMembersListActivity f27722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(BannedMembersListActivity bannedMembersListActivity, int i10) {
        super(1);
        this.f27721a = i10;
        this.f27722b = bannedMembersListActivity;
    }

    public final void a(GroupMember it) {
        int i10 = this.f27721a;
        BannedMembersListActivity bannedMembersListActivity = this.f27722b;
        switch (i10) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                int i11 = BannedMembersListActivity.f9417l;
                bannedMembersListActivity.getClass();
                Intent intent = new Intent(bannedMembersListActivity, (Class<?>) UserProfileActivity.class);
                intent.putExtra("USER_IDENTIFIER", it.getUserId());
                intent.putExtra("CALL_FROM_CHAT", true);
                intent.putExtra("USER_NAME", it.getMemberName());
                bannedMembersListActivity.startActivity(intent);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i12 = BannedMembersListActivity.f9417l;
                BannedMemberListViewModel bannedMemberListViewModel = (BannedMemberListViewModel) bannedMembersListActivity.x();
                String userId = it.getUserId();
                String d10 = a3.a.d("toString(...)");
                bannedMemberListViewModel.f9084g.postValue(Boolean.TRUE);
                ChatRepository chatRepository = bannedMemberListViewModel.f9407n;
                h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, userId, chatRepository.getUserId())).c(((e) bannedMemberListViewModel.f9079b).J());
                d dVar = new d(new q(7, new a(bannedMemberListViewModel, 1)), new q(8, new a(bannedMemberListViewModel, 2)));
                c10.a(dVar);
                bannedMemberListViewModel.f9080c.c(dVar);
                return;
        }
    }

    public final void d(String text) {
        int i10 = this.f27721a;
        BannedMembersListActivity context = this.f27722b;
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
        int i10 = this.f27721a;
        BannedMembersListActivity bannedMembersListActivity = this.f27722b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                o0 o0Var = (o0) bannedMembersListActivity.w();
                Intrinsics.c(bool);
                o0Var.f5632u.setRefreshing(bool.booleanValue());
                return Unit.f23355a;
            case 1:
                List list = (List) obj;
                if (((BannedMemberListViewModel) bannedMembersListActivity.x()).f9415v > 0) {
                    ArrayList arrayList = new ArrayList();
                    List p10 = bannedMembersListActivity.K().p();
                    Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
                    arrayList.addAll(p10);
                    int size = arrayList.size();
                    Intrinsics.c(list);
                    arrayList.addAll(list);
                    bannedMembersListActivity.K().u(arrayList);
                    bannedMembersListActivity.K().f(size, list.size());
                } else {
                    bannedMembersListActivity.K().u(list);
                }
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                d((String) obj);
                return Unit.f23355a;
            case 4:
                Group group = (Group) obj;
                Intrinsics.c(group);
                bannedMembersListActivity.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                Intent intent = new Intent(bannedMembersListActivity, (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", group.getGroupId());
                bannedMembersListActivity.startActivity(intent);
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
