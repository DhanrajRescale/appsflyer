package com.assetgro.stockgro.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.NotificationsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import jf.g;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import pj.a;
import rf.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/notifications/NotificationsViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NotificationsViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final NotificationsRepository f9624n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9625o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9626p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9627q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9628r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9629s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9630t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public NotificationsViewModel(a schedulerProvider, ct.a compositeDisposable, NotificationsRepository notificationsRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(notificationsRepository, "notificationsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9624n = notificationsRepository;
        this.f9625o = new LiveData();
        this.f9626p = new LiveData();
        this.f9627q = new LiveData();
        this.f9628r = new LiveData();
        this.f9629s = new LiveData();
        this.f9630t = new LiveData();
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h() {
        Integer num;
        this.f9084g.postValue(Boolean.TRUE);
        e0 e0Var = this.f9625o;
        Integer num2 = (Integer) e0Var.getValue();
        if (num2 == null) {
            num2 = 0;
        }
        if (num2.intValue() == 5) {
            num = 7;
        } else {
            num = (Integer) e0Var.getValue();
            if (num == null) {
                num = 0;
            }
        }
        h c10 = this.f9624n.getAllNotifications(num.intValue()).c(((e) this.f9079b).J());
        d dVar = new d(new g(24, new j(this, 1)), new g(25, new j(this, 2)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
