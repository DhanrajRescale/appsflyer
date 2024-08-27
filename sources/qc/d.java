package qc;

import androidx.lifecycle.e0;
import au.i;
import com.assetgro.stockgro.data.ArenaAchievementShareDto;
import com.assetgro.stockgro.data.remote.NetworkResult;
import com.assetgro.stockgro.data.remote.SGError;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArenaMyLeaguesViewModel f31893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArenaMyLeaguesViewModel arenaMyLeaguesViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f31893b = arenaMyLeaguesViewModel;
        this.f31894c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f31893b, this.f31894c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31892a;
        ArenaMyLeaguesViewModel arenaMyLeaguesViewModel = this.f31893b;
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
                String str = this.f31894c;
                this.f31892a = 1;
                obj = arenaRepository.shareYourAchievementCta(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            NetworkResult networkResult = (NetworkResult) obj;
            String str2 = null;
            ArenaAchievementShareDto arenaAchievementShareDto = null;
            String str3 = null;
            if (networkResult instanceof NetworkResult.Success) {
                arenaMyLeaguesViewModel.f9084g.postValue(Boolean.FALSE);
                e0 e0Var = arenaMyLeaguesViewModel.f8955t;
                BaseResponseDto baseResponseDto = (BaseResponseDto) networkResult.getData();
                if (baseResponseDto != null) {
                    arenaAchievementShareDto = (ArenaAchievementShareDto) baseResponseDto.getData();
                }
                e0Var.setValue(arenaAchievementShareDto);
            } else if (networkResult instanceof NetworkResult.Error) {
                arenaMyLeaguesViewModel.f9084g.postValue(Boolean.FALSE);
                SGError error = networkResult.getError();
                if (error != null) {
                    str3 = error.getErrorText();
                }
                arenaMyLeaguesViewModel.f(str3);
            } else {
                arenaMyLeaguesViewModel.f9084g.postValue(Boolean.FALSE);
                SGError error2 = networkResult.getError();
                if (error2 != null) {
                    str2 = error2.getErrorText();
                }
                arenaMyLeaguesViewModel.f(str2);
            }
        } catch (Exception unused) {
        }
        return Unit.f23355a;
    }
}
