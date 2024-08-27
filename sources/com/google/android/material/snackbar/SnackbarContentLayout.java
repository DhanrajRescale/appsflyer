package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.w0;
import dp.b;
import java.util.WeakHashMap;
import vn.a;
import wo.l;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements l {

    /* renamed from: a, reason: collision with root package name */
    public TextView f11432a;

    /* renamed from: b, reason: collision with root package name */
    public Button f11433b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f11434c;

    /* renamed from: d, reason: collision with root package name */
    public int f11435d;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11434c = b.F1(context, R.attr.motionEasingEmphasizedInterpolator, a.f38181b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f11432a.getPaddingTop() == i11 && this.f11432a.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f11432a;
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.g(textView)) {
            w0.k(textView, w0.f(textView), i11, w0.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f11433b;
    }

    public TextView getMessageView() {
        return this.f11432a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f11432a = (TextView) findViewById(R.id.snackbar_text);
        this.f11433b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f11432a.getLayout();
        if (layout != null && layout.getLineCount() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f11435d > 0 && this.f11433b.getMeasuredWidth() > this.f11435d) {
            if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
        } else {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f11435d = i10;
    }
}
