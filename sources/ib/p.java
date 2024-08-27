package ib;

import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import d2.y3;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiaProfileActivity f19812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(RiaProfileActivity riaProfileActivity, yt.a aVar) {
        super(2, aVar);
        this.f19812b = riaProfileActivity;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f19812b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((p) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19811a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            RiaProfileActivity riaProfileActivity = this.f19812b;
            RiaProfileViewModel riaProfileViewModel = (RiaProfileViewModel) riaProfileActivity.x();
            y3 y3Var = new y3(riaProfileActivity, 7);
            this.f19811a = 1;
            if (riaProfileViewModel.f8797q.c(y3Var, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
