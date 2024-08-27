package hc;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.missions.data.remote.MissionsHomeDto;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionsHomeViewModel f18285b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MissionsHomeViewModel missionsHomeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f18285b = missionsHomeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n(this.f18285b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        MissionsHomeDto missionsHomeDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18284a;
        MissionsHomeViewModel missionsHomeViewModel = this.f18285b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                MissionsRepository missionsRepository = missionsHomeViewModel.f8916n;
                this.f18284a = 1;
                obj = missionsRepository.getUserMissions(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            missionsHomeViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (missionsHomeDto = (MissionsHomeDto) baseResponseDto.getData()) != null) {
                    missionsHomeViewModel.f8918p.postValue(missionsHomeDto.toMissionsHomeData());
                    if (missionsHomeViewModel.f8922t) {
                        missionsHomeViewModel.f8922t = false;
                        sh.c scratchCards = missionsHomeDto.getScratchCards();
                        if (scratchCards != null) {
                            th.c a10 = scratchCards.a();
                            missionsHomeViewModel.j(new uh.f(a10));
                            if (a10.f36086c.isEmpty()) {
                                missionsHomeViewModel.f8920r.postValue(Boolean.TRUE);
                            }
                        }
                    }
                    unit = Unit.f23355a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    missionsHomeViewModel.f8920r.postValue(Boolean.TRUE);
                }
            }
        } catch (Exception unused) {
            missionsHomeViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
