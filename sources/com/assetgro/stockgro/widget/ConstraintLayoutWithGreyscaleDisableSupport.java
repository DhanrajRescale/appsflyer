package com.assetgro.stockgro.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import s0.g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/widget/ConstraintLayoutWithGreyscaleDisableSupport;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/Paint;", "getGrayScalePaint", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, "t", "Z", "getDisabled", "()Z", "setDisabled", "(Z)V", "disabled", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ConstraintLayoutWithGreyscaleDisableSupport extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f10607s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean disabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutWithGreyscaleDisableSupport(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10607s = new LinkedHashSet();
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        new Canvas(createBitmap);
    }

    private final Paint getGrayScalePaint() {
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(new float[]{0.33f, 0.33f, 0.33f, g.f34069a, g.f34069a, 0.33f, 0.33f, 0.33f, g.f34069a, g.f34069a, 0.33f, 0.33f, 0.33f, g.f34069a, g.f34069a, g.f34069a, g.f34069a, g.f34069a, 1.0f, g.f34069a});
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        return paint;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.disabled) {
            getLocationOnScreen(new int[2]);
            int saveLayer = canvas.saveLayer(null, getGrayScalePaint());
            super.dispatchDraw(canvas);
            canvas.restoreToCount(saveLayer);
            for (View view : this.f10607s) {
                int save = canvas.save();
                view.getLocationOnScreen(new int[2]);
                canvas.translate(r5[0] - r1[0], r5[1] - r1[1]);
                view.draw(canvas);
                canvas.restoreToCount(save);
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final void m(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f10607s.add(view);
        invalidate();
    }

    public final void setDisabled(boolean z10) {
        this.disabled = z10;
        invalidate();
    }
}
