package wg;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.hg;
import ca.c;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.reset.ResetPortfolioBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.e0;
import ea.f0;
import gd.h;
import iu.a0;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import ni.j;
import qu.i0;
import ut.g;
import xf.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lwg/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/portfolio/reset/ResetPortfolioBottomSheetViewModel;", "Lba/hg;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends h<ResetPortfolioBottomSheetViewModel, hg> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f39065j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final g f39066i = ut.h.a(new ag.b(this, 13));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        PortfolioRepository portfolioRepository = bottomSheetDialogFragmentComponent.f14246a.j();
        yk.g.i(portfolioRepository);
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        c factory = new c(a0.a(ResetPortfolioBottomSheetViewModel.class), new e0(schedulerProvider, compositeDisposable, portfolioRepository, 1));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, ResetPortfolioBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ResetPortfolioBottomSheetViewModel.class, "<this>", ResetPortfolioBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ResetPortfolioBottomSheetViewModel resetPortfolioBottomSheetViewModel = (ResetPortfolioBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(resetPortfolioBottomSheetViewModel);
            this.f17270b = resetPortfolioBottomSheetViewModel;
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
        return R.layout.fragment_bottom_sheet_reset_portfolio;
    }

    @Override // gd.h
    public final void y() {
        super.y();
        ((ResetPortfolioBottomSheetViewModel) t()).f9070f.observe(this, new v(22, new qg.a(this, 3)));
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
            ResetPortfolioBottomSheetViewModel resetPortfolioBottomSheetViewModel = (ResetPortfolioBottomSheetViewModel) t();
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            resetPortfolioBottomSheetViewModel.f9931g = str;
        }
        hg hgVar = (hg) r();
        final int i10 = 0;
        hgVar.f4938u.setOnClickListener(new View.OnClickListener(this) { // from class: wg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f39064b;

            {
                this.f39064b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i11 = i10;
                b this$0 = this.f39064b;
                switch (i11) {
                    case 0:
                        int i12 = b.f39065j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Portfolio portfolio = (Portfolio) ((PortfolioDetailViewModel) this$0.f39066i.getValue()).I.getValue();
                        if (portfolio != null) {
                            str2 = portfolio.getAssetClass();
                        } else {
                            str2 = null;
                        }
                        boolean a10 = Intrinsics.a(str2, "EQUITY");
                        boolean z10 = true;
                        g gVar = this$0.f39066i;
                        if (a10) {
                            PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) gVar.getValue();
                            String portfolioId = ((ResetPortfolioBottomSheetViewModel) this$0.t()).f9931g;
                            portfolioDetailViewModel.getClass();
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            portfolioDetailViewModel.f9084g.postValue(Boolean.TRUE);
                            ct.a aVar = portfolioDetailViewModel.f9080c;
                            aVar.f();
                            nt.h c10 = portfolioDetailViewModel.f9777n.resetPortfolio(portfolioId).c(((e) portfolioDetailViewModel.f9079b).J());
                            d dVar = new d(new fg.g(8, new ig.h(portfolioDetailViewModel, 0)), new fg.g(9, new ig.h(portfolioDetailViewModel, 1)));
                            c10.a(dVar);
                            aVar.e(dVar);
                        } else if (Intrinsics.a(str2, "OPTIONS")) {
                            String str3 = ((ResetPortfolioBottomSheetViewModel) this$0.t()).f9931g;
                            Portfolio portfolio2 = (Portfolio) ((PortfolioDetailViewModel) gVar.getValue()).I.getValue();
                            if (portfolio2 != null) {
                                z10 = portfolio2.isModelPortfolio();
                            }
                            jg.a body = new jg.a((String) null, str3, z10, 3);
                            PortfolioDetailViewModel portfolioDetailViewModel2 = (PortfolioDetailViewModel) gVar.getValue();
                            portfolioDetailViewModel2.getClass();
                            Intrinsics.checkNotNullParameter(body, "body");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                portfolioDetailViewModel2.f9083f.setValue(j.i("Not connected to internet"));
                            } else {
                                try {
                                    yk.g.H(u0.f(portfolioDetailViewModel2), null, null, new ig.g(portfolioDetailViewModel2, body, null), 3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        this$0.dismissAllowingStateLoss();
                        return;
                    default:
                        int i13 = b.f39065j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        hg hgVar2 = (hg) r();
        final int i11 = 1;
        hgVar2.f4936s.setOnClickListener(new View.OnClickListener(this) { // from class: wg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f39064b;

            {
                this.f39064b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                int i112 = i11;
                b this$0 = this.f39064b;
                switch (i112) {
                    case 0:
                        int i12 = b.f39065j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Portfolio portfolio = (Portfolio) ((PortfolioDetailViewModel) this$0.f39066i.getValue()).I.getValue();
                        if (portfolio != null) {
                            str2 = portfolio.getAssetClass();
                        } else {
                            str2 = null;
                        }
                        boolean a10 = Intrinsics.a(str2, "EQUITY");
                        boolean z10 = true;
                        g gVar = this$0.f39066i;
                        if (a10) {
                            PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) gVar.getValue();
                            String portfolioId = ((ResetPortfolioBottomSheetViewModel) this$0.t()).f9931g;
                            portfolioDetailViewModel.getClass();
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            portfolioDetailViewModel.f9084g.postValue(Boolean.TRUE);
                            ct.a aVar = portfolioDetailViewModel.f9080c;
                            aVar.f();
                            nt.h c10 = portfolioDetailViewModel.f9777n.resetPortfolio(portfolioId).c(((e) portfolioDetailViewModel.f9079b).J());
                            d dVar = new d(new fg.g(8, new ig.h(portfolioDetailViewModel, 0)), new fg.g(9, new ig.h(portfolioDetailViewModel, 1)));
                            c10.a(dVar);
                            aVar.e(dVar);
                        } else if (Intrinsics.a(str2, "OPTIONS")) {
                            String str3 = ((ResetPortfolioBottomSheetViewModel) this$0.t()).f9931g;
                            Portfolio portfolio2 = (Portfolio) ((PortfolioDetailViewModel) gVar.getValue()).I.getValue();
                            if (portfolio2 != null) {
                                z10 = portfolio2.isModelPortfolio();
                            }
                            jg.a body = new jg.a((String) null, str3, z10, 3);
                            PortfolioDetailViewModel portfolioDetailViewModel2 = (PortfolioDetailViewModel) gVar.getValue();
                            portfolioDetailViewModel2.getClass();
                            Intrinsics.checkNotNullParameter(body, "body");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                portfolioDetailViewModel2.f9083f.setValue(j.i("Not connected to internet"));
                            } else {
                                try {
                                    yk.g.H(u0.f(portfolioDetailViewModel2), null, null, new ig.g(portfolioDetailViewModel2, body, null), 3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        this$0.dismissAllowingStateLoss();
                        return;
                    default:
                        int i13 = b.f39065j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
    }
}
