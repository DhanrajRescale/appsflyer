package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f25795b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static x f25796c;

    /* renamed from: a, reason: collision with root package name */
    public r2 f25797a;

    public static synchronized x a() {
        x xVar;
        synchronized (x.class) {
            try {
                if (f25796c == null) {
                    d();
                }
                xVar = f25796c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter g10;
        synchronized (x.class) {
            g10 = r2.g(i10, mode);
        }
        return g10;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [m.x, java.lang.Object] */
    public static synchronized void d() {
        synchronized (x.class) {
            if (f25796c == null) {
                ?? obj = new Object();
                f25796c = obj;
                obj.f25797a = r2.c();
                r2 r2Var = f25796c.f25797a;
                w wVar = new w(0);
                synchronized (r2Var) {
                    r2Var.f25706e = wVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, o3 o3Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = r2.f25699f;
        int[] state = drawable.getState();
        int[] iArr2 = q1.f25681a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = o3Var.f25671c;
            if (!z10 && !o3Var.f25670b) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z10) {
                colorStateList = (ColorStateList) o3Var.f25672d;
            } else {
                colorStateList = null;
            }
            if (o3Var.f25670b) {
                mode = (PorterDuff.Mode) o3Var.f25673e;
            } else {
                mode = r2.f25699f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = r2.g(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f25797a.e(context, i10);
    }
}
