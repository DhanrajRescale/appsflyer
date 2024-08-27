package td;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupUIConfig;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35939b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(GroupInfoViewModel groupInfoViewModel, yt.a aVar) {
        super(2, aVar);
        this.f35939b = groupInfoViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new q0(this.f35939b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Group group;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35938a;
        GroupInfoViewModel groupInfoViewModel = this.f35939b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupInfoViewModel.f9241n;
                String str = groupInfoViewModel.F;
                this.f35938a = 1;
                obj = chatRepository.getChatGroupByIdV2(str, true, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            nv.v0 v0Var = (nv.v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (group = (Group) baseResponseDto.getData()) != null) {
                    groupInfoViewModel.f9246q.postValue(group);
                    GroupUIConfig groupUIConfig = group.getGroupUIConfig();
                    if (groupUIConfig != null) {
                        groupInfoViewModel.f9248r.postValue(groupUIConfig);
                    }
                }
            } else {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupInfoViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
