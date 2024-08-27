package kh;

import com.assetgro.stockgro.data.model.UserBlockStatusDao;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;

/* loaded from: classes.dex */
public final class e0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserStatisticsViewModel f23129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(UserStatisticsViewModel userStatisticsViewModel, yt.a aVar) {
        super(2, aVar);
        this.f23129b = userStatisticsViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e0(this.f23129b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseV2Dto baseResponseV2Dto;
        UserBlockStatusDao userBlockStatusDao;
        UserBlockStatusDao userBlockStatusDao2;
        UserBlockStatusDao userBlockStatusDao3;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23128a;
        UserStatisticsViewModel userStatisticsViewModel = this.f23129b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            UserRepository userRepository = userStatisticsViewModel.f9081d;
            String str = userStatisticsViewModel.f10054q;
            this.f23128a = 1;
            obj = userRepository.getUserBlockedStatus(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            Object obj2 = v0Var.f29303b;
            BaseResponseV2Dto baseResponseV2Dto2 = (BaseResponseV2Dto) obj2;
            if ((baseResponseV2Dto2 == null || (userBlockStatusDao3 = (UserBlockStatusDao) baseResponseV2Dto2.getData()) == null || !Intrinsics.a(userBlockStatusDao3.getIBlocked(), Boolean.TRUE)) && (baseResponseV2Dto = (BaseResponseV2Dto) obj2) != null && (userBlockStatusDao = (UserBlockStatusDao) baseResponseV2Dto.getData()) != null) {
                Intrinsics.a(userBlockStatusDao.getIAmBlocked(), Boolean.TRUE);
            }
            androidx.lifecycle.e0 e0Var = userStatisticsViewModel.f10061x;
            BaseResponseV2Dto baseResponseV2Dto3 = (BaseResponseV2Dto) obj2;
            if (baseResponseV2Dto3 != null) {
                userBlockStatusDao2 = (UserBlockStatusDao) baseResponseV2Dto3.getData();
            } else {
                userBlockStatusDao2 = null;
            }
            e0Var.postValue(userBlockStatusDao2);
        }
        return Unit.f23355a;
    }
}
