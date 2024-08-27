package tc;

import au.i;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArenaUpcomingViewModel f35813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArenaUpcomingViewModel arenaUpcomingViewModel, yt.a aVar) {
        super(2, aVar);
        this.f35813b = arenaUpcomingViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f35813b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ArenaSortOptions arenaSortOptions;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35812a;
        ArenaUpcomingViewModel arenaUpcomingViewModel = this.f35813b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ArenaRepository arenaRepository = arenaUpcomingViewModel.f8957n;
                this.f35812a = 1;
                obj = arenaRepository.getAllSortOptions(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b;
                if (baseResponseV2Dto != null && (arenaSortOptions = (ArenaSortOptions) baseResponseV2Dto.getData()) != null) {
                    arenaUpcomingViewModel.f8958o = arenaSortOptions;
                }
                arenaUpcomingViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.fui_no_internet, arenaUpcomingViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
