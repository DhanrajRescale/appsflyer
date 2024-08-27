package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class i2 implements l.g0 {
    public static final Method A;
    public static final Method B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25558a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f25559b;

    /* renamed from: c, reason: collision with root package name */
    public w1 f25560c;

    /* renamed from: f, reason: collision with root package name */
    public int f25563f;

    /* renamed from: g, reason: collision with root package name */
    public int f25564g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25566i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25567j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25568k;

    /* renamed from: n, reason: collision with root package name */
    public f2 f25571n;

    /* renamed from: o, reason: collision with root package name */
    public View f25572o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f25573p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f25574q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f25579v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f25581x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f25582y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f25583z;

    /* renamed from: d, reason: collision with root package name */
    public final int f25561d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f25562e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f25565h = CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE;

    /* renamed from: l, reason: collision with root package name */
    public int f25569l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f25570m = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: r, reason: collision with root package name */
    public final b2 f25575r = new b2(this, 2);

    /* renamed from: s, reason: collision with root package name */
    public final h2 f25576s = new h2(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final g2 f25577t = new g2(this);

    /* renamed from: u, reason: collision with root package name */
    public final b2 f25578u = new b2(this, 1);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f25580w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.PopupWindow, m.e0] */
    public i2(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f25558a = context;
        this.f25579v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f16363o, i10, i11);
        this.f25563f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f25564g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f25566i = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i10, i11);
        h.c cVar = new h.c(context, context.obtainStyledAttributes(attributeSet, g.a.f16367s, i10, i11));
        if (cVar.H(2)) {
            h4.o.c(popupWindow, cVar.q(2, false));
        }
        popupWindow.setBackgroundDrawable(cVar.v(0));
        cVar.R();
        this.f25583z = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // l.g0
    public final boolean a() {
        return this.f25583z.isShowing();
    }

    public final int b() {
        return this.f25563f;
    }

    public final void c(int i10) {
        this.f25563f = i10;
    }

    @Override // l.g0
    public final void dismiss() {
        e0 e0Var = this.f25583z;
        e0Var.dismiss();
        e0Var.setContentView(null);
        this.f25560c = null;
        this.f25579v.removeCallbacks(this.f25575r);
    }

    public final Drawable e() {
        return this.f25583z.getBackground();
    }

    @Override // l.g0
    public final void f() {
        int i10;
        boolean z10;
        int makeMeasureSpec;
        int i11;
        int i12;
        boolean z11;
        w1 w1Var;
        int i13;
        int i14;
        w1 w1Var2 = this.f25560c;
        e0 e0Var = this.f25583z;
        Context context = this.f25558a;
        int i15 = 0;
        if (w1Var2 == null) {
            w1 p10 = p(context, !this.f25582y);
            this.f25560c = p10;
            p10.setAdapter(this.f25559b);
            this.f25560c.setOnItemClickListener(this.f25573p);
            this.f25560c.setFocusable(true);
            this.f25560c.setFocusableInTouchMode(true);
            this.f25560c.setOnItemSelectedListener(new c2(this, i15));
            this.f25560c.setOnScrollListener(this.f25577t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f25574q;
            if (onItemSelectedListener != null) {
                this.f25560c.setOnItemSelectedListener(onItemSelectedListener);
            }
            e0Var.setContentView(this.f25560c);
        }
        Drawable background = e0Var.getBackground();
        Rect rect = this.f25580w;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f25566i) {
                this.f25564g = -i16;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (e0Var.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int a10 = d2.a(e0Var, this.f25572o, this.f25564g, z10);
        int i17 = this.f25561d;
        if (i17 == -1) {
            i12 = a10 + i10;
        } else {
            int i18 = this.f25562e;
            if (i18 != -2) {
                if (i18 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a11 = this.f25560c.a(makeMeasureSpec, a10);
            if (a11 > 0) {
                i11 = this.f25560c.getPaddingBottom() + this.f25560c.getPaddingTop() + i10;
            } else {
                i11 = 0;
            }
            i12 = a11 + i11;
        }
        if (this.f25583z.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        h4.o.d(e0Var, this.f25565h);
        if (e0Var.isShowing()) {
            View view = this.f25572o;
            WeakHashMap weakHashMap = d4.n1.f13788a;
            if (!d4.y0.b(view)) {
                return;
            }
            int i19 = this.f25562e;
            if (i19 == -1) {
                i19 = -1;
            } else if (i19 == -2) {
                i19 = this.f25572o.getWidth();
            }
            if (i17 == -1) {
                if (z11) {
                    i17 = i12;
                } else {
                    i17 = -1;
                }
                if (z11) {
                    if (this.f25562e == -1) {
                        i14 = -1;
                    } else {
                        i14 = 0;
                    }
                    e0Var.setWidth(i14);
                    e0Var.setHeight(0);
                } else {
                    if (this.f25562e == -1) {
                        i15 = -1;
                    }
                    e0Var.setWidth(i15);
                    e0Var.setHeight(-1);
                }
            } else if (i17 == -2) {
                i17 = i12;
            }
            e0Var.setOutsideTouchable(true);
            View view2 = this.f25572o;
            int i20 = this.f25563f;
            int i21 = this.f25564g;
            if (i19 < 0) {
                i19 = -1;
            }
            if (i17 < 0) {
                i13 = -1;
            } else {
                i13 = i17;
            }
            e0Var.update(view2, i20, i21, i19, i13);
            return;
        }
        int i22 = this.f25562e;
        if (i22 == -1) {
            i22 = -1;
        } else if (i22 == -2) {
            i22 = this.f25572o.getWidth();
        }
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = i12;
        }
        e0Var.setWidth(i22);
        e0Var.setHeight(i17);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(e0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            e2.b(e0Var, true);
        }
        e0Var.setOutsideTouchable(true);
        e0Var.setTouchInterceptor(this.f25576s);
        if (this.f25568k) {
            h4.o.c(e0Var, this.f25567j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(e0Var, this.f25581x);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            e2.a(e0Var, this.f25581x);
        }
        h4.n.a(e0Var, this.f25572o, this.f25563f, this.f25564g, this.f25569l);
        this.f25560c.setSelection(-1);
        if ((!this.f25582y || this.f25560c.isInTouchMode()) && (w1Var = this.f25560c) != null) {
            w1Var.setListSelectionHidden(true);
            w1Var.requestLayout();
        }
        if (!this.f25582y) {
            this.f25579v.post(this.f25578u);
        }
    }

    @Override // l.g0
    public final ListView h() {
        return this.f25560c;
    }

    public final void i(Drawable drawable) {
        this.f25583z.setBackgroundDrawable(drawable);
    }

    public final void j(int i10) {
        this.f25564g = i10;
        this.f25566i = true;
    }

    public final int n() {
        if (this.f25566i) {
            return this.f25564g;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        f2 f2Var = this.f25571n;
        if (f2Var == null) {
            this.f25571n = new f2(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f25559b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(f2Var);
            }
        }
        this.f25559b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f25571n);
        }
        w1 w1Var = this.f25560c;
        if (w1Var != null) {
            w1Var.setAdapter(this.f25559b);
        }
    }

    public w1 p(Context context, boolean z10) {
        return new w1(context, z10);
    }

    public final void q(int i10) {
        Drawable background = this.f25583z.getBackground();
        if (background != null) {
            Rect rect = this.f25580w;
            background.getPadding(rect);
            this.f25562e = rect.left + rect.right + i10;
            return;
        }
        this.f25562e = i10;
    }
}
