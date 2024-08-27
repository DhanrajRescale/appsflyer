package com.assetgro.stockgro.ui.helpcenter;

import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.FileMetaData;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ff.c;
import ge.q;
import java.util.ArrayList;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import pj.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/helpcenter/StockGroHelpViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockGroHelpViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f9534n;

    /* renamed from: o, reason: collision with root package name */
    public int f9535o;

    /* renamed from: p, reason: collision with root package name */
    public int f9536p;

    /* renamed from: q, reason: collision with root package name */
    public int f9537q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f9538r;

    /* renamed from: s, reason: collision with root package name */
    public String f9539s;

    /* renamed from: t, reason: collision with root package name */
    public String f9540t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f9541u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9542v;

    /* renamed from: w, reason: collision with root package name */
    public KycResponseDto f9543w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9544x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockGroHelpViewModel(PaymentRepository paymentRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        this.f9534n = paymentRepository;
        this.f9538r = new ArrayList();
        this.f9541u = new ArrayList();
        this.f9542v = new LiveData();
        this.f9544x = new LiveData();
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = paymentRepository.getKyc().c(((e) this.f9079b).J());
        d dVar = new d(new q(24, new c(this, 0)), new q(25, new c(this, 1)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void h(String fileName, Uri uri, String str, int i10) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (uri != null) {
            this.f9538r.add(new FileMetaData(uri.toString(), fileName, str, Integer.valueOf(i10)));
            int i11 = this.f9535o + 1;
            this.f9535o = i11;
            this.f9537q += i10;
            this.f9542v.postValue(Integer.valueOf(i11));
        }
    }

    public final void i(String str, String str2) {
        String str3;
        PaymentRepository paymentRepository = this.f9534n;
        KycResponseDto kycResponseDto = this.f9543w;
        if (kycResponseDto != null) {
            str3 = kycResponseDto.getStatus();
        } else {
            str3 = null;
        }
        h c10 = paymentRepository.createKycSupportTicket(str3, str, this.f9081d.getUserPhoneNumber(), str2, this.f9541u).c(((e) this.f9079b).J());
        d dVar = new d(new q(20, new c(this, 2)), new q(21, new c(this, 3)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
