package com.assetgro.stockgro.ui.base;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a1;
import androidx.lifecycle.e0;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/base/BaseDialogViewModel;", "Landroidx/lifecycle/a1;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BaseDialogViewModel extends a1 {

    /* renamed from: b, reason: collision with root package name */
    public final a f9071b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f9072c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f9073d;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public BaseDialogViewModel(pj.a schedulerProvider, a compositeDisposable) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9071b = compositeDisposable;
        this.f9072c = new LiveData();
        this.f9073d = new LiveData();
        new LiveData();
        new LiveData();
    }

    @Override // androidx.lifecycle.a1
    public final void d() {
        this.f9071b.a();
    }
}
