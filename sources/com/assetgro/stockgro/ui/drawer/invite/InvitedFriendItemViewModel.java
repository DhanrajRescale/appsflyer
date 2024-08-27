package com.assetgro.stockgro.ui.drawer.invite;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.InvitedFriendDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import ye.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/invite/InvitedFriendItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/InvitedFriendDto;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class InvitedFriendItemViewModel extends BaseItemViewModel<InvitedFriendDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9492g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9493h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9494i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvitedFriendItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9492g = i0.C(this.f9075c, c.f41604e);
        this.f9493h = i0.C(this.f9075c, c.f41602c);
        this.f9494i = i0.C(this.f9075c, c.f41603d);
    }
}
