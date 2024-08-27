package vd;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import ba.o0;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import td.a0;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListActivity f37988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(GroupMemberListActivity groupMemberListActivity, int i10) {
        super(1);
        this.f37987a = i10;
        this.f37988b = groupMemberListActivity;
    }

    public final void a(GroupMember it) {
        int i10 = this.f37987a;
        GroupMemberListActivity groupMemberListActivity = this.f37988b;
        switch (i10) {
            case 1:
                Intrinsics.c(it);
                GroupMemberListActivity.L(groupMemberListActivity, it);
                return;
            case 5:
                Intrinsics.c(it);
                GroupMemberListActivity.K(groupMemberListActivity, it);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i11 = GroupMemberListActivity.f9283m;
                ((GroupMemberListViewModel) groupMemberListActivity.x()).l(it.getUserId());
                return;
        }
    }

    public final void d(Boolean bool) {
        int i10 = this.f37987a;
        GroupMemberListActivity groupMemberListActivity = this.f37988b;
        switch (i10) {
            case 2:
                o0 o0Var = (o0) groupMemberListActivity.w();
                Intrinsics.c(bool);
                o0Var.f5632u.setRefreshing(bool.booleanValue());
                return;
            default:
                int i11 = xd.f.f40182k;
                Bundle bundle = new Bundle();
                xd.f fVar = new xd.f();
                fVar.setArguments(bundle);
                fVar.show(groupMemberListActivity.getSupportFragmentManager(), "MemberOptionsBottomSheetFragment");
                return;
        }
    }

    public final void e(String text) {
        int i10 = this.f37987a;
        GroupMemberListActivity context = this.f37988b;
        switch (i10) {
            case 0:
                String string = context.getString(R.string.text_member_role_updated);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String text2 = a3.a.m(new Object[]{text}, 1, string, "format(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text2, "text");
                if (text2.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text2, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                if (((GroupMemberListViewModel) context.x()).I) {
                    context.setResult(-1);
                    context.finish();
                    return;
                }
                return;
            case 7:
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText2 = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService2 = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                    return;
                }
                return;
            default:
                if (text != null && text.length() > 2) {
                    GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) context.x();
                    Intrinsics.checkNotNullParameter(text, "<set-?>");
                    groupMemberListViewModel.F = text;
                    ((GroupMemberListViewModel) context.x()).m();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [qj.b, java.lang.Object] */
    public final void f(kj.j jVar) {
        String userId;
        String userId2;
        int i10 = this.f37987a;
        int i11 = 1;
        GroupMemberListActivity groupMemberListActivity = this.f37988b;
        switch (i10) {
            case 8:
                GroupMember groupMember = (GroupMember) ((GroupMemberListViewModel) groupMemberListActivity.x()).f9290r.getValue();
                if (groupMember != null && (userId = groupMember.getUserId()) != null) {
                    ?? obj = new Object();
                    String string = groupMemberListActivity.getString(R.string.text_remove_user_description);
                    String string2 = groupMemberListActivity.getString(R.string.text_remove_user);
                    String string3 = groupMemberListActivity.getString(R.string.text_yes);
                    String string4 = groupMemberListActivity.getString(R.string.cancel);
                    m mVar = new m(groupMemberListActivity, userId, i11);
                    Intrinsics.c(string);
                    Intrinsics.c(string3);
                    Intrinsics.c(string4);
                    Intrinsics.c(string2);
                    qj.b.b(obj, groupMemberListActivity, string, string3, string4, string2, null, false, 0, 0, mVar, 65488);
                    return;
                }
                return;
            case 9:
                GroupMember groupMember2 = (GroupMember) ((GroupMemberListViewModel) groupMemberListActivity.x()).f9290r.getValue();
                if (groupMember2 != null && (userId2 = groupMember2.getUserId()) != null) {
                    ?? obj2 = new Object();
                    String string5 = groupMemberListActivity.getString(R.string.text_block_user_description);
                    String string6 = groupMemberListActivity.getString(R.string.text_block_user);
                    String string7 = groupMemberListActivity.getString(R.string.text_yes);
                    String string8 = groupMemberListActivity.getString(R.string.cancel);
                    m mVar2 = new m(groupMemberListActivity, userId2, 0);
                    Intrinsics.c(string5);
                    Intrinsics.c(string7);
                    Intrinsics.c(string8);
                    Intrinsics.c(string6);
                    qj.b.b(obj2, groupMemberListActivity, string5, string7, string8, string6, null, false, 0, 0, mVar2, 65488);
                    return;
                }
                return;
            default:
                GroupMember groupMember3 = (GroupMember) ((GroupMemberListViewModel) groupMemberListActivity.x()).f9290r.getValue();
                if (groupMember3 != null) {
                    Intrinsics.checkNotNullParameter(groupMember3.getUserId(), "<set-?>");
                    String userId3 = groupMember3.getUserId();
                    String memberName = groupMember3.getMemberName();
                    ?? obj3 = new Object();
                    String string9 = groupMemberListActivity.getString(R.string.text_are_you_sure_report_user);
                    String string10 = groupMemberListActivity.getString(R.string.text_report_user);
                    String string11 = groupMemberListActivity.getString(R.string.text_yes);
                    String string12 = groupMemberListActivity.getString(R.string.cancel);
                    a0 a0Var = new a0(memberName, userId3, i11, groupMemberListActivity);
                    Intrinsics.c(string9);
                    Intrinsics.c(string11);
                    Intrinsics.c(string12);
                    Intrinsics.c(string10);
                    qj.b.b(obj3, groupMemberListActivity, string9, string11, string12, string10, null, false, 0, 0, a0Var, 65488);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f37987a;
        GroupMemberListActivity groupMemberListActivity = this.f37988b;
        switch (i10) {
            case 0:
                e((String) obj);
                return Unit.f23355a;
            case 1:
                a((GroupMember) obj);
                return Unit.f23355a;
            case 2:
                d((Boolean) obj);
                return Unit.f23355a;
            case 3:
                List list = (List) obj;
                if (((GroupMemberListViewModel) groupMemberListActivity.x()).H > 0) {
                    ArrayList arrayList = new ArrayList();
                    List p10 = groupMemberListActivity.M().p();
                    Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
                    arrayList.addAll(p10);
                    int size = arrayList.size();
                    Intrinsics.c(list);
                    arrayList.addAll(list);
                    groupMemberListActivity.M().u(arrayList);
                    groupMemberListActivity.M().f(size, list.size());
                } else {
                    groupMemberListActivity.M().u(list);
                }
                return Unit.f23355a;
            case 4:
                d((Boolean) obj);
                return Unit.f23355a;
            case 5:
                a((GroupMember) obj);
                return Unit.f23355a;
            case 6:
                Group group = (Group) obj;
                Intrinsics.c(group);
                groupMemberListActivity.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                Intent intent = new Intent(groupMemberListActivity, (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", group.getGroupId());
                groupMemberListActivity.startActivity(intent);
                return Unit.f23355a;
            case 7:
                e((String) obj);
                return Unit.f23355a;
            case 8:
                f((kj.j) obj);
                return Unit.f23355a;
            case 9:
                f((kj.j) obj);
                return Unit.f23355a;
            case 10:
                f((kj.j) obj);
                return Unit.f23355a;
            case 11:
                e((String) obj);
                return Unit.f23355a;
            default:
                a((GroupMember) obj);
                return Unit.f23355a;
        }
    }
}
