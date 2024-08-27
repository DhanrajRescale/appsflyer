package com.assetgro.stockgro.ui.payments.transactions.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import dg.d;
import e.l;
import eg.b;
import g7.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import tu.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/transactions/list/WalletTransactionListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WalletTransactionListViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f9728n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9729o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9730p;

    /* renamed from: q, reason: collision with root package name */
    public String f9731q;

    /* renamed from: r, reason: collision with root package name */
    public d f9732r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9733s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9734t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [dg.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public WalletTransactionListViewModel(PaymentRepository paymentRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9728n = paymentRepository;
        ?? liveData = new LiveData(new b(Boolean.FALSE, null));
        this.f9729o = liveData;
        this.f9730p = liveData;
        this.f9732r = new Object();
        ?? liveData2 = new LiveData();
        this.f9733s = liveData2;
        this.f9734t = liveData2;
    }

    public final void h() {
        this.f9733s.setValue((f) new l(new b3(10, 0, 0, 58), new ag.b(this, 3)).f14641b);
    }
}
