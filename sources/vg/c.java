package vg;

import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.fg;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.rename.RenamePortfolioBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.e0;
import ea.f0;
import gd.h;
import ig.f;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import m.v2;
import ni.j;
import okhttp3.HttpUrl;
import qu.i0;
import ut.g;
import xf.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvg/c;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/portfolio/rename/RenamePortfolioBottomSheetViewModel;", "Lba/fg;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends h<RenamePortfolioBottomSheetViewModel, fg> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f38040j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final g f38041i = ut.h.a(new ag.b(this, 12));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        PortfolioRepository portfolioRepository = bottomSheetDialogFragmentComponent.f14246a.j();
        yk.g.i(portfolioRepository);
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        ca.c factory = new ca.c(a0.a(RenamePortfolioBottomSheetViewModel.class), new e0(schedulerProvider, compositeDisposable, portfolioRepository, 0));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, RenamePortfolioBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(RenamePortfolioBottomSheetViewModel.class, "<this>", RenamePortfolioBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            RenamePortfolioBottomSheetViewModel renamePortfolioBottomSheetViewModel = (RenamePortfolioBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(renamePortfolioBottomSheetViewModel);
            this.f17270b = renamePortfolioBottomSheetViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            yk.g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            yk.g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            yk.g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_bottom_sheet_rename_portfolio;
    }

    @Override // gd.h
    public final void y() {
        super.y();
        ((RenamePortfolioBottomSheetViewModel) t()).f9070f.observe(this, new v(21, new b(this, 0)));
        ((RenamePortfolioBottomSheetViewModel) t()).f9927h.observe(this, new v(21, new b(this, 1)));
    }

    @Override // gd.h
    public final void z(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("PORTFOLIO_ID");
        } else {
            str = null;
        }
        if (str != null) {
            RenamePortfolioBottomSheetViewModel renamePortfolioBottomSheetViewModel = (RenamePortfolioBottomSheetViewModel) t();
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            renamePortfolioBottomSheetViewModel.f9930k = str;
        }
        fg fgVar = (fg) r();
        fgVar.f4706x.addTextChangedListener(new v2(this, 5));
        fg fgVar2 = (fg) r();
        final int i10 = 1;
        fgVar2.f4706x.setOnEditorActionListener(new jc.c(this, i10));
        fg fgVar3 = (fg) r();
        final int i11 = 0;
        fgVar3.f4708z.setOnClickListener(new View.OnClickListener(this) { // from class: vg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f38037b;

            {
                this.f38037b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                boolean z10;
                int i12 = i11;
                c this$0 = this.f38037b;
                switch (i12) {
                    case 0:
                        int i13 = c.f38040j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((fg) this$0.r()).f4705w.setText(((fg) this$0.r()).f4706x.getText().toString());
                        g gVar = this$0.f38041i;
                        Portfolio portfolio = (Portfolio) ((PortfolioDetailViewModel) gVar.getValue()).I.getValue();
                        if (portfolio == null || (str2 = portfolio.getAssetClass()) == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (Intrinsics.a(str2, "EQUITY")) {
                            RenamePortfolioBottomSheetViewModel renamePortfolioBottomSheetViewModel2 = (RenamePortfolioBottomSheetViewModel) this$0.t();
                            String portfolioName = ((fg) this$0.r()).f4706x.getText().toString();
                            String portfolioId = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9930k;
                            Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            renamePortfolioBottomSheetViewModel2.f9070f.postValue(Boolean.TRUE);
                            renamePortfolioBottomSheetViewModel2.f9927h.postValue(Boolean.FALSE);
                            nt.h c10 = renamePortfolioBottomSheetViewModel2.f9926g.renamePortfolio(portfolioName, portfolioId).c(((kq.e) renamePortfolioBottomSheetViewModel2.f9066b).J());
                            jt.d dVar = new jt.d(new d(0, new e(renamePortfolioBottomSheetViewModel2, 0)), new d(1, new e(renamePortfolioBottomSheetViewModel2, 1)));
                            c10.a(dVar);
                            renamePortfolioBottomSheetViewModel2.f9067c.e(dVar);
                        } else if (Intrinsics.a(str2, "OPTIONS")) {
                            String str3 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9929j;
                            String str4 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9930k;
                            Portfolio portfolio2 = (Portfolio) ((PortfolioDetailViewModel) gVar.getValue()).I.getValue();
                            if (portfolio2 != null) {
                                z10 = portfolio2.isModelPortfolio();
                            } else {
                                z10 = true;
                            }
                            jg.a body = new jg.a(str3, str4, z10, 1);
                            PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) gVar.getValue();
                            portfolioDetailViewModel.getClass();
                            Intrinsics.checkNotNullParameter(body, "body");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                portfolioDetailViewModel.f9083f.setValue(j.i("Not connected to internet"));
                            } else {
                                try {
                                    yk.g.H(u0.f(portfolioDetailViewModel), null, null, new f(portfolioDetailViewModel, body, null), 3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        PortfolioDetailViewModel portfolioDetailViewModel2 = (PortfolioDetailViewModel) gVar.getValue();
                        String portfolioName2 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9929j;
                        String portfolioId2 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9930k;
                        portfolioDetailViewModel2.getClass();
                        Intrinsics.checkNotNullParameter(portfolioName2, "portfolioName");
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        portfolioDetailViewModel2.f9780q.postValue(new BottomSheetItem(portfolioName2, portfolioId2));
                        TranslateAnimation translateAnimation = new TranslateAnimation(s0.g.f34069a, -600.0f, s0.g.f34069a, s0.g.f34069a);
                        translateAnimation.setDuration(600L);
                        ((fg) this$0.r()).f4703u.startAnimation(translateAnimation);
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(600.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
                        translateAnimation2.setDuration(600L);
                        ((fg) this$0.r()).f4704v.setVisibility(0);
                        ((fg) this$0.r()).f4704v.startAnimation(translateAnimation2);
                        ((fg) this$0.r()).f4704v.postOnAnimation(new androidx.activity.b(this$0, 27));
                        return;
                    case 1:
                        int i14 = c.f38040j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismissAllowingStateLoss();
                        return;
                    default:
                        int i15 = c.f38040j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        fg fgVar4 = (fg) r();
        fgVar4.f4702t.setOnClickListener(new View.OnClickListener(this) { // from class: vg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f38037b;

            {
                this.f38037b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                boolean z10;
                int i12 = i10;
                c this$0 = this.f38037b;
                switch (i12) {
                    case 0:
                        int i13 = c.f38040j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((fg) this$0.r()).f4705w.setText(((fg) this$0.r()).f4706x.getText().toString());
                        g gVar = this$0.f38041i;
                        Portfolio portfolio = (Portfolio) ((PortfolioDetailViewModel) gVar.getValue()).I.getValue();
                        if (portfolio == null || (str2 = portfolio.getAssetClass()) == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (Intrinsics.a(str2, "EQUITY")) {
                            RenamePortfolioBottomSheetViewModel renamePortfolioBottomSheetViewModel2 = (RenamePortfolioBottomSheetViewModel) this$0.t();
                            String portfolioName = ((fg) this$0.r()).f4706x.getText().toString();
                            String portfolioId = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9930k;
                            Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            renamePortfolioBottomSheetViewModel2.f9070f.postValue(Boolean.TRUE);
                            renamePortfolioBottomSheetViewModel2.f9927h.postValue(Boolean.FALSE);
                            nt.h c10 = renamePortfolioBottomSheetViewModel2.f9926g.renamePortfolio(portfolioName, portfolioId).c(((kq.e) renamePortfolioBottomSheetViewModel2.f9066b).J());
                            jt.d dVar = new jt.d(new d(0, new e(renamePortfolioBottomSheetViewModel2, 0)), new d(1, new e(renamePortfolioBottomSheetViewModel2, 1)));
                            c10.a(dVar);
                            renamePortfolioBottomSheetViewModel2.f9067c.e(dVar);
                        } else if (Intrinsics.a(str2, "OPTIONS")) {
                            String str3 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9929j;
                            String str4 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9930k;
                            Portfolio portfolio2 = (Portfolio) ((PortfolioDetailViewModel) gVar.getValue()).I.getValue();
                            if (portfolio2 != null) {
                                z10 = portfolio2.isModelPortfolio();
                            } else {
                                z10 = true;
                            }
                            jg.a body = new jg.a(str3, str4, z10, 1);
                            PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) gVar.getValue();
                            portfolioDetailViewModel.getClass();
                            Intrinsics.checkNotNullParameter(body, "body");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                portfolioDetailViewModel.f9083f.setValue(j.i("Not connected to internet"));
                            } else {
                                try {
                                    yk.g.H(u0.f(portfolioDetailViewModel), null, null, new f(portfolioDetailViewModel, body, null), 3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        PortfolioDetailViewModel portfolioDetailViewModel2 = (PortfolioDetailViewModel) gVar.getValue();
                        String portfolioName2 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9929j;
                        String portfolioId2 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9930k;
                        portfolioDetailViewModel2.getClass();
                        Intrinsics.checkNotNullParameter(portfolioName2, "portfolioName");
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        portfolioDetailViewModel2.f9780q.postValue(new BottomSheetItem(portfolioName2, portfolioId2));
                        TranslateAnimation translateAnimation = new TranslateAnimation(s0.g.f34069a, -600.0f, s0.g.f34069a, s0.g.f34069a);
                        translateAnimation.setDuration(600L);
                        ((fg) this$0.r()).f4703u.startAnimation(translateAnimation);
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(600.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
                        translateAnimation2.setDuration(600L);
                        ((fg) this$0.r()).f4704v.setVisibility(0);
                        ((fg) this$0.r()).f4704v.startAnimation(translateAnimation2);
                        ((fg) this$0.r()).f4704v.postOnAnimation(new androidx.activity.b(this$0, 27));
                        return;
                    case 1:
                        int i14 = c.f38040j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismissAllowingStateLoss();
                        return;
                    default:
                        int i15 = c.f38040j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        fg fgVar5 = (fg) r();
        final int i12 = 2;
        fgVar5.f4701s.setOnClickListener(new View.OnClickListener(this) { // from class: vg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f38037b;

            {
                this.f38037b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                boolean z10;
                int i122 = i12;
                c this$0 = this.f38037b;
                switch (i122) {
                    case 0:
                        int i13 = c.f38040j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((fg) this$0.r()).f4705w.setText(((fg) this$0.r()).f4706x.getText().toString());
                        g gVar = this$0.f38041i;
                        Portfolio portfolio = (Portfolio) ((PortfolioDetailViewModel) gVar.getValue()).I.getValue();
                        if (portfolio == null || (str2 = portfolio.getAssetClass()) == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (Intrinsics.a(str2, "EQUITY")) {
                            RenamePortfolioBottomSheetViewModel renamePortfolioBottomSheetViewModel2 = (RenamePortfolioBottomSheetViewModel) this$0.t();
                            String portfolioName = ((fg) this$0.r()).f4706x.getText().toString();
                            String portfolioId = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9930k;
                            Intrinsics.checkNotNullParameter(portfolioName, "portfolioName");
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            renamePortfolioBottomSheetViewModel2.f9070f.postValue(Boolean.TRUE);
                            renamePortfolioBottomSheetViewModel2.f9927h.postValue(Boolean.FALSE);
                            nt.h c10 = renamePortfolioBottomSheetViewModel2.f9926g.renamePortfolio(portfolioName, portfolioId).c(((kq.e) renamePortfolioBottomSheetViewModel2.f9066b).J());
                            jt.d dVar = new jt.d(new d(0, new e(renamePortfolioBottomSheetViewModel2, 0)), new d(1, new e(renamePortfolioBottomSheetViewModel2, 1)));
                            c10.a(dVar);
                            renamePortfolioBottomSheetViewModel2.f9067c.e(dVar);
                        } else if (Intrinsics.a(str2, "OPTIONS")) {
                            String str3 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9929j;
                            String str4 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9930k;
                            Portfolio portfolio2 = (Portfolio) ((PortfolioDetailViewModel) gVar.getValue()).I.getValue();
                            if (portfolio2 != null) {
                                z10 = portfolio2.isModelPortfolio();
                            } else {
                                z10 = true;
                            }
                            jg.a body = new jg.a(str3, str4, z10, 1);
                            PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) gVar.getValue();
                            portfolioDetailViewModel.getClass();
                            Intrinsics.checkNotNullParameter(body, "body");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                portfolioDetailViewModel.f9083f.setValue(j.i("Not connected to internet"));
                            } else {
                                try {
                                    yk.g.H(u0.f(portfolioDetailViewModel), null, null, new f(portfolioDetailViewModel, body, null), 3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        PortfolioDetailViewModel portfolioDetailViewModel2 = (PortfolioDetailViewModel) gVar.getValue();
                        String portfolioName2 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9929j;
                        String portfolioId2 = ((RenamePortfolioBottomSheetViewModel) this$0.t()).f9930k;
                        portfolioDetailViewModel2.getClass();
                        Intrinsics.checkNotNullParameter(portfolioName2, "portfolioName");
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        portfolioDetailViewModel2.f9780q.postValue(new BottomSheetItem(portfolioName2, portfolioId2));
                        TranslateAnimation translateAnimation = new TranslateAnimation(s0.g.f34069a, -600.0f, s0.g.f34069a, s0.g.f34069a);
                        translateAnimation.setDuration(600L);
                        ((fg) this$0.r()).f4703u.startAnimation(translateAnimation);
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(600.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
                        translateAnimation2.setDuration(600L);
                        ((fg) this$0.r()).f4704v.setVisibility(0);
                        ((fg) this$0.r()).f4704v.startAnimation(translateAnimation2);
                        ((fg) this$0.r()).f4704v.postOnAnimation(new androidx.activity.b(this$0, 27));
                        return;
                    case 1:
                        int i14 = c.f38040j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismissAllowingStateLoss();
                        return;
                    default:
                        int i15 = c.f38040j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
    }
}
