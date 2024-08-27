package mc;

import au.i;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.arena.asset.host.ArenaAssetHostViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ArenaAssetHostViewModel f27706a;

    /* renamed from: b, reason: collision with root package name */
    public int f27707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArenaAssetHostViewModel f27709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, ArenaAssetHostViewModel arenaAssetHostViewModel, yt.a aVar) {
        super(2, aVar);
        this.f27708c = str;
        this.f27709d = arenaAssetHostViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f27708c, this.f27709d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ArenaAssetHostViewModel arenaAssetHostViewModel;
        String str;
        ArenaGame arenaGame;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f27707b;
        if (i10 != 0) {
            if (i10 == 1) {
                arenaAssetHostViewModel = this.f27706a;
                try {
                    n.b(obj);
                } catch (Exception e10) {
                    e = e10;
                    arenaAssetHostViewModel.f9084g.postValue(Boolean.FALSE);
                    e.printStackTrace();
                    arenaAssetHostViewModel.f8948t.postValue("Technical Error Occurred");
                    return Unit.f23355a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            String str2 = this.f27708c;
            if (str2 != null) {
                ArenaAssetHostViewModel arenaAssetHostViewModel2 = this.f27709d;
                arenaAssetHostViewModel2.f9084g.postValue(Boolean.TRUE);
                try {
                    ArenaRepository arenaRepository = arenaAssetHostViewModel2.f8942n;
                    this.f27706a = arenaAssetHostViewModel2;
                    this.f27707b = 1;
                    obj = arenaRepository.getLeagueInfo(str2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    arenaAssetHostViewModel = arenaAssetHostViewModel2;
                } catch (Exception e11) {
                    e = e11;
                    arenaAssetHostViewModel = arenaAssetHostViewModel2;
                    arenaAssetHostViewModel.f9084g.postValue(Boolean.FALSE);
                    e.printStackTrace();
                    arenaAssetHostViewModel.f8948t.postValue("Technical Error Occurred");
                    return Unit.f23355a;
                }
            }
            return Unit.f23355a;
        }
        v0 v0Var = (v0) obj;
        boolean isSuccessful = v0Var.f29302a.isSuccessful();
        if (isSuccessful) {
            arenaAssetHostViewModel.f9084g.postValue(Boolean.FALSE);
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (arenaGame = (ArenaGame) baseResponseDto.getData()) != null) {
                if (Intrinsics.a(arenaGame.getUserAlreadyJoined(), Boolean.TRUE)) {
                    arenaAssetHostViewModel.f8946r.postValue(arenaGame);
                } else {
                    arenaAssetHostViewModel.f8945q.postValue(arenaGame);
                }
            }
        } else if (!isSuccessful) {
            arenaAssetHostViewModel.f9084g.postValue(Boolean.FALSE);
            Gson gson = new Gson();
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                str = responseBody.string();
            } else {
                str = null;
            }
            arenaAssetHostViewModel.f8948t.postValue(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage());
        }
        return Unit.f23355a;
    }
}
