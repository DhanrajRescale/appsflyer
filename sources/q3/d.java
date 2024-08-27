package q3;

import android.app.Activity;

/* loaded from: classes.dex */
public abstract class d {
    public static <T> T a(Activity activity, int i10) {
        return (T) activity.requireViewById(i10);
    }
}
