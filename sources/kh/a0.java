package kh;

import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class a0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserStatisticsViewModel f23108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(UserStatisticsViewModel userStatisticsViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f23108b = userStatisticsViewModel;
        this.f23109c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a0(this.f23108b, this.f23109c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23107a;
        UserStatisticsViewModel userStatisticsViewModel = this.f23108b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                FollowerRepository followerRepository = userStatisticsViewModel.f10051n;
                String str = this.f23109c;
                this.f23107a = 1;
                obj = followerRepository.addFriend(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                userStatisticsViewModel.f10057t.postValue(Boolean.FALSE);
                userStatisticsViewModel.f10058u.postValue(Boolean.TRUE);
                userStatisticsViewModel.k();
            } else {
                androidx.lifecycle.e0 e0Var = userStatisticsViewModel.f10057t;
                Boolean bool = Boolean.FALSE;
                e0Var.postValue(bool);
                userStatisticsViewModel.f10058u.postValue(bool);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, userStatisticsViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
