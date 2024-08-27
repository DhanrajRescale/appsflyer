package sb;

import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class i0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f34494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f34495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f34496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f34497f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(FeedStreamViewModel feedStreamViewModel, c cVar, Boolean bool, String str, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f34493b = feedStreamViewModel;
        this.f34494c = cVar;
        this.f34495d = bool;
        this.f34496e = str;
        this.f34497f = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i0(this.f34493b, this.f34494c, this.f34495d, this.f34496e, this.f34497f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object socialFeedItem$default;
        boolean z11;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34492a;
        c cVar = this.f34494c;
        FeedStreamViewModel feedStreamViewModel = this.f34493b;
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
                FeedRepository.FeedTypeOf feedTypeOf = FeedRepository.FeedTypeOf.BOOKMARK;
                int i11 = feedStreamViewModel.f8845z;
                int i12 = feedStreamViewModel.f8844y;
                Boolean bool = this.f34495d;
                String str = this.f34496e;
                this.f34492a = 1;
                z10 = true;
                socialFeedItem$default = FeedRepository.getSocialFeedItem$default(feedRepository, feedTypeOf, i12, i11, null, null, null, bool, str, this, 56, null);
                if (socialFeedItem$default == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) socialFeedItem$default;
            if (cVar == c.f34439c) {
                z11 = z10;
            } else {
                z11 = this.f34497f;
            }
            FeedStreamViewModel.h(feedStreamViewModel, v0Var, z11);
        } catch (Exception unused) {
            feedStreamViewModel.k(new s("Technical Error Occurred"));
        }
        return Unit.f23355a;
    }
}
