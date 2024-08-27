package com.assetgro.stockgro.ui.base;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a1;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "Landroidx/lifecycle/a1;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BaseViewModel extends a1 {

    /* renamed from: b, reason: collision with root package name */
    public final a f9079b;

    /* renamed from: c, reason: collision with root package name */
    public final ct.a f9080c;

    /* renamed from: d, reason: collision with root package name */
    public final UserRepository f9081d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f9082e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f9083f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f9084g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f9085h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f9086i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f9087j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f9088k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f9089l;

    /* renamed from: m, reason: collision with root package name */
    public final e0 f9090m;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public BaseViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9079b = schedulerProvider;
        this.f9080c = compositeDisposable;
        this.f9081d = userRepository;
        this.f9082e = new LiveData();
        this.f9083f = new LiveData();
        this.f9084g = new LiveData();
        this.f9085h = new LiveData();
        this.f9086i = new LiveData();
        this.f9087j = new LiveData();
        this.f9088k = new LiveData();
        this.f9089l = new LiveData();
        this.f9090m = new LiveData();
    }

    @Override // androidx.lifecycle.a1
    public void d() {
        this.f9080c.a();
    }

    public void e() {
    }

    public final void f(String str) {
        if (str != null) {
            this.f9085h.postValue(str);
        }
    }

    public final void g() {
        this.f9082e.postValue(j.i(Integer.valueOf(R.string.no_internet_connection)));
    }
}
