package com.assetgro.stockgro.ui.redemption.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import at.m;
import com.assetgro.stockgro.data.model.RedeemedOffers;
import com.assetgro.stockgro.data.model.RedemptionOffer;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import java.util.ArrayList;
import jr.h;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nh.k;
import oh.b;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/redemption/home/RedemptionHostViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RedemptionHostViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final d0 C;
    public final d0 D;
    public final d0 E;
    public final d0 F;
    public final d0 G;
    public final d0 H;
    public final d0 I;
    public final d0 J;
    public final d0 K;
    public final d0 L;
    public final d0 M;
    public final d0 N;
    public final d0 O;
    public final d0 P;
    public final d0 Q;

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f10081n;

    /* renamed from: o, reason: collision with root package name */
    public String f10082o;

    /* renamed from: p, reason: collision with root package name */
    public Float f10083p;

    /* renamed from: q, reason: collision with root package name */
    public String f10084q;

    /* renamed from: r, reason: collision with root package name */
    public String f10085r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10086s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10087t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10088u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10089v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f10090w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10091x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10092y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10093z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public RedemptionHostViewModel(PaymentRepository paymentRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f10081n = paymentRepository;
        this.f10084q = "Redemption Failed";
        this.f10085r = "FAILED";
        ?? liveData = new LiveData();
        this.f10086s = liveData;
        this.f10087t = new LiveData();
        this.f10088u = new LiveData();
        this.f10089v = new LiveData();
        this.f10090w = h.i();
        this.f10091x = new LiveData();
        this.f10092y = new LiveData();
        this.f10093z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = i0.C(liveData, oh.a.f30088q);
        this.D = i0.C(liveData, oh.a.f30073b);
        this.E = i0.C(liveData, oh.a.f30082k);
        this.F = i0.C(liveData, oh.a.f30081j);
        this.G = i0.C(liveData, oh.a.f30080i);
        this.H = i0.C(liveData, oh.a.f30090s);
        this.I = i0.C(liveData, oh.a.f30089r);
        this.J = i0.C(liveData, oh.a.f30074c);
        this.K = i0.C(liveData, oh.a.f30086o);
        this.L = i0.C(liveData, oh.a.f30085n);
        this.M = i0.C(liveData, new b(this, 12));
        this.N = i0.C(liveData, oh.a.f30084m);
        this.O = i0.C(liveData, oh.a.f30087p);
        this.P = i0.C(liveData, oh.a.f30078g);
        this.Q = i0.C(liveData, oh.a.f30079h);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(String coupnId) {
        Intrinsics.checkNotNullParameter(coupnId, "coupnId");
        m<BaseResponseDto<RedemptionOffer>> couponDetails = this.f10081n.getCouponDetails(coupnId);
        k kVar = new k(12, new b(this, 0));
        couponDetails.getClass();
        nt.h c10 = new nt.b(new nt.b(new nt.b(couponDetails, kVar, 1), new k(13, new b(this, 1)), 2), new k(14, new b(this, 2)), 0).c(((e) this.f9079b).J());
        d dVar = new d(new k(15, new b(this, 3)), new k(16, oh.a.f30075d));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        this.f9080c.c(dVar);
    }

    public final void i() {
        m<BaseResponseDto<ArrayList<RedemptionOffer>>> coupons = this.f10081n.getCoupons();
        k kVar = new k(22, new b(this, 4));
        coupons.getClass();
        nt.h c10 = new nt.b(new nt.b(new nt.b(coupons, kVar, 1), new k(23, new b(this, 5)), 2), new k(24, new b(this, 6)), 0).c(((e) this.f9079b).J());
        d dVar = new d(new k(25, new b(this, 7)), new k(26, oh.a.f30076e));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        this.f9080c.c(dVar);
    }

    public final void j() {
        m<BaseResponseDto<ArrayList<RedeemedOffers>>> redeemed = this.f10081n.getRedeemed();
        k kVar = new k(17, new b(this, 8));
        redeemed.getClass();
        nt.h c10 = new nt.b(new nt.b(new nt.b(redeemed, kVar, 1), new k(18, new b(this, 9)), 2), new k(19, new b(this, 10)), 0).c(((e) this.f9079b).J());
        d dVar = new d(new k(20, new b(this, 11)), new k(21, oh.a.f30077f));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        this.f9080c.c(dVar);
    }

    public final void k(String couponId) {
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        m<BaseResponseDto<Object>> purchaseCoupon = this.f10081n.purchaseCoupon(couponId);
        k kVar = new k(7, new b(this, 13));
        purchaseCoupon.getClass();
        nt.h c10 = new nt.b(new nt.b(new nt.b(purchaseCoupon, kVar, 1), new k(8, new b(this, 14)), 2), new k(9, new b(this, 15)), 0).c(((e) this.f9079b).J());
        d dVar = new d(new k(10, new b(this, 16)), new k(11, oh.a.f30083l));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        this.f9080c.c(dVar);
    }
}
