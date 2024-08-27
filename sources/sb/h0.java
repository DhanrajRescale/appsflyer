package sb;

import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class h0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f34487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f34488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f34489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f34490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f34491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(FeedStreamViewModel feedStreamViewModel, c cVar, String str, Boolean bool, String str2, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f34486b = feedStreamViewModel;
        this.f34487c = cVar;
        this.f34488d = str;
        this.f34489e = bool;
        this.f34490f = str2;
        this.f34491g = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h0(this.f34486b, this.f34487c, this.f34488d, this.f34489e, this.f34490f, this.f34491g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object socialFeedItem$default;
        boolean z11;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34485a;
        c cVar = this.f34487c;
        FeedStreamViewModel feedStreamViewModel = this.f34486b;
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
                FeedRepository.FeedTypeOf feedTypeOf = FeedRepository.FeedTypeOf.SUBCATEGORY;
                int i11 = feedStreamViewModel.f8845z;
                int i12 = feedStreamViewModel.f8844y;
                String str = this.f34488d;
                Boolean bool = this.f34489e;
                String str2 = this.f34490f;
                this.f34485a = 1;
                z10 = true;
                socialFeedItem$default = FeedRepository.getSocialFeedItem$default(feedRepository, feedTypeOf, i12, i11, null, null, str, bool, str2, this, 24, null);
                if (socialFeedItem$default == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) socialFeedItem$default;
            if (cVar == c.f34439c) {
                z11 = z10;
            } else {
                z11 = this.f34491g;
            }
            FeedStreamViewModel.h(feedStreamViewModel, v0Var, z11);
        } catch (Exception unused) {
            feedStreamViewModel.k(new s("Technical Error Occurred"));
        }
        return Unit.f23355a;
    }
}
