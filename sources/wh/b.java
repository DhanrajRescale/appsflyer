package wh;

import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import au.i;
import com.assetgro.stockgro.data.model.AuthType;
import com.assetgro.stockgro.data.model.DisplayImage;
import com.assetgro.stockgro.data.model.LinkedInProfileModel;
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
import yk.g;

/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialActivityViewModel f39071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SocialActivityViewModel socialActivityViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f39071b = socialActivityViewModel;
        this.f39072c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f39071b, this.f39072c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39070a;
        SocialActivityViewModel socialActivityViewModel = this.f39071b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                SocialAuthRepository socialAuthRepository = socialActivityViewModel.f10105o;
                String str2 = this.f39072c;
                this.f39070a = 1;
                obj = socialAuthRepository.getLinkedInUserProfile(str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                LinkedInProfileModel linkedInProfileModel = (LinkedInProfileModel) v0Var.f29303b;
                if (linkedInProfileModel != null) {
                    yh.a aVar2 = socialActivityViewModel.f10109s;
                    aVar2.f41636a = linkedInProfileModel.getId();
                    aVar2.f41638c = linkedInProfileModel.getFirstName().getLocalized().getEnUS();
                    aVar2.f41639d = linkedInProfileModel.getLastName().getLocalized().getEnUS();
                    DisplayImage displayImage = linkedInProfileModel.getProfilePicture().getDisplayImage();
                    if ((!displayImage.getElements().isEmpty()) && (!displayImage.getElements().get(0).getIdentifiers().isEmpty())) {
                        aVar2.f41640e = displayImage.getElements().get(0).getIdentifiers().get(0).getIdentifier();
                    }
                }
            } else {
                e0 e0Var = socialActivityViewModel.f10106p;
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("platform", AuthType.LINKEDIN);
                pairArr[1] = new Pair("userId", socialActivityViewModel.h());
                pairArr[2] = new Pair("social_auth_error", "user_profile_error");
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
            socialActivityViewModel.getClass();
            g.H(u0.f(socialActivityViewModel), null, null, new a(socialActivityViewModel, null), 3);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
