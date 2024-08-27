package com.assetgro.stockgro.ui.stock.v2.presentation.chart;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/presentation/chart/StockChartViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockChartViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public final e0 G;
    public final HashMap H;
    public final HashMap I;
    public final e0 J;
    public boolean K;
    public boolean L;

    /* renamed from: n, reason: collision with root package name */
    public final StockRepository f10459n;

    /* renamed from: o, reason: collision with root package name */
    public final String f10460o;

    /* renamed from: p, reason: collision with root package name */
    public String f10461p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10462q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10463r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10464s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10465t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10466u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10467v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f10468w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10469x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10470y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10471z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockChartViewModel(StockRepository stockRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10459n = stockRepository;
        this.f10460o = a3.a.d("toString(...)");
        this.f10462q = new LiveData();
        ?? liveData = new LiveData();
        this.f10463r = liveData;
        this.f10464s = liveData;
        ?? liveData2 = new LiveData();
        this.f10465t = liveData2;
        this.f10466u = liveData2;
        ?? liveData3 = new LiveData();
        this.f10467v = liveData3;
        this.f10468w = liveData3;
        ?? liveData4 = new LiveData();
        this.f10469x = liveData4;
        this.f10470y = liveData4;
        ?? liveData5 = new LiveData();
        this.f10471z = liveData5;
        this.A = liveData5;
        ?? liveData6 = new LiveData();
        this.B = liveData6;
        this.C = liveData6;
        ?? liveData7 = new LiveData();
        this.D = liveData7;
        this.E = liveData7;
        ?? liveData8 = new LiveData();
        this.F = liveData8;
        this.G = liveData8;
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = new LiveData(Boolean.valueOf(kj.a.f23207b));
        this.K = true;
        this.L = true;
    }

    public final String h() {
        String str = this.f10461p;
        if (str != null) {
            return str;
        }
        Intrinsics.k("stockId");
        throw null;
    }
}
