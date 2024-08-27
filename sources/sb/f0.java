package sb;

import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class f0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f34472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f34473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f34474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f34475f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(FeedStreamViewModel feedStreamViewModel, c cVar, Boolean bool, String str, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f34471b = feedStreamViewModel;
        this.f34472c = cVar;
        this.f34473d = bool;
        this.f34474e = str;
        this.f34475f = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f0(this.f34471b, this.f34472c, this.f34473d, this.f34474e, this.f34475f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        FeedStreamViewModel feedStreamViewModel;
        Object socialFeedItem$default;
        boolean z10;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34470a;
        c cVar = this.f34472c;
        FeedStreamViewModel feedStreamViewModel2 = this.f34471b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                    socialFeedItem$default = obj;
                    feedStreamViewModel = feedStreamViewModel2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                feedStreamViewModel2.k(new x(null, cVar));
                feedStreamViewModel2.k(new d0("My Favourite Feeds"));
                FeedRepository feedRepository = feedStreamViewModel2.f8833n;
                FeedRepository.FeedTypeOf feedTypeOf = FeedRepository.FeedTypeOf.FAVOURITE;
                int i11 = feedStreamViewModel2.f8845z;
                int i12 = feedStreamViewModel2.f8844y;
                Boolean bool = this.f34473d;
                String str = this.f34474e;
                this.f34470a = 1;
                feedStreamViewModel = feedStreamViewModel2;
                feedStreamViewModel2 = null;
                try {
                    socialFeedItem$default = FeedRepository.getSocialFeedItem$default(feedRepository, feedTypeOf, i12, i11, null, null, null, bool, str, this, 56, null);
                    if (socialFeedItem$default == aVar) {
                        return aVar;
                    }
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    feedStreamViewModel.k(new s("Technical Error Occurred"));
                    return Unit.f23355a;
                }
            }
            v0 v0Var = (v0) socialFeedItem$default;
            if (cVar == c.f34439c) {
                z10 = true;
            } else {
                z10 = this.f34475f;
            }
            FeedStreamViewModel.h(feedStreamViewModel, v0Var, z10);
        } catch (Exception e11) {
            e = e11;
            feedStreamViewModel = feedStreamViewModel2;
        }
        return Unit.f23355a;
    }
}
