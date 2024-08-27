package com.assetgro.stockgro.feature_onboarding.presentation.register;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import at.l;
import c2.e1;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import eb.v;
import j5.d;
import java.util.concurrent.TimeUnit;
import jt.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l1.i;
import mt.f;
import ni.j;
import okhttp3.HttpUrl;
import pj.a;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/register/RegistrationOtpVerificationViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RegistrationOtpVerificationViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public int f8782n;

    /* renamed from: o, reason: collision with root package name */
    public String f8783o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8784p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8785q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8786r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public RegistrationOtpVerificationViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8782n = 60;
        this.f8783o = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f8784p = new LiveData();
        this.f8785q = new LiveData();
        ?? liveData = new LiveData();
        this.f8786r = liveData;
        new LiveData();
        liveData.setValue(Unit.f23355a);
    }

    public final e h(int i10) {
        f fVar = new f(at.e.h(at.e.d(i10 + 1), at.e.a(1L, TimeUnit.SECONDS), new d(11)), new za.e(5, new i(i10, 3)), 1);
        ((kq.e) this.f9079b).getClass();
        l lVar = st.e.f34774b;
        Intrinsics.checkNotNullExpressionValue(lVar, "computation(...)");
        f g10 = fVar.g(lVar);
        e eVar = new e(new za.e(6, new e1(this, 28)), gt.e.f17572d);
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
            g.H(u0.f(this), null, null, new v(this, otp, null), 3);
        }
    }
}
