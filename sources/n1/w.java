package n1;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f28203a = new Object();

    @NotNull
    public final float[] a(@NotNull ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return colorMatrix.getArray();
    }
}
