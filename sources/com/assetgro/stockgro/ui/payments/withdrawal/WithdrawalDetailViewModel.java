package com.assetgro.stockgro.ui.payments.withdrawal;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import at.m;
import at.o;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ConfigDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fg.g;
import j5.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import lt.i;
import mt.p;
import ni.j;
import nt.h;
import okhttp3.HttpUrl;
import pj.a;
import ub.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/withdrawal/WithdrawalDetailViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"CheckResult"})
/* loaded from: classes.dex */
public final class WithdrawalDetailViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public final e0 G;

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f9758n;

    /* renamed from: o, reason: collision with root package name */
    public final p f9759o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9760p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9761q;

    /* renamed from: r, reason: collision with root package name */
    public String f9762r;

    /* renamed from: s, reason: collision with root package name */
    public String f9763s;

    /* renamed from: t, reason: collision with root package name */
    public String f9764t;

    /* renamed from: u, reason: collision with root package name */
    public String f9765u;

    /* renamed from: v, reason: collision with root package name */
    public String f9766v;

    /* renamed from: w, reason: collision with root package name */
    public String f9767w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9768x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9769y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9770z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public WithdrawalDetailViewModel(a schedulerProvider, ct.a compositeDisposable, PaymentRepository paymentRepository, UserRepository userRepository, p validator) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f9758n = paymentRepository;
        this.f9759o = validator;
        this.f9084g.postValue(Boolean.FALSE);
        m<BaseResponseDto<WalletBalanceResponseDto>> walletBalance = paymentRepository.getWalletBalance();
        m<BaseResponseDto<ConfigDto>> config = paymentRepository.getConfig();
        d dVar = new d(14);
        if (walletBalance != null) {
            if (config != null) {
                e eVar = (e) schedulerProvider;
                new h(new i(3, new o[]{walletBalance, config}, new ll.o(dVar, 20)).c(eVar.J()), eVar.Q(), 0).a(new jt.d(new g(4, new f(this, 26)), new g(5, fg.o.f16090a)));
                new LiveData();
                this.f9760p = new LiveData(Boolean.TRUE);
                this.f9761q = new LiveData();
                this.f9762r = HttpUrl.FRAGMENT_ENCODE_SET;
                this.f9763s = HttpUrl.FRAGMENT_ENCODE_SET;
                this.f9764t = HttpUrl.FRAGMENT_ENCODE_SET;
                this.f9765u = HttpUrl.FRAGMENT_ENCODE_SET;
                this.f9766v = HttpUrl.FRAGMENT_ENCODE_SET;
                this.f9767w = "TRANSFER_TO_BANK";
                this.f9768x = new LiveData();
                this.f9769y = new LiveData();
                this.f9770z = new LiveData();
                this.A = new LiveData();
                this.B = new LiveData();
                ?? liveData = new LiveData();
                this.C = liveData;
                this.D = liveData;
                ?? liveData2 = new LiveData();
                this.E = liveData2;
                this.F = liveData2;
                this.G = new LiveData();
                return;
            }
            throw new NullPointerException("source2 is null");
        }
        throw new NullPointerException("source1 is null");
    }

    public final void h(double d10, String str, String str2, String str3) {
        e0 e0Var = this.f9084g;
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        try {
            e0Var.postValue(Boolean.TRUE);
            yk.g.H(u0.f(this), null, null, new fg.p(d10, str, str2, str3, this, null), 3);
        } catch (Exception unused) {
            e0Var.postValue(Boolean.FALSE);
            this.C.postValue(new kj.j(new Pair("Not connected to internet", Boolean.TRUE)));
        }
    }
}
