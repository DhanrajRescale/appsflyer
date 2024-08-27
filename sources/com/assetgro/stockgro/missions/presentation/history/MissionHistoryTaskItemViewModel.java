package com.assetgro.stockgro.missions.presentation.history;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import gc.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/history/MissionHistoryTaskItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/missions/domain/model/UserTask;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionHistoryTaskItemViewModel extends BaseItemViewModel<UserTask> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f8878g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f8879h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionHistoryTaskItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f8878g = i0.C(this.f9075c, g.f17228b);
        this.f8879h = i0.C(this.f9075c, g.f17229c);
    }
}
