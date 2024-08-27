package nb;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.data.remote.feed.home.SocialHomeFeedResponseDto;
import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class s extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialHomeFeedV2ViewModel f28596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f28597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel, b bVar, yt.a aVar) {
        super(2, aVar);
        this.f28596b = socialHomeFeedV2ViewModel;
        this.f28597c = bVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s(this.f28596b, this.f28597c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        SocialHomeFeedResponseDto socialHomeFeedResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28595a;
        SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel = this.f28596b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                socialHomeFeedV2ViewModel.j(new o(this.f28597c, Boolean.FALSE));
                FeedRepository feedRepository = socialHomeFeedV2ViewModel.f8818n;
                this.f28595a = 1;
                obj = feedRepository.getSocialHome(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (socialHomeFeedResponseDto = (SocialHomeFeedResponseDto) baseResponseDto.getData()) != null) {
                    socialHomeFeedV2ViewModel.j(new i(socialHomeFeedResponseDto.toSocialHomeFeedResponse().a()));
                    socialHomeFeedV2ViewModel.k();
                }
            } else {
                socialHomeFeedV2ViewModel.j(new l("Technical Error Occurred"));
            }
        } catch (Exception unused) {
            socialHomeFeedV2ViewModel.j(new l("Technical Error Occurred"));
        }
        return Unit.f23355a;
    }
}
