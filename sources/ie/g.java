package ie;

import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GroupChatHostViewModel groupChatHostViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f19916b = groupChatHostViewModel;
        this.f19917c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f19916b, this.f19917c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ArenaGame arenaGame;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19915a;
        GroupChatHostViewModel groupChatHostViewModel = this.f19916b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                groupChatHostViewModel.f9084g.postValue(Boolean.TRUE);
                ArenaRepository arenaRepository = groupChatHostViewModel.f9370o;
                String str2 = this.f19917c;
                this.f19915a = 1;
                obj = arenaRepository.getLeagueInfo(str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            boolean isSuccessful = v0Var.f29302a.isSuccessful();
            if (isSuccessful) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (arenaGame = (ArenaGame) baseResponseDto.getData()) != null) {
                    groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
                    groupChatHostViewModel.l(arenaGame);
                }
            } else if (!isSuccessful) {
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str = responseBody.string();
                } else {
                    str = null;
                }
                groupChatHostViewModel.D.postValue(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage());
            }
        } catch (Exception unused) {
            groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
            groupChatHostViewModel.D.postValue("Technical Error Occurred");
        }
        return Unit.f23355a;
    }
}
