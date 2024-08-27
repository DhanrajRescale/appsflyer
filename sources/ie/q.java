package ie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.navigation.f0;
import ba.e0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.ManageMemberResponse;
import com.assetgro.stockgro.data.model.MembershipStatus;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.social.domain.model.ChatMetaData;
import com.assetgro.stockgro.ui.social.domain.model.UserGroupLevelPermissions;
import ej.t0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import td.a0;
import vt.g0;
import vt.y;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailHostActivity f19943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(GroupDetailHostActivity groupDetailHostActivity, int i10) {
        super(1);
        this.f19942a = i10;
        this.f19943b = groupDetailHostActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f19942a;
        GroupDetailHostActivity groupDetailHostActivity = this.f19943b;
        switch (i10) {
            case 12:
                Intent intent = new Intent();
                intent.putExtra("GROUP_CHAT_ID", ((GroupChatHostViewModel) groupDetailHostActivity.x()).A);
                intent.putExtra("IS_FOLLOWING", false);
                groupDetailHostActivity.setResult(-1, intent);
                groupDetailHostActivity.finish();
                return;
            default:
                ChatSharedViewModel K = groupDetailHostActivity.K();
                Intrinsics.c(bool);
                K.i(bool.booleanValue());
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [qj.b, java.lang.Object] */
    public final void d(String manageInvite) {
        int i10 = this.f19942a;
        String str = "User";
        int i11 = 1;
        int i12 = 0;
        GroupDetailHostActivity groupDetailHostActivity = this.f19943b;
        switch (i10) {
            case 5:
                Intrinsics.checkNotNullParameter(manageInvite, "manageInvite");
                if (Intrinsics.a(manageInvite, "reject")) {
                    ?? obj = new Object();
                    String string = groupDetailHostActivity.getString(R.string.this_will_also_remove_the_chat);
                    String string2 = groupDetailHostActivity.getString(R.string.reject_message_request);
                    String string3 = groupDetailHostActivity.getString(R.string.text_reject);
                    String string4 = groupDetailHostActivity.getString(R.string.cancel);
                    GroupDetailHostActivity groupDetailHostActivity2 = this.f19943b;
                    r rVar = new r(groupDetailHostActivity2, manageInvite, i12);
                    Intrinsics.c(string);
                    Intrinsics.c(string3);
                    Intrinsics.c(string4);
                    Intrinsics.c(string2);
                    qj.b.b(obj, groupDetailHostActivity2, string, string3, string4, string2, null, true, R.dimen.dimen_12dp, 0, rVar, 63312);
                    return;
                }
                String str2 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).A;
                if (str2 != null) {
                    ((GroupChatHostViewModel) groupDetailHostActivity.x()).o(manageInvite, str2);
                    return;
                }
                return;
            case 6:
                Intrinsics.checkNotNullParameter(manageInvite, "manageInvite");
                ?? obj2 = new Object();
                String string5 = groupDetailHostActivity.getString(R.string.confirm_block_body_text);
                Object[] objArr = new Object[1];
                String str3 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).B;
                if (str3 != null) {
                    str = str3;
                }
                objArr[0] = str;
                String string6 = groupDetailHostActivity.getString(R.string.block_confirm_title_text, objArr);
                String string7 = groupDetailHostActivity.getString(R.string.block_disclaimer);
                String string8 = groupDetailHostActivity.getString(R.string.text_block);
                String string9 = groupDetailHostActivity.getString(R.string.cancel);
                GroupDetailHostActivity groupDetailHostActivity3 = this.f19943b;
                r rVar2 = new r(groupDetailHostActivity3, manageInvite, i11);
                Intrinsics.c(string5);
                Intrinsics.c(string8);
                Intrinsics.c(string9);
                Intrinsics.c(string6);
                Intrinsics.c(string7);
                qj.b.b(obj2, groupDetailHostActivity3, string5, string8, string9, string6, string7, true, R.dimen.dimen_12dp, R.color.black, rVar2, 59152);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(manageInvite, "manageInvite");
                if (Intrinsics.a(manageInvite, "accept")) {
                    String str4 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).A;
                    if (str4 != null) {
                        ((GroupChatHostViewModel) groupDetailHostActivity.x()).o(manageInvite, str4);
                        return;
                    }
                    return;
                }
                int i13 = GroupDetailHostActivity.f9382p;
                groupDetailHostActivity.R();
                return;
            case 9:
                ((e0) groupDetailHostActivity.w()).f4554x.setVisibility(8);
                Toolbar toolbar = ((e0) groupDetailHostActivity.w()).A;
                toolbar.setTitle(manageInvite);
                groupDetailHostActivity.u(toolbar);
                toolbar.setNavigationOnClickListener(new m(groupDetailHostActivity, 3));
                groupDetailHostActivity.v(toolbar);
                return;
            case 11:
                Intrinsics.c(manageInvite);
                int i14 = GroupDetailHostActivity.f9382p;
                groupDetailHostActivity.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", manageInvite);
                intent.putExtra("android.intent.extra.TEXT", manageInvite);
                groupDetailHostActivity.startActivity(Intent.createChooser(intent, groupDetailHostActivity.getString(R.string.game_start_invite_friends_title)));
                return;
            case 19:
                ((e0) groupDetailHostActivity.w()).f4553w.setText(manageInvite);
                return;
            case 20:
                ImageView groupDisplayImage = ((e0) groupDetailHostActivity.w()).f4552v;
                Intrinsics.checkNotNullExpressionValue(groupDisplayImage, "groupDisplayImage");
                al.d.B0(groupDisplayImage, manageInvite, R.drawable.ic_group_display_placeholder);
                return;
            case 24:
                Intrinsics.checkNotNullParameter(manageInvite, "manageInvite");
                if (Intrinsics.a(manageInvite, "reject")) {
                    ?? obj3 = new Object();
                    String string10 = groupDetailHostActivity.getString(R.string.confirmation_remove_chat_from_message_invites);
                    String string11 = groupDetailHostActivity.getString(R.string.reject_message_request);
                    String string12 = groupDetailHostActivity.getString(R.string.text_reject);
                    String string13 = groupDetailHostActivity.getString(R.string.cancel);
                    GroupDetailHostActivity groupDetailHostActivity4 = this.f19943b;
                    r rVar3 = new r(groupDetailHostActivity4, manageInvite, 2);
                    Intrinsics.c(string10);
                    Intrinsics.c(string12);
                    Intrinsics.c(string13);
                    Intrinsics.c(string11);
                    qj.b.b(obj3, groupDetailHostActivity4, string10, string12, string13, string11, null, true, R.dimen.dimen_12dp, 0, rVar3, 63312);
                    return;
                }
                String str5 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).A;
                if (str5 != null) {
                    ((GroupChatHostViewModel) groupDetailHostActivity.x()).o(manageInvite, str5);
                    return;
                }
                return;
            case 25:
                Intrinsics.checkNotNullParameter(manageInvite, "manageInvite");
                Group group = (Group) ((GroupChatHostViewModel) groupDetailHostActivity.x()).f9372q.getValue();
                if (group != null) {
                    ?? obj4 = new Object();
                    String string14 = groupDetailHostActivity.getString(R.string.block_confirmation_text_body);
                    Object[] objArr2 = new Object[1];
                    String str6 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).B;
                    if (str6 != null) {
                        str = str6;
                    }
                    objArr2[0] = str;
                    String string15 = groupDetailHostActivity.getString(R.string.block_this_group, objArr2);
                    String string16 = groupDetailHostActivity.getString(R.string.block_reassurance_text);
                    String string17 = groupDetailHostActivity.getString(R.string.text_block);
                    String string18 = groupDetailHostActivity.getString(R.string.cancel);
                    a0 a0Var = new a0(groupDetailHostActivity, group, manageInvite);
                    Intrinsics.c(string14);
                    Intrinsics.c(string17);
                    Intrinsics.c(string18);
                    Intrinsics.c(string15);
                    Intrinsics.c(string16);
                    qj.b.b(obj4, groupDetailHostActivity, string14, string17, string18, string15, string16, true, R.dimen.dimen_12dp, R.color.black, a0Var, 59152);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(manageInvite, "manageInvite");
                if (Intrinsics.a(manageInvite, "accept")) {
                    String str7 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).A;
                    if (str7 != null) {
                        ((GroupChatHostViewModel) groupDetailHostActivity.x()).o(manageInvite, str7);
                        return;
                    }
                    return;
                }
                int i15 = GroupDetailHostActivity.f9382p;
                groupDetailHostActivity.R();
                return;
        }
    }

    public final void e(kj.j jVar) {
        int i10 = this.f19942a;
        boolean z10 = false;
        GroupDetailHostActivity groupDetailHostActivity = this.f19943b;
        switch (i10) {
            case 1:
                String str = (String) jVar.a();
                if (str != null) {
                    int i11 = t0.f15547i;
                    t0 e10 = ni.g.e(str, new AnalyticEvent("app_social_group_member_sub_upgrade", null, 2, null));
                    e10.setCancelable(false);
                    e10.show(groupDetailHostActivity.getSupportFragmentManager(), "SubscriptionUpgradePlanBottomSheetDialogFragment");
                    return;
                }
                return;
            case 3:
                if (((Group) ((GroupChatHostViewModel) groupDetailHostActivity.x()).f9372q.getValue()) != null) {
                    e0 e0Var = (e0) groupDetailHostActivity.w();
                    e0Var.f4549s.m((UserGroupLevelPermissions) ((GroupChatHostViewModel) groupDetailHostActivity.x()).f9380y.getValue());
                    return;
                }
                return;
            case 4:
                ((e0) groupDetailHostActivity.w()).f4549s.o(false);
                return;
            case 10:
                ((e0) groupDetailHostActivity.w()).f4554x.setVisibility(0);
                return;
            case 15:
                groupDetailHostActivity.K().f9136q.postValue(new kj.j(Unit.f23355a));
                String str2 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).A;
                if (str2 != null) {
                    f0 f0Var = groupDetailHostActivity.f9385m;
                    if (f0Var != null) {
                        f0Var.q(R.id.chatFragment);
                        androidx.navigation.t L = groupDetailHostActivity.L();
                        f0 f0Var2 = groupDetailHostActivity.f9385m;
                        if (f0Var2 != null) {
                            L.x(f0Var2, hl.f.y(new Pair("GROUP_CHAT_ID", str2)));
                            return;
                        } else {
                            Intrinsics.k("navGraph");
                            throw null;
                        }
                    }
                    Intrinsics.k("navGraph");
                    throw null;
                }
                return;
            case 16:
                groupDetailHostActivity.K().f9136q.postValue(new kj.j(Unit.f23355a));
                String str3 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).A;
                if (str3 != null) {
                    f0 f0Var3 = groupDetailHostActivity.f9385m;
                    if (f0Var3 != null) {
                        f0Var3.q(R.id.feedStreamFragment);
                        androidx.navigation.t L2 = groupDetailHostActivity.L();
                        f0 f0Var4 = groupDetailHostActivity.f9385m;
                        if (f0Var4 != null) {
                            String str4 = (String) ((GroupChatHostViewModel) groupDetailHostActivity.x()).O.getValue();
                            if (str4 == null) {
                                str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            L2.x(f0Var4, new sb.a("FEED_STREAM_GROUP", str3, str4, null, true, false).a());
                            return;
                        }
                        Intrinsics.k("navGraph");
                        throw null;
                    }
                    Intrinsics.k("navGraph");
                    throw null;
                }
                return;
            case 18:
                Bundle extras = groupDetailHostActivity.getIntent().getExtras();
                if (extras != null) {
                    z10 = extras.getBoolean("CALL_FROM_CHAT", false);
                }
                String str5 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).A;
                if (str5 != null) {
                    f0 f0Var5 = groupDetailHostActivity.f9385m;
                    if (f0Var5 != null) {
                        f0Var5.q(R.id.groupFeedAndChatHostFragment);
                        androidx.navigation.t L3 = groupDetailHostActivity.L();
                        f0 f0Var6 = groupDetailHostActivity.f9385m;
                        if (f0Var6 != null) {
                            int i12 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).J;
                            new t(str5, i12, z10);
                            Bundle bundle = new Bundle();
                            bundle.putString("groupId", str5);
                            bundle.putInt("activeTab", i12);
                            bundle.putBoolean("callFromChat", z10);
                            L3.x(f0Var6, bundle);
                            return;
                        }
                        Intrinsics.k("navGraph");
                        throw null;
                    }
                    Intrinsics.k("navGraph");
                    throw null;
                }
                return;
            default:
                String str6 = (String) jVar.a();
                if (str6 != null) {
                    int i13 = t0.f15547i;
                    t0 e11 = ni.g.e(str6, new AnalyticEvent("app_social_group_member_sub_upgrade", null, 2, null));
                    e11.setCancelable(false);
                    e11.show(groupDetailHostActivity.getSupportFragmentManager(), "SubscriptionUpgradePlanBottomSheetDialogFragment");
                    return;
                }
                return;
        }
    }

    public final void f(Pair pair) {
        int i10 = this.f19942a;
        GroupDetailHostActivity groupDetailHostActivity = this.f19943b;
        switch (i10) {
            case 0:
                if (((CharSequence) pair.f23353a).length() > 0) {
                    ((e0) groupDetailHostActivity.w()).f4556z.setVisibility(0);
                    e0 e0Var = (e0) groupDetailHostActivity.w();
                    e0Var.f4556z.setText((CharSequence) pair.f23353a);
                    e0 e0Var2 = (e0) groupDetailHostActivity.w();
                    e0Var2.f4556z.setBackgroundDrawable(r3.k.getDrawable(((e0) groupDetailHostActivity.w()).f4556z.getContext(), ((Number) pair.f23354b).intValue()));
                    return;
                }
                ((e0) groupDetailHostActivity.w()).f4556z.setVisibility(8);
                return;
            default:
                if (((CharSequence) pair.f23353a).length() > 0) {
                    ((e0) groupDetailHostActivity.w()).f4556z.setVisibility(0);
                    e0 e0Var3 = (e0) groupDetailHostActivity.w();
                    e0Var3.f4556z.setText((CharSequence) pair.f23353a);
                    e0 e0Var4 = (e0) groupDetailHostActivity.w();
                    e0Var4.f4556z.setBackgroundDrawable(r3.k.getDrawable(((e0) groupDetailHostActivity.w()).f4556z.getContext(), ((Number) pair.f23354b).intValue()));
                    return;
                }
                ((e0) groupDetailHostActivity.w()).f4556z.setVisibility(8);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        String type;
        Group group;
        int i10 = this.f19942a;
        int i11 = 1;
        String str = null;
        GroupDetailHostActivity groupDetailHostActivity = this.f19943b;
        switch (i10) {
            case 0:
                f((Pair) obj);
                return Unit.f23355a;
            case 1:
                e((kj.j) obj);
                return Unit.f23355a;
            case 2:
                ChatMessage chatMessage = (ChatMessage) obj;
                if (((Group) ((GroupChatHostViewModel) groupDetailHostActivity.x()).f9372q.getValue()) != null) {
                    e0 e0Var = (e0) groupDetailHostActivity.w();
                    Intrinsics.c(chatMessage);
                    e0Var.f4549s.n(chatMessage, ((GroupChatHostViewModel) groupDetailHostActivity.x()).f9369n.getUserId(), ((GroupChatHostViewModel) groupDetailHostActivity.x()).n(), (UserGroupLevelPermissions) ((GroupChatHostViewModel) groupDetailHostActivity.x()).f9380y.getValue());
                }
                return Unit.f23355a;
            case 3:
                e((kj.j) obj);
                return Unit.f23355a;
            case 4:
                e((kj.j) obj);
                return Unit.f23355a;
            case 5:
                d((String) obj);
                return Unit.f23355a;
            case 6:
                d((String) obj);
                return Unit.f23355a;
            case 7:
                d((String) obj);
                return Unit.f23355a;
            case 8:
                Group group2 = (Group) obj;
                ImageView groupDisplayImage = ((e0) groupDetailHostActivity.w()).f4552v;
                Intrinsics.checkNotNullExpressionValue(groupDisplayImage, "groupDisplayImage");
                int i12 = 0;
                kj.f.r(true, groupDisplayImage);
                Group group3 = (Group) ((GroupChatHostViewModel) groupDetailHostActivity.x()).f9372q.getValue();
                if (group3 != null && (type = group3.getType()) != null) {
                    z10 = type.equals("Support");
                } else {
                    z10 = false;
                }
                ImageView optionsMenu = ((e0) groupDetailHostActivity.w()).f4555y;
                Intrinsics.checkNotNullExpressionValue(optionsMenu, "optionsMenu");
                kj.f.r(!z10, optionsMenu);
                groupDetailHostActivity.K().f9134o.postValue(group2);
                List g10 = y.g("Invited", "InviteRejected");
                MembershipStatus membershipStatus = group2.getMembershipStatus();
                if (membershipStatus != null) {
                    str = membershipStatus.getStatus();
                }
                if (g0.q(g10, str)) {
                    View clickDisablerView = ((e0) groupDetailHostActivity.w()).f4550t;
                    Intrinsics.checkNotNullExpressionValue(clickDisablerView, "clickDisablerView");
                    zq.f.m0(clickDisablerView);
                    String type2 = group2.getType();
                    if (Intrinsics.a(type2, groupDetailHostActivity.getString(R.string._1on1))) {
                        ((GroupChatHostViewModel) groupDetailHostActivity.x()).C = ne.a.f28624a;
                        groupDetailHostActivity.K().i(group2.getIsUserBlocked());
                        e0 e0Var2 = (e0) groupDetailHostActivity.w();
                        s sVar = new s(groupDetailHostActivity, i12);
                        Object obj2 = b1.d.f3079a;
                        e0Var2.f4551u.setContent(new b1.c(sVar, true, -1117200078));
                    } else if (Intrinsics.a(type2, groupDetailHostActivity.getString(R.string.private_privacy_layer))) {
                        ((GroupChatHostViewModel) groupDetailHostActivity.x()).C = ne.a.f28625b;
                        e0 e0Var3 = (e0) groupDetailHostActivity.w();
                        s sVar2 = new s(groupDetailHostActivity, i11);
                        Object obj3 = b1.d.f3079a;
                        e0Var3.f4551u.setContent(new b1.c(sVar2, true, 2022046377));
                    }
                }
                return Unit.f23355a;
            case 9:
                d((String) obj);
                return Unit.f23355a;
            case 10:
                e((kj.j) obj);
                return Unit.f23355a;
            case 11:
                d((String) obj);
                return Unit.f23355a;
            case 12:
                a((Boolean) obj);
                return Unit.f23355a;
            case 13:
                a((Boolean) obj);
                return Unit.f23355a;
            case 14:
                AnalyticEvent analyticEvent = (AnalyticEvent) obj;
                Intrinsics.c(analyticEvent);
                groupDetailHostActivity.A(analyticEvent);
                return Unit.f23355a;
            case 15:
                e((kj.j) obj);
                return Unit.f23355a;
            case 16:
                e((kj.j) obj);
                return Unit.f23355a;
            case 17:
                View clickDisablerView2 = ((e0) groupDetailHostActivity.w()).f4550t;
                Intrinsics.checkNotNullExpressionValue(clickDisablerView2, "clickDisablerView");
                zq.f.M(clickDisablerView2);
                String status = ((ManageMemberResponse) obj).getStatus();
                if (Intrinsics.a(status, "Joined")) {
                    ComposeView composeView = ((e0) groupDetailHostActivity.w()).f4551u;
                    Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
                    groupDetailHostActivity.hide(composeView);
                    ((GroupChatHostViewModel) groupDetailHostActivity.x()).C = null;
                    groupDetailHostActivity.invalidateOptionsMenu();
                } else if (Intrinsics.a(status, "InviteRejected")) {
                    Intent intent = new Intent();
                    intent.putExtra("GROUP_CHAT_ID", ((GroupChatHostViewModel) groupDetailHostActivity.x()).A);
                    intent.putExtra("IS_FOLLOWING", true);
                    groupDetailHostActivity.setResult(-1, intent);
                    groupDetailHostActivity.finish();
                }
                return Unit.f23355a;
            case 18:
                e((kj.j) obj);
                return Unit.f23355a;
            case 19:
                d((String) obj);
                return Unit.f23355a;
            case 20:
                d((String) obj);
                return Unit.f23355a;
            case 21:
                f((Pair) obj);
                return Unit.f23355a;
            case 22:
                e((kj.j) obj);
                return Unit.f23355a;
            case 23:
                ChatMetaData chatMetaData = (ChatMetaData) obj;
                if (chatMetaData != null && (group = chatMetaData.getGroupInfo()) != null) {
                    GroupChatHostViewModel groupChatHostViewModel = (GroupChatHostViewModel) groupDetailHostActivity.x();
                    Intrinsics.checkNotNullParameter(group, "group");
                    groupChatHostViewModel.f9372q.postValue(group);
                    if (group.getIsFeedEnabled()) {
                        groupChatHostViewModel.f9375t.postValue(new kj.j(Unit.f23355a));
                    } else {
                        groupChatHostViewModel.f9374s.postValue(new kj.j(Unit.f23355a));
                    }
                    String groupLanding = group.getGroupLanding();
                    if (groupLanding != null) {
                        if (!Intrinsics.a(groupLanding, "GROUP_CHAT")) {
                            i11 = groupChatHostViewModel.K;
                        }
                    } else {
                        i11 = groupChatHostViewModel.K;
                    }
                    groupChatHostViewModel.J = i11;
                }
                return Unit.f23355a;
            case 24:
                d((String) obj);
                return Unit.f23355a;
            case 25:
                d((String) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
