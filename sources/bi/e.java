package bi;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.OneToOneChatGroup;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.social.domain.model.User;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListActivity;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListViewModel;
import iu.k;
import java.util.ArrayList;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BlockedUserListActivity f6992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(BlockedUserListActivity blockedUserListActivity, int i10) {
        super(1);
        this.f6991a = i10;
        this.f6992b = blockedUserListActivity;
    }

    public final void a(User it) {
        Class cls;
        int i10 = this.f6991a;
        BlockedUserListActivity context = this.f6992b;
        switch (i10) {
            case 3:
                String text = context.getString(R.string.text_user_unblocked);
                Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                a aVar = context.f10121k;
                if (aVar != null) {
                    List p10 = aVar.p();
                    Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : p10) {
                        if (!Intrinsics.a(((User) obj).getUserId(), it.getUserId())) {
                            arrayList.add(obj);
                        }
                    }
                    a aVar2 = context.f10121k;
                    if (aVar2 != null) {
                        aVar2.u(arrayList);
                        return;
                    } else {
                        Intrinsics.k("blockUserListAdapter");
                        throw null;
                    }
                }
                Intrinsics.k("blockUserListAdapter");
                throw null;
            case 4:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i11 = BlockedUserListActivity.f10120l;
                BlockedUserListViewModel blockedUserListViewModel = (BlockedUserListViewModel) context.x();
                String userId = it.getUserId();
                String d10 = a3.a.d("toString(...)");
                blockedUserListViewModel.f9084g.postValue(Boolean.TRUE);
                ChatRepository chatRepository = blockedUserListViewModel.f10122n;
                nt.h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, userId, chatRepository.getUserId())).c(((kq.e) blockedUserListViewModel.f9079b).J());
                jt.d dVar = new jt.d(new nh.k(28, new g(blockedUserListViewModel, 0)), new nh.k(29, new g(blockedUserListViewModel, 1)));
                c10.a(dVar);
                blockedUserListViewModel.f9080c.c(dVar);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                int i12 = BlockedUserListActivity.f10120l;
                context.getClass();
                if (it.isExpert()) {
                    cls = RiaProfileActivity.class;
                } else {
                    cls = UserProfileActivity.class;
                }
                Intent intent = new Intent(context, (Class<?>) cls);
                intent.putExtra("USER_IDENTIFIER", it.getUserId());
                intent.putExtra("CALL_FROM_CHAT", true);
                intent.putExtra("USER_NAME", it.getMemberName());
                context.startActivity(intent);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f6991a;
        BlockedUserListActivity blockedUserListActivity = this.f6992b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                ba.i iVar = (ba.i) blockedUserListActivity.w();
                Intrinsics.c(bool);
                iVar.f4992w.setRefreshing(bool.booleanValue());
                return Unit.f23355a;
            case 1:
                Group group = (Group) obj;
                Intrinsics.c(group);
                blockedUserListActivity.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                Intent intent = new Intent(blockedUserListActivity, (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", group.getGroupId());
                blockedUserListActivity.startActivity(intent);
                return Unit.f23355a;
            case 2:
                List list = (List) obj;
                if ((list == null || list.isEmpty()) && ((BlockedUserListViewModel) blockedUserListActivity.x()).f10128t == 0) {
                    ((ba.i) blockedUserListActivity.w()).f4991v.setVisibility(0);
                    ((ba.i) blockedUserListActivity.w()).f4990u.setVisibility(8);
                } else {
                    ((ba.i) blockedUserListActivity.w()).f4991v.setVisibility(8);
                    ((ba.i) blockedUserListActivity.w()).f4990u.setVisibility(0);
                    if (((BlockedUserListViewModel) blockedUserListActivity.x()).f10128t > 0) {
                        ArrayList arrayList = new ArrayList();
                        a aVar = blockedUserListActivity.f10121k;
                        if (aVar != null) {
                            List p10 = aVar.p();
                            Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
                            arrayList.addAll(p10);
                            int size = arrayList.size();
                            Intrinsics.c(list);
                            arrayList.addAll(list);
                            a aVar2 = blockedUserListActivity.f10121k;
                            if (aVar2 != null) {
                                aVar2.u(arrayList);
                                a aVar3 = blockedUserListActivity.f10121k;
                                if (aVar3 != null) {
                                    aVar3.f(size, list.size());
                                } else {
                                    Intrinsics.k("blockUserListAdapter");
                                    throw null;
                                }
                            } else {
                                Intrinsics.k("blockUserListAdapter");
                                throw null;
                            }
                        } else {
                            Intrinsics.k("blockUserListAdapter");
                            throw null;
                        }
                    } else {
                        a aVar4 = blockedUserListActivity.f10121k;
                        if (aVar4 != null) {
                            aVar4.u(list);
                        } else {
                            Intrinsics.k("blockUserListAdapter");
                            throw null;
                        }
                    }
                }
                return Unit.f23355a;
            case 3:
                a((User) obj);
                return Unit.f23355a;
            case 4:
                if (((Unit) ((j) obj).a()) != null) {
                    int i11 = BlockedUserListActivity.f10120l;
                    blockedUserListActivity.getClass();
                    Intent intent2 = new Intent(blockedUserListActivity, (Class<?>) MaintenanceWindowActivity.class);
                    intent2.putExtra("DATA", qf.b.f31931f);
                    intent2.putExtra("SHOW_TOOLBAR", true);
                    intent2.putExtra("TOOLBAR_TITLE", blockedUserListActivity.getString(R.string.text_social_lowercase));
                    blockedUserListActivity.startActivity(intent2);
                    blockedUserListActivity.finish();
                }
                return Unit.f23355a;
            case 5:
                a((User) obj);
                return Unit.f23355a;
            default:
                a((User) obj);
                return Unit.f23355a;
        }
    }
}
