package kh;

import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserStatisticsViewModel f23133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(UserStatisticsViewModel userStatisticsViewModel, yt.a aVar) {
        super(2, aVar);
        this.f23133b = userStatisticsViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f0(this.f23133b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23132a;
        UserStatisticsViewModel userStatisticsViewModel = this.f23133b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                userStatisticsViewModel.E.postValue(Boolean.TRUE);
                Integer num = (Integer) userStatisticsViewModel.J.getValue();
                if (num == null) {
                    num = new Integer(1);
                }
                int intValue = num.intValue();
                this.f23132a = 1;
                if (UserStatisticsViewModel.h(userStatisticsViewModel, intValue, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
            userStatisticsViewModel.E.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
