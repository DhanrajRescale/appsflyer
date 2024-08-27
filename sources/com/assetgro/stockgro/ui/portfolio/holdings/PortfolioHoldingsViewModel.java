package com.assetgro.stockgro.ui.portfolio.holdings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.utils.NullPortfolioIdException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import ni.j;
import og.e;
import og.f;
import okhttp3.HttpUrl;
import pj.a;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/holdings/PortfolioHoldingsViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PortfolioHoldingsViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public Portfolio C;
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
    public final d0 R;

    /* renamed from: n, reason: collision with root package name */
    public final PortfolioRepository f9834n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9835o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9836p;

    /* renamed from: q, reason: collision with root package name */
    public String f9837q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f9838r;

    /* renamed from: s, reason: collision with root package name */
    public String f9839s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9840t;

    /* renamed from: u, reason: collision with root package name */
    public BottomSheetItem f9841u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9842v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f9843w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f9844x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f9845y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9846z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public PortfolioHoldingsViewModel(a schedulerProvider, ct.a compositeDisposable, PortfolioRepository portfolioRepository, UserRepository userRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f9834n = portfolioRepository;
        portfolioRepository.getUserId();
        ?? liveData = new LiveData();
        this.f9835o = liveData;
        this.f9836p = new LiveData();
        this.f9837q = "EQUITY";
        this.f9838r = new ArrayList();
        this.f9840t = new LiveData();
        this.f9841u = new BottomSheetItem("All Holdings", HttpUrl.FRAGMENT_ENCODE_SET);
        this.f9842v = true;
        this.f9843w = new ArrayList();
        this.f9844x = new ArrayList();
        this.f9845y = new ArrayList();
        this.f9846z = new LiveData();
        this.A = new LiveData(Boolean.FALSE);
        this.B = new LiveData();
        this.D = i0.C(liveData, e.f30023l);
        this.E = i0.C(liveData, e.f30017f);
        this.F = i0.C(liveData, e.f30013b);
        this.G = i0.C(liveData, e.f30014c);
        this.H = i0.C(liveData, e.f30016e);
        this.I = i0.C(liveData, e.f30021j);
        this.J = i0.C(liveData, e.f30022k);
        this.K = i0.C(liveData, e.f30026o);
        this.L = i0.C(liveData, e.f30018g);
        this.M = i0.C(liveData, e.f30019h);
        this.N = i0.C(liveData, e.f30020i);
        this.O = i0.C(liveData, e.f30027p);
        this.P = i0.C(liveData, e.f30025n);
        this.Q = i0.C(liveData, e.f30024m);
        this.R = i0.C(liveData, e.f30015d);
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void h(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = this.f9844x;
        arrayList.clear();
        ArrayList arrayList2 = this.f9845y;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (s.j(((UnifiedStockTransaction) next).getSector(), type, true)) {
                arrayList3.add(next);
            }
        }
        arrayList.addAll(arrayList3);
    }

    public final Portfolio i() {
        Portfolio portfolio = this.C;
        if (portfolio != null) {
            return portfolio;
        }
        Intrinsics.k("portfolioData");
        throw null;
    }

    public final void j() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        String str = this.f9839s;
        if (str != null && str.length() != 0) {
            e0 e0Var = this.f9084g;
            e0Var.postValue(Boolean.TRUE);
            try {
                g.H(u0.f(this), null, null, new f(this, null), 3);
                return;
            } catch (Exception e10) {
                e0Var.postValue(Boolean.FALSE);
                this.f9840t.postValue(e10.getLocalizedMessage());
                e10.printStackTrace();
                return;
            }
        }
        FirebaseCrashlytics.getInstance().recordException(new NullPortfolioIdException("portfolio Id not received in PortfolioHoldingsViewModel::getPortfolioHoldings with portfolioData::" + i()));
    }
}
