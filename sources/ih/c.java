package ih;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.AccountDeleteResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.DeleteAccountViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.Response;
import qu.f0;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountViewModel f19989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19990c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeleteAccountViewModel deleteAccountViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f19989b = deleteAccountViewModel;
        this.f19990c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f19989b, this.f19990c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19988a;
        DeleteAccountViewModel deleteAccountViewModel = this.f19989b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = deleteAccountViewModel.f10023g;
                String str = this.f19990c;
                this.f19988a = 1;
                obj = userRepository.removeUserAccount(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            deleteAccountViewModel.f9070f.postValue(Boolean.FALSE);
            Response response = v0Var.f29302a;
            Object obj2 = v0Var.f29303b;
            if (response.isSuccessful()) {
                BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) obj2;
                Object obj3 = null;
                if (baseResponseV2Dto != null && baseResponseV2Dto.getSuccess()) {
                    e0 e0Var = deleteAccountViewModel.f10024h;
                    BaseResponseV2Dto baseResponseV2Dto2 = (BaseResponseV2Dto) obj2;
                    if (baseResponseV2Dto2 != null) {
                        obj3 = (AccountDeleteResponse) baseResponseV2Dto2.getData();
                    }
                    e0Var.postValue(obj3);
                } else {
                    e0 e0Var2 = deleteAccountViewModel.f10025i;
                    BaseResponseV2Dto baseResponseV2Dto3 = (BaseResponseV2Dto) obj2;
                    if (baseResponseV2Dto3 != null) {
                        obj3 = baseResponseV2Dto3.getMessage();
                    }
                    e0Var2.postValue(obj3);
                }
            }
        } catch (Exception unused) {
            deleteAccountViewModel.f9070f.postValue(Boolean.FALSE);
            v.e.r(R.string.no_internet_connection, deleteAccountViewModel.f9068d);
        }
        return Unit.f23355a;
    }
}
