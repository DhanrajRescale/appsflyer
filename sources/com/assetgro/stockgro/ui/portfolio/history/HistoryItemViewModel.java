package com.assetgro.stockgro.ui.portfolio.history;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.portfolio.HistoryOrderDto;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import lg.c;
import qu.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/history/HistoryItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/portfolio/HistoryOrderDto;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class HistoryItemViewModel extends BaseItemViewModel<HistoryOrderDto> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9803g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9804h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9805i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f9806j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f9807k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f9808l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f9809m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f9810n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9803g = i0.C(this.f9075c, c.f24818f);
        this.f9804h = i0.C(this.f9075c, c.f24821i);
        this.f9805i = i0.C(this.f9075c, c.f24820h);
        this.f9806j = i0.C(this.f9075c, c.f24816d);
        this.f9807k = i0.C(this.f9075c, c.f24819g);
        this.f9808l = i0.C(this.f9075c, c.f24815c);
        this.f9809m = i0.C(this.f9075c, c.f24814b);
        this.f9810n = i0.C(this.f9075c, c.f24817e);
    }
}
