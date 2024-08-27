package n1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class k {
    @NotNull
    public static final o1.d a(@NotNull Bitmap bitmap) {
        ColorSpace colorSpace;
        o1.d b10;
        colorSpace = bitmap.getColorSpace();
        if (colorSpace == null || (b10 = c0.b(colorSpace)) == null) {
            float[] fArr = o1.e.f29378a;
            return o1.e.f29380c;
        }
        return b10;
    }

    @NotNull
    public static final Bitmap b(int i10, int i11, int i12, boolean z10, @NotNull o1.d dVar) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, androidx.compose.ui.graphics.a.z(i12), z10, c0.a(dVar));
        return createBitmap;
    }
}
