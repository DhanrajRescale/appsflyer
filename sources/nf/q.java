package nf;

import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainSharedViewModel f28665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(MainSharedViewModel mainSharedViewModel, yt.a aVar) {
        super(2, aVar);
        this.f28665b = mainSharedViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        q qVar = new q(this.f28665b, aVar);
        qVar.f28664a = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        f0 f0Var = (f0) this.f28664a;
        Long l10 = new Long(120000L);
        MainSharedViewModel mainSharedViewModel = this.f28665b;
        fd.c c10 = sb.b.c("maintenance-config-task", l10, f0Var, new p(mainSharedViewModel, null));
        mainSharedViewModel.getClass();
        Intrinsics.checkNotNullParameter(c10, "<set-?>");
        mainSharedViewModel.Q = c10;
        return Unit.f23355a;
    }
}
