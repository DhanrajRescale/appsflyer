package hc;

import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class l extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionsHomeViewModel f18280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MissionsHomeViewModel missionsHomeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f18280b = missionsHomeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        l lVar = new l(this.f18280b, aVar);
        lVar.f18279a = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [au.i, kotlin.jvm.functions.Function1] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        fd.c cVar = new fd.c("mission-home-refresh-task", new Long(5000L), (f0) this.f18279a, new au.i(1, null));
        MissionsHomeViewModel missionsHomeViewModel = this.f18280b;
        missionsHomeViewModel.getClass();
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        missionsHomeViewModel.f8923u = cVar;
        return Unit.f23355a;
    }
}
