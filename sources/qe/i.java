package qe;

import com.assetgro.stockgro.data.remote.response.SearchGroupsItem;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialAdvancedSearchViewModel f31919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchGroupsItem f31920c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f31921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SocialAdvancedSearchViewModel socialAdvancedSearchViewModel, SearchGroupsItem searchGroupsItem, String str, int i10, yt.a aVar) {
        super(2, aVar);
        this.f31919b = socialAdvancedSearchViewModel;
        this.f31920c = searchGroupsItem;
        this.f31921d = str;
        this.f31922e = i10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f31919b, this.f31920c, this.f31921d, this.f31922e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31918a;
        SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = this.f31919b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ChatRepository chatRepository = socialAdvancedSearchViewModel.f9428n;
                String groupId = this.f31920c.getGroupId();
                String str = this.f31921d;
                this.f31918a = 1;
                obj = chatRepository.joinSocialGroup(groupId, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                socialAdvancedSearchViewModel.f9084g.postValue(Boolean.FALSE);
                socialAdvancedSearchViewModel.f9433s.postValue(new Integer(this.f31922e));
            } else {
                socialAdvancedSearchViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, socialAdvancedSearchViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
