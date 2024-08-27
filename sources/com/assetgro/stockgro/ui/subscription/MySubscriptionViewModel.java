package com.assetgro.stockgro.ui.subscription;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.MySubscriptionResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ej.f;
import ej.g;
import kj.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/MySubscriptionViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MySubscriptionViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f10506n;

    /* renamed from: o, reason: collision with root package name */
    public MySubscriptionResponse f10507o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10508p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10509q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10510r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10511s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10512t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10513u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f10514v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f10515w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f10516x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10517y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MySubscriptionViewModel(PaymentRepository paymentRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        this.f10506n = paymentRepository;
        ?? liveData = new LiveData();
        this.f10508p = liveData;
        this.f10509q = liveData;
        ?? liveData2 = new LiveData();
        this.f10510r = liveData2;
        this.f10511s = liveData2;
        ?? liveData3 = new LiveData();
        this.f10512t = liveData3;
        this.f10513u = liveData3;
        this.f10514v = i0.C(liveData, g.f15473b);
        this.f10515w = new LiveData(Boolean.TRUE);
        this.f10516x = i0.C(liveData, g.f15474c);
        this.f10517y = kj.a.f23207b;
    }

    public final void h() {
        MySubscriptionResponse mySubscriptionResponse = (MySubscriptionResponse) this.f10509q.getValue();
        if (mySubscriptionResponse != null) {
            this.f10512t.setValue(new j(new Pair(mySubscriptionResponse.getPackageID(), Boolean.FALSE)));
        }
    }

    public final MySubscriptionResponse i() {
        MySubscriptionResponse mySubscriptionResponse = this.f10507o;
        if (mySubscriptionResponse != null) {
            return mySubscriptionResponse;
        }
        Intrinsics.k("data");
        throw null;
    }

    public final void j() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(ni.j.i("Not connected to internet"));
        } else {
            yk.g.H(u0.f(this), null, null, new f(this, null), 3);
        }
    }
}
