package ob;

import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nb.m;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialHomeFeedV2ViewModel f29900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel, int i10) {
        super(0);
        this.f29899a = i10;
        this.f29900b = socialHomeFeedV2ViewModel;
    }

    public final void a() {
        int i10 = this.f29899a;
        SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel = this.f29900b;
        switch (i10) {
            case 0:
                Integer num = ((nb.c) socialHomeFeedV2ViewModel.f8819o.getValue()).f28574h;
                if (num != null && num.intValue() > 0) {
                    socialHomeFeedV2ViewModel.j(new m("FEED_STREAM_FAVOURITES", null));
                    return;
                }
                return;
            case 1:
                socialHomeFeedV2ViewModel.getClass();
                nb.b bVar = nb.b.f28565b;
                socialHomeFeedV2ViewModel.h(bVar);
                socialHomeFeedV2ViewModel.i(bVar);
                return;
            default:
                socialHomeFeedV2ViewModel.getClass();
                nb.b bVar2 = nb.b.f28565b;
                socialHomeFeedV2ViewModel.h(bVar2);
                socialHomeFeedV2ViewModel.i(bVar2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f29899a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
