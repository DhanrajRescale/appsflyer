package com.assetgro.stockgro.ui.portfolio.unlock.detail;

import ah.a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.navigation.i;
import ba.op;
import com.assetgro.stockgro.data.remote.request.UnlockPortfolioRequest;
import com.assetgro.stockgro.data.remote.response.ExpiryOption;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioData;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.unlock.detail.UnlockPortfolioDetailFragment;
import com.assetgro.stockgro.ui.portfolio.unlock.detail.UnlockPortfolioDetailViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import jr.h;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import q6.l;
import qu.i0;
import vt.y;
import xf.v;
import xf.x;
import yg.b;
import yg.c;
import yg.d;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/unlock/detail/UnlockPortfolioDetailFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/portfolio/unlock/detail/UnlockPortfolioDetailViewModel;", "Lba/op;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UnlockPortfolioDetailFragment extends m<UnlockPortfolioDetailViewModel, op> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9941j = 0;

    /* renamed from: g, reason: collision with root package name */
    public a f9942g;

    /* renamed from: h, reason: collision with root package name */
    public zg.a f9943h;

    /* renamed from: i, reason: collision with root package name */
    public final i f9944i = new i(a0.a(d.class), new x(this, 2));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_unlock_portfolio_details;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((UnlockPortfolioDetailViewModel) r()).f9084g.observe(this, new v(24, new b(this, 0)));
        ((UnlockPortfolioDetailViewModel) r()).f9948q.observe(this, new v(24, new b(this, 1)));
        ((UnlockPortfolioDetailViewModel) r()).f9951t.observe(this, new v(24, c.f41627b));
        ((UnlockPortfolioDetailViewModel) r()).f9953v.observe(this, new v(24, new b(this, 2)));
        UnlockPortfolioDetailViewModel unlockPortfolioDetailViewModel = (UnlockPortfolioDetailViewModel) r();
        unlockPortfolioDetailViewModel.f9957z.observe(this, new v(24, new b(this, 3)));
        ((UnlockPortfolioDetailViewModel) r()).f9952u.observe(this, new v(24, new b(this, 4)));
        ((UnlockPortfolioDetailViewModel) r()).f9954w.observe(this, new v(24, new b(this, 5)));
        ((UnlockPortfolioDetailViewModel) r()).f9956y.observe(this, new v(24, new b(this, 6)));
        ((UnlockPortfolioDetailViewModel) r()).f9087j.observe(this, new v(24, new b(this, 7)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        final int i10 = 0;
        this.f9942g = new a(lifecycle, false, c.f41628c);
        op opVar = (op) q();
        a aVar = this.f9942g;
        if (aVar != null) {
            opVar.f5679v.setAdapter(aVar);
            a aVar2 = this.f9942g;
            if (aVar2 != null) {
                i iVar = this.f9944i;
                aVar2.u(y.c(((d) iVar.getValue()).f41632a));
                ((UnlockPortfolioDetailViewModel) r()).f9949r.postValue(((d) iVar.getValue()).f41632a);
                o lifecycle2 = getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
                this.f9943h = new zg.a(lifecycle2, new b(this, 8));
                op opVar2 = (op) q();
                zg.a aVar3 = this.f9943h;
                if (aVar3 != null) {
                    opVar2.f5677t.setAdapter(aVar3);
                    ((UnlockPortfolioDetailViewModel) r()).f9948q.postValue(((d) iVar.getValue()).f41632a.getExpiry_options());
                    ((UnlockPortfolioDetailViewModel) r()).f9950s.postValue(((d) iVar.getValue()).f41633b);
                    op opVar3 = (op) q();
                    String portfolioName = ((d) iVar.getValue()).f41632a.getPortfolioName();
                    Toolbar toolbar = opVar3.f5680w;
                    toolbar.setTitle(portfolioName);
                    p(toolbar);
                    toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: yg.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ UnlockPortfolioDetailFragment f41624b;

                        {
                            this.f41624b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i11 = i10;
                            UnlockPortfolioDetailFragment this$0 = this.f41624b;
                            switch (i11) {
                                case 0:
                                    int i12 = UnlockPortfolioDetailFragment.f9941j;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    l.h(this$0).p();
                                    return;
                                default:
                                    int i13 = UnlockPortfolioDetailFragment.f9941j;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    UnlockPortfolioDetailViewModel unlockPortfolioDetailViewModel = (UnlockPortfolioDetailViewModel) this$0.r();
                                    if (unlockPortfolioDetailViewModel.f9955x) {
                                        e0 e0Var = unlockPortfolioDetailViewModel.f9956y;
                                        Bundle h10 = h.h("REDIRECT", true);
                                        ExpiryOption expiryOption = unlockPortfolioDetailViewModel.f9947p;
                                        Intrinsics.c(expiryOption);
                                        h10.putFloat("RECHARGE_AMOUNT", (float) expiryOption.getPrice());
                                        e0Var.postValue(new j(h10));
                                        return;
                                    }
                                    e0 e0Var2 = unlockPortfolioDetailViewModel.f9949r;
                                    if (e0Var2.getValue() != null && unlockPortfolioDetailViewModel.f9947p != null) {
                                        Object value = e0Var2.getValue();
                                        Intrinsics.c(value);
                                        String portfolioName2 = ((UnlockPortfolioData) value).getPortfolioName();
                                        Object value2 = e0Var2.getValue();
                                        Intrinsics.c(value2);
                                        String portfolioType = ((UnlockPortfolioData) value2).getPortfolioType();
                                        Object value3 = e0Var2.getValue();
                                        Intrinsics.c(value3);
                                        long portfolioValueLimit = ((UnlockPortfolioData) value3).getPortfolioValueLimit();
                                        Object value4 = e0Var2.getValue();
                                        Intrinsics.c(value4);
                                        String transactionFeeType = ((UnlockPortfolioData) value4).getTransactionFeeType();
                                        ExpiryOption expiryOption2 = unlockPortfolioDetailViewModel.f9947p;
                                        Intrinsics.c(expiryOption2);
                                        int date = expiryOption2.getDate();
                                        ExpiryOption expiryOption3 = unlockPortfolioDetailViewModel.f9947p;
                                        Intrinsics.c(expiryOption3);
                                        UnlockPortfolioRequest unlockPortfolioRequest = new UnlockPortfolioRequest(portfolioName2, portfolioType, portfolioValueLimit, transactionFeeType, date, expiryOption3.getPrice());
                                        unlockPortfolioDetailViewModel.f9084g.postValue(Boolean.TRUE);
                                        nt.h c10 = unlockPortfolioDetailViewModel.f9945n.unlockPortfolio(unlockPortfolioRequest).c(((kq.e) unlockPortfolioDetailViewModel.f9079b).J());
                                        jt.d dVar = new jt.d(new vg.d(7, new e(unlockPortfolioDetailViewModel, 4)), new vg.d(8, new e(unlockPortfolioDetailViewModel, 5)));
                                        c10.a(dVar);
                                        unlockPortfolioDetailViewModel.f9080c.e(dVar);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    op opVar4 = (op) q();
                    final int i11 = 1;
                    opVar4.f5676s.setOnClickListener(new View.OnClickListener(this) { // from class: yg.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ UnlockPortfolioDetailFragment f41624b;

                        {
                            this.f41624b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i112 = i11;
                            UnlockPortfolioDetailFragment this$0 = this.f41624b;
                            switch (i112) {
                                case 0:
                                    int i12 = UnlockPortfolioDetailFragment.f9941j;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    l.h(this$0).p();
                                    return;
                                default:
                                    int i13 = UnlockPortfolioDetailFragment.f9941j;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    UnlockPortfolioDetailViewModel unlockPortfolioDetailViewModel = (UnlockPortfolioDetailViewModel) this$0.r();
                                    if (unlockPortfolioDetailViewModel.f9955x) {
                                        e0 e0Var = unlockPortfolioDetailViewModel.f9956y;
                                        Bundle h10 = h.h("REDIRECT", true);
                                        ExpiryOption expiryOption = unlockPortfolioDetailViewModel.f9947p;
                                        Intrinsics.c(expiryOption);
                                        h10.putFloat("RECHARGE_AMOUNT", (float) expiryOption.getPrice());
                                        e0Var.postValue(new j(h10));
                                        return;
                                    }
                                    e0 e0Var2 = unlockPortfolioDetailViewModel.f9949r;
                                    if (e0Var2.getValue() != null && unlockPortfolioDetailViewModel.f9947p != null) {
                                        Object value = e0Var2.getValue();
                                        Intrinsics.c(value);
                                        String portfolioName2 = ((UnlockPortfolioData) value).getPortfolioName();
                                        Object value2 = e0Var2.getValue();
                                        Intrinsics.c(value2);
                                        String portfolioType = ((UnlockPortfolioData) value2).getPortfolioType();
                                        Object value3 = e0Var2.getValue();
                                        Intrinsics.c(value3);
                                        long portfolioValueLimit = ((UnlockPortfolioData) value3).getPortfolioValueLimit();
                                        Object value4 = e0Var2.getValue();
                                        Intrinsics.c(value4);
                                        String transactionFeeType = ((UnlockPortfolioData) value4).getTransactionFeeType();
                                        ExpiryOption expiryOption2 = unlockPortfolioDetailViewModel.f9947p;
                                        Intrinsics.c(expiryOption2);
                                        int date = expiryOption2.getDate();
                                        ExpiryOption expiryOption3 = unlockPortfolioDetailViewModel.f9947p;
                                        Intrinsics.c(expiryOption3);
                                        UnlockPortfolioRequest unlockPortfolioRequest = new UnlockPortfolioRequest(portfolioName2, portfolioType, portfolioValueLimit, transactionFeeType, date, expiryOption3.getPrice());
                                        unlockPortfolioDetailViewModel.f9084g.postValue(Boolean.TRUE);
                                        nt.h c10 = unlockPortfolioDetailViewModel.f9945n.unlockPortfolio(unlockPortfolioRequest).c(((kq.e) unlockPortfolioDetailViewModel.f9079b).J());
                                        jt.d dVar = new jt.d(new vg.d(7, new e(unlockPortfolioDetailViewModel, 4)), new vg.d(8, new e(unlockPortfolioDetailViewModel, 5)));
                                        c10.a(dVar);
                                        unlockPortfolioDetailViewModel.f9080c.e(dVar);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                Intrinsics.k("unlockPortfolioExpiryOptionAdapter");
                throw null;
            }
            Intrinsics.k("unlockPortfolioAdapter");
            throw null;
        }
        Intrinsics.k("unlockPortfolioAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10021) {
            if (i11 != -1) {
                if (i11 == 0) {
                    ((UnlockPortfolioDetailViewModel) r()).h();
                    return;
                }
                return;
            }
            ((UnlockPortfolioDetailViewModel) r()).h();
        }
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        PortfolioRepository portfolioRepository = bVar.j();
        g.i(portfolioRepository);
        PaymentRepository paymentRepository = bVar.i();
        g.i(paymentRepository);
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(UnlockPortfolioDetailViewModel.class), new z2.e(k10, c10, portfolioRepository, paymentRepository, userRepository, 10));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, UnlockPortfolioDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(UnlockPortfolioDetailViewModel.class, "<this>", UnlockPortfolioDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            UnlockPortfolioDetailViewModel unlockPortfolioDetailViewModel = (UnlockPortfolioDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(unlockPortfolioDetailViewModel);
            this.f17284b = unlockPortfolioDetailViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
