package com.assetgro.stockgro.ui.payments.kyc;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.data.model.KycFAQ;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import xf.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycFAQItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/KycFAQ;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycFAQItemViewModel extends BaseItemViewModel<KycFAQ> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f9665g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycFAQItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9665g = i0.C(this.f9075c, h.f40214c);
        this.f9666h = i0.C(this.f9075c, h.f40213b);
    }
}
