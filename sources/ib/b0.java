package ib;

import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class b0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiaProfileViewModel f19762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(RiaProfileViewModel riaProfileViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f19762b = riaProfileViewModel;
        this.f19763c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b0(this.f19762b, this.f19763c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19761a;
        RiaProfileViewModel riaProfileViewModel = this.f19762b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                FollowerRepository followerRepository = riaProfileViewModel.f8794n;
                String str = this.f19763c;
                this.f19761a = 1;
                obj = followerRepository.addFriend(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                riaProfileViewModel.f9084g.postValue(Boolean.FALSE);
                riaProfileViewModel.f8799s.postValue(Boolean.TRUE);
                riaProfileViewModel.i();
            } else {
                riaProfileViewModel.f8799s.postValue(Boolean.FALSE);
            }
            riaProfileViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception unused) {
            riaProfileViewModel.f9084g.postValue(Boolean.FALSE);
            v.e.r(R.string.no_internet_connection, riaProfileViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
