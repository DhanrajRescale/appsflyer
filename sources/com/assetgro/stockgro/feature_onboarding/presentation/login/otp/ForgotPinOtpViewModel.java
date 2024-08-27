package com.assetgro.stockgro.feature_onboarding.presentation.login.otp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import at.l;
import bb.g;
import bb.h;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ct.b;
import j5.d;
import java.util.concurrent.TimeUnit;
import jt.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mt.f;
import ni.j;
import okhttp3.HttpUrl;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/otp/ForgotPinOtpViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ForgotPinOtpViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final int f8737n;

    /* renamed from: o, reason: collision with root package name */
    public String f8738o;

    /* renamed from: p, reason: collision with root package name */
    public String f8739p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8740q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8741r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8742s;

    /* renamed from: t, reason: collision with root package name */
    public b f8743t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ForgotPinOtpViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8737n = 60;
        this.f8738o = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f8739p = HttpUrl.FRAGMENT_ENCODE_SET;
        ?? liveData = new LiveData();
        this.f8740q = liveData;
        this.f8741r = new LiveData();
        this.f8742s = new LiveData();
        new LiveData();
        liveData.setValue(Unit.f23355a);
        this.f8743t = h();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final e h() {
        f fVar = new f(at.e.h(at.e.d(this.f8737n + 1), at.e.a(1L, TimeUnit.SECONDS), new d(10)), new za.e(3, new g(this, 0)), 1);
        ((kq.e) this.f9079b).getClass();
        l lVar = st.e.f34774b;
        Intrinsics.checkNotNullExpressionValue(lVar, "computation(...)");
        f g10 = fVar.g(lVar);
        e eVar = new e(new za.e(4, new g(this, 1)), gt.e.f17572d);
        g10.e(eVar);
        Intrinsics.checkNotNullExpressionValue(eVar, "subscribe(...)");
        return eVar;
    }

    public final void i(String otp) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            this.f9084g.setValue(Boolean.TRUE);
            yk.g.H(u0.f(this), null, null, new h(this, otp, null), 3);
        }
    }
}
