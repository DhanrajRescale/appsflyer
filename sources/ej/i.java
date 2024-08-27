package ej;

import ba.nl;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OtherSubscriptionPlansFragment f15484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(OtherSubscriptionPlansFragment otherSubscriptionPlansFragment, yt.a aVar) {
        super(2, aVar);
        this.f15484b = otherSubscriptionPlansFragment;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f15484b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15483a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f15483a = 1;
            if (kp.j.K(100L, this) == aVar) {
                return aVar;
            }
        }
        OtherSubscriptionPlansFragment otherSubscriptionPlansFragment = this.f15484b;
        nl nlVar = (nl) otherSubscriptionPlansFragment.q();
        nlVar.f5583s.c(otherSubscriptionPlansFragment.I().f15491b, false);
        return Unit.f23355a;
    }
}
