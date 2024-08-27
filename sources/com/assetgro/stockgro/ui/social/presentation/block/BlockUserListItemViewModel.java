package com.assetgro.stockgro.ui.social.presentation.block;

import androidx.lifecycle.d0;
import bi.d;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import com.assetgro.stockgro.ui.social.domain.model.User;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/social/presentation/block/BlockUserListItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/ui/social/domain/model/User;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BlockUserListItemViewModel extends BaseItemViewModel<User> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f10116g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f10117h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f10118i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f10119j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockUserListItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f10116g = i0.C(this.f9075c, d.f6986b);
        this.f10117h = i0.C(this.f9075c, d.f6988d);
        this.f10118i = i0.C(this.f9075c, d.f6989e);
        this.f10119j = i0.C(this.f9075c, d.f6987c);
    }
}
