package po;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import h4.b;
import mo.c0;
import pn.e;

/* loaded from: classes2.dex */
public final class a extends AppCompatRadioButton {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f31256g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f31257e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31258f;

    public a(Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, com.assetgro.stockgro.prod.R.attr.radioButtonStyle, 2132083911), attributeSet, 0);
        Context context2 = getContext();
        TypedArray f10 = c0.f(context2, attributeSet, un.a.C, com.assetgro.stockgro.prod.R.attr.radioButtonStyle, 2132083911, new int[0]);
        if (f10.hasValue(0)) {
            b.c(this, dp.b.l1(context2, f10, 0));
        }
        this.f31258f = f10.getBoolean(1, false);
        f10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f31257e == null) {
            int k10 = e.k(this, com.assetgro.stockgro.prod.R.attr.colorControlActivated);
            int k11 = e.k(this, com.assetgro.stockgro.prod.R.attr.colorOnSurface);
            int k12 = e.k(this, com.assetgro.stockgro.prod.R.attr.colorSurface);
            this.f31257e = new ColorStateList(f31256g, new int[]{e.p(k12, 1.0f, k10), e.p(k12, 0.54f, k11), e.p(k12, 0.38f, k11), e.p(k12, 0.38f, k11)});
        }
        return this.f31257e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f31258f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f31258f = z10;
        if (z10) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
