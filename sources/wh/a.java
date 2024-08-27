package wh;

import androidx.lifecycle.e0;
import au.i;
import com.assetgro.stockgro.data.model.AuthType;
import com.assetgro.stockgro.data.model.LinkedInEmailModel;
import com.assetgro.stockgro.data.repository.SocialAuthRepository;
import com.assetgro.stockgro.ui.social.auth.SocialActivityViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;
import vt.p0;

/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public SocialActivityViewModel f39067a;

    /* renamed from: b, reason: collision with root package name */
    public int f39068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SocialActivityViewModel f39069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SocialActivityViewModel socialActivityViewModel, yt.a aVar) {
        super(2, aVar);
        this.f39069c = socialActivityViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f39069c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        SocialActivityViewModel socialActivityViewModel;
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39068b;
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (i10 != 0) {
            if (i10 == 1) {
                socialActivityViewModel = this.f39067a;
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            SocialActivityViewModel socialActivityViewModel2 = this.f39069c;
            String str2 = socialActivityViewModel2.f10110t;
            if (str2 != null) {
                SocialAuthRepository socialAuthRepository = socialActivityViewModel2.f10105o;
                this.f39067a = socialActivityViewModel2;
                this.f39068b = 1;
                Object linkedInEmailAddress = socialAuthRepository.getLinkedInEmailAddress(str2, this);
                if (linkedInEmailAddress == aVar) {
                    return aVar;
                }
                socialActivityViewModel = socialActivityViewModel2;
                obj = linkedInEmailAddress;
            }
            return Unit.f23355a;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            LinkedInEmailModel linkedInEmailModel = (LinkedInEmailModel) v0Var.f29303b;
            if (linkedInEmailModel != null && (!linkedInEmailModel.getElements().isEmpty())) {
                socialActivityViewModel.f10109s.f41637b = linkedInEmailModel.getElements().get(0).getElementHandle().getEmailAddress();
                socialActivityViewModel.f10112v.postValue(socialActivityViewModel.f10109s);
            }
        } else {
            e0 e0Var = socialActivityViewModel.f10106p;
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("platform", AuthType.LINKEDIN);
            pairArr[1] = new Pair("userId", socialActivityViewModel.h());
            pairArr[2] = new Pair("social_auth_error", "user_email_error");
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                str = responseBody.toString();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                str = "EMPTY_MESSAGE";
            }
            pairArr[3] = new Pair("description", str);
            e0Var.postValue(new Pair("social_auth_error", p0.f(pairArr)));
        }
        return Unit.f23355a;
    }
}
