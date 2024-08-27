package gf;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f17369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HomeViewModel homeViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f17369b = homeViewModel;
        this.f17370c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f17369b, this.f17370c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        sh.a aVar;
        zt.a aVar2 = zt.a.f42823a;
        int i10 = this.f17368a;
        HomeViewModel homeViewModel = this.f17369b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                UserRepository userRepository = homeViewModel.f9081d;
                String str2 = this.f17370c;
                this.f17368a = 1;
                obj = userRepository.claimScratchCardReward(str2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (aVar = (sh.a) baseResponseDto.getData()) != null) {
                    HomeViewModel.h(homeViewModel, aVar.a());
                }
            } else {
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str = responseBody.string();
                } else {
                    str = null;
                }
                homeViewModel.f9553v.postValue(new z9.g(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage()));
            }
        } catch (Exception e10) {
            homeViewModel.f9553v.postValue(new z9.g("Technical Error Occurred"));
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
