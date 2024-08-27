package com.assetgro.stockgro.ui.payments.home;

import android.content.Intent;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import ba.t4;
import ba.u4;
import ca.c;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import fj.a;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import r3.k;
import re.d;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/home/WalletHomeActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/payments/home/WalletHomeViewModel;", "Lba/t4;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WalletHomeActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9645m = 0;

    /* renamed from: k, reason: collision with root package name */
    public a f9646k;

    /* renamed from: l, reason: collision with root package name */
    public a f9647l;

    public static final void K(WalletHomeActivity walletHomeActivity, String str, int i10, int i11) {
        t4 t4Var = (t4) walletHomeActivity.w();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, str.length(), 0);
        ((t4) walletHomeActivity.w()).E.setText(spannableString);
        t4Var.E.setTextColor(i10);
        if (i11 > 0) {
            ImageView imageView = ((t4) walletHomeActivity.w()).F;
            imageView.setVisibility(0);
            imageView.setImageDrawable(walletHomeActivity.getDrawable(i11));
            return;
        }
        ((t4) walletHomeActivity.w()).F.setVisibility(8);
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_wallet_home;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((WalletHomeViewModel) x()).f9084g.observe(this, new d(25, new wf.d(this, 5)));
        ((WalletHomeViewModel) x()).f9650p.observe(this, new d(25, new wf.d(this, 6)));
        ((WalletHomeViewModel) x()).f9651q.observe(this, new d(25, new wf.d(this, 7)));
        ((WalletHomeViewModel) x()).f9655u.observe(this, new d(25, new wf.d(this, 8)));
        ((WalletHomeViewModel) x()).H.observe(this, new d(25, new wf.d(this, 9)));
        ((WalletHomeViewModel) x()).f9656v.observe(this, new d(25, new wf.d(this, 10)));
        ((WalletHomeViewModel) x()).f9657w.observe(this, new d(25, new wf.d(this, 11)));
        ((WalletHomeViewModel) x()).f9658x.observe(this, new d(25, new wf.d(this, 12)));
        ((WalletHomeViewModel) x()).f9660z.observe(this, new d(25, new wf.d(this, 13)));
        ((WalletHomeViewModel) x()).E.observe(this, new d(25, new wf.d(this, 0)));
        ((WalletHomeViewModel) x()).F.observe(this, new d(25, new wf.d(this, 1)));
        ((WalletHomeViewModel) x()).f9659y.observe(this, new d(25, new wf.d(this, 2)));
        ((WalletHomeViewModel) x()).J.observe(this, new d(25, new wf.d(this, 3)));
        ((WalletHomeViewModel) x()).f9653s.observe(this, new d(25, new wf.d(this, 4)));
    }

    @Override // gd.b
    public final void I() {
        u4 u4Var = (u4) ((t4) w());
        u4Var.f6146e0 = (WalletHomeViewModel) x();
        synchronized (u4Var) {
            u4Var.f6272i0 |= 8;
        }
        u4Var.a(24);
        u4Var.m();
        ((t4) w()).p(this);
        this.f17260h = "wallet-home";
        ((WalletHomeViewModel) x()).j();
        ((t4) w()).Y.setTitle(getString(R.string.stockgro_wallet));
        u(((t4) w()).Y);
        final int i10 = 0;
        ((t4) w()).Y.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
            
                if (r10.equals("invalid") == false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00ca, code lost:
            
                r3 = "Not started";
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
            
                if (r10.equals("complete") == false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
            
                if (r10.equals("pending") == false) goto L39;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        Toolbar toolbar = ((t4) w()).Y;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        ((t4) w()).W.setOnRefreshListener(new vc.b(this, 15));
        final int i11 = 8;
        if (kj.a.f23207b) {
            ((t4) w()).f6149u.setEnabled(false);
            ((t4) w()).f6144c0.setEnabled(false);
            ((t4) w()).f6144c0.setVisibility(8);
            ((t4) w()).f6145d0.setVisibility(0);
            ((t4) w()).f6145d0.setEnabled(false);
            ((t4) w()).C.setVisibility(8);
            ((t4) w()).M.setVisibility(0);
            ((t4) w()).N.setVisibility(0);
            ((t4) w()).Q.setImageDrawable(k.getDrawable(this, R.drawable.ic_aed));
        } else {
            ((t4) w()).M.setVisibility(8);
            ((t4) w()).N.setVisibility(8);
            ((t4) w()).Q.setImageDrawable(k.getDrawable(this, R.drawable.ic_cash_new));
        }
        final int i12 = 6;
        ((t4) w()).f6149u.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
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
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i13 = 7;
        ((t4) w()).f6145d0.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
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
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        ((t4) w()).f6144c0.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
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
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i14 = 9;
        ((t4) w()).Z.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        ((WalletHomeViewModel) x()).f9652r.observe(this, new d(25, new wf.d(this, 14)));
        final int i15 = 10;
        ((t4) w()).E.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i16 = 11;
        ((t4) w()).C.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i17 = 12;
        ((t4) w()).A.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i18 = 13;
        ((t4) w()).R.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i19 = 1;
        ((t4) w()).f6153y.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i20 = 2;
        ((t4) w()).L.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i21 = 3;
        ((t4) w()).O.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i22 = 4;
        ((t4) w()).H.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
        final int i23 = 5;
        ((t4) w()).I.setOnClickListener(new View.OnClickListener(this) { // from class: wf.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletHomeActivity f39040b;

            {
                this.f39040b = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r10) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.b.onClick(android.view.View):void");
            }
        });
    }

    public final void L(qf.b bVar, String str) {
        Intent intent = new Intent(this, (Class<?>) MaintenanceWindowActivity.class);
        intent.putExtra("DATA", bVar);
        intent.putExtra("SHOW_TOOLBAR", true);
        intent.putExtra("TOOLBAR_TITLE", str);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 120 || i10 == 130) {
            ((WalletHomeViewModel) x()).j();
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (((WalletHomeViewModel) x()).C) {
            ((WalletHomeViewModel) x()).h();
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        Object validator = new Object();
        PaymentRepository paymentRepository = activityComponent.f14246a.i();
        g.i(paymentRepository);
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        c factory = new c(a0.a(WalletHomeViewModel.class), new d1.b(schedulerProvider, compositeDisposable, validator, paymentRepository, userRepository, maintenanceConfigManager, 3));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, WalletHomeViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(WalletHomeViewModel.class, "<this>", WalletHomeViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            WalletHomeViewModel walletHomeViewModel = (WalletHomeViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(walletHomeViewModel);
            this.f17254b = walletHomeViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
