package ao;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d4.b1;
import d4.d3;
import d4.n1;
import java.util.WeakHashMap;
import ni.j;

/* loaded from: classes2.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f2657a;

    /* renamed from: b, reason: collision with root package name */
    public final d3 f2658b;

    /* renamed from: c, reason: collision with root package name */
    public Window f2659c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2660d;

    public e(FrameLayout frameLayout, d3 d3Var) {
        ColorStateList g10;
        this.f2658b = d3Var;
        to.h hVar = BottomSheetBehavior.w(frameLayout).f11180i;
        if (hVar != null) {
            g10 = hVar.f36253a.f36233c;
        } else {
            WeakHashMap weakHashMap = n1.f13788a;
            g10 = b1.g(frameLayout);
        }
        if (g10 != null) {
            this.f2657a = Boolean.valueOf(pn.e.n(g10.getDefaultColor()));
        } else if (frameLayout.getBackground() instanceof ColorDrawable) {
            this.f2657a = Boolean.valueOf(pn.e.n(((ColorDrawable) frameLayout.getBackground()).getColor()));
        } else {
            this.f2657a = null;
        }
    }

    public final void a(View view) {
        boolean booleanValue;
        int top = view.getTop();
        d3 d3Var = this.f2658b;
        if (top < d3Var.d()) {
            Window window = this.f2659c;
            if (window != null) {
                Boolean bool = this.f2657a;
                if (bool == null) {
                    booleanValue = this.f2660d;
                } else {
                    booleanValue = bool.booleanValue();
                }
                ((j) new t9.c(window, window.getDecorView()).f35633b).q(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), d3Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f2659c;
            if (window2 != null) {
                ((j) new t9.c(window2, window2.getDecorView()).f35633b).q(this.f2660d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void b(Window window) {
        if (this.f2659c == window) {
            return;
        }
        this.f2659c = window;
        if (window != null) {
            this.f2660d = ((j) new t9.c(window, window.getDecorView()).f35633b).o();
        }
    }

    @Override // ao.b
    public final void onLayout(View view) {
        a(view);
    }

    @Override // ao.b
    public final void onSlide(View view, float f10) {
        a(view);
    }

    @Override // ao.b
    public final void onStateChanged(View view, int i10) {
        a(view);
    }
}
