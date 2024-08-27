package qe;

import com.assetgro.stockgro.data.remote.response.SearchGroupsData;
import com.assetgro.stockgro.data.remote.response.SearchUsersData;
import com.assetgro.stockgro.data.remote.response.SocialSearchResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialAdvancedSearchViewModel f31924b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SocialAdvancedSearchViewModel socialAdvancedSearchViewModel, yt.a aVar) {
        super(2, aVar);
        this.f31924b = socialAdvancedSearchViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f31924b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        SearchUsersData usersData;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31923a;
        SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = this.f31924b;
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
                String str = socialAdvancedSearchViewModel.f9435u.f31908a;
                String str2 = socialAdvancedSearchViewModel.f9436v;
                Integer num = new Integer(socialAdvancedSearchViewModel.f9438x);
                Integer num2 = new Integer(socialAdvancedSearchViewModel.f9439y);
                this.f31923a = 1;
                obj = chatRepository.getSocialSearchData(str, str2, num, num2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                socialAdvancedSearchViewModel.f9084g.postValue(Boolean.FALSE);
                SocialSearchResponseDto socialSearchResponseDto = (SocialSearchResponseDto) v0Var.f29303b;
                if (socialSearchResponseDto != null) {
                    socialAdvancedSearchViewModel.f9431q.postValue(socialSearchResponseDto);
                    e eVar = e.f31906d;
                    e eVar2 = socialAdvancedSearchViewModel.f9435u;
                    boolean z10 = false;
                    if (eVar == eVar2) {
                        SearchGroupsData groupsData = socialSearchResponseDto.getGroupsData();
                        if (groupsData != null) {
                            z10 = groupsData.getMoreGroupsPresent();
                        }
                    } else if (e.f31905c == eVar2 && (usersData = socialSearchResponseDto.getUsersData()) != null) {
                        z10 = usersData.getMoreUsersPresent();
                    }
                    socialAdvancedSearchViewModel.f9437w = z10;
                }
            } else {
                socialAdvancedSearchViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, socialAdvancedSearchViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
