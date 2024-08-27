package bi;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.social.domain.model.User;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BlockedUserListViewModel f6994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ User f6996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BlockedUserListViewModel blockedUserListViewModel, boolean z10, User user, yt.a aVar) {
        super(2, aVar);
        this.f6994b = blockedUserListViewModel;
        this.f6995c = z10;
        this.f6996d = user;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f6994b, this.f6995c, this.f6996d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f6993a;
        User user = this.f6996d;
        BlockedUserListViewModel blockedUserListViewModel = this.f6994b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            ChatRepository chatRepository = blockedUserListViewModel.f10122n;
            String userId = user.getUserId();
            this.f6993a = 1;
            obj = chatRepository.blockUserOnPrivateChatV2(this.f6995c, userId, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((v0) obj).f29302a.isSuccessful()) {
            blockedUserListViewModel.f9084g.postValue(Boolean.FALSE);
            blockedUserListViewModel.f10124p.postValue(user);
        }
        return Unit.f23355a;
    }
}
