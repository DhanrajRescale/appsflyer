package com.assetgro.stockgro.feature_market.presentation.fno.option;

import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fd.c;
import ja.j;
import ja.k;
import ja.l;
import ja.m;
import ja.n;
import ja.p;
import ja.q;
import ja.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import pp.b;
import tu.k1;
import tu.l1;
import tu.s0;
import vt.i0;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/option/MarketOptionsListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketOptionsListViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final FnoRepository f8627n;

    /* renamed from: o, reason: collision with root package name */
    public final k1 f8628o;

    /* renamed from: p, reason: collision with root package name */
    public final s0 f8629p;

    /* renamed from: q, reason: collision with root package name */
    public String f8630q;

    /* renamed from: r, reason: collision with root package name */
    public c f8631r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketOptionsListViewModel(FnoRepository fnoRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f8627n = fnoRepository;
        k1 a10 = l1.a(new j(i0.f38321a, false, false, false));
        this.f8628o = a10;
        this.f8629p = new s0(a10);
        this.f8630q = "stocks";
        this.f9084g.setValue(Boolean.TRUE);
        g.H(u0.f(this), null, null, new p(this, null), 3);
    }

    public final void h() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            i(l.f21278b);
        } else {
            g.H(u0.f(this), null, null, new q(this, null), 3);
        }
    }

    public final void i(b stateEvents) {
        Intrinsics.checkNotNullParameter(stateEvents, "stateEvents");
        if (stateEvents instanceof n) {
            i(m.f21282a);
            h();
            return;
        }
        boolean z10 = stateEvents instanceof m;
        k1 k1Var = this.f8628o;
        if (z10) {
            if (!((j) k1Var.getValue()).f21275d) {
                k1Var.m(j.a((j) k1Var.getValue(), false, true, false, 11));
                return;
            } else {
                k1Var.m(j.a((j) k1Var.getValue(), false, false, false, 11));
                return;
            }
        }
        if (stateEvents instanceof k) {
            ((j) k1Var.getValue()).getClass();
            List optionList = ((k) stateEvents).f21276a;
            Intrinsics.checkNotNullParameter(optionList, "optionList");
            k1Var.m(new j(optionList, false, false, false));
            return;
        }
        if (Intrinsics.a(stateEvents, l.f21277a)) {
            k1Var.m(j.a((j) k1Var.getValue(), true, false, false, 13));
            h();
            j();
            return;
        }
        if (Intrinsics.a(stateEvents, l.f21278b)) {
            if (((j) k1Var.getValue()).f21272a.isEmpty()) {
                k1Var.m(j.a((j) k1Var.getValue(), false, false, true, 7));
            }
        } else {
            if (Intrinsics.a(stateEvents, l.f21279c)) {
                h();
                return;
            }
            if (Intrinsics.a(stateEvents, l.f21280d)) {
                j();
                return;
            }
            if (Intrinsics.a(stateEvents, l.f21281e)) {
                c cVar = this.f8631r;
                if (cVar != null) {
                    cVar.a();
                } else {
                    Intrinsics.k("timer");
                    throw null;
                }
            }
        }
    }

    public final void j() {
        c cVar = this.f8631r;
        if (cVar != null) {
            cVar.a();
            g.H(u0.f(this), null, null, new s(this, null), 3);
        } else {
            Intrinsics.k("timer");
            throw null;
        }
    }
}
