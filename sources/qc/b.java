package qc;

import au.i;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArenaMyLeaguesViewModel f31889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArenaMyLeaguesViewModel arenaMyLeaguesViewModel, yt.a aVar) {
        super(2, aVar);
        this.f31889b = arenaMyLeaguesViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b bVar = new b(this.f31889b, aVar);
        bVar.f31888a = obj;
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
        fd.c cVar = new fd.c("repeatUpcomingTask", new Long(30000L), (f0) this.f31888a, new i(1, null));
        ArenaMyLeaguesViewModel arenaMyLeaguesViewModel = this.f31889b;
        arenaMyLeaguesViewModel.getClass();
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        arenaMyLeaguesViewModel.f8953r = cVar;
        return Unit.f23355a;
    }
}
