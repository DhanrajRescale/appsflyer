package pc;

import au.i;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f30834a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, yt.a aVar) {
        super(2, aVar);
        this.f30834a = fVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f30834a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        ((ArenaMyLeaguesViewModel) this.f30834a.r()).h();
        return Unit.f23355a;
    }
}
