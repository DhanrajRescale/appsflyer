package com.assetgro.stockgro.ui.chat.search.user;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.remote.response.SearchUsersItem;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/search/user/UserSearchItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/remote/response/SearchUsersItem;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserSearchItemViewModel extends BaseItemViewModel<SearchUsersItem> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9450g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9451h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9452i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f9453j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f9454k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f9455l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9456m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSearchItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9450g = i0.C(this.f9075c, te.e.f36004g);
        this.f9451h = i0.C(this.f9075c, te.e.f36002e);
        this.f9452i = i0.C(this.f9075c, te.e.f36003f);
        this.f9453j = i0.C(this.f9075c, te.e.f36000c);
        this.f9454k = i0.C(this.f9075c, te.e.f36001d);
        this.f9455l = i0.C(this.f9075c, te.e.f35999b);
        this.f9456m = R.drawable.ic_social_search_placeholder;
    }
}
