package eh;

import au.i;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import qu.r0;
import ut.n;

/* loaded from: classes.dex */
public final class g extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f15439a;

    /* renamed from: b, reason: collision with root package name */
    public int f15440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FollowerFollowingViewModel f15441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FollowerFollowingViewModel followerFollowingViewModel, yt.a aVar) {
        super(2, aVar);
        this.f15441c = followerFollowingViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f15441c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15440b;
        FollowerFollowingViewModel followerFollowingViewModel = this.f15441c;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    arrayList = this.f15439a;
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                followerFollowingViewModel.f9084g.postValue(Boolean.TRUE);
                ArrayList arrayList2 = new ArrayList();
                xu.d dVar = r0.f32256b;
                f fVar = new f(followerFollowingViewModel, arrayList2, null);
                this.f15439a = arrayList2;
                this.f15440b = 1;
                if (yk.g.e0(dVar, fVar, this) == aVar) {
                    return aVar;
                }
                arrayList = arrayList2;
            }
            followerFollowingViewModel.f9982o.postValue(arrayList);
            followerFollowingViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception unused) {
            followerFollowingViewModel.f9084g.postValue(Boolean.FALSE);
            v.e.r(R.string.no_internet_connection, followerFollowingViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
