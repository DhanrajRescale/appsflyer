package nb;

import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class r extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialHomeFeedV2ViewModel f28594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel, yt.a aVar) {
        super(2, aVar);
        this.f28594b = socialHomeFeedV2ViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r(this.f28594b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28593a;
        SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel = this.f28594b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            socialHomeFeedV2ViewModel.j(new o(b.f28564a, Boolean.FALSE));
            this.f28593a = 1;
            if (kp.j.K(300L, this) == aVar) {
                return aVar;
            }
        }
        socialHomeFeedV2ViewModel.j(k.f28583b);
        return Unit.f23355a;
    }
}
