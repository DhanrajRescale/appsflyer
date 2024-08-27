package nf;

import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainSharedViewModel f28647b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MainSharedViewModel mainSharedViewModel, yt.a aVar) {
        super(2, aVar);
        this.f28647b = mainSharedViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        j jVar = new j(this.f28647b, aVar);
        jVar.f28646a = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [au.i, kotlin.jvm.functions.Function1] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        fd.c cVar = new fd.c("maintenance-config-task", new Long(120000L), (f0) this.f28646a, new au.i(1, null));
        MainSharedViewModel mainSharedViewModel = this.f28647b;
        mainSharedViewModel.getClass();
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        mainSharedViewModel.Q = cVar;
        return Unit.f23355a;
    }
}
