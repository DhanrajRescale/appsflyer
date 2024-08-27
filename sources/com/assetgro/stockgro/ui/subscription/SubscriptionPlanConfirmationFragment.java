package com.assetgro.stockgro.ui.subscription;

import ag.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import ba.gp;
import ba.hp;
import bj.c;
import cj.n;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationFragment;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationViewModel;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ej.f0;
import ej.g0;
import ej.m0;
import ej.n0;
import ek.u;
import gd.m;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.services.HyperServices;
import iu.a0;
import iu.z;
import java.util.List;
import jt.d;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import qu.i0;
import ut.g;
import ut.h;
import vt.y;
import xf.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/SubscriptionPlanConfirmationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/subscription/SubscriptionPlanConfirmationViewModel;", "Lba/gp;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SubscriptionPlanConfirmationFragment extends m<SubscriptionPlanConfirmationViewModel, gp> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10549k = 0;

    /* renamed from: h, reason: collision with root package name */
    public HyperServices f10551h;

    /* renamed from: i, reason: collision with root package name */
    public List f10552i;

    /* renamed from: g, reason: collision with root package name */
    public final i f10550g = new i(a0.a(g0.class), new x(this, 17));

    /* renamed from: j, reason: collision with root package name */
    public final g f10553j = h.a(new b(this, 28));

    public static final void H(SubscriptionPlanConfirmationFragment subscriptionPlanConfirmationFragment, JSONObject jSONObject) {
        ((ManageSubscriptionViewModel) subscriptionPlanConfirmationFragment.f10553j.getValue()).f10497p = false;
        ((SubscriptionPlanConfirmationViewModel) subscriptionPlanConfirmationFragment.r()).C.postValue(new j(Boolean.FALSE));
        String str = "Final process_result :" + jSONObject.optJSONObject(PaymentConstants.PAYLOAD);
        Object[] objArr = new Object[0];
        Intrinsics.checkNotNullParameter("SubscriptionPlanConfirmationFragment", "tag");
        a.g(str, "s", objArr, "params", "SubscriptionPlanConfirmationFragment").getClass();
        u.k(objArr);
        SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel = (SubscriptionPlanConfirmationViewModel) subscriptionPlanConfirmationFragment.r();
        e0 e0Var = subscriptionPlanConfirmationViewModel.C;
        Boolean bool = Boolean.TRUE;
        e0Var.postValue(new j(bool));
        String str2 = subscriptionPlanConfirmationViewModel.D;
        if (str2 != null) {
            subscriptionPlanConfirmationViewModel.f9084g.postValue(bool);
            yk.g.H(u0.f(subscriptionPlanConfirmationViewModel), null, null, new m0(subscriptionPlanConfirmationViewModel, str2, null), 3);
        }
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_subscription_plan_confirmation;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((SubscriptionPlanConfirmationViewModel) r()).f10561u.observe(this, new c(11, new f0(this, 0)));
        ((SubscriptionPlanConfirmationViewModel) r()).f10559s.observe(this, new c(11, new f0(this, 1)));
        ((SubscriptionPlanConfirmationViewModel) r()).f10563w.observe(this, new c(11, new f0(this, 2)));
        ((SubscriptionPlanConfirmationViewModel) r()).G.observe(this, new c(11, new f0(this, 3)));
        ((SubscriptionPlanConfirmationViewModel) r()).f10566z.observe(this, new c(11, new f0(this, 4)));
        ((SubscriptionPlanConfirmationViewModel) r()).A.observe(this, new c(11, new f0(this, 5)));
        ((SubscriptionPlanConfirmationViewModel) r()).f9084g.observe(this, new c(11, new f0(this, 6)));
        ((ManageSubscriptionViewModel) this.f10553j.getValue()).f10501t.observe(this, new c(11, new f0(this, 7)));
        ((SubscriptionPlanConfirmationViewModel) r()).H.observe(this, new c(11, new f0(this, 8)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Toolbar toolbar = ((gp) q()).f4839a0;
        toolbar.setTitle(getString(R.string.payment_confirmation));
        p(toolbar);
        RadioButton radioUpiAutoPay = ((gp) q()).L;
        Intrinsics.checkNotNullExpressionValue(radioUpiAutoPay, "radioUpiAutoPay");
        RadioButton radioUpi = ((gp) q()).K;
        Intrinsics.checkNotNullExpressionValue(radioUpi, "radioUpi");
        RadioButton radioStockgroCash = ((gp) q()).J;
        Intrinsics.checkNotNullExpressionValue(radioStockgroCash, "radioStockgroCash");
        final int i10 = 0;
        final int i11 = 1;
        final int i12 = 2;
        this.f10552i = y.g(radioUpiAutoPay, radioUpi, radioStockgroCash);
        final z zVar = new z();
        radioUpiAutoPay.setOnClickListener(new View.OnClickListener(this) { // from class: ej.d0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionPlanConfirmationFragment f15463b;

            {
                this.f15463b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i10;
                iu.z selectedPgRoute = zVar;
                SubscriptionPlanConfirmationFragment this$0 = this.f15463b;
                switch (i13) {
                    case 0:
                        int i14 = SubscriptionPlanConfirmationFragment.f10549k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(selectedPgRoute, "$selectedPgRoute");
                        Intrinsics.d(view2, "null cannot be cast to non-null type android.widget.RadioButton");
                        this$0.I((RadioButton) view2);
                        selectedPgRoute.f20560a = "UPI-AUTOPAY";
                        ((SubscriptionPlanConfirmationViewModel) this$0.r()).h((String) selectedPgRoute.f20560a);
                        return;
                    case 1:
                        int i15 = SubscriptionPlanConfirmationFragment.f10549k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(selectedPgRoute, "$selectedPgRoute");
                        Intrinsics.d(view2, "null cannot be cast to non-null type android.widget.RadioButton");
                        this$0.I((RadioButton) view2);
                        selectedPgRoute.f20560a = "UPI";
                        ((SubscriptionPlanConfirmationViewModel) this$0.r()).h((String) selectedPgRoute.f20560a);
                        return;
                    default:
                        int i16 = SubscriptionPlanConfirmationFragment.f10549k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(selectedPgRoute, "$selectedPgRoute");
                        Intrinsics.d(view2, "null cannot be cast to non-null type android.widget.RadioButton");
                        this$0.I((RadioButton) view2);
                        selectedPgRoute.f20560a = "CASH";
                        ((SubscriptionPlanConfirmationViewModel) this$0.r()).h((String) selectedPgRoute.f20560a);
                        return;
                }
            }
        });
        radioUpi.setOnClickListener(new View.OnClickListener(this) { // from class: ej.d0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionPlanConfirmationFragment f15463b;

            {
                this.f15463b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i11;
                iu.z selectedPgRoute = zVar;
                SubscriptionPlanConfirmationFragment this$0 = this.f15463b;
                switch (i13) {
                    case 0:
                        int i14 = SubscriptionPlanConfirmationFragment.f10549k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(selectedPgRoute, "$selectedPgRoute");
                        Intrinsics.d(view2, "null cannot be cast to non-null type android.widget.RadioButton");
                        this$0.I((RadioButton) view2);
                        selectedPgRoute.f20560a = "UPI-AUTOPAY";
                        ((SubscriptionPlanConfirmationViewModel) this$0.r()).h((String) selectedPgRoute.f20560a);
                        return;
                    case 1:
                        int i15 = SubscriptionPlanConfirmationFragment.f10549k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(selectedPgRoute, "$selectedPgRoute");
                        Intrinsics.d(view2, "null cannot be cast to non-null type android.widget.RadioButton");
                        this$0.I((RadioButton) view2);
                        selectedPgRoute.f20560a = "UPI";
                        ((SubscriptionPlanConfirmationViewModel) this$0.r()).h((String) selectedPgRoute.f20560a);
                        return;
                    default:
                        int i16 = SubscriptionPlanConfirmationFragment.f10549k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(selectedPgRoute, "$selectedPgRoute");
                        Intrinsics.d(view2, "null cannot be cast to non-null type android.widget.RadioButton");
                        this$0.I((RadioButton) view2);
                        selectedPgRoute.f20560a = "CASH";
                        ((SubscriptionPlanConfirmationViewModel) this$0.r()).h((String) selectedPgRoute.f20560a);
                        return;
                }
            }
        });
        radioStockgroCash.setOnClickListener(new View.OnClickListener(this) { // from class: ej.d0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionPlanConfirmationFragment f15463b;

            {
                this.f15463b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                iu.z selectedPgRoute = zVar;
                SubscriptionPlanConfirmationFragment this$0 = this.f15463b;
                switch (i13) {
                    case 0:
                        int i14 = SubscriptionPlanConfirmationFragment.f10549k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(selectedPgRoute, "$selectedPgRoute");
                        Intrinsics.d(view2, "null cannot be cast to non-null type android.widget.RadioButton");
                        this$0.I((RadioButton) view2);
                        selectedPgRoute.f20560a = "UPI-AUTOPAY";
                        ((SubscriptionPlanConfirmationViewModel) this$0.r()).h((String) selectedPgRoute.f20560a);
                        return;
                    case 1:
                        int i15 = SubscriptionPlanConfirmationFragment.f10549k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(selectedPgRoute, "$selectedPgRoute");
                        Intrinsics.d(view2, "null cannot be cast to non-null type android.widget.RadioButton");
                        this$0.I((RadioButton) view2);
                        selectedPgRoute.f20560a = "UPI";
                        ((SubscriptionPlanConfirmationViewModel) this$0.r()).h((String) selectedPgRoute.f20560a);
                        return;
                    default:
                        int i16 = SubscriptionPlanConfirmationFragment.f10549k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(selectedPgRoute, "$selectedPgRoute");
                        Intrinsics.d(view2, "null cannot be cast to non-null type android.widget.RadioButton");
                        this$0.I((RadioButton) view2);
                        selectedPgRoute.f20560a = "CASH";
                        ((SubscriptionPlanConfirmationViewModel) this$0.r()).h((String) selectedPgRoute.f20560a);
                        return;
                }
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ej.e0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionPlanConfirmationFragment f15468b;

            {
                this.f15468b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:41:0x0101, code lost:
            
                if (r2.equals("CASH") == false) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0116, code lost:
            
                if (r0.getMessage().length() <= 0) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
            
                r5.postValue(new kj.j(r0.getMessage()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0125, code lost:
            
                r9.i();
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0128, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0108, code lost:
            
                if (r2.equals("UPI") == false) goto L51;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r9) {
                /*
                    Method dump skipped, instructions count: 316
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ej.e0.onClick(android.view.View):void");
            }
        });
        hp hpVar = (hp) ((gp) q());
        hpVar.f4843e0 = (SubscriptionPlanConfirmationViewModel) r();
        synchronized (hpVar) {
            hpVar.f4966h0 |= 32;
        }
        hpVar.a(24);
        hpVar.m();
        ((gp) q()).p(this);
        j0 requireActivity = requireActivity();
        View view2 = ((gp) q()).f27491e;
        Intrinsics.d(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f10551h = new HyperServices(requireActivity, (ViewGroup) view2);
        SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel = (SubscriptionPlanConfirmationViewModel) r();
        nt.h c10 = subscriptionPlanConfirmationViewModel.f10554n.initiateJustPayPayload().c(((e) subscriptionPlanConfirmationViewModel.f9079b).J());
        d dVar = new d(new n(4, new ej.j0(subscriptionPlanConfirmationViewModel, i11)), new n(5, new ej.j0(subscriptionPlanConfirmationViewModel, i12)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        subscriptionPlanConfirmationViewModel.f9080c.c(dVar);
        SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel2 = (SubscriptionPlanConfirmationViewModel) r();
        String packageId = ((g0) this.f10550g.getValue()).f15476a;
        boolean z10 = ((g0) this.f10550g.getValue()).f15477b;
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            subscriptionPlanConfirmationViewModel2.f9083f.setValue(ni.j.i("Not connected to internet"));
        } else {
            try {
                subscriptionPlanConfirmationViewModel2.h(HttpUrl.FRAGMENT_ENCODE_SET);
                subscriptionPlanConfirmationViewModel2.E = z10;
                if (z10) {
                    subscriptionPlanConfirmationViewModel2.f10556p = "UPI-AUTOPAY";
                }
                yk.g.H(u0.f(subscriptionPlanConfirmationViewModel2), null, null, new n0(subscriptionPlanConfirmationViewModel2, packageId, z10, null), 3);
            } catch (Exception unused) {
            }
        }
        ((gp) q()).B.setOnClickListener(new View.OnClickListener(this) { // from class: ej.e0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionPlanConfirmationFragment f15468b;

            {
                this.f15468b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 316
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ej.e0.onClick(android.view.View):void");
            }
        });
    }

    public final void I(RadioButton selectedButton) {
        Intrinsics.checkNotNullParameter(selectedButton, "selectedButton");
        List<RadioButton> list = this.f10552i;
        if (list != null) {
            for (RadioButton radioButton : list) {
                if (!Intrinsics.a(radioButton, selectedButton)) {
                    radioButton.setChecked(false);
                }
            }
            return;
        }
        Intrinsics.k("radioButtonList");
        throw null;
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        PaymentRepository paymentRepository = bVar.i();
        yk.g.i(paymentRepository);
        qf.a maintenanceConfigManager = bVar.g();
        yk.g.i(maintenanceConfigManager);
        ea.n0 n0Var = fragmentComponent.f14278a;
        a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(SubscriptionPlanConfirmationViewModel.class), new z2.e(k10, c10, userRepository, paymentRepository, maintenanceConfigManager, 8));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = a.h(h10, factory, defaultCreationExtras, SubscriptionPlanConfirmationViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SubscriptionPlanConfirmationViewModel.class, "<this>", SubscriptionPlanConfirmationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SubscriptionPlanConfirmationViewModel subscriptionPlanConfirmationViewModel = (SubscriptionPlanConfirmationViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(subscriptionPlanConfirmationViewModel);
            this.f17284b = subscriptionPlanConfirmationViewModel;
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
