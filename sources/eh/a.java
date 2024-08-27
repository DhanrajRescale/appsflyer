package eh;

import au.i;
import ba.c0;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FollowerFollowingActivity f15426a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FollowerFollowingActivity followerFollowingActivity, yt.a aVar) {
        super(2, aVar);
        this.f15426a = followerFollowingActivity;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f15426a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        FollowerFollowingActivity followerFollowingActivity = this.f15426a;
        c0 c0Var = (c0) followerFollowingActivity.w();
        c0Var.f4328s.c(followerFollowingActivity.f9980m, false);
        return Unit.f23355a;
    }
}
