package la;

import android.view.MenuItem;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchActivity;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchActivity;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchActivity;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchViewModel;
import ge.o;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import ui.f;

/* loaded from: classes.dex */
public final class a implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24376b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f24375a = i10;
        this.f24376b = obj;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem item) {
        int i10 = this.f24375a;
        Object obj = this.f24376b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "item");
                ((MarketOptionSearchActivity) obj).finish();
                return true;
            case 1:
                Intrinsics.checkNotNullParameter(item, "item");
                d dVar = (d) obj;
                MarketOptionSearchViewModel marketOptionSearchViewModel = (MarketOptionSearchViewModel) dVar.r();
                Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "<set-?>");
                marketOptionSearchViewModel.f8649o = HttpUrl.FRAGMENT_ENCODE_SET;
                ((MarketOptionSearchViewModel) dVar.r()).f8650p.postValue(Boolean.TRUE);
                return true;
            case 2:
                Intrinsics.checkNotNullParameter(item, "item");
                MarketAdvancedSearchActivity marketAdvancedSearchActivity = (MarketAdvancedSearchActivity) obj;
                ((MarketAdvancedSearchViewModel) marketAdvancedSearchActivity.x()).f8693t = HttpUrl.FRAGMENT_ENCODE_SET;
                marketAdvancedSearchActivity.finish();
                return true;
            case 3:
                Intrinsics.checkNotNullParameter(item, "item");
                GroupMemberListViewModel groupMemberListViewModel = (GroupMemberListViewModel) ((GroupMemberListActivity) obj).x();
                groupMemberListViewModel.f9287o = false;
                groupMemberListViewModel.F = HttpUrl.FRAGMENT_ENCODE_SET;
                groupMemberListViewModel.H = 0;
                groupMemberListViewModel.m();
                return true;
            case 4:
                Intrinsics.checkNotNullParameter(item, "item");
                o oVar = (o) obj;
                SearchContactViewModel searchContactViewModel = (SearchContactViewModel) oVar.r();
                searchContactViewModel.f9354q = false;
                searchContactViewModel.f9360w.postValue(Boolean.FALSE);
                ((SearchContactViewModel) oVar.r()).j(HttpUrl.FRAGMENT_ENCODE_SET);
                SearchContactViewModel searchContactViewModel2 = (SearchContactViewModel) oVar.r();
                Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "searchString");
                searchContactViewModel2.C = 0;
                searchContactViewModel2.B = true;
                searchContactViewModel2.f9361x.clear();
                searchContactViewModel2.i(HttpUrl.FRAGMENT_ENCODE_SET);
                return true;
            case 5:
                Intrinsics.checkNotNullParameter(item, "item");
                SocialAdvancedSearchActivity socialAdvancedSearchActivity = (SocialAdvancedSearchActivity) obj;
                ((SocialAdvancedSearchViewModel) socialAdvancedSearchActivity.x()).f9436v = HttpUrl.FRAGMENT_ENCODE_SET;
                socialAdvancedSearchActivity.finish();
                return true;
            case 6:
                Intrinsics.checkNotNullParameter(item, "item");
                ((MarketAssetSearchActivity) obj).finish();
                return true;
            default:
                Intrinsics.checkNotNullParameter(item, "item");
                f fVar = (f) obj;
                MarketAssetSearchViewModel marketAssetSearchViewModel = (MarketAssetSearchViewModel) fVar.r();
                Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "<set-?>");
                marketAssetSearchViewModel.f10390r = HttpUrl.FRAGMENT_ENCODE_SET;
                ((MarketAssetSearchViewModel) fVar.r()).f10389q.postValue(Boolean.TRUE);
                ((MarketAssetSearchViewModel) fVar.r()).h();
                return true;
        }
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem item) {
        switch (this.f24375a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "item");
                return true;
            case 1:
                Intrinsics.checkNotNullParameter(item, "item");
                return true;
            case 2:
                Intrinsics.checkNotNullParameter(item, "item");
                return true;
            case 3:
                Intrinsics.checkNotNullParameter(item, "item");
                return true;
            case 4:
                Intrinsics.checkNotNullParameter(item, "item");
                return true;
            case 5:
                Intrinsics.checkNotNullParameter(item, "item");
                return true;
            case 6:
                Intrinsics.checkNotNullParameter(item, "item");
                return true;
            default:
                Intrinsics.checkNotNullParameter(item, "item");
                return true;
        }
    }
}
