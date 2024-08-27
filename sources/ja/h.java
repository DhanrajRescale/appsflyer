package ja;

import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import d2.y3;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f21267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f21268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, yt.a aVar) {
        super(2, aVar);
        this.f21268b = iVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f21268b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f21267a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            i iVar = this.f21268b;
            MarketOptionsListViewModel marketOptionsListViewModel = (MarketOptionsListViewModel) iVar.r();
            y3 y3Var = new y3(iVar, 4);
            this.f21267a = 1;
            if (marketOptionsListViewModel.f8629p.f36547a.c(y3Var, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
