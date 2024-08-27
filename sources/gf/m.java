package gf;

import com.assetgro.stockgro.ui.home.HomeViewModel;
import e1.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class m extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f17383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(HomeViewModel homeViewModel, int i10, yt.a aVar) {
        super(2, aVar);
        this.f17383b = homeViewModel;
        this.f17384c = i10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new m(this.f17383b, this.f17384c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17382a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.f17382a = 1;
            if (kp.j.K(5000L, this) == aVar) {
                return aVar;
            }
        }
        HomeViewModel homeViewModel = this.f17383b;
        s sVar = homeViewModel.f9556y;
        int i11 = this.f17384c;
        if (i11 >= 0 && i11 < sVar.size()) {
            sVar.remove(i11);
        }
        if (sVar.isEmpty()) {
            homeViewModel.k(new uh.g(false));
        }
        return Unit.f23355a;
    }
}
