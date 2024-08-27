package com.assetgro.stockgro.ui.stock.modify.common;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qi.d;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/common/ModifyOrderPaymentSuccessfulViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyOrderPaymentSuccessfulViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final e0 f10302n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10303o;

    /* renamed from: p, reason: collision with root package name */
    public final d0 f10304p;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f10305q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f10306r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f10307s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ModifyOrderPaymentSuccessfulViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ?? liveData = new LiveData();
        this.f10302n = liveData;
        this.f10303o = new LiveData();
        this.f10304p = i0.C(liveData, d.f31973d);
        this.f10305q = i0.C(liveData, d.f31974e);
        this.f10306r = i0.C(liveData, d.f31972c);
        this.f10307s = i0.C(liveData, d.f31971b);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
