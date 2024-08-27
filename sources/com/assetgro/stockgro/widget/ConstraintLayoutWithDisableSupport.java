package com.assetgro.stockgro.widget;

import android.content.Context;
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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/assetgro/stockgro/widget/ConstraintLayoutWithDisableSupport;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/Paint;", "getGrayScalePaint", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, "t", "Z", "getDisabled", "()Z", "setDisabled", "(Z)V", "disabled", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ConstraintLayoutWithDisableSupport extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f10605s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean disabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutWithDisableSupport(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10605s = new LinkedHashSet();
    }

    private final Paint getGrayScalePaint() {
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(new float[]{1.0f, g.f34069a, g.f34069a, g.f34069a, g.f34069a, g.f34069a, 1.0f, g.f34069a, g.f34069a, g.f34069a, g.f34069a, g.f34069a, 1.0f, g.f34069a, g.f34069a, g.f34069a, g.f34069a, g.f34069a, 0.5f, g.f34069a});
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        return paint;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.disabled) {
            int saveLayer = canvas.saveLayer(null, getGrayScalePaint());
            super.dispatchDraw(canvas);
            canvas.restoreToCount(saveLayer);
            for (View view : this.f10605s) {
                Integer valueOf = Integer.valueOf(canvas.save());
                canvas.translate(view.getLeft(), view.getTop());
                view.draw(canvas);
                if (valueOf != null) {
                    canvas.restoreToCount(valueOf.intValue());
                }
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        if (super.isEnabled() && !this.disabled) {
            return true;
        }
        return false;
    }

    public final void setDisabled(boolean z10) {
        this.disabled = z10;
        requestLayout();
    }
}
