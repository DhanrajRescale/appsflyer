package com.assetgro.stockgro.ui.payments.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import at.m;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jr.h;
import jt.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import mt.p;
import nt.b;
import okhttp3.HttpUrl;
import qf.a;
import qu.r0;
import wf.f;
import wf.i;
import wf.j;
import wf.k;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/home/WalletHomeViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "kq/e", "wf/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WalletHomeViewModel extends BaseViewModel {
    public KycResponseDto A;
    public boolean B;
    public boolean C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public final e0 G;
    public final e0 H;
    public final e0 I;
    public final e0 J;

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f9648n;

    /* renamed from: o, reason: collision with root package name */
    public final a f9649o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9650p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9651q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9652r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9653s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9654t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9655u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9656v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9657w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9658x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9659y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9660z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public WalletHomeViewModel(pj.a schedulerProvider, ct.a compositeDisposable, p validator, PaymentRepository paymentRepository, UserRepository userRepository, a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f9648n = paymentRepository;
        this.f9649o = maintenanceConfigManager;
        this.f9650p = h.i();
        this.f9651q = new LiveData();
        this.f9652r = new LiveData();
        this.f9653s = new LiveData();
        this.f9654t = new LiveData();
        this.f9655u = new LiveData();
        this.f9656v = new LiveData();
        this.f9657w = new LiveData();
        this.f9658x = new LiveData();
        this.f9659y = new LiveData();
        this.f9660z = new LiveData();
        this.B = true;
        this.D = new LiveData(Boolean.valueOf(kj.a.f23207b));
        this.E = new LiveData();
        this.F = new LiveData();
        ?? liveData = new LiveData();
        this.G = liveData;
        this.H = liveData;
        ?? liveData2 = new LiveData();
        this.I = liveData2;
        this.J = liveData2;
        g.H(u0.f(this), r0.f32256b, null, new wf.h(this, null), 2);
        nt.h c10 = this.f9081d.myLifetimeEarning().c(((e) this.f9079b).J());
        d dVar = new d(new vf.d(14, new f(this, 4)), new vf.d(15, i.f39056b));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        this.f9080c.c(dVar);
        g.H(u0.f(this), null, null, new j(this, null), 3);
        g.H(u0.f(this), null, null, new wf.g(this, null), 3);
        g.H(u0.f(this), null, null, new k(this, null), 3);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h() {
        if (kj.a.f23207b) {
            return;
        }
        this.f9653s.postValue(Boolean.TRUE);
        nt.h c10 = this.f9648n.getKyc().c(((e) this.f9079b).J());
        d dVar = new d(new vf.d(10, new f(this, 2)), new vf.d(11, new f(this, 3)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void i() {
        String status;
        String captureLink;
        String captureLink2;
        KycResponseDto kycResponseDto = this.A;
        if (kycResponseDto != null && (status = kycResponseDto.getStatus()) != null) {
            int hashCode = status.hashCode();
            e0 e0Var = this.f9658x;
            switch (hashCode) {
                case -934710369:
                    if (status.equals("reject")) {
                        e0Var.postValue(kycResponseDto);
                        return;
                    }
                    return;
                case -753541113:
                    if (status.equals("in_progress") && (captureLink = kycResponseDto.getCaptureLink()) != null && captureLink.length() > 0) {
                        e0Var.postValue(kycResponseDto);
                        return;
                    }
                    return;
                case -682587753:
                    if (status.equals("pending") && (captureLink2 = kycResponseDto.getCaptureLink()) != null && captureLink2.length() > 0) {
                        e0Var.postValue(kycResponseDto);
                        return;
                    }
                    return;
                case -599445191:
                    if (status.equals("complete")) {
                        e0Var.postValue(kycResponseDto);
                        return;
                    }
                    return;
                case 1959784951:
                    if (status.equals("invalid")) {
                        Boolean isKycInMaintenance = kycResponseDto.isKycInMaintenance();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.a(isKycInMaintenance, bool)) {
                            e0Var.postValue(kycResponseDto);
                            return;
                        }
                        this.f9653s.postValue(bool);
                        nt.h c10 = this.f9648n.createKyc().c(((e) this.f9079b).J());
                        d dVar = new d(new vf.d(12, new f(this, 0)), new vf.d(13, new f(this, 1)));
                        c10.a(dVar);
                        this.f9080c.c(dVar);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void j() {
        m<BaseResponseDto<WalletBalanceResponseDto>> walletBalance = this.f9648n.getWalletBalance();
        vf.d dVar = new vf.d(5, new f(this, 5));
        walletBalance.getClass();
        nt.h c10 = new b(new b(new b(walletBalance, dVar, 1), new vf.d(6, new f(this, 6)), 2), new vf.d(7, new f(this, 7)), 0).c(((e) this.f9079b).J());
        d dVar2 = new d(new vf.d(8, new f(this, 8)), new vf.d(9, i.f39057c));
        c10.a(dVar2);
        Intrinsics.checkNotNullExpressionValue(dVar2, "subscribe(...)");
        this.f9080c.c(dVar2);
    }

    public final void k(wf.e type) {
        String description;
        Intrinsics.checkNotNullParameter(type, "type");
        WalletBalanceResponseDto walletBalanceResponseDto = (WalletBalanceResponseDto) this.f9654t.getValue();
        if (walletBalanceResponseDto != null) {
            e0 e0Var = this.G;
            int ordinal = type.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            Pair pair = (Pair) this.f9655u.getValue();
                            if (pair == null || (description = (String) pair.f23354b) == null) {
                                description = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        description = walletBalanceResponseDto.getBonus().getNarration().getDescription();
                    }
                } else {
                    description = walletBalanceResponseDto.getCash().getNarration().getDescription();
                }
            } else {
                description = walletBalanceResponseDto.getDeposit().getNarration().getDescription();
            }
            e0Var.setValue(new kj.j(description));
        }
    }
}
