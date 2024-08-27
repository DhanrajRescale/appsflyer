package nh;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class l extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserProfileViewModel f28717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(UserProfileViewModel userProfileViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f28717b = userProfileViewModel;
        this.f28718c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l(this.f28717b, this.f28718c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28716a;
        UserProfileViewModel userProfileViewModel = this.f28717b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                FollowerRepository followerRepository = userProfileViewModel.f10070n;
                String str = this.f28718c;
                this.f28716a = 1;
                obj = followerRepository.addFriend(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                e0 e0Var = userProfileViewModel.f9084g;
                Boolean bool = Boolean.FALSE;
                e0Var.postValue(bool);
                userProfileViewModel.f10072p.postValue(bool);
                userProfileViewModel.f10073q.postValue(Boolean.TRUE);
                userProfileViewModel.i();
            } else {
                e0 e0Var2 = userProfileViewModel.f10072p;
                Boolean bool2 = Boolean.FALSE;
                e0Var2.postValue(bool2);
                userProfileViewModel.f10073q.postValue(bool2);
                userProfileViewModel.f9084g.postValue(bool2);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, userProfileViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
