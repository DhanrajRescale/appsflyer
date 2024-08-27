package us;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public abstract class e extends FrameLayout {
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (getLayoutParams().height == -2) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) * 9) / 16, 1073741824));
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
