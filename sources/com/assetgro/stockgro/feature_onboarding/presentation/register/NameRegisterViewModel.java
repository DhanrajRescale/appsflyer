package com.assetgro.stockgro.feature_onboarding.presentation.register;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jj.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/register/NameRegisterViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NameRegisterViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final a f8773n;

    /* renamed from: o, reason: collision with root package name */
    public String f8774o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8775p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8776q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8777r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public NameRegisterViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, a appsFlyerAnalyticsEngineImpl) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        this.f8773n = appsFlyerAnalyticsEngineImpl;
        this.f8774o = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f8775p = new LiveData();
        this.f8776q = new LiveData();
        this.f8777r = new LiveData();
    }
}
