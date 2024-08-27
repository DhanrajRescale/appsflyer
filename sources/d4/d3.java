package d4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: b, reason: collision with root package name */
    public static final d3 f13730b;

    /* renamed from: a, reason: collision with root package name */
    public final b3 f13731a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f13730b = a3.f13720q;
        } else {
            f13730b = b3.f13722b;
        }
    }

    public d3(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f13731a = new a3(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f13731a = new z2(this, windowInsets);
        } else if (i10 >= 28) {
            this.f13731a = new x2(this, windowInsets);
        } else {
            this.f13731a = new w2(this, windowInsets);
        }
    }

    public static u3.c e(u3.c cVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, cVar.f36704a - i10);
        int max2 = Math.max(0, cVar.f36705b - i11);
        int max3 = Math.max(0, cVar.f36706c - i12);
        int max4 = Math.max(0, cVar.f36707d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return cVar;
        }
        return u3.c.b(max, max2, max3, max4);
    }

    public static d3 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        d3 d3Var = new d3(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = n1.f13788a;
            if (y0.b(view)) {
                d3 a10 = c1.a(view);
                b3 b3Var = d3Var.f13731a;
                b3Var.r(a10);
                b3Var.d(view.getRootView());
            }
        }
        return d3Var;
    }

    public final int a() {
        return this.f13731a.k().f36707d;
    }

    public final int b() {
        return this.f13731a.k().f36704a;
    }

    public final int c() {
        return this.f13731a.k().f36706c;
    }

    public final int d() {
        return this.f13731a.k().f36705b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        return c4.c.a(this.f13731a, ((d3) obj).f13731a);
    }

    public final WindowInsets f() {
        b3 b3Var = this.f13731a;
        if (b3Var instanceof v2) {
            return ((v2) b3Var).f13855c;
        }
        return null;
    }

    public final int hashCode() {
        b3 b3Var = this.f13731a;
        if (b3Var == null) {
            return 0;
        }
        return b3Var.hashCode();
    }

    public d3() {
        this.f13731a = new b3(this);
    }
}
