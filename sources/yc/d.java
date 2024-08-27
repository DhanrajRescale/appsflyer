package yc;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningViewModel;
import com.assetgro.stockgro.ui.social.data.remote.UserGroupLevelPermissionsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f41479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueDetailPostJoiningViewModel f41480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f41480b = leagueDetailPostJoiningViewModel;
        this.f41481c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f41480b, this.f41481c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        UserGroupLevelPermissionsDto userGroupLevelPermissionsDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f41479a;
        LeagueDetailPostJoiningViewModel leagueDetailPostJoiningViewModel = this.f41480b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ChatRepository chatRepository = leagueDetailPostJoiningViewModel.f8987o;
                String str = this.f41481c;
                this.f41479a = 1;
                obj = chatRepository.getGroupMessageLevelPermissions(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                leagueDetailPostJoiningViewModel.f9084g.postValue(Boolean.FALSE);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (userGroupLevelPermissionsDto = (UserGroupLevelPermissionsDto) baseResponseDto.getData()) != null) {
                    leagueDetailPostJoiningViewModel.G.postValue(userGroupLevelPermissionsDto.toUserGroupLevelPermissions());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
