package eh;

import au.i;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FollowerFollowingViewModel f15432b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FollowerFollowingViewModel followerFollowingViewModel, yt.a aVar) {
        super(2, aVar);
        this.f15432b = followerFollowingViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f15432b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15431a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            FollowerFollowingViewModel followerFollowingViewModel = this.f15432b;
            UserRepository userRepository = followerFollowingViewModel.f9081d;
            String str = followerFollowingViewModel.f9981n;
            this.f15431a = 1;
            obj = userRepository.getFollowersList(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
