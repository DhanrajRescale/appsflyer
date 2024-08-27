package com.assetgro.stockgro.ui.payments.filter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/filter/PinRetryBottomSheetViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseBottomSheetViewModel;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinRetryBottomSheetViewModel extends BaseBottomSheetViewModel {

    /* renamed from: g, reason: collision with root package name */
    public final PaymentRepository f9636g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f9637h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PinRetryBottomSheetViewModel(a schedulerProvider, ct.a compositeDisposable, PaymentRepository paymentRepository) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        this.f9636g = paymentRepository;
        this.f9637h = new LiveData();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel
    public final void e() {
    }
}
