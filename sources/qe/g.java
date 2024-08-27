package qe;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.SocialSearchHistoryItem;
import com.assetgro.stockgro.data.remote.response.SocialSearchHistoryResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;
import vt.g0;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialAdvancedSearchViewModel f31914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SocialAdvancedSearchViewModel socialAdvancedSearchViewModel, yt.a aVar) {
        super(2, aVar);
        this.f31914b = socialAdvancedSearchViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f31914b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        List list;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31913a;
        SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = this.f31914b;
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
                this.f31913a = 1;
                obj = chatRepository.getSocialSearchHistoryData(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                socialAdvancedSearchViewModel.f9084g.postValue(Boolean.FALSE);
                SocialSearchHistoryResponseDto socialSearchHistoryResponseDto = (SocialSearchHistoryResponseDto) v0Var.f29303b;
                if (socialSearchHistoryResponseDto != null) {
                    e0 e0Var = socialAdvancedSearchViewModel.f9430p;
                    List<SocialSearchHistoryItem> searchRequests = socialSearchHistoryResponseDto.getSearchRequests();
                    if (searchRequests != null) {
                        list = g0.N(searchRequests, 5);
                    } else {
                        list = null;
                    }
                    e0Var.postValue(list);
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
