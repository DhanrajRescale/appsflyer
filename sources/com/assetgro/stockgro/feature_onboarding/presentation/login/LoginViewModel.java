package com.assetgro.stockgro.feature_onboarding.presentation.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ni.j;
import okhttp3.HttpUrl;
import qf.a;
import qu.r0;
import xa.c;
import xa.d;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/LoginViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LoginViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final a f8702n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8703o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8704p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8705q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8706r;

    /* renamed from: s, reason: collision with root package name */
    public String f8707s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8708t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8709u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f8710v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public LoginViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f8702n = maintenanceConfigManager;
        this.f8703o = new LiveData();
        this.f8704p = new LiveData();
        this.f8705q = new LiveData();
        this.f8706r = new LiveData();
        this.f8707s = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f8708t = new LiveData();
        ?? liveData = new LiveData();
        this.f8709u = liveData;
        this.f8710v = liveData;
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            try {
                g.H(u0.f(this), null, null, new c(this, null), 3);
            } catch (Exception e10) {
                this.f8709u.postValue(kj.a.f23209d);
                this.f9084g.postValue(Boolean.FALSE);
                e10.printStackTrace();
            }
        }
        String invitationCode = userRepository.getInvitationCode();
        if ((invitationCode != null && invitationCode.length() != 0) || userRepository.isDeferredDeepLink()) {
            this.f8703o.postValue(new kj.j(Unit.f23355a));
        }
        g.H(u0.f(this), r0.f32256b, null, new d(this, null), 2);
    }

    public final boolean h() {
        List list = (List) this.f8710v.getValue();
        if (list == null || list.size() <= 1) {
            return false;
        }
        return true;
    }
}
