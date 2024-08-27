package ci;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import ba.h6;
import ba.i6;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.social.presentation.confirmation.SocialActionBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.b0;
import ea.f0;
import gd.h;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lci/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/social/presentation/confirmation/SocialActionBottomSheetViewModel;", "Lba/h6;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends h<SocialActionBottomSheetViewModel, h6> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8154i = 0;

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(SocialActionBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 14));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, SocialActionBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SocialActionBottomSheetViewModel.class, "<this>", SocialActionBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SocialActionBottomSheetViewModel socialActionBottomSheetViewModel = (SocialActionBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(socialActionBottomSheetViewModel);
            this.f17270b = socialActionBottomSheetViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.bottom_sheet_social_action_confirmation;
    }

    @Override // gd.h
    public final void z(View view) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null && (obj = arguments.get("DATA")) != null) {
            i6 i6Var = (i6) ((h6) r());
            i6Var.f4900x = (c) obj;
            synchronized (i6Var) {
                i6Var.f5020y |= 2;
            }
            i6Var.a(6);
            i6Var.m();
        }
        final int i10 = 0;
        ((h6) r()).f4899w.setOnClickListener(new View.OnClickListener(this) { // from class: ci.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f8153b;

            {
                this.f8153b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r6) {
                /*
                    r5 = this;
                    int r6 = r2
                    ci.b r0 = r5.f8153b
                    java.lang.String r1 = "this$0"
                    switch(r6) {
                        case 0: goto L73;
                        default: goto L9;
                    }
                L9:
                    int r6 = ci.b.f8154i
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r0.dismiss()
                    kotlin.Pair r6 = new kotlin.Pair
                    java.lang.String r1 = "bundleKey"
                    java.lang.String r2 = "SOCIAL_BOTTOM_SHEET_PRIMARY_ACTION"
                    r6.<init>(r1, r2)
                    kotlin.Pair[] r6 = new kotlin.Pair[]{r6}
                    android.os.Bundle r6 = hl.f.y(r6)
                    java.lang.String r1 = "<this>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    java.lang.String r1 = "requestKey"
                    java.lang.String r2 = "SOCIAL_BOTTOM_SHEET_RESULT"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    java.lang.String r1 = "result"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
                    androidx.fragment.app.d1 r0 = r0.getParentFragmentManager()
                    java.util.Map r1 = r0.f1655l
                    java.lang.Object r1 = r1.get(r2)
                    androidx.fragment.app.z0 r1 = (androidx.fragment.app.z0) r1
                    if (r1 == 0) goto L53
                    androidx.lifecycle.n r3 = androidx.lifecycle.n.f1950d
                    androidx.lifecycle.o r4 = r1.f1867a
                    androidx.lifecycle.n r4 = r4.b()
                    boolean r3 = r4.a(r3)
                    if (r3 == 0) goto L53
                    r1.d(r6, r2)
                    goto L58
                L53:
                    java.util.Map r0 = r0.f1654k
                    r0.put(r2, r6)
                L58:
                    java.lang.String r0 = "FragmentManager"
                    r1 = 2
                    boolean r1 = android.util.Log.isLoggable(r0, r1)
                    if (r1 == 0) goto L72
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Setting fragment result with key SOCIAL_BOTTOM_SHEET_RESULT and result "
                    r1.<init>(r2)
                    r1.append(r6)
                    java.lang.String r6 = r1.toString()
                    android.util.Log.v(r0, r6)
                L72:
                    return
                L73:
                    int r6 = ci.b.f8154i
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r0.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ci.a.onClick(android.view.View):void");
            }
        });
        final int i11 = 1;
        ((h6) r()).f4898v.setOnClickListener(new View.OnClickListener(this) { // from class: ci.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f8153b;

            {
                this.f8153b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
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
                    this = this;
                    int r6 = r2
                    ci.b r0 = r5.f8153b
                    java.lang.String r1 = "this$0"
                    switch(r6) {
                        case 0: goto L73;
                        default: goto L9;
                    }
                L9:
                    int r6 = ci.b.f8154i
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r0.dismiss()
                    kotlin.Pair r6 = new kotlin.Pair
                    java.lang.String r1 = "bundleKey"
                    java.lang.String r2 = "SOCIAL_BOTTOM_SHEET_PRIMARY_ACTION"
                    r6.<init>(r1, r2)
                    kotlin.Pair[] r6 = new kotlin.Pair[]{r6}
                    android.os.Bundle r6 = hl.f.y(r6)
                    java.lang.String r1 = "<this>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    java.lang.String r1 = "requestKey"
                    java.lang.String r2 = "SOCIAL_BOTTOM_SHEET_RESULT"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    java.lang.String r1 = "result"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
                    androidx.fragment.app.d1 r0 = r0.getParentFragmentManager()
                    java.util.Map r1 = r0.f1655l
                    java.lang.Object r1 = r1.get(r2)
                    androidx.fragment.app.z0 r1 = (androidx.fragment.app.z0) r1
                    if (r1 == 0) goto L53
                    androidx.lifecycle.n r3 = androidx.lifecycle.n.f1950d
                    androidx.lifecycle.o r4 = r1.f1867a
                    androidx.lifecycle.n r4 = r4.b()
                    boolean r3 = r4.a(r3)
                    if (r3 == 0) goto L53
                    r1.d(r6, r2)
                    goto L58
                L53:
                    java.util.Map r0 = r0.f1654k
                    r0.put(r2, r6)
                L58:
                    java.lang.String r0 = "FragmentManager"
                    r1 = 2
                    boolean r1 = android.util.Log.isLoggable(r0, r1)
                    if (r1 == 0) goto L72
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Setting fragment result with key SOCIAL_BOTTOM_SHEET_RESULT and result "
                    r1.<init>(r2)
                    r1.append(r6)
                    java.lang.String r6 = r1.toString()
                    android.util.Log.v(r0, r6)
                L72:
                    return
                L73:
                    int r6 = ci.b.f8154i
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    r0.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ci.a.onClick(android.view.View):void");
            }
        });
    }
}
