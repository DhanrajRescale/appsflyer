package com.assetgro.stockgro.ui.payments.recharge;

import ag.g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jr.h;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import mt.p;
import okhttp3.HttpUrl;
import pj.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/recharge/RechargeWalletViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RechargeWalletViewModel extends BaseViewModel {
    public boolean A;
    public final e0 B;
    public boolean C;
    public String D;
    public final e0 E;
    public final e0 F;

    /* renamed from: n, reason: collision with root package name */
    public final p f9707n;

    /* renamed from: o, reason: collision with root package name */
    public final PaymentRepository f9708o;

    /* renamed from: p, reason: collision with root package name */
    public String f9709p;

    /* renamed from: q, reason: collision with root package name */
    public String f9710q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9711r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9712s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9713t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9714u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9715v;

    /* renamed from: w, reason: collision with root package name */
    public String f9716w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9717x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9718y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9719z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public RechargeWalletViewModel(a schedulerProvider, ct.a compositeDisposable, p validator, PaymentRepository paymentRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9707n = validator;
        this.f9708o = paymentRepository;
        this.f9709p = "Recharge Failed";
        this.f9710q = "TXN_FAILED";
        this.f9712s = new LiveData();
        this.f9713t = new LiveData();
        this.f9714u = new LiveData();
        this.f9715v = new LiveData();
        new LiveData();
        this.f9716w = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9717x = h.i();
        this.f9718y = new LiveData();
        this.f9719z = new LiveData();
        this.B = new LiveData();
        this.E = new LiveData();
        this.F = new LiveData();
        nt.h c10 = paymentRepository.getConfig().c(((e) this.f9079b).J());
        d dVar = new d(new vf.d(26, new g(this, 0)), new vf.d(27, ag.h.f417b));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }
}
