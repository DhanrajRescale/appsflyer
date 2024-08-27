package com.assetgro.stockgro.ui.base;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a1;
import androidx.lifecycle.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/base/BaseBottomSheetViewModel;", "Landroidx/lifecycle/a1;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BaseBottomSheetViewModel extends a1 {

    /* renamed from: b, reason: collision with root package name */
    public final a f9066b;

    /* renamed from: c, reason: collision with root package name */
    public final ct.a f9067c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f9068d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f9069e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f9070f;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public BaseBottomSheetViewModel(a schedulerProvider, ct.a compositeDisposable) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9066b = schedulerProvider;
        this.f9067c = compositeDisposable;
        this.f9068d = new LiveData();
        this.f9069e = new LiveData();
        this.f9070f = new LiveData();
        new LiveData();
    }

    @Override // androidx.lifecycle.a1
    public final void d() {
        this.f9067c.a();
    }

    public void e() {
    }
}
