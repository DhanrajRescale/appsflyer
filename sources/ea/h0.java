package ea;

import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class h0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15173c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FeedRepository f15175e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(kq.e eVar, ct.a aVar, UserRepository userRepository, FeedRepository feedRepository, int i10) {
        super(0);
        this.f15171a = i10;
        this.f15172b = eVar;
        this.f15173c = aVar;
        this.f15174d = userRepository;
        this.f15175e = feedRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15171a;
        FeedRepository feedRepository = this.f15175e;
        UserRepository userRepository = this.f15174d;
        ct.a aVar = this.f15173c;
        pj.a aVar2 = this.f15172b;
        switch (i10) {
            case 0:
                return new CommentsViewModel(aVar2, aVar, userRepository, feedRepository);
            default:
                return new SocialHomeFeedV2ViewModel(aVar2, aVar, userRepository, feedRepository);
        }
    }
}
