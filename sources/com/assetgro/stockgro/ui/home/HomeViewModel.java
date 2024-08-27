package com.assetgro.stockgro.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.appsflyer.AppsFlyerProperties;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.home.homepage.data.WidgetDataProcessor;
import com.assetgro.stockgro.ui.home.homepage.domain.MainHomeConverter;
import e1.s;
import e1.x;
import gf.m;
import hf.f;
import hf.h;
import hf.j;
import java.util.HashMap;
import java.util.ListIterator;
import jt.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mj.a;
import th.b;
import th.c;
import tu.k1;
import tu.l1;
import tu.s0;
import uh.i;
import vt.g0;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/home/HomeViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class HomeViewModel extends BaseViewModel {
    public final k1 A;
    public final s0 B;
    public e C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public boolean G;
    public final e0 H;
    public final e0 I;
    public final e0 J;

    /* renamed from: n, reason: collision with root package name */
    public final TopChartsRepository f9545n;

    /* renamed from: o, reason: collision with root package name */
    public final a f9546o;

    /* renamed from: p, reason: collision with root package name */
    public final PaymentRepository f9547p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9548q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9549r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9550s;

    /* renamed from: t, reason: collision with root package name */
    public final MainHomeConverter f9551t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9552u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9553v;

    /* renamed from: w, reason: collision with root package name */
    public final k1 f9554w;

    /* renamed from: x, reason: collision with root package name */
    public final k1 f9555x;

    /* renamed from: y, reason: collision with root package name */
    public final s f9556y;

    /* renamed from: z, reason: collision with root package name */
    public final s f9557z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v19, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public HomeViewModel(pj.a schedulerProvider, ct.a compositeDisposable, TopChartsRepository topChartsRepository, UserRepository userRepository, a remoteConfigUtils, PaymentRepository paymentRepository, jj.a appsFlyerAnalyticsEngineImpl) {
        super(schedulerProvider, compositeDisposable, userRepository);
        String currentUserId;
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(topChartsRepository, "topChartsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(remoteConfigUtils, "remoteConfigUtils");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        this.f9545n = topChartsRepository;
        this.f9546o = remoteConfigUtils;
        this.f9547p = paymentRepository;
        this.f9548q = new LiveData();
        this.f9549r = new LiveData();
        this.f9550s = true;
        this.f9551t = new MainHomeConverter(new WidgetDataProcessor());
        this.f9552u = new LiveData();
        this.f9553v = new LiveData();
        k1 a10 = l1.a(new i());
        this.f9554w = a10;
        this.f9555x = a10;
        s sVar = new s();
        this.f9556y = sVar;
        this.f9557z = sVar;
        i();
        k1 a11 = l1.a(new j());
        this.A = a11;
        this.B = new s0(a11);
        this.D = new LiveData();
        this.E = new LiveData();
        this.F = new LiveData();
        this.H = new LiveData();
        if (AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null && (currentUserId = this.f9081d.getCurrentUserId()) != null) {
            appsFlyerAnalyticsEngineImpl.t0(currentUserId);
        }
        this.I = new LiveData();
        this.J = new LiveData();
    }

    public static final void h(HomeViewModel homeViewModel, th.a aVar) {
        s sVar = homeViewModel.f9556y;
        ListIterator listIterator = sVar.listIterator();
        int i10 = 0;
        while (true) {
            x xVar = (x) listIterator;
            if (xVar.hasNext()) {
                if (Intrinsics.a(((b) xVar.next()).f36080a, aVar.f36077a)) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            sVar.set(i10, b.a((b) sVar.get(i10), aVar.f36079c));
            g.H(u0.f(homeViewModel), null, null, new m(homeViewModel, i10, null), 3);
        }
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void i() {
        if (kj.a.f23207b || !WifiService.INSTANCE.getInstance().isOnline()) {
            return;
        }
        g.H(u0.f(this), null, null, new gf.j(this, null), 3);
    }

    public final void j(hf.i stateEvents) {
        HashMap<String, Object> param;
        Intrinsics.checkNotNullParameter(stateEvents, "stateEvents");
        if (stateEvents instanceof hf.g) {
            hf.g gVar = (hf.g) stateEvents;
            this.f9548q.setValue(gVar.f18368a);
            AnalyticEvent analyticEvent = gVar.f18369b;
            String str = gVar.f18370c;
            if (str != null && analyticEvent != null && (param = analyticEvent.getParam()) != null) {
                param.put("section_name", str);
            }
            this.f9549r.setValue(analyticEvent);
            return;
        }
        boolean a10 = Intrinsics.a(stateEvents, h.f18374d);
        k1 k1Var = this.A;
        if (a10) {
            k1Var.m(j.a((j) k1Var.getValue(), false, true, null, null, false, 29));
            return;
        }
        if (stateEvents instanceof f) {
            k1Var.m(j.a((j) k1Var.getValue(), false, false, null, g0.R(((f) stateEvents).f18367a), false, 23));
            k1Var.m(j.a((j) k1Var.getValue(), false, false, null, null, false, 30));
            return;
        }
        if (stateEvents instanceof hf.e) {
            k1Var.m(j.a((j) k1Var.getValue(), false, false, g0.R(((hf.e) stateEvents).f18366a), null, false, 27));
            k1Var.m(j.a((j) k1Var.getValue(), false, false, null, null, false, 30));
            return;
        }
        boolean a11 = Intrinsics.a(stateEvents, h.f18373c);
        h hVar = h.f18372b;
        if (a11) {
            if (kj.a.f23207b) {
                k1Var.m(j.a((j) k1Var.getValue(), this.f9550s, false, null, null, false, 14));
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    j(hVar);
                    return;
                } else {
                    g.H(u0.f(this), null, null, new gf.g(this, null), 3);
                    return;
                }
            }
            k1Var.m(j.a((j) k1Var.getValue(), this.f9550s, false, null, null, false, 14));
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                j(hVar);
                return;
            } else {
                g.H(u0.f(this), null, null, new gf.h(this, null), 3);
                return;
            }
        }
        if (Intrinsics.a(stateEvents, hVar)) {
            k1Var.m(j.a((j) k1Var.getValue(), false, false, null, null, true, 15));
        } else if (Intrinsics.a(stateEvents, h.f18371a)) {
            this.f9550s = false;
        }
    }

    public final void k(g stateEvents) {
        Object value;
        Object value2;
        i iVar;
        boolean z10;
        Object value3;
        Intrinsics.checkNotNullParameter(stateEvents, "stateEvents");
        boolean z11 = stateEvents instanceof uh.f;
        k1 k1Var = this.f9554w;
        if (z11) {
            s sVar = this.f9556y;
            sVar.clear();
            c cVar = ((uh.f) stateEvents).f37200b;
            sVar.addAll(cVar.f36086c);
            do {
                value3 = k1Var.getValue();
            } while (!k1Var.l(value3, i.a((i) value3, cVar.f36084a, cVar.f36085b, false, true, false, null, false, 116)));
            return;
        }
        if (stateEvents instanceof uh.g) {
            boolean z12 = ((uh.g) stateEvents).f37201b;
            do {
                value2 = k1Var.getValue();
                iVar = (i) value2;
                if (z12 || this.f9557z.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } while (!k1Var.l(value2, i.a(iVar, null, null, z12, false, z10, null, false, 99)));
            return;
        }
        if (stateEvents instanceof uh.e) {
            uh.e eVar = (uh.e) stateEvents;
            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                this.f9553v.postValue(new z9.h(R.string.no_internet_connection, new Object[0]));
                return;
            } else {
                g.H(u0.f(this), null, null, new gf.f(this, eVar.f37199b, null), 3);
                return;
            }
        }
        if (!Intrinsics.a(stateEvents, uh.h.f37202b)) {
            return;
        }
        do {
            value = k1Var.getValue();
        } while (!k1Var.l(value, i.a((i) value, null, null, false, false, false, null, true, 63)));
    }
}
