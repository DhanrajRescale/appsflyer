package fc;

import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionTaskDetailViewModel f16025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MissionTaskDetailViewModel missionTaskDetailViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f16025b = missionTaskDetailViewModel;
        this.f16026c = str;
        this.f16027d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f16025b, this.f16026c, this.f16027d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16024a;
        String str = this.f16026c;
        MissionTaskDetailViewModel missionTaskDetailViewModel = this.f16025b;
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
                this.f16024a = 1;
                obj = missionsRepository.retryMission(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            missionTaskDetailViewModel.f9084g.postValue(Boolean.FALSE);
            if (((v0) obj).f29302a.isSuccessful()) {
                if (missionTaskDetailViewModel.l()) {
                    missionTaskDetailViewModel.i(str);
                } else {
                    String str2 = this.f16027d;
                    if (str2 != null && str2.length() > 0) {
                        missionTaskDetailViewModel.f8865p.postValue(str2);
                    }
                }
            }
        } catch (Exception unused) {
            missionTaskDetailViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
