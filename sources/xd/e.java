package xd;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import com.google.android.gms.common.Scopes;
import iu.k;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f40181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(1);
        this.f40180a = i10;
        this.f40181b = fVar;
    }

    public final void a(a chatBottomSheetItem) {
        GroupMember groupMember;
        String userId;
        GroupMember groupMember2;
        String userId2;
        GroupMember groupMember3;
        String userId3;
        GroupMember groupMember4;
        GroupMember groupMember5;
        String userId4;
        GroupMember groupMember6;
        String userId5;
        GroupMember groupMember7;
        GroupMember groupMember8;
        String userId6;
        GroupMember groupMember9;
        GroupMember groupMember10;
        String userId7;
        GroupMember groupMember11;
        String userId8;
        int i10 = this.f40180a;
        f fVar = this.f40181b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(chatBottomSheetItem, "option");
                int i11 = f.f40182k;
                BaseViewModel B = fVar.B();
                Intrinsics.d(B, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel");
                GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) B;
                Intrinsics.checkNotNullParameter(chatBottomSheetItem, "chatBottomSheetItem");
                String str = chatBottomSheetItem.f40174b;
                int hashCode = str.hashCode();
                e0 e0Var = groupMemberListViewModel.f9290r;
                switch (hashCode) {
                    case -1996763020:
                        if (str.equals("deactivate") && (groupMember = (GroupMember) e0Var.getValue()) != null && (userId = groupMember.getUserId()) != null) {
                            groupMemberListViewModel.j(userId, "Rogue");
                            break;
                        }
                        break;
                    case -1655974669:
                        if (str.equals("activate") && (groupMember2 = (GroupMember) e0Var.getValue()) != null && (userId2 = groupMember2.getUserId()) != null) {
                            groupMemberListViewModel.j(userId2, "User");
                            break;
                        }
                        break;
                    case -1336765452:
                        if (str.equals("make_moderator") && (groupMember3 = (GroupMember) e0Var.getValue()) != null && (userId3 = groupMember3.getUserId()) != null) {
                            groupMemberListViewModel.k(userId3, "Moderator");
                            break;
                        }
                        break;
                    case -934610812:
                        if (str.equals("remove")) {
                            groupMemberListViewModel.f9294v.postValue(new j(Unit.f23355a));
                            break;
                        }
                        break;
                    case -934521548:
                        if (str.equals("report")) {
                            groupMemberListViewModel.f9296x.postValue(new j(Unit.f23355a));
                            break;
                        }
                        break;
                    case -309425751:
                        if (str.equals(Scopes.PROFILE) && (groupMember4 = (GroupMember) e0Var.getValue()) != null) {
                            groupMemberListViewModel.f9291s.postValue(groupMember4);
                            break;
                        }
                        break;
                    case -293212780:
                        if (str.equals("unblock") && (groupMember5 = (GroupMember) e0Var.getValue()) != null && (userId4 = groupMember5.getUserId()) != null) {
                            groupMemberListViewModel.i(userId4, false);
                            break;
                        }
                        break;
                    case 97295:
                        if (str.equals("ban") && (groupMember6 = (GroupMember) e0Var.getValue()) != null && (userId5 = groupMember6.getUserId()) != null) {
                            groupMemberListViewModel.h(userId5, "Rogue");
                            break;
                        }
                        break;
                    case 3052376:
                        if (str.equals("chat") && (groupMember7 = (GroupMember) e0Var.getValue()) != null) {
                            groupMemberListViewModel.l(groupMember7.getUserId());
                            break;
                        }
                        break;
                    case 93832333:
                        if (str.equals("block")) {
                            groupMemberListViewModel.f9295w.postValue(new j(Unit.f23355a));
                            break;
                        }
                        break;
                    case 111426262:
                        if (str.equals("unban") && (groupMember8 = (GroupMember) e0Var.getValue()) != null && (userId6 = groupMember8.getUserId()) != null) {
                            groupMemberListViewModel.h(userId6, "User");
                            break;
                        }
                        break;
                    case 583582142:
                        if (str.equals("make_admin") && (groupMember9 = (GroupMember) e0Var.getValue()) != null) {
                            groupMemberListViewModel.L.postValue(groupMember9);
                            break;
                        }
                        break;
                    case 1427182159:
                        if (str.equals("make_seeder") && (groupMember10 = (GroupMember) e0Var.getValue()) != null && (userId7 = groupMember10.getUserId()) != null) {
                            groupMemberListViewModel.k(userId7, "Seeder");
                            break;
                        }
                        break;
                    case 1671672458:
                        if (str.equals("dismiss") && (groupMember11 = (GroupMember) e0Var.getValue()) != null && (userId8 = groupMember11.getUserId()) != null) {
                            groupMemberListViewModel.k(userId8, "User");
                            break;
                        }
                        break;
                }
                fVar.dismiss();
                return;
            default:
                Intrinsics.checkNotNullParameter(chatBottomSheetItem, "option");
                int i12 = f.f40182k;
                BaseViewModel B2 = fVar.B();
                Intrinsics.d(B2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoViewModel");
                Intrinsics.checkNotNullParameter(chatBottomSheetItem, "chatBottomSheetItem");
                String str2 = chatBottomSheetItem.f40174b;
                switch (str2.hashCode()) {
                    case -1996763020:
                        if (str2.equals("deactivate")) {
                            throw null;
                        }
                        break;
                    case -1655974669:
                        if (str2.equals("activate")) {
                            throw null;
                        }
                        break;
                    case -934610812:
                        if (str2.equals("remove")) {
                            throw null;
                        }
                        break;
                    case -934521548:
                        if (str2.equals("report")) {
                            throw null;
                        }
                        break;
                    case -309425751:
                        if (str2.equals(Scopes.PROFILE)) {
                            throw null;
                        }
                        break;
                    case 97295:
                        if (str2.equals("ban")) {
                            throw null;
                        }
                        break;
                    case 3052376:
                        if (str2.equals("chat")) {
                            throw null;
                        }
                        break;
                    case 111426262:
                        if (str2.equals("unban")) {
                            throw null;
                        }
                        break;
                }
                fVar.dismiss();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f40180a) {
            case 0:
                a((a) obj);
                return Unit.f23355a;
            default:
                a((a) obj);
                return Unit.f23355a;
        }
    }
}
