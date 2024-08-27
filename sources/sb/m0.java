package sb;

import com.assetgro.stockgro.data.remote.request.FeedPostReactionDto;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class m0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FeedPostReactionDto f34517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hb.u f34518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(FeedStreamViewModel feedStreamViewModel, FeedPostReactionDto feedPostReactionDto, hb.u uVar, yt.a aVar) {
        super(2, aVar);
        this.f34516b = feedStreamViewModel;
        this.f34517c = feedPostReactionDto;
        this.f34518d = uVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new m0(this.f34516b, this.f34517c, this.f34518d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34515a;
        FeedStreamViewModel feedStreamViewModel = this.f34516b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                FeedRepository feedRepository = feedStreamViewModel.f8833n;
                FeedPostReactionDto feedPostReactionDto = this.f34517c;
                this.f34515a = 1;
                obj = feedRepository.handleFeedPostReaction(feedPostReactionDto, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (!((v0) obj).f29302a.isSuccessful()) {
                feedStreamViewModel.m(this.f34518d.f18230a.f18224a);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, feedStreamViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
