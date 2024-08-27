package sb;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class l0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(FeedStreamViewModel feedStreamViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f34513b = feedStreamViewModel;
        this.f34514c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l0(this.f34513b, this.f34514c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        InviteTemplateResponse inviteTemplateResponse;
        String inviteTemplate;
        String str = this.f34514c;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34512a;
        FeedStreamViewModel feedStreamViewModel = this.f34513b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                feedStreamViewModel.k(new x(str, c.f34440d));
                FeedRepository feedRepository = feedStreamViewModel.f8833n;
                this.f34512a = 1;
                obj = feedRepository.getPostShareTemplate(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (inviteTemplateResponse = (InviteTemplateResponse) baseResponseDto.getData()) != null && (inviteTemplate = inviteTemplateResponse.getInviteTemplate()) != null) {
                    feedStreamViewModel.k(new y(inviteTemplate));
                }
            } else {
                feedStreamViewModel.k(new x(null, null));
            }
        } catch (Exception unused) {
            feedStreamViewModel.k(new s("Technical Error Occurred"));
        }
        return Unit.f23355a;
    }
}
