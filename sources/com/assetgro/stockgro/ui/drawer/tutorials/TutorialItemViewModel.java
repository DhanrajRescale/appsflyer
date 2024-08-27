package com.assetgro.stockgro.ui.drawer.tutorials;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.TutorialDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/tutorials/TutorialItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/TutorialDto;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TutorialItemViewModel extends BaseItemViewModel<TutorialDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9513g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9514h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9513g = i0.C(this.f9075c, df.e.f14326b);
        this.f9514h = i0.C(this.f9075c, df.e.f14327c);
    }
}
