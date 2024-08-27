package wh;

import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import au.i;
import com.assetgro.stockgro.data.model.AuthType;
import com.assetgro.stockgro.data.remote.response.LinkedInTokenResponseDto;
import com.assetgro.stockgro.data.repository.SocialAuthRepository;
import com.assetgro.stockgro.ui.social.auth.SocialActivityViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;
import vt.p0;
import yk.g;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialActivityViewModel f39074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SocialActivityViewModel socialActivityViewModel, yt.a aVar) {
        super(2, aVar);
        this.f39074b = socialActivityViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f39074b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39073a;
        String str = null;
        SocialActivityViewModel socialActivityViewModel = this.f39074b;
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
                String str2 = socialActivityViewModel.f10108r;
                if (str2 != null) {
                    this.f39073a = 1;
                    obj = socialAuthRepository.getLinkedInAccessToken(str2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    Intrinsics.k("linkedinCode");
                    throw null;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                LinkedInTokenResponseDto linkedInTokenResponseDto = (LinkedInTokenResponseDto) v0Var.f29303b;
                if (linkedInTokenResponseDto != null) {
                    String accessToken = linkedInTokenResponseDto.getAccessToken();
                    socialActivityViewModel.f10110t = accessToken;
                    if (accessToken != null) {
                        g.H(u0.f(socialActivityViewModel), null, null, new b(socialActivityViewModel, accessToken, null), 3);
                    }
                }
            } else {
                e0 e0Var = socialActivityViewModel.f10106p;
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("platform", AuthType.LINKEDIN);
                pairArr[1] = new Pair("userId", socialActivityViewModel.h());
                pairArr[2] = new Pair("social_auth_error", "access_token_error");
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str = responseBody.toString();
                }
                if (str == null || str.length() == 0) {
                    str = "EMPTY_MESSAGE";
                }
                pairArr[3] = new Pair("description", str);
                e0Var.postValue(new Pair("social_auth_error", p0.f(pairArr)));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
