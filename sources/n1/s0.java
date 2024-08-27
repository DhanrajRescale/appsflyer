package n1;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f28162a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28163b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static Method f28164c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f28165d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f28166e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f28167f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28168g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f28169h = 0;

    public static void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            s.f28161a.a(canvas, z10);
            return;
        }
        if (!f28166e) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f28164c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f28165d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f28164c = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f28165d = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f28164c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f28165d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f28166e = true;
        }
        if (z10) {
            try {
                Method method4 = f28164c;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z10 && (method = f28165d) != null) {
            method.invoke(canvas, new Object[0]);
        }
    }

    public static final boolean b(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean c(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }
}
