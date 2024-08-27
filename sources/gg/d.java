package gg;

import com.assetgro.stockgro.ui.portfolio.PortfolioViewModel;
import d2.y3;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, yt.a aVar) {
        super(2, aVar);
        this.f17390b = eVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f17390b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17389a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            e eVar = this.f17390b;
            PortfolioViewModel portfolioViewModel = (PortfolioViewModel) eVar.r();
            y3 y3Var = new y3(eVar, 9);
            this.f17389a = 1;
            if (portfolioViewModel.f9773p.f36547a.c(y3Var, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
