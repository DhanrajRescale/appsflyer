package sb;

import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class e0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(FeedStreamViewModel feedStreamViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f34467b = feedStreamViewModel;
        this.f34468c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e0(this.f34467b, this.f34468c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, yk.o] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34466a;
        FeedStreamViewModel feedStreamViewModel = this.f34467b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                FollowerRepository followerRepository = feedStreamViewModel.f8834o;
                String str = this.f34468c;
                this.f34466a = 1;
                obj = followerRepository.addFriend(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                feedStreamViewModel.k(new Object());
            } else {
                feedStreamViewModel.k(new s(v0Var.f29302a.message()));
            }
        } catch (Exception e10) {
            feedStreamViewModel.k(new s(null));
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
