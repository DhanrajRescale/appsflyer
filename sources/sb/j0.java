package sb;

import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34500b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(FeedStreamViewModel feedStreamViewModel, yt.a aVar) {
        super(2, aVar);
        this.f34500b = feedStreamViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j0(this.f34500b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34499a;
        FeedStreamViewModel feedStreamViewModel = this.f34500b;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            feedStreamViewModel.k(new x(null, c.f34438b));
            this.f34499a = 1;
            if (kp.j.K(300L, this) == aVar) {
                return aVar;
            }
        }
        if (feedStreamViewModel.f8845z <= 0) {
            z10 = false;
        }
        feedStreamViewModel.k(new p(z10));
        return Unit.f23355a;
    }
}
