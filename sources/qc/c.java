package qc;

import au.i;
import com.assetgro.stockgro.data.model.arenaV2.ArenaAllData;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArenaMyLeaguesViewModel f31891b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArenaMyLeaguesViewModel arenaMyLeaguesViewModel, yt.a aVar) {
        super(2, aVar);
        this.f31891b = arenaMyLeaguesViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f31891b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ArenaAllData arenaAllData;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31890a;
        ArenaMyLeaguesViewModel arenaMyLeaguesViewModel = this.f31891b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ArenaRepository arenaRepository = arenaMyLeaguesViewModel.f8949n;
                String str = arenaMyLeaguesViewModel.f8954s;
                this.f31890a = 1;
                obj = arenaRepository.getAllMyLeaguesLokiWithAssetClass(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b;
                if (baseResponseV2Dto != null && (arenaAllData = (ArenaAllData) baseResponseV2Dto.getData()) != null) {
                    arenaMyLeaguesViewModel.f8951p.postValue(arenaAllData);
                }
            } else {
                arenaMyLeaguesViewModel.f8952q.postValue(Boolean.TRUE);
            }
            arenaMyLeaguesViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception unused) {
            arenaMyLeaguesViewModel.f9084g.postValue(Boolean.FALSE);
            v.e.r(R.string.fui_no_internet, arenaMyLeaguesViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
