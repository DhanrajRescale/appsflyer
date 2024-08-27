package fc;

import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionTaskDetailViewModel f16014b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MissionTaskDetailViewModel missionTaskDetailViewModel, yt.a aVar) {
        super(2, aVar);
        this.f16014b = missionTaskDetailViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        h hVar = new h(this.f16014b, aVar);
        hVar.f16013a = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [au.i, kotlin.jvm.functions.Function1] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        this.f16014b.f8872w = new fd.c("mission-detail-refresh-task", new Long(5000L), (f0) this.f16013a, new au.i(1, null));
        return Unit.f23355a;
    }
}
