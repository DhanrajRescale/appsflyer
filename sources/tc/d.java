package tc;

import au.i;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ut.n;

/* loaded from: classes.dex */
public final class d extends i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArenaUpcomingViewModel f35814a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArenaUpcomingViewModel arenaUpcomingViewModel, yt.a aVar) {
        super(1, aVar);
        this.f35814a = arenaUpcomingViewModel;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new d(this.f35814a, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((d) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        this.f35814a.h();
        return Unit.f23355a;
    }
}
