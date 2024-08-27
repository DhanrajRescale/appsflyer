package d4;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class r2 extends u2 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f13812e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f13813f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f13814g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f13815h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f13816c;

    /* renamed from: d, reason: collision with root package name */
    public u3.c f13817d;

    public r2() {
        this.f13816c = i();
    }

    private static WindowInsets i() {
        if (!f13813f) {
            try {
                f13812e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f13813f = true;
        }
        Field field = f13812e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f13815h) {
            try {
                f13814g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f13815h = true;
        }
        Constructor constructor = f13814g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // d4.u2
    @NonNull
    public d3 b() {
        a();
        d3 g10 = d3.g(null, this.f13816c);
        u3.c[] cVarArr = this.f13843b;
        b3 b3Var = g10.f13731a;
        b3Var.q(cVarArr);
        b3Var.s(this.f13817d);
        return g10;
    }

    @Override // d4.u2
    public void e(u3.c cVar) {
        this.f13817d = cVar;
    }

    @Override // d4.u2
    public void g(@NonNull u3.c cVar) {
        WindowInsets windowInsets = this.f13816c;
        if (windowInsets != null) {
            this.f13816c = windowInsets.replaceSystemWindowInsets(cVar.f36704a, cVar.f36705b, cVar.f36706c, cVar.f36707d);
        }
    }

    public r2(@NonNull d3 d3Var) {
        super(d3Var);
        this.f13816c = d3Var.f();
    }
}
