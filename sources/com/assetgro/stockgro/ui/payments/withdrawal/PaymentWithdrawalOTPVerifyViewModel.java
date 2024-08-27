package com.assetgro.stockgro.ui.payments.withdrawal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import at.e;
import at.l;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import fg.g;
import fg.h;
import fg.i;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mt.f;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import pj.a;
import vc.b;
import vt.v;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/withdrawal/PaymentWithdrawalOTPVerifyViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseBottomSheetViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PaymentWithdrawalOTPVerifyViewModel extends BaseBottomSheetViewModel {

    /* renamed from: g, reason: collision with root package name */
    public final PaymentRepository f9738g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f9739h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f9740i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f9741j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f9742k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f9743l;

    /* renamed from: m, reason: collision with root package name */
    public final e0 f9744m;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f9745n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9746o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9747p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9748q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9749r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9750s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9751t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9752u;

    /* renamed from: v, reason: collision with root package name */
    public int f9753v;

    /* renamed from: w, reason: collision with root package name */
    public String f9754w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PaymentWithdrawalOTPVerifyViewModel(a schedulerProvider, ct.a compositeDisposable, PaymentRepository paymentRepository) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        this.f9738g = paymentRepository;
        Boolean bool = Boolean.FALSE;
        ?? liveData = new LiveData(bool);
        this.f9739h = liveData;
        this.f9740i = liveData;
        ?? liveData2 = new LiveData(bool);
        this.f9741j = liveData2;
        this.f9742k = liveData2;
        ?? liveData3 = new LiveData();
        this.f9743l = liveData3;
        this.f9744m = liveData3;
        ?? liveData4 = new LiveData();
        this.f9745n = liveData4;
        this.f9746o = liveData4;
        ?? liveData5 = new LiveData();
        this.f9747p = liveData5;
        this.f9748q = liveData5;
        ?? liveData6 = new LiveData();
        this.f9749r = liveData6;
        this.f9750s = liveData6;
        ?? liveData7 = new LiveData(bool);
        this.f9751t = liveData7;
        this.f9752u = liveData7;
        this.f9753v = 15;
        this.f9754w = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static final void f(PaymentWithdrawalOTPVerifyViewModel paymentWithdrawalOTPVerifyViewModel, ResponseBody responseBody) {
        paymentWithdrawalOTPVerifyViewModel.getClass();
        JSONObject jSONObject = new JSONObject(responseBody.string());
        String string = jSONObject.getString("message");
        String string2 = jSONObject.getString("error_code");
        boolean o10 = v.o(new String[]{"FOX0001OTP", "FOX0001OTP", "FOX0002OTP", "FOX0005OTP"}, string2);
        e0 e0Var = paymentWithdrawalOTPVerifyViewModel.f9743l;
        if (o10) {
            paymentWithdrawalOTPVerifyViewModel.f9747p.postValue(HttpUrl.FRAGMENT_ENCODE_SET);
            e0Var.postValue(new Pair(string, Boolean.FALSE));
        } else if (v.o(new String[]{"FOX0003OTP", "FOX0002PIN", "FOX0001PIN"}, string2)) {
            e0Var.postValue(new Pair(string, Boolean.FALSE));
            paymentWithdrawalOTPVerifyViewModel.f9751t.postValue(Boolean.TRUE);
        } else {
            e0Var.postValue(new Pair(string, Boolean.FALSE));
        }
    }

    public final void g() {
        f fVar = new f(e.h(e.d(this.f9753v + 1), e.a(1L, TimeUnit.SECONDS), new b(h.f16075a, 16)), new g(0, new i(this, 0)), 1);
        ((kq.e) this.f9066b).getClass();
        l lVar = st.e.f34774b;
        Intrinsics.checkNotNullExpressionValue(lVar, "computation(...)");
        f g10 = fVar.g(lVar);
        jt.e eVar = new jt.e(new g(1, new i(this, 1)), gt.e.f17572d);
        g10.e(eVar);
        Intrinsics.checkNotNullExpressionValue(eVar, "subscribe(...)");
    }
}
