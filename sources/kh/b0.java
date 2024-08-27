package kh;

import com.assetgro.stockgro.data.model.ProfileStatsDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class b0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserStatisticsViewModel f23113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(UserStatisticsViewModel userStatisticsViewModel, String str, yt.a aVar, boolean z10) {
        super(2, aVar);
        this.f23112b = str;
        this.f23113c = userStatisticsViewModel;
        this.f23114d = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b0(this.f23113c, this.f23112b, aVar, this.f23114d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        v0 v0Var;
        BaseResponseDto baseResponseDto;
        ProfileStatsDto profileStatsDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23111a;
        Boolean bool = null;
        UserStatisticsViewModel userStatisticsViewModel = this.f23113c;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            String str = this.f23112b;
            if (str != null) {
                UserRepository userRepository = userStatisticsViewModel.f9081d;
                this.f23111a = 1;
                obj = userRepository.getProfileStatsV2(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                v0Var = null;
                if (v0Var != null && v0Var.f29302a.isSuccessful()) {
                    androidx.lifecycle.e0 e0Var = userStatisticsViewModel.f10063z;
                    baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                    if (baseResponseDto != null && (profileStatsDto = (ProfileStatsDto) baseResponseDto.getData()) != null) {
                        bool = Boolean.valueOf(profileStatsDto.isFriend());
                    }
                    e0Var.postValue(bool);
                    userStatisticsViewModel.f10062y.postValue(Boolean.valueOf(this.f23114d));
                }
                return Unit.f23355a;
            }
        }
        v0Var = (v0) obj;
        if (v0Var != null) {
            androidx.lifecycle.e0 e0Var2 = userStatisticsViewModel.f10063z;
            baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null) {
                bool = Boolean.valueOf(profileStatsDto.isFriend());
            }
            e0Var2.postValue(bool);
            userStatisticsViewModel.f10062y.postValue(Boolean.valueOf(this.f23114d));
        }
        return Unit.f23355a;
    }
}
