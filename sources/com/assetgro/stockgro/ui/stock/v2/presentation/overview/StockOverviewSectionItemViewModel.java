package com.assetgro.stockgro.ui.stock.v2.presentation.overview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ct.a;
import kj.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import vt.p0;
import zi.f;
import zi.g;
import zi.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/presentation/overview/StockOverviewSectionItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lzi/f;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockOverviewSectionItemViewModel extends BaseItemViewModel<f> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f10479g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f10480h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f10481i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f10482j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f10483k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f10484l;

    /* renamed from: m, reason: collision with root package name */
    public final e0 f10485m;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f10486n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10487o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10488p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10489q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockOverviewSectionItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f10479g = i0.C(this.f9075c, new qg.a(this, 21));
        ?? liveData = new LiveData();
        this.f10480h = liveData;
        this.f10481i = liveData;
        ?? liveData2 = new LiveData();
        this.f10482j = liveData2;
        this.f10483k = liveData2;
        ?? liveData3 = new LiveData();
        this.f10484l = liveData3;
        this.f10485m = liveData3;
        ?? liveData4 = new LiveData();
        this.f10486n = liveData4;
        this.f10487o = liveData4;
        ?? liveData5 = new LiveData();
        this.f10488p = liveData5;
        this.f10489q = liveData5;
    }

    public final void e() {
        g gVar;
        k kVar;
        f fVar = (f) this.f9075c.getValue();
        if (fVar != null && (gVar = fVar.f42475d) != null && (kVar = gVar.f42484i) != null) {
            this.f10488p.postValue(new j(new AnalyticEvent("app_market_narration_tap", p0.f(new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, kVar.f42492a)))));
            this.f10480h.postValue(new j(kVar));
        }
    }
}
