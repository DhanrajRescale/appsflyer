package qc;

import au.i;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArenaMyLeaguesViewModel f31897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArenaMyLeaguesViewModel arenaMyLeaguesViewModel, yt.a aVar) {
        super(2, aVar);
        this.f31897b = arenaMyLeaguesViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        f fVar = new f(this.f31897b, aVar);
        fVar.f31896a = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        f0 f0Var = (f0) this.f31896a;
        Long l10 = new Long(30000L);
        ArenaMyLeaguesViewModel arenaMyLeaguesViewModel = this.f31897b;
        fd.c c10 = sb.b.c("repeatUpcomingTask", l10, f0Var, new e(arenaMyLeaguesViewModel, null));
        arenaMyLeaguesViewModel.getClass();
        Intrinsics.checkNotNullParameter(c10, "<set-?>");
        arenaMyLeaguesViewModel.f8953r = c10;
        return Unit.f23355a;
    }
}
