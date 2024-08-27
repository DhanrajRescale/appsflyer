package qe;

import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.remote.response.SearchGroupsItem;
import com.assetgro.stockgro.data.remote.response.SearchUsersItem;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialAdvancedSearchActivity f31903b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SocialAdvancedSearchActivity socialAdvancedSearchActivity, int i10) {
        super(2);
        this.f31902a = i10;
        this.f31903b = socialAdvancedSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f31902a;
        SocialAdvancedSearchActivity socialAdvancedSearchActivity = this.f31903b;
        switch (i10) {
            case 0:
                SearchGroupsItem group = (SearchGroupsItem) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(group, "group");
                SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = (SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x();
                Intrinsics.checkNotNullParameter(group, "group");
                socialAdvancedSearchViewModel.f9084g.postValue(Boolean.TRUE);
                yk.g.H(u0.f(socialAdvancedSearchViewModel), null, null, new i(socialAdvancedSearchViewModel, group, "User", intValue, null), 3);
                return Unit.f23355a;
            default:
                SearchUsersItem user = (SearchUsersItem) obj;
                int intValue2 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(user, "user");
                SocialAdvancedSearchViewModel socialAdvancedSearchViewModel2 = (SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x();
                String userId = user.getUserId();
                Intrinsics.checkNotNullParameter(userId, "userId");
                socialAdvancedSearchViewModel2.f9084g.postValue(Boolean.TRUE);
                yk.g.H(u0.f(socialAdvancedSearchViewModel2), null, null, new f(socialAdvancedSearchViewModel2, userId, intValue2, null), 3);
                return Unit.f23355a;
        }
    }
}
