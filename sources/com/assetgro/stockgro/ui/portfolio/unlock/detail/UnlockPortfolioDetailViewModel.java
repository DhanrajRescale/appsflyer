package com.assetgro.stockgro.ui.portfolio.unlock.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import at.m;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ExpiryOption;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.b;
import nt.h;
import pj.a;
import qu.i0;
import vg.d;
import yg.c;
import yg.e;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/unlock/detail/UnlockPortfolioDetailViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UnlockPortfolioDetailViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9945n;

    /* renamed from: o, reason: collision with root package name */
    public final PaymentRepository f9946o;

    /* renamed from: p, reason: collision with root package name */
    public ExpiryOption f9947p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9948q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9949r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9950s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9951t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9952u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9953v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9954w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9955x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9956y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f9957z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public UnlockPortfolioDetailViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, PaymentRepository paymentRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9945n = portfolioRepository;
        this.f9946o = paymentRepository;
        this.f9948q = new LiveData();
        this.f9949r = new LiveData();
        ?? liveData = new LiveData();
        this.f9950s = liveData;
        ?? liveData2 = new LiveData();
        this.f9951t = liveData2;
        this.f9952u = new LiveData();
        ?? liveData3 = new LiveData();
        this.f9953v = liveData3;
        this.f9954w = new LiveData();
        this.f9956y = new LiveData();
        this.f9957z = i0.C(liveData, c.f41630e);
        Boolean bool = Boolean.FALSE;
        liveData2.postValue(bool);
        liveData3.postValue(bool);
    }

    public final void h() {
        m<BaseResponseDto<WalletBalanceResponseDto>> walletBalance = this.f9946o.getWalletBalance();
        d dVar = new d(2, new e(this, 0));
        walletBalance.getClass();
        h c10 = new b(new b(new b(walletBalance, dVar, 1), new d(3, new e(this, 1)), 2), new d(4, new e(this, 2)), 0).c(((kq.e) this.f9079b).J());
        jt.d dVar2 = new jt.d(new d(5, new e(this, 3)), new d(6, c.f41629d));
        c10.a(dVar2);
        Intrinsics.checkNotNullExpressionValue(dVar2, "subscribe(...)");
        this.f9080c.c(dVar2);
    }

    public final void i(ExpiryOption expiryOption, WalletBalanceResponseDto walletBalanceResponseDto) {
        if (expiryOption != null) {
            this.f9947p = expiryOption;
            e0 e0Var = this.f9948q;
            List<ExpiryOption> list = (List) e0Var.getValue();
            if (list != null) {
                for (ExpiryOption expiryOption2 : list) {
                    if (!Intrinsics.a(expiryOption2, expiryOption)) {
                        expiryOption2.setSelected(false);
                    }
                }
                e0Var.postValue(list);
            }
            if (walletBalanceResponseDto == null) {
                Object value = this.f9950s.getValue();
                Intrinsics.c(value);
                walletBalanceResponseDto = (WalletBalanceResponseDto) value;
            }
            double total = walletBalanceResponseDto.getTotal();
            double price = expiryOption.getPrice();
            e0 e0Var2 = this.f9954w;
            e0 e0Var3 = this.f9952u;
            if (total < price) {
                this.f9955x = true;
                e0Var3.postValue(Boolean.TRUE);
                e0Var2.postValue(Integer.valueOf(R.string.recharge_and_buy));
            } else {
                e0Var2.postValue(Integer.valueOf(R.string.buy_portfolio));
                e0Var3.postValue(Boolean.FALSE);
                this.f9955x = false;
            }
            e0 e0Var4 = this.f9951t;
            Boolean bool = Boolean.TRUE;
            e0Var4.postValue(bool);
            this.f9953v.postValue(bool);
        }
    }
}
