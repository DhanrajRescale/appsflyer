package db;

import androidx.lifecycle.e0;
import au.i;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.reset.ReSetPinViewModel;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ni.j;
import nv.v0;
import okhttp3.Response;
import qu.f0;
import ut.n;
import v.e;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReSetPinViewModel f14287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f14291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f14292g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReSetPinViewModel reSetPinViewModel, String str, String str2, String str3, String str4, String str5, yt.a aVar) {
        super(2, aVar);
        this.f14287b = reSetPinViewModel;
        this.f14288c = str;
        this.f14289d = str2;
        this.f14290e = str3;
        this.f14291f = str4;
        this.f14292g = str5;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f14287b, this.f14288c, this.f14289d, this.f14290e, this.f14291f, this.f14292g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f14286a;
        ReSetPinViewModel reSetPinViewModel = this.f14287b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                UserRepository userRepository = reSetPinViewModel.f9081d;
                String str2 = this.f14288c;
                String str3 = this.f14289d;
                String str4 = this.f14290e;
                String str5 = this.f14291f;
                String str6 = this.f14292g;
                this.f14286a = 1;
                obj = userRepository.updatePinV2(str2, str3, str4, str5, str6, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            e0 e0Var = reSetPinViewModel.f9084g;
            Boolean bool = Boolean.FALSE;
            e0Var.postValue(bool);
            Response response = v0Var.f29302a;
            Object obj2 = v0Var.f29303b;
            boolean isSuccessful = response.isSuccessful();
            e0 e0Var2 = reSetPinViewModel.f9084g;
            if (isSuccessful) {
                e0Var2.postValue(bool);
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj2;
                if (baseResponseDto != null && baseResponseDto.getSuccess()) {
                    reSetPinViewModel.f8756n.postValue(Unit.f23355a);
                } else {
                    e0 e0Var3 = reSetPinViewModel.f9083f;
                    BaseResponseDto baseResponseDto2 = (BaseResponseDto) obj2;
                    if (baseResponseDto2 != null) {
                        str = baseResponseDto2.getMessage();
                    } else {
                        str = null;
                    }
                    e0Var3.postValue(j.i(str));
                }
            } else {
                e0Var2.postValue(bool);
            }
        } catch (Exception unused) {
            reSetPinViewModel.f9084g.postValue(Boolean.FALSE);
            e.r(R.string.no_internet_connection, reSetPinViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
