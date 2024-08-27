package d4;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract class l {
    public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
        return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
    }

    public static Insets b(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }
}
