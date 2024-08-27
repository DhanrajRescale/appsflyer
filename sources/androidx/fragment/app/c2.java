package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c2 extends f2 {

    /* renamed from: h, reason: collision with root package name */
    public final l1 f1641h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c2(androidx.fragment.app.e2 r3, androidx.fragment.app.d2 r4, androidx.fragment.app.l1 r5, y3.g r6) {
        /*
            r2 = this;
            java.lang.String r0 = "finalState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "lifecycleImpact"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "fragmentStateManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "cancellationSignal"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.g0 r0 = r5.f1754c
            java.lang.String r1 = "fragmentStateManager.fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r4, r0, r6)
            r2.f1641h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c2.<init>(androidx.fragment.app.e2, androidx.fragment.app.d2, androidx.fragment.app.l1, y3.g):void");
    }

    @Override // androidx.fragment.app.f2
    public final void b() {
        if (!this.f1702g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1702g = true;
            Iterator it = this.f1699d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1641h.k();
    }

    @Override // androidx.fragment.app.f2
    public final void d() {
        d2 d2Var = this.f1697b;
        d2 d2Var2 = d2.f1671b;
        l1 l1Var = this.f1641h;
        if (d2Var == d2Var2) {
            g0 g0Var = l1Var.f1754c;
            Intrinsics.checkNotNullExpressionValue(g0Var, "fragmentStateManager.fragment");
            View findFocus = g0Var.mView.findFocus();
            if (findFocus != null) {
                g0Var.setFocusedView(findFocus);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + g0Var);
                }
            }
            View requireView = this.f1698c.requireView();
            Intrinsics.checkNotNullExpressionValue(requireView, "this.fragment.requireView()");
            if (requireView.getParent() == null) {
                l1Var.b();
                requireView.setAlpha(s0.g.f34069a);
            }
            if (requireView.getAlpha() == s0.g.f34069a && requireView.getVisibility() == 0) {
                requireView.setVisibility(4);
            }
            requireView.setAlpha(g0Var.getPostOnViewCreatedAlpha());
            return;
        }
        if (d2Var == d2.f1672c) {
            g0 g0Var2 = l1Var.f1754c;
            Intrinsics.checkNotNullExpressionValue(g0Var2, "fragmentStateManager.fragment");
            View requireView2 = g0Var2.requireView();
            Intrinsics.checkNotNullExpressionValue(requireView2, "fragment.requireView()");
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + g0Var2);
            }
            requireView2.clearFocus();
        }
    }
}
