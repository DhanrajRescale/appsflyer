package d4;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f13806a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f13807b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f13808c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f13809d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f13806a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f13807b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f13808c = declaredField3;
            declaredField3.setAccessible(true);
            f13809d = true;
        } catch (ReflectiveOperationException e10) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
        }
    }
}
