package td;

import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv.v0 f35944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35945b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(nv.v0 v0Var, GroupInfoViewModel groupInfoViewModel, yt.a aVar) {
        super(2, aVar);
        this.f35944a = v0Var;
        this.f35945b = groupInfoViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r0(this.f35944a, this.f35945b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ArenaGame arenaGame;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        BaseResponseDto baseResponseDto = (BaseResponseDto) this.f35944a.f29303b;
        if (baseResponseDto != null && (arenaGame = (ArenaGame) baseResponseDto.getData()) != null) {
            this.f35945b.f9256v.postValue(arenaGame);
            return Unit.f23355a;
        }
        return null;
    }
}
