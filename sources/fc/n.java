package fc;

import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionTaskDetailViewModel f16035b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MissionTaskDetailViewModel missionTaskDetailViewModel, yt.a aVar) {
        super(2, aVar);
        this.f16035b = missionTaskDetailViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        n nVar = new n(this.f16035b, aVar);
        nVar.f16034a = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        f0 f0Var = (f0) this.f16034a;
        Long l10 = new Long(5000L);
        MissionTaskDetailViewModel missionTaskDetailViewModel = this.f16035b;
        missionTaskDetailViewModel.f8872w = sb.b.c("mission-detail-refresh-task", l10, f0Var, new m(missionTaskDetailViewModel, null));
        return Unit.f23355a;
    }
}
