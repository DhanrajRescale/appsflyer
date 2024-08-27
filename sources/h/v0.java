package h;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import d4.d2;
import d4.n1;
import d4.z0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v0 extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f17757b;

    public /* synthetic */ v0(x0 x0Var, int i10) {
        this.f17756a = i10;
        this.f17757b = x0Var;
    }

    @Override // d4.c2
    public final void c() {
        View view;
        int i10 = this.f17756a;
        x0 x0Var = this.f17757b;
        switch (i10) {
            case 0:
                if (x0Var.f17779u && (view = x0Var.f17771m) != null) {
                    view.setTranslationY(s0.g.f34069a);
                    x0Var.f17768j.setTranslationY(s0.g.f34069a);
                }
                x0Var.f17768j.setVisibility(8);
                x0Var.f17768j.setTransitioning(false);
                x0Var.f17784z = null;
                k.a aVar = x0Var.f17775q;
                if (aVar != null) {
                    aVar.d(x0Var.f17774p);
                    x0Var.f17774p = null;
                    x0Var.f17775q = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = x0Var.f17767i;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    z0.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                x0Var.f17784z = null;
                x0Var.f17768j.requestLayout();
                return;
        }
    }
}
