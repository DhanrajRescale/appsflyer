package sb;

import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class g0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f34479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f34480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f34481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f34482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f34483g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(FeedStreamViewModel feedStreamViewModel, c cVar, String str, Boolean bool, String str2, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f34478b = feedStreamViewModel;
        this.f34479c = cVar;
        this.f34480d = str;
        this.f34481e = bool;
        this.f34482f = str2;
        this.f34483g = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g0(this.f34478b, this.f34479c, this.f34480d, this.f34481e, this.f34482f, this.f34483g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object socialFeedItem$default;
        boolean z11;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34477a;
        c cVar = this.f34479c;
        FeedStreamViewModel feedStreamViewModel = this.f34478b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                    socialFeedItem$default = obj;
                    z10 = true;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                feedStreamViewModel.k(new x(null, cVar));
                FeedRepository feedRepository = feedStreamViewModel.f8833n;
                FeedRepository.FeedTypeOf feedTypeOf = FeedRepository.FeedTypeOf.GROUP;
                int i11 = feedStreamViewModel.f8845z;
                int i12 = feedStreamViewModel.f8844y;
                String str = this.f34480d;
                Boolean bool = this.f34481e;
                String str2 = this.f34482f;
                this.f34477a = 1;
                z10 = true;
                socialFeedItem$default = FeedRepository.getSocialFeedItem$default(feedRepository, feedTypeOf, i12, i11, str, null, null, bool, str2, this, 48, null);
                if (socialFeedItem$default == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) socialFeedItem$default;
            if (cVar == c.f34439c) {
                z11 = z10;
            } else {
                z11 = this.f34483g;
            }
            FeedStreamViewModel.h(feedStreamViewModel, v0Var, z11);
        } catch (Exception e10) {
            e10.printStackTrace();
            feedStreamViewModel.k(new s("Technical Error Occurred"));
        }
        return Unit.f23355a;
    }
}
