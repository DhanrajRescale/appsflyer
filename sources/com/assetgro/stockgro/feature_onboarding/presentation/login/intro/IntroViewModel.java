package com.assetgro.stockgro.feature_onboarding.presentation.login.intro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jt.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/intro/IntroViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class IntroViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public e f8716n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8717o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8718p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8719q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8720r;

    /* renamed from: s, reason: collision with root package name */
    public int f8721s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8722t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public IntroViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8717o = new LiveData();
        this.f8718p = new LiveData();
        this.f8719q = new LiveData();
        this.f8720r = 4;
        this.f8721s = -1;
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
