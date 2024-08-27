package fg;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.request.WithdrawInitiateDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawInitiateResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import qu.f0;
import vt.v;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public WithdrawInitiateDto f16091a;

    /* renamed from: b, reason: collision with root package name */
    public int f16092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f16093c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f16095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f16096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WithdrawalDetailViewModel f16097g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(double d10, String str, String str2, String str3, WithdrawalDetailViewModel withdrawalDetailViewModel, yt.a aVar) {
        super(2, aVar);
        this.f16093c = d10;
        this.f16094d = str;
        this.f16095e = str2;
        this.f16096f = str3;
        this.f16097g = withdrawalDetailViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f16093c, this.f16094d, this.f16095e, this.f16096f, this.f16097g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        WithdrawInitiateDto withdrawInitiateDto;
        WithdrawInitiateResponseDto withdrawInitiateResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16092b;
        WithdrawalDetailViewModel withdrawalDetailViewModel = this.f16097g;
        if (i10 != 0) {
            if (i10 == 1) {
                withdrawInitiateDto = this.f16091a;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            WithdrawInitiateDto withdrawInitiateDto2 = new WithdrawInitiateDto(this.f16093c, this.f16094d, this.f16095e, this.f16096f);
            PaymentRepository paymentRepository = withdrawalDetailViewModel.f9758n;
            this.f16091a = withdrawInitiateDto2;
            this.f16092b = 1;
            Object withdrawInitiate = paymentRepository.withdrawInitiate(withdrawInitiateDto2, this);
            if (withdrawInitiate == aVar) {
                return aVar;
            }
            withdrawInitiateDto = withdrawInitiateDto2;
            obj = withdrawInitiate;
        }
        v0 v0Var = (v0) obj;
        e0 e0Var = withdrawalDetailViewModel.f9084g;
        Boolean bool = Boolean.FALSE;
        e0Var.postValue(bool);
        e0 e0Var2 = withdrawalDetailViewModel.f9760p;
        Boolean bool2 = Boolean.TRUE;
        e0Var2.postValue(bool2);
        boolean isSuccessful = v0Var.f29302a.isSuccessful();
        e0 e0Var3 = withdrawalDetailViewModel.E;
        if (isSuccessful) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (withdrawInitiateResponseDto = (WithdrawInitiateResponseDto) baseResponseDto.getData()) != null) {
                e0Var3.postValue(new kj.j(new d(new c(withdrawInitiateDto, withdrawInitiateResponseDto.getSessionId(), withdrawalDetailViewModel.f9081d.getUserPhoneNumber(), withdrawInitiateResponseDto.getOtpTime()), null)));
            }
        } else {
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                JSONObject jSONObject = new JSONObject(responseBody.string());
                String string = jSONObject.getString("message");
                String string2 = jSONObject.getString("error_code");
                boolean o10 = v.o(new String[]{"FOX0001OTP", "FOX0001OTP", "FOX0002OTP", "FOX0005OTP"}, string2);
                e0 e0Var4 = withdrawalDetailViewModel.C;
                if (o10) {
                    e0Var4.postValue(new kj.j(new Pair(string, bool)));
                } else if (v.o(new String[]{"FOX0003OTP", "FOX0002PIN", "FOX0001PIN"}, string2)) {
                    e0Var3.postValue(new kj.j(new d(null, string)));
                } else {
                    e0Var4.postValue(new kj.j(new Pair(string, bool2)));
                }
            }
        }
        return Unit.f23355a;
    }
}
