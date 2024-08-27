package hc;

import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionsHomeViewModel f18288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MissionsHomeViewModel missionsHomeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f18288b = missionsHomeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        p pVar = new p(this.f18288b, aVar);
        pVar.f18287a = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        f0 f0Var = (f0) this.f18287a;
        Long l10 = new Long(5000L);
        MissionsHomeViewModel missionsHomeViewModel = this.f18288b;
        fd.c c10 = sb.b.c("mission-home-refresh-task", l10, f0Var, new o(missionsHomeViewModel, null));
        missionsHomeViewModel.getClass();
        Intrinsics.checkNotNullParameter(c10, "<set-?>");
        missionsHomeViewModel.f8923u = c10;
        return Unit.f23355a;
    }
}
