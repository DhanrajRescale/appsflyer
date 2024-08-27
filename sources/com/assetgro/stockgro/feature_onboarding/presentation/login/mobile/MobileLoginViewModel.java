package com.assetgro.stockgro.feature_onboarding.presentation.login.mobile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import at.m;
import c2.e1;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import d2.y0;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ni.j;
import nt.h;
import okhttp3.HttpUrl;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/mobile/MobileLoginViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MobileLoginViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final e0 f8728n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8729o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8730p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8731q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8732r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MobileLoginViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8728n = new LiveData();
        this.f8729o = new LiveData();
        this.f8730p = new LiveData();
        this.f8731q = new LiveData();
    }

    public static final void h(MobileLoginViewModel mobileLoginViewModel, String str, String str2) {
        mobileLoginViewModel.getClass();
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            mobileLoginViewModel.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        mobileLoginViewModel.f9084g.postValue(Boolean.TRUE);
        m<BaseResponseDto<Object>> userStatus = mobileLoginViewModel.f9081d.getUserStatus(HttpUrl.FRAGMENT_ENCODE_SET, str, str2);
        e eVar = (e) mobileLoginViewModel.f9079b;
        h hVar = new h(userStatus.c(eVar.J()), eVar.Q(), 0);
        d dVar = new d(new za.e(1, new y0(19, mobileLoginViewModel, str)), new za.e(2, new e1(mobileLoginViewModel, 27)));
        hVar.a(dVar);
        mobileLoginViewModel.f9080c.c(dVar);
    }
}
