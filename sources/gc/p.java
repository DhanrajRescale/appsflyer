package gc;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.missions.data.remote.MissionsHistoryByStatusDto;
import com.assetgro.stockgro.missions.domain.model.MissionsHistoryByStatus;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import com.assetgro.stockgro.missions.presentation.history.MissionStatusDetailViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import vt.g0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionStatusDetailViewModel f17249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MissionStatusDetailViewModel missionStatusDetailViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f17249b = missionStatusDetailViewModel;
        this.f17250c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f17249b, this.f17250c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        MissionsHistoryByStatusDto missionsHistoryByStatusDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17248a;
        MissionStatusDetailViewModel missionStatusDetailViewModel = this.f17249b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                MissionsRepository missionsRepository = missionStatusDetailViewModel.f8891n;
                String str = this.f17250c;
                this.f17248a = 1;
                obj = missionsRepository.getUserMissionsHistoryByStatus(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            missionStatusDetailViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (missionsHistoryByStatusDto = (MissionsHistoryByStatusDto) baseResponseDto.getData()) != null) {
                MissionsHistoryByStatus missionsHistoryByStatus = missionsHistoryByStatusDto.toMissionsHistoryByStatus();
                List<UserTask> userTasks = missionsHistoryByStatus.getUserTasks();
                if (userTasks != null) {
                    missionStatusDetailViewModel.f8895r.postValue(new Integer(userTasks.size()));
                    missionStatusDetailViewModel.f8892o.postValue(MissionStatusDetailViewModel.h(missionStatusDetailViewModel, g0.L(userTasks)));
                }
                String disclaimer = missionsHistoryByStatus.getDisclaimer();
                if (disclaimer != null) {
                    missionStatusDetailViewModel.f8896s.postValue(disclaimer);
                }
            }
        } catch (Exception unused) {
            missionStatusDetailViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
