package qe;

import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialAdvancedSearchViewModel f31910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31911c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SocialAdvancedSearchViewModel socialAdvancedSearchViewModel, String str, int i10, yt.a aVar) {
        super(2, aVar);
        this.f31910b = socialAdvancedSearchViewModel;
        this.f31911c = str;
        this.f31912d = i10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f31910b, this.f31911c, this.f31912d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31909a;
        SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = this.f31910b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                FollowerRepository followerRepository = socialAdvancedSearchViewModel.f9429o;
                String str = this.f31911c;
                this.f31909a = 1;
                obj = followerRepository.addFriend(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                socialAdvancedSearchViewModel.f9084g.postValue(Boolean.FALSE);
                socialAdvancedSearchViewModel.f9434t.postValue(new Integer(this.f31912d));
            } else {
                socialAdvancedSearchViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, socialAdvancedSearchViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
