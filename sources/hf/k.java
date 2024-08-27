package hf;

import com.assetgro.stockgro.ui.home.HomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f18380a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(HomeViewModel homeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f18380a = homeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f18380a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        this.f18380a.j(h.f18373c);
        return Unit.f23355a;
    }
}
