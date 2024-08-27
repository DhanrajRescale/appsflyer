package id;

import com.assetgro.stockgro.data.model.UserChatGroup;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class s extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialChatListViewModel f19884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserChatGroup f19885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SocialChatListViewModel socialChatListViewModel, UserChatGroup userChatGroup, yt.a aVar) {
        super(2, aVar);
        this.f19884b = socialChatListViewModel;
        this.f19885c = userChatGroup;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s(this.f19884b, this.f19885c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        UserChatGroup userChatGroup = this.f19885c;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19883a;
        SocialChatListViewModel socialChatListViewModel = this.f19884b;
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
                String userId = userChatGroup.getUserId();
                String groupId = userChatGroup.getGroupId();
                boolean z10 = !userChatGroup.getIsPinned();
                this.f19883a = 1;
                obj = chatRepository.changeChatPinnedStatus(userId, groupId, z10, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                socialChatListViewModel.o(new m(false));
            }
            socialChatListViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
