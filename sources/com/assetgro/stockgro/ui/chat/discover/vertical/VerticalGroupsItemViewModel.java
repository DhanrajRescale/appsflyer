package com.assetgro.stockgro.ui.chat.discover.vertical;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import fe.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/discover/vertical/VerticalGroupsItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/Group;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class VerticalGroupsItemViewModel extends BaseItemViewModel<Group> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9341g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9342h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9343i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f9344j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalGroupsItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9341g = i0.C(this.f9075c, d.f16049d);
        this.f9342h = i0.C(this.f9075c, d.f16048c);
        this.f9343i = i0.C(this.f9075c, d.f16047b);
        this.f9344j = i0.C(this.f9075c, d.f16050e);
    }
}
