package df;

import au.i;
import com.assetgro.stockgro.data.model.TutorialDto;
import com.assetgro.stockgro.data.model.VideoTutorialDataResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.drawer.tutorials.VideoTutorialViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoTutorialViewModel f14330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(VideoTutorialViewModel videoTutorialViewModel, yt.a aVar) {
        super(2, aVar);
        this.f14330b = videoTutorialViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f14330b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        List<TutorialDto> list;
        VideoTutorialDataResponse videoTutorialDataResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f14329a;
        VideoTutorialViewModel videoTutorialViewModel = this.f14330b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                UserRepository userRepository = videoTutorialViewModel.f9081d;
                this.f14329a = 1;
                obj = userRepository.getVideoTutorials(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (videoTutorialDataResponse = (VideoTutorialDataResponse) baseResponseDto.getData()) != null) {
                    list = videoTutorialDataResponse.getTutorials();
                } else {
                    list = null;
                }
                videoTutorialViewModel.f9517n.postValue(list);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
