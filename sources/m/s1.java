package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f25714a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f25715b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f25716c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f25717d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f25714a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f25715b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f25716c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f25717d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
