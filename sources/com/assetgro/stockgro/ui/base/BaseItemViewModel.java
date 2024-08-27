package com.assetgro.stockgro.ui.base;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a1;
import androidx.lifecycle.e0;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", HttpUrl.FRAGMENT_ENCODE_SET, "T", "Landroidx/lifecycle/a1;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BaseItemViewModel<T> extends a1 {

    /* renamed from: b, reason: collision with root package name */
    public final a f9074b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f9075c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9076d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f9077e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f9078f;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public BaseItemViewModel(pj.a schedulerProvider, a compositeDisposable) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9074b = compositeDisposable;
        this.f9075c = new LiveData();
        this.f9077e = new LiveData();
        this.f9078f = new LiveData();
        new LiveData();
        new LiveData();
    }

    @Override // androidx.lifecycle.a1
    public final void d() {
        this.f9074b.a();
    }
}
