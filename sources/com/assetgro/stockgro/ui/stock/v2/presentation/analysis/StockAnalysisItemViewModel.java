package com.assetgro.stockgro.ui.stock.v2.presentation.analysis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import bj.c;
import bj.k;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import ct.a;
import ij.h;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import okhttp3.HttpUrl;
import qu.i0;
import s0.g;
import vt.y;
import zi.i;
import zi.l;
import zi.m;
import zi.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/v2/presentation/analysis/StockAnalysisItemViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseItemViewModel;", "Lzi/l;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockAnalysisItemViewModel extends BaseItemViewModel<l> {

    /* renamed from: g, reason: collision with root package name */
    public final d0 f10440g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f10441h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f10442i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f10443j;

    /* renamed from: k, reason: collision with root package name */
    public float f10444k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f10445l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f10446m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f10447n;

    /* renamed from: o, reason: collision with root package name */
    public final d0 f10448o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10449p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10450q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10451r;

    /* renamed from: s, reason: collision with root package name */
    public float f10452s;

    /* renamed from: t, reason: collision with root package name */
    public float f10453t;

    /* renamed from: u, reason: collision with root package name */
    public float f10454u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public StockAnalysisItemViewModel(e schedulerProvider, a compositeDisposable) {
        super(schedulerProvider, compositeDisposable);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        d0 d0Var = new d0();
        this.f10440g = d0Var;
        this.f10441h = d0Var;
        ?? liveData = new LiveData();
        this.f10442i = liveData;
        this.f10443j = liveData;
        this.f10445l = i0.C(this.f9075c, bj.l.f7018c);
        d0 C = i0.C(this.f9075c, bj.l.f7020e);
        this.f10446m = C;
        this.f10447n = i0.C(this.f9075c, bj.l.f7019d);
        this.f10448o = i0.C(this.f9075c, bj.l.f7021f);
        ?? liveData2 = new LiveData(Float.valueOf(g.f34069a));
        this.f10449p = liveData2;
        ?? liveData3 = new LiveData(Float.valueOf(g.f34069a));
        this.f10450q = liveData3;
        ?? liveData4 = new LiveData(Float.valueOf(g.f34069a));
        this.f10451r = liveData4;
        d0Var.a(liveData2, new c(2, new k(this, 0)));
        d0Var.a(liveData3, new c(2, new k(this, 1)));
        d0Var.a(liveData4, new c(2, new k(this, 2)));
        d0Var.a(C, new c(2, bj.l.f7017b));
        e();
    }

    public final void e() {
        n nVar;
        l lVar = (l) this.f9075c.getValue();
        if (lVar != null && (nVar = lVar.f42495b) != null) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder("TTM EPS: ");
            float f10 = nVar.f42507e;
            sb3.append(f10);
            sb3.append("\n");
            sb2.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder("CMP: ");
            float f11 = nVar.f42506d;
            sb4.append(f11);
            sb4.append("\n");
            sb2.append(sb4.toString());
            boolean z10 = true;
            double d10 = 1;
            float f12 = 100;
            double E0 = el.l.E0(2, Math.pow(el.l.E0(2, this.f10452s / f12) + d10, 10.0d) * f10);
            sb2.append("Estimated EPS after 10 years : " + E0 + "\n");
            double E02 = el.l.E0(2, ((double) this.f10453t) * E0);
            sb2.append("Estimated Stock Price after 10 years: " + E02 + "\n");
            double E03 = E02 / el.l.E0(2, Math.pow(el.l.E0(2, (double) (this.f10454u / f12)) + d10, 10.0d));
            sb2.append("Present Value of Stock or Fair value: " + E03 + "\n");
            double d11 = (((double) f11) / E03) - d10;
            sb2.append("Discount / Premium : " + d11 + "\n");
            double d12 = (double) 100;
            sb2.append("Final Values: <" + el.l.E0(2, E03) + "> {@^@} <" + (el.l.E0(4, d11) * d12) + "%>");
            float f13 = 100.0f;
            float f14 = ((float) d11) * 100.0f;
            if (f14 <= 100.0f) {
                f13 = f14;
            }
            if (f13 < -100.0f) {
                f13 = -100.0f;
            }
            float f15 = (f13 + f12) / 2;
            String m10 = h.m(h.f20067a, el.l.E0(2, E03));
            String t10 = h.t(String.valueOf(Math.abs(el.l.E0(2, d11 * d12))));
            if (f15 > 50.0f) {
                z10 = false;
            }
            boolean z11 = z10;
            String sb5 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
            this.f10440g.postValue(new m(m10, t10, f15, z11, sb5));
        }
    }

    public final void f() {
        e0 e0Var = this.f10442i;
        i iVar = new i("Discount", "The stock is undervalued based on the calculated fair value wrt the current market price and the outlook is hence bullish");
        iVar.f42489c = R.drawable.ic_thumb_up_new;
        Unit unit = Unit.f23355a;
        i iVar2 = new i("Premium", "The stock is overvalued based on the calculated fair value wrt the current market price and the outlook is hence bearish ");
        iVar2.f42489c = R.drawable.ic_thumb_down_new;
        e0Var.postValue(new j(new zi.k(HttpUrl.FRAGMENT_ENCODE_SET, y.g(iVar, iVar2))));
    }
}
