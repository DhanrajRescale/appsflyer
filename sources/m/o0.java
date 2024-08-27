package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class o0 extends i2 implements q0 {
    public CharSequence C;
    public ListAdapter D;
    public final Rect E;
    public int F;
    public final /* synthetic */ r0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.G = r0Var;
        this.E = new Rect();
        this.f25572o = r0Var;
        this.f25582y = true;
        this.f25583z.setFocusable(true);
        this.f25573p = new h.d(1, this, r0Var);
    }

    @Override // m.q0
    public final CharSequence d() {
        return this.C;
    }

    @Override // m.q0
    public final void g(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // m.q0
    public final void k(int i10) {
        this.F = i10;
    }

    @Override // m.q0
    public final void l(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        e0 e0Var = this.f25583z;
        boolean isShowing = e0Var.isShowing();
        r();
        this.f25583z.setInputMethodMode(2);
        f();
        w1 w1Var = this.f25560c;
        w1Var.setChoiceMode(1);
        j0.d(w1Var, i10);
        j0.c(w1Var, i11);
        r0 r0Var = this.G;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        w1 w1Var2 = this.f25560c;
        if (e0Var.isShowing() && w1Var2 != null) {
            w1Var2.setListSelectionHidden(false);
            w1Var2.setSelection(selectedItemPosition);
            if (w1Var2.getChoiceMode() != 0) {
                w1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = r0Var.getViewTreeObserver()) != null) {
            l.e eVar = new l.e(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(eVar);
            this.f25583z.setOnDismissListener(new n0(this, eVar));
        }
    }

    @Override // m.i2, m.q0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.D = listAdapter;
    }

    public final void r() {
        int i10;
        int i11;
        e0 e0Var = this.f25583z;
        Drawable background = e0Var.getBackground();
        r0 r0Var = this.G;
        if (background != null) {
            background.getPadding(r0Var.f25698h);
            boolean a10 = d4.a(r0Var);
            Rect rect = r0Var.f25698h;
            if (a10) {
                i10 = rect.right;
            } else {
                i10 = -rect.left;
            }
        } else {
            Rect rect2 = r0Var.f25698h;
            rect2.right = 0;
            rect2.left = 0;
            i10 = 0;
        }
        int paddingLeft = r0Var.getPaddingLeft();
        int paddingRight = r0Var.getPaddingRight();
        int width = r0Var.getWidth();
        int i12 = r0Var.f25697g;
        if (i12 == -2) {
            int a11 = r0Var.a((SpinnerAdapter) this.D, e0Var.getBackground());
            int i13 = r0Var.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = r0Var.f25698h;
            int i14 = (i13 - rect3.left) - rect3.right;
            if (a11 > i14) {
                a11 = i14;
            }
            q(Math.max(a11, (width - paddingLeft) - paddingRight));
        } else if (i12 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i12);
        }
        if (d4.a(r0Var)) {
            i11 = (((width - paddingRight) - this.f25562e) - this.F) + i10;
        } else {
            i11 = paddingLeft + this.F + i10;
        }
        this.f25563f = i11;
    }
}
