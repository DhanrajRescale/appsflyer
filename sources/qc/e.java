package qc;

import au.i;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ut.n;

/* loaded from: classes.dex */
public final class e extends i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArenaMyLeaguesViewModel f31895a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArenaMyLeaguesViewModel arenaMyLeaguesViewModel, yt.a aVar) {
        super(1, aVar);
        this.f31895a = arenaMyLeaguesViewModel;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new e(this.f31895a, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        this.f31895a.h();
        return Unit.f23355a;
    }
}
