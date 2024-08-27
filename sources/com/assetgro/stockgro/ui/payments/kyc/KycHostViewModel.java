package com.assetgro.stockgro.ui.payments.kyc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycHostViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycHostViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f9676n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9677o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9678p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9679q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9680r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9681s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9682t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9683u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9684v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public KycHostViewModel(PaymentRepository paymentRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        this.f9676n = paymentRepository;
        this.f9677o = new LiveData();
        this.f9678p = new LiveData();
        this.f9679q = new LiveData();
        this.f9680r = new LiveData();
        this.f9681s = new LiveData();
        ?? liveData = new LiveData();
        this.f9682t = liveData;
        this.f9683u = liveData;
        ?? liveData2 = new LiveData();
        this.f9684v = liveData2;
        this.f9685w = liveData2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        r4.f9681s.postValue(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r4.f9677o.postValue(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0.equals("pending") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r0.equals("invalid") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r5.isKycInMaintenance(), java.lang.Boolean.TRUE) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.assetgro.stockgro.data.model.KycResponseDto r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L69
            java.lang.String r0 = r5.getStatus()
            if (r0 == 0) goto L66
            int r1 = r0.hashCode()
            switch(r1) {
                case -934710369: goto L58;
                case -753541113: goto L49;
                case -682587753: goto L28;
                case -599445191: goto L19;
                case 1959784951: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L66
        L10:
            java.lang.String r1 = "invalid"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto L66
        L19:
            java.lang.String r1 = "complete"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L66
        L22:
            androidx.lifecycle.e0 r0 = r4.f9678p
            r0.postValue(r5)
            goto L66
        L28:
            java.lang.String r1 = "pending"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto L66
        L31:
            java.lang.Boolean r0 = r5.isKycInMaintenance()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            if (r0 == 0) goto L43
            androidx.lifecycle.e0 r0 = r4.f9681s
            r0.postValue(r5)
            goto L66
        L43:
            androidx.lifecycle.e0 r0 = r4.f9677o
            r0.postValue(r5)
            goto L66
        L49:
            java.lang.String r1 = "in_progress"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto L66
        L52:
            androidx.lifecycle.e0 r0 = r4.f9679q
            r0.postValue(r5)
            goto L66
        L58:
            java.lang.String r1 = "reject"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L61
            goto L66
        L61:
            androidx.lifecycle.e0 r0 = r4.f9680r
            r0.postValue(r5)
        L66:
            kotlin.Unit r5 = kotlin.Unit.f23355a
            goto L6a
        L69:
            r5 = 0
        L6a:
            if (r5 != 0) goto Lac
            androidx.lifecycle.e0 r5 = r4.f9084g
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.postValue(r0)
            com.assetgro.stockgro.data.repository.PaymentRepository r5 = r4.f9676n
            at.m r5 = r5.getKyc()
            pj.a r0 = r4.f9079b
            kq.e r0 = (kq.e) r0
            at.l r0 = r0.J()
            nt.h r5 = r5.c(r0)
            xf.l r0 = new xf.l
            r1 = 0
            r0.<init>(r4, r1)
            vf.d r1 = new vf.d
            r2 = 18
            r1.<init>(r2, r0)
            xf.l r0 = new xf.l
            r2 = 1
            r0.<init>(r4, r2)
            vf.d r2 = new vf.d
            r3 = 19
            r2.<init>(r3, r0)
            jt.d r0 = new jt.d
            r0.<init>(r1, r2)
            r5.a(r0)
            ct.a r5 = r4.f9080c
            r5.c(r0)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.payments.kyc.KycHostViewModel.h(com.assetgro.stockgro.data.model.KycResponseDto):void");
    }
}
