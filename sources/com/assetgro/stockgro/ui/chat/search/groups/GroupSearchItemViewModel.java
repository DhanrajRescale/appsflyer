package com.assetgro.stockgro.ui.chat.search.groups;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.remote.response.SearchGroupsItem;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import re.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/search/groups/GroupSearchItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/remote/response/SearchGroupsItem;", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupSearchItemViewModel extends BaseItemViewModel<SearchGroupsItem> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9440g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9441h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9442i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f9443j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f9444k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f9445l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f9446m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f9447n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9448o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSearchItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9440g = i0.C(this.f9075c, f.f33681d);
        this.f9441h = i0.C(this.f9075c, f.f33680c);
        this.f9442i = i0.C(this.f9075c, f.f33686i);
        this.f9443j = i0.C(this.f9075c, f.f33679b);
        this.f9444k = i0.C(this.f9075c, f.f33685h);
        this.f9445l = i0.C(this.f9075c, f.f33684g);
        this.f9446m = i0.C(this.f9075c, f.f33682e);
        this.f9447n = i0.C(this.f9075c, f.f33683f);
        this.f9448o = R.drawable.ic_group_display_placeholder;
    }
}
