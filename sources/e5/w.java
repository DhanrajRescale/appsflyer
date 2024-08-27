package e5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class w {
    public static Drawable a(Context context, Resources resources, int i10) {
        return resources.getDrawable(i10, context.getTheme());
    }
}
