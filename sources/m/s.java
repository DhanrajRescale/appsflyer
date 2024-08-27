package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25707a;

    /* renamed from: b, reason: collision with root package name */
    public int f25708b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25709c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f25710d;

    /* renamed from: e, reason: collision with root package name */
    public Object f25711e;

    /* renamed from: f, reason: collision with root package name */
    public Object f25712f;

    /* renamed from: g, reason: collision with root package name */
    public Object f25713g;

    public s(View view) {
        this.f25707a = 0;
        this.f25708b = -1;
        this.f25709c = view;
        this.f25710d = x.a();
    }

    public static s b(int i10, Context context) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, un.a.f37315z);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList l12 = dp.b.l1(context, obtainStyledAttributes, 4);
            ColorStateList l13 = dp.b.l1(context, obtainStyledAttributes, 9);
            ColorStateList l14 = dp.b.l1(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            to.l a10 = to.l.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
            obtainStyledAttributes.recycle();
            return new s(l12, l13, l14, dimensionPixelSize, a10, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public final void a() {
        View view = (View) this.f25709c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((o3) this.f25711e) != null) {
                if (((o3) this.f25713g) == null) {
                    this.f25713g = new o3(0);
                }
                o3 o3Var = (o3) this.f25713g;
                o3Var.f25672d = null;
                o3Var.f25671c = false;
                o3Var.f25673e = null;
                o3Var.f25670b = false;
                WeakHashMap weakHashMap = d4.n1.f13788a;
                ColorStateList g10 = d4.b1.g(view);
                if (g10 != null) {
                    o3Var.f25671c = true;
                    o3Var.f25672d = g10;
                }
                PorterDuff.Mode h10 = d4.b1.h(view);
                if (h10 != null) {
                    o3Var.f25670b = true;
                    o3Var.f25673e = h10;
                }
                if (o3Var.f25671c || o3Var.f25670b) {
                    x.e(background, o3Var, view.getDrawableState());
                    return;
                }
            }
            o3 o3Var2 = (o3) this.f25712f;
            if (o3Var2 != null) {
                x.e(background, o3Var2, view.getDrawableState());
                return;
            }
            o3 o3Var3 = (o3) this.f25711e;
            if (o3Var3 != null) {
                x.e(background, o3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList c() {
        Object obj = this.f25712f;
        if (((o3) obj) != null) {
            return (ColorStateList) ((o3) obj).f25672d;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        Object obj = this.f25712f;
        if (((o3) obj) != null) {
            return (PorterDuff.Mode) ((o3) obj).f25673e;
        }
        return null;
    }

    public final void e(AttributeSet attributeSet, int i10) {
        ColorStateList h10;
        Object obj = this.f25709c;
        View view = (View) obj;
        Context context = view.getContext();
        int[] iArr = g.a.A;
        h.c N = h.c.N(context, attributeSet, iArr, i10);
        d4.n1.m(view, view.getContext(), iArr, attributeSet, (TypedArray) N.f17584c, i10);
        try {
            if (N.H(0)) {
                this.f25708b = N.C(0, -1);
                x xVar = (x) this.f25710d;
                Context context2 = ((View) obj).getContext();
                int i11 = this.f25708b;
                synchronized (xVar) {
                    h10 = xVar.f25797a.h(i11, context2);
                }
                if (h10 != null) {
                    h(h10);
                }
            }
            if (N.H(1)) {
                d4.b1.q((View) obj, N.r(1));
            }
            if (N.H(2)) {
                d4.b1.r((View) obj, q1.c(N.z(2, -1), null));
            }
            N.R();
        } catch (Throwable th2) {
            N.R();
            throw th2;
        }
    }

    public final void f() {
        this.f25708b = -1;
        h(null);
        a();
    }

    public final void g(int i10) {
        ColorStateList colorStateList;
        this.f25708b = i10;
        x xVar = (x) this.f25710d;
        if (xVar != null) {
            Context context = ((View) this.f25709c).getContext();
            synchronized (xVar) {
                colorStateList = xVar.f25797a.h(i10, context);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((o3) this.f25711e) == null) {
                this.f25711e = new o3(0);
            }
            o3 o3Var = (o3) this.f25711e;
            o3Var.f25672d = colorStateList;
            o3Var.f25671c = true;
        } else {
            this.f25711e = null;
        }
        a();
    }

    public final void i(ColorStateList colorStateList) {
        if (((o3) this.f25712f) == null) {
            this.f25712f = new o3(0);
        }
        o3 o3Var = (o3) this.f25712f;
        o3Var.f25672d = colorStateList;
        o3Var.f25671c = true;
        a();
    }

    public final void j(PorterDuff.Mode mode) {
        if (((o3) this.f25712f) == null) {
            this.f25712f = new o3(0);
        }
        o3 o3Var = (o3) this.f25712f;
        o3Var.f25673e = mode;
        o3Var.f25670b = true;
        a();
    }

    public final String toString() {
        switch (this.f25707a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FontRequest {mProviderAuthority: " + ((String) this.f25709c) + ", mProviderPackage: " + ((String) this.f25710d) + ", mQuery: " + ((String) this.f25711e) + ", mCertificates:");
                for (int i10 = 0; i10 < ((List) this.f25712f).size(); i10++) {
                    sb2.append(" [");
                    List list = (List) ((List) this.f25712f).get(i10);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        sb2.append(" \"");
                        sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                        sb2.append("\"");
                    }
                    sb2.append(" ]");
                }
                sb2.append(UrlTreeKt.componentParamSuffix);
                sb2.append("mCertificatesArray: " + this.f25708b);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public s(String str, String str2, String str3, List list) {
        this.f25707a = 1;
        this.f25709c = str;
        this.f25710d = str2;
        this.f25711e = str3;
        list.getClass();
        this.f25712f = list;
        this.f25708b = 0;
        this.f25713g = jr.h.s(str, "-", str2, "-", str3);
    }

    public s(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, to.l lVar, Rect rect) {
        this.f25707a = 2;
        qu.i0.k(rect.left);
        qu.i0.k(rect.top);
        qu.i0.k(rect.right);
        qu.i0.k(rect.bottom);
        this.f25709c = rect;
        this.f25710d = colorStateList2;
        this.f25711e = colorStateList;
        this.f25712f = colorStateList3;
        this.f25708b = i10;
        this.f25713g = lVar;
    }
}
