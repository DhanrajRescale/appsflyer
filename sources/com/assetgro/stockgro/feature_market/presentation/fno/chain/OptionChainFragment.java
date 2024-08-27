package com.assetgro.stockgro.feature_market.presentation.fno.chain;

import a3.a;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.g;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.kh;
import ba.lh;
import ca.c;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.n0;
import ea.q;
import f7.i;
import ga.b;
import ga.d;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp.j;
import kq.e;
import qu.i0;
import y.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_market/presentation/fno/chain/OptionChainFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_market/presentation/fno/chain/OptionChainViewModel;", "Lba/kh;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OptionChainFragment extends m<OptionChainViewModel, kh> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8581h = 0;

    /* renamed from: g, reason: collision with root package name */
    public b f8582g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_fno_option_chain;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((OptionChainViewModel) r()).f8586p.observe(this, new i(1, new d(this, 0)));
        ((OptionChainViewModel) r()).f8588r.observe(this, new i(1, new d(this, 1)));
        ((OptionChainViewModel) r()).f8590t.observe(this, new i(1, new d(this, 2)));
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        Boolean bool;
        Parcelable parcelable;
        FnoOption fnoOption;
        Intrinsics.checkNotNullParameter(view, "view");
        lh lhVar = (lh) ((kh) q());
        lhVar.C = (OptionChainViewModel) r();
        synchronized (lhVar) {
            lhVar.E |= 4;
        }
        lhVar.a(24);
        lhVar.m();
        ((kh) q()).p(this);
        Toolbar toolbar = ((kh) q()).A;
        boolean z10 = false;
        final byte b10 = 0 == true ? 1 : 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ga.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OptionChainFragment f17178b;

            {
                this.f17178b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i10 = b10;
                OptionChainFragment this$0 = this.f17178b;
                switch (i10) {
                    case 0:
                        int i11 = OptionChainFragment.f8581h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    default:
                        int i12 = OptionChainFragment.f8581h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_optlist_guide", null, 2, null);
                        this$0.z(analyticEvent);
                        this$0.B(analyticEvent);
                        Boolean bool2 = (Boolean) ((OptionChainViewModel) this$0.r()).f8590t.getValue();
                        if (bool2 == null) {
                            bool2 = Boolean.FALSE;
                        }
                        boolean booleanValue = bool2.booleanValue();
                        k kVar = new k();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_put_call_boolean", booleanValue);
                        kVar.setArguments(bundle);
                        kVar.show(this$0.requireActivity().getSupportFragmentManager(), "UnderstandingOptionBottomSheet");
                        return;
                }
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("PORTFOLIO_ID");
        } else {
            str = null;
        }
        j.J(a.f("Portfolio Id: ", str), new Object[0]);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            bool = Boolean.valueOf(arguments2.getBoolean("IS_MODEL"));
        } else {
            bool = null;
        }
        j.J("isModel Portfolio " + bool, new Object[0]);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            parcelable = arguments3.getParcelable("DATA");
        } else {
            parcelable = null;
        }
        j.J("FnoOption " + parcelable, new Object[0]);
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z10 = arguments4.getBoolean("CALL_FROM_PORTFOLIO");
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            fnoOption = (FnoOption) arguments5.getParcelable("DATA");
        } else {
            fnoOption = null;
        }
        if (!(fnoOption instanceof FnoOption)) {
            fnoOption = null;
        }
        if (fnoOption != null) {
            H(fnoOption);
            o lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            this.f8582g = new b(lifecycle, fnoOption, new r0(this, fnoOption, z10, 4));
            RecyclerView recyclerView = ((kh) q()).f5245u;
            b bVar = this.f8582g;
            if (bVar != null) {
                recyclerView.setAdapter(bVar);
                ((OptionChainViewModel) r()).h(fnoOption.getIdentifier());
                ((kh) q()).f5247w.setOnRefreshListener(new g(14, this, fnoOption));
                final int i10 = 1;
                ((kh) q()).B.setOnClickListener(new View.OnClickListener(this) { // from class: ga.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ OptionChainFragment f17178b;

                    {
                        this.f17178b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i102 = i10;
                        OptionChainFragment this$0 = this.f17178b;
                        switch (i102) {
                            case 0:
                                int i11 = OptionChainFragment.f8581h;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.requireActivity().finish();
                                return;
                            default:
                                int i12 = OptionChainFragment.f8581h;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                AnalyticEvent analyticEvent = new AnalyticEvent("app_market_optlist_guide", null, 2, null);
                                this$0.z(analyticEvent);
                                this$0.B(analyticEvent);
                                Boolean bool2 = (Boolean) ((OptionChainViewModel) this$0.r()).f8590t.getValue();
                                if (bool2 == null) {
                                    bool2 = Boolean.FALSE;
                                }
                                boolean booleanValue = bool2.booleanValue();
                                k kVar = new k();
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("is_put_call_boolean", booleanValue);
                                kVar.setArguments(bundle);
                                kVar.show(this$0.requireActivity().getSupportFragmentManager(), "UnderstandingOptionBottomSheet");
                                return;
                        }
                    }
                });
                return;
            }
            Intrinsics.k("optionChainAdapter");
            throw null;
        }
    }

    public final void H(FnoOption fnoOption) {
        kh khVar = (kh) q();
        String name = fnoOption.getName();
        khVar.f5244t.m(fnoOption.getLtp(), name, fnoOption.getImageUrl());
        ChangeDto change = fnoOption.getChange();
        if (change != null) {
            ((kh) q()).f5244t.n(change);
        }
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        FnoRepository fnoRepository = bVar.e();
        yk.g.i(fnoRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        c factory = new c(a0.a(OptionChainViewModel.class), new q(k10, c10, userRepository, fnoRepository, 3));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, OptionChainViewModel.class, "modelClass");
        iu.e b10 = a.b(OptionChainViewModel.class, "<this>", OptionChainViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            OptionChainViewModel optionChainViewModel = (OptionChainViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(optionChainViewModel);
            this.f17284b = optionChainViewModel;
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
