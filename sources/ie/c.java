package ie;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.MembershipStatus;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GroupChatHostViewModel groupChatHostViewModel, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f19903b = groupChatHostViewModel;
        this.f19904c = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f19903b, this.f19904c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        MembershipStatus membershipStatus;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19902a;
        boolean z10 = this.f19904c;
        GroupChatHostViewModel groupChatHostViewModel = this.f19903b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupChatHostViewModel.f9369n;
                String userId = chatRepository.getUserId();
                String str = groupChatHostViewModel.A;
                this.f19902a = 1;
                obj = chatRepository.changeChatMuteStatus(userId, str, z10, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                Group group = (Group) groupChatHostViewModel.f9372q.getValue();
                if (group != null) {
                    membershipStatus = group.getMembershipStatus();
                } else {
                    membershipStatus = null;
                }
                if (membershipStatus != null) {
                    membershipStatus.setMuted(z10);
                }
            }
            groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception unused) {
            groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
