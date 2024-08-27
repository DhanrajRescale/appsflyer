package fc;

import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MissionTaskDetailViewModel f16033a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(MissionTaskDetailViewModel missionTaskDetailViewModel, yt.a aVar) {
        super(1, aVar);
        this.f16033a = missionTaskDetailViewModel;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new m(this.f16033a, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        MissionTaskDetailViewModel missionTaskDetailViewModel = this.f16033a;
        String str = missionTaskDetailViewModel.f8869t;
        if (str != null) {
            missionTaskDetailViewModel.i(str);
        }
        return Unit.f23355a;
    }
}
