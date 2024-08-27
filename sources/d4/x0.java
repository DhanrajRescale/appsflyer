package d4;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class x0 {
    public static Rect a(@NonNull View view) {
        return view.getClipBounds();
    }

    public static boolean b(@NonNull View view) {
        return view.isInLayout();
    }

    public static void c(@NonNull View view, Rect rect) {
        view.setClipBounds(rect);
    }
}
