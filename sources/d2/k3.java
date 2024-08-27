package d2;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class k3 {
    public static final long a(@NotNull View view) {
        long uniqueDrawingId;
        uniqueDrawingId = view.getUniqueDrawingId();
        return uniqueDrawingId;
    }
}
