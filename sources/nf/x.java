package nf;

import com.assetgro.stockgro.data.remote.request.AppCloneDataRequest;
import com.assetgro.stockgro.ui.main.MainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class x extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f28678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCloneDataRequest f28679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(MainViewModel mainViewModel, AppCloneDataRequest appCloneDataRequest, yt.a aVar) {
        super(2, aVar);
        this.f28678a = mainViewModel;
        this.f28679b = appCloneDataRequest;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new x(this.f28678a, this.f28679b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        MainViewModel mainViewModel = this.f28678a;
        String a10 = mainViewModel.f9597n.a("lvl_library_forced_logout", "license_block", "false");
        int length = a10.length();
        AppCloneDataRequest appCloneDataRequest = this.f28679b;
        if (length > 0) {
            int i10 = kj.f.f23221a;
            Intrinsics.checkNotNullParameter(a10, "<this>");
            if (Intrinsics.a(a10, "true")) {
                mainViewModel.j(appCloneDataRequest);
                mainViewModel.W.postValue(new kj.j(Unit.f23355a));
                mainViewModel.Y.postValue(Boolean.TRUE);
                return Unit.f23355a;
            }
        }
        mainViewModel.j(appCloneDataRequest);
        return Unit.f23355a;
    }
}
