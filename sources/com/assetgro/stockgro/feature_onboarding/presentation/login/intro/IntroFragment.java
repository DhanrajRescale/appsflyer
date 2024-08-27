package com.assetgro.stockgro.feature_onboarding.presentation.login.intro;

import ab.l;
import android.os.Bundle;
import android.view.View;
import androidx.activity.w;
import androidx.fragment.app.d1;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.navigation.i;
import androidx.navigation.t;
import b4.d;
import ba.ei;
import c2.e1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.a;
import com.assetgro.stockgro.data.model.IntroModel;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.intro.IntroFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.intro.IntroViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.j0;
import ea.o0;
import gd.m;
import iu.a0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jt.e;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import mt.f;
import qu.i0;
import za.b;
import za.c;
import za.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/intro/IntroFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/login/intro/IntroViewModel;", "Lba/ei;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class IntroFragment extends m<IntroViewModel, ei> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8714h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8715g = new i(a0.a(c.class), new z1(this, 4));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_intro;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((IntroViewModel) r()).f8718p.observe(this, new f7.i(23, new b(this, 0)));
        ((IntroViewModel) r()).f8717o.observe(this, new f7.i(23, new b(this, 1)));
        ((IntroViewModel) r()).f8719q.observe(this, new f7.i(23, new b(this, 2)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = new ArrayList();
        String string = getString(R.string.intro_slide_one_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.intro_slide_one_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new IntroModel(R.drawable.ic_intro_one, string, string2));
        String string3 = getString(R.string.intro_slide_two_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(R.string.intro_slide_two_message);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList.add(new IntroModel(R.drawable.ic_intro_two, string3, string4));
        String string5 = getString(R.string.intro_slide_three_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = getString(R.string.intro_slide_three_message);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList.add(new IntroModel(R.drawable.ic_intro_three, string5, string6));
        String string7 = getString(R.string.intro_slide_four_title);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = getString(R.string.intro_slide_four_message);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        arrayList.add(new IntroModel(R.drawable.ic_intro_four, string7, string8));
        i iVar = this.f8715g;
        if (((c) iVar.getValue()).f42210a) {
            l lVar = new l(((c) iVar.getValue()).f42211b, ((c) iVar.getValue()).f42212c, null, 4);
            t h10 = q6.l.h(this);
            Bundle bundle = new Bundle();
            bundle.putBoolean("isForcedLogout", lVar.f301a);
            bundle.putBoolean("invalidSession", lVar.f302b);
            bundle.putString("phoneNumber", lVar.f303c);
            h10.l(R.id.loginFlow, bundle, null);
            return;
        }
        ei eiVar = (ei) q();
        d1 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        eiVar.f4618t.setAdapter(new g(childFragmentManager, lifecycle, arrayList));
        ei eiVar2 = (ei) q();
        eiVar2.f4622x.setViewPager(((ei) q()).f4618t);
        ei eiVar3 = (ei) q();
        final int i10 = 0;
        eiVar3.f4617s.setOnClickListener(new View.OnClickListener(this) { // from class: za.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IntroFragment f42207b;

            {
                this.f42207b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                IntroFragment this$0 = this.f42207b;
                switch (i11) {
                    case 0:
                        int i12 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.x(new AnalyticEvent("app_onboarding_get_started_button", null, 2, null));
                        this$0.A(new AnalyticEvent("app_onboarding_get_started_button", null, 2, null));
                        ((IntroViewModel) this$0.r()).f8717o.postValue(new j(Unit.f23355a));
                        return;
                    case 1:
                        int i13 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.x(new AnalyticEvent("app_onboarding_login_button", null, 2, null));
                        this$0.A(new AnalyticEvent("app_onboarding_login_button", null, 2, null));
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                    case 2:
                        int i14 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                    default:
                        int i15 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                }
            }
        });
        w onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        final int i11 = 3;
        iu.j.i(onBackPressedDispatcher, getViewLifecycleOwner(), new b(this, 3));
        ei eiVar4 = (ei) q();
        final int i12 = 2;
        eiVar4.f4618t.a(new z7.c(this, 2));
        ((ei) q()).f4620v.setText(d.a(requireContext().getString(R.string.text_login_clickable), 0));
        ei eiVar5 = (ei) q();
        final int i13 = 1;
        eiVar5.f4620v.setOnClickListener(new View.OnClickListener(this) { // from class: za.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IntroFragment f42207b;

            {
                this.f42207b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i13;
                IntroFragment this$0 = this.f42207b;
                switch (i112) {
                    case 0:
                        int i122 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.x(new AnalyticEvent("app_onboarding_get_started_button", null, 2, null));
                        this$0.A(new AnalyticEvent("app_onboarding_get_started_button", null, 2, null));
                        ((IntroViewModel) this$0.r()).f8717o.postValue(new j(Unit.f23355a));
                        return;
                    case 1:
                        int i132 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.x(new AnalyticEvent("app_onboarding_login_button", null, 2, null));
                        this$0.A(new AnalyticEvent("app_onboarding_login_button", null, 2, null));
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                    case 2:
                        int i14 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                    default:
                        int i15 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                }
            }
        });
        ei eiVar6 = (ei) q();
        eiVar6.f4621w.setOnClickListener(new View.OnClickListener(this) { // from class: za.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IntroFragment f42207b;

            {
                this.f42207b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                IntroFragment this$0 = this.f42207b;
                switch (i112) {
                    case 0:
                        int i122 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.x(new AnalyticEvent("app_onboarding_get_started_button", null, 2, null));
                        this$0.A(new AnalyticEvent("app_onboarding_get_started_button", null, 2, null));
                        ((IntroViewModel) this$0.r()).f8717o.postValue(new j(Unit.f23355a));
                        return;
                    case 1:
                        int i132 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.x(new AnalyticEvent("app_onboarding_login_button", null, 2, null));
                        this$0.A(new AnalyticEvent("app_onboarding_login_button", null, 2, null));
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                    case 2:
                        int i14 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                    default:
                        int i15 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                }
            }
        });
        ei eiVar7 = (ei) q();
        eiVar7.f4619u.setOnClickListener(new View.OnClickListener(this) { // from class: za.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IntroFragment f42207b;

            {
                this.f42207b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                IntroFragment this$0 = this.f42207b;
                switch (i112) {
                    case 0:
                        int i122 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.x(new AnalyticEvent("app_onboarding_get_started_button", null, 2, null));
                        this$0.A(new AnalyticEvent("app_onboarding_get_started_button", null, 2, null));
                        ((IntroViewModel) this$0.r()).f8717o.postValue(new j(Unit.f23355a));
                        return;
                    case 1:
                        int i132 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.x(new AnalyticEvent("app_onboarding_login_button", null, 2, null));
                        this$0.A(new AnalyticEvent("app_onboarding_login_button", null, 2, null));
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                    case 2:
                        int i14 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                    default:
                        int i15 = IntroFragment.f8714h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((IntroViewModel) this$0.r()).f8718p.postValue(new j(Unit.f23355a));
                        return;
                }
            }
        });
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        e eVar = ((IntroViewModel) r()).f8716n;
        if (eVar != null) {
            ft.b.b(eVar);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        IntroViewModel introViewModel = (IntroViewModel) r();
        f g10 = new mt.c(at.e.a(5L, TimeUnit.SECONDS), new a(29, za.f.f42217a)).g(((kq.e) introViewModel.f9079b).J());
        e eVar = new e(new za.e(0, new e1(introViewModel, 25)), gt.e.f17572d);
        g10.e(eVar);
        introViewModel.f8716n = eVar;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e schedulerProvider = bVar.k();
        ct.a compositeDisposable = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        o0 o0Var = fragmentComponent.f14280c;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(IntroViewModel.class), new j0(schedulerProvider, compositeDisposable, userRepository, 18));
        m mVar = o0Var.f15244a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, IntroViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(IntroViewModel.class, "<this>", IntroViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            IntroViewModel introViewModel = (IntroViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(introViewModel);
            this.f17284b = introViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
