package rd;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupMembersDto;
import com.assetgro.stockgro.data.model.MessageListDto;
import com.assetgro.stockgro.data.model.MessageThreadInfoDto;
import com.assetgro.stockgro.data.model.UserAuth;
import com.assetgro.stockgro.data.model.UserConfig;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.g0;
import vt.i0;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(GroupChatViewModel groupChatViewModel, int i10) {
        super(1);
        this.f33643a = i10;
        this.f33644b = groupChatViewModel;
    }

    public final void a(GroupMembersDto groupMembersDto) {
        int i10 = this.f33643a;
        GroupChatViewModel groupChatViewModel = this.f33644b;
        switch (i10) {
            case 9:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                List<GroupMember> members = groupMembersDto.getMembers();
                if (members != null) {
                    groupChatViewModel.M.postValue(members);
                }
                Boolean endOfResponse = groupMembersDto.getEndOfResponse();
                if (endOfResponse != null) {
                    endOfResponse.booleanValue();
                    return;
                }
                return;
            default:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                List<GroupMember> members2 = groupMembersDto.getMembers();
                if (members2 != null) {
                    groupChatViewModel.M.postValue(members2);
                    return;
                }
                return;
        }
    }

    public final void d(MessageListDto messageListDto) {
        List<ChatMessage> messages;
        List<ChatMessage> messages2;
        int i10 = this.f33643a;
        GroupChatViewModel groupChatViewModel = this.f33644b;
        switch (i10) {
            case 3:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                synchronized (groupChatViewModel) {
                    groupChatViewModel.K0 = false;
                }
                if (messageListDto != null && (messages = messageListDto.getMessages()) != null) {
                    groupChatViewModel.G.postValue(messages);
                    HashSet hashSet = groupChatViewModel.f9186s0;
                    ArrayList arrayList = new ArrayList(vt.z.k(messages));
                    Iterator<T> it = messages.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ChatMessage) it.next()).getMessageId());
                    }
                    hashSet.addAll(arrayList);
                }
                boolean endOfResponse = messageListDto.getEndOfResponse();
                synchronized (groupChatViewModel) {
                    groupChatViewModel.L0 = endOfResponse;
                }
                return;
            case 11:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                e0 e0Var = groupChatViewModel.T;
                e0Var.postValue(i0.f38321a);
                List<ChatMessage> messages3 = messageListDto.getMessages();
                if (messages3 != null) {
                    e0Var.postValue(messages3);
                    return;
                }
                return;
            default:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                synchronized (groupChatViewModel) {
                    groupChatViewModel.K0 = false;
                }
                if (messageListDto != null && (messages2 = messageListDto.getMessages()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it2 = messages2.iterator();
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        HashSet hashSet2 = groupChatViewModel.f9186s0;
                        if (hasNext) {
                            Object next = it2.next();
                            if (!hashSet2.contains(((ChatMessage) next).getMessageId())) {
                                arrayList2.add(next);
                            }
                        } else {
                            groupChatViewModel.F.postValue(arrayList2);
                            ArrayList arrayList3 = new ArrayList(vt.z.k(arrayList2));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(((ChatMessage) it3.next()).getMessageId());
                            }
                            hashSet2.addAll(arrayList3);
                        }
                    }
                }
                boolean endOfResponse2 = messageListDto.getEndOfResponse();
                synchronized (groupChatViewModel) {
                    groupChatViewModel.L0 = endOfResponse2;
                }
                return;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f33643a;
        GroupChatViewModel groupChatViewModel = this.f33644b;
        switch (i10) {
            case 5:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                ArrayList arrayList = (ArrayList) baseResponseDto.getData();
                if (arrayList != null) {
                    groupChatViewModel.U.postValue(arrayList);
                    return;
                }
                return;
            default:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto != null) {
                    String errorCode = baseResponseDto.getErrorCode();
                    if (errorCode != null && errorCode.length() != 0 && Intrinsics.a(baseResponseDto.getErrorCode(), "111")) {
                        groupChatViewModel.J0.postValue(new kj.j(baseResponseDto.getMessage()));
                        return;
                    }
                    Group group = (Group) baseResponseDto.getData();
                    if (group != null) {
                        groupChatViewModel.D.postValue(group);
                        Boolean isSocialAuthRequired = group.getIsSocialAuthRequired();
                        groupChatViewModel.f9182q0 = isSocialAuthRequired != null ? isSocialAuthRequired.booleanValue() : false;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f33643a;
        GroupChatViewModel groupChatViewModel = this.f33644b;
        switch (i10) {
            case 0:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 15:
            case 17:
            default:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 4:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 6:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 8:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 10:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 12:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 14:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 16:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 18:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 19:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 20:
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UserAuth auth;
        Integer timerSeconds;
        int i10 = this.f33643a;
        GroupChatViewModel groupChatViewModel = this.f33644b;
        switch (i10) {
            case 0:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 1:
                Group group = (Group) obj;
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                if (group != null) {
                    groupChatViewModel.E.postValue(group);
                }
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                d((MessageListDto) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 5:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 6:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 7:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 8:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 9:
                a((GroupMembersDto) obj);
                return Unit.f23355a;
            case 10:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 11:
                d((MessageListDto) obj);
                return Unit.f23355a;
            case 12:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 13:
                MessageThreadInfoDto messageThreadInfoDto = (MessageThreadInfoDto) obj;
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                ChatMessage parentMessage = messageThreadInfoDto.getParentMessage();
                if (parentMessage != null) {
                    groupChatViewModel.D0.postValue(parentMessage);
                }
                List<ChatMessage> replies = messageThreadInfoDto.getReplies();
                if (replies != null) {
                    ArrayList arrayList = groupChatViewModel.A;
                    arrayList.addAll(g0.L(replies));
                    groupChatViewModel.E0.postValue(arrayList);
                    groupChatViewModel.F0.postValue(Integer.valueOf(replies.size()));
                }
                return Unit.f23355a;
            case 14:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 15:
                UserConfig userConfig = (UserConfig) obj;
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                if (userConfig != null && (auth = userConfig.getAuth()) != null && (timerSeconds = auth.getTimerSeconds()) != null) {
                    timerSeconds.intValue();
                }
                return Unit.f23355a;
            case 16:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 17:
                d((MessageListDto) obj);
                return Unit.f23355a;
            case 18:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 19:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 20:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 21:
                a((GroupMembersDto) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
