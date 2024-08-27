package n1;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class d0 implements Comparable {
    public static void a(float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            l.a(f10);
        } else {
            Float.floatToRawIntBits(f10);
        }
    }
}
