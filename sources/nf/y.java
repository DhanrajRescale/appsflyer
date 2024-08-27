package nf;

import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.main.MainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class y extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f28681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(MainViewModel mainViewModel, yt.a aVar) {
        super(2, aVar);
        this.f28681b = mainViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new y(this.f28681b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28680a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = this.f28681b.f9081d;
                this.f28680a = 1;
                if (userRepository.ping(this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
            Object[] objArr = new Object[0];
            Intrinsics.checkNotNullParameter("MainViewModel", "tag");
            com.google.android.gms.internal.p002firebaseauthapi.a.g("No internet connection, unable to call ping API", "s", objArr, "params", "MainViewModel").getClass();
            ek.u.l(objArr);
        }
        return Unit.f23355a;
    }
}
