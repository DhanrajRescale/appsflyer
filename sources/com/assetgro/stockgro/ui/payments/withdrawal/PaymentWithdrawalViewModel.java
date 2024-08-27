package com.assetgro.stockgro.ui.payments.withdrawal;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fg.g;
import fg.l;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/withdrawal/PaymentWithdrawalViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"CheckResult"})
/* loaded from: classes.dex */
public final class PaymentWithdrawalViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final e0 f9755n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9756o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PaymentWithdrawalViewModel(PaymentRepository paymentRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        ?? liveData = new LiveData();
        this.f9755n = liveData;
        this.f9756o = liveData;
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = paymentRepository.getConfig().c(((e) this.f9079b).J());
        d dVar = new d(new g(2, new l(this, 0)), new g(3, new l(this, 1)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
