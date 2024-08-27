package kh;

import com.assetgro.stockgro.data.model.ProfileStatsDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserStatisticsViewModel f23196b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(UserStatisticsViewModel userStatisticsViewModel, int i10) {
        super(1);
        this.f23195a = i10;
        this.f23196b = userStatisticsViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f23195a;
        UserStatisticsViewModel userStatisticsViewModel = this.f23196b;
        switch (i10) {
            case 0:
                kj.j jVar = (kj.j) obj;
                if (jVar != null && ((Unit) jVar.a()) != null) {
                    userStatisticsViewModel.m();
                }
                return Unit.f23355a;
            case 1:
                Boolean isRiaRra = ((ProfileStatsDto) obj).isRiaRra();
                boolean z10 = false;
                if (isRiaRra != null && isRiaRra.booleanValue() && !userStatisticsViewModel.i(userStatisticsViewModel.f10054q)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                userStatisticsViewModel.f9084g.postValue(Boolean.FALSE);
                ProfileStatsDto profileStatsDto = (ProfileStatsDto) ((BaseResponseDto) obj).getData();
                if (profileStatsDto != null) {
                    userStatisticsViewModel.f10059v.postValue(profileStatsDto);
                }
                return Unit.f23355a;
            default:
                userStatisticsViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
