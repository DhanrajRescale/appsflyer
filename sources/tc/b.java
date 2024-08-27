package tc;

import au.i;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArenaUpcomingViewModel f35811b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArenaUpcomingViewModel arenaUpcomingViewModel, yt.a aVar) {
        super(2, aVar);
        this.f35811b = arenaUpcomingViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b bVar = new b(this.f35811b, aVar);
        bVar.f35810a = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [au.i, kotlin.jvm.functions.Function1] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        fd.c cVar = new fd.c("repeatUpcomingTask", new Long(30000L), (f0) this.f35810a, new i(1, null));
        ArenaUpcomingViewModel arenaUpcomingViewModel = this.f35811b;
        arenaUpcomingViewModel.getClass();
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        arenaUpcomingViewModel.f8960q = cVar;
        return Unit.f23355a;
    }
}
