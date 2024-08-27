package com.assetgro.stockgro.ui.payments.kyc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycVerificationRejectedViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycVerificationRejectedViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f9699n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9700o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9701p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9702q;

    /* renamed from: r, reason: collision with root package name */
    public KycResponseDto f9703r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public KycVerificationRejectedViewModel(PaymentRepository paymentRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        this.f9699n = paymentRepository;
        this.f9700o = new LiveData();
        this.f9701p = new LiveData();
        this.f9702q = new LiveData();
    }
}
