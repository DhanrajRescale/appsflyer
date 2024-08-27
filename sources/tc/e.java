package tc;

import au.i;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class e extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArenaUpcomingViewModel f35816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArenaUpcomingViewModel arenaUpcomingViewModel, yt.a aVar) {
        super(2, aVar);
        this.f35816b = arenaUpcomingViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        e eVar = new e(this.f35816b, aVar);
        eVar.f35815a = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        f0 f0Var = (f0) this.f35815a;
        Long l10 = new Long(30000L);
        ArenaUpcomingViewModel arenaUpcomingViewModel = this.f35816b;
        fd.c c10 = sb.b.c("repeatUpcomingTask", l10, f0Var, new d(arenaUpcomingViewModel, null));
        arenaUpcomingViewModel.getClass();
        Intrinsics.checkNotNullParameter(c10, "<set-?>");
        arenaUpcomingViewModel.f8960q = c10;
        return Unit.f23355a;
    }
}
