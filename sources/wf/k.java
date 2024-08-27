package wf;

import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletHomeViewModel f39062b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WalletHomeViewModel walletHomeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f39062b = walletHomeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f39062b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39061a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                UserRepository userRepository = this.f39062b.f9081d;
                this.f39061a = 1;
                if (userRepository.ping(this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
