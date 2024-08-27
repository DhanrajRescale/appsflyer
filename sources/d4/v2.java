package d4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class v2 extends b3 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f13850h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f13851i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f13852j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f13853k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f13854l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f13855c;

    /* renamed from: d, reason: collision with root package name */
    public u3.c[] f13856d;

    /* renamed from: e, reason: collision with root package name */
    public u3.c f13857e;

    /* renamed from: f, reason: collision with root package name */
    public d3 f13858f;

    /* renamed from: g, reason: collision with root package name */
    public u3.c f13859g;

    public v2(@NonNull d3 d3Var, @NonNull WindowInsets windowInsets) {
        super(d3Var);
        this.f13857e = null;
        this.f13855c = windowInsets;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    private u3.c t(int i10, boolean z10) {
        u3.c cVar = u3.c.f36703e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVar = u3.c.a(cVar, u(i11, z10));
            }
        }
        return cVar;
    }

    private u3.c v() {
        d3 d3Var = this.f13858f;
        if (d3Var != null) {
            return d3Var.f13731a.i();
        }
        return u3.c.f36703e;
    }

    private u3.c w(@NonNull View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f13850h) {
                y();
            }
            Method method = f13851i;
            if (method != null && f13852j != null && f13853k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f13853k.get(f13854l.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return u3.c.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void y() {
        try {
            f13851i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f13852j = cls;
            f13853k = cls.getDeclaredField("mVisibleInsets");
            f13854l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f13853k.setAccessible(true);
            f13854l.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f13850h = true;
    }

    @Override // d4.b3
    public void d(@NonNull View view) {
        u3.c w10 = w(view);
        if (w10 == null) {
            w10 = u3.c.f36703e;
        }
        z(w10);
    }

    @Override // d4.b3
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f13859g, ((v2) obj).f13859g);
    }

    @Override // d4.b3
    @NonNull
    public u3.c f(int i10) {
        return t(i10, false);
    }

    @Override // d4.b3
    @NonNull
    public u3.c g(int i10) {
        return t(i10, true);
    }

    @Override // d4.b3
    @NonNull
    public final u3.c k() {
        if (this.f13857e == null) {
            WindowInsets windowInsets = this.f13855c;
            this.f13857e = u3.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f13857e;
    }

    @Override // d4.b3
    @NonNull
    public d3 m(int i10, int i11, int i12, int i13) {
        e.l lVar = new e.l(d3.g(null, this.f13855c));
        ((u2) lVar.f14641b).g(d3.e(k(), i10, i11, i12, i13));
        ((u2) lVar.f14641b).e(d3.e(i(), i10, i11, i12, i13));
        return lVar.K();
    }

    @Override // d4.b3
    public boolean o() {
        return this.f13855c.isRound();
    }

    @Override // d4.b3
    @SuppressLint({"WrongConstant"})
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0 && !x(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // d4.b3
    public void q(u3.c[] cVarArr) {
        this.f13856d = cVarArr;
    }

    @Override // d4.b3
    public void r(d3 d3Var) {
        this.f13858f = d3Var;
    }

    @NonNull
    public u3.c u(int i10, boolean z10) {
        int i11;
        m e10;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (i10 != 1) {
            u3.c cVar = null;
            if (i10 != 2) {
                u3.c cVar2 = u3.c.f36703e;
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                if (i10 != 128) {
                                    return cVar2;
                                }
                                d3 d3Var = this.f13858f;
                                if (d3Var != null) {
                                    e10 = d3Var.f13731a.e();
                                } else {
                                    e10 = e();
                                }
                                if (e10 != null) {
                                    int i16 = Build.VERSION.SDK_INT;
                                    DisplayCutout displayCutout = e10.f13778a;
                                    if (i16 >= 28) {
                                        i12 = k.d(displayCutout);
                                    } else {
                                        i12 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i13 = k.f(displayCutout);
                                    } else {
                                        i13 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i14 = k.e(displayCutout);
                                    } else {
                                        i14 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i15 = k.c(displayCutout);
                                    }
                                    return u3.c.b(i12, i13, i14, i15);
                                }
                                return cVar2;
                            }
                            return l();
                        }
                        return h();
                    }
                    return j();
                }
                u3.c[] cVarArr = this.f13856d;
                if (cVarArr != null) {
                    cVar = cVarArr[qu.i0.y(8)];
                }
                if (cVar != null) {
                    return cVar;
                }
                u3.c k10 = k();
                u3.c v10 = v();
                int i17 = k10.f36707d;
                if (i17 > v10.f36707d) {
                    return u3.c.b(0, 0, 0, i17);
                }
                u3.c cVar3 = this.f13859g;
                if (cVar3 != null && !cVar3.equals(cVar2) && (i11 = this.f13859g.f36707d) > v10.f36707d) {
                    return u3.c.b(0, 0, 0, i11);
                }
                return cVar2;
            }
            if (z10) {
                u3.c v11 = v();
                u3.c i18 = i();
                return u3.c.b(Math.max(v11.f36704a, i18.f36704a), 0, Math.max(v11.f36706c, i18.f36706c), Math.max(v11.f36707d, i18.f36707d));
            }
            u3.c k11 = k();
            d3 d3Var2 = this.f13858f;
            if (d3Var2 != null) {
                cVar = d3Var2.f13731a.i();
            }
            int i19 = k11.f36707d;
            if (cVar != null) {
                i19 = Math.min(i19, cVar.f36707d);
            }
            return u3.c.b(k11.f36704a, 0, k11.f36706c, i19);
        }
        if (z10) {
            return u3.c.b(0, Math.max(v().f36705b, k().f36705b), 0, 0);
        }
        return u3.c.b(0, k().f36705b, 0, 0);
    }

    public boolean x(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !u(i10, false).equals(u3.c.f36703e);
    }

    public void z(@NonNull u3.c cVar) {
        this.f13859g = cVar;
    }
}
