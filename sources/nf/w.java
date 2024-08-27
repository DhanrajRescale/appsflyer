package nf;

import com.assetgro.stockgro.ui.main.MainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class w extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f28677a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(MainViewModel mainViewModel, yt.a aVar) {
        super(2, aVar);
        this.f28677a = mainViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w(this.f28677a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        MainViewModel mainViewModel = this.f28677a;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        try {
            mainViewModel.T.postValue(mainViewModel.f9081d.getUserDrawerInfo());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
