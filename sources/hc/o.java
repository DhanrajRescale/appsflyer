package hc;

import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MissionsHomeViewModel f18286a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MissionsHomeViewModel missionsHomeViewModel, yt.a aVar) {
        super(1, aVar);
        this.f18286a = missionsHomeViewModel;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new o(this.f18286a, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        this.f18286a.i();
        return Unit.f23355a;
    }
}
