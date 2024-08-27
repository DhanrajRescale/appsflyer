package t7;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import m.k3;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f35540a;

    /* renamed from: b, reason: collision with root package name */
    public static final k3 f35541b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, t7.d0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, t7.d0] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f35540a = new Object();
        } else {
            f35540a = new Object();
        }
        f35541b = new k3("translationAlpha", 6, Float.class);
        new k3("clipBounds", 7, Rect.class);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f35540a.x(view, i10, i11, i12, i13);
    }
}
