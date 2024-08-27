package com.assetgro.stockgro.ui.notifications;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.NotificationDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import rf.d;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/notifications/NotificationItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/NotificationDto;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NotificationItemViewModel extends BaseItemViewModel<NotificationDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9615g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9616h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9617i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f9618j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9615g = i0.C(this.f9075c, d.f33694d);
        this.f9616h = i0.C(this.f9075c, d.f33695e);
        this.f9617i = i0.C(this.f9075c, d.f33692b);
        this.f9618j = i0.C(this.f9075c, d.f33693c);
    }
}
