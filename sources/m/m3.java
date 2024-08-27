package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f25624a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f25625b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f25626c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f25627d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f25628e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f25629f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f25630g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(g.a.f16358j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(int i10, Context context) {
        ColorStateList d10 = d(i10, context);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f25625b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f25624a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return u3.a.d(c(i10, context), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(int i10, Context context) {
        int[] iArr = f25630g;
        iArr[0] = i10;
        h.c cVar = new h.c(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return ((TypedArray) cVar.f17584c).getColor(0, 0);
        } finally {
            cVar.R();
        }
    }

    public static ColorStateList d(int i10, Context context) {
        int[] iArr = f25630g;
        iArr[0] = i10;
        h.c cVar = new h.c(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return cVar.r(0);
        } finally {
            cVar.R();
        }
    }
}
