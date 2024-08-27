package com.assetgro.stockgro.ui.subscription;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.SubscriptionDowngradePromptResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/SubscriptionDowngradePromptViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SubscriptionDowngradePromptViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f10533n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10534o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10535p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10536q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10537r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10538s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10539t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10540u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10541v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f10542w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10543x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public SubscriptionDowngradePromptViewModel(PaymentRepository paymentRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        this.f10533n = paymentRepository;
        ?? liveData = new LiveData();
        this.f10534o = liveData;
        this.f10535p = liveData;
        ?? liveData2 = new LiveData();
        this.f10536q = liveData2;
        this.f10537r = liveData2;
        ?? liveData3 = new LiveData();
        this.f10538s = liveData3;
        this.f10539t = liveData3;
        ?? liveData4 = new LiveData();
        this.f10540u = liveData4;
        this.f10541v = liveData4;
        ?? liveData5 = new LiveData();
        this.f10542w = liveData5;
        this.f10543x = liveData5;
    }

    public static final void h(SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel, int i10, String str) {
        String str2;
        if (i10 == 0) {
            SubscriptionDowngradePromptResponse subscriptionDowngradePromptResponse = (SubscriptionDowngradePromptResponse) subscriptionDowngradePromptViewModel.f10534o.getValue();
            if (subscriptionDowngradePromptResponse == null || (str2 = subscriptionDowngradePromptResponse.getMessage()) == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (str2.length() > 0) {
                subscriptionDowngradePromptViewModel.f10542w.postValue(new j(str2));
                return;
            } else {
                subscriptionDowngradePromptViewModel.f10536q.setValue(new j(str));
                return;
            }
        }
        subscriptionDowngradePromptViewModel.f10538s.setValue(new j(str));
    }
}
