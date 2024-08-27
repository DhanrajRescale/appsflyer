package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import d7.a;
import d7.b;
import d7.h0;
import s0.g;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2093d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b f2094a;

    /* renamed from: b, reason: collision with root package name */
    public float f2095b;

    /* renamed from: c, reason: collision with root package name */
    public int f2096c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2096c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h0.f14044a, 0, 0);
            try {
                this.f2096c = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f2094a = new b(this);
    }

    public int getResizeMode() {
        return this.f2096c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f2095b <= g.f34069a) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f2095b / (f12 / f13)) - 1.0f;
        float abs = Math.abs(f14);
        b bVar = this.f2094a;
        if (abs <= 0.01f) {
            if (!bVar.f13958a) {
                bVar.f13958a = true;
                bVar.f13959b.post(bVar);
                return;
            }
            return;
        }
        int i12 = this.f2096c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 4) {
                        if (f14 > g.f34069a) {
                            f10 = this.f2095b;
                        } else {
                            f11 = this.f2095b;
                        }
                    }
                } else {
                    f10 = this.f2095b;
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f2095b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > g.f34069a) {
            f11 = this.f2095b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f2095b;
            measuredWidth = (int) (f13 * f10);
        }
        if (!bVar.f13958a) {
            bVar.f13958a = true;
            bVar.f13959b.post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f2095b != f10) {
            this.f2095b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f2096c != i10) {
            this.f2096c = i10;
            requestLayout();
        }
    }
}
