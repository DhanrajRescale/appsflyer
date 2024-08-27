package fc;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.missions.data.remote.MissionDetailDto;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionTaskDetailViewModel f16016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MissionTaskDetailViewModel missionTaskDetailViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f16016b = missionTaskDetailViewModel;
        this.f16017c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f16016b, this.f16017c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        MissionDetailDto missionDetailDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16015a;
        MissionTaskDetailViewModel missionTaskDetailViewModel = this.f16016b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                MissionsRepository missionsRepository = missionTaskDetailViewModel.f8863n;
                String str = this.f16017c;
                this.f16015a = 1;
                obj = missionsRepository.getUserMissionDetails(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            missionTaskDetailViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (missionDetailDto = (MissionDetailDto) baseResponseDto.getData()) != null) {
                missionTaskDetailViewModel.f8864o.postValue(missionDetailDto.toMissionDetail());
            }
        } catch (Exception unused) {
            missionTaskDetailViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
