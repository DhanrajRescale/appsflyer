package id;

import com.assetgro.stockgro.data.model.UserChatGroupsResponse;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class w extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialChatListViewModel f19893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SocialChatListViewModel socialChatListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19893b = socialChatListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w(this.f19893b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        UserChatGroupsResponse userChatGroupsResponse;
        Integer totalInvite;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19892a;
        SocialChatListViewModel socialChatListViewModel = this.f19893b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = socialChatListViewModel.f9091n;
                this.f19892a = 1;
                obj = ChatRepository.getChatGroups$default(chatRepository, 10, 0, false, this, 4, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (userChatGroupsResponse = (UserChatGroupsResponse) v0Var.f29303b) != null && (totalInvite = userChatGroupsResponse.getTotalInvite()) != null) {
                socialChatListViewModel.E.postValue(new Integer(totalInvite.intValue()));
            }
            socialChatListViewModel.o(new n(false));
        } catch (Exception e10) {
            socialChatListViewModel.o(new n(false));
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
