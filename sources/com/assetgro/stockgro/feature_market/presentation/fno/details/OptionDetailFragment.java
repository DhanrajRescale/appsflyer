package com.assetgro.stockgro.feature_market.presentation.fno.details;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import androidx.fragment.app.z1;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import b3.t;
import ba.mh;
import ba.nh;
import ca.c;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ScrollableRulerViewStopOnLine;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import ea.n0;
import ea.q;
import gd.m;
import ha.k;
import ha.l;
import ha.r;
import iu.a0;
import kj.b;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ni.j;
import okhttp3.HttpUrl;
import qu.i0;
import s0.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/details/OptionDetailFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_market/presentation/fno/details/OptionDetailViewModel;", "Lba/mh;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OptionDetailFragment extends m<OptionDetailViewModel, mh> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8591h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8592g = new i(a0.a(ha.m.class), new z1(this, 1));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_fno_option_detail;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((OptionDetailViewModel) r()).C.observe(this, new f7.i(3, new ha.i(this, 0)));
        ((OptionDetailViewModel) r()).f8596q.observe(this, new f7.i(3, new ha.i(this, 1)));
        ((OptionDetailViewModel) r()).E.observe(this, new f7.i(3, new ha.i(this, 2)));
        ((OptionDetailViewModel) r()).f8600u.observe(this, new f7.i(3, new ha.i(this, 3)));
        ((OptionDetailViewModel) r()).f8604y.observe(this, new f7.i(3, new ha.i(this, 4)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        nh nhVar = (nh) ((mh) q());
        nhVar.Y = (OptionDetailViewModel) r();
        synchronized (nhVar) {
            nhVar.f5569b0 |= 256;
        }
        nhVar.a(24);
        nhVar.m();
        ((mh) q()).p(this);
        OptionDetailViewModel optionDetailViewModel = (OptionDetailViewModel) r();
        OptionContract optionContract = ((ha.m) this.f8592g.getValue()).f18093b;
        Intrinsics.checkNotNullParameter(optionContract, "<set-?>");
        optionDetailViewModel.f8594o = optionContract;
        ScrollableRulerViewStopOnLine scrollableRulerViewStopOnLine = ((mh) q()).T;
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        scrollableRulerViewStopOnLine.setCoroutineScope(i0.t(lifecycle));
        ((mh) q()).T.setOnRulerValueChangeListener(new k(this));
        final int i10 = 0;
        ((mh) q()).X.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ha.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptionDetailFragment f18080b;

            {
                this.f18080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                OptionDetailFragment this$0 = this.f18080b;
                switch (i11) {
                    case 0:
                        int i12 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    case 1:
                        int i13 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_opt_beven_chart_guide", null, 2, null);
                        this$0.z(analyticEvent);
                        this$0.B(analyticEvent);
                        new a().show(this$0.requireActivity().getSupportFragmentManager(), "BreakEvenChartDialogFragment");
                        return;
                    case 2:
                        int i14 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        new a().show(this$0.requireActivity().getSupportFragmentManager(), "BreakEvenChartDialogFragment");
                        return;
                    default:
                        int i15 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent2 = new AnalyticEvent("app_market_opt_chart_tap", null, 2, null);
                        this$0.z(analyticEvent2);
                        this$0.B(analyticEvent2);
                        Object value = ((OptionDetailViewModel) this$0.r()).f8602w.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.a(value, bool)) {
                            RotateAnimation rotateAnimation = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation.setInterpolator(new DecelerateInterpolator());
                            rotateAnimation.setRepeatCount(0);
                            rotateAnimation.setFillAfter(true);
                            rotateAnimation.setDuration(300L);
                            ((mh) this$0.q()).U.startAnimation(rotateAnimation);
                        } else {
                            RotateAnimation rotateAnimation2 = new RotateAnimation(s0.g.f34069a, -180.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation2.setInterpolator(new DecelerateInterpolator());
                            rotateAnimation2.setRepeatCount(0);
                            rotateAnimation2.setFillAfter(true);
                            rotateAnimation2.setDuration(300L);
                            ((mh) this$0.q()).U.startAnimation(rotateAnimation2);
                        }
                        OptionDetailViewModel optionDetailViewModel2 = (OptionDetailViewModel) this$0.r();
                        e0 e0Var = optionDetailViewModel2.f8601v;
                        if (Intrinsics.a(e0Var.getValue(), bool)) {
                            e0Var.setValue(Boolean.FALSE);
                            return;
                        } else {
                            e0Var.setValue(bool);
                            optionDetailViewModel2.j();
                            return;
                        }
                }
            }
        });
        LineChart historyChart = ((mh) q()).G;
        Intrinsics.checkNotNullExpressionValue(historyChart, "historyChart");
        historyChart.setBackgroundColor(-1);
        historyChart.getDescription().f36180a = false;
        final int i11 = 1;
        historyChart.setDragEnabled(true);
        historyChart.getLegend().f36180a = false;
        historyChart.getAxisRight().f36180a = false;
        historyChart.getAxisLeft().f36180a = true;
        historyChart.setNoDataTextColor(r3.k.getColor(historyChart.getContext(), R.color.white));
        historyChart.setTouchEnabled(true);
        historyChart.setDrawGridBackground(false);
        historyChart.setScaleEnabled(true);
        historyChart.setNoDataText(HttpUrl.FRAGMENT_ENCODE_SET);
        historyChart.setExtraLeftOffset(g.f34069a);
        historyChart.setExtraTopOffset(g.f34069a);
        historyChart.setExtraRightOffset(16.0f);
        historyChart.setExtraBottomOffset(16.0f);
        final int i12 = 2;
        historyChart.getXAxis().I = 2;
        ((mh) q()).f5476y.setOnClickListener(new View.OnClickListener(this) { // from class: ha.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptionDetailFragment f18080b;

            {
                this.f18080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                OptionDetailFragment this$0 = this.f18080b;
                switch (i112) {
                    case 0:
                        int i122 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    case 1:
                        int i13 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_opt_beven_chart_guide", null, 2, null);
                        this$0.z(analyticEvent);
                        this$0.B(analyticEvent);
                        new a().show(this$0.requireActivity().getSupportFragmentManager(), "BreakEvenChartDialogFragment");
                        return;
                    case 2:
                        int i14 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        new a().show(this$0.requireActivity().getSupportFragmentManager(), "BreakEvenChartDialogFragment");
                        return;
                    default:
                        int i15 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent2 = new AnalyticEvent("app_market_opt_chart_tap", null, 2, null);
                        this$0.z(analyticEvent2);
                        this$0.B(analyticEvent2);
                        Object value = ((OptionDetailViewModel) this$0.r()).f8602w.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.a(value, bool)) {
                            RotateAnimation rotateAnimation = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation.setInterpolator(new DecelerateInterpolator());
                            rotateAnimation.setRepeatCount(0);
                            rotateAnimation.setFillAfter(true);
                            rotateAnimation.setDuration(300L);
                            ((mh) this$0.q()).U.startAnimation(rotateAnimation);
                        } else {
                            RotateAnimation rotateAnimation2 = new RotateAnimation(s0.g.f34069a, -180.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation2.setInterpolator(new DecelerateInterpolator());
                            rotateAnimation2.setRepeatCount(0);
                            rotateAnimation2.setFillAfter(true);
                            rotateAnimation2.setDuration(300L);
                            ((mh) this$0.q()).U.startAnimation(rotateAnimation2);
                        }
                        OptionDetailViewModel optionDetailViewModel2 = (OptionDetailViewModel) this$0.r();
                        e0 e0Var = optionDetailViewModel2.f8601v;
                        if (Intrinsics.a(e0Var.getValue(), bool)) {
                            e0Var.setValue(Boolean.FALSE);
                            return;
                        } else {
                            e0Var.setValue(bool);
                            optionDetailViewModel2.j();
                            return;
                        }
                }
            }
        });
        ((mh) q()).L.setOnClickListener(new View.OnClickListener(this) { // from class: ha.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptionDetailFragment f18080b;

            {
                this.f18080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                OptionDetailFragment this$0 = this.f18080b;
                switch (i112) {
                    case 0:
                        int i122 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    case 1:
                        int i13 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_opt_beven_chart_guide", null, 2, null);
                        this$0.z(analyticEvent);
                        this$0.B(analyticEvent);
                        new a().show(this$0.requireActivity().getSupportFragmentManager(), "BreakEvenChartDialogFragment");
                        return;
                    case 2:
                        int i14 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        new a().show(this$0.requireActivity().getSupportFragmentManager(), "BreakEvenChartDialogFragment");
                        return;
                    default:
                        int i15 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent2 = new AnalyticEvent("app_market_opt_chart_tap", null, 2, null);
                        this$0.z(analyticEvent2);
                        this$0.B(analyticEvent2);
                        Object value = ((OptionDetailViewModel) this$0.r()).f8602w.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.a(value, bool)) {
                            RotateAnimation rotateAnimation = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation.setInterpolator(new DecelerateInterpolator());
                            rotateAnimation.setRepeatCount(0);
                            rotateAnimation.setFillAfter(true);
                            rotateAnimation.setDuration(300L);
                            ((mh) this$0.q()).U.startAnimation(rotateAnimation);
                        } else {
                            RotateAnimation rotateAnimation2 = new RotateAnimation(s0.g.f34069a, -180.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation2.setInterpolator(new DecelerateInterpolator());
                            rotateAnimation2.setRepeatCount(0);
                            rotateAnimation2.setFillAfter(true);
                            rotateAnimation2.setDuration(300L);
                            ((mh) this$0.q()).U.startAnimation(rotateAnimation2);
                        }
                        OptionDetailViewModel optionDetailViewModel2 = (OptionDetailViewModel) this$0.r();
                        e0 e0Var = optionDetailViewModel2.f8601v;
                        if (Intrinsics.a(e0Var.getValue(), bool)) {
                            e0Var.setValue(Boolean.FALSE);
                            return;
                        } else {
                            e0Var.setValue(bool);
                            optionDetailViewModel2.j();
                            return;
                        }
                }
            }
        });
        FnoOption fnoOption = ((ha.m) this.f8592g.getValue()).f18092a;
        ((mh) q()).E.m(fnoOption.getLtp(), fnoOption.getName(), fnoOption.getImageUrl());
        ChangeDto change = fnoOption.getChange();
        if (change != null) {
            ((mh) q()).E.n(change);
        }
        OptionDetailViewModel optionDetailViewModel2 = (OptionDetailViewModel) r();
        final int i13 = 3;
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            optionDetailViewModel2.f9083f.setValue(j.i("Not connected to internet"));
        } else {
            optionDetailViewModel2.f9084g.setValue(Boolean.TRUE);
            yk.g.H(u0.f(optionDetailViewModel2), null, null, new r(optionDetailViewModel2, null), 3);
        }
        ((mh) q()).f5474w.setOnTouchListener(new ha.g(this, i10));
        ((mh) q()).f5474w.setOnChartValueSelectedListener(new k(this));
        ((mh) q()).U.setOnClickListener(new View.OnClickListener(this) { // from class: ha.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptionDetailFragment f18080b;

            {
                this.f18080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i13;
                OptionDetailFragment this$0 = this.f18080b;
                switch (i112) {
                    case 0:
                        int i122 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    case 1:
                        int i132 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_opt_beven_chart_guide", null, 2, null);
                        this$0.z(analyticEvent);
                        this$0.B(analyticEvent);
                        new a().show(this$0.requireActivity().getSupportFragmentManager(), "BreakEvenChartDialogFragment");
                        return;
                    case 2:
                        int i14 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        new a().show(this$0.requireActivity().getSupportFragmentManager(), "BreakEvenChartDialogFragment");
                        return;
                    default:
                        int i15 = OptionDetailFragment.f8591h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent2 = new AnalyticEvent("app_market_opt_chart_tap", null, 2, null);
                        this$0.z(analyticEvent2);
                        this$0.B(analyticEvent2);
                        Object value = ((OptionDetailViewModel) this$0.r()).f8602w.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.a(value, bool)) {
                            RotateAnimation rotateAnimation = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation.setInterpolator(new DecelerateInterpolator());
                            rotateAnimation.setRepeatCount(0);
                            rotateAnimation.setFillAfter(true);
                            rotateAnimation.setDuration(300L);
                            ((mh) this$0.q()).U.startAnimation(rotateAnimation);
                        } else {
                            RotateAnimation rotateAnimation2 = new RotateAnimation(s0.g.f34069a, -180.0f, 1, 0.5f, 1, 0.5f);
                            rotateAnimation2.setInterpolator(new DecelerateInterpolator());
                            rotateAnimation2.setRepeatCount(0);
                            rotateAnimation2.setFillAfter(true);
                            rotateAnimation2.setDuration(300L);
                            ((mh) this$0.q()).U.startAnimation(rotateAnimation2);
                        }
                        OptionDetailViewModel optionDetailViewModel22 = (OptionDetailViewModel) this$0.r();
                        e0 e0Var = optionDetailViewModel22.f8601v;
                        if (Intrinsics.a(e0Var.getValue(), bool)) {
                            e0Var.setValue(Boolean.FALSE);
                            return;
                        } else {
                            e0Var.setValue(bool);
                            optionDetailViewModel22.j();
                            return;
                        }
                }
            }
        });
        MaterialButton actionButton = ((mh) q()).f5470s;
        Intrinsics.checkNotNullExpressionValue(actionButton, "actionButton");
        l action = new l(this);
        int i14 = f.f23221a;
        Intrinsics.checkNotNullParameter(actionButton, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        actionButton.setOnClickListener(new b(200L, action, 1));
        ((mh) q()).H.setOnCheckedStateChangeListener(new t(this, 17));
        ((mh) q()).R.setVisibility(8);
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        FnoRepository fnoRepository = bVar.e();
        yk.g.i(fnoRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        c factory = new c(a0.a(OptionDetailViewModel.class), new q(k10, c10, userRepository, fnoRepository, 2));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, OptionDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(OptionDetailViewModel.class, "<this>", OptionDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            OptionDetailViewModel optionDetailViewModel = (OptionDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(optionDetailViewModel);
            this.f17284b = optionDetailViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
