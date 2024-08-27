package com.assetgro.stockgro.ui.subscription;

import ag.b;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.fl;
import ba.gl;
import bj.c;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.MySubscriptionResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.MySubscriptionFragment;
import com.assetgro.stockgro.ui.subscription.MySubscriptionViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import dj.e;
import ea.k;
import ea.n0;
import gd.m;
import gj.d;
import iu.a0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okhttp3.HttpUrl;
import qu.i0;
import ut.g;
import ut.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/MySubscriptionFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/subscription/MySubscriptionViewModel;", "Lba/fl;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MySubscriptionFragment extends m<MySubscriptionViewModel, fl> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10503i = 0;

    /* renamed from: g, reason: collision with root package name */
    public d f10504g;

    /* renamed from: h, reason: collision with root package name */
    public final g f10505h = h.a(new b(this, 24));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_my_subscription;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        MySubscriptionViewModel mySubscriptionViewModel = (MySubscriptionViewModel) r();
        mySubscriptionViewModel.f10514v.observe(this, new c(8, new ej.c(this, 0)));
        ((MySubscriptionViewModel) r()).f10511s.observe(this, new c(8, new ej.c(this, 1)));
        ((MySubscriptionViewModel) r()).f10509q.observe(this, new c(8, new ej.c(this, 2)));
        ((MySubscriptionViewModel) r()).f10513u.observe(this, new c(8, new ej.c(this, 3)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        gl glVar = (gl) ((fl) q());
        glVar.N = (MySubscriptionViewModel) r();
        synchronized (glVar) {
            glVar.Q |= 8;
        }
        glVar.a(24);
        glVar.m();
        ((fl) q()).p(this);
        Toolbar toolbar = ((fl) q()).J;
        toolbar.setTitle(getString(R.string.stockgro_plus));
        p(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ej.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MySubscriptionFragment f15452b;

            {
                this.f15452b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                String valueOf;
                int i11 = i10;
                MySubscriptionFragment this$0 = this.f15452b;
                switch (i11) {
                    case 0:
                        int i12 = MySubscriptionFragment.f10503i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    case 1:
                        int i13 = MySubscriptionFragment.f10503i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((fl) this$0.q()).E.getVisibility() == 8) {
                            ((fl) this$0.q()).E.setVisibility(0);
                            ((MySubscriptionViewModel) this$0.r()).f10515w.setValue(Boolean.FALSE);
                            return;
                        } else {
                            ((fl) this$0.q()).E.setVisibility(8);
                            ((MySubscriptionViewModel) this$0.r()).f10515w.setValue(Boolean.TRUE);
                            return;
                        }
                    case 2:
                        int i14 = MySubscriptionFragment.f10503i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        AnalyticEvent analyticEvent = new AnalyticEvent("app_sub_manage_sub_renew_cta", vt.p0.f(new Pair("current_plan", ((MySubscriptionViewModel) this$0.r()).i().getTitle())));
                        this$0.z(analyticEvent);
                        this$0.A(analyticEvent);
                        this$0.B(analyticEvent);
                        ((MySubscriptionViewModel) this$0.r()).h();
                        return;
                    default:
                        int i15 = MySubscriptionFragment.f10503i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        MySubscriptionResponse mySubscriptionResponse = (MySubscriptionResponse) ((MySubscriptionViewModel) this$0.r()).f10509q.getValue();
                        if (mySubscriptionResponse == null || (str = mySubscriptionResponse.getTitle()) == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        Pair[] pairArr = new Pair[1];
                        Locale ENGLISH = Locale.ENGLISH;
                        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                        String lowerCase = str.toLowerCase(ENGLISH);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (lowerCase.length() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            char charAt = lowerCase.charAt(0);
                            if (Character.isLowerCase(charAt)) {
                                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                                valueOf = CharsKt.c(charAt, ENGLISH);
                            } else {
                                valueOf = String.valueOf(charAt);
                            }
                            sb2.append((Object) valueOf);
                            String substring = lowerCase.substring(1);
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            sb2.append(substring);
                            lowerCase = sb2.toString();
                        }
                        pairArr[0] = new Pair("current_plan", lowerCase);
                        this$0.y(new AnalyticEvent("app_sub_manage_autopay_entry", vt.p0.f(pairArr)));
                        MySubscriptionViewModel mySubscriptionViewModel = (MySubscriptionViewModel) this$0.r();
                        MySubscriptionResponse mySubscriptionResponse2 = (MySubscriptionResponse) mySubscriptionViewModel.f10509q.getValue();
                        if (mySubscriptionResponse2 != null) {
                            mySubscriptionViewModel.f10512t.setValue(new kj.j(new Pair(mySubscriptionResponse2.getPackageID(), Boolean.TRUE)));
                            return;
                        }
                        return;
                }
            }
        });
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f10504g = new d(lifecycle, new v.g(this, 18));
        RecyclerView recyclerView = ((fl) q()).F;
        d dVar = this.f10504g;
        if (dVar != null) {
            recyclerView.setAdapter(dVar);
            ((MySubscriptionViewModel) r()).j();
            String string = getString(R.string.view_details);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new UnderlineSpan(), 0, string.length(), 33);
            ((fl) q()).K.setText(spannableString);
            final int i11 = 1;
            ((fl) q()).M.setOnClickListener(new View.OnClickListener(this) { // from class: ej.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MySubscriptionFragment f15452b;

                {
                    this.f15452b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    String valueOf;
                    int i112 = i11;
                    MySubscriptionFragment this$0 = this.f15452b;
                    switch (i112) {
                        case 0:
                            int i12 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 1:
                            int i13 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((fl) this$0.q()).E.getVisibility() == 8) {
                                ((fl) this$0.q()).E.setVisibility(0);
                                ((MySubscriptionViewModel) this$0.r()).f10515w.setValue(Boolean.FALSE);
                                return;
                            } else {
                                ((fl) this$0.q()).E.setVisibility(8);
                                ((MySubscriptionViewModel) this$0.r()).f10515w.setValue(Boolean.TRUE);
                                return;
                            }
                        case 2:
                            int i14 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            AnalyticEvent analyticEvent = new AnalyticEvent("app_sub_manage_sub_renew_cta", vt.p0.f(new Pair("current_plan", ((MySubscriptionViewModel) this$0.r()).i().getTitle())));
                            this$0.z(analyticEvent);
                            this$0.A(analyticEvent);
                            this$0.B(analyticEvent);
                            ((MySubscriptionViewModel) this$0.r()).h();
                            return;
                        default:
                            int i15 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MySubscriptionResponse mySubscriptionResponse = (MySubscriptionResponse) ((MySubscriptionViewModel) this$0.r()).f10509q.getValue();
                            if (mySubscriptionResponse == null || (str = mySubscriptionResponse.getTitle()) == null) {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            Pair[] pairArr = new Pair[1];
                            Locale ENGLISH = Locale.ENGLISH;
                            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                            String lowerCase = str.toLowerCase(ENGLISH);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                char charAt = lowerCase.charAt(0);
                                if (Character.isLowerCase(charAt)) {
                                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                                    valueOf = CharsKt.c(charAt, ENGLISH);
                                } else {
                                    valueOf = String.valueOf(charAt);
                                }
                                sb2.append((Object) valueOf);
                                String substring = lowerCase.substring(1);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                sb2.append(substring);
                                lowerCase = sb2.toString();
                            }
                            pairArr[0] = new Pair("current_plan", lowerCase);
                            this$0.y(new AnalyticEvent("app_sub_manage_autopay_entry", vt.p0.f(pairArr)));
                            MySubscriptionViewModel mySubscriptionViewModel = (MySubscriptionViewModel) this$0.r();
                            MySubscriptionResponse mySubscriptionResponse2 = (MySubscriptionResponse) mySubscriptionViewModel.f10509q.getValue();
                            if (mySubscriptionResponse2 != null) {
                                mySubscriptionViewModel.f10512t.setValue(new kj.j(new Pair(mySubscriptionResponse2.getPackageID(), Boolean.TRUE)));
                                return;
                            }
                            return;
                    }
                }
            });
            ((fl) q()).f4722x.setOnRefreshListener(new e(this, 1));
            final int i12 = 2;
            ((fl) q()).C.setOnClickListener(new View.OnClickListener(this) { // from class: ej.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MySubscriptionFragment f15452b;

                {
                    this.f15452b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    String valueOf;
                    int i112 = i12;
                    MySubscriptionFragment this$0 = this.f15452b;
                    switch (i112) {
                        case 0:
                            int i122 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 1:
                            int i13 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((fl) this$0.q()).E.getVisibility() == 8) {
                                ((fl) this$0.q()).E.setVisibility(0);
                                ((MySubscriptionViewModel) this$0.r()).f10515w.setValue(Boolean.FALSE);
                                return;
                            } else {
                                ((fl) this$0.q()).E.setVisibility(8);
                                ((MySubscriptionViewModel) this$0.r()).f10515w.setValue(Boolean.TRUE);
                                return;
                            }
                        case 2:
                            int i14 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            AnalyticEvent analyticEvent = new AnalyticEvent("app_sub_manage_sub_renew_cta", vt.p0.f(new Pair("current_plan", ((MySubscriptionViewModel) this$0.r()).i().getTitle())));
                            this$0.z(analyticEvent);
                            this$0.A(analyticEvent);
                            this$0.B(analyticEvent);
                            ((MySubscriptionViewModel) this$0.r()).h();
                            return;
                        default:
                            int i15 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MySubscriptionResponse mySubscriptionResponse = (MySubscriptionResponse) ((MySubscriptionViewModel) this$0.r()).f10509q.getValue();
                            if (mySubscriptionResponse == null || (str = mySubscriptionResponse.getTitle()) == null) {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            Pair[] pairArr = new Pair[1];
                            Locale ENGLISH = Locale.ENGLISH;
                            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                            String lowerCase = str.toLowerCase(ENGLISH);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                char charAt = lowerCase.charAt(0);
                                if (Character.isLowerCase(charAt)) {
                                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                                    valueOf = CharsKt.c(charAt, ENGLISH);
                                } else {
                                    valueOf = String.valueOf(charAt);
                                }
                                sb2.append((Object) valueOf);
                                String substring = lowerCase.substring(1);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                sb2.append(substring);
                                lowerCase = sb2.toString();
                            }
                            pairArr[0] = new Pair("current_plan", lowerCase);
                            this$0.y(new AnalyticEvent("app_sub_manage_autopay_entry", vt.p0.f(pairArr)));
                            MySubscriptionViewModel mySubscriptionViewModel = (MySubscriptionViewModel) this$0.r();
                            MySubscriptionResponse mySubscriptionResponse2 = (MySubscriptionResponse) mySubscriptionViewModel.f10509q.getValue();
                            if (mySubscriptionResponse2 != null) {
                                mySubscriptionViewModel.f10512t.setValue(new kj.j(new Pair(mySubscriptionResponse2.getPackageID(), Boolean.TRUE)));
                                return;
                            }
                            return;
                    }
                }
            });
            final int i13 = 3;
            ((fl) q()).D.setOnClickListener(new View.OnClickListener(this) { // from class: ej.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MySubscriptionFragment f15452b;

                {
                    this.f15452b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    String valueOf;
                    int i112 = i13;
                    MySubscriptionFragment this$0 = this.f15452b;
                    switch (i112) {
                        case 0:
                            int i122 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 1:
                            int i132 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((fl) this$0.q()).E.getVisibility() == 8) {
                                ((fl) this$0.q()).E.setVisibility(0);
                                ((MySubscriptionViewModel) this$0.r()).f10515w.setValue(Boolean.FALSE);
                                return;
                            } else {
                                ((fl) this$0.q()).E.setVisibility(8);
                                ((MySubscriptionViewModel) this$0.r()).f10515w.setValue(Boolean.TRUE);
                                return;
                            }
                        case 2:
                            int i14 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            AnalyticEvent analyticEvent = new AnalyticEvent("app_sub_manage_sub_renew_cta", vt.p0.f(new Pair("current_plan", ((MySubscriptionViewModel) this$0.r()).i().getTitle())));
                            this$0.z(analyticEvent);
                            this$0.A(analyticEvent);
                            this$0.B(analyticEvent);
                            ((MySubscriptionViewModel) this$0.r()).h();
                            return;
                        default:
                            int i15 = MySubscriptionFragment.f10503i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MySubscriptionResponse mySubscriptionResponse = (MySubscriptionResponse) ((MySubscriptionViewModel) this$0.r()).f10509q.getValue();
                            if (mySubscriptionResponse == null || (str = mySubscriptionResponse.getTitle()) == null) {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            Pair[] pairArr = new Pair[1];
                            Locale ENGLISH = Locale.ENGLISH;
                            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                            String lowerCase = str.toLowerCase(ENGLISH);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                char charAt = lowerCase.charAt(0);
                                if (Character.isLowerCase(charAt)) {
                                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                                    valueOf = CharsKt.c(charAt, ENGLISH);
                                } else {
                                    valueOf = String.valueOf(charAt);
                                }
                                sb2.append((Object) valueOf);
                                String substring = lowerCase.substring(1);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                sb2.append(substring);
                                lowerCase = sb2.toString();
                            }
                            pairArr[0] = new Pair("current_plan", lowerCase);
                            this$0.y(new AnalyticEvent("app_sub_manage_autopay_entry", vt.p0.f(pairArr)));
                            MySubscriptionViewModel mySubscriptionViewModel = (MySubscriptionViewModel) this$0.r();
                            MySubscriptionResponse mySubscriptionResponse2 = (MySubscriptionResponse) mySubscriptionViewModel.f10509q.getValue();
                            if (mySubscriptionResponse2 != null) {
                                mySubscriptionViewModel.f10512t.setValue(new kj.j(new Pair(mySubscriptionResponse2.getPackageID(), Boolean.TRUE)));
                                return;
                            }
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.k("subscriptionPlanOverviewAdapter");
        throw null;
    }

    public final ManageSubscriptionViewModel H() {
        return (ManageSubscriptionViewModel) this.f10505h.getValue();
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        PaymentRepository paymentRepository = bVar.i();
        yk.g.i(paymentRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(MySubscriptionViewModel.class), new k(k10, c10, userRepository, paymentRepository, 8));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, MySubscriptionViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MySubscriptionViewModel.class, "<this>", MySubscriptionViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MySubscriptionViewModel mySubscriptionViewModel = (MySubscriptionViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(mySubscriptionViewModel);
            this.f17284b = mySubscriptionViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            yk.g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
