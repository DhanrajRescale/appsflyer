package bi;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.social.data.remote.BlockedUserListDto;
import com.assetgro.stockgro.ui.social.domain.model.User;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BlockedUserListViewModel f7000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BlockedUserListViewModel blockedUserListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f7000b = blockedUserListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f7000b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        BlockedUserListDto blockedUserListDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f6999a;
        BlockedUserListViewModel blockedUserListViewModel = this.f7000b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ChatRepository chatRepository = blockedUserListViewModel.f10122n;
                int i11 = blockedUserListViewModel.f10127s;
                int i12 = blockedUserListViewModel.f10128t;
                this.f6999a = 1;
                obj = chatRepository.getUsersBlockedList(i11, i12, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (blockedUserListDto = (BlockedUserListDto) baseResponseDto.getData()) != null) {
                ArrayList<User> users = blockedUserListDto.toBlockedUsers().getUsers();
                if (users != null) {
                    blockedUserListViewModel.f10123o.postValue(users);
                }
                blockedUserListViewModel.f10129u = blockedUserListDto.getIsEndOfResponse();
            }
            blockedUserListViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception unused) {
        }
        return Unit.f23355a;
    }
}
