package k2;

import android.graphics.Paint;
import android.graphics.Rect;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class i {
    public static final void a(@NotNull Paint paint, @NotNull CharSequence charSequence, int i10, int i11, @NotNull Rect rect) {
        paint.getTextBounds(charSequence, i10, i11, rect);
    }
}
