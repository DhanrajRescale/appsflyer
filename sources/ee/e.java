package ee;

import au.i;
import com.assetgro.stockgro.data.model.UserGroupInfo;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class e extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailViewModel f15394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserGroupInfo f15396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GroupDetailViewModel groupDetailViewModel, String str, UserGroupInfo userGroupInfo, yt.a aVar) {
        super(2, aVar);
        this.f15394b = groupDetailViewModel;
        this.f15395c = str;
        this.f15396d = userGroupInfo;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f15394b, this.f15395c, this.f15396d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15393a;
        GroupDetailViewModel groupDetailViewModel = this.f15394b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                FollowerRepository followerRepository = groupDetailViewModel.f9329o;
                String str = this.f15395c;
                this.f15393a = 1;
                obj = followerRepository.addFriend(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                groupDetailViewModel.f9336v.postValue(new z9.h(R.string.group_join_and_follow_message, new Object[0]));
            }
            groupDetailViewModel.f9334t.postValue(this.f15396d);
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
