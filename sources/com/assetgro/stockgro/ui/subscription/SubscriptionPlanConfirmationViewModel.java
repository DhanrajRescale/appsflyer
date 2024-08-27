package com.assetgro.stockgro.ui.subscription;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import cj.n;
import com.assetgro.stockgro.data.model.SubscriptionPlanConfirmationResponse;
import com.assetgro.stockgro.data.remote.request.SubscriptionPlanPurchaseRequestDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ej.j0;
import jt.d;
import kj.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import mt.f;
import nt.h;
import okhttp3.HttpUrl;
import qf.a;
import qf.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/SubscriptionPlanConfirmationViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "ni/g", "ej/k0", "ej/l0", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SubscriptionPlanConfirmationViewModel extends BaseViewModel {
    public static boolean I;
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public String D;
    public boolean E;
    public final e0 F;
    public final e0 G;
    public final e0 H;

    /* renamed from: n, reason: collision with root package name */
    public final PaymentRepository f10554n;

    /* renamed from: o, reason: collision with root package name */
    public final a f10555o;

    /* renamed from: p, reason: collision with root package name */
    public String f10556p;

    /* renamed from: q, reason: collision with root package name */
    public SubscriptionPlanConfirmationResponse f10557q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10558r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10559s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10560t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10561u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10562v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f10563w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10564x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10565y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10566z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public SubscriptionPlanConfirmationViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, PaymentRepository paymentRepository, a maintenanceConfigManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        this.f10554n = paymentRepository;
        this.f10555o = maintenanceConfigManager;
        this.f10556p = HttpUrl.FRAGMENT_ENCODE_SET;
        ?? liveData = new LiveData();
        this.f10558r = liveData;
        this.f10559s = liveData;
        ?? liveData2 = new LiveData();
        this.f10560t = liveData2;
        this.f10561u = liveData2;
        ?? liveData3 = new LiveData();
        this.f10562v = liveData3;
        this.f10563w = liveData3;
        ?? liveData4 = new LiveData(new j(Boolean.FALSE));
        this.f10564x = liveData4;
        this.f10565y = liveData4;
        this.f10566z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = new LiveData(new j(Boolean.TRUE));
        ?? liveData5 = new LiveData();
        this.F = liveData5;
        this.G = liveData5;
        this.H = new LiveData();
        f g10 = maintenanceConfigManager.f31925a.g(((e) schedulerProvider).J());
        jt.e eVar = new jt.e(new n(6, new j0(this, 0)), gt.e.f17572d);
        g10.e(eVar);
        compositeDisposable.c(eVar);
        k();
    }

    public final void h(String selectedPgRoute) {
        Intrinsics.checkNotNullParameter(selectedPgRoute, "selectedPgRoute");
        this.f10556p = selectedPgRoute;
        if (((SubscriptionPlanConfirmationResponse) this.f10558r.getValue()) != null) {
            int hashCode = selectedPgRoute.hashCode();
            e0 e0Var = this.f10564x;
            e0 e0Var2 = this.C;
            if (hashCode != 84238) {
                if (hashCode != 2061107) {
                    if (hashCode == 1430325946 && selectedPgRoute.equals("UPI-AUTOPAY")) {
                        e0Var2.postValue(new j(Boolean.valueOf(!r0.getUpiAutoPay().getEnabled())));
                        e0Var.postValue(new j(Boolean.FALSE));
                        return;
                    }
                } else if (selectedPgRoute.equals("CASH")) {
                    e0Var2.postValue(new j(Boolean.valueOf(!r0.getWallet().getEnabled())));
                    e0Var.postValue(new j(Boolean.TRUE));
                    return;
                }
            } else if (selectedPgRoute.equals("UPI")) {
                e0Var2.postValue(new j(Boolean.valueOf(!r0.getUpi().getEnabled())));
                e0Var.postValue(new j(Boolean.FALSE));
                return;
            }
            e0Var2.postValue(new j(Boolean.TRUE));
            e0Var.postValue(new j(Boolean.FALSE));
        }
    }

    public final void i() {
        String str = this.f10556p;
        int hashCode = str.hashCode();
        if (hashCode != 84238) {
            if (hashCode != 2061107) {
                if (hashCode == 1430325946 && str.equals("UPI-AUTOPAY")) {
                    if (this.E) {
                        SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse = this.f10557q;
                        if (subscriptionPlanConfirmationResponse != null) {
                            j(Float.parseFloat(subscriptionPlanConfirmationResponse.getDiscountPrice()), "UPI_MANDATE_SETUP");
                            return;
                        } else {
                            Intrinsics.k("data");
                            throw null;
                        }
                    }
                    SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse2 = this.f10557q;
                    if (subscriptionPlanConfirmationResponse2 != null) {
                        j(Float.parseFloat(subscriptionPlanConfirmationResponse2.getDiscountPrice()), "UPI_MANDATE_EXECUTE");
                        return;
                    } else {
                        Intrinsics.k("data");
                        throw null;
                    }
                }
                return;
            }
            if (str.equals("CASH")) {
                e0 e0Var = this.f10560t;
                String str2 = this.f10556p;
                SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse3 = this.f10557q;
                if (subscriptionPlanConfirmationResponse3 != null) {
                    e0Var.setValue(new j(new SubscriptionPlanPurchaseRequestDto(str2, subscriptionPlanConfirmationResponse3.getPackageID(), null)));
                    return;
                } else {
                    Intrinsics.k("data");
                    throw null;
                }
            }
            return;
        }
        if (str.equals("UPI")) {
            SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse4 = this.f10557q;
            if (subscriptionPlanConfirmationResponse4 != null) {
                j(Float.parseFloat(subscriptionPlanConfirmationResponse4.getDiscountPrice()), "UPI_ONLY");
            } else {
                Intrinsics.k("data");
                throw null;
            }
        }
    }

    public final void j(float f10, String str) {
        String str2;
        String str3;
        e0 e0Var = this.f9084g;
        Boolean bool = Boolean.TRUE;
        e0Var.postValue(bool);
        this.C.postValue(new j(bool));
        PaymentRepository paymentRepository = this.f10554n;
        Float valueOf = Float.valueOf(f10);
        e0 e0Var2 = this.f10559s;
        SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse = (SubscriptionPlanConfirmationResponse) e0Var2.getValue();
        if (subscriptionPlanConfirmationResponse != null) {
            str2 = subscriptionPlanConfirmationResponse.getPackageID();
        } else {
            str2 = null;
        }
        SubscriptionPlanConfirmationResponse subscriptionPlanConfirmationResponse2 = (SubscriptionPlanConfirmationResponse) e0Var2.getValue();
        if (subscriptionPlanConfirmationResponse2 != null) {
            str3 = subscriptionPlanConfirmationResponse2.getTitle();
        } else {
            str3 = null;
        }
        h c10 = paymentRepository.processJustPayPayload(valueOf, true, str, str2, str3).c(((e) this.f9079b).J());
        d dVar = new d(new n(2, new j0(this, 3)), new n(3, new j0(this, 4)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        this.f9080c.c(dVar);
    }

    public final void k() {
        boolean z10;
        b bVar = b.f31932g;
        a aVar = this.f10555o;
        if (!aVar.b(bVar) && !aVar.b(b.f31934i)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (I != z10) {
            I = z10;
            this.H.postValue(new j(new Pair(Boolean.valueOf(z10), aVar.a(bVar))));
        }
    }
}
