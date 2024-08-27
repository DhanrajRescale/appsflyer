package nb;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.data.remote.feed.home.SocialHomeFeedStoryResponseDto;
import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class u extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialHomeFeedV2ViewModel f28601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f28602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel, b bVar, yt.a aVar) {
        super(2, aVar);
        this.f28601b = socialHomeFeedV2ViewModel;
        this.f28602c = bVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u(this.f28601b, this.f28602c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        SocialHomeFeedStoryResponseDto socialHomeFeedStoryResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28600a;
        SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel = this.f28601b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                socialHomeFeedV2ViewModel.j(new o(this.f28602c, Boolean.TRUE));
                FeedRepository feedRepository = socialHomeFeedV2ViewModel.f8818n;
                this.f28600a = 1;
                obj = feedRepository.getSocialHomeStories(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (socialHomeFeedStoryResponseDto = (SocialHomeFeedStoryResponseDto) baseResponseDto.getData()) != null) {
                    e1.s sVar = socialHomeFeedV2ViewModel.f8823s;
                    sVar.clear();
                    sVar.addAll(socialHomeFeedStoryResponseDto.toSocialHomeFeedStoryResponse().a());
                    socialHomeFeedV2ViewModel.j(new o(null, Boolean.TRUE));
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
