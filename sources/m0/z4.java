package m0;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class z4 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f27213a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f27214b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27215c;

    public z4(View view, lf.b0 b0Var) {
        this.f27213a = view;
        this.f27214b = b0Var;
        view.addOnAttachStateChangeListener(this);
        if (!this.f27215c && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f27215c = true;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f27214b.mo2invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!this.f27215c) {
            View view2 = this.f27213a;
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.f27215c = true;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f27215c) {
            this.f27213a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f27215c = false;
        }
    }
}
