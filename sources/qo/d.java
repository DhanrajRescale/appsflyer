package qo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import bl.j;
import pn.e;
import s0.g;
import t3.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f32102a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32103b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32104c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32105d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32106e;

    /* renamed from: f, reason: collision with root package name */
    public final float f32107f;

    /* renamed from: g, reason: collision with root package name */
    public final float f32108g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32109h;

    /* renamed from: i, reason: collision with root package name */
    public final float f32110i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f32111j;

    /* renamed from: k, reason: collision with root package name */
    public float f32112k;

    /* renamed from: l, reason: collision with root package name */
    public final int f32113l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32114m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f32115n;

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, un.a.U);
        this.f32112k = obtainStyledAttributes.getDimension(0, g.f34069a);
        this.f32111j = dp.b.l1(context, obtainStyledAttributes, 3);
        dp.b.l1(context, obtainStyledAttributes, 4);
        dp.b.l1(context, obtainStyledAttributes, 5);
        this.f32104c = obtainStyledAttributes.getInt(2, 0);
        this.f32105d = obtainStyledAttributes.getInt(1, 1);
        int i11 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f32113l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f32103b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f32102a = dp.b.l1(context, obtainStyledAttributes, 6);
        this.f32106e = obtainStyledAttributes.getFloat(7, g.f34069a);
        this.f32107f = obtainStyledAttributes.getFloat(8, g.f34069a);
        this.f32108g = obtainStyledAttributes.getFloat(9, g.f34069a);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, un.a.E);
        this.f32109h = obtainStyledAttributes2.hasValue(0);
        this.f32110i = obtainStyledAttributes2.getFloat(0, g.f34069a);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f32115n;
        int i10 = this.f32104c;
        if (typeface == null && (str = this.f32103b) != null) {
            this.f32115n = Typeface.create(str, i10);
        }
        if (this.f32115n == null) {
            int i11 = this.f32105d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f32115n = Typeface.DEFAULT;
                    } else {
                        this.f32115n = Typeface.MONOSPACE;
                    }
                } else {
                    this.f32115n = Typeface.SERIF;
                }
            } else {
                this.f32115n = Typeface.SANS_SERIF;
            }
            this.f32115n = Typeface.create(this.f32115n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f32114m) {
            return this.f32115n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a10 = p.a(this.f32113l, context);
                this.f32115n = a10;
                if (a10 != null) {
                    this.f32115n = Typeface.create(a10, this.f32104c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f32103b, e10);
            }
        }
        a();
        this.f32114m = true;
        return this.f32115n;
    }

    public final void c(Context context, j jVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f32113l;
        if (i10 == 0) {
            this.f32114m = true;
        }
        if (this.f32114m) {
            jVar.O(this.f32115n, true);
            return;
        }
        try {
            o2.c cVar = new o2.c(this, jVar);
            ThreadLocal threadLocal = p.f35324a;
            if (context.isRestricted()) {
                cVar.a(-4);
            } else {
                p.b(context, i10, new TypedValue(), 0, cVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f32114m = true;
            jVar.N(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f32103b, e10);
            this.f32114m = true;
            jVar.N(-3);
        }
    }

    public final boolean d(Context context) {
        int i10 = this.f32113l;
        Typeface typeface = null;
        if (i10 != 0) {
            ThreadLocal threadLocal = p.f35324a;
            if (!context.isRestricted()) {
                typeface = p.b(context, i10, new TypedValue(), 0, null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void e(Context context, TextPaint textPaint, j jVar) {
        int i10;
        int i11;
        f(context, textPaint, jVar);
        ColorStateList colorStateList = this.f32111j;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = -16777216;
        }
        textPaint.setColor(i10);
        ColorStateList colorStateList2 = this.f32102a;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(this.f32108g, this.f32106e, this.f32107f, i11);
    }

    public final void f(Context context, TextPaint textPaint, j jVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f32115n);
        c(context, new c(this, context, textPaint, jVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface r10 = e.r(context.getResources().getConfiguration(), typeface);
        if (r10 != null) {
            typeface = r10;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f32104c;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = g.f34069a;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f32112k);
        if (this.f32109h) {
            textPaint.setLetterSpacing(this.f32110i);
        }
    }
}
