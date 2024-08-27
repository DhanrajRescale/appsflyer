package com.assetgro.stockgro.ui.payments.recharge;

import ag.c;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import ba.f3;
import ba.g3;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.widget.InputView;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.kaopiz.kprogresshud.f;
import com.webengage.sdk.android.Analytics;
import ea.t;
import ek.u;
import gd.b;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.services.HyperServices;
import iu.a0;
import java.util.HashMap;
import java.util.Iterator;
import jt.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import mt.p;
import nt.h;
import org.json.JSONObject;
import qu.i0;
import vt.p0;
import xf.v;
import zd.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/recharge/RechargeWalletActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/payments/recharge/RechargeWalletViewModel;", "Lba/f3;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RechargeWalletActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9705l = 0;

    /* renamed from: k, reason: collision with root package name */
    public HyperServices f9706k;

    public static final void K(RechargeWalletActivity rechargeWalletActivity, JSONObject jSONObject) {
        ((RechargeWalletViewModel) rechargeWalletActivity.x()).C = false;
        JSONObject response = jSONObject.optJSONObject(PaymentConstants.PAYLOAD);
        Object[] objArr = new Object[0];
        Intrinsics.checkNotNullParameter("RechargeWalletActivity", "tag");
        a.g("Final process_result :" + response, "s", objArr, "params", "RechargeWalletActivity").getClass();
        u.k(objArr);
        if (response != null) {
            String status = response.getString("status");
            f fVar = rechargeWalletActivity.f17255c;
            if (fVar != null) {
                fVar.d();
            }
            RechargeWalletViewModel rechargeWalletViewModel = (RechargeWalletViewModel) rechargeWalletActivity.x();
            Intrinsics.c(status);
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(status, "status");
            HashMap<String, String> hashMap = new HashMap<>();
            Iterator<String> keys = response.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.c(next);
                String string = response.getString(next);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                hashMap.put(next, string);
            }
            h c10 = rechargeWalletViewModel.f9708o.updateJustPayTransactionStatus(rechargeWalletViewModel.D, hashMap).c(((e) rechargeWalletViewModel.f9079b).J());
            d dVar = new d(new vf.d(28, new g(9, rechargeWalletViewModel, status)), new vf.d(29, ag.h.f418c));
            c10.a(dVar);
            Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
            rechargeWalletViewModel.f9080c.c(dVar);
        }
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_recharge_wallet;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((RechargeWalletViewModel) x()).B.observe(this, new v(1, new ag.e(this, 2)));
        ((RechargeWalletViewModel) x()).f9713t.observe(this, new v(1, new ag.e(this, 3)));
        ((RechargeWalletViewModel) x()).f9714u.observe(this, new v(1, new ag.e(this, 4)));
        ((RechargeWalletViewModel) x()).f9084g.observe(this, new v(1, new ag.e(this, 5)));
        ((RechargeWalletViewModel) x()).f9715v.observe(this, new v(1, new ag.e(this, 6)));
        ((RechargeWalletViewModel) x()).f9719z.observe(this, new v(1, new ag.e(this, 7)));
        ((RechargeWalletViewModel) x()).f9717x.observe(this, new v(1, new ag.e(this, 8)));
        ((RechargeWalletViewModel) x()).f9718y.observe(this, new v(1, new ag.e(this, 9)));
        ((RechargeWalletViewModel) x()).E.observe(this, new v(1, new ag.e(this, 10)));
        ((RechargeWalletViewModel) x()).f9712s.observe(this, new v(1, new ag.e(this, 0)));
        ((RechargeWalletViewModel) x()).F.observe(this, new v(1, new ag.e(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        g3 g3Var = (g3) ((f3) w());
        g3Var.C = (RechargeWalletViewModel) x();
        synchronized (g3Var) {
            g3Var.D |= 2;
        }
        g3Var.a(24);
        g3Var.m();
        ((f3) w()).p(this);
        this.f17260h = "wallet-add";
        Bundle extras = getIntent().getExtras();
        final int i10 = 0;
        if (extras != null) {
            ((RechargeWalletViewModel) x()).f9711r = extras.getBoolean("REDIRECT", false);
        }
        Toolbar toolbar = ((f3) w()).B;
        toolbar.setTitle(getString(R.string.text_recharge_wallet));
        v(toolbar);
        u(toolbar);
        ((f3) w()).B.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ag.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeWalletActivity f410b;

            {
                this.f410b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x033c  */
            /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r12) {
                /*
                    Method dump skipped, instructions count: 998
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ag.d.onClick(android.view.View):void");
            }
        });
        HyperServices hyperServices = new HyperServices(this, ((f3) w()).A);
        Intrinsics.checkNotNullParameter(hyperServices, "<set-?>");
        this.f9706k = hyperServices;
        RechargeWalletViewModel rechargeWalletViewModel = (RechargeWalletViewModel) x();
        h c10 = rechargeWalletViewModel.f9708o.initiateJustPayPayload().c(((e) rechargeWalletViewModel.f9079b).J());
        final int i11 = 1;
        final int i12 = 2;
        d dVar = new d(new vf.d(22, new ag.g(rechargeWalletViewModel, i11)), new vf.d(23, new ag.g(rechargeWalletViewModel, i12)));
        c10.a(dVar);
        Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
        rechargeWalletViewModel.f9080c.c(dVar);
        InputView addMoneyInputView = ((f3) w()).f4662w;
        Intrinsics.checkNotNullExpressionValue(addMoneyInputView, "addMoneyInputView");
        showKeyboard(addMoneyInputView);
        TextView textView = ((f3) w()).f4659t;
        ij.h hVar = ij.h.f20067a;
        textView.setText(ij.h.j(50, 0));
        ((f3) w()).f4661v.setText(ij.h.j(100, 0));
        ((f3) w()).f4663x.setText(ij.h.j(250, 0));
        ((f3) w()).f4660u.setText(ij.h.j(500, 0));
        ((f3) w()).f4658s.setOnClickListener(new View.OnClickListener(this) { // from class: ag.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeWalletActivity f410b;

            {
                this.f410b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
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
                    Method dump skipped, instructions count: 998
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ag.d.onClick(android.view.View):void");
            }
        });
        Float valueOf = Float.valueOf(getIntent().getFloatExtra("RECHARGE_AMOUNT", s0.g.f34069a));
        if (valueOf != null) {
            float floatValue = valueOf.floatValue();
            if (floatValue > s0.g.f34069a) {
                M(floatValue);
            }
        }
        ((f3) w()).f4662w.setOnInputViewAction(new eb.f(this, 2));
        ((f3) w()).f4662w.setOnInputViewActionDone(new eb.f(this, 2));
        ((f3) w()).f4659t.setOnClickListener(new View.OnClickListener(this) { // from class: ag.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeWalletActivity f410b;

            {
                this.f410b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r12) {
                /*
                    Method dump skipped, instructions count: 998
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ag.d.onClick(android.view.View):void");
            }
        });
        final int i13 = 3;
        ((f3) w()).f4661v.setOnClickListener(new View.OnClickListener(this) { // from class: ag.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeWalletActivity f410b;

            {
                this.f410b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r12) {
                /*
                    Method dump skipped, instructions count: 998
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ag.d.onClick(android.view.View):void");
            }
        });
        final int i14 = 4;
        ((f3) w()).f4663x.setOnClickListener(new View.OnClickListener(this) { // from class: ag.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeWalletActivity f410b;

            {
                this.f410b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r12) {
                /*
                    Method dump skipped, instructions count: 998
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ag.d.onClick(android.view.View):void");
            }
        });
        final int i15 = 5;
        ((f3) w()).f4660u.setOnClickListener(new View.OnClickListener(this) { // from class: ag.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeWalletActivity f410b;

            {
                this.f410b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r12) {
                /*
                    Method dump skipped, instructions count: 998
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ag.d.onClick(android.view.View):void");
            }
        });
    }

    public final HyperServices L() {
        HyperServices hyperServices = this.f9706k;
        if (hyperServices != null) {
            return hyperServices;
        }
        Intrinsics.k("hyperInstance");
        throw null;
    }

    public final void M(float f10) {
        InputView inputView = ((f3) w()).f4662w;
        if (inputView.getInputValue().length() == 0) {
            inputView.setDisplayValue(String.valueOf(f10));
        } else {
            inputView.setDisplayValue(String.valueOf(Double.parseDouble(inputView.getInputValue()) + f10));
        }
    }

    public final void N(String paymentStatusResponse, String message) {
        Intrinsics.checkNotNullParameter(paymentStatusResponse, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        RechargeWalletViewModel rechargeWalletViewModel = (RechargeWalletViewModel) x();
        Intrinsics.checkNotNullParameter(paymentStatusResponse, "paymentStatusResponse");
        Intrinsics.checkNotNullParameter(message, "message");
        rechargeWalletViewModel.f9710q = paymentStatusResponse;
        rechargeWalletViewModel.f9709p = message;
        try {
            if (Intrinsics.a(paymentStatusResponse, "TXN_SUCCESS")) {
                A(new AnalyticEvent("add_money_success", null, 2, null));
            } else if (Intrinsics.a(paymentStatusResponse, "PENDING")) {
                A(new AnalyticEvent("add_money_pending", null, 2, null));
            } else {
                A(new AnalyticEvent("add_money_failed", null, 2, null));
            }
            int i10 = bg.b.f6970j;
            Bundle bundle = new Bundle();
            bg.b bVar = new bg.b();
            bVar.setArguments(bundle);
            bVar.show(getSupportFragmentManager(), "PaymentTransactionStatusBottomSheetFragment");
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (!((RechargeWalletViewModel) x()).C) {
            AnalyticEvent analyticEvent = new AnalyticEvent("add_money_exit", p0.f(new Pair("exited_from_top", Boolean.FALSE)));
            A(analyticEvent);
            D(analyticEvent);
            if (isTaskRoot()) {
                startActivity(new Intent(this, (Class<?>) WalletHomeActivity.class));
            }
            finish();
            return;
        }
        int i10 = c.f407j;
        Bundle bundle = new Bundle();
        c cVar = new c();
        cVar.setArguments(bundle);
        cVar.show(getSupportFragmentManager(), "AbortTransactionBottomSheetFragment");
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onPause() {
        super.onPause();
        InputView addMoneyInputView = ((f3) w()).f4662w;
        Intrinsics.checkNotNullExpressionValue(addMoneyInputView, "addMoneyInputView");
        hideKeyboardOnScreen(addMoneyInputView);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, mt.p] */
    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        ea.v vVar = (ea.v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        ?? validator = new Object();
        PaymentRepository paymentRepository = activityComponent.f14246a.i();
        yk.g.i(paymentRepository);
        UserRepository userRepository = a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(RechargeWalletViewModel.class), new t(k10, compositeDisposable, (p) validator, paymentRepository, userRepository));
        b bVar = vVar.f15290a;
        h1 c10 = a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = a.h(c10, factory, defaultCreationExtras, RechargeWalletViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(RechargeWalletViewModel.class, "<this>", RechargeWalletViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            RechargeWalletViewModel rechargeWalletViewModel = (RechargeWalletViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(rechargeWalletViewModel);
            this.f17254b = rechargeWalletViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
