package dg;

import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu.f f14358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WalletTransactionListFragment f14359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(tu.f fVar, WalletTransactionListFragment walletTransactionListFragment, yt.a aVar) {
        super(2, aVar);
        this.f14358b = fVar;
        this.f14359c = walletTransactionListFragment;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f14358b, this.f14359c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f14357a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            g gVar = new g(this.f14359c);
            this.f14357a = 1;
            if (this.f14358b.c(gVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
