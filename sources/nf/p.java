package nf;

import androidx.lifecycle.u0;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import qu.r0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainSharedViewModel f28663a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MainSharedViewModel mainSharedViewModel, yt.a aVar) {
        super(1, aVar);
        this.f28663a = mainSharedViewModel;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new p(this.f28663a, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((p) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        MainSharedViewModel mainSharedViewModel = this.f28663a;
        mainSharedViewModel.getClass();
        yk.g.H(u0.f(mainSharedViewModel), r0.f32256b, null, new o(mainSharedViewModel, null), 2);
        return Unit.f23355a;
    }
}
