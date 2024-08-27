package vs;

import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class b extends AppCompatImageView {

    /* renamed from: d, reason: collision with root package name */
    public RectF f38295d;

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        super.onMeasure(i10, i11);
        float measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.f38295d;
        float f11 = 1.0f;
        if (rectF != null) {
            f10 = rectF.width() / measuredWidth;
        } else {
            f10 = 1.0f;
        }
        if (rectF != null) {
            f11 = rectF.height() / measuredHeight;
        }
        float max = Math.max(f10, f11);
        setMeasuredDimension((int) (measuredWidth * max), (int) (measuredHeight * max));
    }

    public final void setFrame(@NotNull RectF frame) {
        Intrinsics.e(frame, "frame");
        this.f38295d = frame;
    }
}
