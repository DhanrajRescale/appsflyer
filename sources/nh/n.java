package nh;

import com.assetgro.stockgro.data.model.UserBlockStatusDao;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserProfileViewModel f28722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(UserProfileViewModel userProfileViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f28722b = userProfileViewModel;
        this.f28723c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n(this.f28722b, this.f28723c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseV2Dto baseResponseV2Dto;
        Boolean bool;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28721a;
        UserProfileViewModel userProfileViewModel = this.f28722b;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            UserRepository userRepository = userProfileViewModel.f9081d;
            this.f28721a = 1;
            obj = userRepository.getUserBlockedStatus(this.f28723c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && (baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b) != null) {
            UserBlockStatusDao userBlockStatusDao = (UserBlockStatusDao) baseResponseV2Dto.getData();
            Boolean bool2 = null;
            if (userBlockStatusDao != null) {
                bool = userBlockStatusDao.getIBlocked();
            } else {
                bool = null;
            }
            if (bool == null) {
                UserBlockStatusDao userBlockStatusDao2 = (UserBlockStatusDao) baseResponseV2Dto.getData();
                if (userBlockStatusDao2 != null) {
                    bool2 = userBlockStatusDao2.getIAmBlocked();
                }
                if (bool2 == null) {
                    userProfileViewModel.f10076t.postValue(Boolean.FALSE);
                }
            }
            Boolean iBlocked = ((UserBlockStatusDao) baseResponseV2Dto.getData()).getIBlocked();
            Boolean bool3 = Boolean.TRUE;
            if (!Intrinsics.a(iBlocked, bool3) && !Intrinsics.a(((UserBlockStatusDao) baseResponseV2Dto.getData()).getIAmBlocked(), bool3)) {
                z10 = false;
            }
            userProfileViewModel.f10076t.postValue(Boolean.valueOf(z10));
        }
        return Unit.f23355a;
    }
}
