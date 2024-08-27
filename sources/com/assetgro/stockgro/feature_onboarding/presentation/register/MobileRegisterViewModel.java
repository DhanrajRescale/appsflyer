package com.assetgro.stockgro.feature_onboarding.presentation.register;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import eb.i;
import eb.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import pj.a;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/register/MobileRegisterViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MobileRegisterViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final e0 f8761n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8762o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8763p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8764q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8765r;

    /* renamed from: s, reason: collision with root package name */
    public String f8766s;

    /* renamed from: t, reason: collision with root package name */
    public String f8767t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8768u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8769v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MobileRegisterViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8761n = new LiveData();
        this.f8762o = new LiveData();
        this.f8763p = new LiveData();
        this.f8764q = new LiveData();
        this.f8765r = new LiveData();
        ?? liveData = new LiveData();
        this.f8768u = liveData;
        String invitationCode = userRepository.getInvitationCode();
        if (invitationCode != null) {
            liveData.postValue(invitationCode);
        }
    }

    public static final void h(MobileRegisterViewModel mobileRegisterViewModel, String str, String str2) {
        mobileRegisterViewModel.getClass();
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            mobileRegisterViewModel.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            g.H(u0.f(mobileRegisterViewModel), null, null, new k(mobileRegisterViewModel, str, str2, null), 3);
        }
    }

    public static void i(MobileRegisterViewModel mobileRegisterViewModel, String str) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            mobileRegisterViewModel.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            mobileRegisterViewModel.f9084g.postValue(Boolean.TRUE);
            g.H(u0.f(mobileRegisterViewModel), null, null, new i(mobileRegisterViewModel, str, "sms", null), 3);
        }
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
