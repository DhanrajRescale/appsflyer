package com.assetgro.stockgro.ui.portfolio.orders;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.portfolio.orders.Bought;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import ct.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import tg.c;
import zd.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/orders/OrderItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lcom/assetgro/stockgro/data/model/portfolio/orders/Bought;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OrderItemViewModel extends BaseItemViewModel<Bought> {

    /* renamed from: g, reason: collision with root package name */
    public b f9889g;

    /* renamed from: h, reason: collision with root package name */
    public int f9890h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f9891i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f9892j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f9893k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f9894l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f9895m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f9896n;

    /* renamed from: o, reason: collision with root package name */
    public final d0 f9897o;

    /* renamed from: p, reason: collision with root package name */
    public final d0 f9898p;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f9899q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f9900r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f9901s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f9902t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f9903u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f9904v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f9905w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f9906x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f9907y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public OrderItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f9890h = 1;
        this.f9891i = new LiveData();
        this.f9892j = i0.C(this.f9075c, c.f36032i);
        this.f9893k = i0.C(this.f9075c, c.f36038o);
        this.f9894l = i0.C(this.f9075c, c.f36033j);
        i0.C(this.f9075c, c.f36040q);
        this.f9895m = i0.C(this.f9075c, c.f36041r);
        this.f9896n = i0.C(this.f9075c, c.f36034k);
        this.f9897o = i0.C(this.f9075c, c.f36037n);
        this.f9898p = i0.C(this.f9075c, c.f36036m);
        this.f9899q = i0.C(this.f9075c, c.f36028e);
        this.f9900r = i0.C(this.f9075c, c.f36029f);
        this.f9901s = i0.C(this.f9075c, new g(11, this, schedulerProvider));
        this.f9902t = i0.C(this.f9075c, c.f36027d);
        this.f9903u = i0.C(this.f9075c, c.f36031h);
        this.f9904v = i0.C(this.f9075c, c.f36039p);
        this.f9905w = i0.C(this.f9075c, c.f36030g);
        this.f9906x = i0.C(this.f9075c, c.f36026c);
        this.f9907y = i0.C(this.f9075c, c.f36025b);
    }
}
